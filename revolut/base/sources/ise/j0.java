package ise;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j0 implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f168201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f168202c;
    public final m0 d;
    public final AccountId e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f168203g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f168204h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g0 f168205j;
    public final boolean k;

    public j0(String str, Data transaction, Data transactionData, m0 topUpState, AccountId accountId, Data addMoneyMethod, Data moveMoneyOrderQuote, Data targetAccount, Data moveMoneyFooter, g0 g0Var, boolean z) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(transactionData, "transactionData");
        Intrinsics.checkNotNullParameter(topUpState, "topUpState");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(addMoneyMethod, "addMoneyMethod");
        Intrinsics.checkNotNullParameter(moveMoneyOrderQuote, "moveMoneyOrderQuote");
        Intrinsics.checkNotNullParameter(targetAccount, "targetAccount");
        Intrinsics.checkNotNullParameter(moveMoneyFooter, "moveMoneyFooter");
        this.f168200a = str;
        this.f168201b = transaction;
        this.f168202c = transactionData;
        this.d = topUpState;
        this.e = accountId;
        this.f = addMoneyMethod;
        this.f168203g = moveMoneyOrderQuote;
        this.f168204h = targetAccount;
        this.i = moveMoneyFooter;
        this.f168205j = g0Var;
        this.k = z;
    }

    public static j0 a(j0 j0Var, Data data, Data transactionData, m0 topUpState, AccountId accountId, Data addMoneyMethod, Data moveMoneyOrderQuote, Data targetAccount, Data moveMoneyFooter, g0 g0Var, boolean z, int i) {
        Data transaction = data;
        String str = j0Var.f168200a;
        if ((i & 2) != 0) {
            transaction = j0Var.f168201b;
        }
        if ((i & 4) != 0) {
            transactionData = j0Var.f168202c;
        }
        if ((i & 8) != 0) {
            topUpState = j0Var.d;
        }
        j0Var.getClass();
        j0Var.getClass();
        if ((i & 64) != 0) {
            accountId = j0Var.e;
        }
        if ((i & 128) != 0) {
            addMoneyMethod = j0Var.f;
        }
        if ((i & 256) != 0) {
            moveMoneyOrderQuote = j0Var.f168203g;
        }
        if ((i & 512) != 0) {
            targetAccount = j0Var.f168204h;
        }
        if ((i & 1024) != 0) {
            moveMoneyFooter = j0Var.i;
        }
        if ((i & 2048) != 0) {
            g0Var = j0Var.f168205j;
        }
        if ((i & 4096) != 0) {
            z = j0Var.k;
        }
        boolean z3 = z;
        j0Var.getClass();
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(transactionData, "transactionData");
        Intrinsics.checkNotNullParameter(topUpState, "topUpState");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(addMoneyMethod, "addMoneyMethod");
        Intrinsics.checkNotNullParameter(moveMoneyOrderQuote, "moveMoneyOrderQuote");
        Intrinsics.checkNotNullParameter(targetAccount, "targetAccount");
        Intrinsics.checkNotNullParameter(moveMoneyFooter, "moveMoneyFooter");
        g0 g0Var2 = g0Var;
        Data data2 = moveMoneyFooter;
        Data data3 = targetAccount;
        Data data4 = moveMoneyOrderQuote;
        Data data5 = addMoneyMethod;
        AccountId accountId2 = accountId;
        m0 m0Var = topUpState;
        return new j0(str, transaction, transactionData, m0Var, accountId2, data5, data4, data3, data2, g0Var2, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f168200a, j0Var.f168200a) && Intrinsics.f(this.f168201b, j0Var.f168201b) && Intrinsics.f(this.f168202c, j0Var.f168202c) && this.d == j0Var.d && Intrinsics.f(this.e, j0Var.e) && Intrinsics.f(this.f, j0Var.f) && Intrinsics.f(this.f168203g, j0Var.f168203g) && Intrinsics.f(this.f168204h, j0Var.f168204h) && Intrinsics.f(this.i, j0Var.i) && Intrinsics.f(this.f168205j, j0Var.f168205j) && this.k == j0Var.k;
    }

    public final int hashCode() {
        String str = this.f168200a;
        int iC = kii.e.c(this.i, kii.e.c(this.f168204h, kii.e.c(this.f168203g, kii.e.c(this.f, h30.l.b(this.e, j6.a.c(j6.a.c((this.d.hashCode() + kii.e.c(this.f168202c, kii.e.c(this.f168201b, (str == null ? 0 : str.hashCode()) * 31, 31), 31)) * 31, 31, false), 31, false), 31), 31), 31), 31), 31);
        g0 g0Var = this.f168205j;
        return Boolean.hashCode(this.k) + ((iC + (g0Var != null ? g0Var.hashCode() : 0)) * 31);
    }
}
