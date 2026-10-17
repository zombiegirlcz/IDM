package m58;

import com.revolut.data.model.Data;
import com.revolut.feature.staking.api.model.StakingProduct;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m9d.z;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f202866b;

    public /* synthetic */ l(Data data, int i) {
        this.f202865a = i;
        this.f202866b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f202865a) {
            case 0:
                return a.a((a) obj2, null, null, this.f202866b, null, 11);
            case 1:
                return a.a((a) obj2, null, this.f202866b, null, null, 13);
            case 2:
                return a.a((a) obj2, this.f202866b, null, null, null, 14);
            case 3:
                return a.a((a) obj2, null, null, null, this.f202866b, 7);
            case 4:
                return m5e.h.c((m5e.h) obj2, null, null, null, null, null, null, null, null, null, null, null, null, this.f202866b, null, null, 28671);
            case 5:
                return m5e.h.c((m5e.h) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f202866b, null, 24575);
            case 6:
                return m5e.h.c((m5e.h) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f202866b, 16383);
            case 7:
                Data refinancedCreditsList = this.f202866b;
                Intrinsics.h(refinancedCreditsList);
                ((m75.f) obj2).getClass();
                Intrinsics.checkNotNullParameter(refinancedCreditsList, "refinancedCreditsList");
                return new m75.f(refinancedCreditsList);
            case 8:
                Data data = this.f202866b;
                Intrinsics.h(data);
                return new m8c.k(data);
            case 9:
                return m8d.m.a((m8d.m) obj2, null, null, this.f202866b, null, 55);
            case 10:
                return m8d.m.a((m8d.m) obj2, null, null, null, this.f202866b, 47);
            case 11:
                Data data2 = this.f202866b;
                Intrinsics.h(data2);
                return z.a((z) obj2, null, null, null, null, null, null, null, null, null, null, null, false, false, null, data2, null, false, 229375);
            case 12:
                return z.a((z) obj2, null, null, null, null, null, null, null, null, null, this.f202866b, null, false, false, null, null, null, false, 261631);
            case 13:
                return z.a((z) obj2, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, this.f202866b, false, 196607);
            case 14:
                return z.a((z) obj2, null, null, null, null, null, null, null, null, null, null, null, false, false, this.f202866b, null, null, false, 253951);
            case 15:
                return z.a((z) obj2, null, null, null, this.f202866b, null, null, null, null, null, null, null, false, false, null, null, null, false, 262135);
            case 16:
                return z.a((z) obj2, null, this.f202866b, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 262141);
            case 17:
                return z.a((z) obj2, null, null, null, null, null, null, null, null, null, null, this.f202866b, false, false, null, null, null, false, 261119);
            case 18:
                return z.a((z) obj2, null, null, this.f202866b, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 262139);
            case 19:
                return z.a((z) obj2, null, null, null, null, null, null, null, null, null, this.f202866b, null, false, false, null, null, null, false, 261631);
            case 20:
                return m9j.h.a((m9j.h) obj2, null, (Boolean) this.f202866b.getContent(), null, false, null, null, null, 507);
            case 21:
                return m9j.h.a((m9j.h) obj2, (StakingProduct) this.f202866b.getContent(), null, null, false, null, null, null, 509);
            case 22:
                return m9j.h.a((m9j.h) obj2, null, null, this.f202866b, false, null, null, null, 503);
            case 23:
                return m9j.h.a((m9j.h) obj2, null, null, null, false, null, null, this.f202866b, 255);
            case 24:
                return ma.g.a((ma.g) obj2, this.f202866b, null, 2);
            case 25:
                Data donationSchedule = this.f202866b;
                Intrinsics.h(donationSchedule);
                ((mc6.f) obj2).getClass();
                Intrinsics.checkNotNullParameter(donationSchedule, "donationSchedule");
                return new mc6.f(donationSchedule);
            case 26:
                Data data3 = this.f202866b;
                Intrinsics.h(data3);
                return mcg.f.a((mcg.f) obj2, data3, null, 2);
            case 27:
                return mcg.f.a((mcg.f) obj2, null, this.f202866b, 1);
            case 28:
                ((md8.c) obj2).getClass();
                Data juniorFirstName = this.f202866b;
                Intrinsics.checkNotNullParameter(juniorFirstName, "juniorFirstName");
                return new md8.c(juniorFirstName);
            default:
                md9.e update = (md9.e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return md9.e.a(update, this.f202866b, false, 2);
        }
    }
}
