package fk5;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f135721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f135722b;

    public /* synthetic */ c(int i, int i2, String str) {
        if (3 != (i & 3)) {
            j1.f(a.f135720a.getDescriptor(), i, 3);
            throw null;
        }
        this.f135721a = i2;
        this.f135722b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f135721a == cVar.f135721a && Intrinsics.f(this.f135722b, cVar.f135722b);
    }

    public final int hashCode() {
        return this.f135722b.hashCode() + (Integer.hashCode(this.f135721a) * 31);
    }
}
