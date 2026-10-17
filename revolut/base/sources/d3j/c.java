package d3j;

import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty;
import com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings;
import com.revolut.feature.transfer.core.models.CountryProfile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f5j.a f111213b;

    public /* synthetic */ c(d dVar, f5j.a aVar) {
        this.f111212a = 0;
        this.f111213b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Collection collection;
        int i = this.f111212a;
        f5j.a aVar = this.f111213b;
        Object obj3 = null;
        switch (i) {
            case 0:
                List recipientSettings = (List) obj2;
                Intrinsics.checkNotNullParameter(recipientSettings, "recipientSettings");
                Iterator it8 = recipientSettings.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        Object next = it8.next();
                        if (Intrinsics.f(((RecipientPaymentsSettings) next).f79672a, aVar.f132329a)) {
                            obj3 = next;
                        }
                    }
                }
                RecipientPaymentsSettings recipientPaymentsSettings = (RecipientPaymentsSettings) obj3;
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
            case 1:
                return fhf.e.a((fhf.e) obj2, null, aVar, 13);
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                Map map = (Map) pair.f186386b;
                ArrayList<MoneyRequest> arrayList = new ArrayList();
                for (Object obj4 : list) {
                    MoneyRequest moneyRequest = (MoneyRequest) obj4;
                    MoneyRequestCounterParty moneyRequestCounterParty = moneyRequest.k;
                    if (Intrinsics.f(moneyRequestCounterParty != null ? moneyRequestCounterParty.getF60343a() : null, aVar.f132329a) || Intrinsics.f(moneyRequest.f60320l.getF60343a(), aVar.f132329a)) {
                        arrayList.add(obj4);
                    }
                }
                ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                for (MoneyRequest moneyRequest2 : arrayList) {
                    Set set = dv9.b.f118061a;
                    arrayList2.add(dv9.b.a(moneyRequest2, null, (CountryProfile) map.get(moneyRequest2.f60323p)));
                }
                return arrayList2;
        }
    }

    public /* synthetic */ c(f5j.a aVar, int i) {
        this.f111212a = i;
        this.f111213b = aVar;
    }
}
