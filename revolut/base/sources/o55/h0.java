package o55;

import androidx.room.util.DBUtil;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import o45.d2;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class h0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f222344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f222345b;

    public /* synthetic */ h0(j0 j0Var, int i) {
        this.f222344a = i;
        this.f222345b = j0Var;
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f222344a;
        j0 j0Var = this.f222345b;
        switch (i) {
            case 0:
                List statements = (List) obj2;
                Intrinsics.checkNotNullParameter(statements, "statements");
                List<i55.h0> list = statements;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                for (i55.h0 h0Var : list) {
                    String statementLink = com.google.android.gms.internal.mlkit_vision_face.a.p(j0Var.e.getBaseUrl(), "/loan-management/loan/", h0Var.getLoanId(), "/stored-statements/", h0Var.getStatementId());
                    Object obj3 = d55.h.f111365a;
                    Intrinsics.checkNotNullParameter(h0Var, "<this>");
                    Intrinsics.checkNotNullParameter(statementLink, "statementLink");
                    String statementId = h0Var.getStatementId();
                    String loanId = h0Var.getLoanId();
                    LocalDate localDate = LocalDate.parse(h0Var.getIssueDate());
                    Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
                    LocalDate localDate2 = LocalDate.parse(h0Var.getStatementPeriodFrom());
                    Intrinsics.checkNotNullExpressionValue(localDate2, "parse(...)");
                    LocalDate localDate3 = LocalDate.parse(h0Var.getStatementPeriodTo());
                    Intrinsics.checkNotNullExpressionValue(localDate3, "parse(...)");
                    arrayList.add(new n35.k(statementId, loanId, localDate, localDate2, localDate3, (n35.j) u1.u(h0Var.getType(), d55.h.f111365a), statementLink));
                }
                return arrayList;
            case 1:
                String loanId2 = (String) obj2;
                Intrinsics.checkNotNullParameter(loanId2, "loanId");
                ne0.j jVar = j0Var.f222350b;
                Intrinsics.checkNotNullParameter(loanId2, "loanId");
                return (List) jVar.get(ebm.a.s(loanId2));
            default:
                String loanId3 = (String) obj2;
                Intrinsics.checkNotNullParameter(loanId3, "loanId");
                List<d2> list2 = (List) DBUtil.performBlocking(j0Var.f222351c.f212300a, true, false, new mll.h(loanId3, 15));
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                for (d2 d2Var : list2) {
                    Intrinsics.checkNotNullParameter(d2Var, "<this>");
                    arrayList2.add(new i55.h0(d2Var.f222039b, d2Var.f222038a, d2Var.f222040c, d2Var.d, d2Var.e, d2Var.f));
                }
                if (!arrayList2.isEmpty()) {
                    return arrayList2;
                }
                n45.f fVar = j0Var.d;
                Intrinsics.checkNotNullParameter(loanId3, "loanId");
                if (fVar.a(ebm.a.s(loanId3)) != null) {
                    return arrayList2;
                }
                return null;
        }
    }
}
