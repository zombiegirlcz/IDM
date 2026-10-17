package sce;

import com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplit;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qua.p;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f261722w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ mm.g f261723x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, mm.g gVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f261722w = eVar;
        this.f261723x = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f261722w, this.f261723x, continuation, 0);
            case 1:
                return new d(this.f261722w, this.f261723x, continuation, 1);
            case 2:
                return new d(this.f261722w, this.f261723x, continuation, 2);
            default:
                return new d(this.f261722w, this.f261723x, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        mm.g gVar = this.f261723x;
        e eVar = this.f261722w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    k1a.g gVar2 = eVar.f261727g;
                    String str = ((RecurringSplit) gVar.f207101a).f79920a;
                    this.v = 1;
                    if (gVar2.a(str, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                vz1.g gVar3 = eVar.d;
                String str2 = ((p) gVar.f207101a).f249314a.f160150a;
                this.v = 1;
                vz1.e eVar2 = new vz1.e(gVar3, str2, null, 0);
                p0 p0Var = p0.f264001a;
                Object objJ = e0.J(elm.f.f127540b, eVar2, this);
                return objJ == aVar2 ? aVar2 : objJ;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    vz1.g gVar4 = eVar.d;
                    String str3 = ((p) gVar.f207101a).f249314a.f160150a;
                    this.v = 1;
                    vz1.e eVar3 = new vz1.e(gVar4, str3, null, 1);
                    p0 p0Var2 = p0.f264001a;
                    if (e0.J(elm.f.f127540b, eVar3, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    o.b(obj2);
                    vz1.g gVar5 = eVar.d;
                    String str4 = ((p) gVar.f207101a).f249314a.f160150a;
                    this.v = 1;
                    vz1.e eVar4 = new vz1.e(gVar5, str4, null, 2);
                    p0 p0Var3 = p0.f264001a;
                    if (e0.J(elm.f.f127540b, eVar4, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
