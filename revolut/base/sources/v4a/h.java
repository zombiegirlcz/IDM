package v4a;

import ael.u0;
import com.revolut.feature.payments.who_to_transfer.api.common.RecipientCountryCurrencyConfig;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.payments.who_to_transfer.api.navigation.RecipientSelectionInputData;
import eqa.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jq9.b0;
import jq9.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import v2e.x;
import v2j.a;
import wg9.p;
import yui.v;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f286004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f286005b;

    public /* synthetic */ h(m mVar, int i) {
        this.f286004a = i;
        this.f286005b = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f286004a) {
            case 0:
                vf0.k kVar = (vf0.k) obj2;
                Intrinsics.checkNotNullParameter(kVar, "<destruct>");
                String str = (String) kVar.f288454a;
                List availableFilters = (List) kVar.f288455b;
                od0.i iVar = (od0.i) kVar.f288456c;
                m3a.c cVar = (m3a.c) kVar.d;
                od0.i jointAccountPartnerCode = (od0.i) kVar.e;
                m mVar = this.f286005b;
                z4a.d dVar = mVar.f286012r;
                if (d0.W(str)) {
                    str = null;
                }
                WhoToTransferFilter whoToTransferFilter = (WhoToTransferFilter) iVar.f224257a;
                Intrinsics.h(availableFilters);
                RecipientSelectionInputData recipientSelectionInputData = mVar.D;
                RecipientCountryCurrencyConfig recipientCountryCurrencyConfig = recipientSelectionInputData.f;
                jq9.a juniorIncludingMode = recipientSelectionInputData.e;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(availableFilters, "availableFilters");
                Intrinsics.checkNotNullParameter(jointAccountPartnerCode, "jointAccountPartnerCode");
                Intrinsics.checkNotNullParameter(juniorIncludingMode, "juniorIncludingMode");
                List list = availableFilters;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(z4a.d.b((WhoToTransferFilter) it8.next()));
                }
                List listU = zhm.d0.U(arrayList);
                ufm.i iVar2 = new ufm.i(dVar.e.f(false), new z3e.a(new z1.c(dVar, recipientCountryCurrencyConfig, 14), 2), 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                sfm.b bVar = new sfm.b(iVar2, new z3e.a(new u0(dVar, str, whoToTransferFilter, availableFilters, juniorIncludingMode, listU, 22), 1), 2);
                Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
                return nim.a.w(bVar, new p(dVar, availableFilters, jointAccountPartnerCode, whoToTransferFilter, 14)).map(new i(6, new v25.k(cVar, 6)));
            case 1:
                rq9.f output = (rq9.f) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (!(output instanceof rq9.d)) {
                    if (!(output instanceof rq9.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f286005b.z2(new b0(((rq9.e) output).f256510a));
                }
                return Unit.f186387a;
            case 2:
                this.f286005b.x2(new x(((Boolean) obj2).booleanValue(), 2));
                return Unit.f186387a;
            case 3:
                j4a.a output2 = (j4a.a) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                this.f286005b.A2(output2.f171330a);
                return Unit.f186387a;
            case 4:
                el3.c output3 = (el3.c) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                if (output3 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f286005b.z2(new y(output3.f127236a));
                return Unit.f186387a;
            case 5:
                this.f286005b.x2(new uo7.k((String) obj2, 18));
                return Unit.f186387a;
            case 6:
                eqa.a result = (eqa.a) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (!(result instanceof eqa.b)) {
                    if (!Intrinsics.f(result, a.AbstractC0741a.C0742a.f128414a) && !Intrinsics.f(result, a.b.f128415a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    od0.i.Companion.getClass();
                    return efm.d0.m(od0.i.f224256b);
                }
                toh.d dVar2 = this.f286005b.f286011q;
                String cardOwnerId = ((eqa.b) result).f128416a.f81490a;
                dVar2.getClass();
                Intrinsics.checkNotNullParameter(cardOwnerId, "cardOwnerId");
                lra.d dVar3 = (lra.d) dVar2.f273215b;
                pfm.a aVar = new pfm.a(dVar3.f199478b.a(), new lr9.m(new lra.b(dVar3, 2), 9), 4);
                Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                efm.d0 d0VarFirstOrError = aVar.g(dVar3.c()).firstOrError();
                Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                ufm.i iVar3 = new ufm.i(zi0.c.t(d0VarFirstOrError), new z3e.a(new v(cardOwnerId, 6), 3), 1);
                Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                return new ufm.i(iVar3, new i(1, new v2g.i(15)), 1);
            default:
                v2j.a result2 = (v2j.a) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (!(result2 instanceof v2j.b)) {
                    if (!(result2 instanceof a.C1576a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    od0.i.Companion.getClass();
                    return efm.d0.m(od0.i.f224256b);
                }
                toh.d dVar4 = this.f286005b.f286011q;
                String beneficiaryId = ((v2j.b) result2).f285746a;
                dVar4.getClass();
                Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
                efm.d0 d0VarFirstOrError2 = ((d3j.b) dVar4.f273214a).j(beneficiaryId, w4l.h.f294642c).firstOrError();
                Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError2, "firstOrError(...)");
                return new ufm.i(zi0.c.t(d0VarFirstOrError2), new i(0, new v2g.i(14)), 1);
        }
    }
}
