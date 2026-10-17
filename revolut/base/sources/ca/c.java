package ca;

import com.feature.feature_meta_sso_api.navigation.OutputData;
import gim.i;
import java.io.UnsupportedEncodingException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;
import yhm.o;

/* JADX INFO: loaded from: classes16.dex */
public final class c extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws UnsupportedEncodingException {
        n1 n1Var = (n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (!(n1Var instanceof j1)) {
            boolean z = n1Var instanceof l1;
            d dVar = this.v;
            if (z) {
                dVar.I2();
            } else {
                if (!(n1Var instanceof k1) && !(n1Var instanceof m1)) {
                    throw new NoWhenBranchMatchedException();
                }
                dVar.C2(OutputData.Cancelled.f26213a);
            }
        }
        return Unit.f186387a;
    }
}
