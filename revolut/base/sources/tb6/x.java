package tb6;

import com.revolut.data.model.Data;
import com.revolut.feature.tickets.api.extensions.TicketsWidgetContract$State;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f269501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f269502b;

    public /* synthetic */ x(Data data, int i) {
        this.f269501a = i;
        this.f269502b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        TicketsWidgetContract$State ticketsWidgetContract$State;
        switch (this.f269501a) {
            case 0:
                return m.a((m) obj2, null, null, null, null, null, null, this.f269502b, null, null, null, false, false, false, null, 16319);
            case 1:
                Data data = this.f269502b;
                Intrinsics.h(data);
                return m.a((m) obj2, data, null, null, null, null, null, null, null, null, null, false, false, false, null, 16382);
            case 2:
                return tch.q.a((tch.q) obj2, this.f269502b, null, null, null, 14);
            case 3:
                return tch.q.a((tch.q) obj2, null, this.f269502b, null, null, 13);
            case 4:
                return tch.q.a((tch.q) obj2, null, null, null, this.f269502b, 7);
            case 5:
                ((thh.a) obj2).getClass();
                return new thh.a(this.f269502b);
            case 6:
                Data repaymentWithPlan = this.f269502b;
                Intrinsics.h(repaymentWithPlan);
                ((tk9.d) obj2).getClass();
                Intrinsics.checkNotNullParameter(repaymentWithPlan, "repaymentWithPlan");
                return new tk9.d(repaymentWithPlan);
            case 7:
                ((tl6.e) obj2).getClass();
                Data inactiveConsents = this.f269502b;
                Intrinsics.checkNotNullParameter(inactiveConsents, "inactiveConsents");
                return new tl6.e(inactiveConsents);
            case 8:
                kl7.g documentType = ((tn7.d) obj2).f272322b;
                Data documentDelivery = this.f269502b;
                Intrinsics.checkNotNullParameter(documentDelivery, "documentDelivery");
                Intrinsics.checkNotNullParameter(documentType, "documentType");
                return new tn7.d(documentDelivery, documentType);
            case 9:
                return tna.k.a((tna.k) obj2, this.f269502b, null, null, 14);
            case 10:
                return to2.f.a((to2.f) obj2, this.f269502b);
            case 11:
                ((tob.e) obj2).getClass();
                Data riskConfigData = this.f269502b;
                Intrinsics.checkNotNullParameter(riskConfigData, "riskConfigData");
                return new tob.e(riskConfigData);
            case 12:
                return tph.f.a((tph.f) obj2, null, this.f269502b, null, 5);
            case 13:
                return tph.f.a((tph.f) obj2, null, null, this.f269502b, 3);
            case 14:
                ((tqc.c) obj2).getClass();
                Data disputeData = this.f269502b;
                Intrinsics.checkNotNullParameter(disputeData, "disputeData");
                return new tqc.c(disputeData);
            case 15:
                return tqh.c.a((tqh.c) obj2, this.f269502b, null, false, 1019);
            case 16:
                return tqh.c.a((tqh.c) obj2, null, this.f269502b, false, 1015);
            case 17:
                ((tr4.g) obj2).getClass();
                Data model = this.f269502b;
                Intrinsics.checkNotNullParameter(model, "model");
                return new tr4.g(model);
            case 18:
                ((tre.e) obj2).getClass();
                Data content = this.f269502b;
                Intrinsics.checkNotNullParameter(content, "content");
                return new tre.e(content);
            case 19:
                return ts1.b.a((ts1.b) obj2, this.f269502b, false, 2);
            case 20:
                Data data2 = this.f269502b;
                Data data3 = (Data) obj2;
                try {
                    Object content2 = data2.getContent();
                    if (content2 != null) {
                        Map map = (Map) content2;
                        TicketsWidgetContract$State ticketsWidgetContract$State2 = (TicketsWidgetContract$State) data3.getContent();
                        String str = ticketsWidgetContract$State2 != null ? ticketsWidgetContract$State2.f90445b : null;
                        TicketsWidgetContract$State ticketsWidgetContract$State3 = (TicketsWidgetContract$State) data3.getContent();
                        ticketsWidgetContract$State = new TicketsWidgetContract$State(map, str, ticketsWidgetContract$State3 != null ? ticketsWidgetContract$State3.f90446c : null);
                    } else {
                        ticketsWidgetContract$State = null;
                    }
                    return new Data(ticketsWidgetContract$State, data2.getError(), data2.getLoading());
                } catch (Throwable th10) {
                    return new Data(null, th10, data2.getLoading());
                }
            case 21:
                ((tt4.g) obj2).getClass();
                Data content3 = this.f269502b;
                Intrinsics.checkNotNullParameter(content3, "content");
                return new tt4.g(content3);
            case 22:
                return tt7.i.a((tt7.i) obj2, this.f269502b, null, 2);
            case 23:
                return tt7.i.a((tt7.i) obj2, null, (hha.d) this.f269502b.getContent(), 1);
            case 24:
                return ttl.g.a((ttl.g) obj2, null, null, this.f269502b, 3);
            case 25:
                return tuc.f.a((tuc.f) obj2, this.f269502b, null, 27);
            case 26:
                return tuc.f.a((tuc.f) obj2, null, (do3.n) this.f269502b.getContent(), 15);
            case 27:
                Data instrumentDetails = this.f269502b;
                Intrinsics.h(instrumentDetails);
                nel.n instrument = ((tuk.f) obj2).f274625a;
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                Intrinsics.checkNotNullParameter(instrumentDetails, "instrumentDetails");
                return new tuk.f(instrument, instrumentDetails);
            case 28:
                return tv4.e.a((tv4.e) obj2, this.f269502b, null, 2);
            default:
                return tv4.e.a((tv4.e) obj2, null, this.f269502b, 1);
        }
    }
}
