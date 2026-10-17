package abi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2965a;

    public a(String str) {
        this.f2965a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f2965a, ((a) obj2).f2965a);
    }

    public final int hashCode() {
        String str = this.f2965a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
