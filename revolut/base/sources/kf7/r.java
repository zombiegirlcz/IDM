package kf7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f183308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f183309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f183310c;
    public final String d;
    public final String e;

    public /* synthetic */ r(String str, String str2, String str3, String str4, boolean z, int i) {
        if (31 != (i & 31)) {
            j1.f(p.f183307a.getDescriptor(), i, 31);
            throw null;
        }
        this.f183308a = z;
        this.f183309b = str;
        this.f183310c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f183308a == rVar.f183308a && Intrinsics.f(this.f183309b, rVar.f183309b) && Intrinsics.f(this.f183310c, rVar.f183310c) && Intrinsics.f(this.d, rVar.d) && Intrinsics.f(this.e, rVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.c(p.a.c(Boolean.hashCode(this.f183308a) * 31, 31, this.f183309b), 31, this.f183310c), 31, this.d);
    }
}
