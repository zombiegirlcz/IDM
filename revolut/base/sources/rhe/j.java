package rhe;

import com.revolut.feature.tab.accounts.models.NonProductAccountFilter;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tof.i7;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ NonProductAccountFilter v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f254426w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Set f254427x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(NonProductAccountFilter nonProductAccountFilter, m mVar, Set set, Continuation continuation) {
        super(1, continuation);
        this.v = nonProductAccountFilter;
        this.f254426w = mVar;
        this.f254427x = set;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new j(this.v, this.f254426w, this.f254427x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((j) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            NonProductAccountFilter.Crypto crypto = NonProductAccountFilter.Crypto.f89715a;
            NonProductAccountFilter nonProductAccountFilter = this.v;
            if (!Intrinsics.f(nonProductAccountFilter, crypto)) {
                if (nonProductAccountFilter instanceof NonProductAccountFilter.Invest) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            this.u = 1;
            obj2 = m.a(this.f254426w, this.f254427x, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return (i7) obj2;
    }
}
