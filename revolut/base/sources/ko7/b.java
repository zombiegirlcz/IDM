package ko7;

import com.revolut.feature.address.models.Address;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.address.AddressPickerScreen;
import com.revolut.feature.profile.api.navigation.ProfileAddressControllerDescriptor;
import com.revolut.kompot.common.ModalDestination;
import ip0.um0;
import ko7.e;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.text.d0;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AddressPickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(AddressPickerScreen addressPickerScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = addressPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            case 1:
                return new b(this.v, continuation, 1);
            case 2:
                return new b(this.v, continuation, 2);
            case 3:
                return new b(this.v, continuation, 3);
            default:
                return new b(this.v, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((b) create((um0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AddressPickerScreen addressPickerScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                addressPickerScreen.m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar = (l) addressPickerScreen.T2();
                Address address = (Address) ((d) lVar.t2()).f186252a.getContent();
                if (address != null) {
                    String postcode = address.getPostcode();
                    if (postcode == null || d0.W(postcode)) {
                        lVar.f186265r.x(vn7.a.b(lVar.f186266s, R$string.car_insurance_address_update_dialogue_title, Integer.valueOf(R$string.car_insurance_address_update_dialogue_subtitle), 0, 12));
                    } else {
                        lVar.v2(e.a.f186255a);
                    }
                }
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar2 = (l) addressPickerScreen.T2();
                lVar2.f186265r.x(vn7.a.b(lVar2.f186266s, R$string.car_insurance_address_update_dialogue_title, Integer.valueOf(R$string.car_insurance_address_update_dialogue_subtitle), 0, 12));
                break;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j60.a.v(((l) addressPickerScreen.T2()).f186265r, false, null, 3);
                break;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar3 = (l) addressPickerScreen.T2();
                j60.a.v(lVar3.f186265r, false, null, 3);
                yji.l.j2(lVar3, lVar3.e1(new ProfileAddressControllerDescriptor(new ProfileAddressControllerDescriptor.InputData(false))), ModalDestination.Style.FULLSCREEN_FADE.f98307a, null, 2);
                break;
        }
        return Unit.f186387a;
    }
}
