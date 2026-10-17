package ved;

import com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.r;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u = 1;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AlertItem f288275w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f288276x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(AlertItem alertItem, o oVar, Continuation continuation) {
        super(2, continuation);
        this.f288275w = alertItem;
        this.f288276x = oVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l lVar = new l(this.f288276x, this.f288275w, continuation);
                lVar.v = obj2;
                return lVar;
            default:
                l lVar2 = new l(this.f288275w, this.f288276x, continuation);
                lVar2.v = obj2;
                return lVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l) create((r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l) create((Map) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00e0  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ved.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, AlertItem alertItem, Continuation continuation) {
        super(2, continuation);
        this.f288276x = oVar;
        this.f288275w = alertItem;
    }
}
