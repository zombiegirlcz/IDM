package hea;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import vkm.z1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f151660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.pockets.impl.details_v2.pocket_details.a f151661b;

    public /* synthetic */ r(com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar, int i) {
        this.f151660a = i;
        this.f151661b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f151660a) {
            case 0:
                Intrinsics.checkNotNullParameter((til.r) obj2, "it");
                z1 z1Var = this.f151661b.T;
                Unit unit = Unit.f186387a;
                z1Var.k(unit);
                return unit;
            default:
                hda.c it8 = (hda.c) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (!(it8 instanceof hda.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                hda.b bVar = (hda.b) it8;
                io3.d dVar = bVar.f151397a;
                wi0.b bVar2 = bVar.f151398b;
                boolean z = bVar.f151399c;
                com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar = this.f151661b;
                cli.y yVar = aVar.U;
                if (!dVar.equals(((o) ((j2) yVar.f22677a).getValue()).f151646a) || !Intrinsics.f(bVar2, ((o) ((j2) yVar.f22677a).getValue()).f151650h)) {
                    aVar.H2(yVar, new g48.h(dVar, bVar2, z, 6));
                }
                return Unit.f186387a;
        }
    }
}
