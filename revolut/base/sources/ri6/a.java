package ri6;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import efm.d0;
import efm.r;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rea.j;
import rhj.m;
import te0.w;
import x61.i;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f254556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f254557b;

    public /* synthetic */ a(c cVar, int i) {
        this.f254556a = i;
        this.f254557b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f254556a) {
            case 0:
                i fundsConfirmation = (i) obj2;
                Intrinsics.checkNotNullParameter(fundsConfirmation, "fundsConfirmation");
                c cVar = this.f254557b;
                d0 d0VarFirstOrError = m70.a.g(osg.b.e(cVar.f254560b, true, null, null, null, null, null, null, 126), null, new m(4), 1).firstOrError();
                r rVarSwitchMap = rd0.e.c(cVar.f254561c.i(true), g.f186406a).switchMap(new j(new a(cVar, 1), 17));
                Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
                return d0.D(d0VarFirstOrError, m70.a.g(rVarSwitchMap, null, new m(5), 1).firstOrError(), new j(new qce.b(cVar, fundsConfirmation, 10), 18));
            default:
                Data it8 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                od0.i iVar = (od0.i) it8.getContent();
                n38.a aVar = iVar != null ? (n38.a) iVar.f224257a : null;
                return aVar == null ? w.h(new Data(f0.f322471a, null, false, 6, null)) : osg.b.e(this.f254557b.f254560b, true, null, null, null, null, null, new AccountId.Joint(aVar.f211923a, aVar.f211924b), 62);
        }
    }
}
