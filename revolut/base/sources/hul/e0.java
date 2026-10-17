package hul;

import android.util.Patterns;
import android.webkit.URLUtil;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class e0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.trading.orders.ui.invest.placement.screens.review.o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f155714w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar, String str, Continuation continuation) {
        super(2, continuation);
        this.v = oVar;
        this.f155714w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e0(this.v, this.f155714w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar = this.v;
            wli.x xVar = oVar.X;
            String url2 = this.f155714w;
            if (xVar.y1(url2)) {
                wli.x xVar2 = oVar.X;
                this.u = 1;
                if (lg0.b.x1(xVar2, this.f155714w, null, null, this, 6) == aVar) {
                    return aVar;
                }
            } else {
                oVar.Y.getClass();
                Intrinsics.checkNotNullParameter(url2, "url");
                if (URLUtil.isHttpsUrl(url2) && Patterns.WEB_URL.matcher(url2).matches()) {
                    oVar.C1(new ExternalDestination.Browser(url2, null));
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
