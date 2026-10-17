package mmh;

import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f207231w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f207231w = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f207231w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            case 1:
                h hVar2 = new h(this.f207231w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
            default:
                h hVar3 = new h(this.f207231w, continuation, 2);
                hVar3.v = obj2;
                return hVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((emh.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                ((h) create(null, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                throw null;
            default:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                ((h) create(null, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                throw null;
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                emh.a details = (emh.a) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVar = this.f207231w.f207232c;
                Intrinsics.checkNotNullParameter(details, "details");
                jVar.A2(new AssetDetailsDestination(details.f127656a.f214596b, null, false, null, null, null, 62));
                return Unit.f186387a;
            case 1:
                if (this.v != null) {
                    throw new ClassCastException();
                }
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Intrinsics.checkNotNullParameter(null, "seeAllAssets");
                throw null;
            default:
                if (this.v != null) {
                    throw new ClassCastException();
                }
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Intrinsics.checkNotNullParameter(null, "seeAllAssets");
                throw null;
        }
    }
}
