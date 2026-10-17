package a2f;

import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.flow.TaxHubTransactionExportFlowContract$State;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mlk.v;
import org.jmrtd.lds.LDSFile;
import te0.w;
import v0f.u;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ do3.n f817b;

    public /* synthetic */ j(do3.n nVar, int i) {
        this.f816a = i;
        this.f817b = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        e eVar;
        Object next;
        String country;
        switch (this.f816a) {
            case 0:
                f update = (f) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                do3.n nVar = this.f817b;
                if (nVar != null) {
                    String str = nVar.f116410c;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = nVar.e;
                    eVar = new e(str, str2 != null ? str2 : "");
                } else {
                    eVar = null;
                }
                return f.a(update, null, null, eVar, 3);
            case 1:
                return ara.i.a((ara.i) obj2, null, null, null, this.f817b, 7);
            case 2:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                List list = (List) rVar.f314201a;
                Map map = (Map) rVar.f314202b;
                String str3 = (String) rVar.f314203c;
                do3.n nVar2 = this.f817b;
                Intrinsics.h(nVar2);
                return new bs9.p(nVar2, list, map, str3);
            case 3:
                return bs9.o.a((bs9.o) obj2, null, null, false, false, false, null, null, 0, null, null, this.f817b, 4095);
            case 4:
                return e4b.e.a((e4b.e) obj2, null, this.f817b.f116408a, null, null, 27);
            case 5:
                return f0e.a.a((f0e.a) obj2, null, this.f817b, 3);
            case 6:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                od0.h hVar = od0.i.Companion;
                Iterator it9 = it8.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        next = it9.next();
                        if (Intrinsics.f(((nb8.b) next).f214010h.f214013a, this.f817b.f116408a)) {
                        }
                    } else {
                        next = null;
                    }
                }
                hVar.getClass();
                return od0.h.a(next);
            case 7:
                return gkk.d.a((gkk.d) obj2, null, null, new Data(this.f817b, null, false, 6, null), null, 23);
            case 8:
                return hud.i.a((hud.i) obj2, null, null, null, this.f817b, null, null, null, 1919);
            case 9:
                do3.n nVar3 = this.f817b;
                Intrinsics.h(nVar3);
                return i13.i.a((i13.i) obj2, false, false, do3.q.y(nVar3), 7);
            case 10:
                return jwc.f.a((jwc.f) obj2, null, this.f817b, 7);
            case 11:
                return TaxHubTransactionExportFlowContract$State.a((TaxHubTransactionExportFlowContract$State) obj2, null, null, null, 0, 0, 0, this.f817b, 63);
            case 12:
                return kye.m.a((kye.m) obj2, false, null, null, null, null, null, null, null, null, false, this.f817b, null, false, null, null, null, null, null, null, null, false, false, null, false, null, false, false, null, null, null, null, null, null, null, null, null, -1025, 63);
            case 13:
                return l9j.f.a((l9j.f) obj2, null, null, null, this.f817b, 7);
            case 14:
                return m9j.h.a((m9j.h) obj2, null, null, null, false, null, this.f817b, null, OnfidoActivity.RESULT_EXIT_MISSING_ONFIDO_CONFIG);
            case 15:
                return v.a((v) obj2, null, null, null, new Data(this.f817b.f116410c, null, false, 6, null), null, LDSFile.EF_DG15_TAG);
            case 16:
                o48.a aVar = (o48.a) obj2;
                Address address = this.f817b.k;
                wi0.b bVarC = (address == null || (country = address.getCountry()) == null) ? null : com.bumptech.glide.d.c(country);
                aVar.getClass();
                return new o48.a(bVarC);
            case 17:
                qgg.h updateState = (qgg.h) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                do3.n nVar4 = this.f817b;
                String str4 = nVar4.f116410c;
                if (str4 == null) {
                    str4 = "";
                }
                String str5 = nVar4.e;
                return qgg.h.a(updateState, new qgg.g(str4, str5 != null ? str5 : ""), null, 2);
            case 18:
                return qwd.m.a((qwd.m) obj2, 0L, null, null, false, null, null, null, this.f817b, 511);
            case 19:
                yhm.r rVar2 = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar2, "<destruct>");
                return new vf0.h(this.f817b, (ipa.n) rVar2.f314203c, ((od0.i) rVar2.f314202b).g(), (String) rVar2.f314201a);
            case 20:
                return u.a((u) obj2, null, null, null, null, null, null, this.f817b, null, false, false, false, false, false, false, 16319);
            case 21:
                vvc.g gVar = (vvc.g) obj2;
                Address address2 = this.f817b.k;
                return vvc.g.a(gVar, null, null, false, null, address2 != null ? nz8.d.g(address2).f297794a : null, 47);
            case 22:
                return yf1.m.a((yf1.m) obj2, null, null, null, null, null, this.f817b, 31);
            case 23:
                do3.n nVar5 = this.f817b;
                Intrinsics.h(nVar5);
                return yw9.e.a((yw9.e) obj2, null, null, w.I(nVar5), null, null, 27);
            default:
                return zzd.q.a((zzd.q) obj2, null, null, null, null, null, this.f817b, 31);
        }
    }
}
