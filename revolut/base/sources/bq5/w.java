package bq5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17760c;
    public final boolean d;

    public w(String value, boolean z) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f17758a = value;
        this.f17759b = z;
        boolean z3 = false;
        this.f17760c = z && !kotlin.text.d0.W(value);
        if (!z && !kotlin.text.d0.W(value)) {
            z3 = true;
        }
        this.d = z3;
    }

    @Override // bq5.z
    public final boolean a() {
        return true;
    }

    @Override // bq5.z
    public final boolean b() {
        return this.d;
    }

    @Override // bq5.z
    public final boolean c() {
        return this.f17760c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f17758a, wVar.f17758a) && this.f17759b == wVar.f17759b;
    }

    @Override // bq5.z
    public final String getValue() {
        return this.f17758a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17759b) + (this.f17758a.hashCode() * 31);
    }
}
