package j96;

import com.revolut.feature.direct_deposit.impl.model.DepositAmount;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f172302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f172303b;

    public /* synthetic */ j(double d, int i) {
        this.f172302a = i;
        this.f172303b = d;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f172302a) {
            case 0:
                a update = (a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                double d = this.f172303b;
                return a.a(update, null, d >= 100.0d ? DepositAmount.EntirePaycheck.f71945a : new DepositAmount.PercentageOfPaycheck(d), null, 5);
            case 1:
                uid.a update2 = (uid.a) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return uid.a.a(update2, Double.valueOf(this.f172303b), 30);
            default:
                xid.c update3 = (xid.c) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return xid.c.a(update3, null, null, Double.valueOf(this.f172303b), null, 0L, 55);
        }
    }
}
