package p81;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f233821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f233822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r81.b f233823c;

    public d(String name, String variant, r81.b bVar) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(variant, "variant");
        this.f233821a = name;
        this.f233822b = variant;
        this.f233823c = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f233821a, dVar.f233821a) && Intrinsics.f(this.f233822b, dVar.f233822b) && this.f233823c == dVar.f233823c;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f233821a.hashCode() * 31, 31, this.f233822b);
        r81.b bVar = this.f233823c;
        return iC + (bVar == null ? 0 : bVar.hashCode());
    }
}
