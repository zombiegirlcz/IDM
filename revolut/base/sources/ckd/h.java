package ckd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f24806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24808c;

    public /* synthetic */ h(int i, k kVar, String str, String str2) {
        if (7 != (i & 7)) {
            j1.f(f.f24805a.getDescriptor(), i, 7);
            throw null;
        }
        this.f24806a = kVar;
        this.f24807b = str;
        this.f24808c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f24806a, hVar.f24806a) && Intrinsics.f(this.f24807b, hVar.f24807b) && Intrinsics.f(this.f24808c, hVar.f24808c);
    }

    public final int hashCode() {
        return this.f24808c.hashCode() + p.a.c(this.f24806a.f24810a.hashCode() * 31, 31, this.f24807b);
    }
}
