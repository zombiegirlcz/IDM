package c8a;

import kotlin.jvm.internal.Intrinsics;
import s7a.c0;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22154a;

    public a(String country) {
        Intrinsics.checkNotNullParameter(country, "country");
        this.f22154a = country;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f22154a, ((a) obj2).f22154a);
    }

    public final int hashCode() {
        return this.f22154a.hashCode();
    }
}
