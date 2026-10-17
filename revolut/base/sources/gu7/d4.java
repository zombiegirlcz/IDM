package gu7;

import ip0.v7;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class d4 {

    @NotNull
    public static final c4 Companion = new c4();
    public static final Lazy[] e = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new v1(15))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f146731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f146732c;
    public final List d;

    public /* synthetic */ d4(int i, String str, String str2, dj0.d dVar, List list) {
        if (15 != (i & 15)) {
            qlm.j1.f(b4.f146716a.getDescriptor(), i, 15);
            throw null;
        }
        this.f146730a = str;
        this.f146731b = str2;
        this.f146732c = dVar;
        this.d = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d4)) {
            return false;
        }
        d4 d4Var = (d4) obj2;
        return Intrinsics.f(this.f146730a, d4Var.f146730a) && Intrinsics.f(this.f146731b, d4Var.f146731b) && Intrinsics.f(this.f146732c, d4Var.f146732c) && Intrinsics.f(this.d, d4Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.c(p.a.c(this.f146730a.hashCode() * 31, 31, this.f146731b), 31, this.f146732c);
    }
}
