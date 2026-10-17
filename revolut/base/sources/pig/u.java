package pig;

import com.revolut.data.model.Data;
import com.revolut.feature.payees.impl.ui.PayeesFlowType;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f236498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f236499b;

    public /* synthetic */ u(Data data, int i) {
        this.f236498a = i;
        this.f236499b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        switch (this.f236498a) {
            case 0:
                return j.a((j) obj2, this.f236499b, null, null, null, null, null, 0, null, null, null, false, 4093);
            case 1:
                return j.a((j) obj2, null, null, null, this.f236499b, null, null, 0, null, null, null, false, 4079);
            case 2:
                return j.a((j) obj2, null, null, this.f236499b, null, null, null, 0, null, null, null, false, 4087);
            case 3:
                pij.v update = (pij.v) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return pij.v.a(update, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f236499b, null, null, null, 1966079);
            case 4:
                return pij.v.a((pij.v) obj2, null, null, null, this.f236499b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097143);
            case 5:
                return pij.v.a((pij.v) obj2, null, null, null, null, null, null, null, this.f236499b, null, null, null, null, null, null, null, null, null, null, null, null, 2097023);
            case 6:
                Data data2 = this.f236499b;
                pij.v vVar = (pij.v) obj2;
                try {
                    Object content = data2.getContent();
                    data = new Data(content != null ? Boolean.valueOf(((dej.i) content).d) : null, data2.getError(), data2.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data2.getLoading());
                }
                return pij.v.a(vVar, null, null, null, null, null, null, null, null, null, null, null, data, null, null, null, null, null, null, null, null, 2095103);
            case 7:
                return pij.v.a((pij.v) obj2, null, null, null, null, null, null, null, null, null, null, this.f236499b, null, null, null, null, null, null, null, null, null, 2096127);
            case 8:
                return pij.v.a((pij.v) obj2, this.f236499b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097150);
            case 9:
                return pij.v.a((pij.v) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ((List) this.f236499b.getContent()) != null ? Boolean.valueOf(!r0.isEmpty()) : null, null, null, 1835007);
            case 10:
                return pij.v.a((pij.v) obj2, null, null, null, null, null, null, null, null, this.f236499b, null, null, null, null, null, null, null, null, null, null, null, 2096895);
            case 11:
                return pij.v.a((pij.v) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f236499b, null, null, null, null, 2031615);
            case 12:
                return pij.v.a((pij.v) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f236499b, null, null, null, null, null, null, 2080767);
            case 13:
                return pij.v.a((pij.v) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f236499b, null, null, null, null, null, 2064383);
            case 14:
                return pj3.f.a((pj3.f) obj2, this.f236499b, null, null, 6);
            case 15:
                ((pj4.g) obj2).getClass();
                Data dashboardData = this.f236499b;
                Intrinsics.checkNotNullParameter(dashboardData, "dashboardData");
                return new pj4.g(dashboardData);
            case 16:
                return pj9.f.a((pj9.f) obj2, null, this.f236499b, null, 13);
            case 17:
                Data data3 = this.f236499b;
                Intrinsics.h(data3);
                return pk6.e.a((pk6.e) obj2, data3, null, 2);
            case 18:
                ((pk9.f) obj2).getClass();
                Data content2 = this.f236499b;
                Intrinsics.checkNotNullParameter(content2, "content");
                return new pk9.f(content2);
            case 19:
                ((pkh.i) obj2).getClass();
                return new pkh.i(this.f236499b);
            case 20:
                PayeesFlowType flowType = ((pm9.d) obj2).f237484a;
                Intrinsics.checkNotNullParameter(flowType, "flowType");
                Data recipients = this.f236499b;
                Intrinsics.checkNotNullParameter(recipients, "recipients");
                return new pm9.d(flowType, recipients);
            case 21:
                return pmk.k.a((pmk.k) obj2, null, null, null, null, null, null, this.f236499b, 63);
            case 22:
                return pmk.k.a((pmk.k) obj2, null, null, this.f236499b, null, null, null, null, 123);
            case 23:
                return pmk.k.a((pmk.k) obj2, null, null, null, this.f236499b, null, null, null, LDSFile.EF_SOD_TAG);
            case 24:
                return pmk.k.a((pmk.k) obj2, null, null, null, null, this.f236499b, null, null, LDSFile.EF_DG15_TAG);
            case 25:
                return pmk.k.a((pmk.k) obj2, null, null, null, null, null, this.f236499b, null, 95);
            case 26:
                Data data4 = this.f236499b;
                Intrinsics.h(data4);
                return pn6.f.a((pn6.f) obj2, data4, null, 2);
            case 27:
                Data data5 = this.f236499b;
                Intrinsics.h(data5);
                return pn6.f.a((pn6.f) obj2, data5, null, 2);
            case 28:
                ((pnb.c) obj2).getClass();
                Data taxForms = this.f236499b;
                Intrinsics.checkNotNullParameter(taxForms, "taxForms");
                return new pnb.c(taxForms);
            default:
                return pnh.j.a((pnh.j) obj2, null, this.f236499b, null, null, null, null, null, null, 1019);
        }
    }
}
