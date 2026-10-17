package k16;

import com.revolut.core.ui_kit.delegates.CellDetailsAccountDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.onboarding.countries.restriction.impl.disclaimer.CountryOfResidenceRevolutXDisclaimerScreen;
import com.revolut.feature.pix.impl.flow.authorisation_request.screens.payment_info.PixAuthorisationPaymentInfoScreen;
import com.revolut.feature.stock_lending.impl.ui.screens.transaction.StockLendingTransactionDetailsScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.search.TravelExperiencesSearchScreen;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.amount.RemittanceAmountScreen;
import java.lang.annotation.Annotation;
import k19.z;
import k29.a;
import k29.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import qlm.d1;
import qlm.h0;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180107a;

    public /* synthetic */ d(int i) {
        this.f180107a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f180107a) {
            case 0:
                return new qlm.e(n.f180121a);
            case 1:
                return l19.b.Companion.serializer();
            case 2:
                return new h0(v1.f247718a, k19.f.f180152a, 1);
            case 3:
                return new mlm.a(o0.f186429a.b(k19.h.class), j1.b("com.revolut.feature.lifestyle.content_gateway.api.model.slot.atoms.LifestyleRichText.Placeholder.Formatting", k19.h.values()), new KSerializer[0]);
            case 4:
                return j1.b("com.revolut.feature.lifestyle.content_gateway.api.model.slot.atoms.LifestyleSlotBadge.Theme", k19.p.values());
            case 5:
                return new qlm.e(v1.f247718a);
            case 6:
                return j1.b("com.revolut.feature.lifestyle.content_gateway.api.model.slot.atoms.LifestyleSlotLogo.Type", z.values());
            case 7:
                KProperty[] kPropertyArr = StockLendingTransactionDetailsScreen.c0;
                return new CellDetailsChevronDelegate();
            case 8:
                KProperty[] kPropertyArr2 = StockLendingTransactionDetailsScreen.c0;
                return new CellDetailsDelegate();
            case 9:
                return new d1("com.revolut.feature.lifestyle.core.impl.data.model.dto.wrapped.LifestyleWrappedCardAssetDto.Unknown", a.c.INSTANCE, new Annotation[0]);
            case 10:
                c.Companion aVar = k29.c.INSTANCE;
                p0 p0Var = o0.f186429a;
                return new mlm.f("com.revolut.feature.lifestyle.core.impl.data.model.dto.wrapped.LifestyleWrappedCardContentDto", p0Var.b(k29.c.class), new KClass[]{p0Var.b(c.b.class), p0Var.b(c.C1033c.class), p0Var.b(c.d.class)}, new KSerializer[]{c.b.a.f180414a, c.C1033c.a.f180419a, c.d.a.f180422a}, new Annotation[]{new k29.d()});
            case 11:
                c.b.Companion c1032b = c.b.INSTANCE;
                return new qlm.e(k29.k.f180430a);
            case 12:
                c.C1033c.Companion bVar = c.C1033c.INSTANCE;
                return new qlm.e(k29.n.f180434a);
            case 13:
                return k29.c.INSTANCE.serializer();
            case 14:
                return new qlm.e(k29.h.f180426a);
            case 15:
                KProperty[] kPropertyArr3 = TravelExperiencesSearchScreen.f93130h0;
                return new RowDelegate(null, null, 7);
            case 16:
                KProperty[] kPropertyArr4 = TravelExperiencesSearchScreen.f93130h0;
                return new RowLoadingDelegate();
            case 17:
                KProperty[] kPropertyArr5 = TravelExperiencesSearchScreen.f93130h0;
                return new ListSubheaderDelegate();
            case 18:
                KProperty[] kPropertyArr6 = TravelExperiencesSearchScreen.f93130h0;
                return new ListSubheaderLoadingDelegate();
            case 19:
                KProperty[] kPropertyArr7 = TravelExperiencesSearchScreen.f93130h0;
                return new FullScreenStateDelegate();
            case 20:
                KProperty[] kPropertyArr8 = RemittanceAmountScreen.p0;
                return new LargeActionButtonDelegate();
            case 21:
                KProperty[] kPropertyArr9 = RemittanceAmountScreen.p0;
                return new CellDetailsDelegate();
            case 22:
                KProperty[] kPropertyArr10 = RemittanceAmountScreen.p0;
                return new CellDetailsActionDelegate();
            case 23:
                KProperty[] kPropertyArr11 = RemittanceAmountScreen.p0;
                return new CellDetailsNoteDelegate();
            case 24:
                KProperty[] kPropertyArr12 = RemittanceAmountScreen.p0;
                return new RowDelegate(null, null, 7);
            case 25:
                KProperty[] kPropertyArr13 = RemittanceAmountScreen.p0;
                return new HighlightTileDelegate();
            case 26:
                KProperty[] kPropertyArr14 = RemittanceAmountScreen.p0;
                return new TextDelegate();
            case 27:
                return Unit.f186387a;
            case 28:
                KProperty[] kPropertyArr15 = CountryOfResidenceRevolutXDisclaimerScreen.S;
                return new k99.g();
            default:
                KProperty[] kPropertyArr16 = PixAuthorisationPaymentInfoScreen.R;
                return new CellDetailsAccountDelegate();
        }
    }
}
