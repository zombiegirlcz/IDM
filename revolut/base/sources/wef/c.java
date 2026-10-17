package wef;

import android.content.Intent;
import android.net.Uri;
import com.revolut.core.ui_kit.delegates.w8;
import com.revolut.feature.transaction.recogniser.api.domain.models.Location;
import com.revolut.feature.transaction.recogniser.api.domain.models.TransactionRecogniserDetails;
import com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.details.TransactionRecogniserDetailsScreen;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TransactionRecogniserDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(TransactionRecogniserDetailsScreen transactionRecogniserDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = transactionRecogniserDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            case 2:
                return new c(this.v, continuation, 2);
            default:
                return new c(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((w8) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TransactionRecogniserDetailsScreen transactionRecogniserDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                transactionRecogniserDetailsScreen.m2().onBackPressed();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar = (l) transactionRecogniserDetailsScreen.c0.getValue();
                lVar.v2(new g(lVar.f296775p.f91830a));
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar2 = (l) transactionRecogniserDetailsScreen.c0.getValue();
                Object content = ((e) lVar2.t2()).f296768a.getContent();
                if (content == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                lVar2.v2(new f((TransactionRecogniserDetails) content));
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar3 = (l) transactionRecogniserDetailsScreen.c0.getValue();
                Location location = ((e) lVar3.t2()).f296769b;
                if (location != null) {
                    ((eff.b) lVar3.f296777r).getClass();
                    Intrinsics.checkNotNullParameter(location, "location");
                    Intent intentCreateChooser = Intent.createChooser(new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + location.f91798a + "," + location.f91799b)), null);
                    Intrinsics.checkNotNullExpressionValue(intentCreateChooser, "createChooser(...)");
                    lVar3.C1(new ExternalDestination.ByIntent(intentCreateChooser, null));
                }
                return Unit.f186387a;
        }
    }
}
