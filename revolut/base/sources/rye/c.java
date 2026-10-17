package rye;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f258363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f258364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jo3.a f258365c;

    public /* synthetic */ c(int i, int i2, jo3.a aVar, jo3.a aVar2) {
        if (7 != (i & 7)) {
            j1.f(a.f258362a.getDescriptor(), i, 7);
            throw null;
        }
        this.f258363a = i2;
        this.f258364b = aVar;
        this.f258365c = aVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f258363a == cVar.f258363a && Intrinsics.f(this.f258364b, cVar.f258364b) && Intrinsics.f(this.f258365c, cVar.f258365c);
    }

    public final int hashCode() {
        return this.f258365c.hashCode() + v7.j(this.f258364b, Integer.hashCode(this.f258363a) * 31, 31);
    }
}
