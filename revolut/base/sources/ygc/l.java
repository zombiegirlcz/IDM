package ygc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class l {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f313622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f313623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f313624c;
    public final String d;

    public /* synthetic */ l(int i, String str, String str2, k kVar, String str3) {
        if (15 != (i & 15)) {
            j1.f(g.f313606a.getDescriptor(), i, 15);
            throw null;
        }
        this.f313622a = str;
        this.f313623b = str2;
        this.f313624c = kVar;
        this.d = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f313622a, lVar.f313622a) && Intrinsics.f(this.f313623b, lVar.f313623b) && Intrinsics.f(this.f313624c, lVar.f313624c) && Intrinsics.f(this.d, lVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f313622a.hashCode() * 31, 31, this.f313623b);
        k kVar = this.f313624c;
        int iHashCode = (iC + (kVar == null ? 0 : kVar.hashCode())) * 31;
        String str = this.d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public l(String icon, String title, k kVar, String str) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f313622a = icon;
        this.f313623b = title;
        this.f313624c = kVar;
        this.d = str;
    }
}
