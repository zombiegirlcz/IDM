package xz8;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f309899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f309900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f309901c;
    public final String d;
    public final pz8.e e;
    public final String f;

    public /* synthetic */ j(int i, String str, String str2, String str3, String str4, pz8.e eVar, String str5) {
        if (55 != (i & 55)) {
            j1.f(h.f309898a.getDescriptor(), i, 55);
            throw null;
        }
        this.f309899a = str;
        this.f309900b = str2;
        this.f309901c = str3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        this.e = eVar;
        this.f = str5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f309899a, jVar.f309899a) && Intrinsics.f(this.f309900b, jVar.f309900b) && Intrinsics.f(this.f309901c, jVar.f309901c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f309899a.hashCode() * 31, 31, this.f309900b), 31, this.f309901c);
        String str = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }
}
