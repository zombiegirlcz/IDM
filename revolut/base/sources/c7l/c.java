package c7l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22059b;

    public c(String code, String description) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f22058a = code;
        this.f22059b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f22058a, cVar.f22058a) && Intrinsics.f(this.f22059b, cVar.f22059b);
    }

    public final int hashCode() {
        return p.a.c(this.f22058a.hashCode() * 31, 31, this.f22059b);
    }
}
