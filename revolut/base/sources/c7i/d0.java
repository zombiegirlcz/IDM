package c7i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import k50.n4;
import k50.x4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class d0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f21998w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f21999x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f22000y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(long j2, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f22000y = obj2;
        this.f21998w = j2;
        this.z = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d0((com.revolut.feature_move_money.impl.automation.screen.c) this.f21999x, (AccountWrapper) this.f22000y, (AccountWrapper) this.z, this.f21998w, continuation);
            case 1:
                d0 d0Var = new d0(this.f21998w, (dj0.d) this.f22000y, (ei3.m) this.z, continuation, 1);
                d0Var.f21999x = obj2;
                return d0Var;
            case 2:
                d0 d0Var2 = new d0((n4) this.f22000y, (x4) this.z, continuation, 2);
                d0Var2.f21999x = obj2;
                return d0Var2;
            case 3:
                d0 d0Var3 = new d0(this.f21998w, (Flow) this.f22000y, this.z, continuation, 3);
                d0Var3.f21999x = obj2;
                return d0Var3;
            case 4:
                return new d0(this.f21998w, (Function0) this.f21999x, (ProducerScope) this.f22000y, this.z, continuation);
            default:
                d0 d0Var4 = new d0((xvf.m) this.f22000y, (axf.a) this.z, continuation, 5);
                d0Var4.f21999x = obj2;
                return d0Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d0) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((d0) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((d0) create((ProducerScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((d0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d0) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006f -> B:13:0x004e). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c7i.d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(long j2, Function0 function0, ProducerScope producerScope, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.u = 4;
        this.f21998w = j2;
        this.f21999x = function0;
        this.f22000y = producerScope;
        this.z = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.revolut.feature_move_money.impl.automation.screen.c cVar, AccountWrapper accountWrapper, AccountWrapper accountWrapper2, long j2, Continuation continuation) {
        super(2, continuation);
        this.u = 0;
        this.f21999x = cVar;
        this.f22000y = accountWrapper;
        this.z = accountWrapper2;
        this.f21998w = j2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f22000y = obj2;
        this.z = obj3;
    }
}
