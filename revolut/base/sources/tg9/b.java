package tg9;

import g12.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f271111a;

    public b(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f271111a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f271111a, ((b) obj2).f271111a);
    }

    public final int hashCode() {
        return this.f271111a.hashCode();
    }
}
