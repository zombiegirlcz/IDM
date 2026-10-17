package bmj;

import boh.n;
import bq5.a0;
import br4.m;
import brc.l;
import bs9.o;
import bt9.j;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;
import te0.w;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f16841b;

    public /* synthetic */ g(Data data, int i) {
        this.f16840a = i;
        this.f16841b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f16840a) {
            case 0:
                ((d) obj2).getClass();
                Data phoneNumberCancellationPreview = this.f16841b;
                Intrinsics.checkNotNullParameter(phoneNumberCancellationPreview, "phoneNumberCancellationPreview");
                return new d(phoneNumberCancellationPreview);
            case 1:
                return n.a((n) obj2, this.f16841b, null, null, null, 29);
            case 2:
                return n.a((n) obj2, null, null, null, this.f16841b, 15);
            case 3:
                return a0.a((a0) obj2, null, null, null, null, null, null, null, this.f16841b, null, null, null, null, null, null, null, null, null, false, null, null, false, false, null, null, null, null, 1073741695);
            case 4:
                a0 a0Var = (a0) obj2;
                do3.n nVar = (do3.n) this.f16841b.getContent();
                return a0.a(a0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, nVar != null ? w.I(nVar) : null, null, false, false, null, null, null, null, 1071644671);
            case 5:
                ((m) obj2).getClass();
                Data detailsModel = this.f16841b;
                Intrinsics.checkNotNullParameter(detailsModel, "detailsModel");
                return new m(detailsModel);
            case 6:
                ((m) obj2).getClass();
                Data detailsModel2 = this.f16841b;
                Intrinsics.checkNotNullParameter(detailsModel2, "detailsModel");
                return new m(detailsModel2);
            case 7:
                ((l) obj2).getClass();
                Data data = this.f16841b;
                Intrinsics.checkNotNullParameter(data, "data");
                return new l(data);
            case 8:
                return brf.d.a((brf.d) obj2, this.f16841b);
            case 9:
                ((bs4.g) obj2).getClass();
                Data content = this.f16841b;
                Intrinsics.checkNotNullParameter(content, "content");
                return new bs4.g(content);
            case 10:
                return o.a((o) obj2, null, null, false, false, false, null, null, 0, this.f16841b, null, null, 7679);
            case 11:
                Data data2 = this.f16841b;
                Intrinsics.h(data2);
                return o.a((o) obj2, null, data2, false, false, false, null, null, 0, null, null, null, 8189);
            case 12:
                return bse.g.a((bse.g) obj2, this.f16841b, false, 6);
            case 13:
                return bt2.e.a((bt2.e) obj2, this.f16841b, null, null, null, false, null, ISO781611.SMT_TAG);
            case 14:
                return bt2.e.a((bt2.e) obj2, null, this.f16841b, null, null, false, null, 123);
            case 15:
                return bt2.e.a((bt2.e) obj2, null, null, this.f16841b, null, false, null, LDSFile.EF_SOD_TAG);
            case 16:
                return bt2.e.a((bt2.e) obj2, null, null, null, null, false, this.f16841b, 63);
            case 17:
                Data data3 = this.f16841b;
                Intrinsics.h(data3);
                return j.a((j) obj2, data3, false, 2);
            case 18:
                ((btl.c) obj2).getClass();
                Data instrumentActions = this.f16841b;
                Intrinsics.checkNotNullParameter(instrumentActions, "instrumentActions");
                return new btl.c(instrumentActions);
            case 19:
                return bu4.a.a((bu4.a) obj2, this.f16841b, null, 2);
            case 20:
                ((bv4.d) obj2).getClass();
                Data settings = this.f16841b;
                Intrinsics.checkNotNullParameter(settings, "settings");
                return new bv4.d(settings);
            case 21:
                Data data4 = this.f16841b;
                Intrinsics.h(data4);
                return bvb.e.a((bvb.e) obj2, null, null, null, false, false, data4, 31);
            case 22:
                ((bw4.f) obj2).getClass();
                Data content2 = this.f16841b;
                Intrinsics.checkNotNullParameter(content2, "content");
                return new bw4.f(content2);
            case 23:
                bw6.g gVar = (bw6.g) obj2;
                Data data5 = this.f16841b;
                Intrinsics.h(data5);
                FreelancerInvoice freelancerInvoice = (FreelancerInvoice) data5.getContent();
                return bw6.g.a(gVar, data5, false, freelancerInvoice != null ? freelancerInvoice.u : null, 2);
            case 24:
                return bwk.g.a((bwk.g) obj2, this.f16841b, null, 6);
            case 25:
                ((bx6.d) obj2).getClass();
                Data data6 = this.f16841b;
                Intrinsics.checkNotNullParameter(data6, "data");
                return new bx6.d(data6);
            case 26:
                return bxb.e.a((bxb.e) obj2, this.f16841b, null, false, null, 14);
            case 27:
                return bxb.e.a((bxb.e) obj2, null, null, false, this.f16841b, 7);
            case 28:
                return bxg.h.a((bxg.h) obj2, this.f16841b, null, 2);
            default:
                return by6.g.a((by6.g) obj2, null, this.f16841b, 1);
        }
    }
}
