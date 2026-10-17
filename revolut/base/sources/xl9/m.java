package xl9;

import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f306966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f306967b;

    public /* synthetic */ m(Data data, int i) {
        this.f306966a = i;
        this.f306967b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        Address address;
        switch (this.f306966a) {
            case 0:
                Data data2 = this.f306967b;
                e eVar = (e) obj2;
                try {
                    Object content = data2.getContent();
                    data = new Data(content != null ? ((nl9.g) content).d : null, data2.getError(), data2.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data2.getLoading());
                }
                Data data3 = data;
                nl9.g gVar = (nl9.g) data2.getContent();
                return e.a(eVar, false, data3, gVar != null ? gVar.f217103b : false, null, 9);
            case 1:
                e eVar2 = (e) obj2;
                do3.n nVar = (do3.n) this.f306967b.getContent();
                return e.a(eVar2, false, null, false, (nVar == null || (address = nVar.k) == null) ? null : nz8.d.g(address), 7);
            case 2:
                ((xlj.d) obj2).getClass();
                Data payments = this.f306967b;
                Intrinsics.checkNotNullParameter(payments, "payments");
                return new xlj.d(payments);
            case 3:
                ((xmd.f) obj2).getClass();
                Data data4 = this.f306967b;
                Intrinsics.checkNotNullParameter(data4, "data");
                return new xmd.f(data4);
            case 4:
                Data data5 = this.f306967b;
                Intrinsics.h(data5);
                return xn6.e.a((xn6.e) obj2, false, data5, null, 29);
            case 5:
                Data data6 = this.f306967b;
                Intrinsics.h(data6);
                return xn6.e.a((xn6.e) obj2, false, data6, null, 29);
            case 6:
                return xng.h.a((xng.h) obj2, this.f306967b, null, 0L, null, YearClass.CLASS_2015);
            case 7:
                return xo8.j.a((xo8.j) obj2, null, null, false, null, null, null, null, false, false, false, false, this.f306967b, null, null, 14335);
            case 8:
                return xo8.j.a((xo8.j) obj2, this.f306967b, null, false, null, null, null, null, false, false, false, false, null, null, null, 16382);
            case 9:
                return xo8.j.a((xo8.j) obj2, null, null, false, null, null, null, (String) this.f306967b.getContent(), false, false, false, false, null, null, null, 16319);
            case 10:
                return xo8.j.a((xo8.j) obj2, null, (psg.a) this.f306967b.getContent(), false, null, null, null, null, false, false, false, false, null, null, null, 16381);
            case 11:
                ((xob.f) obj2).getClass();
                Data contentData = this.f306967b;
                Intrinsics.checkNotNullParameter(contentData, "contentData");
                return new xob.f(contentData);
            case 12:
                return xpk.h.a((xpk.h) obj2, false, false, false, null, this.f306967b, null, false, OnfidoActivity.RESULT_EXIT_MISSING_ONFIDO_CONFIG);
            case 13:
                return xpl.c.a((xpl.c) obj2, this.f306967b, null, 2);
            case 14:
                ((xq7.c) obj2).getClass();
                Data telematicsDeviceUnplugged = this.f306967b;
                Intrinsics.checkNotNullParameter(telematicsDeviceUnplugged, "telematicsDeviceUnplugged");
                return new xq7.c(telematicsDeviceUnplugged);
            case 15:
                ((xqd.a) obj2).getClass();
                Data score = this.f306967b;
                Intrinsics.checkNotNullParameter(score, "score");
                return new xqd.a(score);
            case 16:
                ((xs4.f) obj2).getClass();
                Data content2 = this.f306967b;
                Intrinsics.checkNotNullParameter(content2, "content");
                return new xs4.f(content2);
            case 17:
                return xsi.c.a((xsi.c) obj2, this.f306967b);
            case 18:
                return xti.e.a((xti.e) obj2, null, this.f306967b, 1);
            case 19:
                return xv4.f.a((xv4.f) obj2, this.f306967b, false, false, 14);
            case 20:
                ((xvc.f) obj2).getClass();
                Data streetModeInfo = this.f306967b;
                Intrinsics.checkNotNullParameter(streetModeInfo, "streetModeInfo");
                return new xvc.f(streetModeInfo);
            case 21:
                return xxi.e.a((xxi.e) obj2, null, this.f306967b, null, 5);
            case 22:
                return xxi.e.a((xxi.e) obj2, this.f306967b, null, null, 6);
            case 23:
                xya.j invitesList = new xya.j(this.f306967b);
                boolean z = ((xya.m) obj2).f309690b;
                Intrinsics.checkNotNullParameter(invitesList, "invitesList");
                return new xya.m(invitesList, z);
            case 24:
                xya.i invitesList2 = new xya.i(this.f306967b);
                ((xya.m) obj2).getClass();
                Intrinsics.checkNotNullParameter(invitesList2, "invitesList");
                return new xya.m(invitesList2, false);
            case 25:
                Data data7 = this.f306967b;
                Intrinsics.h(data7);
                return xyb.d.a((xyb.d) obj2, data7, null, 2);
            case 26:
                return xyb.d.a((xyb.d) obj2, null, this.f306967b, 1);
            case 27:
                ((y44.g) obj2).getClass();
                Data configuration = this.f306967b;
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                return new y44.g(configuration);
            case 28:
                y4c.d dVar = (y4c.d) obj2;
                Data data8 = this.f306967b;
                b5c.b bVar = (b5c.b) data8.getContent();
                if (bVar == null) {
                    bVar = (b5c.b) dVar.f310862b.getContent();
                }
                return y4c.d.a(dVar, Data.copy$default(data8, bVar, null, false, 6, null), null, null, 29);
            default:
                Data data9 = this.f306967b;
                Intrinsics.h(data9);
                return y4c.d.a((y4c.d) obj2, null, null, data9, 15);
        }
    }
}
