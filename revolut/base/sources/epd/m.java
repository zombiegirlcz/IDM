package epd;

import com.revolut.data.model.Data;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawLimits;
import eq5.r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f128174b;

    public /* synthetic */ m(Data data, int i) {
        this.f128173a = i;
        this.f128174b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f128173a) {
            case 0:
                return b.a((b) obj2, this.f128174b);
            case 1:
                return r.a((r) obj2, null, null, null, null, null, null, null, null, null, false, null, this.f128174b, null, null, null, 1015807);
            case 2:
                return r.a((r) obj2, null, null, null, null, null, null, null, null, null, false, this.f128174b, null, null, null, null, 1044479);
            case 3:
                return r.a((r) obj2, null, null, null, null, this.f128174b, null, null, null, null, false, null, null, null, null, null, 1048511);
            case 4:
                r rVar = (r) obj2;
                yhm.r rVar2 = (yhm.r) this.f128174b.getContent();
                return r.a(rVar, null, null, null, null, null, null, null, null, null, false, null, null, null, rVar2 != null ? (CryptoWithdrawLimits) rVar2.f314202b : null, null, 917503);
            case 5:
                return r.a((r) obj2, null, null, null, null, null, null, null, null, null, false, null, null, this.f128174b, null, null, 983039);
            case 6:
                return r.a((r) obj2, null, null, null, null, null, null, null, null, this.f128174b, false, null, null, null, null, null, 1047551);
            case 7:
                eqd.a config = ((eqd.b) obj2).f128433a;
                Intrinsics.checkNotNullParameter(config, "config");
                return new eqd.b(config, this.f128174b);
            case 8:
                return eqh.f.a((eqh.f) obj2, null, this.f128174b, 1);
            case 9:
                hjl.d updateState = (hjl.d) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                updateState.getClass();
                Data socialAccountsData = this.f128174b;
                Intrinsics.checkNotNullParameter(socialAccountsData, "socialAccountsData");
                return new hjl.d(socialAccountsData);
            case 10:
                hjl.d updateState2 = (hjl.d) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                updateState2.getClass();
                Data socialAccountsData2 = this.f128174b;
                Intrinsics.checkNotNullParameter(socialAccountsData2, "socialAccountsData");
                return new hjl.d(socialAccountsData2);
            case 11:
                return esa.d.a((esa.d) obj2, null, null, this.f128174b, null, 11);
            case 12:
                return esa.d.a((esa.d) obj2, null, this.f128174b, null, null, 13);
            case 13:
                ((eu4.n) obj2).getClass();
                Data content = this.f128174b;
                Intrinsics.checkNotNullParameter(content, "content");
                return new eu4.n(content);
            case 14:
                return euj.g.a((euj.g) obj2, this.f128174b, 2);
            case 15:
                return ev4.g.a((ev4.g) obj2, null, this.f128174b, 1);
            case 16:
                return ev7.e.a((ev7.e) obj2, this.f128174b, null, null, 6);
            case 17:
                return ev7.e.a((ev7.e) obj2, null, this.f128174b, null, 5);
            case 18:
                return ev7.e.a((ev7.e) obj2, null, null, this.f128174b, 3);
            case 19:
                ((ew4.h) obj2).getClass();
                Data content2 = this.f128174b;
                Intrinsics.checkNotNullParameter(content2, "content");
                return new ew4.h(content2);
            case 20:
                return ewh.f.a((ewh.f) obj2, this.f128174b, null, 2);
            case 21:
                return ewh.f.a((ewh.f) obj2, null, this.f128174b, 1);
            case 22:
                Data data = this.f128174b;
                Intrinsics.h(data);
                return eyc.n.a((eyc.n) obj2, data, 5);
            case 23:
                return ezb.g.a((ezb.g) obj2, null, this.f128174b, 1);
            case 24:
                return f0e.a.a((f0e.a) obj2, this.f128174b, null, 6);
            case 25:
                return f1c.l.a((f1c.l) obj2, this.f128174b, null, null, 6);
            case 26:
                Data data2 = this.f128174b;
                Intrinsics.h(data2);
                return f2c.h.a((f2c.h) obj2, 0, null, null, data2, null, 23);
            case 27:
                Data data3 = this.f128174b;
                Intrinsics.h(data3);
                return f2c.h.a((f2c.h) obj2, 0, null, null, null, data3, 15);
            case 28:
                ((f5g.f) obj2).getClass();
                Data bookings = this.f128174b;
                Intrinsics.checkNotNullParameter(bookings, "bookings");
                return new f5g.f(bookings);
            default:
                ((f96.a) obj2).getClass();
                Data bankAccount = this.f128174b;
                Intrinsics.checkNotNullParameter(bankAccount, "bankAccount");
                return new f96.a(bankAccount);
        }
    }
}
