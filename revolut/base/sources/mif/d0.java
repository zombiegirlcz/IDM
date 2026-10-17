package mif;

import androidx.sqlite.db.SimpleSQLiteQuery;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.domain.interactors.transactions.TransactionsSort;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import le.u1;
import org.jetbrains.annotations.NotNull;
import tof.a8;
import tof.a9;
import tof.aa;
import tof.ab;
import tof.ac;
import tof.b8;
import tof.b9;
import tof.ba;
import tof.bb;
import tof.bc;
import tof.c8;
import tof.c9;
import tof.ca;
import tof.cb;
import tof.cc;
import tof.d8;
import tof.d9;
import tof.da;
import tof.db;
import tof.dc;
import tof.e7;
import tof.e8;
import tof.e9;
import tof.ea;
import tof.eb;
import tof.ec;
import tof.f7;
import tof.f8;
import tof.f9;
import tof.fa;
import tof.fb;
import tof.g7;
import tof.g8;
import tof.g9;
import tof.ga;
import tof.gb;
import tof.h7;
import tof.h8;
import tof.h9;
import tof.ha;
import tof.hb;
import tof.i7;
import tof.i8;
import tof.i9;
import tof.ia;
import tof.ib;
import tof.j1;
import tof.j7;
import tof.j8;
import tof.j9;
import tof.ja;
import tof.jb;
import tof.k7;
import tof.k8;
import tof.k9;
import tof.ka;
import tof.kb;
import tof.l7;
import tof.l8;
import tof.l9;
import tof.la;
import tof.lb;
import tof.m7;
import tof.m8;
import tof.m9;
import tof.ma;
import tof.mb;
import tof.n7;
import tof.n8;
import tof.n9;
import tof.na;
import tof.nb;
import tof.o7;
import tof.o8;
import tof.o9;
import tof.oa;
import tof.ob;
import tof.p7;
import tof.p8;
import tof.p9;
import tof.pa;
import tof.pb;
import tof.q7;
import tof.q8;
import tof.q9;
import tof.qa;
import tof.qb;
import tof.r7;
import tof.r8;
import tof.r9;
import tof.ra;
import tof.rb;
import tof.s7;
import tof.s8;
import tof.s9;
import tof.sa;
import tof.t7;
import tof.t8;
import tof.t9;
import tof.ta;
import tof.tb;
import tof.u7;
import tof.u8;
import tof.u9;
import tof.ua;
import tof.ub;
import tof.v6;
import tof.v7;
import tof.v8;
import tof.v9;
import tof.va;
import tof.vb;
import tof.w6;
import tof.w7;
import tof.w8;
import tof.w9;
import tof.wa;
import tof.wb;
import tof.x7;
import tof.x8;
import tof.x9;
import tof.xa;
import tof.xb;
import tof.y2;
import tof.y6;
import tof.y7;
import tof.y8;
import tof.y9;
import tof.ya;
import tof.yb;
import tof.z7;
import tof.z8;
import tof.z9;
import tof.za;
import tof.zb;

/* JADX INFO: loaded from: classes13.dex */
public final class d0 implements t {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f205793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f205794b;

    public d0(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f205793a = featureToggleInteractor;
        this.f205794b = yhm.j.b(new maa.r(this, 5));
    }

