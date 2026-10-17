package m98;

import com.revolut.data.model.Data;
import klf.j1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import mkf.c0;
import tof.a3;
import tof.t3;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends gim.i implements oim.o {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f203653w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f203654x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f203655y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj2, Continuation continuation, int i) {
        super(5, continuation);
        this.u = i;
        this.z = obj2;
    }

    @Override // oim.o
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        switch (this.u) {
            case 0:
                m mVar = new m((p) this.z, (Continuation) obj6, 0);
                mVar.v = (Data) obj2;
                mVar.f203653w = (Data) obj3;
                mVar.f203654x = (Data) obj4;
                mVar.f203655y = (Data) obj5;
                return mVar.invokeSuspend(Unit.f186387a);
            default:
                m mVar2 = new m((c0) this.z, (Continuation) obj6, 1);
                mVar2.v = (a3) obj2;
                mVar2.f203653w = (t3) obj3;
                mVar2.f203654x = (qua.p) obj4;
                mVar2.f203655y = (j1) obj5;
                return mVar2.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m98.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
