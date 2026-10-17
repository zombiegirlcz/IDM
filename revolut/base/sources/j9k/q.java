package j9k;

import com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillLinkDetails;
import efm.d0;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import tof.i3;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t f172376w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ SplitBillLinkDetails f172377x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(t tVar, SplitBillLinkDetails splitBillLinkDetails, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f172376w = tVar;
        this.f172377x = splitBillLinkDetails;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q(this.f172376w, this.f172377x, continuation, 0);
            default:
                return new q(this.f172376w, this.f172377x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        SplitBillLinkDetails splitBillLinkDetails = this.f172377x;
        t tVar = this.f172376w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                try {
                    if (i2 == 0) {
                        yhm.o.b(obj2);
                        ge3.e eVar = tVar.d;
                        String lowerCase = splitBillLinkDetails.f79946g.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        d0 d0VarFirstOrError = m70.a.g(((le3.b0) eVar).e(lowerCase, null), null, new j7b.m(9), 1).firstOrError();
                        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                        this.v = 1;
                        obj2 = nim.a.b(d0VarFirstOrError, this);
                        if (obj2 == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                    }
                    return (i3) obj2;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e2, h0Var);
                    return null;
                }
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                rfm.z zVarF = ((wl3.h) tVar.f172384b).f(splitBillLinkDetails.f79944b);
                this.v = 1;
                Object objH = nim.a.h(zVarF, this);
                return objH == aVar2 ? aVar2 : objH;
        }
    }
}
