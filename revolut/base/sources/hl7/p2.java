package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class p2 {

    @NotNull
    public static final o2 Companion = new o2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153252b;

    public /* synthetic */ p2(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(n2.f153221a.getDescriptor(), i, 3);
            throw null;
        }
        this.f153251a = str;
        this.f153252b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj2;
        return Intrinsics.f(this.f153251a, p2Var.f153251a) && Intrinsics.f(this.f153252b, p2Var.f153252b);
    }

    public final int hashCode() {
        return this.f153252b.hashCode() + (this.f153251a.hashCode() * 31);
    }

    public p2(String type, String yearsSinceIssued) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(yearsSinceIssued, "yearsSinceIssued");
        this.f153251a = type;
        this.f153252b = yearsSinceIssued;
    }
}
