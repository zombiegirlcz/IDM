package g23;

import java.io.Serializable;
import java.util.List;
import klf.r2;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import tof.a3;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends gim.i implements oim.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int u;
    public /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Serializable f139798w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f139799x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f139800y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj2, Continuation continuation, int i) {
        super(6, continuation);
        this.u = i;
        this.A = obj2;
    }

    @Override // oim.p
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        switch (this.u) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                i iVar = new i((l) this.A, (Continuation) obj7, 0);
                iVar.f139798w = (do3.n) obj2;
                iVar.f139799x = (List) obj3;
                iVar.f139800y = (cl4.d) obj4;
                iVar.v = zBooleanValue;
                iVar.z = (cl4.o) obj6;
                return iVar.invokeSuspend(Unit.f186387a);
            default:
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                i iVar2 = new i((gkf.l) this.A, (Continuation) obj7, 1);
                iVar2.f139798w = (a3) obj2;
                iVar2.v = zBooleanValue2;
                iVar2.f139799x = (r2) obj4;
                iVar2.f139800y = (sq9.c) obj5;
                iVar2.z = (Pair) obj6;
                return iVar2.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0253  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 974
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g23.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
