package lhb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f195235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f195236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f195237c;

    public d(String carbonCopy, String subject, String body) {
        Intrinsics.checkNotNullParameter(carbonCopy, "carbonCopy");
        Intrinsics.checkNotNullParameter(subject, "subject");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f195235a = carbonCopy;
        this.f195236b = subject;
        this.f195237c = body;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f195235a, dVar.f195235a) && Intrinsics.f(this.f195236b, dVar.f195236b) && Intrinsics.f(this.f195237c, dVar.f195237c);
    }

    public final int hashCode() {
        return this.f195237c.hashCode() + p.a.c(this.f195235a.hashCode() * 31, 31, this.f195236b);
    }
}
