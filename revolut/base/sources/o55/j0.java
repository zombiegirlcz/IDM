package o55;

import androidx.room.util.DBUtil;
import com.revolut.feature.credit.loan.impl.network.LoanStatementsService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o45.d2;
import o45.e2;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: loaded from: classes21.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanStatementsService f222349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f222350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n45.e f222351c;
    public final n45.f d;
    public final ij0.a e;
    public final w4l.f f;

    public j0(LoanStatementsService api2, ne0.j memoryCache, n45.e statementDocumentsDao, n45.f updateDateDao, ij0.a networkConfiguration) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(statementDocumentsDao, "statementDocumentsDao");
        Intrinsics.checkNotNullParameter(updateDateDao, "updateDateDao");
        Intrinsics.checkNotNullParameter(networkConfiguration, "networkConfiguration");
        this.f222349a = api2;
        this.f222350b = memoryCache;
        this.f222351c = statementDocumentsDao;
        this.d = updateDateDao;
        this.e = networkConfiguration;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: o55.i0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j0 f222348b;

            {
                this.f222348b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String loanId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(loanId, "loanId");
                        break;
                    case 1:
                        String loanId2 = (String) obj2;
                        List statementDocuments = (List) obj3;
                        Intrinsics.checkNotNullParameter(loanId2, "loanId");
                        Intrinsics.checkNotNullParameter(statementDocuments, "statementDocuments");
                        ne0.j jVar = this.f222348b.f222350b;
                        Intrinsics.checkNotNullParameter(loanId2, "loanId");
                        jVar.f(ebm.a.s(loanId2), statementDocuments);
                        break;
                    default:
                        String loanId3 = (String) obj2;
                        List statementDocuments2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(loanId3, "loanId");
                        Intrinsics.checkNotNullParameter(statementDocuments2, "statementDocuments");
                        j0 j0Var = this.f222348b;
                        n45.e eVar = j0Var.f222351c;
                        List<i55.h0> list = statementDocuments2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (i55.h0 h0Var : list) {
                            Intrinsics.checkNotNullParameter(h0Var, "<this>");
                            arrayList.add(new d2(h0Var.getLoanId(), h0Var.getStatementId(), h0Var.getIssueDate(), h0Var.getStatementPeriodFrom(), h0Var.getStatementPeriodTo(), h0Var.getType()));
                        }
                        eVar.getClass();
                        DBUtil.performBlocking(eVar.f212300a, false, true, new n45.b(eVar, arrayList, 3));
                        n45.f fVar = j0Var.d;
                        Intrinsics.checkNotNullParameter(loanId3, "loanId");
                        String key = ebm.a.s(loanId3);
                        fVar.getClass();
                        Intrinsics.checkNotNullParameter(key, "key");
                        fVar.b(new e2(key, System.currentTimeMillis()));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i2 = 1;
        h0 h0Var = new h0(this, 1);
        Function2 function22 = new Function2(this) { // from class: o55.i0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j0 f222348b;

            {
                this.f222348b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String loanId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(loanId, "loanId");
                        break;
                    case 1:
                        String loanId2 = (String) obj2;
                        List statementDocuments = (List) obj3;
                        Intrinsics.checkNotNullParameter(loanId2, "loanId");
                        Intrinsics.checkNotNullParameter(statementDocuments, "statementDocuments");
                        ne0.j jVar = this.f222348b.f222350b;
                        Intrinsics.checkNotNullParameter(loanId2, "loanId");
                        jVar.f(ebm.a.s(loanId2), statementDocuments);
                        break;
                    default:
                        String loanId3 = (String) obj2;
                        List statementDocuments2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(loanId3, "loanId");
                        Intrinsics.checkNotNullParameter(statementDocuments2, "statementDocuments");
                        j0 j0Var = this.f222348b;
                        n45.e eVar = j0Var.f222351c;
                        List<i55.h0> list = statementDocuments2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (i55.h0 h0Var2 : list) {
                            Intrinsics.checkNotNullParameter(h0Var2, "<this>");
                            arrayList.add(new d2(h0Var2.getLoanId(), h0Var2.getStatementId(), h0Var2.getIssueDate(), h0Var2.getStatementPeriodFrom(), h0Var2.getStatementPeriodTo(), h0Var2.getType()));
                        }
                        eVar.getClass();
                        DBUtil.performBlocking(eVar.f212300a, false, true, new n45.b(eVar, arrayList, 3));
                        n45.f fVar = j0Var.d;
                        Intrinsics.checkNotNullParameter(loanId3, "loanId");
                        String key = ebm.a.s(loanId3);
                        fVar.getClass();
                        Intrinsics.checkNotNullParameter(key, "key");
                        fVar.b(new e2(key, System.currentTimeMillis()));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i3 = 2;
        this.f = new w4l.f(function2, h0Var, function22, new h0(this, 2), new Function2(this) { // from class: o55.i0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j0 f222348b;

            {
                this.f222348b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String loanId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(loanId, "loanId");
                        break;
                    case 1:
                        String loanId2 = (String) obj2;
                        List statementDocuments = (List) obj3;
                        Intrinsics.checkNotNullParameter(loanId2, "loanId");
                        Intrinsics.checkNotNullParameter(statementDocuments, "statementDocuments");
                        ne0.j jVar = this.f222348b.f222350b;
                        Intrinsics.checkNotNullParameter(loanId2, "loanId");
                        jVar.f(ebm.a.s(loanId2), statementDocuments);
                        break;
                    default:
                        String loanId3 = (String) obj2;
                        List statementDocuments2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(loanId3, "loanId");
                        Intrinsics.checkNotNullParameter(statementDocuments2, "statementDocuments");
                        j0 j0Var = this.f222348b;
                        n45.e eVar = j0Var.f222351c;
                        List<i55.h0> list = statementDocuments2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (i55.h0 h0Var2 : list) {
                            Intrinsics.checkNotNullParameter(h0Var2, "<this>");
                            arrayList.add(new d2(h0Var2.getLoanId(), h0Var2.getStatementId(), h0Var2.getIssueDate(), h0Var2.getStatementPeriodFrom(), h0Var2.getStatementPeriodTo(), h0Var2.getType()));
                        }
                        eVar.getClass();
                        DBUtil.performBlocking(eVar.f212300a, false, true, new n45.b(eVar, arrayList, 3));
                        n45.f fVar = j0Var.d;
                        Intrinsics.checkNotNullParameter(loanId3, "loanId");
                        String key = ebm.a.s(loanId3);
                        fVar.getClass();
                        Intrinsics.checkNotNullParameter(key, "key");
                        fVar.b(new e2(key, System.currentTimeMillis()));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
