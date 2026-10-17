package gce;

import com.revolut.data.model.Data;
import klf.j1;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import oim.n;
import qua.p;
import tof.a3;
import xkf.v0;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends gim.i implements n {
    public final /* synthetic */ int u;
    public /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f142429w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f142430x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f142431y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj2, Continuation continuation, int i) {
        super(4, continuation);
        this.u = i;
        this.f142431y = obj2;
    }

    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.u) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                l lVar = new l((p) this.f142431y, (Continuation) obj5, 0);
                lVar.f142429w = (od0.i) obj2;
                lVar.v = zBooleanValue;
                lVar.f142430x = (Data) obj4;
                return lVar.invokeSuspend(Unit.f186387a);
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                l lVar2 = new l((iv5.l) this.f142431y, (Continuation) obj5, 1);
                lVar2.v = zBooleanValue2;
                lVar2.f142429w = (ut5.j) obj3;
                lVar2.f142430x = (ut5.j) obj4;
                return lVar2.invokeSuspend(Unit.f186387a);
            case 2:
                boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
                l lVar3 = new l((vkf.j) this.f142431y, (Continuation) obj5, 2);
                lVar3.f142429w = (Pair) obj2;
                lVar3.v = zBooleanValue3;
                lVar3.f142430x = (j1) obj4;
                return lVar3.invokeSuspend(Unit.f186387a);
            default:
                boolean zBooleanValue4 = ((Boolean) obj4).booleanValue();
                l lVar4 = new l((v0) this.f142430x, (Continuation) obj5);
                lVar4.f142429w = (a3) obj2;
                lVar4.f142431y = (p) obj3;
                lVar4.v = zBooleanValue4;
                return lVar4.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r47) {
        /*
            Method dump skipped, instruction units count: 2354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gce.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(v0 v0Var, Continuation continuation) {
        super(4, continuation);
        this.u = 3;
        this.f142430x = v0Var;
    }
}
