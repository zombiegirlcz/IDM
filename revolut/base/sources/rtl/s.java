package rtl;

import com.revolut.data.model.Data;
import com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.TravelExperiencesCancellationScreenContract$Mode;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f257332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f257333b;

    public /* synthetic */ s(Data data, int i) {
        this.f257332a = i;
        this.f257333b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        switch (this.f257332a) {
            case 0:
                return k.a((k) obj2, null, null, null, this.f257333b, null, null, null, LDSFile.EF_SOD_TAG);
            case 1:
                return k.a((k) obj2, null, null, null, null, null, null, this.f257333b, 63);
            case 2:
                return k.a((k) obj2, null, null, null, null, this.f257333b, null, null, LDSFile.EF_DG15_TAG);
            case 3:
                return k.a((k) obj2, null, this.f257333b, null, null, null, null, null, ISO781611.SMT_TAG);
            case 4:
                return k.a((k) obj2, null, null, this.f257333b, null, null, null, null, 123);
            case 5:
                return k.a((k) obj2, null, null, null, null, null, this.f257333b, null, 95);
            case 6:
                ru5.j updateState = (ru5.j) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return ru5.j.a(updateState, null, null, null, null, null, this.f257333b, null, null, false, null, null, 4063);
            case 7:
                return ru5.j.a((ru5.j) obj2, null, null, this.f257333b, null, null, null, null, null, false, null, null, 4091);
            case 8:
                Data data2 = this.f257333b;
                Intrinsics.h(data2);
                return ru5.j.a((ru5.j) obj2, null, data2, null, null, null, null, null, null, false, null, null, 4093);
            case 9:
                ru5.j jVar = (ru5.j) obj2;
                Data data3 = this.f257333b;
                Intrinsics.h(data3);
                try {
                    Object content = data3.getContent();
                    data = new Data(content != null ? yoj.b.h((whf.p) content) : null, data3.getError(), data3.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data3.getLoading());
                }
                return ru5.j.a(jVar, null, null, null, data3, data, null, null, null, false, null, null, 4071);
            case 10:
                return ruk.i.a((ruk.i) obj2, null, this.f257333b, null, null, null, null, null, 0, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
            case 11:
                ((rv6.k) obj2).getClass();
                Data planDetailsData = this.f257333b;
                Intrinsics.checkNotNullParameter(planDetailsData, "planDetailsData");
                return new rv6.k(planDetailsData);
            case 12:
                xi0.b destinationPocketCurrency = ((rva.a) obj2).f257735b;
                Data transactionData = this.f257333b;
                Intrinsics.checkNotNullParameter(transactionData, "transactionData");
                Intrinsics.checkNotNullParameter(destinationPocketCurrency, "destinationPocketCurrency");
                return new rva.a(transactionData, destinationPocketCurrency);
            case 13:
                String idempotencyKey = ((rwb.c) obj2).f257878b;
                Data voucherProductGroupDetailsContent = this.f257333b;
                Intrinsics.checkNotNullParameter(voucherProductGroupDetailsContent, "voucherProductGroupDetailsContent");
                Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
                return new rwb.c(voucherProductGroupDetailsContent, idempotencyKey);
            case 14:
                return rya.b.a((rya.b) obj2, this.f257333b, null, null, 6);
            case 15:
                return rya.b.a((rya.b) obj2, null, null, this.f257333b, 3);
            case 16:
                return rya.b.a((rya.b) obj2, null, this.f257333b, null, 5);
            case 17:
                ((s15.f) obj2).getClass();
                Data configuration = this.f257333b;
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                return new s15.f(configuration);
            case 18:
                TravelExperiencesCancellationScreenContract$Mode mode = ((s1g.g) obj2).f259135a;
                Intrinsics.checkNotNullParameter(mode, "mode");
                Data legalEntityContext = this.f257333b;
                Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
                return new s1g.g(mode, legalEntityContext);
            case 19:
                return s2e.e.a((s2e.e) obj2, null, this.f257333b, null, 5);
            case 20:
                return s2e.e.a((s2e.e) obj2, this.f257333b, null, null, 6);
            case 21:
                return s44.g.a((s44.g) obj2, this.f257333b, null, 23);
            case 22:
                ((s4b.d) obj2).getClass();
                return new s4b.d(this.f257333b);
            case 23:
                ((s4e.d) obj2).getClass();
                return new s4e.d(this.f257333b);
            case 24:
                return s4f.f.a((s4f.f) obj2, null, null, null, this.f257333b, null, 47);
            case 25:
                return s4f.f.a((s4f.f) obj2, null, null, null, null, this.f257333b, 31);
            case 26:
                return s56.o.a((s56.o) obj2, null, null, null, null, null, null, null, this.f257333b, null, null, 1791);
            case 27:
                return s65.f.a((s65.f) obj2, 0, this.f257333b, 3);
            case 28:
                return s6b.g.a((s6b.g) obj2, null, null, this.f257333b, false, 11);
            default:
                ((s6h.d) obj2).getClass();
                return new s6h.d(this.f257333b);
        }
    }
}
