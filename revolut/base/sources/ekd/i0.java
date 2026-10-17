package ekd;

import adk.i1;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.internal.views.chat.ChatParentLayout;
import com.revolut.core.ui_kit.internal.views.chat.ChatSwipeToReplyLayout;
import com.revolut.feature.credit.card.impl.ui.repay.choose_payments.CreditCardChoosePaymentsScreen;
import com.revolut.feature.username.ui.UsernameScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.EsimMobilePlanPacNumberTransferConfirmationScreen;
import es7.b;
import es7.e;
import es7.g;
import es7.i;
import et0.l;
import java.lang.annotation.Annotation;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import qlm.d1;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f127006a;

    public /* synthetic */ i0(int i) {
        this.f127006a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f127006a) {
            case 0:
                return j1.a("com.revolut.feature.slot_manager.api.model.suggestion.SlotSuggestedForYouTile.Style.Theme", l0.values(), new String[]{null, null, null}, new Annotation[][]{new Annotation[]{new i1(new String[]{"LIGHT", "light"}, 3)}, new Annotation[]{new i1(new String[]{"DARK", "dark"}, 3)}, new Annotation[]{new i1(new String[]{"TRANSPARENT", "transparent"}, 3)}});
            case 1:
                KProperty[] kPropertyArr = EsimMobilePlanPacNumberTransferConfirmationScreen.S;
                return new InputTextDelegate(null);
            case 2:
                KProperty[] kPropertyArr2 = EsimMobilePlanPacNumberTransferConfirmationScreen.S;
                return new TextDelegate();
            case 3:
                return new TwinHorizontalButtonDelegate();
            case 4:
                KProperty[] kPropertyArr3 = UsernameScreen.f94688e0;
                return new InputTextDelegate(null);
            case 5:
                KProperty[] kPropertyArr4 = UsernameScreen.f94688e0;
                return new SuggestionsBarDelegate();
            case 6:
                KProperty[] kPropertyArr5 = UsernameScreen.f94688e0;
                return new LargeActionButtonDelegate();
            case 7:
                return new CellDetailsDelegate();
            case 8:
                return new CellDetailsActionDelegate();
            case 9:
                return new FullScreenStateDelegate();
            case 10:
                return vkm.q.b(1, 1, ukm.f.DROP_OLDEST);
            case 11:
                return new LinkedHashSet();
            case 12:
                return hlm.d.a();
            case 13:
                return j1.b("com.revolut.feature.salary_switch.impl.models.dto.salary_switch.AccountBodyRequestDto.AccountType", eqc.b.values());
            case 14:
                return j1.b("com.revolut.feature.salary_switch.impl.models.dto.salary_switch.SalarySwitchPreviewDto.AccountType", eqc.f.values());
            case 15:
                return es7.b.INSTANCE.serializer();
            case 16:
                b.Companion companion = es7.b.INSTANCE;
                kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
                return new mlm.f("com.revolut.feature.insurance_credit.impl.data.dto.contacts.ContactsLayoutDto.ClaimUrlDto", p0Var.b(es7.b.class), new KClass[]{p0Var.b(b.C0748b.class), p0Var.b(b.c.class)}, new KSerializer[]{b.C0748b.a.f128879a, new d1("UNKNOWN", b.c.INSTANCE, new Annotation[]{new es7.c()})}, new Annotation[]{new es7.c()});
            case 17:
                return new d1("UNKNOWN", b.c.INSTANCE, new Annotation[]{new es7.c()});
            case 18:
                e.Companion companion2 = es7.e.INSTANCE;
                return new qlm.e(g.a.f128889a);
            case 19:
                g.b bVar = es7.g.Companion;
                return new qlm.e(es7.h.f128890a);
            case 20:
                return es7.i.INSTANCE.serializer();
            case 21:
                i.Companion companion3 = es7.i.INSTANCE;
                kotlin.jvm.internal.p0 p0Var2 = kotlin.jvm.internal.o0.f186429a;
                return new mlm.f("com.revolut.feature.insurance_credit.impl.data.dto.contacts.ContactsSectionDto.ContactDto.ActionDto", p0Var2.b(es7.i.class), new KClass[]{p0Var2.b(i.b.class), p0Var2.b(i.c.class), p0Var2.b(i.d.class), p0Var2.b(i.e.class)}, new KSerializer[]{i.b.a.f128893a, i.c.a.f128895a, i.d.a.f128897a, new d1("UNKNOWN", i.e.INSTANCE, new Annotation[]{new es7.j()})}, new Annotation[]{new es7.j()});
            case 22:
                return new d1("UNKNOWN", i.e.INSTANCE, new Annotation[]{new es7.j()});
            case 23:
                l.a aVar = et0.l.Companion;
                return Unit.f186387a;
            case 24:
                int i = ChatParentLayout.f56823n;
                return Unit.f186387a;
            case 25:
                int i2 = ChatParentLayout.f56823n;
                return Unit.f186387a;
            case 26:
                int i3 = ChatParentLayout.f56823n;
                return Unit.f186387a;
            case 27:
                int i5 = ChatSwipeToReplyLayout.f56837x;
                return Unit.f186387a;
            case 28:
                KProperty[] kPropertyArr6 = CreditCardChoosePaymentsScreen.S;
                return new ProductSelectionDelegate();
            default:
                KProperty[] kPropertyArr7 = CreditCardChoosePaymentsScreen.S;
                return new FullScreenStateDelegate();
        }
    }
}
