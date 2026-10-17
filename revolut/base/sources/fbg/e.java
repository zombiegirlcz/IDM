package fbg;

import android.content.Intent;
import android.net.Uri;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.checkin_instructions.TravelHotelsCheckInInstructionsScreen;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelHotelsCheckInInstructionsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TravelHotelsCheckInInstructionsScreen travelHotelsCheckInInstructionsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelsCheckInInstructionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVarE3 = this.v.d();
        Intrinsics.h(model);
        l lVar = (l) hVarE3;
        n nVar = lVar.f133555q;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        Object obj3 = model.u;
        if (Intrinsics.f(str, "PHONE_ITEM_ID")) {
            String phone = obj3 instanceof String ? (String) obj3 : null;
            if (phone != null) {
                nVar.getClass();
                Intrinsics.checkNotNullParameter(phone, "phone");
                Intent intent = new Intent("android.intent.action.DIAL");
                intent.setData(Uri.parse("tel:".concat(phone)));
                lVar.C1(new ExternalDestination.ByIntent(intent, null));
            }
        } else if (Intrinsics.f(str, "EMAIL_ITEM_ID")) {
            String email = obj3 instanceof String ? (String) obj3 : null;
            if (email != null) {
                nVar.getClass();
                Intrinsics.checkNotNullParameter(email, "email");
                Intent intent2 = new Intent("android.intent.action.SENDTO");
                intent2.setData(Uri.parse("mailto:".concat(email)));
                lVar.C1(new ExternalDestination.ByIntent(intent2, null));
            }
        }
        return Unit.f186387a;
    }
}
