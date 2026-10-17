package s4i;

import android.util.Patterns;
import android.webkit.URLUtil;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import wli.x;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f259882w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, String str, Continuation continuation) {
        super(1, continuation);
        this.v = hVar;
        this.f259882w = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.v, this.f259882w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            h hVar = this.v;
            x xVar = hVar.f259885q;
            String url2 = this.f259882w;
            if (xVar.y1(url2)) {
                x xVar2 = hVar.f259885q;
                Boolean bool = Boolean.FALSE;
                this.u = 1;
                if (lg0.b.x1(xVar2, this.f259882w, null, bool, this, 2) == aVar) {
                    return aVar;
                }
            } else {
                hVar.v.getClass();
                Intrinsics.checkNotNullParameter(url2, "url");
                if (URLUtil.isHttpsUrl(url2) && Patterns.WEB_URL.matcher(url2).matches()) {
                    hVar.C1(new ExternalDestination.Browser(url2, null));
                } else {
                    hx7.e.h(new IllegalArgumentException("Unsupported footer link"));
                    Unit unit = Unit.f186387a;
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
