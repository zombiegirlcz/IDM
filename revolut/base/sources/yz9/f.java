package yz9;

import h6i.q0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import tof.a3;
import vkm.j2;
import vkm.q;
import y4f.o;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f318057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j2 f318058b;

    public f(q0 countryProfilesProvider) {
        Intrinsics.checkNotNullParameter(countryProfilesProvider, "countryProfilesProvider");
        this.f318057a = countryProfilesProvider;
        this.f318058b = q.c(null);
    }

    @Override // yz9.c
    public final Flow a() {
        return q.Q(q.h(this.f318058b), new o(null, this, 25));
    }

    @Override // yz9.c
    public final void b(a3 a3Var) {
        this.f318058b.setValue(a3Var);
    }
}
