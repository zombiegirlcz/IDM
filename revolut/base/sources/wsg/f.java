package wsg;

import atg.v;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import efm.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import wp5.x;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f299718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f299719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f299720c;
    public final /* synthetic */ AccountId d;

    public /* synthetic */ f(n nVar, String str, AccountId accountId, int i) {
        this.f299718a = i;
        this.f299719b = nVar;
        this.f299720c = str;
        this.d = accountId;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        pfm.a aVar;
        pfm.a aVar2;
        Data pocketData = (Data) obj2;
        switch (this.f299718a) {
            case 0:
                Intrinsics.checkNotNullParameter(pocketData, "pocketData");
                io3.d dVar = (io3.d) pocketData.getContent();
                if (dVar == null) {
                    return pfm.m.f235744a;
                }
                io3.i iVar = dVar.f163149h;
                io3.i iVar2 = io3.i.EXTERNAL;
                n nVar = this.f299719b;
                String str = this.f299720c;
                if (iVar == iVar2) {
                    d0 d0VarFirstOrError = m70.a.g(nVar.V(), null, new e(2), 1).firstOrError();
                    x xVar = new x(new g(nVar, str, 1), 16);
                    d0VarFirstOrError.getClass();
                    aVar = new pfm.a(d0VarFirstOrError, xVar, 4);
                } else {
                    if (!r6.b.B(xi0.b.Companion, dVar.f163147c)) {
                        return ((v) nVar.f299736b).g(this.d, str);
                    }
                    d0 d0VarFirstOrError2 = m70.a.g(osg.b.n(nVar, null, 2), null, new e(3), 1).firstOrError();
                    x xVar2 = new x(new g(nVar, str, 2), 17);
                    d0VarFirstOrError2.getClass();
                    aVar = new pfm.a(d0VarFirstOrError2, xVar2, 4);
                }
                return aVar;
            default:
                Intrinsics.checkNotNullParameter(pocketData, "pocketData");
                io3.d dVar2 = (io3.d) pocketData.getContent();
                if (dVar2 == null) {
                    return pfm.m.f235744a;
                }
                io3.i iVar3 = dVar2.f163149h;
                io3.i iVar4 = io3.i.EXTERNAL;
                n nVar2 = this.f299719b;
                String str2 = this.f299720c;
                if (iVar3 == iVar4) {
                    d0 d0VarFirstOrError3 = m70.a.g(nVar2.V(), null, new e(8), 1).firstOrError();
                    x xVar3 = new x(new g(nVar2, str2, 3), 23);
                    d0VarFirstOrError3.getClass();
                    aVar2 = new pfm.a(d0VarFirstOrError3, xVar3, 4);
                } else {
                    if (!r6.b.B(xi0.b.Companion, dVar2.f163147c)) {
                        return ((v) nVar2.f299736b).g(this.d, str2);
                    }
                    d0 d0VarFirstOrError4 = m70.a.g(osg.b.n(nVar2, null, 2), null, new e(9), 1).firstOrError();
                    x xVar4 = new x(new g(nVar2, str2, 4), 24);
                    d0VarFirstOrError4.getClass();
                    aVar2 = new pfm.a(d0VarFirstOrError4, xVar4, 4);
                }
                return aVar2;
        }
    }
}
