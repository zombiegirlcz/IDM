package au0;

import android.view.View;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.ConditionalAmountDelegate$ConditionalAmountItem$Toggle;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.HorizontalHistogramTileDelegate;
import com.revolut.core.ui_kit.delegates.ListingCardBasicDelegate;
import com.revolut.core.ui_kit.delegates.PhotoBannerLargeDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RewardDelegate;
import com.revolut.core.ui_kit.delegates.SmallStockCardDelegate;
import com.revolut.core.ui_kit.delegates.SmartTileAssetViewDelegate;
import com.revolut.core.ui_kit.delegates.StreakStepVerticalDelegate;
import com.revolut.core.ui_kit.delegates.TransferAmountPagePreviewDelegate;
import com.revolut.core.ui_kit.delegates.VaultsProgressDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatMessageActionsPanelDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatPaymentBubbleDelegate;
import com.revolut.core.ui_kit.delegates.gallery_picker.PersonalisationGalleryTileDelegate;
import com.revolut.core.ui_kit.delegates.gallery_picker.PersonalisationGalleryTileModel;
import com.revolut.core.ui_kit.internal.views.IndicesBarView$IndexBarDelegate;
import com.revolut.core.ui_kit.internal.views.chat.ChatParentLayout;
import com.revolut.core.ui_kit.internal.views.conditional_amount.ConditionalAmountToggleDelegate;
import com.revolut.core.ui_kit.internal.views.navbar.HeaderWithBigTileLayout;
import com.revolut.core.ui_kit.internal.views.navbar.SearchView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.IndexBarModel;
import com.revolut.core.ui_kit_core.actionshandler.CustomTrackableComponent;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieSource;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import ip0.oj0;
import ip0.u7;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: loaded from: classes19.dex */
public final class t1 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9370c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t1(Object obj2, int i, Object obj3, Object obj4) {
        this.f9368a = i;
        this.f9369b = obj2;
        this.f9370c = obj3;
        this.d = obj4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9368a) {
            case 0:
                h30.l.w(view, view).a(view, (CustomTrackableComponent) this.f9369b, (py0.a) this.f9370c);
                ((HeaderWithBigTileLayout) this.d).f57274n.onNext(Unit.f186387a);
                break;
            case 1:
                h30.l.w(view, view).a(view, (SearchView) this.f9369b, null);
                ((SearchView) this.f9370c).f57338n.onNext(((aw0.c) this.d).f10251a);
                break;
            case 2:
                h30.l.w(view, view).a(view, (CustomTrackableComponent) this.f9369b, (py0.b) this.f9370c);
                ((es0.m) this.d).e.onNext(oj0.CLOSE);
                break;
            case 3:
                h30.l.w(view, view).a(view, (ChatParentLayout) this.f9369b, (py0.d) this.f9370c);
                ((ChatParentLayout) this.d).getOnAvatarClick().invoke();
                break;
            case 4:
                h30.l.w(view, view).a(view, (TrackableItem) this.f9369b, null);
                ((ConditionalAmountToggleDelegate) this.f9370c).f56871c.onNext((ConditionalAmountDelegate$ConditionalAmountItem$Toggle) this.d);
                break;
            case 5:
                h30.l.w(view, view).a(view, (TrackableItem) this.f9369b, (py0.d) this.f9370c);
                ((com.revolut.core.ui_kit.delegates.r) this.d).f54650s.onNext(Unit.f186387a);
                break;
            case 6:
                h30.l.w(view, view).a(view, (TrackableItem) this.f9369b, (py0.c) this.f9370c);
                ((ip0.z4) this.d).invoke();
                break;
            case 7:
                Intrinsics.h(view);
                ((u7) this.f9369b).f166615n.b0();
                ((CellDetailsNoteDelegate) this.f9370c).d.onNext((CellDetailsNoteDelegate.Model) this.d);
                break;
            case 8:
                h30.l.w(view, view).a(view, (TrackableItem) this.f9369b, null);
                ((CellDetailsNoteDelegate) this.f9370c).f.onNext((CellDetailsNoteDelegate.Model) this.d);
                break;
            case 9:
                h30.l.w(view, view).a(view, (TrackableItem) this.f9369b, null);
                ((CellDetailsStandaloneNoteDelegate) this.f9370c).d.onNext((CellDetailsStandaloneNoteDelegate.Model) this.d);
                break;
            case 10:
                h30.l.w(view, view).a(view, (TrackableItem) this.f9369b, null);
                ((CounterTextDelegate) this.f9370c).f52157g.onNext((CounterTextDelegate.Model) this.d);
                break;
            case 11:
                h30.l.w(view, view).a(view, (TrackableItem) this.f9369b, null);
                ((HeaderDelegate) this.f9370c).f52395j.onNext((HeaderDelegate.Model) this.d);
                break;
            case 12:
                h30.l.w(view, view).a(view, (TrackableItem) this.f9369b, null);
                ((HeroBannerDelegate) this.f9370c).e.onNext((HeroBannerDelegate.Model) this.d);
                break;
            case 13:
                h30.l.w(view, view).a(view, (TrackableItem) this.f9369b, null);
                ((HorizontalHistogramTileDelegate) this.f9370c).f52456c.onNext((HorizontalHistogramTileDelegate.Model) this.d);
                break;
            case 14:
                h30.l.w(view, view).a(view, (TrackableItem) this.f9369b, null);
                ((ListingCardBasicDelegate) this.f9370c).d.onNext((ListingCardBasicDelegate.Model) this.d);
                break;
            case 15:
                h30.l.w(view, view).a(view, (TrackableItem) this.f9369b, null);
                ((PhotoBannerLargeDelegate) this.f9370c).d.onNext((PhotoBannerLargeDelegate.Model) this.d);
                break;
            case 16:
                h30.l.w(view, view).a(view, (TrackableItem) this.f9369b, null);
                ((ReferralContactDelegate) this.f9370c).f53160c.onNext((ReferralContactDelegate.Model) this.d);
                break;
            case 17:
                h30.l.w(view, view).a(view, (TrackableItem) this.f9369b, null);
                ((RewardDelegate) this.f9370c).d.onNext((RewardDelegate.Model) this.d);
                break;
            case 18:
                h30.l.w(view, view).a(view, (TrackableItem) this.f9369b, null);
                ((SmallStockCardDelegate) this.f9370c).d.onNext((SmallStockCardDelegate.Model) this.d);
                break;
            case 19:
                h30.l.w(view, view).a(view, (TrackableItem) this.f9369b, null);
                ((SmartTileAssetViewDelegate) this.f9370c).f53401c.onNext((SmartTileAssetViewDelegate.Model) this.d);
                break;
            case 20:
                h30.l.w(view, view).a(view, (TrackableItem) this.f9369b, null);
                ((StreakStepVerticalDelegate) this.f9370c).f53467c.onNext((StreakStepVerticalDelegate.Model) this.d);
                break;
            case 21:
                h30.l.w(view, view).a(view, (TrackableItem) this.f9369b, null);
                ((TransferAmountPagePreviewDelegate) this.f9370c).f53556c.onNext((TransferAmountPagePreviewDelegate.Model) this.d);
                break;
            case 22:
                h30.l.w(view, view).a(view, (TrackableItem) this.f9369b, null);
                ((VaultsProgressDelegate) this.f9370c).r().onNext((VaultsProgressDelegate.Model) this.d);
                break;
            case 23:
                com.revolut.core.ui_kit.delegates.chat.h hVar = (com.revolut.core.ui_kit.delegates.chat.h) this.f9370c;
                Intrinsics.h(view);
                kp0.b0 b0Var = ((ChatMessageActionsPanelDelegate.OneShotActionDelegate) this.f9369b).f53858c;
                if (b0Var != null) {
                    b0Var.invoke(hVar);
                }
                kp0.j0 j0Var = (kp0.j0) this.d;
                ResourceImage icon = hVar.f53972c;
                ResourceImage alternateIcon = hVar.d;
                j0Var.getClass();
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(alternateIcon, "alternateIcon");
                j0Var.a();
                j0Var.f188027g = icon;
                j0Var.b(alternateIcon);
                k0.b bVar = new k0.b(j0Var, icon, 6);
                j0Var.f188025b = bVar;
                j0Var.f188024a.postDelayed(bVar, 2000L);
                break;
            case 24:
                com.revolut.core.ui_kit.delegates.chat.i iVar = (com.revolut.core.ui_kit.delegates.chat.i) this.f9370c;
                Intrinsics.h(view);
                kp0.b0 b0Var2 = ((ChatMessageActionsPanelDelegate.ToggleableActionDelegate) this.f9369b).f53859c;
                if (b0Var2 != null) {
                    b0Var2.invoke(iVar);
                }
                final kp0.j0 j0Var2 = (kp0.j0) this.d;
                final ResourceImage selectedIcon = iVar.d;
                ResourceImage unselectedIcon = iVar.f53975c;
                boolean z = iVar.e;
                LottieImage lottieImage = iVar.f53976g;
                j0Var2.getClass();
                Intrinsics.checkNotNullParameter(selectedIcon, "selectedIcon");
                Intrinsics.checkNotNullParameter(unselectedIcon, "unselectedIcon");
                if (z) {
                    selectedIcon = unselectedIcon;
                }
                if (!Intrinsics.f(j0Var2.f188027g, selectedIcon)) {
                    j0Var2.a();
                    long j2 = j0Var2.f;
                    j0Var2.f188027g = selectedIcon;
                    if (z) {
                        lottieImage = null;
                    }
                    if (lottieImage != null) {
                        final int i = 0;
                        Function0 function0 = new Function0() { // from class: kp0.e0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i) {
                                    case 0:
                                        j0 j0Var3 = j0Var2;
                                        j0Var3.f188027g = null;
                                        j0Var3.c(selectedIcon);
                                        break;
                                    default:
                                        Image image = selectedIcon;
                                        j0 j0Var4 = j0Var2;
                                        j0Var4.b(image);
                                        j0Var4.f188027g = null;
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        };
                        final int i2 = 1;
                        Function0 function02 = new Function0() { // from class: kp0.e0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i2) {
                                    case 0:
                                        j0 j0Var3 = j0Var2;
                                        j0Var3.f188027g = null;
                                        j0Var3.c(selectedIcon);
                                        break;
                                    default:
                                        Image image = selectedIcon;
                                        j0 j0Var4 = j0Var2;
                                        j0Var4.b(image);
                                        j0Var4.f188027g = null;
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        };
                        j0Var2.getClass();
                        LottieSource src2 = lottieImage.f59955a;
                        Integer num = lottieImage.d;
                        ImageView.ScaleType scaleType = lottieImage.e;
                        LottieImage.ColorOverride colorOverride = lottieImage.f;
                        Clause clause = lottieImage.f59958g;
                        Image image = lottieImage.f59959h;
                        Intrinsics.checkNotNullParameter(src2, "src");
                        LottieImage lottieImage2 = new LottieImage(src2, false, false, num, scaleType, colorOverride, clause, image);
                        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                        LottieAnimationView lottieAnimationView = j0Var2.f188024a;
                        or0.u.k(lottieAnimationView).Q().a(lottieImage2, lottieAnimationView, new e1.e(j2, j0Var2, ref$BooleanRef, function0, 2), new kp0.f0(j2, j0Var2, ref$BooleanRef, function02));
                        kp0.g0 g0Var = new kp0.g0(ref$BooleanRef, j2, j0Var2, function02, 0);
                        j0Var2.e = g0Var;
                        lottieAnimationView.postDelayed(g0Var, 500L);
                    } else {
                        j0Var2.b(selectedIcon);
                        j0Var2.f188027g = null;
                    }
                    break;
                }
                break;
            case 25:
                h30.l.w(view, view).a(view, (TrackableItem) this.f9369b, null);
                ((ChatPaymentBubbleDelegate) this.f9370c).i.onNext((ChatPaymentBubbleDelegate.Model) this.d);
                break;
            case 26:
                h30.l.w(view, view).a(view, (TrackableItem) this.f9369b, null);
                ((PersonalisationGalleryTileDelegate) this.f9370c).e.onNext((PersonalisationGalleryTileModel) this.d);
                break;
            case 27:
                h30.l.w(view, view).a(view, (TrackableItem) this.f9369b, null);
                ((IndicesBarView$IndexBarDelegate) this.f9370c).f56192c.onNext((IndexBarModel) this.d);
                break;
            case 28:
                h30.l.w(view, view).a(view, (TrackableItem) this.f9369b, (py0.c) this.f9370c);
                ((Function0) this.d).invoke();
                break;
            default:
                h30.l.w(view, view).a(view, (TrackableItem) this.f9369b, (py0.d) this.f9370c);
                ((nv0.n) this.d).e.invoke();
                break;
        }
    }
}
