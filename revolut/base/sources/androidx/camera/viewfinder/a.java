package androidx.camera.viewfinder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.media3.ui.PlayerControlView;
import androidx.recyclerview.widget.RecyclerView;
import au0.d1;
import au0.r0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.revolut.camerakit.ui.views.view.CameraKitView;
import com.revolut.core.backend_flow.photo.ui.screen.card_photo.CardPhotoScreen;
import com.revolut.core.ui_kit.delegates.ma;
import com.revolut.core.ui_kit.internal.drawables.FloatingBottomBarSelectorDrawable;
import com.revolut.core.ui_kit.internal.views.navbar.HeaderWithBigTileLayout;
import com.revolut.core.ui_kit.views.FadeBottomImageView;
import com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher;
import com.revolut.feature.card_contactless_limit.impl.ui.mvp.RevolutCardResetScaActivity;
import com.revolut.feature.flexible.staking.consent.impl.screen.FlexibleStakingConsentScreenController;
import com.revolut.feature.shared.help_centre.impl.faq.screens.ai_search.v2.AskAiScreen;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;
import com.revolut.ui.activity.container.ContainerActivity;
import ewl.i;
import ip0.r5;
import ip0.y9;
import ix0.f0;
import ix0.g0;
import ix0.h0;
import ix0.i0;
import ix0.l0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.reflect.KProperty;
import kp0.w0;
import lc0.b0;
import ms0.s3;
import ro0.y;
import t5e.m;
import uz.t0;
import w01.k;
import yr0.l;
import yr0.o;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6959b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f6958a = i;
        this.f6959b = obj2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        ArrayList arrayList;
        int i33;
        View currentFocus;
        int i43 = this.f6958a;
        int i59 = 0;
        Object obj2 = this.f6959b;
        switch (i43) {
            case 0:
                ((CameraViewfinder) obj2).lambda$new$0(view, i, i2, i3, i5, i6, i21, i22, i32);
                return;
            case 1:
                HeaderWithBigTileLayout headerWithBigTileLayout = (HeaderWithBigTileLayout) obj2;
                r0 r0Var = headerWithBigTileLayout.u0;
                if (i5 - i2 != i32 - i21 && r0Var == r0.BLURRED_BACKGROUND && headerWithBigTileLayout.i0()) {
                    d1.a(headerWithBigTileLayout.J);
                    return;
                }
                return;
            case 2:
                ((at4.b) obj2).invoke();
                return;
            case 3:
                ((CarouselLayoutManager) obj2).lambda$new$0(view, i, i2, i3, i5, i6, i21, i22, i32);
                return;
            case 4:
                ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) obj2;
                screenContentRecyclerView.setPadding(screenContentRecyclerView.getPaddingLeft(), screenContentRecyclerView.getPaddingTop(), screenContentRecyclerView.getPaddingRight(), view.getHeight());
                return;
            case 5:
                FloatingBottomBarSelectorDrawable floatingBottomBarSelectorDrawable = (FloatingBottomBarSelectorDrawable) obj2;
                int i66 = FloatingBottomBarSelectorDrawable.A;
                if (!view.isSelected()) {
                    floatingBottomBarSelectorDrawable.c();
                    return;
                } else {
                    if (floatingBottomBarSelectorDrawable.f(view)) {
                        floatingBottomBarSelectorDrawable.c();
                        floatingBottomBarSelectorDrawable.f55988t = floatingBottomBarSelectorDrawable.f55975a.indexOfChild(view);
                        floatingBottomBarSelectorDrawable.f55979h.set(floatingBottomBarSelectorDrawable.e);
                        floatingBottomBarSelectorDrawable.invalidateSelf();
                        return;
                    }
                    return;
                }
            case 6:
                ContainerActivity.Companion companion = ContainerActivity.INSTANCE;
                i iVar = (i) ((ContainerActivity) obj2).f218652a0;
                if (iVar != null) {
                    ((ypi.a) iVar.f130328h).i.onNext(Integer.valueOf(view.getHeight()));
                    return;
                }
                return;
            case 7:
                ((goi.c) obj2).a();
                return;
            case 8:
                RevolutCardResetScaActivity revolutCardResetScaActivity = (RevolutCardResetScaActivity) obj2;
                KProperty[] kPropertyArr = RevolutCardResetScaActivity.A0;
                k.c((RecyclerView) revolutCardResetScaActivity.f64526t0.getValue(revolutCardResetScaActivity, RevolutCardResetScaActivity.A0[0]), i5 - i2);
                return;
            case 9:
                r5 r5Var = (r5) obj2;
                Ref$IntRef ref$IntRef = new Ref$IntRef();
                int i74 = r5Var.f166120l;
                AppCompatImageView appCompatImageView = r5Var.i;
                ref$IntRef.f186408a = i74;
                int width = r5Var.f166121m;
                RecyclerView recyclerView = r5Var.f;
                int width2 = recyclerView.getWidth();
                int width3 = r5Var.itemView.getWidth();
                AppCompatImageView appCompatImageView2 = r5Var.f166118h;
                if (width2 > width3 - (appCompatImageView2.getWidth() * 2) && appCompatImageView2.getVisibility() == 0) {
                    ref$IntRef.f186408a = (appCompatImageView2.getRight() - recyclerView.getLeft()) + i74;
                }
                if (recyclerView.getWidth() > r5Var.itemView.getWidth() - appCompatImageView.getWidth() && appCompatImageView.getVisibility() == 0) {
                    width = appCompatImageView.getWidth();
                }
                if (ref$IntRef.f186408a == recyclerView.getPaddingStart() && width == recyclerView.getPaddingEnd()) {
                    return;
                }
                recyclerView.setPadding(ref$IntRef.f186408a, recyclerView.getPaddingTop(), width, recyclerView.getPaddingBottom());
                recyclerView.post(new d0.c(r5Var, ref$IntRef, 24));
                return;
            case 10:
                y9 y9Var = (y9) obj2;
                FadeBottomImageView fadeBottomImageView = y9Var.f;
                TextView textView = y9Var.f167286g;
                int height = fadeBottomImageView.getHeight();
                if (height != 0) {
                    int top = textView.getTop();
                    Intrinsics.checkNotNullExpressionValue(y9Var.itemView.getContext(), "getContext(...)");
                    fadeBottomImageView.setFadeRatio(kotlin.ranges.f.f((top - kli.a.k(r10, 12.0f)) / height, BitmapDescriptorFactory.HUE_RED, 1.0f));
                }
                int height2 = fadeBottomImageView.getHeight();
                if (height2 == 0) {
                    return;
                }
                int iA = com.google.android.gms.internal.mlkit_vision_face.a.a(y9Var.itemView, "getContext(...)", 24.0f);
                int top2 = textView.getTop();
                int i92 = top2 - iA;
                if (1 > i92 || i92 >= height2) {
                    return;
                }
                Context context = y9Var.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                j70.a aVarA = wr0.a.a(context);
                if (aVarA == null) {
                    return;
                }
                float fA = com.google.android.gms.internal.mlkit_vision_face.a.a(y9Var.itemView, "getContext(...)", 8.0f);
                List listK = v.k(new qo0.e(BitmapDescriptorFactory.HUE_RED, fA, i92, top2), new qo0.e(fA, fA, top2, Integer.MAX_VALUE));
                if (Intrinsics.f(listK, y9Var.f167288j)) {
                    return;
                }
                y9Var.f167288j = listK;
                w0.b(fadeBottomImageView, listK, aVarA);
                return;
            case 11:
                ma maVar = (ma) obj2;
                WallpaperAssetSwitcher wallpaperAssetSwitcher = maVar.f54467m;
                int width4 = wallpaperAssetSwitcher.getWidth();
                int height3 = wallpaperAssetSwitcher.getHeight();
                boolean z = width4 == maVar.f54472s && height3 == maVar.f54473t;
                if (width4 <= 0 || height3 <= 0 || z) {
                    return;
                }
                Context context2 = maVar.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                j70.a aVarA2 = wr0.a.a(context2);
                if (aVarA2 == null) {
                    return;
                }
                maVar.f54472s = width4;
                maVar.f54473t = height3;
                Context context3 = maVar.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                w0.b(wallpaperAssetSwitcher, u.c(new qo0.e(BitmapDescriptorFactory.HUE_RED, r6.b.a(maVar.itemView, "getContext(...)", 30.0f), height3 - Math.min(height3, kli.a.k(context3, 108.0f)), height3)), aVarA2);
                return;
            case 12:
                ((iqi.b) obj2).k.onNext(Integer.valueOf(i5 - i2));
                return;
            case 13:
                l0 l0Var = (l0) obj2;
                List list = l0Var.f169258b;
                ViewGroup viewGroup = l0Var.f169257a;
                int size = list.size();
                for (int i96 = 0; i96 < size; i96++) {
                    if (((h0) list.get(i96)).getCutoutReceiverController() != null) {
                        ArrayList arrayList2 = l0Var.f169259c;
                        int size2 = arrayList2.size();
                        ArrayList arrayList3 = null;
                        for (int i99 = 0; i99 < size2; i99++) {
                            f0 f0VarA = ((g0) arrayList2.get(i99)).a(viewGroup);
                            if (f0VarA != null) {
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(f0VarA);
                            }
                        }
                        List list2 = l0Var.f169258b;
                        int size3 = list2.size();
                        int i100 = 0;
                        while (i100 < size3) {
                            i0 cutoutReceiverController = ((h0) list2.get(i100)).getCutoutReceiverController();
                            if (cutoutReceiverController == null) {
                                i33 = i59;
                            } else {
                                float f = knm.b.f(cutoutReceiverController.getView(), viewGroup);
                                float fH = knm.b.h(cutoutReceiverController.getView(), viewGroup);
                                if (arrayList3 != null) {
                                    arrayList = new ArrayList(arrayList3.size());
                                    int size4 = arrayList3.size();
                                    int i101 = i59;
                                    while (i101 < size4) {
                                        f0 f0Var = (f0) arrayList3.get(i101);
                                        if (f0Var == null) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        arrayList.add(new f0(f0Var.f169229a - f, f0Var.f169230b - fH, f0Var.f169231c));
                                        i101++;
                                        i59 = i59;
                                    }
                                } else {
                                    arrayList = null;
                                }
                                i33 = i59;
                                cutoutReceiverController.g(arrayList);
                            }
                            i100++;
                            i59 = i33;
                        }
                        return;
                    }
                }
                return;
            case 14:
                FlexibleStakingConsentScreenController.a aVar = FlexibleStakingConsentScreenController.Companion;
                int iA2 = com.google.android.gms.internal.mlkit_vision_face.a.a(view, "getContext(...)", 24.0f);
                ScreenContentRecyclerView flexibleStakingRecyclerView = ((FlexibleStakingConsentScreenController) obj2).d3().d;
                Intrinsics.checkNotNullExpressionValue(flexibleStakingRecyclerView, "flexibleStakingRecyclerView");
                knm.b.v(view.getHeight() - iA2, flexibleStakingRecyclerView);
                return;
            case 15:
                ((jqi.b) obj2).k.onNext(Integer.valueOf(i5 - i2));
                return;
            case 16:
                ((jr0.d) obj2).layout(0, 0, view.getWidth(), view.getHeight());
                return;
            case 17:
                m mVar = (m) obj2;
                if (i32 > i5) {
                    mVar.invoke(Boolean.TRUE);
                    return;
                } else {
                    if (i32 < i5) {
                        mVar.invoke(Boolean.FALSE);
                        return;
                    }
                    return;
                }
            case 18:
                CardPhotoScreen.a aVar2 = CardPhotoScreen.Companion;
                ((b0) ((CardPhotoScreen) obj2).f3()).f193746y.k(Unit.f186387a);
                return;
            case 19:
                s3.a aVar3 = s3.Companion;
                ((s3) obj2).b();
                return;
            case 20:
                ((PlayerControlView) obj2).onLayoutChange(view, i, i2, i3, i5, i6, i21, i22, i32);
                return;
            case 21:
                ((com.revolut.core.ui_kit.delegates.widgets.l0) obj2).J();
                return;
            case 22:
                Object value = ((qc0.b) obj2).f244397w0.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                knm.b.v(i5 - i2, (FrameLayout) value);
                return;
            case 23:
                ((y) obj2).g();
                return;
            case 24:
                ur0.d dVar = (ur0.d) obj2;
                AsyncDiffRecyclerView asyncDiffRecyclerView = dVar.f282227a;
                if (asyncDiffRecyclerView.getScrollState() == 0) {
                    dVar.b(asyncDiffRecyclerView);
                    return;
                }
                return;
            case 25:
                int i102 = CameraKitView.o;
                ((ur2.a) obj2).invoke();
                return;
            case 26:
                t0 t0Var = (t0) obj2;
                if (i == i6 && i2 == i21 && i3 == i22 && i5 == i32) {
                    return;
                }
                t0Var.t();
                return;
            case 27:
                AskAiScreen askAiScreen = (AskAiScreen) obj2;
                KProperty[] kPropertyArr2 = AskAiScreen.j0;
                if (i5 <= i32 || !(askAiScreen.m2().getCurrentFocus() instanceof EditText) || (currentFocus = askAiScreen.m2().getCurrentFocus()) == null) {
                    return;
                }
                currentFocus.clearFocus();
                return;
            case 28:
                Intrinsics.h(view);
                ((Function1) obj2).invoke(new yp0.h0(view, i, i2, i3, i5, i6, i22, i21, i32));
                return;
            default:
                o oVar = (o) obj2;
                l lVar = oVar.f;
                int iB = oVar.b(lVar.getWidth());
                int iC = oVar.c(lVar.getHeight());
                lVar.offsetLeftAndRight(iB);
                lVar.offsetTopAndBottom(iC);
                return;
        }
    }
}
