package dfj;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes11.dex */
public final class c4 extends gim.i implements Function1 {
    public final /* synthetic */ int u = 2;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f113933w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f113934x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f113935y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(com.revolut.feature_move_money.impl.topup.a aVar, AccountWrapper accountWrapper, AccountWrapper accountWrapper2, long j2, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
        this.f113935y = accountWrapper;
        this.f113934x = accountWrapper2;
        this.z = j2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c4((Ref$ObjectRef) this.f113935y, this.z, (k4) this.f113934x, continuation);
            case 1:
                return new c4((k4) this.f113934x, (Ref$ObjectRef) this.f113935y, this.z, continuation);
            default:
                return new c4((com.revolut.feature_move_money.impl.topup.a) this.v, (AccountWrapper) this.f113935y, (AccountWrapper) this.f113934x, this.z, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((c4) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00b5 -> B:37:0x00b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00e4 -> B:47:0x00e5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x013f -> B:68:0x0140). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dfj.c4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(k4 k4Var, Ref$ObjectRef ref$ObjectRef, long j2, Continuation continuation) {
        super(1, continuation);
        this.f113934x = k4Var;
        this.f113935y = ref$ObjectRef;
        this.z = j2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(Ref$ObjectRef ref$ObjectRef, long j2, k4 k4Var, Continuation continuation) {
        super(1, continuation);
        this.f113935y = ref$ObjectRef;
        this.z = j2;
        this.f113934x = k4Var;
    }
}
