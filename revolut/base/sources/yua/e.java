package yua;

import a31.x;
import com.revolut.data.network.models.recurringpayment.UpdateCardMandateFrequencyRequest;
import com.revolut.data.network.models.recurringpayment.UpdateManualCardMandateFrequencyRequest;
import com.revolut.data.network.models.recurringpayment.mapper.RecurringPaymentDtoMapperKt;
import com.revolut.data.network.services.RecurringPaymentService;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o9l.t;
import te0.w;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f316936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f316937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f316938c;
    public final /* synthetic */ fva.e d;
    public final /* synthetic */ String e;

    public /* synthetic */ e(q qVar, String str, fva.e eVar, String str2, int i) {
        this.f316936a = i;
        this.f316937b = qVar;
        this.f316938c = str;
        this.d = eVar;
        this.e = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        hbd.a params = (hbd.a) obj2;
        switch (this.f316936a) {
            case 0:
                Intrinsics.checkNotNullParameter(params, "it");
                x xVar = (x) this.f316937b.f316963a;
                String id10 = this.f316938c;
                Intrinsics.checkNotNullParameter(id10, "id");
                fva.e frequency = this.d;
                Intrinsics.checkNotNullParameter(frequency, "frequency");
                Intrinsics.checkNotNullParameter(params, "params");
                RecurringPaymentService recurringPaymentService = xVar.f999a;
                t dto = RecurringPaymentDtoMapperKt.toDto(frequency);
                String str = this.e;
                pfm.h hVar = new pfm.h(w.i0(xVar.d(recurringPaymentService.updateCardMandateFrequency(id10, new UpdateCardMandateFrequencyRequest(dto, str == null ? null : str), "SUBSCRIPTION_BRAND_BLOCK"), params, str)), 4);
                Intrinsics.checkNotNullExpressionValue(hVar, "ignoreElement(...)");
                return hVar;
            default:
                Intrinsics.checkNotNullParameter(params, "it");
                x xVar2 = (x) this.f316937b.f316963a;
                String id11 = this.f316938c;
                Intrinsics.checkNotNullParameter(id11, "id");
                fva.e frequency2 = this.d;
                Intrinsics.checkNotNullParameter(frequency2, "frequency");
                Intrinsics.checkNotNullParameter(params, "params");
                RecurringPaymentService recurringPaymentService2 = xVar2.f999a;
                t dto2 = RecurringPaymentDtoMapperKt.toDto(frequency2);
                String str2 = this.e;
                pfm.h hVar2 = new pfm.h(w.i0(xVar2.d(recurringPaymentService2.updateManualCardMandateFrequency(id11, new UpdateManualCardMandateFrequencyRequest(dto2, str2 == null ? null : str2), "SUBSCRIPTION_BRAND_BLOCK"), params, str2)), 4);
                Intrinsics.checkNotNullExpressionValue(hVar2, "ignoreElement(...)");
                return hVar2;
        }
    }
}
