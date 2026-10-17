package se6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f262133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f262134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final io3.b f262135c;

    public h(String id10, String name, io3.b logo) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logo, "logo");
        this.f262133a = id10;
        this.f262134b = name;
        this.f262135c = logo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f262133a, hVar.f262133a) && Intrinsics.f(this.f262134b, hVar.f262134b) && Intrinsics.f(this.f262135c, hVar.f262135c);
    }

    public final int hashCode() {
        return this.f262135c.hashCode() + p.a.c(this.f262133a.hashCode() * 31, 31, this.f262134b);
    }
}
