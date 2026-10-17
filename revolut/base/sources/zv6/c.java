package zv6;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.freelancer.impl.ui.create_sale.invoice.customer.FreelancerAddCustomerScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FreelancerAddCustomerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(FreelancerAddCustomerScreen freelancerAddCustomerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = freelancerAddCustomerScreen;
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

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        String str = textData.f52597a;
        CharSequence charSequence = textData.f52598b;
        int iHashCode = str.hashCode();
        FreelancerAddCustomerScreen freelancerAddCustomerScreen = this.v;
        switch (iHashCode) {
            case -1272060306:
                if (str.equals("ITEM_ID_NAME_INPUT")) {
                    f fVarH3 = freelancerAddCustomerScreen.T2();
                    final String name = charSequence.toString();
                    final k kVar = (k) fVarH3;
                    kVar.getClass();
                    Intrinsics.checkNotNullParameter(name, "name");
                    final int i = 1;
                    kVar.x2(new Function1() { // from class: zv6.h
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            d updateState = (d) obj3;
                            switch (i) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                    return d.a((d) kVar.t2(), null, name, null, null, null, 59);
                                case 1:
                                    Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                    return d.a((d) kVar.t2(), name, null, null, null, null, 61);
                                case 2:
                                    Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                    return d.a((d) kVar.t2(), null, null, null, name, null, 47);
                                default:
                                    Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                    return d.a((d) kVar.t2(), null, null, name, null, null, 55);
                            }
                        }
                    });
                }
                break;
            case -311283025:
                if (str.equals("ITEM_ID_EMAIL_INPUT")) {
                    f fVarH32 = freelancerAddCustomerScreen.T2();
                    final String email = charSequence.toString();
                    final k kVar2 = (k) fVarH32;
                    kVar2.getClass();
                    Intrinsics.checkNotNullParameter(email, "email");
                    final int i2 = 0;
                    kVar2.x2(new Function1() { // from class: zv6.h
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            d updateState = (d) obj3;
                            switch (i2) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                    return d.a((d) kVar2.t2(), null, email, null, null, null, 59);
                                case 1:
                                    Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                    return d.a((d) kVar2.t2(), email, null, null, null, null, 61);
                                case 2:
                                    Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                    return d.a((d) kVar2.t2(), null, null, null, email, null, 47);
                                default:
                                    Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                    return d.a((d) kVar2.t2(), null, null, email, null, null, 55);
                            }
                        }
                    });
                }
                break;
            case 1051655937:
                if (str.equals("ITEM_ID_PHONE_INPUT")) {
                    f fVarH33 = freelancerAddCustomerScreen.T2();
                    final String phone = charSequence.toString();
                    final k kVar3 = (k) fVarH33;
                    kVar3.getClass();
                    Intrinsics.checkNotNullParameter(phone, "phone");
                    final int i3 = 3;
                    kVar3.x2(new Function1() { // from class: zv6.h
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            d updateState = (d) obj3;
                            switch (i3) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                    return d.a((d) kVar3.t2(), null, phone, null, null, null, 59);
                                case 1:
                                    Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                    return d.a((d) kVar3.t2(), phone, null, null, null, null, 61);
                                case 2:
                                    Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                    return d.a((d) kVar3.t2(), null, null, null, phone, null, 47);
                                default:
                                    Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                    return d.a((d) kVar3.t2(), null, null, phone, null, null, 55);
                            }
                        }
                    });
                }
                break;
            case 1164529276:
                if (str.equals("ITEM_ID_VAT_INPUT")) {
                    f fVarH34 = freelancerAddCustomerScreen.T2();
                    final String vat = charSequence.toString();
                    final k kVar4 = (k) fVarH34;
                    kVar4.getClass();
                    Intrinsics.checkNotNullParameter(vat, "vat");
                    final int i5 = 2;
                    kVar4.x2(new Function1() { // from class: zv6.h
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            d updateState = (d) obj3;
                            switch (i5) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                    return d.a((d) kVar4.t2(), null, vat, null, null, null, 59);
                                case 1:
                                    Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                    return d.a((d) kVar4.t2(), vat, null, null, null, null, 61);
                                case 2:
                                    Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                    return d.a((d) kVar4.t2(), null, null, null, vat, null, 47);
                                default:
                                    Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                    return d.a((d) kVar4.t2(), null, null, vat, null, null, 55);
                            }
                        }
                    });
                }
                break;
        }
        return Unit.f186387a;
    }
}
