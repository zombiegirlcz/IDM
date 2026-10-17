package b4b;

import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f12217b;

    public /* synthetic */ d0(Data data, int i) {
        this.f12216a = i;
        this.f12217b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        LinkedHashSet linkedHashSet;
        switch (this.f12216a) {
            case 0:
                return n.a((n) obj2, null, null, this.f12217b, null, null, null, null, null, null, false, null, null, 8183);
            case 1:
                b4c.k kVar = (b4c.k) obj2;
                Long l2 = (Long) this.f12217b.getContent();
                return b4c.k.a(kVar, l2 != null ? l2.longValue() : 0L, null, null, null, null, null, 62);
            case 2:
                return b4c.k.a((b4c.k) obj2, 0L, null, null, this.f12217b, null, null, 55);
            case 3:
                ((b2b.d) obj2).getClass();
                return new b2b.d(this.f12217b);
            case 4:
                return b5e.i.a((b5e.i) obj2, null, null, null, this.f12217b, 15);
            case 5:
                return b5e.i.a((b5e.i) obj2, null, this.f12217b, null, null, 27);
            case 6:
                return b5e.i.a((b5e.i) obj2, null, null, this.f12217b, null, 23);
            case 7:
                ((b7f.c) obj2).getClass();
                Data riskMetrics = this.f12217b;
                Intrinsics.checkNotNullParameter(riskMetrics, "riskMetrics");
                return new b7f.c(riskMetrics);
            case 8:
                b85.f fVar = (b85.f) obj2;
                LoanDetails loan = fVar.f13096a;
                q35.e0 repayment = fVar.f13097b;
                String userId = fVar.f13098c;
                Intrinsics.checkNotNullParameter(loan, "loan");
                Intrinsics.checkNotNullParameter(repayment, "repayment");
                Intrinsics.checkNotNullParameter(userId, "userId");
                Data sepaAccount = this.f12217b;
                Intrinsics.checkNotNullParameter(sepaAccount, "sepaAccount");
                return new b85.f(loan, repayment, userId, sepaAccount);
            case 9:
                b8d.m updateState = (b8d.m) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return b8d.m.a(updateState, this.f12217b, null, null, null, null, false, 126);
            case 10:
                return b8e.i.a((b8e.i) obj2, this.f12217b, null, 2);
            case 11:
                return b8e.i.a((b8e.i) obj2, null, this.f12217b, 1);
            case 12:
                return b8f.h.a((b8f.h) obj2, this.f12217b, null, 6);
            case 13:
                return b8f.h.a((b8f.h) obj2, null, this.f12217b, 5);
            case 14:
                return b9c.e.a((b9c.e) obj2, null, null, null, this.f12217b, 15);
            case 15:
                return ba7.g.a((ba7.g) obj2, null, this.f12217b, 7);
            case 16:
                return ba7.g.a((ba7.g) obj2, this.f12217b, null, 11);
            case 17:
                Data data2 = this.f12217b;
                Intrinsics.h(data2);
                return bai.i.a((bai.i) obj2, data2, null, 2);
            case 18:
                return bb2.j.a((bb2.j) obj2, null, this.f12217b, 1);
            case 19:
                return bb2.j.a((bb2.j) obj2, this.f12217b, null, 2);
            case 20:
                Data data3 = this.f12217b;
                bb8.f fVar2 = (bb8.f) obj2;
                try {
                    Object content = data3.getContent();
                    if (content != null) {
                        linkedHashSet = new LinkedHashSet();
                        Iterator it8 = ((List) content).iterator();
                        while (it8.hasNext()) {
                            linkedHashSet.add(tz4.d.m((com.revolut.feature.junior_profile.api.models.a) it8.next()));
                        }
                    } else {
                        linkedHashSet = null;
                    }
                    data = new Data(linkedHashSet, data3.getError(), data3.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data3.getLoading());
                }
                return bb8.f.a(fVar2, data, null, null, false, 14);
            case 21:
                String str = ((bba.d) obj2).f14201b;
                Data beneficiaries = this.f12217b;
                Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
                return new bba.d(beneficiaries, str);
            case 22:
                return bbg.j.a((bbg.j) obj2, null, null, null, this.f12217b, null, null, null, null, null, null, 2039);
            case 23:
                return bbg.j.a((bbg.j) obj2, null, null, null, null, this.f12217b, null, null, null, null, null, 2031);
            case 24:
                return bbg.j.a((bbg.j) obj2, null, null, null, null, null, this.f12217b, null, null, null, null, YearClass.CLASS_2015);
            case 25:
                return bbg.j.a((bbg.j) obj2, null, null, null, null, null, null, null, this.f12217b, null, null, 1791);
            case 26:
                Data data4 = this.f12217b;
                Intrinsics.h(data4);
                return bbg.j.a((bbg.j) obj2, null, null, null, null, null, null, null, null, null, data4, 1023);
            case 27:
                Data data5 = this.f12217b;
                Intrinsics.h(data5);
                return bbg.j.a((bbg.j) obj2, null, null, null, null, null, null, null, null, data5, null, 1535);
            case 28:
                return bcj.d.a((bcj.d) obj2, null, null, this.f12217b, 3);
            default:
                Data data6 = this.f12217b;
                Intrinsics.h(data6);
                return be3.f.a((be3.f) obj2, 0L, false, data6, null, 23);
        }
    }
}
