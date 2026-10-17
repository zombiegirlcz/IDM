package gd9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final od0.i f143116a;

    public d(od0.i personalTerms) {
        Intrinsics.checkNotNullParameter(personalTerms, "personalTerms");
        this.f143116a = personalTerms;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f143116a, ((d) obj2).f143116a);
    }

    public final int hashCode() {
        return this.f143116a.hashCode();
    }
}
