package kye;

import aw0.m6;
import aw0.n6;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import com.revolut.feature.topup_screen.impl.mcy.india_topup_declaration.IndiaTopupDeclarationScreen;
import ip0.gu;
import ip0.s7;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class m0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190791a;

    public /* synthetic */ m0(int i) {
        this.f190791a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        aue.a aVar;
        switch (this.f190791a) {
            case 0:
                m it8 = (m) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.d;
            case 1:
                m it9 = (m) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.f190786s;
            case 2:
                m it10 = (m) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.f190786s;
            case 3:
                return m.a((m) obj2, false, null, null, null, null, null, null, null, null, true, null, null, false, null, null, null, null, null, null, null, false, false, null, false, null, false, false, null, null, null, null, null, null, null, null, null, -268435970, 63);
            case 4:
                return m.a((m) obj2, false, null, null, null, null, null, null, null, null, true, null, null, false, null, null, null, null, null, null, null, false, false, null, false, null, false, false, null, null, null, null, null, null, null, null, null, -268435970, 63);
            case 5:
                return m.a((m) obj2, false, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, false, null, false, null, false, true, null, null, null, null, null, null, null, null, null, -268435969, 63);
            case 6:
                return m.a((m) obj2, true, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, false, null, false, null, false, true, null, null, null, null, null, null, null, null, null, -268435970, 63);
            case 7:
                return m.a((m) obj2, true, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, false, null, false, null, false, true, null, null, null, null, null, null, null, null, null, -268435458, 63);
            case 8:
                return ((m) obj2).f190775b;
            case 9:
                return m.a((m) obj2, false, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, false, null, false, null, false, false, null, null, null, null, null, null, null, null, null, -1, 59);
            case 10:
                return m.a((m) obj2, false, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, false, null, false, null, false, false, null, null, null, null, null, zhm.f0.f322471a, null, null, null, -1, 59);
            case 11:
                return m.a((m) obj2, false, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, false, null, false, null, false, false, null, null, null, null, null, null, null, null, null, -134217729, 63);
            case 12:
                return ((m) obj2).f190786s;
            case 13:
                return m.a((m) obj2, false, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, false, null, false, null, false, false, null, null, null, null, null, null, null, null, null, Integer.MAX_VALUE, 63);
            case 14:
                return m.a((m) obj2, false, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, false, null, false, null, false, false, null, null, null, null, null, null, null, null, null, -524289, 63);
            case 15:
                return ((m) obj2).d;
            case 16:
                m mVar = (m) obj2;
                aue.a aVar2 = mVar.C;
                if (aVar2 != null) {
                    dj0.d remainingLimitInTopUpCurrency = aVar2.d;
                    aue.c type = aVar2.f9803a;
                    dj0.d totalLimit = aVar2.f9804b;
                    dj0.d usedLimit = aVar2.f9805c;
                    Intrinsics.checkNotNullParameter(type, "type");
                    Intrinsics.checkNotNullParameter(totalLimit, "totalLimit");
                    Intrinsics.checkNotNullParameter(usedLimit, "usedLimit");
                    Intrinsics.checkNotNullParameter(remainingLimitInTopUpCurrency, "remainingLimit");
                    Intrinsics.checkNotNullParameter(remainingLimitInTopUpCurrency, "remainingLimitInTopUpCurrency");
                    aVar = new aue.a(type, totalLimit, usedLimit, remainingLimitInTopUpCurrency, remainingLimitInTopUpCurrency);
                } else {
                    aVar = null;
                }
                return m.a(mVar, false, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, false, null, false, null, false, false, aVar, null, null, null, null, null, null, null, null, -536870913, 63);
            case 17:
                return m.a((m) obj2, false, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, false, null, false, null, false, false, null, null, null, null, null, null, null, null, null, -536870913, 63);
            case 18:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                s7 s7Var = new s7("CURRENT_PROGRESS_ITEM_ID", 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var, 0, 0, 0, 0, null, false, 63);
                ArrayList arrayListE0 = zhm.d0.E0(yp0.b.h(iii.c.c(3), new gu("HOW_TO_GET_POINTS_HEADER_ID", 0, 0, 30), null, 0, 126), zhm.u.c(s7Var));
                lw0.h hVar = new lw0.h(lw0.i.AVATAR);
                n6.Companion.getClass();
                return new cii.b(new aw0.e(false, null, null, m6.a(), null, null, 55), arrayListE0, hVar);
            case 19:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return zhm.d0.P0(zhm.d0.E0((List) pair.f186386b, (List) pair.f186385a), new l0a.e());
            case 20:
                CardOwner content = (CardOwner) obj2;
                Intrinsics.checkNotNullParameter(content, "content");
                return new ChatTransferRecipient.CardRecipient(content);
            case 21:
                ba6.l content2 = (ba6.l) obj2;
                Intrinsics.checkNotNullParameter(content2, "content");
                return new ChatTransferRecipient.CharityRecipient(content2);
            case 22:
                ApmRecipient apmContact = (ApmRecipient) obj2;
                Intrinsics.checkNotNullParameter(apmContact, "apmContact");
                return efm.r.just(new ChatTransferRecipient.ApmTransferRecipient(apmContact));
            case 23:
                PaymentCounterpartyInfo counterpartyRecipient = (PaymentCounterpartyInfo) obj2;
                Intrinsics.checkNotNullParameter(counterpartyRecipient, "counterpartyRecipient");
                return new ChatTransferRecipient.PaymentCounterpartyRecipient(counterpartyRecipient);
            case 24:
                Throwable it11 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return new Data(null, it11, false, 5, null);
            case 25:
                l0c.j update = (l0c.j) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return l0c.j.a(update, null, null, true, 3);
            case 26:
                File file = (File) obj2;
                Intrinsics.checkNotNullParameter(file, "file");
                return new l0c.o(file);
            case 27:
                File file2 = (File) obj2;
                Intrinsics.checkNotNullParameter(file2, "file");
                return new l0c.p(file2);
            case 28:
                InputDisclosureDelegate.Model model = (InputDisclosureDelegate.Model) obj2;
                KProperty[] kPropertyArr = IndiaTopupDeclarationScreen.Q;
                Intrinsics.checkNotNullParameter(model, "model");
                return Boolean.valueOf(Intrinsics.f(model.f52539a, "EXCHANGED_AMOUNT_WITHIN_THRESHOLD"));
            default:
                InputDisclosureDelegate.Model model2 = (InputDisclosureDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = IndiaTopupDeclarationScreen.Q;
                Intrinsics.checkNotNullParameter(model2, "model");
                return Boolean.valueOf(Intrinsics.f(model2.f52539a, "EXCHANGED_AMOUNT_MORE_THAN_THRESHOLD"));
        }
    }
}
