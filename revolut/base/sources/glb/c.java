package glb;

import com.revolut.feature.shared.savings.models.info_sheets.InfoSheetParams;
import gim.i;
import hx7.e;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.savings.impl.core.info_sheets.presentation.flow.a f144602w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.revolut.feature.retail.savings.impl.core.info_sheets.presentation.flow.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f144602w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.f144602w, continuation);
        cVar.v = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objA;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        try {
            if (i == 0) {
                o.b(obj2);
                com.revolut.feature.retail.savings.impl.core.info_sheets.presentation.flow.a aVar2 = this.f144602w;
                m.Companion companion = m.INSTANCE;
                ccd.a aVar3 = aVar2.f83216p;
                InfoSheetParams.Companion companion2 = InfoSheetParams.INSTANCE;
                InfoSheetParams infoSheetParams = aVar2.o.f83212a;
                companion2.getClass();
                Intrinsics.checkNotNullParameter(infoSheetParams, "<this>");
                mcd.c cVar = new mcd.c(infoSheetParams.f86509b, infoSheetParams.f86510c, infoSheetParams.d, u.c(infoSheetParams.f86508a));
                this.v = null;
                this.u = 1;
                Object objD = aVar3.f23026a.d.d(cVar, false, this);
                if (objD != aVar) {
                    objD = Unit.f186387a;
                }
                if (objD != aVar) {
                    objD = Unit.f186387a;
                }
                if (objD == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            objA = Unit.f186387a;
            m.Companion companion3 = m.INSTANCE;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion4 = m.INSTANCE;
            objA = o.a(th10);
        }
        Throwable thA = m.a(objA);
        if (thA != null) {
            e.n(thA);
        }
        if (objA instanceof n) {
            return null;
        }
        return objA;
    }
}
