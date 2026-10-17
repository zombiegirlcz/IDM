package o23;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.card_order_new.impl.kompot.screen.address_form.AddressFormController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AddressFormController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AddressFormController addressFormController, Continuation continuation) {
        super(2, continuation);
        this.v = addressFormController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        u uVarE3 = this.v.e3();
        String listId = textData.f52597a;
        String text = textData.f52598b.toString();
        com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b bVar = (com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b) uVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        switch (listId.hashCode()) {
            case -2083061447:
                if (listId.equals("POSTAL_CODE_ID")) {
                    com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b.P2(bVar, new nj8.b(text, 26));
                }
                break;
            case -1820064041:
                if (listId.equals("STREET_ID")) {
                    com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b.P2(bVar, new l(text, 0));
                }
                break;
            case -1433993658:
                if (listId.equals("REGION_ID")) {
                    com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b.P2(bVar, new l(text, 5));
                }
                break;
            case -1244881940:
                if (listId.equals("NEIGHBORHOOD_ID")) {
                    com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b.P2(bVar, new l(text, 6));
                }
                break;
            case -60811359:
                if (listId.equals("FLAT_ID")) {
                    com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b.P2(bVar, new l(text, 3));
                }
                break;
            case 311424024:
                if (listId.equals("STREET_LINE_1_ID")) {
                    com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b.P2(bVar, new nj8.b(text, 28));
                }
                break;
            case 311453815:
                if (listId.equals("STREET_LINE_2_ID")) {
                    com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b.P2(bVar, new nj8.b(text, 29));
                }
                break;
            case 422845444:
                if (listId.equals("STREET_TYPE_ID")) {
                    com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b.P2(bVar, new l(text, 1));
                }
                break;
            case 1503453295:
                if (listId.equals("CITY_ID")) {
                    com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b.P2(bVar, new l(text, 4));
                }
                break;
            case 1543923586:
                if (listId.equals("LANDMARK_ID")) {
                    com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b.P2(bVar, new nj8.b(text, 27));
                }
                break;
            case 2056681298:
                if (listId.equals("HOUSE_NUMBER_ID")) {
                    com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b.P2(bVar, new l(text, 2));
                }
                break;
        }
        return Unit.f186387a;
    }
}
