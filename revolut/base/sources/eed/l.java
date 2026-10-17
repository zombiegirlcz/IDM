package eed;

import aed.o;
import com.revolut.retail.feature.esim.api.model.EsimDataPlanOfferInfo;
import com.revolut.retail.feature.esim.api.model.EsimDescriptorValue;
import com.revolut.retail.feature.esim.impl.ui.screens.checkout.mappers.EsimDynamicTermsMapper$TermsClickData;
import dej.t3;
import efm.d0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125197a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f125198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f125199c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ l(long j2, EsimDataPlanOfferInfo esimDataPlanOfferInfo, String str, String str2, String str3) {
        this.f125198b = str;
        this.f125199c = str2;
        this.d = j2;
        this.e = str3;
        this.f = esimDataPlanOfferInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f125197a) {
            case 0:
                n nVar = (n) this.e;
                Long l2 = (Long) this.f;
                String currentUserId = (String) obj2;
                Intrinsics.checkNotNullParameter(currentUserId, "currentUserId");
                o oVar = (o) nVar.f125201a;
                oVar.getClass();
                String id10 = this.f125198b;
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(currentUserId, "currentUserId");
                String name = this.f125199c;
                Intrinsics.checkNotNullParameter(name, "name");
                d0<zdd.i> d0VarEditVault = oVar.f3546a.editVault(id10, new zdd.j(name, this.d, l2));
                a9j.j jVar = new a9j.j(new a31.m(currentUserId, 6, oVar, id10), 29);
                d0VarEditVault.getClass();
                pfm.a aVar = new pfm.a(d0VarEditVault, jVar, 4);
                Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                return w.g0(aVar);
            default:
                String str = (String) this.e;
                EsimDataPlanOfferInfo esimDataPlanOfferInfo = (EsimDataPlanOfferInfo) this.f;
                EsimDescriptorValue descriptorValue = (EsimDescriptorValue) obj2;
                Intrinsics.checkNotNullParameter(descriptorValue, "descriptorValue");
                boolean z = descriptorValue instanceof EsimDescriptorValue.Link;
                String str2 = this.f125198b;
                if (z) {
                    return new EsimDynamicTermsMapper$TermsClickData.UrlParcel(str2, ((EsimDescriptorValue.Link) descriptorValue).f100253a);
                }
                if (!(descriptorValue instanceof EsimDescriptorValue.Action)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (fhj.l.f135257a[((t3) ((EsimDescriptorValue.Action) descriptorValue).f100252a).ordinal()] == 1) {
                    return new EsimDynamicTermsMapper$TermsClickData.DownloadContractSummaryParcel(this.d, esimDataPlanOfferInfo, str2, this.f125199c, str);
                }
                throw new NoWhenBranchMatchedException();
        }
    }

    public /* synthetic */ l(n nVar, String str, String str2, long j2, Long l2) {
        this.e = nVar;
        this.f125198b = str;
        this.f125199c = str2;
        this.d = j2;
        this.f = l2;
    }
}
