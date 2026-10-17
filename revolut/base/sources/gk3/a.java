package gk3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f144316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f144317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f144318c;

    public a(c fieldType, int i, int i2) {
        Intrinsics.checkNotNullParameter(fieldType, "fieldType");
        this.f144316a = fieldType;
        this.f144317b = i;
        this.f144318c = i2;
    }

    public final boolean a() {
        return this.f144317b > 0;
    }

    public final boolean b() {
        return this.f144317b == 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f144316a == aVar.f144316a && this.f144317b == aVar.f144317b && this.f144318c == aVar.f144318c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f144318c) + j6.a.b(this.f144317b, this.f144316a.hashCode() * 31, 31);
    }
}
