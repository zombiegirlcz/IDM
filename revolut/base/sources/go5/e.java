package go5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f145086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f145087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f145088c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f145089g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f145090h;
    public final a i;

    public e(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, a addMultipleRecipientsMethod) {
        Intrinsics.checkNotNullParameter(addMultipleRecipientsMethod, "addMultipleRecipientsMethod");
        this.f145086a = true;
        this.f145087b = true;
        this.f145088c = z;
        this.d = z3;
        this.e = z4;
        this.f = z6;
        this.f145089g = z11;
        this.f145090h = true;
        this.i = addMultipleRecipientsMethod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f145086a == eVar.f145086a && this.f145087b == eVar.f145087b && this.f145088c == eVar.f145088c && this.d == eVar.d && this.e == eVar.e && this.f == eVar.f && this.f145089g == eVar.f145089g && this.f145090h == eVar.f145090h && this.i == eVar.i;
    }

    public final int hashCode() {
        return this.i.hashCode() + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f145086a) * 31, 31, false), 31, this.f145087b), 31, this.f145088c), 31, this.d), 31, this.e), 31, this.f), 31, this.f145089g), 31, this.f145090h), 31, false), 31, false);
    }
}
