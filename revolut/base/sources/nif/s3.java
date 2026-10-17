package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f216035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r3 f216036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w3 f216037c;
    public final v3 d;

    public s3(String str, r3 promisedAmount, w3 w3Var, v3 v3Var) {
        Intrinsics.checkNotNullParameter(promisedAmount, "promisedAmount");
        this.f216035a = str;
        this.f216036b = promisedAmount;
        this.f216037c = w3Var;
        this.d = v3Var;
    }

    public final r3 a() {
        return this.f216036b;
    }

    public final String b() {
        return this.f216035a;
    }

    public final v3 c() {
        return this.d;
    }

    public final w3 d() {
        return this.f216037c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s3)) {
            return false;
        }
        s3 s3Var = (s3) obj2;
        return Intrinsics.f(this.f216035a, s3Var.f216035a) && Intrinsics.f(this.f216036b, s3Var.f216036b) && Intrinsics.f(this.f216037c, s3Var.f216037c) && Intrinsics.f(this.d, s3Var.d);
    }

    public final int hashCode() {
        String str = this.f216035a;
        int iHashCode = (this.f216036b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        w3 w3Var = this.f216037c;
        int iHashCode2 = (iHashCode + (w3Var == null ? 0 : w3Var.hashCode())) * 31;
        v3 v3Var = this.d;
        return iHashCode2 + (v3Var != null ? v3Var.hashCode() : 0);
    }
}
