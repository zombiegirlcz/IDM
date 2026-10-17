package czc;

import com.revolut.data.model.Data;
import com.revolut.feature.selfserve.sot.api.models.DocumentType;
import com.revolut.feature.selfserve.sot.api.models.IncomeSource;
import com.revolut.feature.selfserve.sot.api.models.SubmissionEvidence;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f110186b;

    public /* synthetic */ b0(Data data, int i) {
        this.f110185a = i;
        this.f110186b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        Data data2;
        switch (this.f110185a) {
            case 0:
                o oVar = (o) obj2;
                Data transaction = this.f110186b;
                Intrinsics.h(transaction);
                IncomeSource incomeSource = oVar.f110209a;
                SubmissionEvidence submissionEvidence = oVar.f110210b;
                String description = oVar.f110211c;
                String note = oVar.d;
                List documentsToUpload = oVar.e;
                DocumentType documentType = oVar.f;
                String str = oVar.f110212g;
                boolean z = oVar.f110213h;
                Intrinsics.checkNotNullParameter(description, "description");
                Intrinsics.checkNotNullParameter(note, "note");
                Intrinsics.checkNotNullParameter(documentsToUpload, "documentsToUpload");
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                return new o(incomeSource, submissionEvidence, description, note, documentsToUpload, documentType, str, z, transaction);
            case 1:
                ((d19.c) obj2).getClass();
                Data data3 = this.f110186b;
                Intrinsics.checkNotNullParameter(data3, "data");
                return new d19.c(data3);
            case 2:
                d27.u uVar = (d27.u) obj2;
                return d27.u.a(uVar, null, d27.n.a(uVar.f110773b, this.f110186b, 0L, 2), null, null, null, false, null, null, null, null, null, 2045);
            case 3:
                return d27.u.a((d27.u) obj2, null, null, null, null, null, false, null, null, this.f110186b, null, null, 1791);
            case 4:
                return d2g.k.a((d2g.k) obj2, this.f110186b, null, 5);
            case 5:
                Data data4 = this.f110186b;
                Intrinsics.h(data4);
                return d2g.k.a((d2g.k) obj2, null, data4, 3);
            case 6:
                d3i.c cVar = (d3i.c) obj2;
                boolean z3 = cVar instanceof d3i.a;
                Data data5 = this.f110186b;
                if (z3) {
                    Intrinsics.h(data5);
                    return d3i.a.d((d3i.a) cVar, null, data5, null, null, 13);
                }
                if (!(cVar instanceof d3i.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                Intrinsics.h(data5);
                return d3i.b.d((d3i.b) cVar, data5, null, 11);
            case 7:
                return d4c.e.a((d4c.e) obj2, this.f110186b, null, 2);
            case 8:
                return d6g.f.a((d6g.f) obj2, this.f110186b);
            case 9:
                return d6j.o.f((d6j.o) obj2, null, false, this.f110186b, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, false, null, 33554415);
            case 10:
                return d6j.o.f((d6j.o) obj2, null, false, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, this.f110186b, false, null, 29360127);
            case 11:
                Data data6 = this.f110186b;
                Intrinsics.h(data6);
                return d6j.o.f((d6j.o) obj2, null, false, null, data6, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, false, null, 33554399);
            case 12:
                return d6j.o.f((d6j.o) obj2, this.f110186b, false, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, false, null, 33554427);
            case 13:
                return d6j.o.f((d6j.o) obj2, null, false, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, (TradingLegalEntityInformation) this.f110186b.getContent(), null, null, null, false, null, 33030143);
            case 14:
                return d6j.o.f((d6j.o) obj2, null, false, null, null, null, null, null, null, 0, null, null, null, null, null, null, this.f110186b, null, null, null, null, false, null, 33423359);
            case 15:
                return d6j.o.f((d6j.o) obj2, null, false, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, false, this.f110186b, 16777215);
            case 16:
                ((d74.f) obj2).getClass();
                Data preferences = this.f110186b;
                Intrinsics.checkNotNullParameter(preferences, "preferences");
                return new d74.f(preferences);
            case 17:
                ((d7f.f) obj2).getClass();
                return new d7f.f(this.f110186b);
            case 18:
                return d7j.w.a((d7j.w) obj2, null, this.f110186b, null, null, null, null, null, null, null, 1021);
            case 19:
                return d7j.w.a((d7j.w) obj2, null, null, null, null, null, this.f110186b, null, null, null, 991);
            case 20:
                return d7j.w.a((d7j.w) obj2, null, null, null, null, null, null, null, null, this.f110186b, 511);
            case 21:
                return d7j.w.a((d7j.w) obj2, null, null, null, null, null, null, null, this.f110186b, null, 767);
            case 22:
                mzg.a type = ((dah.f) obj2).f112533a;
                Intrinsics.checkNotNullParameter(type, "type");
                return new dah.f(type, this.f110186b);
            case 23:
                return db.l.a((db.l) obj2, null, null, null, this.f110186b, null, null, 55);
            case 24:
                ((dba.e) obj2).getClass();
                Data trustedListInfo = this.f110186b;
                Intrinsics.checkNotNullParameter(trustedListInfo, "trustedListInfo");
                return new dba.e(trustedListInfo);
            case 25:
                return dbc.d.a((dbc.d) obj2, this.f110186b, null, 2);
            case 26:
                return dbc.d.a((dbc.d) obj2, null, this.f110186b, 1);
            case 27:
                ((dbl.a) obj2).getClass();
                Data transactionData = this.f110186b;
                Intrinsics.checkNotNullParameter(transactionData, "transactionData");
                return new dbl.a(transactionData);
            case 28:
                Data data7 = this.f110186b;
                dce.p pVar = (dce.p) obj2;
                try {
                    Object content = data7.getContent();
                    data = new Data(content != null ? (List) ((Pair) content).f186385a : null, data7.getError(), data7.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data7.getLoading());
                }
                try {
                    Object content2 = data7.getContent();
                    data2 = new Data(content2 != null ? (hce.a) ((Pair) content2).f186386b : null, data7.getError(), data7.getLoading());
                    break;
                } catch (Throwable th11) {
                    data2 = new Data(null, th11, data7.getLoading());
                }
                return dce.p.a(pVar, data, data2, null, 39);
            default:
                Data data8 = this.f110186b;
                Intrinsics.h(data8);
                return dcf.x.a((dcf.x) obj2, null, null, null, null, data8, null, null, 239);
        }
    }
}
