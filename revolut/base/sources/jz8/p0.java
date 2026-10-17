package jz8;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class p0 {

    @NotNull
    public static final m0 Companion = new m0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f179651c = {yhm.j.c(yhm.k.PUBLICATION, new jxi.a(21)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f179652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f179653b;

    public /* synthetic */ p0(int i, o0 o0Var, String str) {
        if (3 != (i & 3)) {
            j1.f(l0.f179638a.getDescriptor(), i, 3);
            throw null;
        }
        this.f179652a = o0Var;
        this.f179653b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return this.f179652a == p0Var.f179652a && Intrinsics.f(this.f179653b, p0Var.f179653b);
    }

    public final int hashCode() {
        return this.f179653b.hashCode() + (this.f179652a.hashCode() * 31);
    }

    public p0(o0 type, String link) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(link, "link");
        this.f179652a = type;
        this.f179653b = link;
    }
}
