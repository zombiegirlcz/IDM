package l15;

import kotlin.jvm.internal.Intrinsics;
import l15.f;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f.a f191455a;

    public b(f.a financialDifficultiesConfiguration) {
        Intrinsics.checkNotNullParameter(financialDifficultiesConfiguration, "financialDifficultiesConfiguration");
        this.f191455a = financialDifficultiesConfiguration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f191455a, ((b) obj2).f191455a);
    }

    public final int hashCode() {
        return this.f191455a.hashCode();
    }
}
