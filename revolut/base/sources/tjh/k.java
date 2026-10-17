package tjh;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KTypeProjection;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ RowDelegate.Model v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h0 f271755w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(RowDelegate.Model model, Continuation continuation, h0 h0Var) {
        super(1, continuation);
        this.v = model;
        this.f271755w = h0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new k(this.v, continuation, this.f271755w);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((k) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            Object obj3 = this.v.u;
            wjh.l lVar = obj3 instanceof wjh.l ? (wjh.l) obj3 : null;
            if (lVar == null) {
                r6.b.D("handle expand collapse click called but parcel isn't account header payload!");
            }
            if (lVar == null || (str = lVar.f298104a) == null) {
                return null;
            }
            h hVar = h0.Companion;
            h0 h0Var = this.f271755w;
            LinkedHashMap linkedHashMapZ = r0.z(((bih.h) h0Var.b3()).f15496a);
            linkedHashMapZ.put(str, Boolean.valueOf(!(((Boolean) linkedHashMapZ.get(str)) != null ? r4.booleanValue() : false)));
            jlh.f fVar = h0Var.f271738t;
            this.u = 1;
            Object obj4 = ((ulh.n) ((jlh.o) fVar).f175787a).f281020a.get();
            Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
            ((ue0.c) obj4).G(linkedHashMapZ, "INVEST_ACCOUNT_WIDGETS_COLLAPSED", wim.z.d(o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(o0.b(Boolean.TYPE)))));
            if (Unit.f186387a == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
