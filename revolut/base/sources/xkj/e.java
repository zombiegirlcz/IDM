package xkj;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingAttribute;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingContractType;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.EsimMobilePlanDynamicFormNumberTransferConfirmationScreen;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.r0;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimMobilePlanDynamicFormNumberTransferConfirmationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(EsimMobilePlanDynamicFormNumberTransferConfirmationScreen esimMobilePlanDynamicFormNumberTransferConfirmationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimMobilePlanDynamicFormNumberTransferConfirmationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        final EsimPhoneNumberPortingAttribute esimPhoneNumberPortingAttribute;
        List list;
        Object next;
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarE3 = this.v.R2();
        final String listId = textData.f52597a;
        final String text = textData.f52598b.toString();
        final com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b bVar = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b) jVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        y yVar = bVar.f101285x;
        EsimPhoneNumberPortingContractType esimPhoneNumberPortingContractType = ((g) ((j2) yVar.f22677a).getValue()).f306820b;
        Object obj3 = null;
        if (esimPhoneNumberPortingContractType == null || (list = esimPhoneNumberPortingContractType.e) == null) {
            esimPhoneNumberPortingAttribute = null;
        } else {
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((EsimPhoneNumberPortingAttribute) next).f100338a, listId)) {
                    break;
                }
            }
            esimPhoneNumberPortingAttribute = (EsimPhoneNumberPortingAttribute) next;
        }
        if (esimPhoneNumberPortingAttribute != null) {
            final int i = 0;
            bVar.H2(yVar, new Function1(bVar, listId, text, esimPhoneNumberPortingAttribute, i) { // from class: xkj.n

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f306835a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f306836b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f306837c;
                public final /* synthetic */ EsimPhoneNumberPortingAttribute d;

                {
                    this.f306835a = i;
                    this.f306836b = listId;
                    this.f306837c = text;
                    this.d = esimPhoneNumberPortingAttribute;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (this.f306835a) {
                        case 0:
                            g update = (g) obj4;
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return g.a(update, null, null, null, null, null, null, r0.q(update.f306822g, new Pair(this.f306836b, new zkj.b(this.f306837c, this.d.f100341g))), 63);
                        default:
                            g update2 = (g) obj4;
                            Intrinsics.checkNotNullParameter(update2, "$this$update");
                            Map map = update2.f;
                            EsimPhoneNumberPortingAttribute esimPhoneNumberPortingAttribute2 = this.d;
                            return g.a(update2, null, null, null, null, null, r0.q(map, new Pair(this.f306836b, new zkj.b(this.f306837c, esimPhoneNumberPortingAttribute2 != null ? esimPhoneNumberPortingAttribute2.f100341g : null))), null, 95);
                    }
                }
            });
        } else {
            List list2 = bVar.o.e.f100356l;
            if (list2 != null) {
                Iterator it9 = list2.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        break;
                    }
                    Object next2 = it9.next();
                    if (Intrinsics.f(((EsimPhoneNumberPortingAttribute) next2).f100338a, listId)) {
                        obj3 = next2;
                        break;
                    }
                }
                obj3 = (EsimPhoneNumberPortingAttribute) obj3;
            }
            final EsimPhoneNumberPortingAttribute esimPhoneNumberPortingAttribute2 = obj3;
            final int i2 = 1;
            bVar.H2(yVar, new Function1(bVar, listId, text, esimPhoneNumberPortingAttribute2, i2) { // from class: xkj.n

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f306835a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f306836b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f306837c;
                public final /* synthetic */ EsimPhoneNumberPortingAttribute d;

                {
                    this.f306835a = i2;
                    this.f306836b = listId;
                    this.f306837c = text;
                    this.d = esimPhoneNumberPortingAttribute2;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (this.f306835a) {
                        case 0:
                            g update = (g) obj4;
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return g.a(update, null, null, null, null, null, null, r0.q(update.f306822g, new Pair(this.f306836b, new zkj.b(this.f306837c, this.d.f100341g))), 63);
                        default:
                            g update2 = (g) obj4;
                            Intrinsics.checkNotNullParameter(update2, "$this$update");
                            Map map = update2.f;
                            EsimPhoneNumberPortingAttribute esimPhoneNumberPortingAttribute22 = this.d;
                            return g.a(update2, null, null, null, null, null, r0.q(map, new Pair(this.f306836b, new zkj.b(this.f306837c, esimPhoneNumberPortingAttribute22 != null ? esimPhoneNumberPortingAttribute22.f100341g : null))), null, 95);
                    }
                }
            });
        }
        return Unit.f186387a;
    }
}
