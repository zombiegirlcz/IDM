package jmh;

import e5d.e;
import iw6.l;
import iyg.b0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import l5d.i;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.q;
import vmh.k;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements e {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ek1.a f176625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vmh.d f176626b;

    public c(ek1.a learnAirTipInteractor, vmh.d filterExtension) {
        Intrinsics.checkNotNullParameter(learnAirTipInteractor, "learnAirTipInteractor");
        Intrinsics.checkNotNullParameter(filterExtension, "filterExtension");
        this.f176625a = learnAirTipInteractor;
        this.f176626b = filterExtension;
    }

    @Override // e5d.e
    public final Object a(d5d.a aVar, i iVar) {
        Object objA;
        d5d.b bVar = aVar.f;
        kmh.a aVar2 = bVar instanceof kmh.a ? (kmh.a) bVar : null;
        if (aVar2 == null) {
            return Unit.f186387a;
        }
        String str = aVar.f111406a;
        yj1.e eVar = aVar2.f185887a;
        ek1.a aVar3 = this.f176625a;
        if (!aVar3.f126923c.add(str) || (objA = aVar3.f126922b.a(str, eVar, iVar)) != fim.a.COROUTINE_SUSPENDED) {
            objA = Unit.f186387a;
        }
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }

    @Override // e5d.e
    public final Object b(d5d.a aVar, i iVar) {
        Object objMarkAirTipAsOpened = this.f176625a.f126922b.f24741a.markAirTipAsOpened(aVar.f111406a, iVar);
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        if (objMarkAirTipAsOpened != aVar2) {
            objMarkAirTipAsOpened = Unit.f186387a;
        }
        if (objMarkAirTipAsOpened != aVar2) {
            objMarkAirTipAsOpened = Unit.f186387a;
        }
        return objMarkAirTipAsOpened == aVar2 ? objMarkAirTipAsOpened : Unit.f186387a;
    }

    @Override // e5d.e
    public final Flow c() {
        return q.Q(q.q(new b0((j2) ((k) this.f176626b).f290594p.f22677a, 6)), new l((Continuation) null, this, 20));
    }
}
