package iuj;

import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.revolut.data.model.Data;
import j27.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class z implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f168654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f168655b;

    public /* synthetic */ z(Data data, int i) {
        this.f168654a = i;
        this.f168655b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f168654a) {
            case 0:
                return o.a((o) obj2, null, null, this.f168655b, 3);
            case 1:
                return o.a((o) obj2, null, this.f168655b, null, 5);
            case 2:
                ((iv4.d) obj2).getClass();
                Data transactions = this.f168655b;
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                return new iv4.d(transactions);
            case 3:
                Data data = this.f168655b;
                Intrinsics.h(data);
                return iv7.d.a((iv7.d) obj2, null, data, 1);
            case 4:
                Data data2 = this.f168655b;
                Intrinsics.h(data2);
                return iv7.d.a((iv7.d) obj2, data2, null, 2);
            case 5:
                return ivk.g.a((ivk.g) obj2, null, null, this.f168655b, null, 11);
            case 6:
                return ivk.g.a((ivk.g) obj2, this.f168655b, null, null, null, 14);
            case 7:
                return ivk.g.a((ivk.g) obj2, null, this.f168655b, null, null, 13);
            case 8:
                return ivk.g.a((ivk.g) obj2, null, null, null, this.f168655b, 7);
            case 9:
                ((iw4.l) obj2).getClass();
                Data content = this.f168655b;
                Intrinsics.checkNotNullParameter(content, "content");
                return new iw4.l(content);
            case 10:
                ((iw4.l) obj2).getClass();
                Data content2 = this.f168655b;
                Intrinsics.checkNotNullParameter(content2, "content");
                return new iw4.l(content2);
            case 11:
                Data customerData = this.f168655b;
                Intrinsics.h(customerData);
                ((iw6.e) obj2).getClass();
                Intrinsics.checkNotNullParameter(customerData, "customerData");
                return new iw6.e(customerData);
            case 12:
                return com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a.a((com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a) obj2, null, null, null, null, this.f168655b, null, LDSFile.EF_DG15_TAG);
            case 13:
                Data data3 = this.f168655b;
                Intrinsics.h(data3);
                return com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a.a((com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a) obj2, null, null, null, null, null, data3, 63);
            case 14:
                return iyg.a.a((iyg.a) obj2, null, null, null, false, null, null, null, null, null, null, null, this.f168655b, null, null, 14335);
            case 15:
                return iyg.a.a((iyg.a) obj2, null, null, null, false, null, null, null, null, null, null, this.f168655b, null, null, null, 15359);
            case 16:
                return iyg.a.a((iyg.a) obj2, null, null, null, false, null, null, null, this.f168655b, null, null, null, null, null, null, 16255);
            case 17:
                return iyg.a.a((iyg.a) obj2, null, null, null, false, null, null, null, null, null, this.f168655b, null, null, null, null, 15871);
            case 18:
                return iyg.a.a((iyg.a) obj2, null, null, null, false, null, null, null, null, this.f168655b, null, null, null, null, null, 16127);
            case 19:
                return iyg.a.a((iyg.a) obj2, null, null, null, false, null, null, this.f168655b, null, null, null, null, null, null, null, 16319);
            case 20:
                ((j17.d) obj2).getClass();
                Data upsellData = this.f168655b;
                Intrinsics.checkNotNullParameter(upsellData, "upsellData");
                return new j17.d(upsellData);
            case 21:
                return new f.a(this.f168655b, 6);
            case 22:
                Data data4 = this.f168655b;
                Intrinsics.h(data4);
                return j2c.f.a((j2c.f) obj2, 0, null, null, data4, null, 23);
            case 23:
                Data data5 = this.f168655b;
                Intrinsics.h(data5);
                return j2c.f.a((j2c.f) obj2, 0, null, null, null, data5, 15);
            case 24:
                return j2g.h.a((j2g.h) obj2, null, null, null, null, null, null, this.f168655b, 255);
            case 25:
                return j2g.h.a((j2g.h) obj2, null, null, this.f168655b, null, null, null, null, 507);
            case 26:
                return j2g.h.a((j2g.h) obj2, null, null, null, null, null, this.f168655b, null, 383);
            case 27:
                return j2g.h.a((j2g.h) obj2, null, null, null, null, this.f168655b, null, null, OnfidoActivity.RESULT_EXIT_MISSING_ONFIDO_CONFIG);
            case 28:
                return j2g.h.a((j2g.h) obj2, null, null, null, this.f168655b, null, null, null, 479);
            default:
                return j3b.a.a((j3b.a) obj2, this.f168655b, null, 5);
        }
    }
}
