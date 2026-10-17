package hs3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a0 implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154862a;

    public a0(String str) {
        this.f154862a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a0) && Intrinsics.f(this.f154862a, ((a0) obj2).f154862a);
    }

    public final int hashCode() {
        String str = this.f154862a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
