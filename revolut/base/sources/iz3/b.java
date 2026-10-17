package iz3;

import android.net.Uri;
import com.revolut.feature_web_view.WebViewFeatureConfig;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import wli.x;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f169847w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, String str, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f169847w = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f169847w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        c cVar = this.v;
        cVar.getClass();
        String str = this.f169847w;
        if (!a0.H(str, "revolut://", false)) {
            return (a0.H(str, "https://", false) || a0.H(str, "http://", false)) ? cVar.A2(u0.b(new FeatureCommand(new WebViewFeatureConfig(this.f169847w, null, 0, false, true, true, 65438)))) : cVar.A2(new ExternalDestination.ImplicitActivity("android.intent.action.VIEW", null, Uri.parse(str), 0, null, 494));
        }
        x xVar = cVar.f169848l;
        Boolean bool = Boolean.FALSE;
        this.u = 1;
        Object objX1 = lg0.b.x1(xVar, this.f169847w, null, bool, this, 2);
        return objX1 == aVar ? aVar : objX1;
    }
}
