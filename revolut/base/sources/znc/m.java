package znc;

import com.revolut.data.model.Data;
import com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormState;
import java.time.LocalDate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import zq5.u;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f323702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f323703b;

    public /* synthetic */ m(Data data, int i) {
        this.f323702a = i;
        this.f323703b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f323702a) {
            case 0:
                ((d) obj2).getClass();
                return new d(this.f323703b);
            case 1:
                zo2.d dVar = (zo2.d) obj2;
                FormState formState = dVar.f323858a;
                LocalDate localDate = dVar.f323859b;
                mn2.a serviceType = dVar.f323860c;
                wn2.a targetAccountType = dVar.d;
                wn2.d dVar2 = dVar.e;
                Intrinsics.checkNotNullParameter(formState, "formState");
                Intrinsics.checkNotNullParameter(serviceType, "serviceType");
                Intrinsics.checkNotNullParameter(targetAccountType, "targetAccountType");
                Data content = this.f323703b;
                Intrinsics.checkNotNullParameter(content, "content");
                return new zo2.d(formState, localDate, serviceType, targetAccountType, dVar2, content);
            case 2:
                Data data = this.f323703b;
                Intrinsics.h(data);
                return u.a((u) obj2, data, false, null, null, null, 30);
            case 3:
                ((zqc.f) obj2).getClass();
                Data data2 = this.f323703b;
                Intrinsics.checkNotNullParameter(data2, "data");
                return new zqc.f(data2);
            case 4:
                Data data3 = this.f323703b;
                Intrinsics.h(data3);
                return zqf.d.a((zqf.d) obj2, data3);
            case 5:
                Data data4 = this.f323703b;
                Intrinsics.h(data4);
                return zr2.c.a((zr2.c) obj2, data4, false, 2);
            case 6:
                ((zr4.i) obj2).getClass();
                Data model = this.f323703b;
                Intrinsics.checkNotNullParameter(model, "model");
                return new zr4.i(model);
            case 7:
                return zrd.a.a((zrd.a) obj2, null, null, null, null, 0, this.f323703b, 63);
            case 8:
                ((zsk.a) obj2).getClass();
                Data instrumentIsSpac = this.f323703b;
                Intrinsics.checkNotNullParameter(instrumentIsSpac, "instrumentIsSpac");
                return new zsk.a(instrumentIsSpac);
            case 9:
                boolean z = ((zt4.a) obj2).f325068b;
                Data content2 = this.f323703b;
                Intrinsics.checkNotNullParameter(content2, "content");
                return new zt4.a(content2, z);
            case 10:
                return zuj.n.a((zuj.n) obj2, this.f323703b, null, null, null, 14);
            case 11:
                Data data5 = this.f323703b;
                Intrinsics.h(data5);
                return zul.n.a((zul.n) obj2, null, null, null, null, null, data5, null, null, null, null, null, 4031);
            case 12:
                return zul.n.a((zul.n) obj2, null, null, this.f323703b, null, null, null, null, null, null, null, null, 4087);
            case 13:
                return zul.n.a((zul.n) obj2, null, null, null, this.f323703b, null, null, null, null, null, null, null, 4079);
            case 14:
                return zul.n.a((zul.n) obj2, null, null, null, null, this.f323703b, null, null, null, null, null, null, 4063);
            case 15:
                return zul.n.a((zul.n) obj2, null, null, null, null, null, null, this.f323703b, null, null, null, null, 3967);
            case 16:
                return zul.n.a((zul.n) obj2, null, null, null, null, null, null, null, this.f323703b, null, null, null, 3839);
            case 17:
                return zvc.d.a((zvc.d) obj2, this.f323703b, null, false, 6);
            case 18:
                zw5.a updateState = (zw5.a) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return zw5.a.a(updateState, null, null, null, null, null, null, null, this.f323703b.getLoading(), CertificateBody.profileType);
            case 19:
                Data data6 = this.f323703b;
                Intrinsics.h(data6);
                return zw5.a.a((zw5.a) obj2, null, null, null, null, null, null, data6, false, 191);
            case 20:
                return zx6.h.a((zx6.h) obj2, null, null, this.f323703b, 3);
            case 21:
                Data bottomSheetData = this.f323703b;
                Intrinsics.h(bottomSheetData);
                ((zyb.d) obj2).getClass();
                Intrinsics.checkNotNullParameter(bottomSheetData, "bottomSheetData");
                return new zyb.d(bottomSheetData);
            case 22:
                Data data7 = this.f323703b;
                Intrinsics.h(data7);
                return zyc.k.a((zyc.k) obj2, false, data7, null, null, 13);
            case 23:
                zyc.k kVar = (zyc.k) obj2;
                Data data8 = this.f323703b;
                Intrinsics.h(data8);
                hyc.e eVar = (hyc.e) data8.getContent();
                return zyc.k.a(kVar, eVar != null ? eVar.d : kVar.f326416a, null, data8, null, 10);
            case 24:
                Data data9 = this.f323703b;
                Intrinsics.h(data9);
                return zyc.k.a((zyc.k) obj2, false, null, null, data9, 7);
            default:
                ((zzb.h) obj2).getClass();
                Data preferences = this.f323703b;
                Intrinsics.checkNotNullParameter(preferences, "preferences");
                return new zzb.h(preferences);
        }
    }
}
