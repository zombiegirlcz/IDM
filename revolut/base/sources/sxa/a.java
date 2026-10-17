package sxa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f266379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f266380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f266381c;
    public final String d;
    public final String e;

    public a(String description, String darkImage, String lightImage, String acceptButton, String declineButton) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(darkImage, "darkImage");
        Intrinsics.checkNotNullParameter(lightImage, "lightImage");
        Intrinsics.checkNotNullParameter(acceptButton, "acceptButton");
        Intrinsics.checkNotNullParameter(declineButton, "declineButton");
        this.f266379a = description;
        this.f266380b = darkImage;
        this.f266381c = lightImage;
        this.d = acceptButton;
        this.e = declineButton;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f266379a, aVar.f266379a) && Intrinsics.f(this.f266380b, aVar.f266380b) && Intrinsics.f(this.f266381c, aVar.f266381c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f266379a.hashCode() * 31, 31, this.f266380b), 31, this.f266381c), 31, this.d);
    }
}
