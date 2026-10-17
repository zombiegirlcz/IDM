package vwg;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class x {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f292758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f292759c;
    public final i d;

    public /* synthetic */ x(int i, String str, String str2, String str3, i iVar) {
        if (15 != (i & 15)) {
            j1.f(v.f292756a.getDescriptor(), i, 15);
            throw null;
        }
        this.f292757a = str;
        this.f292758b = str2;
        this.f292759c = str3;
        this.d = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f292757a, xVar.f292757a) && Intrinsics.f(this.f292758b, xVar.f292758b) && Intrinsics.f(this.f292759c, xVar.f292759c) && Intrinsics.f(this.d, xVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f292757a.hashCode() * 31, 31, this.f292758b), 31, this.f292759c);
        i iVar = this.d;
        return iC + (iVar == null ? 0 : iVar.hashCode());
    }

    public x(String gauge, String title, String subtitle, i iVar) {
        Intrinsics.checkNotNullParameter(gauge, "gauge");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f292757a = gauge;
        this.f292758b = title;
        this.f292759c = subtitle;
        this.d = iVar;
    }
}
