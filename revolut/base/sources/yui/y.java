package yui;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.airport.security_fast_track.impl.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import nii.y0;
import vkm.j2;
import zsi.f;

/* JADX INFO: loaded from: classes10.dex */
public final class y extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.a f317056w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f317056w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                y yVar = new y(this.f317056w, continuation, 0);
                yVar.v = obj2;
                return yVar;
            case 1:
                y yVar2 = new y(this.f317056w, continuation, 1);
                yVar2.v = obj2;
                return yVar2;
            default:
                y yVar3 = new y(this.f317056w, continuation, 2);
                yVar3.v = obj2;
                return yVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((y) create((vf0.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((y) create((gui.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((y) create((zsi.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 17;
        com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.a aVar = this.f317056w;
        switch (i) {
            case 0:
                vf0.h hVar = (vf0.h) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Data data = (Data) hVar.f288433a;
                Data data2 = (Data) hVar.f288434b;
                Data data3 = (Data) hVar.f288435c;
                Data data4 = (Data) hVar.d;
                com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.a aVar3 = this.f317056w;
                aVar3.H2(aVar3.f98893x, new ryd.f(data, data2, data3, data4, aVar3, 18));
                return Unit.f186387a;
            case 1:
                cli.y yVar = aVar.f98893x;
                gui.f fVar = (gui.f) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (fVar instanceof gui.c) {
                    aVar.H2(yVar, new ysk.a(16));
                } else if (fVar instanceof gui.d) {
                    aVar.H2(yVar, new ysk.a(i2));
                    gui.d dVar = (gui.d) fVar;
                    aVar.C2(new m(dVar.f146948a, dVar.f146949b, dVar.f146950c, dVar.d));
                } else if (fVar instanceof gui.e) {
                    aVar.H2(yVar, new ysk.a(18));
                } else if (fVar instanceof gui.b) {
                    aVar.H2(yVar, new ysk.a(19));
                    hx7.e.h(new IllegalStateException("Purchase from this point could be only for zero price"));
                } else {
                    if (!(fVar instanceof gui.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.H2(yVar, new ysk.a(20));
                }
                return Unit.f186387a;
            default:
                cli.y yVar2 = aVar.f98893x;
                zsi.f fVar2 = (zsi.f) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (fVar2 instanceof zsi.g) {
                    aVar.H2(yVar2, new yuc.p(fVar2, 6));
                } else {
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    boolean z = fVar2 instanceof f.c;
                    l lVarA = l.a((l) ((j2) yVar2.f22677a).getValue(), null, null, null, null, 0, null, null, null, null, null, z, fVar2 instanceof f.d, fVar2 instanceof f.a, false, 8447);
                    ref$ObjectRef.f186409a = lVarA;
                    if (z) {
                        ref$ObjectRef.f186409a = l.a(lVarA, null, null, null, null, 0, null, null, null, null, null, false, false, false, false, 16319);
                    }
                    aVar.H2(yVar2, new b79.i(ref$ObjectRef, i2));
                }
                if (fVar2 instanceof f.b) {
                    aVar.X1(new y0(null, new nii.z(new TextLocalisedClause(R$string.asft_common_state_error_title, null, null, 14), new TextLocalisedClause(R$string.asft_common_state_error_subtitle, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5));
                }
                return Unit.f186387a;
        }
    }
}
