package ell;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f127525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f127526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f127527c;

    public a(b bVar, String number, c numberValidationState) {
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(numberValidationState, "numberValidationState");
        this.f127525a = bVar;
        this.f127526b = number;
        this.f127527c = numberValidationState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f127525a == aVar.f127525a && Intrinsics.f(this.f127526b, aVar.f127526b) && this.f127527c == aVar.f127527c;
    }

    public final int hashCode() {
        b bVar = this.f127525a;
        return this.f127527c.hashCode() + p.a.c((bVar == null ? 0 : bVar.hashCode()) * 31, 31, this.f127526b);
    }
}
