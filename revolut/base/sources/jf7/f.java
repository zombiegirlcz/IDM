package jf7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class f implements l1 {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f173672b;

    public /* synthetic */ f(int i, String str, e eVar) {
        if (3 != (i & 3)) {
            qlm.j1.f(a.f173655a.getDescriptor(), i, 3);
            throw null;
        }
        this.f173671a = str;
        this.f173672b = eVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f173671a, fVar.f173671a) && Intrinsics.f(this.f173672b, fVar.f173672b);
    }

    public final int hashCode() {
        return this.f173672b.hashCode() + (this.f173671a.hashCode() * 31);
    }
}
