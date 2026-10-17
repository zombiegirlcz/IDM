package af4;

import com.revolut.data.model.Data;
import com.revolut.feature.tab.accounts.impl.ui.spaces.AccountSpacesContract$State;
import com.youTransactor.uCube.rpc.Constants;
import hha.e0;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f3877b;

    public /* synthetic */ t(Data data, int i) {
        this.f3876a = i;
        this.f3877b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Integer num;
        switch (this.f3876a) {
            case 0:
                ((h) obj2).getClass();
                Data configuration = this.f3877b;
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                return new h(configuration);
            case 1:
                Data data = this.f3877b;
                Intrinsics.h(data);
                return afa.g.a((afa.g) obj2, null, data, null, null, null, null, null, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
            case 2:
                Data data2 = this.f3877b;
                Intrinsics.h(data2);
                return afa.g.a((afa.g) obj2, data2, null, null, null, null, null, null, null, 254);
            case 3:
                return afa.g.a((afa.g) obj2, null, null, null, null, null, null, null, this.f3877b, CertificateBody.profileType);
            case 4:
                return afa.g.a((afa.g) obj2, null, null, this.f3877b, null, null, null, null, null, Constants.TAG_FB_CHARGING_STATUS);
            case 5:
                Data data3 = this.f3877b;
                Intrinsics.h(data3);
                return afa.g.a((afa.g) obj2, null, null, null, null, null, null, data3, null, 191);
            case 6:
                return ag5.d.a((ag5.d) obj2, this.f3877b, null, 6);
            case 7:
                return agh.d.a((agh.d) obj2, null, this.f3877b, null, 5);
            case 8:
                return agh.d.a((agh.d) obj2, this.f3877b, null, null, 6);
            case 9:
                return agh.d.a((agh.d) obj2, null, null, this.f3877b, 3);
            case 10:
                Data data4 = this.f3877b;
                Intrinsics.h(data4);
                return ah1.e.a((ah1.e) obj2, null, data4, null, 29);
            case 11:
                return ahd.n.a((ahd.n) obj2, null, null, null, this.f3877b, 7);
            case 12:
                return ahd.n.a((ahd.n) obj2, null, this.f3877b, null, null, 13);
            case 13:
                ahf.l lVar = (ahf.l) obj2;
                e0 e0Var = (e0) this.f3877b.getContent();
                return ahf.l.a(lVar, null, null, null, false, null, null, null, 0, (e0Var == null || (num = e0Var.f152300b) == null) ? 0 : num.intValue(), null, 1535);
            case 14:
                return ahg.e.a((ahg.e) obj2, this.f3877b, null, 2);
            case 15:
                return ahg.e.a((ahg.e) obj2, null, this.f3877b, 1);
            case 16:
                return AccountSpacesContract$State.a((AccountSpacesContract$State) obj2, null, this.f3877b, null, null, null, 29);
            case 17:
                return aig.i.a((aig.i) obj2, null, null, null, false, false, null, this.f3877b, 63);
            case 18:
                return aig.i.a((aig.i) obj2, null, null, null, false, false, this.f3877b, null, 95);
            case 19:
                return ajd.h.a((ajd.h) obj2, null, null, null, false, this.f3877b, 15);
            case 20:
                return ajd.h.a((ajd.h) obj2, null, this.f3877b, null, false, null, 29);
            case 21:
                return ajd.h.a((ajd.h) obj2, null, this.f3877b, null, false, null, 29);
            case 22:
                ((ajh.f) obj2).getClass();
                return new ajh.f(this.f3877b);
            case 23:
                ((akb.i) obj2).getClass();
                Data contentData = this.f3877b;
                Intrinsics.checkNotNullParameter(contentData, "contentData");
                return new akb.i(contentData);
            case 24:
                ((ame.d) obj2).getClass();
                Data dataTerms = this.f3877b;
                Intrinsics.checkNotNullParameter(dataTerms, "dataTerms");
                return new ame.d(dataTerms);
            case 25:
                List documents = ((amk.d) obj2).f6469b;
                Data title = this.f3877b;
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(documents, "documents");
                return new amk.d(title, documents);
            case 26:
                return an9.n.a((an9.n) obj2, null, null, null, this.f3877b, 23);
            case 27:
                return anc.e.a((anc.e) obj2, this.f3877b, null, null, null, null, 30);
            case 28:
                return anc.e.a((anc.e) obj2, null, null, null, null, this.f3877b, 15);
            default:
                return anc.e.a((anc.e) obj2, null, null, null, this.f3877b, null, 23);
        }
    }
}
