package c69;

import com.revolut.feature.masav.impl.model.DirectDebitData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f21728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DirectDebitData f21729b;

    public i(h mode, DirectDebitData directDebitData) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(directDebitData, "directDebitData");
        this.f21728a = mode;
        this.f21729b = directDebitData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f21728a == iVar.f21728a && Intrinsics.f(this.f21729b, iVar.f21729b);
    }

    public final int hashCode() {
        return this.f21729b.hashCode() + (this.f21728a.hashCode() * 31);
    }
}
