package dgi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f114690c;

    public h(String prompt, String currency, g origin) {
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f114688a = prompt;
        this.f114689b = currency;
        this.f114690c = origin;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f114688a, hVar.f114688a) && Intrinsics.f(this.f114689b, hVar.f114689b) && Intrinsics.f(this.f114690c, hVar.f114690c);
    }

    public final int hashCode() {
        return this.f114690c.hashCode() + p.a.c(this.f114688a.hashCode() * 31, 31, this.f114689b);
    }
}
