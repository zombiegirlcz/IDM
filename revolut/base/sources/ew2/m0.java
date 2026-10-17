package ew2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m0 extends n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z63.b f130030a;

    public m0(z63.b tokenizeBuilder) {
        Intrinsics.checkNotNullParameter(tokenizeBuilder, "tokenizeBuilder");
        this.f130030a = tokenizeBuilder;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m0) && Intrinsics.f(this.f130030a, ((m0) obj2).f130030a);
    }

    public final int hashCode() {
        return this.f130030a.hashCode();
    }
}
