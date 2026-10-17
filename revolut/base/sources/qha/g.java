package qha;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f246588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f246589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f246590c;

    public g(String message, String description, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f246588a = message;
        this.f246589b = description;
        this.f246590c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f246588a, gVar.f246588a) && Intrinsics.f(this.f246589b, gVar.f246589b) && Intrinsics.f(this.f246590c, gVar.f246590c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f246588a.hashCode() * 31, 31, this.f246589b);
        String str = this.f246590c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
