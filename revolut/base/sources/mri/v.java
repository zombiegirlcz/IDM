package mri;

import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class v {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f208148b = {yhm.j.c(yhm.k.PUBLICATION, new mq4.b(8))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f208149a;

    public /* synthetic */ v(int i, Set set) {
        if (1 == (i & 1)) {
            this.f208149a = set;
        } else {
            j1.f(t.f208147a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f208149a, ((v) obj2).f208149a);
    }

    public final int hashCode() {
        return this.f208149a.hashCode();
    }

    public v(Set balances) {
        Intrinsics.checkNotNullParameter(balances, "balances");
        this.f208149a = balances;
    }
}
