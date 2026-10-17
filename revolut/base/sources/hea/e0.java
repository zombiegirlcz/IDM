package hea;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.ui.instalment.past.CreditCardInstalmentsScreenContract$InstalmentFilter;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f151631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f151632b;

    public /* synthetic */ e0(Data data, int i) {
        this.f151631a = i;
        this.f151632b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str;
        switch (this.f151631a) {
            case 0:
                return o.a((o) obj2, null, false, null, null, null, null, null, null, false, this.f151632b, null, false, null, null, false, 32255);
            case 1:
                return o.a((o) obj2, null, false, null, null, this.f151632b, null, null, null, false, null, null, false, null, null, false, 32751);
            case 2:
                Data data = this.f151632b;
                Intrinsics.h(data);
                return hee.j.a((hee.j) obj2, data, null, null, null, false, false, 62);
            case 3:
                return hg4.j.a((hg4.j) obj2, this.f151632b, false, 2);
            case 4:
                return hgb.k.a((hgb.k) obj2, this.f151632b, null, false, 6);
            case 5:
                Data data2 = this.f151632b;
                Intrinsics.h(data2);
                return hk9.j.a((hk9.j) obj2, data2, null, null, false, 30);
            case 6:
                return hk9.j.a((hk9.j) obj2, null, this.f151632b, null, false, 29);
            case 7:
                ((hkb.a) obj2).getClass();
                Data challengeAccount = this.f151632b;
                Intrinsics.checkNotNullParameter(challengeAccount, "challengeAccount");
                return new hkb.a(challengeAccount);
            case 8:
                ((hkj.d) obj2).getClass();
                Data invoices = this.f151632b;
                Intrinsics.checkNotNullParameter(invoices, "invoices");
                return new hkj.d(invoices);
            case 9:
                return hkk.e.a((hkk.e) obj2, this.f151632b, null, 2);
            case 10:
                Data data3 = this.f151632b;
                Intrinsics.h(data3);
                return hkk.e.a((hkk.e) obj2, null, data3, 1);
            case 11:
                return hl6.g.a((hl6.g) obj2, this.f151632b, null, null, null, null, 30);
            case 12:
                Data data4 = this.f151632b;
                Intrinsics.h(data4);
                return hl6.g.a((hl6.g) obj2, data4, null, null, null, null, 30);
            case 13:
                return ho6.h.a((ho6.h) obj2, this.f151632b, null, 2);
            case 14:
                return ho6.h.a((ho6.h) obj2, this.f151632b, null, 2);
            case 15:
                return hp3.m.a((hp3.m) obj2, null, null, null, false, null, null, null, null, false, false, null, this.f151632b, 16383);
            case 16:
                ((hp4.g) obj2).getClass();
                Data content = this.f151632b;
                Intrinsics.checkNotNullParameter(content, "content");
                return new hp4.g(content);
            case 17:
                return hq7.f.a((hq7.f) obj2, null, this.f151632b, null, 5);
            case 18:
                return hq7.f.a((hq7.f) obj2, this.f151632b, null, null, 6);
            case 19:
                ((hq8.g) obj2).getClass();
                Data juniorProfile = this.f151632b;
                Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
                return new hq8.g(juniorProfile);
            case 20:
                CreditCardInstalmentsScreenContract$InstalmentFilter filter = ((hs4.e) obj2).f154988b;
                Data model = this.f151632b;
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(filter, "filter");
                return new hs4.e(model, filter);
            case 21:
                ht2.i iVar = (ht2.i) obj2;
                Data data5 = this.f151632b;
                ru.y yVar = (ru.y) data5.getContent();
                return ht2.i.a(iVar, data5, null, null, false, null, false, null, pd.b.j((yVar == null || (str = yVar.f257389c) == null) ? null : Boolean.valueOf(kotlin.text.d0.J(str, "REFBLOCK", true))), 126);
            case 22:
                return ht2.i.a((ht2.i) obj2, null, this.f151632b, null, false, null, false, null, false, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
            case 23:
                return ht2.i.a((ht2.i) obj2, null, null, this.f151632b, false, null, false, null, false, Constants.TAG_FB_CHARGING_STATUS);
            case 24:
                return hu1.o.a((hu1.o) obj2, null, null, this.f151632b, false, false, false, false, null, null, 507);
            case 25:
                return hu1.o.a((hu1.o) obj2, null, this.f151632b, null, false, false, false, false, null, null, 509);
            case 26:
                Data data6 = this.f151632b;
                Intrinsics.h(data6);
                return hud.i.a((hud.i) obj2, null, null, null, null, null, null, data6, 1023);
            case 27:
                return hui.k.a((hui.k) obj2, null, null, null, this.f151632b, null, null, null, LDSFile.EF_SOD_TAG);
            case 28:
                return hui.k.a((hui.k) obj2, null, null, null, null, null, null, this.f151632b, 63);
            default:
                Data data7 = this.f151632b;
                Intrinsics.h(data7);
                return hui.k.a((hui.k) obj2, data7, null, null, null, null, null, null, 126);
        }
    }
}
