package snd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264542a;

    public j(String str) {
        this.f264542a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f264542a, ((j) obj2).f264542a);
    }

    public final int hashCode() {
        String str = this.f264542a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
