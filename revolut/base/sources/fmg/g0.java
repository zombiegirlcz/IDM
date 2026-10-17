package fmg;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f136421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f136422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f136423c;
    public final String d;
    public final boolean e;
    public final b0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f136424g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f0 f136425h;

    public g0(i0 title, ArrayList subtitleSections, ArrayList tags, String str, boolean z, b0 b0Var, String str2, f0 type) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitleSections, "subtitleSections");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f136421a = title;
        this.f136422b = subtitleSections;
        this.f136423c = tags;
        this.d = str;
        this.e = z;
        this.f = b0Var;
        this.f136424g = str2;
        this.f136425h = type;
    }

    public static g0 a(g0 g0Var, f0 type) {
        i0 title = g0Var.f136421a;
        ArrayList subtitleSections = g0Var.f136422b;
        ArrayList tags = g0Var.f136423c;
        String str = g0Var.d;
        boolean z = g0Var.e;
        b0 b0Var = g0Var.f;
        String str2 = g0Var.f136424g;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitleSections, "subtitleSections");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(type, "type");
        return new g0(title, subtitleSections, tags, str, z, b0Var, str2, type);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return this.f136421a.equals(g0Var.f136421a) && this.f136422b.equals(g0Var.f136422b) && this.f136423c.equals(g0Var.f136423c) && Intrinsics.f(this.d, g0Var.d) && this.e == g0Var.e && Intrinsics.f(this.f, g0Var.f) && Intrinsics.f(this.f136424g, g0Var.f136424g) && this.f136425h.equals(g0Var.f136425h);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f136423c, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f136422b, this.f136421a.hashCode() * 31, 31), 31);
        String str = this.d;
        int iC = j6.a.c((iB + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        b0 b0Var = this.f;
        int iHashCode = (iC + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
        String str2 = this.f136424g;
        return this.f136425h.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
