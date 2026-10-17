package com.revolut.feature.statements.api.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\bf\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bµ\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010#\u001a\u00020\u0003\u0012\u0006\u0010$\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&\u0012\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&\u0012\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020*0&\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\b\u00100\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u00101\u001a\u000202\u0012\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\t\u0010h\u001a\u00020\u0003HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010j\u001a\u00020\u0003HÆ\u0003J\t\u0010k\u001a\u00020\u0003HÆ\u0003J\t\u0010l\u001a\u00020\u0003HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010q\u001a\u00020\u0003HÆ\u0003J\t\u0010r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010u\u001a\u00020\u0003HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010x\u001a\u00020\u0003HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010{\u001a\u00020\u0003HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010~\u001a\u00020\u0003HÆ\u0003J\t\u0010\u007f\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0088\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020'0&HÆ\u0003J\u0010\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020'0&HÆ\u0003J\u0010\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020*0&HÆ\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0093\u0001\u001a\u000202HÆ\u0003J\n\u0010\u0094\u0001\u001a\u000202HÆ\u0003J\u008c\u0004\u0010\u0095\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&2\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&2\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020*0&2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u00101\u001a\u0002022\b\b\u0002\u00103\u001a\u000202HÆ\u0001J\u0015\u0010\u0096\u0001\u001a\u0002022\t\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010\u0098\u0001\u001a\u00030\u0099\u0001HÖ\u0001J\n\u0010\u009a\u0001\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u00107R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u00107R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u00107R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u00107R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u00107R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u00107R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u00107R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u00107R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u00107R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u00107R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u00107R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u00107R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u00107R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u00107R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u00107R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u00107R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u00107R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u00107R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u00107R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u00107R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bL\u00107R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bM\u00107R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bN\u00107R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u00107R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bP\u00107R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bQ\u00107R\u0011\u0010\u001e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bR\u00107R\u0011\u0010\u001f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bS\u00107R\u0011\u0010 \u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bT\u00107R\u0013\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bU\u00107R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bV\u00107R\u0011\u0010#\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bW\u00107R\u0011\u0010$\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bX\u00107R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&¢\u0006\b\n\u0000\u001a\u0004\bY\u0010ZR\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&¢\u0006\b\n\u0000\u001a\u0004\b[\u0010ZR \u0010)\u001a\b\u0012\u0004\u0012\u00020*0&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010Z\"\u0004\b]\u0010^R\u0013\u0010+\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b_\u00107R\u0013\u0010,\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b`\u00107R\u0013\u0010-\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\ba\u00107R\u0013\u0010.\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bb\u00107R\u0013\u0010/\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bc\u00107R\u0013\u00100\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bd\u00107R\u0011\u00101\u001a\u000202¢\u0006\b\n\u0000\u001a\u0004\be\u0010fR\u0011\u00103\u001a\u000202¢\u0006\b\n\u0000\u001a\u0004\bg\u0010f¨\u0006\u009b\u0001"}, d2 = {"Lcom/revolut/feature/statements/api/models/StatementModel;", "", "statementFont", "", "statementCcy", "statementDate", "statementPhone", "accountHolderName", "accountNumber", "sortCode", "iban", "bic", "balanceDate", "balanceTotal", "accountBalanceTotal", "billAccountsBalanceTotal", "cardPaymentsTotal", "cardPaymentsTotalMainAccount", "cardPaymentsTotalBillAccounts", "moneySentTotal", "moneySentTotalMainAccount", "moneySentTotalBillAccounts", "moneyReceivedTotal", "moneyReceivedTotalMainAccount", "moneyReceivedTotalBillAccounts", "topupTotal", "atmWithdrawalTotal", "exchangeTotalIn", "exchangeTotalInMainAccount", "exchangeTotalInBillAccounts", "exchangeTotalOut", "revolutFeesTotal", "emptyMoneyItem", "cryptoWithdrawalTotal", "cryptoWithdrawalFeesTotal", "statementFooter", "cryptoInfo", "transactions", "", "Lcom/revolut/feature/statements/api/models/TransactionRowModel;", "billAccountsTransactions", "receipts", "Lcom/revolut/feature/statements/api/models/ReceiptModel;", "addressLine1", "addressLine2", "city", "postcode", "region", "country", "showReferenceNumber", "", "containsRateMarkup", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getStatementFont", "()Ljava/lang/String;", "getStatementCcy", "getStatementDate", "getStatementPhone", "getAccountHolderName", "getAccountNumber", "getSortCode", "getIban", "getBic", "getBalanceDate", "getBalanceTotal", "getAccountBalanceTotal", "getBillAccountsBalanceTotal", "getCardPaymentsTotal", "getCardPaymentsTotalMainAccount", "getCardPaymentsTotalBillAccounts", "getMoneySentTotal", "getMoneySentTotalMainAccount", "getMoneySentTotalBillAccounts", "getMoneyReceivedTotal", "getMoneyReceivedTotalMainAccount", "getMoneyReceivedTotalBillAccounts", "getTopupTotal", "getAtmWithdrawalTotal", "getExchangeTotalIn", "getExchangeTotalInMainAccount", "getExchangeTotalInBillAccounts", "getExchangeTotalOut", "getRevolutFeesTotal", "getEmptyMoneyItem", "getCryptoWithdrawalTotal", "getCryptoWithdrawalFeesTotal", "getStatementFooter", "getCryptoInfo", "getTransactions", "()Ljava/util/List;", "getBillAccountsTransactions", "getReceipts", "setReceipts", "(Ljava/util/List;)V", "getAddressLine1", "getAddressLine2", "getCity", "getPostcode", "getRegion", "getCountry", "getShowReferenceNumber", "()Z", "getContainsRateMarkup", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "copy", "equals", "other", "hashCode", "", "toString", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StatementModel {
    private final String accountBalanceTotal;

    @NotNull
    private final String accountHolderName;
    private final String accountNumber;
    private final String addressLine1;
    private final String addressLine2;

    @NotNull
    private final String atmWithdrawalTotal;

    @NotNull
    private final String balanceDate;

    @NotNull
    private final String balanceTotal;
    private final String bic;
    private final String billAccountsBalanceTotal;

    @NotNull
    private final List<TransactionRowModel> billAccountsTransactions;

    @NotNull
    private final String cardPaymentsTotal;
    private final String cardPaymentsTotalBillAccounts;
    private final String cardPaymentsTotalMainAccount;
    private final String city;
    private final boolean containsRateMarkup;
    private final String country;

    @NotNull
    private final String cryptoInfo;
    private final String cryptoWithdrawalFeesTotal;
    private final String cryptoWithdrawalTotal;

    @NotNull
    private final String emptyMoneyItem;

    @NotNull
    private final String exchangeTotalIn;
    private final String exchangeTotalInBillAccounts;
    private final String exchangeTotalInMainAccount;

    @NotNull
    private final String exchangeTotalOut;
    private final String iban;

    @NotNull
    private final String moneyReceivedTotal;
    private final String moneyReceivedTotalBillAccounts;
    private final String moneyReceivedTotalMainAccount;

    @NotNull
    private final String moneySentTotal;
    private final String moneySentTotalBillAccounts;
    private final String moneySentTotalMainAccount;
    private final String postcode;

    @NotNull
    private List<ReceiptModel> receipts;
    private final String region;

    @NotNull
    private final String revolutFeesTotal;
    private final boolean showReferenceNumber;
    private final String sortCode;
    private final String statementCcy;

    @NotNull
    private final String statementDate;

    @NotNull
    private final String statementFont;

    @NotNull
    private final String statementFooter;

    @NotNull
    private final String statementPhone;

    @NotNull
    private final String topupTotal;

    @NotNull
    private final List<TransactionRowModel> transactions;

    public StatementModel(@NotNull String statementFont, String str, @NotNull String statementDate, @NotNull String statementPhone, @NotNull String accountHolderName, String str2, String str3, String str4, String str5, @NotNull String balanceDate, @NotNull String balanceTotal, String str6, String str7, @NotNull String cardPaymentsTotal, String str8, String str9, @NotNull String moneySentTotal, String str10, String str11, @NotNull String moneyReceivedTotal, String str12, String str13, @NotNull String topupTotal, @NotNull String atmWithdrawalTotal, @NotNull String exchangeTotalIn, String str14, String str15, @NotNull String exchangeTotalOut, @NotNull String revolutFeesTotal, @NotNull String emptyMoneyItem, String str16, String str17, @NotNull String statementFooter, @NotNull String cryptoInfo, @NotNull List<TransactionRowModel> transactions, @NotNull List<TransactionRowModel> billAccountsTransactions, @NotNull List<ReceiptModel> receipts, String str18, String str19, String str20, String str21, String str22, String str23, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(statementFont, "statementFont");
        Intrinsics.checkNotNullParameter(statementDate, "statementDate");
        Intrinsics.checkNotNullParameter(statementPhone, "statementPhone");
        Intrinsics.checkNotNullParameter(accountHolderName, "accountHolderName");
        Intrinsics.checkNotNullParameter(balanceDate, "balanceDate");
        Intrinsics.checkNotNullParameter(balanceTotal, "balanceTotal");
        Intrinsics.checkNotNullParameter(cardPaymentsTotal, "cardPaymentsTotal");
        Intrinsics.checkNotNullParameter(moneySentTotal, "moneySentTotal");
        Intrinsics.checkNotNullParameter(moneyReceivedTotal, "moneyReceivedTotal");
        Intrinsics.checkNotNullParameter(topupTotal, "topupTotal");
        Intrinsics.checkNotNullParameter(atmWithdrawalTotal, "atmWithdrawalTotal");
        Intrinsics.checkNotNullParameter(exchangeTotalIn, "exchangeTotalIn");
        Intrinsics.checkNotNullParameter(exchangeTotalOut, "exchangeTotalOut");
        Intrinsics.checkNotNullParameter(revolutFeesTotal, "revolutFeesTotal");
        Intrinsics.checkNotNullParameter(emptyMoneyItem, "emptyMoneyItem");
        Intrinsics.checkNotNullParameter(statementFooter, "statementFooter");
        Intrinsics.checkNotNullParameter(cryptoInfo, "cryptoInfo");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(billAccountsTransactions, "billAccountsTransactions");
        Intrinsics.checkNotNullParameter(receipts, "receipts");
        this.statementFont = statementFont;
        this.statementCcy = str;
        this.statementDate = statementDate;
        this.statementPhone = statementPhone;
        this.accountHolderName = accountHolderName;
        this.accountNumber = str2;
        this.sortCode = str3;
        this.iban = str4;
        this.bic = str5;
        this.balanceDate = balanceDate;
        this.balanceTotal = balanceTotal;
        this.accountBalanceTotal = str6;
        this.billAccountsBalanceTotal = str7;
        this.cardPaymentsTotal = cardPaymentsTotal;
        this.cardPaymentsTotalMainAccount = str8;
        this.cardPaymentsTotalBillAccounts = str9;
        this.moneySentTotal = moneySentTotal;
        this.moneySentTotalMainAccount = str10;
        this.moneySentTotalBillAccounts = str11;
        this.moneyReceivedTotal = moneyReceivedTotal;
        this.moneyReceivedTotalMainAccount = str12;
        this.moneyReceivedTotalBillAccounts = str13;
        this.topupTotal = topupTotal;
        this.atmWithdrawalTotal = atmWithdrawalTotal;
        this.exchangeTotalIn = exchangeTotalIn;
        this.exchangeTotalInMainAccount = str14;
        this.exchangeTotalInBillAccounts = str15;
        this.exchangeTotalOut = exchangeTotalOut;
        this.revolutFeesTotal = revolutFeesTotal;
        this.emptyMoneyItem = emptyMoneyItem;
        this.cryptoWithdrawalTotal = str16;
        this.cryptoWithdrawalFeesTotal = str17;
        this.statementFooter = statementFooter;
        this.cryptoInfo = cryptoInfo;
        this.transactions = transactions;
        this.billAccountsTransactions = billAccountsTransactions;
        this.receipts = receipts;
        this.addressLine1 = str18;
        this.addressLine2 = str19;
        this.city = str20;
        this.postcode = str21;
        this.region = str22;
        this.country = str23;
        this.showReferenceNumber = z;
        this.containsRateMarkup = z3;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatementFont() {
        return this.statementFont;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getBalanceDate() {
        return this.balanceDate;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getBalanceTotal() {
        return this.balanceTotal;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getAccountBalanceTotal() {
        return this.accountBalanceTotal;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getBillAccountsBalanceTotal() {
        return this.billAccountsBalanceTotal;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getCardPaymentsTotal() {
        return this.cardPaymentsTotal;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getCardPaymentsTotalMainAccount() {
        return this.cardPaymentsTotalMainAccount;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getCardPaymentsTotalBillAccounts() {
        return this.cardPaymentsTotalBillAccounts;
    }

    @NotNull
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getMoneySentTotal() {
        return this.moneySentTotal;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getMoneySentTotalMainAccount() {
        return this.moneySentTotalMainAccount;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getMoneySentTotalBillAccounts() {
        return this.moneySentTotalBillAccounts;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatementCcy() {
        return this.statementCcy;
    }

    @NotNull
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getMoneyReceivedTotal() {
        return this.moneyReceivedTotal;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getMoneyReceivedTotalMainAccount() {
        return this.moneyReceivedTotalMainAccount;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getMoneyReceivedTotalBillAccounts() {
        return this.moneyReceivedTotalBillAccounts;
    }

    @NotNull
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getTopupTotal() {
        return this.topupTotal;
    }

    @NotNull
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getAtmWithdrawalTotal() {
        return this.atmWithdrawalTotal;
    }

    @NotNull
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getExchangeTotalIn() {
        return this.exchangeTotalIn;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getExchangeTotalInMainAccount() {
        return this.exchangeTotalInMainAccount;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getExchangeTotalInBillAccounts() {
        return this.exchangeTotalInBillAccounts;
    }

    @NotNull
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getExchangeTotalOut() {
        return this.exchangeTotalOut;
    }

    @NotNull
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getRevolutFeesTotal() {
        return this.revolutFeesTotal;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatementDate() {
        return this.statementDate;
    }

    @NotNull
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getEmptyMoneyItem() {
        return this.emptyMoneyItem;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getCryptoWithdrawalTotal() {
        return this.cryptoWithdrawalTotal;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getCryptoWithdrawalFeesTotal() {
        return this.cryptoWithdrawalFeesTotal;
    }

    @NotNull
    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getStatementFooter() {
        return this.statementFooter;
    }

    @NotNull
    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getCryptoInfo() {
        return this.cryptoInfo;
    }

    @NotNull
    public final List<TransactionRowModel> component35() {
        return this.transactions;
    }

    @NotNull
    public final List<TransactionRowModel> component36() {
        return this.billAccountsTransactions;
    }

    @NotNull
    public final List<ReceiptModel> component37() {
        return this.receipts;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final String getAddressLine1() {
        return this.addressLine1;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final String getAddressLine2() {
        return this.addressLine2;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatementPhone() {
        return this.statementPhone;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final String getPostcode() {
        return this.postcode;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    /* JADX INFO: renamed from: component43, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: component44, reason: from getter */
    public final boolean getShowReferenceNumber() {
        return this.showReferenceNumber;
    }

    /* JADX INFO: renamed from: component45, reason: from getter */
    public final boolean getContainsRateMarkup() {
        return this.containsRateMarkup;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAccountHolderName() {
        return this.accountHolderName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSortCode() {
        return this.sortCode;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getIban() {
        return this.iban;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getBic() {
        return this.bic;
    }

    @NotNull
    public final StatementModel copy(@NotNull String statementFont, String statementCcy, @NotNull String statementDate, @NotNull String statementPhone, @NotNull String accountHolderName, String accountNumber, String sortCode, String iban, String bic2, @NotNull String balanceDate, @NotNull String balanceTotal, String accountBalanceTotal, String billAccountsBalanceTotal, @NotNull String cardPaymentsTotal, String cardPaymentsTotalMainAccount, String cardPaymentsTotalBillAccounts, @NotNull String moneySentTotal, String moneySentTotalMainAccount, String moneySentTotalBillAccounts, @NotNull String moneyReceivedTotal, String moneyReceivedTotalMainAccount, String moneyReceivedTotalBillAccounts, @NotNull String topupTotal, @NotNull String atmWithdrawalTotal, @NotNull String exchangeTotalIn, String exchangeTotalInMainAccount, String exchangeTotalInBillAccounts, @NotNull String exchangeTotalOut, @NotNull String revolutFeesTotal, @NotNull String emptyMoneyItem, String cryptoWithdrawalTotal, String cryptoWithdrawalFeesTotal, @NotNull String statementFooter, @NotNull String cryptoInfo, @NotNull List<TransactionRowModel> transactions, @NotNull List<TransactionRowModel> billAccountsTransactions, @NotNull List<ReceiptModel> receipts, String addressLine1, String addressLine2, String city, String postcode, String region, String country, boolean showReferenceNumber, boolean containsRateMarkup) {
        Intrinsics.checkNotNullParameter(statementFont, "statementFont");
        Intrinsics.checkNotNullParameter(statementDate, "statementDate");
        Intrinsics.checkNotNullParameter(statementPhone, "statementPhone");
        Intrinsics.checkNotNullParameter(accountHolderName, "accountHolderName");
        Intrinsics.checkNotNullParameter(balanceDate, "balanceDate");
        Intrinsics.checkNotNullParameter(balanceTotal, "balanceTotal");
        Intrinsics.checkNotNullParameter(cardPaymentsTotal, "cardPaymentsTotal");
        Intrinsics.checkNotNullParameter(moneySentTotal, "moneySentTotal");
        Intrinsics.checkNotNullParameter(moneyReceivedTotal, "moneyReceivedTotal");
        Intrinsics.checkNotNullParameter(topupTotal, "topupTotal");
        Intrinsics.checkNotNullParameter(atmWithdrawalTotal, "atmWithdrawalTotal");
        Intrinsics.checkNotNullParameter(exchangeTotalIn, "exchangeTotalIn");
        Intrinsics.checkNotNullParameter(exchangeTotalOut, "exchangeTotalOut");
        Intrinsics.checkNotNullParameter(revolutFeesTotal, "revolutFeesTotal");
        Intrinsics.checkNotNullParameter(emptyMoneyItem, "emptyMoneyItem");
        Intrinsics.checkNotNullParameter(statementFooter, "statementFooter");
        Intrinsics.checkNotNullParameter(cryptoInfo, "cryptoInfo");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(billAccountsTransactions, "billAccountsTransactions");
        Intrinsics.checkNotNullParameter(receipts, "receipts");
        return new StatementModel(statementFont, statementCcy, statementDate, statementPhone, accountHolderName, accountNumber, sortCode, iban, bic2, balanceDate, balanceTotal, accountBalanceTotal, billAccountsBalanceTotal, cardPaymentsTotal, cardPaymentsTotalMainAccount, cardPaymentsTotalBillAccounts, moneySentTotal, moneySentTotalMainAccount, moneySentTotalBillAccounts, moneyReceivedTotal, moneyReceivedTotalMainAccount, moneyReceivedTotalBillAccounts, topupTotal, atmWithdrawalTotal, exchangeTotalIn, exchangeTotalInMainAccount, exchangeTotalInBillAccounts, exchangeTotalOut, revolutFeesTotal, emptyMoneyItem, cryptoWithdrawalTotal, cryptoWithdrawalFeesTotal, statementFooter, cryptoInfo, transactions, billAccountsTransactions, receipts, addressLine1, addressLine2, city, postcode, region, country, showReferenceNumber, containsRateMarkup);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatementModel)) {
            return false;
        }
        StatementModel statementModel = (StatementModel) other;
        return Intrinsics.f(this.statementFont, statementModel.statementFont) && Intrinsics.f(this.statementCcy, statementModel.statementCcy) && Intrinsics.f(this.statementDate, statementModel.statementDate) && Intrinsics.f(this.statementPhone, statementModel.statementPhone) && Intrinsics.f(this.accountHolderName, statementModel.accountHolderName) && Intrinsics.f(this.accountNumber, statementModel.accountNumber) && Intrinsics.f(this.sortCode, statementModel.sortCode) && Intrinsics.f(this.iban, statementModel.iban) && Intrinsics.f(this.bic, statementModel.bic) && Intrinsics.f(this.balanceDate, statementModel.balanceDate) && Intrinsics.f(this.balanceTotal, statementModel.balanceTotal) && Intrinsics.f(this.accountBalanceTotal, statementModel.accountBalanceTotal) && Intrinsics.f(this.billAccountsBalanceTotal, statementModel.billAccountsBalanceTotal) && Intrinsics.f(this.cardPaymentsTotal, statementModel.cardPaymentsTotal) && Intrinsics.f(this.cardPaymentsTotalMainAccount, statementModel.cardPaymentsTotalMainAccount) && Intrinsics.f(this.cardPaymentsTotalBillAccounts, statementModel.cardPaymentsTotalBillAccounts) && Intrinsics.f(this.moneySentTotal, statementModel.moneySentTotal) && Intrinsics.f(this.moneySentTotalMainAccount, statementModel.moneySentTotalMainAccount) && Intrinsics.f(this.moneySentTotalBillAccounts, statementModel.moneySentTotalBillAccounts) && Intrinsics.f(this.moneyReceivedTotal, statementModel.moneyReceivedTotal) && Intrinsics.f(this.moneyReceivedTotalMainAccount, statementModel.moneyReceivedTotalMainAccount) && Intrinsics.f(this.moneyReceivedTotalBillAccounts, statementModel.moneyReceivedTotalBillAccounts) && Intrinsics.f(this.topupTotal, statementModel.topupTotal) && Intrinsics.f(this.atmWithdrawalTotal, statementModel.atmWithdrawalTotal) && Intrinsics.f(this.exchangeTotalIn, statementModel.exchangeTotalIn) && Intrinsics.f(this.exchangeTotalInMainAccount, statementModel.exchangeTotalInMainAccount) && Intrinsics.f(this.exchangeTotalInBillAccounts, statementModel.exchangeTotalInBillAccounts) && Intrinsics.f(this.exchangeTotalOut, statementModel.exchangeTotalOut) && Intrinsics.f(this.revolutFeesTotal, statementModel.revolutFeesTotal) && Intrinsics.f(this.emptyMoneyItem, statementModel.emptyMoneyItem) && Intrinsics.f(this.cryptoWithdrawalTotal, statementModel.cryptoWithdrawalTotal) && Intrinsics.f(this.cryptoWithdrawalFeesTotal, statementModel.cryptoWithdrawalFeesTotal) && Intrinsics.f(this.statementFooter, statementModel.statementFooter) && Intrinsics.f(this.cryptoInfo, statementModel.cryptoInfo) && Intrinsics.f(this.transactions, statementModel.transactions) && Intrinsics.f(this.billAccountsTransactions, statementModel.billAccountsTransactions) && Intrinsics.f(this.receipts, statementModel.receipts) && Intrinsics.f(this.addressLine1, statementModel.addressLine1) && Intrinsics.f(this.addressLine2, statementModel.addressLine2) && Intrinsics.f(this.city, statementModel.city) && Intrinsics.f(this.postcode, statementModel.postcode) && Intrinsics.f(this.region, statementModel.region) && Intrinsics.f(this.country, statementModel.country) && this.showReferenceNumber == statementModel.showReferenceNumber && this.containsRateMarkup == statementModel.containsRateMarkup;
    }

    public final String getAccountBalanceTotal() {
        return this.accountBalanceTotal;
    }

    @NotNull
    public final String getAccountHolderName() {
        return this.accountHolderName;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getAddressLine1() {
        return this.addressLine1;
    }

    public final String getAddressLine2() {
        return this.addressLine2;
    }

    @NotNull
    public final String getAtmWithdrawalTotal() {
        return this.atmWithdrawalTotal;
    }

    @NotNull
    public final String getBalanceDate() {
        return this.balanceDate;
    }

    @NotNull
    public final String getBalanceTotal() {
        return this.balanceTotal;
    }

    public final String getBic() {
        return this.bic;
    }

    public final String getBillAccountsBalanceTotal() {
        return this.billAccountsBalanceTotal;
    }

    @NotNull
    public final List<TransactionRowModel> getBillAccountsTransactions() {
        return this.billAccountsTransactions;
    }

    @NotNull
    public final String getCardPaymentsTotal() {
        return this.cardPaymentsTotal;
    }

    public final String getCardPaymentsTotalBillAccounts() {
        return this.cardPaymentsTotalBillAccounts;
    }

    public final String getCardPaymentsTotalMainAccount() {
        return this.cardPaymentsTotalMainAccount;
    }

    public final String getCity() {
        return this.city;
    }

    public final boolean getContainsRateMarkup() {
        return this.containsRateMarkup;
    }

    public final String getCountry() {
        return this.country;
    }

    @NotNull
    public final String getCryptoInfo() {
        return this.cryptoInfo;
    }

    public final String getCryptoWithdrawalFeesTotal() {
        return this.cryptoWithdrawalFeesTotal;
    }

    public final String getCryptoWithdrawalTotal() {
        return this.cryptoWithdrawalTotal;
    }

    @NotNull
    public final String getEmptyMoneyItem() {
        return this.emptyMoneyItem;
    }

    @NotNull
    public final String getExchangeTotalIn() {
        return this.exchangeTotalIn;
    }

    public final String getExchangeTotalInBillAccounts() {
        return this.exchangeTotalInBillAccounts;
    }

    public final String getExchangeTotalInMainAccount() {
        return this.exchangeTotalInMainAccount;
    }

    @NotNull
    public final String getExchangeTotalOut() {
        return this.exchangeTotalOut;
    }

    public final String getIban() {
        return this.iban;
    }

    @NotNull
    public final String getMoneyReceivedTotal() {
        return this.moneyReceivedTotal;
    }

    public final String getMoneyReceivedTotalBillAccounts() {
        return this.moneyReceivedTotalBillAccounts;
    }

    public final String getMoneyReceivedTotalMainAccount() {
        return this.moneyReceivedTotalMainAccount;
    }

    @NotNull
    public final String getMoneySentTotal() {
        return this.moneySentTotal;
    }

    public final String getMoneySentTotalBillAccounts() {
        return this.moneySentTotalBillAccounts;
    }

    public final String getMoneySentTotalMainAccount() {
        return this.moneySentTotalMainAccount;
    }

    public final String getPostcode() {
        return this.postcode;
    }

    @NotNull
    public final List<ReceiptModel> getReceipts() {
        return this.receipts;
    }

    public final String getRegion() {
        return this.region;
    }

    @NotNull
    public final String getRevolutFeesTotal() {
        return this.revolutFeesTotal;
    }

    public final boolean getShowReferenceNumber() {
        return this.showReferenceNumber;
    }

    public final String getSortCode() {
        return this.sortCode;
    }

    public final String getStatementCcy() {
        return this.statementCcy;
    }

    @NotNull
    public final String getStatementDate() {
        return this.statementDate;
    }

    @NotNull
    public final String getStatementFont() {
        return this.statementFont;
    }

    @NotNull
    public final String getStatementFooter() {
        return this.statementFooter;
    }

    @NotNull
    public final String getStatementPhone() {
        return this.statementPhone;
    }

    @NotNull
    public final String getTopupTotal() {
        return this.topupTotal;
    }

    @NotNull
    public final List<TransactionRowModel> getTransactions() {
        return this.transactions;
    }

    public int hashCode() {
        int iHashCode = this.statementFont.hashCode() * 31;
        String str = this.statementCcy;
        int iC = a.c(a.c(a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.statementDate), 31, this.statementPhone), 31, this.accountHolderName);
        String str2 = this.accountNumber;
        int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sortCode;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.iban;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.bic;
        int iC2 = a.c(a.c((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.balanceDate), 31, this.balanceTotal);
        String str6 = this.accountBalanceTotal;
        int iHashCode5 = (iC2 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.billAccountsBalanceTotal;
        int iC3 = a.c((iHashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.cardPaymentsTotal);
        String str8 = this.cardPaymentsTotalMainAccount;
        int iHashCode6 = (iC3 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.cardPaymentsTotalBillAccounts;
        int iC4 = a.c((iHashCode6 + (str9 == null ? 0 : str9.hashCode())) * 31, 31, this.moneySentTotal);
        String str10 = this.moneySentTotalMainAccount;
        int iHashCode7 = (iC4 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.moneySentTotalBillAccounts;
        int iC5 = a.c((iHashCode7 + (str11 == null ? 0 : str11.hashCode())) * 31, 31, this.moneyReceivedTotal);
        String str12 = this.moneyReceivedTotalMainAccount;
        int iHashCode8 = (iC5 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.moneyReceivedTotalBillAccounts;
        int iC6 = a.c(a.c(a.c((iHashCode8 + (str13 == null ? 0 : str13.hashCode())) * 31, 31, this.topupTotal), 31, this.atmWithdrawalTotal), 31, this.exchangeTotalIn);
        String str14 = this.exchangeTotalInMainAccount;
        int iHashCode9 = (iC6 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.exchangeTotalInBillAccounts;
        int iC7 = a.c(a.c(a.c((iHashCode9 + (str15 == null ? 0 : str15.hashCode())) * 31, 31, this.exchangeTotalOut), 31, this.revolutFeesTotal), 31, this.emptyMoneyItem);
        String str16 = this.cryptoWithdrawalTotal;
        int iHashCode10 = (iC7 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.cryptoWithdrawalFeesTotal;
        int iD = a.d(a.d(a.d(a.c(a.c((iHashCode10 + (str17 == null ? 0 : str17.hashCode())) * 31, 31, this.statementFooter), 31, this.cryptoInfo), 31, this.transactions), 31, this.billAccountsTransactions), 31, this.receipts);
        String str18 = this.addressLine1;
        int iHashCode11 = (iD + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.addressLine2;
        int iHashCode12 = (iHashCode11 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.city;
        int iHashCode13 = (iHashCode12 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.postcode;
        int iHashCode14 = (iHashCode13 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.region;
        int iHashCode15 = (iHashCode14 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.country;
        return Boolean.hashCode(this.containsRateMarkup) + j6.a.c((iHashCode15 + (str23 != null ? str23.hashCode() : 0)) * 31, 31, this.showReferenceNumber);
    }

    public final void setReceipts(@NotNull List<ReceiptModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.receipts = list;
    }

    public StatementModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, List list, List list2, List list3, String str35, String str36, String str37, String str38, String str39, String str40, boolean z, boolean z3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, (i2 & 4) != 0 ? f0.f322471a : list, (i2 & 8) != 0 ? f0.f322471a : list2, (i2 & 16) != 0 ? f0.f322471a : list3, str35, str36, str37, str38, str39, str40, z, z3);
    }
}
