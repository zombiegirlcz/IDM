package sxa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f266382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f266383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f266384c;
    public final String d;
    public final String e;

    public b(String title, String description, String darkImage, String lightImage, String acceptButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(darkImage, "darkImage");
        Intrinsics.checkNotNullParameter(lightImage, "lightImage");
        Intrinsics.checkNotNullParameter(acceptButton, "acceptButton");
        this.f266382a = title;
        this.f266383b = description;
        this.f266384c = darkImage;
        this.d = lightImage;
        this.e = acceptButton;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f266382a, bVar.f266382a) && Intrinsics.f(this.f266383b, bVar.f266383b) && Intrinsics.f(this.f266384c, bVar.f266384c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f266382a.hashCode() * 31, 31, this.f266383b), 31, this.f266384c), 31, this.d);
    }
}
