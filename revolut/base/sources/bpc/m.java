package bpc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ilc.a f17588a;

    public m(ilc.a context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f17588a = context;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && this.f17588a == ((m) obj2).f17588a;
    }

    public final int hashCode() {
        return this.f17588a.hashCode();
    }
}
