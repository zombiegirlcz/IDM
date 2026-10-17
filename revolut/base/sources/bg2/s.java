package bg2;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final class s extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f15076w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f15077x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f15078y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(int i, ew1.m mVar, Continuation continuation) {
        super(1, continuation);
        this.u = 2;
        this.f15078y = mVar;
        this.f15077x = i;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s((x) this.f15078y, continuation, 0);
            case 1:
                return new s((dhi.i) this.f15078y, continuation, 1);
            case 2:
                return new s(this.f15077x, (ew1.m) this.f15078y, continuation);
            case 3:
                return new s((yvh.b) this.v, (com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_banner_grid_spare_change.a) this.f15078y, this.f15077x, continuation, 3);
            case 4:
                return new s((com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.b) this.v, (ai4.h) this.f15078y, this.f15077x, continuation, 4);
            case 5:
                return new s((yvh.b) this.v, (com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_grid_spare_change.a) this.f15078y, this.f15077x, continuation, 5);
            case 6:
                return new s((yvh.b) this.v, (com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_list_spare_change.a) this.f15078y, this.f15077x, continuation, 6);
            case 7:
                return new s((yvh.b) this.v, (com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_multiplier_spare_change.a) this.f15078y, this.f15077x, continuation, 7);
            default:
                return new s((yvh.b) this.v, (com.revolut.feature.rev_points.spare_change.impl.ui.screen.spare_change.a) this.f15078y, this.f15077x, continuation, 8);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((s) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Object obj2, Object obj3, int i, Continuation continuation, int i2) {
        super(1, continuation);
        this.u = i2;
        this.v = obj2;
        this.f15078y = obj3;
        this.f15077x = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(oki.h hVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f15078y = hVar;
    }
}
