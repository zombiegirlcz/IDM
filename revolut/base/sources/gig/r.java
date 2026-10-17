package gig;

import a83.p0;
import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.miles.api.model.TravelMilesProvider;
import hfg.z;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u = 0;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f144206w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.f144206w = sVar;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r(this.f144206w, this.v, continuation);
            default:
                r rVar = new r(this.f144206w, continuation);
                rVar.v = obj2;
                return rVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((r) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((r) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data;
        TravelMilesProvider travelMilesProvider;
        Object next;
        int i = this.u;
        s sVar = this.f144206w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                TravelMilesProvider travelMilesProvider2 = ((iig.a) this.v).f161612a;
                y yVar = sVar.f144211t;
                hfg.y yVar2 = ((g) ((j2) yVar.f22677a).getValue()).f144191c;
                String str = yVar2 != null ? yVar2.f151899b : null;
                hfg.y yVar3 = ((g) ((j2) yVar.f22677a).getValue()).f144191c;
                sVar.C2(new k(travelMilesProvider2, str, yVar3 != null ? yVar3.f151900c : null));
                return Unit.f186387a;
            default:
                Pair pair = (Pair) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Data data2 = (Data) pair.f186385a;
                Data dataT = t1.t(data2, (Data) pair.f186386b);
                try {
                    Object content = dataT.getContent();
                    if (content != null) {
                        Pair pair2 = (Pair) content;
                        z zVar = (z) pair2.f186385a;
                        Iterator it8 = ((List) pair2.f186386b).iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                next = it8.next();
                                if (Intrinsics.f(((TravelMilesProvider) next).f94103a, zVar.e)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        travelMilesProvider = (TravelMilesProvider) next;
                        if (travelMilesProvider == null) {
                            throw new IllegalStateException("Can't find Miles Provider for id: " + zVar.e);
                        }
                    } else {
                        travelMilesProvider = null;
                    }
                    data = new Data(travelMilesProvider, dataT.getError(), dataT.getLoading());
                } catch (Throwable th10) {
                    data = new Data(null, th10, dataT.getLoading());
                }
                Throwable error = data2.getError();
                if (error == null) {
                    error = data.getError();
                }
                if (error != null) {
                    sVar.X1(sVar.f144207p.a(error));
                }
                sVar.H2(sVar.f144211t, new p0(data2, data, 21));
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, Continuation continuation) {
        super(2, continuation);
        this.f144206w = sVar;
    }
}
