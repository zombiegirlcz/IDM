package qh4;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import grl.k9;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nii.n1;
import nii.y0;
import skm.k0;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.rollee.c f246458w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(com.revolut.feature.credit.application.plugins.impl.ui.rollee.c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f246458w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f246458w, continuation, 0);
            case 1:
                return new g(continuation, this.f246458w, 1);
            case 2:
                return new g(continuation, this.f246458w, 2);
            default:
                return new g(this.f246458w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((g) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((g) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.credit.application.plugins.impl.ui.rollee.c cVar = this.f246458w;
        Continuation continuation = null;
        int i2 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.rollee.a aVar2 = new com.revolut.feature.credit.application.plugins.impl.ui.rollee.a(cVar, continuation, i2);
                this.v = 1;
                d dVar = com.revolut.feature.credit.application.plugins.impl.ui.rollee.c.Companion;
                Object objB = pu7.a.B(cVar.k, "manual upload", aVar2, this);
                return objB == aVar ? aVar : objB;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (c84.t.N2(cVar, null, this, 3) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (c84.t.N2(cVar, null, this, 3) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.rollee.c.Companion.getClass();
                    long j2 = com.revolut.feature.credit.application.plugins.impl.ui.rollee.c.u;
                    this.v = 1;
                    if (k0.c(j2, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                d dVar2 = com.revolut.feature.credit.application.plugins.impl.ui.rollee.c.Companion;
                com.revolut.feature.credit.application.plugins.impl.ui.rollee.c cVar2 = this.f246458w;
                y0 y0VarP2 = cVar2.P2();
                if (y0VarP2 == null) {
                    return null;
                }
                cVar2.t1(y0VarP2);
                cVar2.f68336r.set(true);
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_common_error_title, null, null, 14);
                k9 k9Var = k9.Credit;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                yji.l.a1(cVar2, cVar2.X1(new y0(null, new nii.z(textLocalisedClause, null, null, null, null, null, true, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, null, null, null, 31998), false, 5)), null, null, new g(continuation, cVar2, 2), 3);
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Continuation continuation, com.revolut.feature.credit.application.plugins.impl.ui.rollee.c cVar, int i) {
        super(2, continuation);
        this.u = i;
        this.f246458w = cVar;
    }
}
