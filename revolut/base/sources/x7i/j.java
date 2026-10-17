package x7i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.feature_move_money.impl.model.MoveMoneyOrderInfo;
import com.revolut.shared.feature.move_money.api.model.MoveMoneyReason;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends gim.i implements Function1 {
    public final /* synthetic */ String A;
    public int u;
    public final /* synthetic */ MoveMoneyOrderInfo v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f303225w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AccountWrapper f303226x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ AccountWrapper f303227y;
    public final /* synthetic */ MoveMoneyReason z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(MoveMoneyOrderInfo moveMoneyOrderInfo, l lVar, AccountWrapper accountWrapper, AccountWrapper accountWrapper2, MoveMoneyReason moveMoneyReason, String str, Continuation continuation) {
        super(1, continuation);
        this.v = moveMoneyOrderInfo;
        this.f303225w = lVar;
        this.f303226x = accountWrapper;
        this.f303227y = accountWrapper2;
        this.z = moveMoneyReason;
        this.A = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new j(this.v, this.f303225w, this.f303226x, this.f303227y, this.z, this.A, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((j) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
    
        if (r0 == r10) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ab, code lost:
    
        if (r0 == r10) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c1, code lost:
    
        if (r0 == r10) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ea, code lost:
    
        if (r0 == r10) goto L47;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x7i.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
