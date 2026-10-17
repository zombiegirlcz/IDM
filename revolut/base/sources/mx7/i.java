package mx7;

import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import nkm.u;
import rz7.o;
import te0.v;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends iri.a implements o, rz7.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f210229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rz7.e f210230c;
    public final nkm.h d;

    public i(o petTypeFieldState, rz7.e petBreedFieldState) {
        Intrinsics.checkNotNullParameter(petTypeFieldState, "petTypeFieldState");
        Intrinsics.checkNotNullParameter(petBreedFieldState, "petBreedFieldState");
        this.f210229b = petTypeFieldState;
        this.f210230c = petBreedFieldState;
        v[] elements = {petTypeFieldState.h0(), petBreedFieldState.q0(), petBreedFieldState.A()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.d = u.i(kotlin.collections.d.E(elements), te0.e.class);
    }

    @Override // rz7.e
    public final v A() {
        return this.f210230c.A();
    }

    @Override // rz7.o
    public final v h0() {
        return this.f210229b.h0();
    }

    @Override // rz7.e
    public final v q0() {
        return this.f210230c.q0();
    }

    @Override // iri.a
    public final Sequence v0() {
        return this.d;
    }
}
