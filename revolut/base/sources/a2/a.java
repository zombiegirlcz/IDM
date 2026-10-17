package a2;

import a0.d;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.LazyListItemProviderKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.State;
import androidx.compose.runtime.changelist.OperationErrorContext;
import androidx.compose.runtime.changelist.OperationKt;
import androidx.compose.runtime.internal.AwaiterQueue;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.BaseRoomConnectionManager;
import au0.t1;
import aw0.i3;
import aw0.o3;
import aw0.o9;
import bx0.u;
import com.google.protobuf.w0;
import com.revolut.RevolutApplication;
import com.revolut.analytics.ads.model.ViewableRecordItem$Type;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.CalendarRowDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.EsimDetailsDelegate;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatAttachmentListBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatAttachmentListItemDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatQuickLinkBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatUncontainedMessageDelegate;
import com.revolut.core.ui_kit.delegates.ed;
import com.revolut.core.ui_kit.delegates.ke;
import com.revolut.core.ui_kit.delegates.widgets.ContactsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.zf;
import com.revolut.core.ui_kit.internal.views.CutoutImageView;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.badge.WarningCircleBadge;
import com.revolut.core.ui_kit.storiesdelegates.StickerStoriesModel;
import com.revolut.core.ui_kit.storiesdelegates.StickerStoriesPageDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.content.topItem.OfferTopItemContentScreen;
import com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFees;
import com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFeesMode;
import com.revolut.feature.crypto.exchange.fees.impl.ui.details.CryptoExchangeFeesDetailsController;
import com.revolut.feature.crypto.receive_widget.impl.ui.customize.CryptoReceiveWidgetCustomizationContract$Step;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsWidget;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsWidgetNextReward;
import com.revolut.feature.wealth.models.robo.Template;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.balance.picker.api.navigation.DualChooserContract$InputData;
import com.revolut.retail.feature.balance.picker.impl.new_picker.dual.DualChooserScreen;
import com.revolut.sso.api.login.RevolutSsoApi$SignUpInputData;
import com.revolut.sso.api.models.UICustomization;
import com.revolut.sso.impl.ui.password_flow.PasswordFlow;
import com.revolut.sso.impl.ui.password_flow.PasswordFlowContract$InputData;
import com.revolut.sso.impl.ui.signup.SignUpFlow;
import com.revolut.tracking.v3.RevPointsGenericWidgetContext;
import com.revolut.trading.orders.ui.screens.pocket_picker.b;
import cvl.j;
import cvl.l;
import d8b.k;
import e9d.c;
import ff4.b0;
import g2j.f;
import g2j.p;
import grl.t9;
import gsh.w;
import hea.x;
import ip0.hg;
import ip0.ig;
import ip0.kt;
import ip0.pt;
import ip0.u7;
import ip0.z4;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.Job;
import kp0.c1;
import kp0.e1;
import kp0.n;
import kp0.t0;
import ljl.h0;
import ljl.q0;
import lp.q1;
import nq.i0;
import od0.h;
import od0.i;
import or0.m;
import org.jmrtd.lds.LDSFile;
import r5b.r;
import tf5.g;
import ue0.e;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f657c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(ChatUncontainedMessageDelegate.ViewHolder viewHolder, ChatUncontainedMessageDelegate chatUncontainedMessageDelegate, c1 c1Var, ChatUncontainedMessageDelegate.Model model) {
        this.f655a = 29;
        this.f656b = viewHolder;
        this.f657c = chatUncontainedMessageDelegate;
        this.d = model;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v59, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v21, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Float, java.lang.Integer, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r7v1, types: [b60.a] */
    /* JADX WARN: Type inference failed for: r7v26 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ReferralContactDelegate.Model model;
        int i = this.f655a;
        boolean z = false;
        int i2 = 26;
        Object obj2 = this.d;
        Object obj3 = this.f657c;
        Object obj4 = this.f656b;
        switch (i) {
            case 0:
                return OperationKt.attachComposeStackTrace$lambda$0((Anchor) obj4, (SlotWriter) obj3, (OperationErrorContext) obj2);
            case 1:
                return BaseRoomConnectionManager.DriverWrapper.openLocked$lambda$1((BaseRoomConnectionManager) obj4, (BaseRoomConnectionManager.DriverWrapper) obj3, (String) obj2);
            case 2:
                CryptoExchangeFeesDetailsController cryptoExchangeFeesDetailsController = (CryptoExchangeFeesDetailsController) obj4;
                CryptoExchangeFees cryptoExchangeFees = (CryptoExchangeFees) obj3;
                CryptoExchangeFeesMode cryptoExchangeFeesMode = (CryptoExchangeFeesMode) obj2;
                phm.a aVar = (phm.a) e.j(cryptoExchangeFeesDetailsController.m2()).a().get(tf5.e.class);
                 = aVar != null ? (b60.a) aVar.get() : 0;
                if ( == 0) {
                    throw new IllegalStateException(d.q("Api ", tf5.e.class, " is not found"));
                }
                tf5.e eVar = ((tf5.e) b()).o;
                cryptoExchangeFeesMode.getClass();
                return new g(eVar, cryptoExchangeFees, cryptoExchangeFeesMode, cryptoExchangeFeesDetailsController);
            case 3:
                StickerStoriesModel stickerStoriesModel = (StickerStoriesModel) obj4;
                u uVar = (u) obj3;
                ((StickerStoriesPageDelegate) obj2).q(stickerStoriesModel.getO(), uVar.I(), uVar.M(), uVar.R(), true, stickerStoriesModel.getF58249j(), stickerStoriesModel.getF(), stickerStoriesModel.getF58247g(), stickerStoriesModel.getF58248h(), stickerStoriesModel.getI(), stickerStoriesModel.getK(), stickerStoriesModel.getF58250l(), stickerStoriesModel.getF58251m(), stickerStoriesModel.getF58252n(), stickerStoriesModel);
                return Unit.f186387a;
            case 4:
                b bVar = (b) obj4;
                return mra.d.b(bVar, (l) obj3, bVar.o, (j) obj2, false, 8);
            case 5:
                return AwaiterQueue.addAwaiter$lambda$1((AwaiterQueue.Awaiter) obj4, (AwaiterQueue) obj3, (Ref$IntRef) obj2);
            case 6:
                String widgetId = (String) obj3;
                CobrandedCardsWidget widget = (CobrandedCardsWidget) obj2;
                d8b.a aVar2 = ((k) obj4).f112206b;
                Intrinsics.checkNotNullParameter(widgetId, "widgetId");
                Intrinsics.checkNotNullParameter(widget, "widget");
                w0 w0VarE = kii.e.e(RevPointsGenericWidgetContext.newBuilder(), t9.DATA, AnalyticsContext.INSTANCE);
                boolean z3 = widget.f82488c == r.WARNING;
                CobrandedCardsWidgetNextReward cobrandedCardsWidgetNextReward = widget.f;
                TextClause textClause = new TextClause(widget.f82486a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                UrlImage urlImage = new UrlImage(widget.f82487b, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) , (Integer) , z, 15), null, gz0.b.CenterCrop, null, null, null, LDSFile.EF_DG2_TAG), null, null, false, false, 507902);
                WarningCircleBadge warningCircleBadge = z3 ? new WarningCircleBadge(dw0.a.Suspicious) : null;
                TextClause textClause2 = new TextClause(widget.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str = widget.e;
                TextClause textClause3 = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
                ke keVar = ke.MATCH_PARENT;
                ReferralContactDelegate.Model model2 = new ReferralContactDelegate.Model("list_id_cobrands_points", urlImage, textClause2, textClause3, warningCircleBadge, keVar, false, null, null, 502224);
                if (cobrandedCardsWidgetNextReward != null) {
                    LayeredImage layeredImageI = LayeredImage.INSTANCE.i(aVar2.f112187a.b(cobrandedCardsWidgetNextReward.f82491c), R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10);
                    TextClause textClause4 = new TextClause(cobrandedCardsWidgetNextReward.f82489a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    TextClause textClause5 = new TextClause(cobrandedCardsWidgetNextReward.f82490b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    Double d = cobrandedCardsWidgetNextReward.d;
                    model = new ReferralContactDelegate.Model("list_id_cobrands_next_reward", layeredImageI, textClause4, textClause5, null, null, null, keVar, d != null ? ProgressStyle.Companion.c(ProgressStyle.INSTANCE, rim.d.b(d.doubleValue() * ((double) 100)), R$attr.uikit_colorAccentNeutral) : null, null, null, 502256);
                } else {
                    model = null;
                }
                ReferralContactDelegate.Model[] elements = {model2, model};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return new ContactsWidgetDelegate.Model(widgetId, kotlin.collections.d.L(elements), textClause, false, new AnalyticsContext(w0VarE), new zn.b(widgetId, new ViewableRecordItem$Type.ViewableRecord(null), new AnalyticsContext(w0VarE)), 8);
            case 7:
                c cVar = (c) obj3;
                j7d.a aVar3 = (j7d.a) obj2;
                return (List) iii.c.f((Data) obj4, new e87.e(cVar, aVar3, 10), new e54.r(cVar, aVar3), new dbg.b(cVar, aVar3, i2));
            case 8:
                ((ep0.l) obj4).f128038b.invoke((String) obj3, (String) obj2);
                return Unit.f186387a;
            case 9:
                ((com.revolut.biometric_verification.impl.ui.flow.launcher.d) obj4).U2((i0) obj3, ((ur.b) obj2).f282220b);
                return Unit.f186387a;
            case 10:
                DualChooserScreen dualChooserScreen = (DualChooserScreen) obj4;
                DualChooserContract$InputData dualChooserContract$InputData = (DualChooserContract$InputData) obj3;
                i1j.a aVar4 = (i1j.a) obj2;
                KProperty[] kPropertyArr = DualChooserScreen.U;
                phm.a aVar5 = (phm.a) e.j(dualChooserScreen.m2()).a().get(f.class);
                b60.a aVar6 = aVar5 != null ? (b60.a) aVar5.get() : null;
                if (aVar6 == null) {
                    throw new IllegalStateException(d.q("Api ", f.class, " is not found"));
                }
                j2j.a aVarN = ((j2j.a) ((j2j.b) aVar6.b()).b().mo3808a(dualChooserScreen)).N(dualChooserContract$InputData);
                i.Companion.getClass();
                return (p) aVarN.C(h.a(aVar4)).mo3783build();
            case 11:
                com.revolut.feature.credit.application.plugins.impl.ui.application.d dVar = (com.revolut.feature.credit.application.plugins.impl.ui.application.d) obj2;
                ((Ref$BooleanRef) obj4).f186407a = true;
                Job job2 = (Job) ((Ref$ObjectRef) obj3).f186409a;
                if (job2 != null) {
                    job2.f(null);
                }
                dVar.l2(new h54.l(dVar, , 8), new yi5.b(i2));
                return Unit.f186387a;
            case 12:
                com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar7 = (com.revolut.feature.pockets.impl.details_v2.pocket_details.a) obj4;
                aVar7.l2(new x(aVar7, (io3.d) obj3, (AccountId) obj2, null, 1), new yi5.b(i2));
                return Unit.f186387a;
            case 13:
                OfferTopItemContentScreen offerTopItemContentScreen = (OfferTopItemContentScreen) obj4;
                ?? r110 = offerTopItemContentScreen.R;
                df4.i iVar = offerTopItemContentScreen.M;
                ff4.j jVar = (ff4.j) obj3;
                ff4.k kVar = (ff4.k) obj2;
                KProperty[] kPropertyArr2 = OfferTopItemContentScreen.U;
                if (((b0) offerTopItemContentScreen.R2()).L2()) {
                    b0 b0Var = (b0) offerTopItemContentScreen.R2();
                    b0Var.H2(b0Var.f134712t, new fe9.f(7));
                    if (jVar != null) {
                        offerTopItemContentScreen.f3().setSubtitleText(jVar.e);
                    }
                    RecyclerView recyclerViewH = ((dli.c) r110.getValue()).h();
                    NavBarLargeCentred navBarLargeCentredF3 = offerTopItemContentScreen.f3();
                    iVar.getClass();
                    df4.i.a(navBarLargeCentredF3, recyclerViewH);
                    ff4.j jVar2 = kVar != null ? kVar.f134726a : null;
                    LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(offerTopItemContentScreen);
                    NavBarLargeCentred navBarLargeCentredF32 = offerTopItemContentScreen.f3();
                    RecyclerView recyclerViewH2 = ((dli.c) r110.getValue()).h();
                    FrameLayout creditCardOfferLargeActionButtonContainer = offerTopItemContentScreen.d3().f10681c;
                    Intrinsics.checkNotNullExpressionValue(creditCardOfferLargeActionButtonContainer, "creditCardOfferLargeActionButtonContainer");
                    h1k.a aVar8 = new h1k.a(offerTopItemContentScreen, jVar2, 21);
                    iVar.getClass();
                    df4.i.d(lifecycleScope, navBarLargeCentredF32, recyclerViewH2, creditCardOfferLargeActionButtonContainer, aVar8);
                }
                return Unit.f186387a;
            case 14:
                hmc.e eVar2 = (hmc.e) obj4;
                eVar2.V2(new w(eVar2, (String) obj3, (Template) obj2, null, 25), new yi5.b(29));
                return Unit.f186387a;
            case 15:
                RevolutApplication revolutApplication = ((lm.c) obj3).f196833b;
                RevolutApplication.Companion aVar9 = RevolutApplication.INSTANCE;
                m41.i iVar2 = new m41.i((q1) obj4, revolutApplication, (com.revolut.analytics.tracking.v3.d) obj2);
                iVar2.init();
                return iVar2;
            case 16:
                AppCompatImageView appCompatImageView = (AppCompatImageView) obj4;
                CalendarRowDelegate.Model model3 = (CalendarRowDelegate.Model) obj3;
                py0.c cVar2 = new py0.c(model3.d);
                m.a(appCompatImageView);
                appCompatImageView.setOnClickListener(new t1(model3, 6, cVar2, (z4) obj2));
                return Unit.f186387a;
            case 17:
                u7 u7Var = (u7) obj4;
                CellDetailsNoteDelegate.Model component = (CellDetailsNoteDelegate.Model) obj3;
                CellDetailsNoteDelegate cellDetailsNoteDelegate = (CellDetailsNoteDelegate) obj2;
                ImageView imageView = u7Var.f166610g;
                yy0.l lVar = component.f51873c;
                Image image = lVar != null ? lVar.getImage() : null;
                j01.c delegate = new j01.c(new View[]{u7Var.f166610g}, component, cellDetailsNoteDelegate.f51870h, null, 24);
                Object obj5 = or0.u.f228038a;
                Intrinsics.checkNotNullParameter(imageView, "<this>");
                Intrinsics.checkNotNullParameter(component, "component");
                Intrinsics.checkNotNullParameter(delegate, "delegate");
                or0.u.s(imageView, component, image != null ? new py0.b(image) : null, delegate);
                return Unit.f186387a;
            case 18:
                EsimDetailsDelegate.Model model4 = (EsimDetailsDelegate.Model) obj3;
                EsimDetailsDelegate esimDetailsDelegate = (EsimDetailsDelegate) obj2;
                CutoutImageView cutoutImageView = ((hg) obj4).i;
                o3 o3Var = model4.f52246c;
                py0.c cVar3 = o3Var != null ? new py0.c(o3Var.f10451a) : null;
                m.a(cutoutImageView);
                cutoutImageView.setOnClickListener(new ig(model4, cVar3, esimDetailsDelegate, model4, 1));
                return Unit.f186387a;
            case 19:
                return Float.valueOf((((Number) ((Lazy) obj3).getValue()).floatValue() * ((pt) obj4).f165864j.getWidth()) - ((Number) ((Lazy) obj2).getValue()).intValue());
            case 20:
                PromptContentDelegate.Model model5 = (PromptContentDelegate.Model) obj4;
                ed edVar = (ed) obj3;
                PromptContentDelegate promptContentDelegate = (PromptContentDelegate) obj2;
                Clause clause = model5.d;
                or0.u.k(edVar.f54114n).n0().a(edVar.f54114n, model5, clause != null ? new py0.c(clause) : null);
                promptContentDelegate.r().onNext(model5);
                return Unit.f186387a;
            case 21:
                RowDelegate.Model model6 = (RowDelegate.Model) obj3;
                RowDelegate rowDelegate = (RowDelegate) obj2;
                RowDelegate.Companion companion = RowDelegate.INSTANCE;
                fp0.p pVar = ((zf) obj4).P;
                if (pVar == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                py0.c cVar4 = new py0.c(model6.f53230c);
                fp0.p.b(pVar, true);
                View view = pVar.f137029a;
                m.a(view);
                view.setOnClickListener(new kt(model6, cVar4, rowDelegate, model6, 17));
                return Unit.f186387a;
            case 22:
                SignUpFlow signUpFlow = (SignUpFlow) obj4;
                return new ljl.w0(((q0) kli.a.n(signUpFlow.m2())).E, signUpFlow, (RevolutSsoApi$SignUpInputData) obj3, (yil.a) obj2);
            case 23:
                is0.a aVar10 = (is0.a) obj3;
                ((Ref$BooleanRef) obj4).f186407a = true;
                if (Intrinsics.f(aVar10.f168078c, (i3) obj2)) {
                    aVar10.f168076a.setTypeface(aVar10.f168077b);
                }
                return Unit.f186387a;
            case 24:
                return LazyListItemProviderKt.rememberLazyListItemProviderLambda$lambda$0$1((State) obj4, (LazyListState) obj3, (LazyItemScopeImpl) obj2);
            case 25:
                UICustomization uICustomization = (UICustomization) obj2;
                q0 q0Var = ((q0) kli.a.n(((PasswordFlow) obj4).m2())).E;
                uICustomization.getClass();
                return new h0(q0Var, (PasswordFlowContract$InputData) obj3, uICustomization);
            case 26:
                oki.h.z2(((com.revolut.feature.crypto.receive_widget.impl.ui.customize.c) obj3).A, new CryptoReceiveWidgetCustomizationContract$Step.SelectNetwork((String) obj2, (List) obj4), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                return Unit.f186387a;
            case 27:
                n nVar = (n) obj4;
                ChatAttachmentListBubbleDelegate.AttachmentItem attachmentItem = (ChatAttachmentListBubbleDelegate.AttachmentItem) obj3;
                nVar.f.setModel(new et0.m(attachmentItem.f53790b, attachmentItem.f53791c, attachmentItem.d, nVar.f188041g, new k8e.a((ChatAttachmentListItemDelegate) obj2, attachmentItem, 23)));
                return Unit.f186387a;
            case 28:
                ChatQuickLinkBubbleDelegate.a aVar11 = ChatQuickLinkBubbleDelegate.Companion;
                ((t0) obj4).f188098r.b0();
                ((ChatQuickLinkBubbleDelegate) obj3).k.onNext((ChatQuickLinkBubbleDelegate.Model) obj2);
                return Unit.f186387a;
            default:
                ChatUncontainedMessageDelegate.Model model7 = (ChatUncontainedMessageDelegate.Model) obj2;
                ((ChatUncontainedMessageDelegate) obj3).f53915c.onNext(new e1(model7.f53916a, ((ChatUncontainedMessageDelegate.ViewHolder) obj4).f.getText().toString(), true, 1, model7.f53919g));
                return Unit.f186387a;
        }
    }

    public /* synthetic */ a(Object obj2, int i, Object obj3, Object obj4) {
        this.f655a = i;
        this.f656b = obj2;
        this.f657c = obj3;
        this.d = obj4;
    }
}
