package ypk;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.R$string;
import dfj.s3;
import gim.i;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import nfj.f2;
import nfj.s2;
import nii.y0;
import nii.z;
import skm.e0;
import skm.p0;
import yhm.m;
import yhm.n;
import yhm.o;
import zmj.g0;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends i implements Function2 {
    public final /* synthetic */ int u = 1;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f315944w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f315945x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f315946y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a aVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f315946y = aVar;
        this.f315945x = z;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f315945x, (g) this.f315946y, continuation);
                fVar.f315944w = obj2;
                return fVar;
            default:
                f fVar2 = new f((com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a) this.f315946y, this.f315945x, continuation);
                fVar2.f315944w = obj2;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objA;
        int i = this.u;
        Object obj3 = this.f315946y;
        int i2 = 1;
        switch (i) {
            case 0:
                FlowCollector flowCollector = (FlowCollector) this.f315944w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    if (this.f315945x) {
                        ArrayList arrayListC = ((u9j.e) ((g) obj3).o).c();
                        this.f315944w = null;
                        this.v = 1;
                        if (flowCollector.emit(arrayListC, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a aVar2 = (com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a) obj3;
                Object obj4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                boolean z = this.f315945x;
                Continuation continuation = null;
                try {
                    if (i5 == 0) {
                        o.b(obj2);
                        m.Companion companion = m.INSTANCE;
                        s3 s3Var = aVar2.f101428q;
                        String str = aVar2.o.f101418a;
                        this.f315944w = null;
                        this.v = 1;
                        s2 s2Var = (s2) s3Var.f114105a;
                        s2Var.getClass();
                        f2 f2Var = new f2(s2Var, str, z, continuation, 0);
                        p0 p0Var = p0.f264001a;
                        Object objJ = e0.J(elm.f.f127540b, f2Var, this);
                        if (objJ != obj4) {
                            objJ = Unit.f186387a;
                        }
                        if (objJ != obj4) {
                            objJ = Unit.f186387a;
                        }
                        if (objJ == obj4) {
                            return obj4;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                    }
                    objA = Unit.f186387a;
                    m.Companion companion2 = m.INSTANCE;
                    break;
                } catch (Throwable th10) {
                    m.Companion companion3 = m.INSTANCE;
                    objA = o.a(th10);
                }
                if (objA instanceof n) {
                    aVar2.H2(aVar2.J, new g0(aVar2, !z, i2));
                    aVar2.f101431t.getClass();
                    aVar2.X1(new y0("AUTO_RENEWAL_ERROR_DIALOG", new z(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_checkout_autorenewal_error_description, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4));
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z, g gVar, Continuation continuation) {
        super(2, continuation);
        this.f315945x = z;
        this.f315946y = gVar;
    }
}
