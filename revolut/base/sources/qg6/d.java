package qg6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f245660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f245661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f245662c;
    public final String d;

    public d(String title, String description, c cVar, String footer) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.f245660a = title;
        this.f245661b = description;
        this.f245662c = cVar;
        this.d = footer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f245660a, dVar.f245660a) && Intrinsics.f(this.f245661b, dVar.f245661b) && Intrinsics.f(this.f245662c, dVar.f245662c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f245660a.hashCode() * 31, 31, this.f245661b);
        c cVar = this.f245662c;
        return this.d.hashCode() + ((iC + (cVar == null ? 0 : cVar.hashCode())) * 31);
    }
}
