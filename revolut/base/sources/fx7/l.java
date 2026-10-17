package fx7;

import efm.r;
import kotlin.jvm.internal.Intrinsics;
import kx7.c0;
import kx7.f0;
import kx7.h0;
import kx7.k0;
import kx7.l0;
import zw7.p;

/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f138768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f138769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f138770c;

    public l(l0 petRepository, c0 quoteRepository, k0 renewalRepository) {
        Intrinsics.checkNotNullParameter(petRepository, "petRepository");
        Intrinsics.checkNotNullParameter(quoteRepository, "quoteRepository");
        Intrinsics.checkNotNullParameter(renewalRepository, "renewalRepository");
        this.f138768a = petRepository;
        this.f138769b = quoteRepository;
        this.f138770c = renewalRepository;
    }

    public final r a(String petId, p petData, boolean z) {
        Intrinsics.checkNotNullParameter(petId, "petId");
        Intrinsics.checkNotNullParameter(petData, "petData");
        h0 h0Var = (h0) this.f138769b;
        h0Var.getClass();
        Intrinsics.checkNotNullParameter(petId, "petId");
        Intrinsics.checkNotNullParameter(petData, "petData");
        return ((w4l.f) h0Var.d.getValue()).f(new f0(petId, petData), z);
    }
}