    public static String b(TransactionContext.DataSet dataSet) {
        if (dataSet instanceof TransactionContext.DataSet.AllIncluded) {
            return "\n            SELECT\n            transactions.*,\n            \n            recipient_table.transfer_user_id AS recipient_user_id,\n            recipient_table.transfer_user_legal_name AS recipient_legal_name,\n            recipient_table.transfer_user_first_name AS recipient_first_name,\n            recipient_table.transfer_user_last_name AS recipient_last_name,\n            recipient_table.transfer_user_phone AS recipient_phone,\n            recipient_table.transfer_user_username AS recipient_username,\n            recipient_table.transfer_user_code AS recipient_code,\n            recipient_table.transfer_user_country AS recipient_country,\n            recipient_table.transfer_user_pocket_id AS recipient_pocket_id,\n            recipient_table.transfer_user_pocket_type AS recipient_pocket_type,\n            recipient_table.transfer_user_appMode AS recipient_appMode,\n            recipient_table.transfer_user_type AS recipient_type,\n            recipient_table.transfer_user_businessName AS recipient_businessName,\n            recipient_table.transfer_user_individual_type AS recipient_individual_type\n            ,\n            \n            sender_table.transfer_user_id AS sender_user_id,\n            sender_table.transfer_user_legal_name AS sender_legal_name,\n            sender_table.transfer_user_first_name AS sender_first_name,\n            sender_table.transfer_user_last_name AS sender_last_name,\n            sender_table.transfer_user_phone AS sender_phone,\n            sender_table.transfer_user_username AS sender_username,\n            sender_table.transfer_user_code AS sender_code,\n            sender_table.transfer_user_country AS sender_country,\n            sender_table.transfer_user_pocket_id AS sender_pocket_id,\n            sender_table.transfer_user_pocket_type AS sender_pocket_type,\n            sender_table.transfer_user_appMode AS sender_appMode,\n            sender_table.transfer_user_type AS sender_type,\n            sender_table.transfer_user_businessName AS sender_businessName,\n            sender_table.transfer_user_individual_type AS sender_individual_type\n            ,\n            merchants.*,\n            merchant_payments.*,\n            acquiring_cashback.*,\n            loans.*,\n            extra_attributes.*,\n            excluded_transactions.*,\n            crypto_deposits.*,\n            defi_metadata.*,\n            hidden\n            \n            FROM transactions\n            \n            LEFT OUTER JOIN transfer_users recipient_table ON transactions.recipient_key = recipient_table.transfer_user_key\n            LEFT OUTER JOIN transfer_users sender_table ON transactions.sender_key = sender_table.transfer_user_key\n            LEFT OUTER JOIN merchants ON transactions.merchant_key = merchants.merchant_table_key\n            LEFT OUTER JOIN merchant_payments ON transactions.merchant_payment_id = merchant_payments.merchant_payment_identifier\n            LEFT OUTER JOIN acquiring_cashback ON transactions.leg_id = acquiring_cashback.acquiring_cashback_leg_id\n            LEFT OUTER JOIN loans ON transactions.leg_id = loans.loan_leg_id\n            LEFT OUTER JOIN extra_attributes ON transactions.leg_id = extra_attributes.extra_attr_leg_id\n            LEFT OUTER JOIN excluded_transactions ON transactions.group_id = excluded_transactions.excluded_transaction_id\n            LEFT OUTER JOIN hidden ON transactions.leg_id = hidden.leg_id\n            LEFT OUTER JOIN crypto_deposits ON transactions.leg_id = crypto_deposits.crypto_deposit_leg_id\n            LEFT OUTER JOIN defi_metadata ON transactions.leg_id = defi_metadata.defi_metadata_leg_id\n            ";
        }
        if (dataSet instanceof TransactionContext.DataSet.AllExcluded) {
            return "\n            SELECT transactions.*\n            FROM transactions\n            ";
        }
        if (!(dataSet instanceof TransactionContext.DataSet.Included) && !(dataSet instanceof TransactionContext.DataSet.Excluded)) {
            throw new IllegalArgumentException("Unknown transaction context dataset: " + dataSet);
        }
        StringBuilder sb6 = new StringBuilder("SELECT transactions.*");
        StringBuilder sb9 = new StringBuilder();
        if (sif.a.a(dataSet, TransactionContext.TransactionData.TRANSFER_USERS)) {
            sb6.append(", \n            recipient_table.transfer_user_id AS recipient_user_id,\n            recipient_table.transfer_user_legal_name AS recipient_legal_name,\n            recipient_table.transfer_user_first_name AS recipient_first_name,\n            recipient_table.transfer_user_last_name AS recipient_last_name,\n            recipient_table.transfer_user_phone AS recipient_phone,\n            recipient_table.transfer_user_username AS recipient_username,\n            recipient_table.transfer_user_code AS recipient_code,\n            recipient_table.transfer_user_country AS recipient_country,\n            recipient_table.transfer_user_pocket_id AS recipient_pocket_id,\n            recipient_table.transfer_user_pocket_type AS recipient_pocket_type,\n            recipient_table.transfer_user_appMode AS recipient_appMode,\n            recipient_table.transfer_user_type AS recipient_type,\n            recipient_table.transfer_user_businessName AS recipient_businessName,\n            recipient_table.transfer_user_individual_type AS recipient_individual_type\n            , \n            sender_table.transfer_user_id AS sender_user_id,\n            sender_table.transfer_user_legal_name AS sender_legal_name,\n            sender_table.transfer_user_first_name AS sender_first_name,\n            sender_table.transfer_user_last_name AS sender_last_name,\n            sender_table.transfer_user_phone AS sender_phone,\n            sender_table.transfer_user_username AS sender_username,\n            sender_table.transfer_user_code AS sender_code,\n            sender_table.transfer_user_country AS sender_country,\n            sender_table.transfer_user_pocket_id AS sender_pocket_id,\n            sender_table.transfer_user_pocket_type AS sender_pocket_type,\n            sender_table.transfer_user_appMode AS sender_appMode,\n            sender_table.transfer_user_type AS sender_type,\n            sender_table.transfer_user_businessName AS sender_businessName,\n            sender_table.transfer_user_individual_type AS sender_individual_type\n            ");
            sb9.append(" LEFT OUTER JOIN transfer_users recipient_table ON transactions.recipient_key = recipient_table.transfer_user_key LEFT OUTER JOIN transfer_users sender_table ON transactions.sender_key = sender_table.transfer_user_key");
        }
        if (sif.a.a(dataSet, TransactionContext.TransactionData.MERCHANTS)) {
            sb6.append(", merchants.*");
            sb9.append(" LEFT OUTER JOIN merchants ON transactions.merchant_key = merchants.merchant_table_key");
        }
        if (sif.a.a(dataSet, TransactionContext.TransactionData.MERCHANT_PAYMENTS)) {
            sb6.append(", merchant_payments.*");
            sb9.append(" LEFT OUTER JOIN merchant_payments ON transactions.merchant_payment_id = merchant_payments.merchant_payment_identifier");
        }
        if (sif.a.a(dataSet, TransactionContext.TransactionData.ACQUIRING_CASHBACK)) {
            sb6.append(", acquiring_cashback.*");
            sb9.append(" LEFT OUTER JOIN acquiring_cashback ON transactions.leg_id = acquiring_cashback.acquiring_cashback_leg_id");
        }
        if (sif.a.a(dataSet, TransactionContext.TransactionData.LOANS)) {
            sb6.append(", loans.*");
            sb9.append(" LEFT OUTER JOIN loans ON transactions.leg_id = loans.loan_leg_id");
        }
        if (sif.a.a(dataSet, TransactionContext.TransactionData.EXTRA_ATTRIBUTES)) {
            sb6.append(", extra_attributes.*");
            sb9.append(" LEFT OUTER JOIN extra_attributes ON transactions.leg_id = extra_attributes.extra_attr_leg_id");
        }
        if (sif.a.a(dataSet, TransactionContext.TransactionData.EXCLUDED_FROM_SPENDING_ANALYTICS)) {
            sb6.append(", excluded_transactions.*");
            sb9.append(" LEFT OUTER JOIN excluded_transactions ON transactions.group_id = excluded_transactions.excluded_transaction_id");
        }
        if (sif.a.a(dataSet, TransactionContext.TransactionData.HIDDEN)) {
            sb6.append(", hidden");
            sb9.append(" LEFT OUTER JOIN hidden ON transactions.leg_id = hidden.leg_id");
        }
        if (sif.a.a(dataSet, TransactionContext.TransactionData.CRYPTO_DEPOSIT)) {
            sb6.append(", crypto_deposits.*");
            sb9.append(" LEFT OUTER JOIN crypto_deposits ON transactions.leg_id = crypto_deposits.crypto_deposit_leg_id");
        }
        if (sif.a.a(dataSet, TransactionContext.TransactionData.DEFI_METADATA)) {
            sb6.append(", defi_metadata.*");
            sb9.append(" LEFT OUTER JOIN defi_metadata ON transactions.leg_id = defi_metadata.defi_metadata_leg_id");
        }
        return ((Object) sb6) + " FROM transactions" + ((Object) sb9);
    }

