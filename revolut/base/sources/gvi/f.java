package gvi;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.traveller_details.AsftTravellerDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AsftTravellerDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(AsftTravellerDetailsScreen asftTravellerDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = asftTravellerDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.R2();
        String listId = textData.f52597a;
        String value = textData.f52598b.toString();
        r rVar = (r) lVarE3;
        y yVar = rVar.f147200t;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(value, "value");
        rVar.f147197q.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        int i = 0;
        int i2 = 1;
        int i3 = Integer.parseInt((String) d0.b0(kotlin.text.d0.n0(listId, new String[]{"_"}, 0, 6))) - 1;
        if (a0.y(listId, "FIRST_NAME", false)) {
            rVar.H2(yVar, new n(rVar, i3, value, i));
        } else if (a0.y(listId, "LAST_NAME", false)) {
            rVar.H2(yVar, new n(rVar, i3, value, i2));
        }
        return Unit.f186387a;
    }
}
