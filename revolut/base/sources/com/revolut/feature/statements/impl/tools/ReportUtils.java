package com.revolut.feature.statements.impl.tools;

import com.revolut.feature.statements.api.models.StatementModel;
import com.revolut.feature.statements.impl.tools.transactions.TransactionDbModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n71.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u0000 \u00142\u00020\u0001:\u0002\u0015\u0014J+\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJE\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0010\u0010\u0011J=\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/statements/impl/tools/ReportUtils;", "", "", "startDate", "endDate", "Lxi0/b;", "currency", "", "generateFileName", "(Ljava/lang/Long;Ljava/lang/Long;Lxi0/b;)Ljava/lang/String;", "balance", "Lcom/revolut/feature/statements/impl/tools/ReportUtils$ReportData;", "reportData", "", "simpleFormat", "Lcom/revolut/feature/statements/api/models/StatementModel;", "createStatements", "(JLcom/revolut/feature/statements/impl/tools/ReportUtils$ReportData;Lxi0/b;ZLjava/lang/Long;Ljava/lang/Long;)Lcom/revolut/feature/statements/api/models/StatementModel;", "createSingleStatement", "(Lcom/revolut/feature/statements/impl/tools/ReportUtils$ReportData;Lxi0/b;ZLjava/lang/Long;Ljava/lang/Long;)Lcom/revolut/feature/statements/api/models/StatementModel;", "Companion", "ReportData", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ReportUtils {

    @NotNull
    public static final String STATEMENT_FONT_ROBOTO = "Roboto";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/statements/impl/tools/ReportUtils$Companion;", "", "<init>", "()V", "STATEMENT_FONT_ROBOTO", "", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        @NotNull
        public static final String STATEMENT_FONT_ROBOTO = "Roboto";
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J`\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b#\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u0015R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b,\u0010\u0017R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b-\u0010\u0017R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b\r\u0010\u0015¨\u0006."}, d2 = {"Lcom/revolut/feature/statements/impl/tools/ReportUtils$ReportData;", "", "", "Lcom/revolut/feature/statements/impl/tools/transactions/TransactionDbModel;", "transactions", "Ln71/b;", "bankRevolutBankAccount", "", "kycPassed", "", "phone", "footer", "cryptoFooter", "isRevolutPaymentUAB", "<init>", "(Ljava/util/List;Ln71/b;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Ljava/util/List;", "component2", "()Ln71/b;", "component3", "()Z", "component4", "()Ljava/lang/String;", "component5", "component6", "component7", "copy", "(Ljava/util/List;Ln71/b;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/revolut/feature/statements/impl/tools/ReportUtils$ReportData;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljava/util/List;", "getTransactions", "Ln71/b;", "getBankRevolutBankAccount", "Z", "getKycPassed", "Ljava/lang/String;", "getPhone", "getFooter", "getCryptoFooter", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReportData {
        private final b bankRevolutBankAccount;
        private final String cryptoFooter;

        @NotNull
        private final String footer;
        private final boolean isRevolutPaymentUAB;
        private final boolean kycPassed;

        @NotNull
        private final String phone;

        @NotNull
        private final List<TransactionDbModel> transactions;

        /* JADX WARN: Multi-variable type inference failed */
        public ReportData(@NotNull List<? extends TransactionDbModel> transactions, b bVar, boolean z, @NotNull String phone, @NotNull String footer, String str, boolean z3) {
            Intrinsics.checkNotNullParameter(transactions, "transactions");
            Intrinsics.checkNotNullParameter(phone, "phone");
            Intrinsics.checkNotNullParameter(footer, "footer");
            this.transactions = transactions;
            this.bankRevolutBankAccount = bVar;
            this.kycPassed = z;
            this.phone = phone;
            this.footer = footer;
            this.cryptoFooter = str;
            this.isRevolutPaymentUAB = z3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ReportData copy$default(ReportData reportData, List list, b bVar, boolean z, String str, String str2, String str3, boolean z3, int i, Object obj2) {
            if ((i & 1) != 0) {
                list = reportData.transactions;
            }
            if ((i & 2) != 0) {
                bVar = reportData.bankRevolutBankAccount;
            }
            if ((i & 4) != 0) {
                z = reportData.kycPassed;
            }
            if ((i & 8) != 0) {
                str = reportData.phone;
            }
            if ((i & 16) != 0) {
                str2 = reportData.footer;
            }
            if ((i & 32) != 0) {
                str3 = reportData.cryptoFooter;
            }
            if ((i & 64) != 0) {
                z3 = reportData.isRevolutPaymentUAB;
            }
            String str4 = str3;
            boolean z4 = z3;
            String str5 = str2;
            boolean z6 = z;
            return reportData.copy(list, bVar, z6, str, str5, str4, z4);
        }

        @NotNull
        public final List<TransactionDbModel> component1() {
            return this.transactions;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final b getBankRevolutBankAccount() {
            return this.bankRevolutBankAccount;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getKycPassed() {
            return this.kycPassed;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getFooter() {
            return this.footer;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getCryptoFooter() {
            return this.cryptoFooter;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final boolean getIsRevolutPaymentUAB() {
            return this.isRevolutPaymentUAB;
        }

        @NotNull
        public final ReportData copy(@NotNull List<? extends TransactionDbModel> transactions, b bankRevolutBankAccount, boolean kycPassed, @NotNull String phone, @NotNull String footer, String cryptoFooter, boolean isRevolutPaymentUAB) {
            Intrinsics.checkNotNullParameter(transactions, "transactions");
            Intrinsics.checkNotNullParameter(phone, "phone");
            Intrinsics.checkNotNullParameter(footer, "footer");
            return new ReportData(transactions, bankRevolutBankAccount, kycPassed, phone, footer, cryptoFooter, isRevolutPaymentUAB);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReportData)) {
                return false;
            }
            ReportData reportData = (ReportData) other;
            return Intrinsics.f(this.transactions, reportData.transactions) && Intrinsics.f(this.bankRevolutBankAccount, reportData.bankRevolutBankAccount) && this.kycPassed == reportData.kycPassed && Intrinsics.f(this.phone, reportData.phone) && Intrinsics.f(this.footer, reportData.footer) && Intrinsics.f(this.cryptoFooter, reportData.cryptoFooter) && this.isRevolutPaymentUAB == reportData.isRevolutPaymentUAB;
        }

        public final b getBankRevolutBankAccount() {
            return this.bankRevolutBankAccount;
        }

        public final String getCryptoFooter() {
            return this.cryptoFooter;
        }

        @NotNull
        public final String getFooter() {
            return this.footer;
        }

        public final boolean getKycPassed() {
            return this.kycPassed;
        }

        @NotNull
        public final String getPhone() {
            return this.phone;
        }

        @NotNull
        public final List<TransactionDbModel> getTransactions() {
            return this.transactions;
        }

        public int hashCode() {
            int iHashCode = this.transactions.hashCode() * 31;
            b bVar = this.bankRevolutBankAccount;
            int iC = a.c(a.c(j6.a.c((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.kycPassed), 31, this.phone), 31, this.footer);
            String str = this.cryptoFooter;
            return Boolean.hashCode(this.isRevolutPaymentUAB) + ((iC + (str != null ? str.hashCode() : 0)) * 31);
        }

        public final boolean isRevolutPaymentUAB() {
            return this.isRevolutPaymentUAB;
        }
    }

    static /* synthetic */ StatementModel createSingleStatement$default(ReportUtils reportUtils, ReportData reportData, xi0.b bVar, boolean z, Long l2, Long l3, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createSingleStatement");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return reportUtils.createSingleStatement(reportData, bVar, z, l2, l3);
    }

    static /* synthetic */ StatementModel createStatements$default(ReportUtils reportUtils, long j2, ReportData reportData, xi0.b bVar, boolean z, Long l2, Long l3, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createStatements");
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return reportUtils.createStatements(j2, reportData, bVar, z, l2, l3);
    }

    @NotNull
    StatementModel createSingleStatement(@NotNull ReportData reportData, @NotNull xi0.b currency, boolean simpleFormat, Long startDate, Long endDate);

    @NotNull
    StatementModel createStatements(long balance, @NotNull ReportData reportData, @NotNull xi0.b currency, boolean simpleFormat, Long startDate, Long endDate);

    @NotNull
    String generateFileName(Long startDate, Long endDate, @NotNull xi0.b currency);
}
