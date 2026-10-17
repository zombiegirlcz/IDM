package cu8;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.kyc.api.navigation.document_collection.DocumentCollectionInputData;
import com.revolut.feature.kyc.impl.KycScreenContract$Step;
import com.revolut.feature.kyc.impl.choosedocument.model.SelectedKycDocs;
import grl.k9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.kyc.impl.b f108847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f108848c;

    public /* synthetic */ j(com.revolut.feature.kyc.impl.b bVar, boolean z, int i) {
        this.f108846a = i;
        this.f108847b = bVar;
        this.f108848c = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f108846a;
        com.revolut.feature.kyc.impl.b bVar = this.f108847b;
        switch (i) {
            case 0:
                e7l.f config = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(config, "commonConfig");
                j1 j1Var = bVar.e;
                SelectedKycDocs selectedKycDocs = (SelectedKycDocs) ((n1) j1Var).H0().get();
                n1 n1Var = (n1) j1Var;
                my8.r rVar = (my8.r) n1Var.E0().get();
                String str = selectedKycDocs.f77600c;
                List list = selectedKycDocs.f77598a;
                Iterator it8 = list.iterator();
                int i2 = 0;
                while (true) {
                    if (!it8.hasNext()) {
                        i2 = -1;
                    } else if (!Intrinsics.f(((my8.l) it8.next()).f210383a, str)) {
                        i2++;
                    }
                }
                ArrayList arrayList = new ArrayList();
                int i3 = 0;
                for (Object obj3 : list) {
                    int i5 = i3 + 1;
                    if (i3 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    if (i2 < i3) {
                        arrayList.add(obj3);
                    }
                    i3 = i5;
                }
                wi0.b userCountry = (wi0.b) n1Var.B0().get();
                wi0.b bVar2 = (wi0.b) n1Var.I0().get();
                Intrinsics.checkNotNullParameter(rVar, "<this>");
                Intrinsics.checkNotNullParameter(config, "config");
                Intrinsics.checkNotNullParameter(userCountry, "userCountry");
                boolean z = !zi0.c.A(rVar, config.Y0, userCountry);
                String str2 = (String) ((od0.i) n1Var.J0().get()).f224257a;
                wi0.b bVar3 = (wi0.b) te0.w.O(n1Var.C0());
                k9 value = bVar.p3() ? k9.Onboarding : k9.KYC;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                Intrinsics.checkNotNullParameter(value, "value");
                te0.n nVar = n1Var.f108875w;
                KProperty[] kPropertyArr = n1.f108861y;
                od0.i iVar = (od0.i) te0.w.O(nVar.getValue(n1Var, kPropertyArr[22]));
                return new KycScreenContract$Step.DocumentCollection(new DocumentCollectionInputData(bVar2, userCountry, z, rVar, str2, bVar3, arrayList, new AnalyticsProduct.Retail(value), this.f108848c, iVar != null ? (String) iVar.f224257a : null, ((Boolean) n1Var.i.getValue(n1Var, kPropertyArr[8]).get()).booleanValue() || !((Boolean) n1Var.x0().get()).booleanValue()));
            default:
                vf0.h hVar = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar, "<destruct>");
                KycScreenContract$Step kycScreenContract$Step = (KycScreenContract$Step) hVar.f288433a;
                wi0.b bVar4 = (wi0.b) hVar.f288434b;
                my8.r scope = (my8.r) hVar.f288435c;
                od0.i iVar2 = (od0.i) hVar.d;
                if (!(kycScreenContract$Step instanceof KycScreenContract$Step.RemoteDocs) && !(kycScreenContract$Step instanceof KycScreenContract$Step.MoreDocs) && !(kycScreenContract$Step instanceof KycScreenContract$Step.Vision)) {
                    return efm.r.empty();
                }
                ot8.a aVar = bVar.f77568c;
                String str3 = (String) iVar2.f224257a;
                wi0.b bVar5 = (wi0.b) te0.w.O(((n1) bVar.e).C0());
                wi0.b bVar6 = zi0.c.B(scope) ? bVar4 : null;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(scope, "scope");
                return rd0.e.c(aVar.a(scope, bVar6, str3, bVar5, this.f108848c), kotlin.coroutines.g.f186406a);
        }
    }
}
