package pf6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class i {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f235481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f235482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f235483c;
    public final String d;

    public /* synthetic */ i(int i, String str, String str2, h hVar, String str3) {
        if (15 != (i & 15)) {
            j1.f(d.f235476a.getDescriptor(), i, 15);
            throw null;
        }
        this.f235481a = str;
        this.f235482b = str2;
        this.f235483c = hVar;
        this.d = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f235481a, iVar.f235481a) && Intrinsics.f(this.f235482b, iVar.f235482b) && Intrinsics.f(this.f235483c, iVar.f235483c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f235481a.hashCode() * 31, 31, this.f235482b);
        h hVar = this.f235483c;
        return this.d.hashCode() + ((iC + (hVar == null ? 0 : hVar.hashCode())) * 31);
    }
}
