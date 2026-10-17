package adf;

import android.util.Patterns;
import android.webkit.URLUtil;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import wli.x;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f3336w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, String str, Continuation continuation) {
        super(1, continuation);
        this.v = hVar;
        this.f3336w = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.v, this.f3336w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            h hVar = this.v;
            x xVar = hVar.f3338q;
            String url2 = this.f3336w;
            Continuation continuation = null;
            if (xVar.y1(url2)) {
                a2j.c cVar = new a2j.c(hVar, url2, continuation, 12);
                this.u = 1;
                if (hVar.p2(this, cVar) == aVar) {
                    return aVar;
                }
            } else {
                hVar.f3339r.getClass();
                Intrinsics.checkNotNullParameter(url2, "url");
                if (URLUtil.isHttpsUrl(url2) && Patterns.WEB_URL.matcher(url2).matches()) {
                    hVar.C1(new ExternalDestination.Browser(url2, null));
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