    public static String c(String str, String str2, boolean z) {
        return z ? a0.d.r(j(str, str2), " = 1") : p.a.p("COALESCE(", j(str, str2), ", 0) = 0");
    }

    public static String f(String str, String str2, String str3) {
        return str3 != null ? a0.d.s("COALESCE(", j(str, str2), ", '') = ", e0.c(str3)) : a0.d.r(j(str, str2), " IS NULL");
    }

    public static String g(String str, String str2, Collection collection) {
        return j6.a.r(j(str, str2), " IN (", zhm.d0.k0(zhm.d0.Z(collection), null, null, null, 0, c0.f, 31), ")");
    }

    public static String h(TransactionsSort transactionsSort) {
        switch (a0.f205788a[transactionsSort.ordinal()]) {
            case 1:
            case 2:
                return "ORDER BY `transactions`.`started_date` DESC, `transactions`.`leg_id` DESC";
            case 3:
                return "ORDER BY `transactions`.`started_date` ASC, `transactions`.`leg_id` ASC";
            case 4:
                return "ORDER BY `transactions`.`created_date` ASC, `transactions`.`leg_id` ASC";
            case 5:
                return "ORDER BY `transactions`.`completed_date` DESC, `transactions`.`leg_id` DESC";
            case 6:
                m70.a.c(t0.f186434a);
                return "";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static String j(String str, String str2) {
        return j6.a.s("`", str, "`.`", str2, "`");
    }

    public final y a(i7 i7Var) {
        Lazy lazy = this.f205794b;
        if (((Boolean) lazy.getValue()).booleanValue() && i7Var != null) {
            i7.c cVar = i7.Companion;
            i7[] i7VarArr = {i7Var, i7.c0.f272809a};
            cVar.getClass();
            return new x(i7.c.a(i7VarArr));
        }
        if (((Boolean) lazy.getValue()).booleanValue() && i7Var == null) {
            return new v(0);
        }
        if (((Boolean) lazy.getValue()).booleanValue() || i7Var == null) {
            return null;
        }
        return new w(i7Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if (r4.equals("transaction_details") != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
    
        if (r4.equals("hidden") != false) goto L43;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.sqlite.db.SimpleSQLiteQuery d(java.lang.String r4, tof.i7 r5) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mif.d0.d(java.lang.String, tof.i7):androidx.sqlite.db.SimpleSQLiteQuery");
    }

    public final SimpleSQLiteQuery e(i7 i7Var, TransactionsSort sort, int i, TransactionContext.DataSet dataset) {
        String strQ;
        Intrinsics.checkNotNullParameter(sort, "sort");
        Intrinsics.checkNotNullParameter(dataset, "dataset");
        y yVarA = a(i7Var);
        String strN = "";
        if ((yVarA instanceof w) || (yVarA instanceof x) || (yVarA instanceof v)) {
            strQ = j6.a.q("WHERE ", i(yVarA.getFilter()));
        } else {
            if (yVarA != null) {
                throw new NoWhenBranchMatchedException();
            }
            m70.a.c(t0.f186434a);
            strQ = "";
        }
        String strH = h(sort);
        if (i > 0) {
            strN = a0.d.n("LIMIT ", i);
        } else {
            m70.a.c(t0.f186434a);
        }
        return new SimpleSQLiteQuery(v0.a.i(p.a.t(b(dataset), " ", strQ, " ", strH), " ", strN));
    }

    public final String i(i7 i7Var) {
        String str;
        if (i7Var instanceof q7) {
            q7 q7Var = (q7) i7Var;
            if (q7Var.a().isEmpty()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            List listA = q7Var.a();
            final int i = 0;
            return zhm.d0.k0(listA, " AND ", " ( ", " ) ", 0, new Function1(this) { // from class: mif.u

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d0 f205836b;

                {
                    this.f205836b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    i7 subFilter = (i7) obj2;
                    switch (i) {
                        case 0:
                            Intrinsics.checkNotNullParameter(subFilter, "subFilter");
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(subFilter, "subFilter");
                            break;
                    }
                    return this.f205836b.i(subFilter);
                }
            }, 24);
        }
        if (i7Var instanceof oa) {
            oa oaVar = (oa) i7Var;
            if (oaVar.a().isEmpty()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            List listA2 = oaVar.a();
            final int i2 = 1;
            return zhm.d0.k0(listA2, " OR ", " ( ", " ) ", 0, new Function1(this) { // from class: mif.u

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d0 f205836b;

                {
                    this.f205836b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    i7 subFilter = (i7) obj2;
                    switch (i2) {
                        case 0:
                            Intrinsics.checkNotNullParameter(subFilter, "subFilter");
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(subFilter, "subFilter");
                            break;
                    }
                    return this.f205836b.i(subFilter);
                }
            }, 24);
        }
        if (i7Var instanceof na) {
            return p.a.p(" NOT ( ", i(((na) i7Var).a()), " ) ");
        }
        if (i7Var instanceof r9) {
            return f("transactions", "group_id", ((r9) i7Var).a());
        }
        if (i7Var instanceof ba) {
            return f("transactions", "leg_id", ((ba) i7Var).a());
        }
        if (i7Var instanceof i7.i) {
            return a0.d.r(j("extra_attributes", "extra_attr_bill_account_id"), " IS NOT NULL");
        }
        if (i7Var instanceof i7.v) {
            return a0.d.r(j("transactions", "standing_order_id"), " IS NOT NULL");
        }
        if (i7Var instanceof mb) {
            return f("transactions", "standing_order_id", ((mb) i7Var).a());
        }
        if (i7Var instanceof nb) {
            return a0.d.r(j("transactions", "standing_order_id"), " IS NOT NULL");
        }
        if (i7Var instanceof l9) {
            return f("transactions", "fraud_state", u1.g(((l9) i7Var).a(), r11.a.h()));
        }
        if (i7Var instanceof k9) {
            return f("transactions", "fraud_reason", "DECLINED_BY_SHERLOCK");
        }
        if (i7Var instanceof za) {
            return f("transactions", "status_reason_code", ((za) i7Var).a());
        }
        if (i7Var instanceof a9) {
            return f("transactions", "currency", ((a9) i7Var).a().getCode());
        }
        if (i7Var instanceof z8) {
            Collection collectionA = ((z8) i7Var).a();
            ArrayList arrayList = new ArrayList(zhm.w.t(collectionA, 10));
            Iterator it8 = collectionA.iterator();
            while (it8.hasNext()) {
                arrayList.add(((xi0.b) it8.next()).getCode());
            }
            return g("transactions", "currency", arrayList);
        }
        if (i7Var instanceof c9) {
            return g("defi_metadata", "defi_metadata_account_scoped_asset_id", ((c9) i7Var).a());
        }
        if (i7Var instanceof d9) {
            return f("defi_metadata", "defi_metadata_sender_wallet_address", ((d9) i7Var).a());
        }
        if (i7Var instanceof b9) {
            return f("defi_metadata", "defi_metadata_recipient_wallet_address", ((b9) i7Var).a());
        }
        if (i7Var instanceof i9) {
            return f("transactions", "exchange_direction", u1.g(((i9) i7Var).a(), r11.a.g()));
        }
        if (i7Var instanceof dc) {
            return j("transactions", "updated_date") + " >= " + ((dc) i7Var).a().getMillis();
        }
        if (i7Var instanceof ob) {
            ob obVar = (ob) i7Var;
            String str2 = obVar.a() ? ">=" : ">";
            return j("transactions", "started_date") + " " + str2 + " " + obVar.b().getMillis();
        }
        if (i7Var instanceof pb) {
            pb pbVar = (pb) i7Var;
            str = pbVar.a() ? "<=" : "<";
            return j("transactions", "started_date") + " " + str + " " + pbVar.b().getMillis();
        }
        if (i7Var instanceof g8) {
            return j("transactions", "completed_date") + " >= " + ((g8) i7Var).a().getMillis();
        }
        if (i7Var instanceof h8) {
            return j("transactions", "completed_date") + " <= " + ((h8) i7Var).a().getMillis();
        }
        if (i7Var instanceof u8) {
            return j("transactions", "created_date") + " >= " + ((u8) i7Var).a().getMillis();
        }
        if (i7Var instanceof v8) {
            v8 v8Var = (v8) i7Var;
            str = v8Var.b() ? "<=" : "<";
            return j("transactions", "created_date") + " " + str + " " + v8Var.a().getMillis();
        }
        if (i7Var instanceof ua) {
            return f("transactions", "pocket_id", ((ua) i7Var).getPocketId());
        }
        if (i7Var instanceof va) {
            return g("transactions", "pocket_id", ((va) i7Var).a());
        }
        if (i7Var instanceof xa) {
            return f("transactions", "pocket_type", u1.g(((xa) i7Var).a(), r11.a.l()));
        }
        if (i7Var instanceof o8) {
            return f("transactions", "counter_party_currency", ((o8) i7Var).a().getCode());
        }
        if (i7Var instanceof q8) {
            return f("transactions", "counter_party_pocket_type", u1.g(((q8) i7Var).a(), r11.a.l()));
        }
        if (i7Var instanceof bb) {
            return f("recipient_table", "transfer_user_id", ((bb) i7Var).a());
        }
        if (i7Var instanceof kb) {
            return f("sender_table", "transfer_user_id", ((kb) i7Var).a());
        }
        if (i7Var instanceof i7.s) {
            return a0.d.r(j("recipient_table", "transfer_user_pocket_id"), " IS NOT NULL");
        }
        if (i7Var instanceof cb) {
            return f("recipient_table", "transfer_user_pocket_id", ((cb) i7Var).getPocketId());
        }
        if (i7Var instanceof db) {
            return g("recipient_table", "transfer_user_pocket_id", ((db) i7Var).a());
        }
        if (i7Var instanceof eb) {
            io3.l lVarA = ((eb) i7Var).a();
            return f("recipient_table", "transfer_user_pocket_type", lVarA != null ? u1.g(lVarA, r11.a.l()) : null);
        }
        if (i7Var instanceof fb) {
            Set setA = ((fb) i7Var).a();
            ArrayList arrayList2 = new ArrayList(zhm.w.t(setA, 10));
            Iterator it9 = setA.iterator();
            while (it9.hasNext()) {
                arrayList2.add(u1.g((io3.l) it9.next(), r11.a.l()));
            }
            return g("recipient_table", "transfer_user_pocket_type", arrayList2);
        }
        if (i7Var instanceof ab) {
            return f("recipient_table", "transfer_user_code", null);
        }
        if (i7Var instanceof lb) {
            return f("sender_table", "transfer_user_pocket_type", u1.g(((lb) i7Var).a(), r11.a.l()));
        }
        if (i7Var instanceof jb) {
            return f("sender_table", "transfer_user_code", null);
        }
        if (i7Var instanceof j8) {
            return f("recipient_table", "transfer_user_code", ((j8) i7Var).getCode());
        }
        if (i7Var instanceof i8) {
            return f("sender_table", "transfer_user_code", ((i8) i7Var).getCode());
        }
        if (i7Var instanceof n8) {
            return f("recipient_table", "transfer_user_username", ((n8) i7Var).N0());
        }
        if (i7Var instanceof m8) {
            return f("sender_table", "transfer_user_username", ((m8) i7Var).N0());
        }
        if (i7Var instanceof l8) {
            return f("recipient_table", "transfer_user_phone", ((l8) i7Var).getPhone());
        }
        if (i7Var instanceof k8) {
            return f("sender_table", "transfer_user_phone", ((k8) i7Var).getPhone());
        }
        if (i7Var instanceof u9) {
            return c("hidden", "hidden", ((u9) i7Var).a());
        }
        if (i7Var instanceof i7.g) {
            return f("excluded_transactions", "excluded_type", "FULLY_EXCLUDED");
        }
        if (i7Var instanceof o7) {
            return a0.d.r(j("transactions", "amount_with_fee"), " < 0");
        }
        if (i7Var instanceof n7) {
            return a0.d.r(j("transactions", "amount_with_fee"), " > 0");
        }
        if (i7Var instanceof m7) {
            return a0.d.r(j("transactions", "amount_with_charges"), " < 0");
        }
        if (i7Var instanceof l7) {
            return a0.d.r(j("transactions", "amount_with_charges"), " > 0");
        }
        if (i7Var instanceof s8) {
            return a0.d.r(j("transactions", "counter_party_amount"), " < 0");
        }
        if (i7Var instanceof r8) {
            return a0.d.r(j("transactions", "counter_party_amount"), " > 0");
        }
        if (i7Var instanceof xb) {
            tof.c cVarA = ((xb) i7Var).a();
            return f("transactions", "toAccount_accountInfo_type", cVarA != null ? u1.g(cVarA, r11.a.a()) : null);
        }
        if (i7Var instanceof yb) {
            Set setA2 = ((yb) i7Var).a();
            ArrayList arrayList3 = new ArrayList(zhm.w.t(setA2, 10));
            Iterator it10 = setA2.iterator();
            while (it10.hasNext()) {
                arrayList3.add(u1.g((tof.c) it10.next(), r11.a.a()));
            }
            return g("transactions", "toAccount_accountInfo_type", arrayList3);
        }
        if (i7Var instanceof q9) {
            tof.c cVarA2 = ((q9) i7Var).a();
            return f("transactions", "fromAccount_accountInfo_type", cVarA2 != null ? u1.g(cVarA2, r11.a.a()) : null);
        }
        if (i7Var instanceof n9) {
            return f("transactions", "fromAccount_accountInfo_pocketId", ((n9) i7Var).getId());
        }
        if (i7Var instanceof ub) {
            return f("transactions", "toAccount_accountInfo_pocketId", ((ub) i7Var).getId());
        }
        if (i7Var instanceof o9) {
            return f("transactions", "fromAccount_accountInfoRelatedEntity_accountInfoRelatedEmbedded_id", ((o9) i7Var).getId());
        }
        if (i7Var instanceof vb) {
            return f("transactions", "toAccount_accountInfoRelatedEntity_accountInfoRelatedEmbedded_id", ((vb) i7Var).getId());
        }
        if (i7Var instanceof p9) {
            return f("transactions", "fromAccount_accountInfoRelatedEntity_accountInfoRelatedEmbedded_type", u1.g(((p9) i7Var).a(), r11.a.f()));
        }
        if (i7Var instanceof wb) {
            return f("transactions", "toAccount_accountInfoRelatedEntity_accountInfoRelatedEmbedded_type", u1.g(((wb) i7Var).a(), r11.a.f()));
        }
        if (i7Var instanceof qb) {
            List listA3 = ((qb) i7Var).a();
            ArrayList arrayList4 = new ArrayList(zhm.w.t(listA3, 10));
            Iterator it11 = listA3.iterator();
            while (it11.hasNext()) {
                arrayList4.add(u1.g((v6) it11.next(), r11.a.m()));
            }
            return g("transactions", "state", arrayList4);
        }
        if (i7Var instanceof i7.c0) {
            return com.google.android.gms.internal.mlkit_vision_face.a.o(j("transactions", "state"), " != ", e0.c("DELETED"));
        }
        if (i7Var instanceof cc) {
            List listA4 = ((cc) i7Var).a();
            ArrayList arrayList5 = new ArrayList(zhm.w.t(listA4, 10));
            Iterator it12 = listA4.iterator();
            while (it12.hasNext()) {
                arrayList5.add(u1.g((y6) it12.next(), r11.a.r()));
            }
            return g("transactions", "type", arrayList5);
        }
        if (i7Var instanceof p7) {
            return f("transactions", "analytics_group_id", ((p7) i7Var).a());
        }
        if (i7Var instanceof d8) {
            return f("transactions", "category", ((d8) i7Var).a());
        }
        if (i7Var instanceof ha) {
            return f("merchants", "merchant_identifier", "VIA_VERDE");
        }
        if (i7Var instanceof ia) {
            return f("merchants", "merchant_merchant_identifier", ((ia) i7Var).a());
        }
        if (i7Var instanceof ja) {
            return f("merchants", "merchant_name", ((ja) i7Var).a());
        }
        if (i7Var instanceof ga) {
            wi0.b bVarA = ((ga) i7Var).a();
            return f("merchants", "merchant_country", bVarA != null ? bVarA.f297794a : null);
        }
        if (i7Var instanceof i7.b0) {
            return c("merchants", "merchant_can_be_blocked", true);
        }
        if (i7Var instanceof ea) {
            Set setA3 = ((ea) i7Var).a();
            ArrayList arrayList6 = new ArrayList(zhm.w.t(setA3, 10));
            Iterator it13 = setA3.iterator();
            while (it13.hasNext()) {
                arrayList6.add(((j1) it13.next()).name());
            }
            return g("extra_attributes", "extra_attr_merchant_block_eligibility", arrayList6);
        }
        if (i7Var instanceof fa) {
            return f("merchants", "merchant_brand_id", ((fa) i7Var).a());
        }
        if (i7Var instanceof ka) {
            return f("merchants", "merchant_scheme", u1.g(((ka) i7Var).a(), r11.a.p()));
        }
        if (i7Var instanceof y7) {
            return f("merchants", "merchant_blocked_merchant_id", ((y7) i7Var).a());
        }
        if (i7Var instanceof t8) {
            wi0.b bVarA2 = ((t8) i7Var).a();
            return f("transactions", "country_code", bVarA2 != null ? bVarA2.f297794a : null);
        }
        if (i7Var instanceof f9) {
            return f("transactions", "digitized_card_id", ((f9) i7Var).a());
        }
        if (i7Var instanceof ib) {
            return f("transactions", "card_id", ((ib) i7Var).a());
        }
        if (i7Var instanceof i7.k) {
            return a0.d.r(j("transactions", "cashback_pocket_id"), " IS NOT NULL");
        }
        if (i7Var instanceof gb) {
            return f("transactions", "related_transaction_id", ((gb) i7Var).a());
        }
        if (i7Var instanceof hb) {
            return g("transactions", "related_transaction_id", ((hb) i7Var).a());
        }
        if (i7Var instanceof s9) {
            return g("transactions", "group_id", ((s9) i7Var).a());
        }
        if (i7Var instanceof ca) {
            return g("transactions", "leg_id", ((ca) i7Var).a());
        }
        if (i7Var instanceof ec) {
            return f("transactions", "vault_id", ((ec) i7Var).a());
        }
        if (i7Var instanceof i7.y) {
            return a0.d.r(j("transactions", "vault_id"), " IS NOT NULL");
        }
        if (i7Var instanceof y9) {
            return f("transactions", "investment_holding_id", null);
        }
        if (i7Var instanceof u7) {
            return f("transactions", "beneficiary_id", ((u7) i7Var).getId());
        }
        if (i7Var instanceof w7) {
            return f("transactions", "beneficiary_rootId", ((w7) i7Var).a());
        }
        if (i7Var instanceof s7) {
            return f("transactions", "counterparty_details_group", ((s7) i7Var).a());
        }
        if (i7Var instanceof i7.h) {
            return a0.d.r(j("transactions", "counterparty_details_group"), " IS NOT NULL");
        }
        if (i7Var instanceof j7) {
            return f("transactions", "alias_beneficiary_id", ((j7) i7Var).getId());
        }
        if (i7Var instanceof v7) {
            return f("transactions", "beneficiary_phone", ((v7) i7Var).getPhone());
        }
        if (i7Var instanceof t7) {
            return f("transactions", "beneficiary_email", ((t7) i7Var).getEmail());
        }
        if (i7Var instanceof k7) {
            return f("transactions", "alias_beneficiary_type", u1.g(((k7) i7Var).a(), r11.a.e()));
        }
        if (i7Var instanceof i7.p) {
            return a0.d.r(j("transactions", "counter_party_pocket_id"), " IS NOT NULL");
        }
        if (i7Var instanceof r7) {
            return f("transactions", "auto_invest_strategy", ((r7) i7Var).a().a());
        }
        if (i7Var instanceof y8) {
            return g("transactions", "crypto_withdraw_address_id", ((y8) i7Var).a());
        }
        if (i7Var instanceof x8) {
            return f("crypto_deposits", "source_address", ((x8) i7Var).a());
        }
        if (i7Var instanceof ya) {
            return f("transactions", "cardOwnerId", ((ya) i7Var).a());
        }
        if (i7Var instanceof ac) {
            w6 w6VarA = ((ac) i7Var).a();
            return f("transactions", "topupMethod", w6VarA != null ? u1.g(w6VarA, r11.a.o()) : null);
        }
        if (i7Var instanceof zb) {
            y2 y2VarA = ((zb) i7Var).a();
            return f("transactions", "top_up_entry_mode", y2VarA != null ? u1.g(y2VarA, r11.a.n()) : null);
        }
        if (i7Var instanceof i7.e) {
            return c("transactions", "card_disposable", true);
        }
        if (i7Var instanceof m9) {
            return c("transactions", "card_pro", ((m9) i7Var).a());
        }
        if (i7Var instanceof w8) {
            return c("transactions", "card_credit", ((w8) i7Var).a());
        }
        if (i7Var instanceof aa) {
            return f("transactions", "junior_junior_user_id", ((aa) i7Var).a());
        }
        if (i7Var instanceof i7.a0) {
            return a0.d.r(j("transactions", "junior_junior_user_id"), " IS NOT NULL");
        }
        if (i7Var instanceof e9) {
            return com.google.android.gms.internal.mlkit_vision_face.a.o(j("transactions", "description"), " LIKE ", e0.c("%" + ((e9) i7Var).a() + "%"));
        }
        if (i7Var instanceof i7.z) {
            String strJ = j("transactions", "joint_extra_internal");
            return j6.a.r(strJ, " IS NOT NULL AND ", strJ, " = 1");
        }
        if (i7Var instanceof x9) {
            return f("transactions", "joint_id", ((x9) i7Var).a());
        }
        if (i7Var instanceof w9) {
            return f("transactions", "joint_initiator_code", ((w9) i7Var).getCode());
        }
        if (i7Var instanceof z9) {
            return f("transactions", "joint_extra_account_id", ((z9) i7Var).a());
        }
        if (i7Var instanceof i7.q) {
            return a0.d.r(j("transactions", "doxgety_reward_promised_amount_amount"), " IS NOT NULL");
        }
        if (i7Var instanceof i7.t) {
            return "EXISTS (\n    SELECT 1 \n    FROM transactions related_transactions \n    WHERE related_transactions.group_id = transactions.related_transaction_id \n    AND related_transactions.currency = transactions.currency\n)";
        }
        if (i7Var instanceof i7.o) {
            return a0.d.r(j("transactions", "collection_trading_order_id"), " IS NOT NULL");
        }
        if (i7Var instanceof x7) {
            return g("transactions", "paid_plan_transaction_billing_cycle_id", ((x7) i7Var).a());
        }
        if (i7Var instanceof f8) {
            return f("transactions", "collection_trading_order_id", ((f8) i7Var).a());
        }
        if (i7Var instanceof g9) {
            return c("transactions", "vault_earned_interest", ((g9) i7Var).a());
        }
        if (i7Var instanceof z7) {
            return f("transactions", "card_last_four", ((z7) i7Var).a());
        }
        if (i7Var instanceof h9) {
            return c("transactions", "ecommerce", ((h9) i7Var).a());
        }
        if (i7Var instanceof e7) {
            return f("transactions", "apm_contact_id", ((e7) i7Var).getId());
        }
        if (i7Var instanceof f7) {
            return f("transactions", "apm_contact_type", u1.g(((f7) i7Var).a(), r11.a.c()));
        }
        if (i7Var instanceof g7) {
            Set setA4 = ((g7) i7Var).a();
            ArrayList arrayList7 = new ArrayList(zhm.w.t(setA4, 10));
            Iterator it14 = setA4.iterator();
            while (it14.hasNext()) {
                arrayList7.add(u1.g((tof.l) it14.next(), r11.a.c()));
            }
            return g("transactions", "apm_contact_type", arrayList7);
        }
        if (i7Var instanceof h7) {
            return f("transactions", "apm_info_provider", u1.g(((h7) i7Var).a(), r11.a.d()));
        }
        if (i7Var instanceof b8) {
            return f("acquiring_cashback", "acquiring_cashback_payout_type", u1.g(((b8) i7Var).a(), r11.a.b()));
        }
        if (i7Var instanceof i7.l) {
            return a0.d.r(j("acquiring_cashback", "acquiring_cashback_payout_plan_rate"), " IS NOT NULL");
        }
        if (i7Var instanceof i7.j) {
            return a0.d.r(j("acquiring_cashback", "acquiring_cashback_payout_booster_rate"), " IS NOT NULL");
        }
        if (i7Var instanceof wa) {
            return f("extra_attributes", "extra_attr_pocket_origin_type", u1.g(((wa) i7Var).a(), r11.a.k()));
        }
        if (i7Var instanceof v9) {
            return f("extra_attributes", "extra_attr_hotel_booking_id", ((v9) i7Var).a());
        }
        if (i7Var instanceof i7.u) {
            return a0.d.r(j("extra_attributes", "extra_attr_shops_brand_id"), " IS NOT NULL");
        }
        if (i7Var instanceof i7.r) {
            return a0.d.r(j("extra_attributes", "extra_attr_hotel_booking_id"), " IS NOT NULL");
        }
        if (i7Var instanceof i7.x) {
            return a0.d.r(j("extra_attributes", "extra_attr_user_offer_id"), " IS NOT NULL");
        }
        if (i7Var instanceof c8) {
            tof.r rVarA = ((c8) i7Var).a();
            return f("extra_attributes", "extra_attr_cashback_type", rVarA != null ? rVarA.a() : null);
        }
        if (i7Var instanceof a8) {
            return c("extra_attributes", "extra_attr_card_verification", false);
        }
        if (i7Var instanceof e8) {
            return g("extra_attributes", "extra_attr_charity_id", ((e8) i7Var).a());
        }
        if (i7Var instanceof i7.n) {
            return a0.d.r(j("extra_attributes", "extra_attr_charity_id"), " IS NOT NULL");
        }
        if (i7Var instanceof rb) {
            return f("extra_attributes", "extra_attr_tax_recipient_id", ((rb) i7Var).a());
        }
        if (i7Var instanceof da) {
            return g("extra_attributes", "extra_attr_linked_exchange_details_counterparty_pocket_id", ((da) i7Var).a());
        }
        if (i7Var instanceof qa) {
            return f("transactions", "payment_counterparty_id", ((qa) i7Var).a());
        }
        if (i7Var instanceof i7.f) {
            return com.google.android.gms.internal.mlkit_vision_face.a.o(j("transactions", "fromAccount_accountInfo_pocketId"), " = ", j("transactions", "counter_party_pocket_id"));
        }
        if (i7Var instanceof i7.d) {
            return com.google.android.gms.internal.mlkit_vision_face.a.o(j("transactions", "currency"), " = ", j("transactions", "counter_party_currency"));
        }
        if (i7Var instanceof p8) {
            return g("transactions", "counter_party_pocket_id", ((p8) i7Var).a());
        }
        if (i7Var instanceof t9) {
            return c("transactions", "cardholderPresent", true);
        }
        if (i7Var instanceof j9) {
            return f("extra_attributes", "extra_external_regulator_type", "OPEN_FINANCE");
        }
        if (i7Var instanceof i7.a) {
            return c("extra_attributes", "extra_attr_acquiring_tax_payment", true);
        }
        if (i7Var instanceof i7.b) {
            return p.a.p("COALESCE(", j("extra_attributes", "extra_attr_can_be_marked_as_subscription"), ", 1) = 1");
        }
        if (i7Var instanceof sa) {
            return f("transactions", "payment_method", u1.g(((sa) i7Var).a(), r11.a.q()));
        }
        if (i7Var instanceof pa) {
            return f("extra_attributes", "extra_attr_payment_authorisation_id", ((pa) i7Var).a());
        }
        if (i7Var instanceof ma) {
            return f("extra_attributes", "extra_attr_money_request_requester_id", null);
        }
        if (i7Var instanceof la) {
            return f("extra_attributes", "extra_attr_money_request_requester_code", ((la) i7Var).getCode());
        }
        if (i7Var instanceof i7.d0) {
            String strJ2 = j("extra_attributes", "extra_attr_staking_info_reward");
            return j6.a.r(strJ2, " IS NOT NULL AND ", strJ2, " = 1");
        }
        if (i7Var instanceof bc) {
            return f("extra_attributes", "extra_attr_transfer_reasons_catalogue", ((bc) i7Var).a().name());
        }
        if (i7Var instanceof i7.w) {
            return a0.d.r(j("transactions", "transfer_link_id"), " IS NOT NULL");
        }
        if (i7Var instanceof i7.m) {
            return a0.d.r(j("transactions", "chargeback_state"), " IS NOT NULL");
        }
        if (i7Var instanceof i7.e0) {
            String strF = f("extra_attributes", "extra_attr_mcy_top_up_funding_status", "WAITING_FOR_FUND_TRANSFER");
            i7.c cVar = i7.Companion;
            v6[] v6VarArr = {v6.PENDING};
            cVar.getClass();
            return j6.a.s("(", strF, ") AND (", i(i7.c.c(v6VarArr)), ")");
        }
        if (i7Var instanceof tb) {
            Set setA5 = ((tb) i7Var).a();
            m70.a.t(t0.f186434a);
            return j6.a.r(j("transactions", "leg_id"), " IN (", j6.a.q("SELECT leg_id FROM search_indexes WHERE search_indexes MATCH ", e0.c(zhm.d0.k0(setA5, " ", null, null, 0, new mh4.x(14), 30))), ")");
        }
        if (i7Var instanceof ta) {
            return a0.d.s("json_extract(", j("extra_attributes", "extra_attr_attrs"), ", '$.paymentScheme') = ", e0.c(((ta) i7Var).a().name()));
        }
        if (i7Var instanceof ra) {
            return a0.d.s("json_extract(", j("extra_attributes", "extra_attr_attrs"), ", '$.paymentLinkId') = ", e0.c(((ra) i7Var).a()));
        }
        throw new NoWhenBranchMatchedException();
    }
}
