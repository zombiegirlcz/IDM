package bq5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17767c;
    public final boolean d;

    public y(String value, boolean z) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f17765a = value;
        this.f17766b = z;
        boolean z3 = false;
        this.f17767c = z || kotlin.text.d0.W(value);
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
        return this.f17767c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f17765a, yVar.f17765a) && this.f17766b == yVar.f17766b;
    }

    @Override // bq5.z
    public final String getValue() {
        return this.f17765a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17766b) + (this.f17765a.hashCode() * 31);
    }
}
