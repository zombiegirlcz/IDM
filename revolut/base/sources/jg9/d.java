package jg9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sg9.a f173940a;

    public d(sg9.a value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f173940a = value;
    }

    @Override // jg9.f
    public final String a() {
        return null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f173940a, ((d) obj2).f173940a);
    }

    public final int hashCode() {
        return this.f173940a.hashCode();
    }
}
