package e94;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f123911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f123912b;

    public m(Data debts, boolean z) {
        Intrinsics.checkNotNullParameter(debts, "debts");
        this.f123911a = debts;
        this.f123912b = z;
    }

    public static m a(m mVar, Data debts, boolean z, int i) {
        if ((i & 1) != 0) {
            debts = mVar.f123911a;
        }
        if ((i & 2) != 0) {
            z = mVar.f123912b;
        }
        mVar.getClass();
        Intrinsics.checkNotNullParameter(debts, "debts");
        return new m(debts, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f123911a, mVar.f123911a) && this.f123912b == mVar.f123912b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f123912b) + (this.f123911a.hashCode() * 31);
    }
}
