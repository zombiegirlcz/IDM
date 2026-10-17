package djb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final es6.d f115277a;

    public e(es6.d taxPocket) {
        Intrinsics.checkNotNullParameter(taxPocket, "taxPocket");
        this.f115277a = taxPocket;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f115277a, ((e) obj2).f115277a);
    }

    public final int hashCode() {
        return this.f115277a.hashCode();
    }
}
