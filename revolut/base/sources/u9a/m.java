package u9a;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f278432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f278433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f278434c;
    public final dj0.d d;

    public m(Data paymentData, Data transactionsContent, boolean z, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        this.f278432a = paymentData;
        this.f278433b = transactionsContent;
        this.f278434c = z;
        this.d = dVar;
    }

    public static m a(m mVar, Data paymentData, boolean z, int i) {
        Data transactionsContent = mVar.f278433b;
        if ((i & 4) != 0) {
            z = mVar.f278434c;
        }
        dj0.d dVar = mVar.d;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        return new m(paymentData, transactionsContent, z, dVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f278432a, mVar.f278432a) && Intrinsics.f(this.f278433b, mVar.f278433b) && this.f278434c == mVar.f278434c && Intrinsics.f(this.d, mVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(kii.e.c(this.f278433b, this.f278432a.hashCode() * 31, 31), 31, this.f278434c);
        dj0.d dVar = this.d;
        return iC + (dVar == null ? 0 : dVar.hashCode());
    }
}
