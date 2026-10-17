package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class d2 {

    @NotNull
    public static final c2 Companion = new c2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final no3.b f153059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153060b;

    public /* synthetic */ d2(int i, String str, no3.b bVar) {
        if (3 != (i & 3)) {
            qlm.j1.f(b2.f153027a.getDescriptor(), i, 3);
            throw null;
        }
        this.f153059a = bVar;
        this.f153060b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj2;
        return Intrinsics.f(this.f153059a, d2Var.f153059a) && Intrinsics.f(this.f153060b, d2Var.f153060b);
    }

    public final int hashCode() {
        return this.f153060b.hashCode() + (this.f153059a.hashCode() * 31);
    }
}
