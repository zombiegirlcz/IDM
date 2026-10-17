package ofa;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.WebViewDelegate;
import com.revolut.core.ui_kit.delegates.timer.TimerDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.upi.impl.screens.pending_payment.confirmation.ConfirmationScreen;
import com.revolut.feature.articles_deeplinks_impl.screen.ArticleWebViewScreen;
import com.revolut.feature.rewards.impl.R$string;
import com.revolut.feature.tab.accounts.models.product_payload.SavingsProductAccountPayload;
import com.revolut.retail.feature.esim.impl.ui.screens.esim_setup_options.EsimSetupOptionsScreen;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import qlm.d1;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class n implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f224779a;

    public /* synthetic */ n(int i) {
        this.f224779a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f224779a) {
            case 0:
                return new d1("CHECKOUT", o.INSTANCE, new Annotation[]{new t()});
            case 1:
                return new d1("COBRANDS_ONBOARDING", p.INSTANCE, new Annotation[]{new t()});
            case 2:
                return new d1("CONTACTS_SYNC", r.INSTANCE, new Annotation[]{new t()});
            case 3:
                return new d1("CREDIT_ONBOARDING", s.INSTANCE, new Annotation[]{new t()});
            case 4:
                return new d1("PRO_ONBOARDING", v.INSTANCE, new Annotation[]{new t()});
            case 5:
                return new d1("PROFILE", w.INSTANCE, new Annotation[]{new t()});
            case 6:
                return new d1("RETAIL_CREDIT_ONBOARDING", x.INSTANCE, new Annotation[]{new t()});
            case 7:
                return new d1("RETAIL_CREDIT_ONBOARDING_WAITING", y.INSTANCE, new Annotation[]{new t()});
            case 8:
                return new d1("UNKNOWN", f0.INSTANCE, new Annotation[]{new t()});
            case 9:
                return new qlm.e(g0.Companion.serializer());
            case 10:
                KProperty[] kPropertyArr = ConfirmationScreen.S;
                return new RowDelegate(null, null, 7);
            case 11:
                KProperty[] kPropertyArr2 = ConfirmationScreen.S;
                return new TimerDelegate();
            case 12:
                KProperty[] kPropertyArr3 = ConfirmationScreen.S;
                return new FullScreenStateDelegate();
            case 13:
                return Unit.f186387a;
            case 14:
                return new RowDelegate(null, null, 7);
            case 15:
                return new LargeActionButtonDelegate();
            case 16:
                return yfe.h.INSTANCE.serializer();
            case 17:
                KProperty[] kPropertyArr4 = EsimSetupOptionsScreen.W;
                return new RowDelegate(null, null, 7);
            case 18:
                return Unit.f186387a;
            case 19:
                return new ListSubheaderDelegate.Model("item_id_title", null, new TextLocalisedClause(R$string.perks_details_rules_list_header, null, null, 14), null, null, null, aw0.j0.TRANSPARENT, null, null, false, false, null, null, 0, 0, 0, 0, 16777146);
            case 20:
                return new ListSubheaderDelegate.Model("LIST_ID_SECTION_HEADER", null, new TextLocalisedClause(R$string.perks_details_header_more_like_this, null, null, 14), null, null, null, aw0.j0.TRANSPARENT, null, null, false, false, null, null, 0, 0, 0, 0, 16777146);
            case 21:
                SavingsProductAccountPayload.a aVar = SavingsProductAccountPayload.Companion;
                p0 p0Var = o0.f186429a;
                return new mlm.f("com.revolut.feature.tab.accounts.models.product_payload.SavingsProductAccountPayload", p0Var.b(SavingsProductAccountPayload.class), new KClass[]{p0Var.b(SavingsProductAccountPayload.Challenge.class), p0Var.b(SavingsProductAccountPayload.Joint.class), p0Var.b(SavingsProductAccountPayload.Personal.class), p0Var.b(SavingsProductAccountPayload.Teen.class), p0Var.b(SavingsProductAccountPayload.Youth.class)}, new KSerializer[]{SavingsProductAccountPayload.Challenge.a.f89735a, new d1("joint", SavingsProductAccountPayload.Joint.INSTANCE, new Annotation[]{new com.revolut.feature.tab.accounts.models.product_payload.a()}), SavingsProductAccountPayload.Personal.a.f89738a, new d1("teen", SavingsProductAccountPayload.Teen.INSTANCE, new Annotation[]{new com.revolut.feature.tab.accounts.models.product_payload.a()}), new d1("youth", SavingsProductAccountPayload.Youth.INSTANCE, new Annotation[]{new com.revolut.feature.tab.accounts.models.product_payload.a()})}, new Annotation[]{new com.revolut.feature.tab.accounts.models.product_payload.a()});
            case 22:
                SavingsProductAccountPayload.Challenge.b bVar = SavingsProductAccountPayload.Challenge.Companion;
                return j1.b("com.revolut.feature.tab.accounts.models.product_payload.SavingsProductAccountPayload.ProductType", oie.a.values());
            case 23:
                return new d1("joint", SavingsProductAccountPayload.Joint.INSTANCE, new Annotation[]{new com.revolut.feature.tab.accounts.models.product_payload.a()});
            case 24:
                SavingsProductAccountPayload.Personal.b bVar2 = SavingsProductAccountPayload.Personal.Companion;
                return j1.b("com.revolut.feature.tab.accounts.models.product_payload.SavingsProductAccountPayload.ProductType", oie.a.values());
            case 25:
                return new d1("teen", SavingsProductAccountPayload.Teen.INSTANCE, new Annotation[]{new com.revolut.feature.tab.accounts.models.product_payload.a()});
            case 26:
                return new d1("youth", SavingsProductAccountPayload.Youth.INSTANCE, new Annotation[]{new com.revolut.feature.tab.accounts.models.product_payload.a()});
            case 27:
                KProperty[] kPropertyArr5 = ArticleWebViewScreen.S;
                return new WebViewDelegate();
            case 28:
                return new LargeActionButtonDelegate();
            default:
                return new TextDelegate();
        }
    }
}
