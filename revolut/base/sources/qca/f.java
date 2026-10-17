package qca;

import cli.y;
import com.revolut.apm.pix.validation.api.PixIdentifiedType;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import com.revolut.feature.pix.impl.flow.transfer.screen.new_contact.PixNewContactScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PixNewContactScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(PixNewContactScreen pixNewContactScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pixNewContactScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.R2();
        Intrinsics.h(model);
        q qVar = (q) nVarE3;
        y yVar = qVar.v;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (obj3 instanceof PixIdentifiedType.CpfOrBrazilianLocalPhoneAmbiguous) {
            String str = model.f53228a;
            if (Intrinsics.f(str, "CPF_TYPE_ID")) {
                final PixIdentifiedType.CpfOrBrazilianLocalPhoneAmbiguous cpfOrBrazilianLocalPhoneAmbiguous = (PixIdentifiedType.CpfOrBrazilianLocalPhoneAmbiguous) obj3;
                final int i = 1;
                qVar.H2(yVar, new Function1() { // from class: qca.p
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        g update = (g) obj4;
                        switch (i) {
                            case 0:
                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                ApmDescriptor.Phone phone = new ApmDescriptor.Phone(cpfOrBrazilianLocalPhoneAmbiguous.f50350a);
                                String rawValue = update.f244671a;
                                Intrinsics.checkNotNullParameter(rawValue, "rawValue");
                                return new g(rawValue, phone);
                            default:
                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                ApmDescriptor.ExternalId externalId = new ApmDescriptor.ExternalId(cpfOrBrazilianLocalPhoneAmbiguous.f50351b, "CPF");
                                String rawValue2 = update.f244671a;
                                Intrinsics.checkNotNullParameter(rawValue2, "rawValue");
                                return new g(rawValue2, externalId);
                        }
                    }
                });
            } else if (Intrinsics.f(str, "PHONE_TYPE_ID")) {
                final PixIdentifiedType.CpfOrBrazilianLocalPhoneAmbiguous cpfOrBrazilianLocalPhoneAmbiguous2 = (PixIdentifiedType.CpfOrBrazilianLocalPhoneAmbiguous) obj3;
                final int i2 = 0;
                qVar.H2(yVar, new Function1() { // from class: qca.p
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        g update = (g) obj4;
                        switch (i2) {
                            case 0:
                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                ApmDescriptor.Phone phone = new ApmDescriptor.Phone(cpfOrBrazilianLocalPhoneAmbiguous2.f50350a);
                                String rawValue = update.f244671a;
                                Intrinsics.checkNotNullParameter(rawValue, "rawValue");
                                return new g(rawValue, phone);
                            default:
                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                ApmDescriptor.ExternalId externalId = new ApmDescriptor.ExternalId(cpfOrBrazilianLocalPhoneAmbiguous2.f50351b, "CPF");
                                String rawValue2 = update.f244671a;
                                Intrinsics.checkNotNullParameter(rawValue2, "rawValue");
                                return new g(rawValue2, externalId);
                        }
                    }
                });
            }
        }
        return Unit.f186387a;
    }
}
