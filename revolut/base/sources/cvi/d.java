package cvi;

import cli.y;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTerminal;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.dialogs.number_of_travelers_picker.AsftNumberOfTravelersPickerScreen;
import cul.n2;
import ip0.u8;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AsftNumberOfTravelersPickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(AsftNumberOfTravelersPickerScreen asftNumberOfTravelersPickerScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = asftNumberOfTravelersPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            case 1:
                return new d(this.v, continuation, 1);
            default:
                return new d(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((d) create((u8) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AsftNumberOfTravelersPickerScreen asftNumberOfTravelersPickerScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVarE3 = asftNumberOfTravelersPickerScreen.R2();
                kVarE3.C2(new g(((f) ((j2) kVarE3.f109480s.f22677a).getValue()).f109468c));
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVarE32 = asftNumberOfTravelersPickerScreen.R2();
                y yVar = kVarE32.f109480s;
                if (((f) ((j2) yVar.f22677a).getValue()).f109468c > 1) {
                    kVarE32.H2(yVar, new n2(18));
                }
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVarE33 = asftNumberOfTravelersPickerScreen.R2();
                y yVar2 = kVarE33.f109480s;
                AsftTerminal asftTerminal = (AsftTerminal) ((f) ((j2) yVar2.f22677a).getValue()).f109466a.getContent();
                Integer numValueOf = asftTerminal != null ? Integer.valueOf(asftTerminal.e) : null;
                if (numValueOf != null && ((f) ((j2) yVar2.f22677a).getValue()).f109468c < numValueOf.intValue()) {
                    kVarE33.H2(yVar2, new n2(19));
                }
                break;
        }
        return Unit.f186387a;
    }
}
