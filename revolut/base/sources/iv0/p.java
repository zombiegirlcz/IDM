package iv0;

import ael.t0;
import android.net.Uri;
import android.view.ViewStub;
import android.view.Window;
import android.webkit.WebView;
import androidx.compose.foundation.lazy.LazyLayoutSemanticStateKt;
import androidx.compose.foundation.lazy.LazyListState;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.backend_flow.impl.ui.entities_selection.EntitiesSelectionController;
import com.revolut.core.ui_kit.R$dimen;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.connecting.CardReaderConnectingScreen;
import com.revolut.feature.cards_core.api.CardsCoreApi$Toggles;
import com.revolut.feature.credit.application.plugins.impl.ui.loading.LoadingScreen;
import com.revolut.feature.external_accounts.impl.mandate.mandate_result.MandateResultScreen;
import com.revolut.feature.freelancer.impl.ui.profile.email_flow.edit_email.FreelancerEmailScreen;
import com.revolut.feature.junior_onboarding.api.JuniorOnboardingApi$Toggles;
import com.revolut.feature.pdfsave.ui.pdfnativesave.PdfNativeSaveActivity;
import com.revolut.feature.pdfsave.ui.pdfnativesave.PdfNativeSaveContract$Configuration;
import com.revolut.feature.shared.help_centre.impl.faq.screens.form_chooser.FaqFormChooserScreen;
import com.revolut.feature.shared.help_centre.impl.main.HelpFlow;
import com.revolut.feature.subscriptions.impl.block_card_subscription.BlockCardSubscriptionFlow;
import com.revolut.feature_retail_user_declarations.contact_selection.ContactSelectionWorkflowContract$Step;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.daily.WealthDailyNewsScreen;
import dw3.o8;
import j2g.k;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lb0.l0;
import lb0.p0;
import tfm.z0;
import vkm.j2;
import vkm.y;
import wim.z;
import xf6.w1;
import yc0.c0;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class p implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f168691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f168692b;

    public /* synthetic */ p(Object obj2, int i) {
        this.f168691a = i;
        this.f168692b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v100, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v108, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v116, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v131, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v136, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v144, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v159, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v2, types: [iv0.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.revolut.core.ui_kit_core.actionshandler.TrackableItem] */
    /* JADX WARN: Type inference failed for: r3v23 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 3;
        Object obj2 = null;
        switch (this.f168691a) {
            case 0:
                ?? r06 = (q) this.f168692b;
                ?? Inflate = ((ViewStub) r06.f168693a.findViewById(r06.f168694b)).inflate();
                Intrinsics.i(Inflate, "null cannot be cast to non-null type T of com.revolut.core.ui_kit.internal.views.utils.LazyViewStub");
                Inflate.setAlpha(r06.e);
                 = Inflate instanceof TrackableItem ? (TrackableItem) Inflate : 0;
                if ( != 0) {
                    setAnalyticsContext(r06.f168695c);
                }
                Inflate.addOnAttachStateChangeListener(new as0.d(r06, Inflate, 3));
                if (Inflate.isAttachedToWindow()) {
                    r06.b(Inflate);
                }
                return Inflate;
            case 1:
                mv5.f fVar = (mv5.f) ((iv5.l) this.f168692b).f168736n;
                j2 j2Var = fVar.f209148g;
                j2 j2Var2 = fVar.f209149h;
                mu5.p pVar = fVar.e;
                return vkm.q.Q(ta6.a.e(j2Var, j2Var2, pVar.c(), t1.E(new ahe.i(new y(new mu5.i(pVar, null, 0), pVar.f208986a.j(new tk0.c("CRYPTO_EARNING_WIDGET_SHOW_UP_TO"))), 7)), fVar.f209146b.W(), new mv5.e(fVar, null)), new bwb.k(i, 10, ));
            case 2:
                iwj.a aVar = (iwj.a) this.f168692b;
                String str = aVar.f169176l;
                if (str != null) {
                    efm.r rVarC = ((z39.b) aVar.f169171b).e(str, false).C();
                    Intrinsics.checkNotNullExpressionValue(rVarC, "toObservable(...)");
                    vkm.q.G(rd0.e.b(rd0.e.p(rVarC, 5000L, 30000L, 25)), aVar.f169173g);
                }
                return Unit.f186387a;
            case 3:
                return Boolean.valueOf(((jte.d) ((ixe.b) this.f168692b).f169546a).c(JuniorOnboardingApi$Toggles.JuniorPendingKyc.f76949c));
            case 4:
                return Boolean.valueOf(((jte.d) ((ixe.m) this.f168692b).f169562b).c(CardsCoreApi$Toggles.PriorityDeliveryDateDisplaying.f65568c));
            case 5:
                return (vyg.c) ((com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a) this.f168692b).f95067s.f275583a.v0(vyg.c.WEEKLY, "WIDGETISED_TIMESTAMP_KEY", z.d(o0.b(vyg.c.class)));
            case 6:
                Window window = ((iz0.e) this.f168692b).f169813a;
                return Integer.valueOf(((Boolean) jo0.g.v.getValue()).booleanValue() ? window.getContext().getResources().getDimensionPixelSize(R$dimen.internal_keyboard_suggestions_bar_height) : window.getContext().getResources().getDimensionPixelSize(R$dimen.internal_keyboard_suggestions_height));
            case 7:
                Object value = ((iz7.a) this.f168692b).f169851c.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                return ((ihm.b) value).hide();
            case 8:
                FreelancerEmailScreen freelancerEmailScreen = (FreelancerEmailScreen) this.f168692b;
                KProperty[] kPropertyArr = FreelancerEmailScreen.f74046b0;
                return (j07.i) ((us6.y) freelancerEmailScreen.Y.getValue()).d.get();
            case 9:
                return Integer.valueOf(LazyLayoutSemanticStateKt.AnonymousClass1.totalItemsCount_delegate$lambda$0((LazyListState) this.f168692b));
            case 10:
                WealthDailyNewsScreen wealthDailyNewsScreen = (WealthDailyNewsScreen) this.f168692b;
                KProperty[] kPropertyArr2 = WealthDailyNewsScreen.c0;
                return (j1k.f) ((l0k.f) wealthDailyNewsScreen.Z.getValue()).i.get();
            case 11:
                ((j2g.y) this.f168692b).C2(k.b.f170878a);
                return Unit.f186387a;
            case 12:
                ufm.i iVarF = ((t0) ((ybl.l) ((r10.a) this.f168692b).f250811a)).f();
                j4e.c cVar = new j4e.c(2, new j3f.d(6));
                ofm.n nVar = new ofm.n();
                try {
                    iVarF.q(new ufm.g(nVar, cVar));
                    return nVar;
                } catch (NullPointerException e) {
                    throw e;
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                    nullPointerException.initCause(th10);
                    throw nullPointerException;
                }
            case 13:
                j4h.l lVar = (j4h.l) this.f168692b;
                String str2 = lVar.c3().f310974a;
                List listK = v.k(eel.c.ONE_DAY, eel.c.ONE_WEEK, eel.c.ONE_MONTH, eel.c.SIX_MONTHS, eel.c.ONE_YEAR, eel.c.FIVE_YEAR, eel.c.ALL);
                Iterator it8 = eel.c.a().iterator();
                while (true) {
                    if (it8.hasNext()) {
                        Object next = it8.next();
                        if (Intrinsics.f(((eel.c) next).getId(), ((j4h.h) lVar.c3().f310975b).d)) {
                            obj2 = next;
                        }
                    }
                }
                eel.c cVar2 = (eel.c) obj2;
                if (cVar2 == null) {
                    cVar2 = eel.c.ONE_YEAR;
                }
                return mra.d.c(lVar, new j4h.e(str2, null, null, listK, cVar2, TrendViewDelegate.a.C0428a.f53562a), lVar.f171390m);
            case 14:
                oki.h.D2(((com.revolut.feature.apm.iris.impl.ui.pay.b) this.f168692b).f62521t);
                return Unit.f186387a;
            case 15:
                yki.i iVar = ((com.revolut.feature.defi.settings.impl.ui.recovery_phrase.flow.a) this.f168692b).f71871q;
                if (iVar.d() == null) {
                    oki.h.D2(iVar);
                }
                return Unit.f186387a;
            case 16:
                com.revolut.feature.payments_migration.impl.ui.screen.move_payment.account_details.a aVar2 = (com.revolut.feature.payments_migration.impl.ui.screen.move_payment.account_details.a) this.f168692b;
                aVar2.X1(aVar2.f80275q.a());
                return Unit.f186387a;
            case 17:
                PdfNativeSaveActivity pdfNativeSaveActivity = (PdfNativeSaveActivity) this.f168692b;
                int i2 = PdfNativeSaveActivity.f80315t0;
                return ((PdfNativeSaveContract$Configuration) pdfNativeSaveActivity.G0()).f80319b;
            case 18:
                FaqFormChooserScreen faqFormChooserScreen = (FaqFormChooserScreen) this.f168692b;
                KProperty[] kPropertyArr3 = FaqFormChooserScreen.c0;
                return (j8d.g) ((r7d.h) faqFormChooserScreen.Y.getValue()).f252119c.get();
            case 19:
                return (j9d.a) ((r7d.m) ((HelpFlow) this.f168692b).P.getValue()).d.get();
            case 20:
                return (j9e.a) ((i9e.h) ((BlockCardSubscriptionFlow) this.f168692b).P.getValue()).d.get();
            case 21:
                ((z0) this.f168692b).b(new IllegalStateException("ImageDisplayer cannot render image"));
                return Unit.f186387a;
            case 22:
                jai.b bVar = ((com.revolut.feature_retail_user_declarations.contact_selection.b) this.f168692b).o;
                return new ContactSelectionWorkflowContract$Step.Chooser(bVar.f172480a, bVar.f172481b);
            case 23:
                EntitiesSelectionController entitiesSelectionController = (EntitiesSelectionController) this.f168692b;
                int i3 = EntitiesSelectionController.f51262b0;
                fa0.o oVar = (fa0.o) entitiesSelectionController.V.getValue();
                switch (oVar.f133118a) {
                    case 0:
                        gb0.a aVar3 = (gb0.a) oVar.i.get();
                        fa0.j jVar = (fa0.j) oVar.f133124l;
                        aa0.s sVar = new aa0.s((ad0.a) jVar.z.get(), 0);
                        jb0.j jVar2 = new jb0.j((eb0.a) oVar.k.get(), (l0) jVar.f133090r0.get(), (p0) jVar.m0.get(), (yc0.v) jVar.f133092s0.get(), (c0) jVar.f133094t0.get(), (ad0.a) jVar.z.get());
                        c70.a aVarZ = oVar.f133120c.f133103c.z();
                        vc.s.j(aVarZ);
                        return new jb0.i(aVar3, sVar, jVar2, aVarZ, (j60.a) oVar.f.get(), (qa0.b) jVar.u.get(), oVar.f133119b);
                    default:
                        gb0.a aVar4 = (gb0.a) oVar.i.get();
                        fa0.h hVar = (fa0.h) oVar.f133124l;
                        aa0.s sVar2 = new aa0.s((ad0.a) hVar.z.get(), 0);
                        jb0.j jVar3 = new jb0.j((eb0.a) oVar.k.get(), (l0) hVar.f133056r0.get(), (p0) hVar.m0.get(), (yc0.v) hVar.f133058s0.get(), (c0) hVar.f133060t0.get(), (ad0.a) hVar.z.get());
                        c70.a aVarZ2 = oVar.f133120c.f133103c.z();
                        vc.s.j(aVarZ2);
                        return new jb0.i(aVar4, sVar2, jVar3, aVarZ2, (j60.a) oVar.f.get(), (qa0.b) hVar.u.get(), oVar.f133119b);
                }
            case 24:
                return (jc1.c) ((xb1.g) ((CardReaderConnectingScreen) this.f168692b).P.getValue()).e.get();
            case 25:
                LoadingScreen loadingScreen = (LoadingScreen) this.f168692b;
                KProperty[] kPropertyArr4 = LoadingScreen.f67877b0;
                return (jd4.d) ((o8) loadingScreen.W.getValue()).f119470c.get();
            case 26:
                String url2 = ((WebView) this.f168692b).getUrl();
                if (url2 != null) {
                    return Uri.parse(url2);
                }
                return null;
            case 27:
                a26.s sVar3 = ((com.revolut.feature.retail.reverywhere.impl.web_app.d) this.f168692b).f82943y;
                if (sVar3 != null) {
                    sVar3.invoke(Boolean.FALSE);
                }
                return Unit.f186387a;
            case 28:
                return (jh6.d) ((w1) ((MandateResultScreen) this.f168692b).U.getValue()).f305133c.get();
            default:
                ((com.revolut.feature.address.common.impl.flow.screen.find.b) this.f168692b).J2();
                return Unit.f186387a;
        }
    }
}
