package vge;

import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes8.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ pfe.b f288995w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ProductAccountDescriptor$Value f288996x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ x f288997y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(pfe.b bVar, ProductAccountDescriptor$Value productAccountDescriptor$Value, x xVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f288995w = bVar;
        this.f288996x = productAccountDescriptor$Value;
        this.f288997y = xVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s(this.f288995w, this.f288996x, this.f288997y, continuation, 0);
            default:
                return new s(this.f288995w, this.f288996x, this.f288997y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((s) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        HomeFeedWidgetContext widgetContext;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    Flow flowB = this.f288995w.b(this.f288996x.getF89728b());
                    if (flowB == null) {
                        return null;
                    }
                    vkm.y yVarD = rd0.e.d(vkm.q.H(new r(this.f288997y, null), vkm.q.q(flowB)), zhm.h0.f322473a);
                    this.v = 1;
                    obj2 = vkm.q.z(yVarD, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return (Unit) obj2;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    ProductAccountId f89728b = this.f288996x.getF89728b();
                    this.v = 1;
                    obj2 = this.f288995w.i(f89728b, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                Continuation continuation = null;
                if (!(obj2 instanceof sfe.z)) {
                    obj2 = null;
                }
                sfe.z zVar = (sfe.z) obj2;
                if (zVar == null || (widgetContext = zVar.f262437a) == null) {
                    return Unit.f186387a;
                }
                ish.z zVar2 = (ish.z) this.f288997y.f289054j;
                Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
                vkm.y yVarD2 = rd0.e.d(new ble.c1(new vkm.v1(new i4g.d(zVar2, widgetContext, continuation, 8)), 28), zhm.h0.f322473a);
                this.v = 2;
                if (vkm.q.z(yVarD2, this) == aVar2) {
                    return aVar2;
                }
                return Unit.f186387a;
        }
    }
}
