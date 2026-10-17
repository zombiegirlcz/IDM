package hl7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class f7 {

    @NotNull
    public static final e7 Companion = new e7();
    public static final Lazy[] e = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new q0(16))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f153103c;
    public final List d;

    public /* synthetic */ f7(int i, String str, String str2, String str3, List list) {
        if (15 != (i & 15)) {
            qlm.j1.f(d7.f153067a.getDescriptor(), i, 15);
            throw null;
        }
        this.f153101a = str;
        this.f153102b = str2;
        this.f153103c = str3;
        this.d = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f7)) {
            return false;
        }
        f7 f7Var = (f7) obj2;
        return Intrinsics.f(this.f153101a, f7Var.f153101a) && Intrinsics.f(this.f153102b, f7Var.f153102b) && Intrinsics.f(this.f153103c, f7Var.f153103c) && Intrinsics.f(this.d, f7Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f153101a.hashCode() * 31, 31, this.f153102b), 31, this.f153103c);
    }
}
