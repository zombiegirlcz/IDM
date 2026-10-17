package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c21;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class d21 implements c21.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c81 f27628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z10 f27629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final le1 f27630c;
    private final z10 d;

    public d21(c81 title, z10 closeImageSource, le1 le1Var, z10 icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(closeImageSource, "closeImageSource");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f27628a = title;
        this.f27629b = closeImageSource;
        this.f27630c = le1Var;
        this.d = icon;
    }

    @Override // com.fourthline.orca.internal.c21.b
    public z10 b() {
        return this.f27629b;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d21)) {
            return false;
        }
        d21 d21Var = (d21) obj2;
        return Intrinsics.f(this.f27628a, d21Var.f27628a) && Intrinsics.f(this.f27629b, d21Var.f27629b) && Intrinsics.f(this.f27630c, d21Var.f27630c) && Intrinsics.f(this.d, d21Var.d);
    }

    @Override // com.fourthline.orca.internal.c21.b
    public le1 getMask() {
        return this.f27630c;
    }

    @Override // com.fourthline.orca.internal.c21
    public c81 getTitle() {
        return this.f27628a;
    }

    public int hashCode() {
        int iHashCode = ((this.f27628a.hashCode() * 31) + this.f27629b.hashCode()) * 31;
        le1 le1Var = this.f27630c;
        return ((iHashCode + (le1Var == null ? 0 : le1Var.hashCode())) * 31) + this.d.hashCode();
    }

    public final z10 n() {
        return this.d;
    }

    public String toString() {
        return "Icon(title=" + this.f27628a + ", closeImageSource=" + this.f27629b + ", mask=" + this.f27630c + ", icon=" + this.d + ")";
    }

    public /* synthetic */ d21(c81 c81Var, z10 z10Var, le1 le1Var, z10 z10Var2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c81Var, z10Var, (i & 4) != 0 ? null : le1Var, z10Var2);
    }
}
