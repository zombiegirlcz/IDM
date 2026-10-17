package tif;

import androidx.sqlite.db.SimpleSQLiteQuery;
import com.revolut.core.extensions.rx.BreadcrumbException;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import pfm.t;
import tof.i7;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class k implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f271509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f271510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i7 f271511c;
    public final /* synthetic */ BreadcrumbException d;

    public /* synthetic */ k(q qVar, i7 i7Var, BreadcrumbException breadcrumbException, int i) {
        this.f271509a = i;
        this.f271510b = qVar;
        this.f271511c = i7Var;
        this.d = breadcrumbException;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f271509a) {
            case 0:
                q qVar = this.f271510b;
                final mif.o oVar = qVar.f271519c;
                oVar.getClass();
                final int i = 1;
                final i7 i7Var = this.f271511c;
                ufm.c cVar = new ufm.c(new Callable() { // from class: mif.l
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        String strP;
                        String strP2;
                        switch (i) {
                            case 0:
                                o oVar2 = oVar;
                                d0 d0Var = (d0) oVar2.e();
                                y yVarA = d0Var.a(i7Var);
                                if (yVarA == null) {
                                    strP = "SELECT MIN(started_date) FROM transactions";
                                } else if ((yVarA instanceof w) || (yVarA instanceof x)) {
                                    strP = p.a.p("\n                SELECT MIN(started_date) FROM transactions AS transactions\n                LEFT OUTER JOIN transfer_users recipient_table ON transactions.recipient_key = recipient_table.transfer_user_key\n                LEFT OUTER JOIN transfer_users sender_table ON transactions.sender_key = sender_table.transfer_user_key\n                LEFT OUTER JOIN merchants ON transactions.merchant_key = merchants.merchant_table_key\n                LEFT OUTER JOIN acquiring_cashback ON transactions.leg_id = acquiring_cashback.acquiring_cashback_leg_id\n                LEFT OUTER JOIN extra_attributes ON transactions.leg_id = extra_attributes.extra_attr_leg_id\n                LEFT OUTER JOIN excluded_transactions ON transactions.group_id = excluded_transactions.excluded_transaction_id\n                LEFT OUTER JOIN hidden ON transactions.leg_id = hidden.leg_id\n                LEFT OUTER JOIN defi_metadata ON transactions.leg_id = defi_metadata.defi_metadata_leg_id\n                WHERE ", d0Var.i(yVarA.getFilter()), "\n            ");
                                } else {
                                    if (!(yVarA instanceof v)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    strP = j6.a.q("SELECT MIN(started_date) FROM transactions WHERE ", d0Var.i(((v) yVarA).f205837a));
                                }
                                Long lC = oVar2.c(new SimpleSQLiteQuery(strP));
                                if (lC != null) {
                                    return new DateTime(lC.longValue());
                                }
                                return null;
                            default:
                                o oVar3 = oVar;
                                d0 d0Var2 = (d0) oVar3.e();
                                y yVarA2 = d0Var2.a(i7Var);
                                if (yVarA2 == null) {
                                    strP2 = "SELECT COUNT(*) FROM transactions";
                                } else if ((yVarA2 instanceof w) || (yVarA2 instanceof x)) {
                                    strP2 = p.a.p("\n                SELECT COUNT(*) FROM transactions AS transactions\n                LEFT OUTER JOIN transfer_users recipient_table ON transactions.recipient_key = recipient_table.transfer_user_key\n                LEFT OUTER JOIN transfer_users sender_table ON transactions.sender_key = sender_table.transfer_user_key\n                LEFT OUTER JOIN merchants ON transactions.merchant_key = merchants.merchant_table_key\n                LEFT OUTER JOIN acquiring_cashback ON transactions.leg_id = acquiring_cashback.acquiring_cashback_leg_id\n                LEFT OUTER JOIN extra_attributes ON transactions.leg_id = extra_attributes.extra_attr_leg_id\n                LEFT OUTER JOIN excluded_transactions ON transactions.group_id = excluded_transactions.excluded_transaction_id\n                LEFT OUTER JOIN hidden ON transactions.leg_id = hidden.leg_id\n                LEFT OUTER JOIN defi_metadata ON transactions.leg_id = defi_metadata.defi_metadata_leg_id\n                WHERE ", d0Var2.i(yVarA2.getFilter()), "\n            ");
                                } else {
                                    if (!(yVarA2 instanceof v)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    strP2 = j6.a.q("SELECT COUNT(*) FROM transactions WHERE ", d0Var2.i(((v) yVarA2).f205837a));
                                }
                                return Integer.valueOf(oVar3.j(new SimpleSQLiteQuery(strP2)));
                        }
                    }
                }, 2);
                Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                ufm.c cVar2 = new ufm.c(new e(qVar, 1, cVar, this.d), 0);
                Intrinsics.checkNotNullExpressionValue(cVar2, "defer(...)");
                return cVar2;
            case 1:
                q qVar2 = this.f271510b;
                mif.o oVar2 = qVar2.f271519c;
                oVar2.getClass();
                i7 filter = this.f271511c;
                Intrinsics.checkNotNullParameter(filter, "filter");
                pfm.h hVar = new pfm.h(new la8.j(oVar2, filter, 14), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                t tVarW = oVar2.w(hVar);
                Intrinsics.checkNotNullExpressionValue(tVarW, "triggerUpdate(...)");
                return qVar2.f(tVarW, this.d);
            default:
                q qVar3 = this.f271510b;
                final mif.o oVar3 = qVar3.f271519c;
                oVar3.getClass();
                final int i2 = 0;
                final i7 i7Var2 = this.f271511c;
                rfm.o oVar4 = new rfm.o(new Callable() { // from class: mif.l
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        String strP;
                        String strP2;
                        switch (i2) {
                            case 0:
                                o oVar22 = oVar3;
                                d0 d0Var = (d0) oVar22.e();
                                y yVarA = d0Var.a(i7Var2);
                                if (yVarA == null) {
                                    strP = "SELECT MIN(started_date) FROM transactions";
                                } else if ((yVarA instanceof w) || (yVarA instanceof x)) {
                                    strP = p.a.p("\n                SELECT MIN(started_date) FROM transactions AS transactions\n                LEFT OUTER JOIN transfer_users recipient_table ON transactions.recipient_key = recipient_table.transfer_user_key\n                LEFT OUTER JOIN transfer_users sender_table ON transactions.sender_key = sender_table.transfer_user_key\n                LEFT OUTER JOIN merchants ON transactions.merchant_key = merchants.merchant_table_key\n                LEFT OUTER JOIN acquiring_cashback ON transactions.leg_id = acquiring_cashback.acquiring_cashback_leg_id\n                LEFT OUTER JOIN extra_attributes ON transactions.leg_id = extra_attributes.extra_attr_leg_id\n                LEFT OUTER JOIN excluded_transactions ON transactions.group_id = excluded_transactions.excluded_transaction_id\n                LEFT OUTER JOIN hidden ON transactions.leg_id = hidden.leg_id\n                LEFT OUTER JOIN defi_metadata ON transactions.leg_id = defi_metadata.defi_metadata_leg_id\n                WHERE ", d0Var.i(yVarA.getFilter()), "\n            ");
                                } else {
                                    if (!(yVarA instanceof v)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    strP = j6.a.q("SELECT MIN(started_date) FROM transactions WHERE ", d0Var.i(((v) yVarA).f205837a));
                                }
                                Long lC = oVar22.c(new SimpleSQLiteQuery(strP));
                                if (lC != null) {
                                    return new DateTime(lC.longValue());
                                }
                                return null;
                            default:
                                o oVar32 = oVar3;
                                d0 d0Var2 = (d0) oVar32.e();
                                y yVarA2 = d0Var2.a(i7Var2);
                                if (yVarA2 == null) {
                                    strP2 = "SELECT COUNT(*) FROM transactions";
                                } else if ((yVarA2 instanceof w) || (yVarA2 instanceof x)) {
                                    strP2 = p.a.p("\n                SELECT COUNT(*) FROM transactions AS transactions\n                LEFT OUTER JOIN transfer_users recipient_table ON transactions.recipient_key = recipient_table.transfer_user_key\n                LEFT OUTER JOIN transfer_users sender_table ON transactions.sender_key = sender_table.transfer_user_key\n                LEFT OUTER JOIN merchants ON transactions.merchant_key = merchants.merchant_table_key\n                LEFT OUTER JOIN acquiring_cashback ON transactions.leg_id = acquiring_cashback.acquiring_cashback_leg_id\n                LEFT OUTER JOIN extra_attributes ON transactions.leg_id = extra_attributes.extra_attr_leg_id\n                LEFT OUTER JOIN excluded_transactions ON transactions.group_id = excluded_transactions.excluded_transaction_id\n                LEFT OUTER JOIN hidden ON transactions.leg_id = hidden.leg_id\n                LEFT OUTER JOIN defi_metadata ON transactions.leg_id = defi_metadata.defi_metadata_leg_id\n                WHERE ", d0Var2.i(yVarA2.getFilter()), "\n            ");
                                } else {
                                    if (!(yVarA2 instanceof v)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    strP2 = j6.a.q("SELECT COUNT(*) FROM transactions WHERE ", d0Var2.i(((v) yVarA2).f205837a));
                                }
                                return Integer.valueOf(oVar32.j(new SimpleSQLiteQuery(strP2)));
                        }
                    }
                });
                Intrinsics.checkNotNullExpressionValue(oVar4, "fromCallable(...)");
                rfm.d dVar = new rfm.d(new e(qVar3, 2, oVar4, this.d), 1);
                Intrinsics.checkNotNullExpressionValue(dVar, "defer(...)");
                return dVar;
        }
    }
}
