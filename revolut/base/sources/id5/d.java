package id5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f160420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f160421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f160422c;
    public final String d;
    public final String e;
    public final String f;

    public /* synthetic */ d(String str, int i, String str2, String str3, String str4, String str5, String str6) {
        if (63 != (i & 63)) {
            j1.f(b.f160419a.getDescriptor(), i, 63);
            throw null;
        }
        this.f160420a = str;
        this.f160421b = str2;
        this.f160422c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f160420a, dVar.f160420a) && Intrinsics.f(this.f160421b, dVar.f160421b) && Intrinsics.f(this.f160422c, dVar.f160422c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f160420a.hashCode() * 31;
        String str = this.f160421b;
        return this.f.hashCode() + p.a.c(p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f160422c), 31, this.d), 31, this.e);
    }
}
