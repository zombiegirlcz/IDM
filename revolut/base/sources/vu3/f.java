package vu3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f292214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f292215c;

    public f(String id10, String text, j jVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f292213a = id10;
        this.f292214b = text;
        this.f292215c = jVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f292213a, fVar.f292213a) && Intrinsics.f(this.f292214b, fVar.f292214b) && Intrinsics.f(this.f292215c, fVar.f292215c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f292213a.hashCode() * 31, 31, this.f292214b);
        j jVar = this.f292215c;
        return iC + (jVar == null ? 0 : jVar.f292225a.hashCode());
    }
}
