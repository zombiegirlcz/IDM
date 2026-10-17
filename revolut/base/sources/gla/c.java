package gla;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f144583c = {yhm.j.c(yhm.k.PUBLICATION, new gaa.b(27)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bla.c f144584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jla.k f144585b;

    public /* synthetic */ c(int i, bla.c cVar, jla.k kVar) {
        if (3 != (i & 3)) {
            j1.f(a.f144582a.getDescriptor(), i, 3);
            throw null;
        }
        this.f144584a = cVar;
        this.f144585b = kVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f144584a == cVar.f144584a && Intrinsics.f(this.f144585b, cVar.f144585b);
    }

    public final int hashCode() {
        int iHashCode = this.f144584a.hashCode() * 31;
        jla.k kVar = this.f144585b;
        return iHashCode + (kVar == null ? 0 : kVar.hashCode());
    }

    public c(bla.c state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f144584a = state;
        this.f144585b = null;
    }
}
