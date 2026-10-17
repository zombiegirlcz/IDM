package hl7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class c7 {

    @NotNull
    public static final b7 Companion = new b7();
    public static final Lazy[] e = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new q0(15))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f153051c;
    public final List d;

    public /* synthetic */ c7(int i, String str, String str2, String str3, List list) {
        if (15 != (i & 15)) {
            qlm.j1.f(a7.f153021a.getDescriptor(), i, 15);
            throw null;
        }
        this.f153049a = str;
        this.f153050b = str2;
        this.f153051c = str3;
        this.d = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c7)) {
            return false;
        }
        c7 c7Var = (c7) obj2;
        return Intrinsics.f(this.f153049a, c7Var.f153049a) && Intrinsics.f(this.f153050b, c7Var.f153050b) && Intrinsics.f(this.f153051c, c7Var.f153051c) && Intrinsics.f(this.d, c7Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f153049a.hashCode() * 31, 31, this.f153050b), 31, this.f153051c);
    }
}
