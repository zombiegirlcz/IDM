package hj3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152658b;

    public c(String icon, String text) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f152657a = icon;
        this.f152658b = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f152657a, cVar.f152657a) && Intrinsics.f(this.f152658b, cVar.f152658b);
    }

    public final int hashCode() {
        return this.f152658b.hashCode() + (this.f152657a.hashCode() * 31);
    }
}
