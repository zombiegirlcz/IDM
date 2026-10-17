package e69;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f122941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f122942b;

    public f() {
        this(0);
    }

    public static f a(f fVar, Data paymentAuthorisation, Data fundingSource, int i) {
        if ((i & 1) != 0) {
            paymentAuthorisation = fVar.f122941a;
        }
        if ((i & 2) != 0) {
            fundingSource = fVar.f122942b;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(paymentAuthorisation, "paymentAuthorisation");
        Intrinsics.checkNotNullParameter(fundingSource, "fundingSource");
        return new f(paymentAuthorisation, fundingSource);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f122941a, fVar.f122941a) && Intrinsics.f(this.f122942b, fVar.f122942b);
    }

    public final int hashCode() {
        return this.f122942b.hashCode() + (this.f122941a.hashCode() * 31);
    }

    public f(Data paymentAuthorisation, Data fundingSource) {
        Intrinsics.checkNotNullParameter(paymentAuthorisation, "paymentAuthorisation");
        Intrinsics.checkNotNullParameter(fundingSource, "fundingSource");
        this.f122941a = paymentAuthorisation;
        this.f122942b = fundingSource;
    }

    public /* synthetic */ f(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }
}
