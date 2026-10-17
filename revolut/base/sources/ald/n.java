package ald;

import com.revolut.data.network.models.topup.MultiCurrencyTransferReviewRequest;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import cp4.i0;
import dp4.n0;
import dp4.o0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes13.dex */
public final class n extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f6238w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f6239x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f6239x = obj2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                n nVar = new n((r) this.f6239x, (Continuation) obj4, 0);
                nVar.f6238w = (SlotContext) obj3;
                return nVar.invokeSuspend(Unit.f186387a);
            case 1:
                n nVar2 = new n((o0) this.f6239x, (Continuation) obj4, 1);
                nVar2.f6238w = (n0) obj3;
                return nVar2.invokeSuspend(Unit.f186387a);
            case 2:
                n nVar3 = new n((o0) this.f6239x, (Continuation) obj4, 2);
                nVar3.f6238w = (i0) obj3;
                return nVar3.invokeSuspend(Unit.f186387a);
            case 3:
                n nVar4 = new n((e31.j) this.f6239x, (Continuation) obj4, 3);
                nVar4.f6238w = (MultiCurrencyTransferReviewRequest) obj3;
                return nVar4.invokeSuspend(Unit.f186387a);
            case 4:
                n nVar5 = new n((ff8.d) this.f6239x, (Continuation) obj4, 4);
                nVar5.f6238w = (String) obj3;
                return nVar5.invokeSuspend(Unit.f186387a);
            case 5:
                n nVar6 = new n((hi3.i) this.f6239x, (Continuation) obj4, 5);
                nVar6.f6238w = (hi3.e) obj3;
                return nVar6.invokeSuspend(Unit.f186387a);
            case 6:
                n nVar7 = new n((qj8.j) this.f6239x, (Continuation) obj4, 6);
                nVar7.f6238w = (String) obj3;
                return nVar7.invokeSuspend(Unit.f186387a);
            case 7:
                n nVar8 = new n((xr3.k) this.f6239x, (Continuation) obj4, 7);
                nVar8.f6238w = (xr3.i) obj3;
                return nVar8.invokeSuspend(Unit.f186387a);
            case 8:
                n nVar9 = new n((zuh.o) this.f6239x, (Continuation) obj4, 8);
                nVar9.f6238w = (zuh.g) obj3;
                return nVar9.invokeSuspend(Unit.f186387a);
            default:
                n nVar10 = new n((zuh.o) this.f6239x, (Continuation) obj4, 9);
                nVar10.f6238w = (pil.d) obj3;
                return nVar10.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d A[LOOP:1: B:29:0x0097->B:31:0x009d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d5 A[LOOP:0: B:38:0x00cf->B:40:0x00d5, LOOP_END] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v16, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v9, types: [fim.a] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ald.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
