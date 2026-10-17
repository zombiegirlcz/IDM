package xck;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class q implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304180a;

    public q(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f304180a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f304180a, ((q) obj2).f304180a);
    }

    public final int hashCode() {
        return this.f304180a.hashCode();
    }
}
