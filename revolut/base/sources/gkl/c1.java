package gkl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c1 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f144438a;

    public c1(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f144438a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c1) && Intrinsics.f(this.f144438a, ((c1) obj2).f144438a);
    }

    @Override // gkl.e1
    public final String getValue() {
        return this.f144438a;
    }

    public final int hashCode() {
        return this.f144438a.hashCode();
    }
}
