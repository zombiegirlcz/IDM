package f08;

import a08.f0;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument;
import do3.n;
import efm.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kx7.w;
import kx7.y0;
import zhm.h0;
import zw7.a1;
import zw7.d0;
import zw7.r0;
import zw7.s0;
import zw7.t;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f131009b;

    public /* synthetic */ f(h hVar, int i) {
        this.f131008a = i;
        this.f131009b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String country;
        switch (this.f131008a) {
            case 0:
                n user = (n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                od0.h hVar = od0.i.Companion;
                Address address = user.k;
                String strB = (address == null || (country = address.getCountry()) == null) ? null : ((o8b.c) this.f131009b.f).b(country);
                hVar.getClass();
                return od0.h.a(strB);
            case 1:
                String petId = (String) obj2;
                Intrinsics.checkNotNullParameter(petId, "petId");
                return this.f131009b.f131012b.d(petId);
            case 2:
                d0 pet = (d0) obj2;
                Intrinsics.checkNotNullParameter(pet, "pet");
                return pet.f325771m.contains(t.PAYMENT_OVERDUE) ? nim.a.w(ue0.e.p(((w4l.f) ((w) this.f131009b.f131013c.f138763a).d.getValue()).f(Unit.f186387a, false), h0.f322473a), new eu7.c(pet, 25)) : zi0.c.j(new n08.e(pet, null));
            case 3:
                String policyId = (String) obj2;
                Intrinsics.checkNotNullParameter(policyId, "policyId");
                fx7.f fVar = this.f131009b.f131012b;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(policyId, "policyId");
                r map = ((y0) fVar.f138760a).a().f(Unit.f186387a, false).map(new f0(14, new atg.t(policyId, policyId, 6)));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return map;
            case 4:
                String petId2 = (String) obj2;
                Intrinsics.checkNotNullParameter(petId2, "petId");
                return this.f131009b.f131012b.d(petId2);
            case 5:
                List history = (List) obj2;
                Intrinsics.checkNotNullParameter(history, "history");
                ArrayList arrayList = new ArrayList();
                Iterator it8 = history.iterator();
                while (it8.hasNext()) {
                    PolicyDocument.Pdf pdfJ3 = this.f131009b.j3((zw7.m) it8.next());
                    if (pdfJ3 != null) {
                        arrayList.add(pdfJ3);
                    }
                }
                return arrayList;
            case 6:
                s0 policyData = (s0) obj2;
                Intrinsics.checkNotNullParameter(policyData, "policyData");
                r0 r0VarA = a1.a(policyData);
                return nim.a.w(fx7.j.a(this.f131009b.d, r0VarA.f325839a, "STATEMENT_OF_INSURANCE"), new eu7.c(r0VarA, 24));
            default:
                List document = (List) obj2;
                Intrinsics.checkNotNullParameter(document, "document");
                ArrayList arrayList2 = new ArrayList();
                Iterator it9 = document.iterator();
                while (it9.hasNext()) {
                    PolicyDocument.Pdf pdfJ32 = this.f131009b.j3((zw7.m) it9.next());
                    if (pdfJ32 != null) {
                        arrayList2.add(pdfJ32);
                    }
                }
                return arrayList2;
        }
    }
}
