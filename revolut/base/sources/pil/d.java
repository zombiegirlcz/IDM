package pil;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f236622b;

    public d(String stepId, String text) {
        Intrinsics.checkNotNullParameter(stepId, "stepId");
        Intrinsics.checkNotNullParameter("EMPLOYER", "type");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f236621a = stepId;
        this.f236622b = text;
    }

    public final String a() {
        return this.f236621a;
    }

    public final String b() {
        return this.f236622b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f236621a, dVar.f236621a) && Intrinsics.f(this.f236622b, dVar.f236622b);
    }

    public final int hashCode() {
        return p.a.c(((this.f236621a.hashCode() * 31) + 1976096443) * 31, 961, this.f236622b);
    }
}
