package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class r2 implements u20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r20 f32609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f32611c;
    private final c81 d;
    private final c81 e;
    private final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final l20 f32612g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c81 f32613h;
    private final z10 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final c81 f32614j;
    private final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final z10 f32615l;

    public r2(r20 format, String identifier, boolean z, c81 title, c81 placeholder, String text, l20 state, c81 status, z10 z10Var, c81 c81Var, List suggestions, z10 searchImageSource) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        Intrinsics.checkNotNullParameter(searchImageSource, "searchImageSource");
        this.f32609a = format;
        this.f32610b = identifier;
        this.f32611c = z;
        this.d = title;
        this.e = placeholder;
        this.f = text;
        this.f32612g = state;
        this.f32613h = status;
        this.i = z10Var;
        this.f32614j = c81Var;
        this.k = suggestions;
        this.f32615l = searchImageSource;
    }

    public final r2 a(r20 format, String identifier, boolean z, c81 title, c81 placeholder, String text, l20 state, c81 status, z10 z10Var, c81 c81Var, List suggestions, z10 searchImageSource) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        Intrinsics.checkNotNullParameter(searchImageSource, "searchImageSource");
        return new r2(format, identifier, z, title, placeholder, text, state, status, z10Var, c81Var, suggestions, searchImageSource);
    }

    @Override // com.fourthline.orca.internal.u20
    public c81 b() {
        return this.f32613h;
    }

    public c81 c() {
        return this.e;
    }

    public final z10 d() {
        return this.f32615l;
    }

    public z10 e() {
        return this.i;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj2;
        return this.f32609a == r2Var.f32609a && Intrinsics.f(this.f32610b, r2Var.f32610b) && this.f32611c == r2Var.f32611c && Intrinsics.f(this.d, r2Var.d) && Intrinsics.f(this.e, r2Var.e) && Intrinsics.f(this.f, r2Var.f) && this.f32612g == r2Var.f32612g && Intrinsics.f(this.f32613h, r2Var.f32613h) && Intrinsics.f(this.i, r2Var.i) && Intrinsics.f(this.f32614j, r2Var.f32614j) && Intrinsics.f(this.k, r2Var.k) && Intrinsics.f(this.f32615l, r2Var.f32615l);
    }

    public final List f() {
        return this.k;
    }

    public final c81 g() {
        return this.f32614j;
    }

    @Override // com.fourthline.orca.internal.u20
    public r20 getFormat() {
        return this.f32609a;
    }

    @Override // com.fourthline.orca.internal.u20
    public l20 getState() {
        return this.f32612g;
    }

    @Override // com.fourthline.orca.internal.u20
    public String getText() {
        return this.f;
    }

    @Override // com.fourthline.orca.internal.u20
    public c81 getTitle() {
        return this.d;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.f32609a.hashCode() * 31) + this.f32610b.hashCode()) * 31) + Boolean.hashCode(this.f32611c)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.f32612g.hashCode()) * 31) + this.f32613h.hashCode()) * 31;
        z10 z10Var = this.i;
        int iHashCode2 = (iHashCode + (z10Var == null ? 0 : z10Var.hashCode())) * 31;
        c81 c81Var = this.f32614j;
        return ((((iHashCode2 + (c81Var != null ? c81Var.hashCode() : 0)) * 31) + this.k.hashCode()) * 31) + this.f32615l.hashCode();
    }

    public String toString() {
        return "PickerState(format=" + this.f32609a + ", identifier=" + this.f32610b + ", isVisible=" + this.f32611c + ", title=" + this.d + ", placeholder=" + this.e + ", text=" + this.f + ", state=" + this.f32612g + ", status=" + this.f32613h + ", statusIcon=" + this.i + ", warningMessage=" + this.f32614j + ", suggestions=" + this.k + ", searchImageSource=" + this.f32615l + ")";
    }

    public static /* synthetic */ r2 a(r2 r2Var, r20 r20Var, String str, boolean z, c81 c81Var, c81 c81Var2, String str2, l20 l20Var, c81 c81Var3, z10 z10Var, c81 c81Var4, List list, z10 z10Var2, int i, Object obj2) {
        if ((i & 1) != 0) {
            r20Var = r2Var.f32609a;
        }
        if ((i & 2) != 0) {
            str = r2Var.f32610b;
        }
        if ((i & 4) != 0) {
            z = r2Var.f32611c;
        }
        if ((i & 8) != 0) {
            c81Var = r2Var.d;
        }
        if ((i & 16) != 0) {
            c81Var2 = r2Var.e;
        }
        if ((i & 32) != 0) {
            str2 = r2Var.f;
        }
        if ((i & 64) != 0) {
            l20Var = r2Var.f32612g;
        }
        if ((i & 128) != 0) {
            c81Var3 = r2Var.f32613h;
        }
        if ((i & 256) != 0) {
            z10Var = r2Var.i;
        }
        if ((i & 512) != 0) {
            c81Var4 = r2Var.f32614j;
        }
        if ((i & 1024) != 0) {
            list = r2Var.k;
        }
        if ((i & 2048) != 0) {
            z10Var2 = r2Var.f32615l;
        }
        List list2 = list;
        z10 z10Var3 = z10Var2;
        z10 z10Var4 = z10Var;
        c81 c81Var5 = c81Var4;
        l20 l20Var2 = l20Var;
        c81 c81Var6 = c81Var3;
        c81 c81Var7 = c81Var2;
        String str3 = str2;
        return r2Var.a(r20Var, str, z, c81Var, c81Var7, str3, l20Var2, c81Var6, z10Var4, c81Var5, list2, z10Var3);
    }

    @Override // com.fourthline.orca.internal.u20
    public String a() {
        return this.f32610b;
    }

    public r2(r20 r20Var, String str, boolean z, c81 c81Var, c81 c81Var2, String str2, l20 l20Var, c81 c81Var3, z10 z10Var, c81 c81Var4, List list, z10 z10Var2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? r20.f32616a : r20Var, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? true : z, (i & 8) != 0 ? c81.b.f27406b : c81Var, (i & 16) != 0 ? c81.b.f27406b : c81Var2, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? l20.f30507a : l20Var, (i & 128) != 0 ? c81.b.f27406b : c81Var3, (i & 256) != 0 ? null : z10Var, (i & 512) != 0 ? null : c81Var4, (i & 1024) != 0 ? zhm.f0.f322471a : list, z10Var2);
    }
}
