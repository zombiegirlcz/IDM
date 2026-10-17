package b19;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11750c;
    public final String d;
    public final String e;
    public final String f;

    public /* synthetic */ c(String str, int i, String str2, String str3, String str4, String str5, String str6) {
        if (63 != (i & 63)) {
            j1.f(a.f11747a.getDescriptor(), i, 63);
            throw null;
        }
        this.f11748a = str;
        this.f11749b = str2;
        this.f11750c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f11748a, cVar.f11748a) && Intrinsics.f(this.f11749b, cVar.f11749b) && Intrinsics.f(this.f11750c, cVar.f11750c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(this.f11748a.hashCode() * 31, 31, this.f11749b), 31, this.f11750c), 31, this.d), 31, this.e);
    }
}
