package oz1;

import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty;
import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f231113a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ApmRecipient f231114b;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        Collection collection;
        List recipientSettings = (List) obj2;
        switch (this.f231113a) {
            case 0:
                Intrinsics.checkNotNullParameter(recipientSettings, "recipientSettings");
                Iterator it8 = recipientSettings.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((RecipientPaymentsSettings) next).f79672a, this.f231114b.getF62147a().getF62112a())) {
                        }
                    } else {
                        next = null;
                    }
                }
                RecipientPaymentsSettings recipientPaymentsSettings = (RecipientPaymentsSettings) next;
                if (recipientPaymentsSettings == null || (collection = recipientPaymentsSettings.f79674c) == null) {
                    collection = f0.f322471a;
                }
                RecipientPaymentsSettings.INSTANCE.getClass();
                RecipientPaymentsSettings.Setting settingA = RecipientPaymentsSettings.Companion.a();
                ArrayList arrayListF1 = d0.f1(collection);
                Collection collection2 = collection;
                if ((collection2 instanceof Collection) && collection2.isEmpty()) {
                    arrayListF1.add(settingA);
                } else {
                    Iterator it9 = collection2.iterator();
                    while (it9.hasNext()) {
                        if (((RecipientPaymentsSettings.Setting) it9.next()).f79675a == settingA.f79675a) {
                        }
                    }
                    arrayListF1.add(settingA);
                }
                return arrayListF1;
            default:
                Intrinsics.checkNotNullParameter(recipientSettings, "list");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : recipientSettings) {
                    MoneyRequest moneyRequest = (MoneyRequest) obj3;
                    MoneyRequestCounterParty moneyRequestCounterParty = moneyRequest.k;
                    String f60343a = moneyRequestCounterParty != null ? moneyRequestCounterParty.getF60343a() : null;
                    ApmRecipient apmRecipient = this.f231114b;
                    if (Intrinsics.f(f60343a, apmRecipient.getF62147a().getF62112a()) || Intrinsics.f(moneyRequest.f60320l.getF60343a(), apmRecipient.getF62147a().getF62112a())) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
        }
    }
}
