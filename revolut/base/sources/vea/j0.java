package vea;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class j0 {

    @NotNull
    private static final h0 Companion = new h0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f288200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f288201c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f288202a;

    static {
        io3.l[] elements = {io3.l.CURRENT, io3.l.STAKING, io3.l.STAKING_PROXY};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f288200b = kotlin.collections.d.y0(elements);
        io3.k[] elements2 = {io3.k.ACTIVE, io3.k.INACTIVE};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        f288201c = kotlin.collections.d.y0(elements2);
    }

    public j0(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f288202a = featureToggleInteractor;
    }

    public static boolean b(io3.d dVar) {
        return dVar.f163149h == io3.i.INTERNAL && dVar.f163148g == io3.j.PERSONAL && f288201c.contains(dVar.f);
    }

    public final Set a(List pockets) {
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        return nkm.y.L(nkm.y.x(nkm.y.n(nkm.y.n(zhm.d0.Q(pockets), new ux7.i(1, this, j0.class, "isOwnershipPocket", "isOwnershipPocket(Lcom/revolut/feature/core/model/domain/wallet/pocket/Pocket;)Z", 0, 26)), new n(4)), new kotlin.jvm.internal.h0() { // from class: vea.i0
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj2) {
                return ((io3.d) obj2).f163147c;
            }
        }));
    }
}
