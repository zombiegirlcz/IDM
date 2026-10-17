package com.fourthline.orca.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class s20 implements u20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r20 f32881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f32883c;
    private final l20 d;
    private final String e;
    private final c81 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c81 f32884g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c81 f32885h;
    private final z10 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b f32886j;
    private final int k;

    public s20(r20 format, String identifier, boolean z, l20 state, String text, c81 title, c81 placeholder, c81 status, z10 z10Var, b bVar, int i) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f32881a = format;
        this.f32882b = identifier;
        this.f32883c = z;
        this.d = state;
        this.e = text;
        this.f = title;
        this.f32884g = placeholder;
        this.f32885h = status;
        this.i = z10Var;
        this.f32886j = bVar;
        this.k = i;
    }

    public final s20 a(r20 format, String identifier, boolean z, l20 state, String text, c81 title, c81 placeholder, c81 status, z10 z10Var, b bVar, int i) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(status, "status");
        return new s20(format, identifier, z, state, text, title, placeholder, status, z10Var, bVar, i);
    }

    @Override // com.fourthline.orca.internal.u20
    public c81 b() {
        return this.f32885h;
    }

    public b c() {
        return this.f32886j;
    }

    public int d() {
        return this.k;
    }

    public c81 e() {
        return this.f32884g;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s20)) {
            return false;
        }
        s20 s20Var = (s20) obj2;
        return this.f32881a == s20Var.f32881a && Intrinsics.f(this.f32882b, s20Var.f32882b) && this.f32883c == s20Var.f32883c && this.d == s20Var.d && Intrinsics.f(this.e, s20Var.e) && Intrinsics.f(this.f, s20Var.f) && Intrinsics.f(this.f32884g, s20Var.f32884g) && Intrinsics.f(this.f32885h, s20Var.f32885h) && Intrinsics.f(this.i, s20Var.i) && Intrinsics.f(this.f32886j, s20Var.f32886j) && this.k == s20Var.k;
    }

    public z10 f() {
        return this.i;
    }

    public boolean g() {
        return this.f32883c;
    }

    @Override // com.fourthline.orca.internal.u20
    public r20 getFormat() {
        return this.f32881a;
    }

    @Override // com.fourthline.orca.internal.u20
    public l20 getState() {
        return this.d;
    }

    @Override // com.fourthline.orca.internal.u20
    public String getText() {
        return this.e;
    }

    @Override // com.fourthline.orca.internal.u20
    public c81 getTitle() {
        return this.f;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.f32881a.hashCode() * 31) + this.f32882b.hashCode()) * 31) + Boolean.hashCode(this.f32883c)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.f32884g.hashCode()) * 31) + this.f32885h.hashCode()) * 31;
        z10 z10Var = this.i;
        int iHashCode2 = (iHashCode + (z10Var == null ? 0 : z10Var.hashCode())) * 31;
        b bVar = this.f32886j;
        return ((iHashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31) + Integer.hashCode(this.k);
    }

    public String toString() {
        return "InputViewState(format=" + this.f32881a + ", identifier=" + this.f32882b + ", isVisible=" + this.f32883c + ", state=" + this.d + ", text=" + this.e + ", title=" + this.f + ", placeholder=" + this.f32884g + ", status=" + this.f32885h + ", statusIcon=" + this.i + ", accessoryIcon=" + this.f32886j + ", maxLength=" + this.k + ")";
    }

    public static /* synthetic */ s20 a(s20 s20Var, r20 r20Var, String str, boolean z, l20 l20Var, String str2, c81 c81Var, c81 c81Var2, c81 c81Var3, z10 z10Var, b bVar, int i, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            r20Var = s20Var.f32881a;
        }
        if ((i2 & 2) != 0) {
            str = s20Var.f32882b;
        }
        if ((i2 & 4) != 0) {
            z = s20Var.f32883c;
        }
        if ((i2 & 8) != 0) {
            l20Var = s20Var.d;
        }
        if ((i2 & 16) != 0) {
            str2 = s20Var.e;
        }
        if ((i2 & 32) != 0) {
            c81Var = s20Var.f;
        }
        if ((i2 & 64) != 0) {
            c81Var2 = s20Var.f32884g;
        }
        if ((i2 & 128) != 0) {
            c81Var3 = s20Var.f32885h;
        }
        if ((i2 & 256) != 0) {
            z10Var = s20Var.i;
        }
        if ((i2 & 512) != 0) {
            bVar = s20Var.f32886j;
        }
        if ((i2 & 1024) != 0) {
            i = s20Var.k;
        }
        b bVar2 = bVar;
        int i3 = i;
        c81 c81Var4 = c81Var3;
        z10 z10Var2 = z10Var;
        c81 c81Var5 = c81Var;
        c81 c81Var6 = c81Var2;
        String str3 = str2;
        boolean z3 = z;
        return s20Var.a(r20Var, str, z3, l20Var, str3, c81Var5, c81Var6, c81Var4, z10Var2, bVar2, i3);
    }

    @Override // com.fourthline.orca.internal.u20
    public String a() {
        return this.f32882b;
    }

    public /* synthetic */ s20(r20 r20Var, String str, boolean z, l20 l20Var, String str2, c81 c81Var, c81 c81Var2, c81 c81Var3, z10 z10Var, b bVar, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? r20.f32616a : r20Var, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? true : z, l20Var, str2, c81Var, c81Var2, c81Var3, (i2 & 256) != 0 ? null : z10Var, (i2 & 512) != 0 ? null : bVar, (i2 & 1024) != 0 ? Integer.MAX_VALUE : i);
    }
}
