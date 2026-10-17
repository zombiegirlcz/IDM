package li8;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.JuniorPersonalDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ JuniorPersonalDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(JuniorPersonalDetailsScreen juniorPersonalDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = juniorPersonalDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarD = this.v.d();
        String listId = textData.f52597a;
        String value = textData.f52598b.toString();
        com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.c cVar = (com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.c) jVarD;
        y yVar = cVar.u;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(value, "value");
        int iHashCode = listId.hashCode();
        if (iHashCode != -1992142035) {
            if (iHashCode != -1328777087) {
                if (iHashCode == 1686079614 && listId.equals("ID_FIRST_NAME")) {
                    cVar.H2(yVar, new l3d.a(value, 13));
                }
            } else if (listId.equals("ID_FIRST_LAST_NAME")) {
                cVar.H2(yVar, new l3d.a(value, 14));
            }
        } else if (listId.equals("ID_SECOND_LAST_NAME")) {
            cVar.H2(yVar, new l3d.a(value, 15));
        }
        return Unit.f186387a;
    }
}
