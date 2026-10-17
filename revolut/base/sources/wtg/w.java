package wtg;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class w {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f299974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f299975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f299976c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f299977g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f299978h;

    public /* synthetic */ w(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (255 != (i & 255)) {
            j1.f(u.f299973a.getDescriptor(), i, 255);
            throw null;
        }
        this.f299974a = str;
        this.f299975b = str2;
        this.f299976c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f299977g = str7;
        this.f299978h = str8;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f299974a, wVar.f299974a) && Intrinsics.f(this.f299975b, wVar.f299975b) && Intrinsics.f(this.f299976c, wVar.f299976c) && Intrinsics.f(this.d, wVar.d) && Intrinsics.f(this.e, wVar.e) && Intrinsics.f(this.f, wVar.f) && Intrinsics.f(this.f299977g, wVar.f299977g) && Intrinsics.f(this.f299978h, wVar.f299978h);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f299974a.hashCode() * 31, 31, this.f299975b), 31, this.f299976c), 31, this.d), 31, this.e), 31, this.f), 31, this.f299977g);
        String str = this.f299978h;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
