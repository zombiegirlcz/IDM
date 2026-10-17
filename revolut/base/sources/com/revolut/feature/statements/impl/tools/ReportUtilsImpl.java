package com.revolut.feature.statements.impl.tools;

import android.content.Context;
import android.text.TextUtils;
import com.revolut.data.common.models.money.MoneySerializable;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.statements.R$string;
import com.revolut.feature.statements.api.models.ReceiptModel;
import com.revolut.feature.statements.api.models.StatementModel;
import com.revolut.feature.statements.api.models.TransactionRowModel;
import com.revolut.feature.statements.impl.tools.ReportUtils;
import com.revolut.feature.statements.impl.tools.transactions.ImageUtil;
import com.revolut.feature.statements.impl.tools.transactions.TransactionDbModel;
import com.revolut.feature.statements.impl.tools.transactions.TransactionExtraAttrsUtil;
import com.revolut.feature.statements.impl.tools.transactions.TransactionTextsUtil;
import com.revolut.feature.statements.impl.tools.transactions.TransactionType;
import com.revolut.feature.statements.impl.tools.transactions.extras.TransactionCounterpartDto;
import com.revolut.feature_exchange.api.ExchangeApi$Toggles$TransparentPricing;
import com.revolut.revolut.feature_fourthline_impl.R;
import dj0.d;
import do3.n;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.Regex;
import kotlin.text.d0;
import l70.e;
import l80.a;
import l80.c;
import org.jetbrains.annotations.NotNull;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatterBuilder;
import qd0.b;
import t70.g;
import te0.w;
import u80.j;
import u80.k;
import u80.r;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u0088\u00012\u00020\u0001:\u0002\u0088\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0016\u001a\u00020\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017JC\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ;\u0010 \u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b \u0010!JM\u0010%\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u001b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b%\u0010&J'\u0010*\u001a\u0004\u0018\u00010\u00152\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b*\u0010+J'\u0010,\u001a\u0004\u0018\u00010\u00152\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b,\u0010+J/\u0010.\u001a\u0004\u0018\u00010\u00152\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010-\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b.\u0010/J'\u00102\u001a\u00020\u00152\f\u00100\u001a\b\u0012\u0004\u0012\u00020(0'2\b\u00101\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u001b2\u0006\u00104\u001a\u00020(H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u001bH\u0002¢\u0006\u0004\b7\u00108J;\u0010<\u001a\b\u0012\u0004\u0012\u00020;0'2\f\u00109\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010:\u001a\u00020\u001bH\u0002¢\u0006\u0004\b<\u0010=J\u0013\u0010>\u001a\u00020\u0015*\u00020\u0015H\u0002¢\u0006\u0004\b>\u0010?J'\u0010A\u001a\u00020;2\u0006\u0010@\u001a\u00020(2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010:\u001a\u00020\u001bH\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\u001b2\u0006\u0010@\u001a\u00020(H\u0002¢\u0006\u0004\bC\u00106J'\u0010F\u001a\u00020E2\u0006\u0010@\u001a\u00020(2\u0006\u0010D\u001a\u00020;2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\bF\u0010GJ!\u0010H\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\bH\u0010IJ\u0017\u0010L\u001a\u00020\u00152\u0006\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bL\u0010MJ\u0019\u0010N\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\bN\u0010OJ\u0019\u0010P\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\bP\u0010OJ%\u0010R\u001a\u00020\u00152\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\bR\u0010+J%\u0010S\u001a\u00020\u00152\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\bS\u0010+J%\u0010T\u001a\u00020\u00152\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\bT\u0010+J%\u0010U\u001a\u00020\u00152\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\bU\u0010+J%\u0010V\u001a\u00020\u00152\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\bV\u0010+J1\u0010Y\u001a\u00020\u00102\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020(0'2\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u001b0WH\u0002¢\u0006\u0004\bY\u0010ZJ3\u0010[\u001a\u00020\u00102\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020(0'2\u0014\u0010X\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u001b\u0018\u00010WH\u0002¢\u0006\u0004\b[\u0010ZJ-\u0010]\u001a\u00020\u00152\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010\\\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b]\u0010^J\u001b\u0010_\u001a\u0004\u0018\u00010\u00152\b\u0010_\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b_\u0010`J\u001b\u0010a\u001a\u0004\u0018\u00010\u00152\b\u0010a\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\ba\u0010`J)\u0010#\u001a\u00020\u00152\b\u0010b\u001a\u0004\u0018\u00010\"2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b#\u0010cJ%\u0010d\u001a\u00020\u00152\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\bd\u0010+J'\u0010e\u001a\u00020E2\u0006\u0010@\u001a\u00020(2\u0006\u0010D\u001a\u00020;2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\be\u0010GJ'\u0010f\u001a\u00020E2\u0006\u0010@\u001a\u00020(2\u0006\u0010D\u001a\u00020;2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\bf\u0010GJ'\u0010g\u001a\u00020E2\u0006\u0010@\u001a\u00020(2\u0006\u0010D\u001a\u00020;2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\bg\u0010GJ\u0017\u0010h\u001a\u00020\u001b2\u0006\u0010@\u001a\u00020(H\u0002¢\u0006\u0004\bh\u00106J\u0017\u0010i\u001a\u00020\u001b2\u0006\u0010@\u001a\u00020(H\u0002¢\u0006\u0004\bi\u00106J\u0017\u0010j\u001a\u00020\u001b2\u0006\u0010@\u001a\u00020(H\u0002¢\u0006\u0004\bj\u00106J\u0017\u0010k\u001a\u00020\u00152\u0006\u0010@\u001a\u00020(H\u0002¢\u0006\u0004\bk\u0010lJ\u0017\u0010m\u001a\u00020\u001b2\u0006\u0010@\u001a\u00020(H\u0002¢\u0006\u0004\bm\u00106J\u000f\u0010n\u001a\u00020\u0010H\u0002¢\u0006\u0004\bn\u0010oJ#\u0010r\u001a\u00020\u00152\b\u0010p\u001a\u0004\u0018\u00010\u00102\b\u0010q\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\br\u0010sJ\u001f\u0010t\u001a\u00020\u00152\u0006\u0010p\u001a\u00020\u00102\u0006\u0010q\u001a\u00020\u0010H\u0002¢\u0006\u0004\bt\u0010uJ\u0017\u0010w\u001a\u00020\u00152\u0006\u0010v\u001a\u00020\u0010H\u0002¢\u0006\u0004\bw\u0010xJ \u0010z\u001a\u00020J2\u0006\u0010v\u001a\u00020\u00102\u0006\u0010y\u001a\u00020JH\u0082\u0002¢\u0006\u0004\bz\u0010{J\u0017\u0010|\u001a\u00020\u00152\u0006\u0010v\u001a\u00020\u0010H\u0002¢\u0006\u0004\b|\u0010xJ\u0017\u0010}\u001a\u00020\u00152\u0006\u0010v\u001a\u00020\u0010H\u0002¢\u0006\u0004\b}\u0010xJ\u0017\u0010~\u001a\u00020\u00152\u0006\u0010v\u001a\u00020\u0010H\u0002¢\u0006\u0004\b~\u0010xR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u007fR\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010\u0080\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010\u0081\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010\u0082\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010\u0083\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010\u0084\u0001R\u0018\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001¨\u0006\u0089\u0001"}, d2 = {"Lcom/revolut/feature/statements/impl/tools/ReportUtilsImpl;", "Lcom/revolut/feature/statements/impl/tools/ReportUtils;", "Ll80/a;", "datePrinter", "Lt70/g;", "localization", "Lylg/a;", "legacyUserProvider", "Landroid/content/Context;", "context", "Lqd0/b;", "languageProvider", "Lo0i/a;", "transparentPricingFeatureStateChecker", "<init>", "(Ll80/a;Lt70/g;Lylg/a;Landroid/content/Context;Lqd0/b;Lo0i/a;)V", "", "startDate", "endDate", "Lxi0/b;", "currency", "", "generateFileName", "(Ljava/lang/Long;Ljava/lang/Long;Lxi0/b;)Ljava/lang/String;", "balance", "Lcom/revolut/feature/statements/impl/tools/ReportUtils$ReportData;", "reportData", "", "simpleFormat", "Lcom/revolut/feature/statements/api/models/StatementModel;", "createStatements", "(JLcom/revolut/feature/statements/impl/tools/ReportUtils$ReportData;Lxi0/b;ZLjava/lang/Long;Ljava/lang/Long;)Lcom/revolut/feature/statements/api/models/StatementModel;", "createSingleStatement", "(Lcom/revolut/feature/statements/impl/tools/ReportUtils$ReportData;Lxi0/b;ZLjava/lang/Long;Ljava/lang/Long;)Lcom/revolut/feature/statements/api/models/StatementModel;", "Ldj0/d;", "balanceTotal", "single", "createStatementsInternal", "(Lcom/revolut/feature/statements/impl/tools/ReportUtils$ReportData;ZLdj0/d;Lxi0/b;ZLjava/lang/Long;Ljava/lang/Long;)Lcom/revolut/feature/statements/api/models/StatementModel;", "", "Lcom/revolut/feature/statements/impl/tools/transactions/TransactionDbModel;", "transactionsModelsMainAccount", "cryptoWithdrawTotal", "(Ljava/util/List;Lxi0/b;)Ljava/lang/String;", "cryptoWithdrawTotalFees", "amount", "prepareCryptoWithdrawTotalMoney", "(Ljava/util/List;JLxi0/b;)Ljava/lang/String;", "transactionsModels", "cryptoFooter", "prepareCryptoInfo", "(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;", "transactionModel", "canShowRateMarkup", "(Lcom/revolut/feature/statements/impl/tools/transactions/TransactionDbModel;)Z", "isUserFromUs", "()Z", "models", "isRevolutPaymentUAB", "Lcom/revolut/feature/statements/api/models/TransactionRowModel;", "createTransactionList", "(Ljava/util/List;ZZZ)Ljava/util/List;", "encloseCommas", "(Ljava/lang/String;)Ljava/lang/String;", "model", "createTransaction", "(Lcom/revolut/feature/statements/impl/tools/transactions/TransactionDbModel;ZZ)Lcom/revolut/feature/statements/api/models/TransactionRowModel;", "isCreditTransaction", "transaction", "", "setupExchangeParts", "(Lcom/revolut/feature/statements/impl/tools/transactions/TransactionDbModel;Lcom/revolut/feature/statements/api/models/TransactionRowModel;Z)V", "formatCurrency", "(ZLjava/lang/String;)Ljava/lang/String;", "", "counter", "getReceiptTitle", "(I)Ljava/lang/String;", "getEndDate", "(Ljava/lang/Long;)J", "getBalanceDate", "transactions", "cardPaymentsTotal", "cardSentTotal", "cardReceivedTotal", "cardTopUpTotal", "cardAtmWithdrawalTotal", "Lkotlin/Function1;", "predicate", "calculateTotal", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)J", "calculateTotalFee", "toCurrentCurrency", "cardExchangeTotal", "(Ljava/util/List;ZLxi0/b;)Ljava/lang/String;", "billAccountsTotal", "(Ldj0/d;)Ljava/lang/String;", "accountTotal", "accountBalance", "(Ldj0/d;ZLxi0/b;)Ljava/lang/String;", "cardRevolutFeesTotal", "addPaidInAmountValues", "addPaidOutAmountValues", "addRateAndFeeValues", "isTransactionEligibleForRateMarkup", "hasRateMarkup", "hasFeeOrSurcharge", "rate", "(Lcom/revolut/feature/statements/impl/tools/transactions/TransactionDbModel;)Ljava/lang/String;", "isFxTransaction", "now", "()J", "start", "end", "printRangeDayOfMonthYear", "(Ljava/lang/Long;Ljava/lang/Long;)Ljava/lang/String;", "printPrettyRangeMonthShortYear", "(JJ)Ljava/lang/String;", "time", "formatDateTimeMedium", "(J)Ljava/lang/String;", "calendarUnit", "get", "(JI)I", "printMonthShort", "printMonthShortYear", "formatDateMedium", "Ll80/a;", "Lt70/g;", "Lylg/a;", "Landroid/content/Context;", "Lqd0/b;", "Lo0i/a;", "Ljava/util/Locale;", "displayLanguage", "Ljava/util/Locale;", "Companion", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReportUtilsImpl implements ReportUtils {
    private static final char DASH_LITERAL = 8211;
    private static final long ONE_CENT_AMOUNT = 1;
    private static final char SPACE_LITERAL = ' ';

    @NotNull
    private final Context context;

    @NotNull
    private final a datePrinter;

    @NotNull
    private final Locale displayLanguage;

    @NotNull
    private final b languageProvider;

    @NotNull
    private final ylg.a legacyUserProvider;

    @NotNull
    private final g localization;

    @NotNull
    private final o0i.a transparentPricingFeatureStateChecker;

    @NotNull
    private static final String REVOLUT_BANK_UAB_POSTFIX = "Revolut Bank UAB";

    @NotNull
    private static final String MARKUP_CURRENCY = "USD";

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransactionType.values().length];
            try {
                iArr[TransactionType.CRYPTO_WITHDRAWAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ReportUtilsImpl(@NotNull a datePrinter, @NotNull g localization, @NotNull ylg.a legacyUserProvider, @NotNull Context context, @NotNull b languageProvider, @NotNull o0i.a transparentPricingFeatureStateChecker) {
        Intrinsics.checkNotNullParameter(datePrinter, "datePrinter");
        Intrinsics.checkNotNullParameter(localization, "localization");
        Intrinsics.checkNotNullParameter(legacyUserProvider, "legacyUserProvider");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(transparentPricingFeatureStateChecker, "transparentPricingFeatureStateChecker");
        this.datePrinter = datePrinter;
        this.localization = localization;
        this.legacyUserProvider = legacyUserProvider;
        this.context = context;
        this.languageProvider = languageProvider;
        this.transparentPricingFeatureStateChecker = transparentPricingFeatureStateChecker;
        this.displayLanguage = ((s80.b) languageProvider).b();
    }

    private final String accountTotal(d accountTotal) {
        if (accountTotal == null) {
            return null;
        }
        j jVar = k.Companion;
        b bVar = this.languageProvider;
        jVar.getClass();
        k kVarA = j.a(bVar);
        kVarA.v(accountTotal);
        return kVarA.a();
    }

    private final void addPaidInAmountValues(TransactionDbModel model, TransactionRowModel transaction, boolean simpleFormat) {
        j jVar = k.Companion;
        b bVar = this.languageProvider;
        jVar.getClass();
        k kVarA = j.a(bVar);
        kVarA.v(model.getAmount().toDomain());
        kVarA.i = true;
        kVarA.f278053m = true;
        transaction.setPaidInAmount(encloseCommas(kVarA.a())).setPaidInCcy(encloseCommas(formatCurrency(simpleFormat, model.pocketCcy)));
    }

    private final void addPaidOutAmountValues(TransactionDbModel model, TransactionRowModel transaction, boolean simpleFormat) {
        j jVar = k.Companion;
        b bVar = this.languageProvider;
        jVar.getClass();
        k kVarA = j.a(bVar);
        kVarA.v(model.getAmountIncludingLegFee().toDomain());
        kVarA.i = true;
        kVarA.f278053m = true;
        transaction.setAmount(encloseCommas(kVarA.a())).setPocketCcy(encloseCommas(formatCurrency(simpleFormat, model.getPocketCcy())));
        if (isFxTransaction(model)) {
            String fxPartyDisplayStringUnsignedNoCurrencySymbol = TransactionTextsUtil.getFxPartyDisplayStringUnsignedNoCurrencySymbol(model, this.languageProvider);
            Intrinsics.checkNotNullExpressionValue(fxPartyDisplayStringUnsignedNoCurrencySymbol, "getFxPartyDisplayStringU…gnedNoCurrencySymbol(...)");
            transaction.setPartyAmount(encloseCommas(fxPartyDisplayStringUnsignedNoCurrencySymbol)).setPartyCcy(encloseCommas(formatCurrency(simpleFormat, model.getFeeFxCcy())));
        }
    }

    private final void addRateAndFeeValues(TransactionDbModel model, TransactionRowModel transaction, boolean simpleFormat) {
        String str;
        long jLongValue;
        String currency;
        String strRate = rate(model);
        if (hasFeeOrSurcharge(model)) {
            Long l2 = model.feeFx;
            if (l2 != null) {
                jLongValue = l2.longValue();
            } else {
                long amount = model.f88269fee.getAmount();
                Long l3 = model.surcharge;
                jLongValue = amount + (l3 != null ? l3.longValue() : 0L);
            }
            j jVar = k.Companion;
            b bVar = this.languageProvider;
            jVar.getClass();
            k kVarA = j.a(bVar);
            kVarA.q(jLongValue);
            if (model.feeFx == null || (currency = model.feeFxCcy) == null) {
                currency = model.f88269fee.getCurrency();
            }
            kVarA.s(currency);
            String strA = kVarA.a();
            TransactionType transactionType = model.type;
            String string = this.localization.getString((transactionType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[transactionType.ordinal()]) == 1 ? R$string.transaction_statement_crypto_network_fee : R$string.statement_fee);
            strRate = strRate.length() == 0 ? com.google.android.gms.internal.mlkit_vision_face.a.o(string, " ", strA) : a0.d.v(new Object[]{strRate, strA}, 2, p.a.p("%s, ", string, " %s"), "format(...)");
        }
        transaction.setRate(strRate);
        boolean z = ((jte.d) ((w0i.b) this.transparentPricingFeatureStateChecker).f293763a).c(ExchangeApi$Toggles$TransparentPricing.f96821c) && Intrinsics.f(model.getTransparentPricing(), Boolean.TRUE);
        boolean zCanShowRateMarkup = canShowRateMarkup(model);
        if (isUserFromUs() && zCanShowRateMarkup) {
            if (z) {
                if (simpleFormat) {
                    return;
                }
                transaction.m3767setDescription(transaction.getDescription() + "*");
                return;
            }
            Long l4 = model.rateMarkupAmount;
            boolean z3 = l4 == null;
            Pair pair = z3 ? new Pair(Long.valueOf(ONE_CENT_AMOUNT), "USD") : new Pair(l4, model.rateMarkupAmountCurrency);
            long jLongValue2 = ((Number) pair.f186385a).longValue();
            String str2 = (String) pair.f186386b;
            j jVar2 = k.Companion;
            b bVar2 = this.languageProvider;
            jVar2.getClass();
            k kVarA2 = j.a(bVar2);
            kVarA2.q(jLongValue2);
            xi0.b.Companion.getClass();
            kVarA2.f278047b = xi0.a.a(str2);
            kVarA2.f278053m = true;
            String strA2 = kVarA2.a();
            String currency2 = formatCurrency(simpleFormat, str2);
            if (z3) {
                str = simpleFormat ? "<" : "< ";
            } else {
                m70.a.c(t0.f186434a);
                str = "";
            }
            transaction.setCryptoMarkupDescription(simpleFormat ? com.google.android.gms.internal.mlkit_vision_face.a.o(str, currency2, strA2) : v0.a.i(v0.a.m("(", this.localization.getString(R.string.transaction_statement_exchange_revolutcommission), " ", str, currency2), strA2, ")*"));
            if (simpleFormat) {
                if (transaction.getRate().length() > 0) {
                    transaction.m3776setRate(new Regex(",").replace(transaction.getRate(), "."));
                }
                String cryptoMarkupDescription = transaction.getCryptoMarkupDescription();
                transaction.setCryptoMarkupDescription(cryptoMarkupDescription != null ? new Regex(",").replace(cryptoMarkupDescription, ".") : null);
            }
        }
    }

    private final String balanceTotal(d accountBalance, boolean simpleFormat, xi0.b currency) {
        if (accountBalance == null) {
            m70.a.c(t0.f186434a);
            return "";
        }
        String currency2 = formatCurrency(simpleFormat, currency.f306286a);
        j jVar = k.Companion;
        b bVar = this.languageProvider;
        jVar.getClass();
        k kVarA = j.a(bVar);
        kVarA.v(accountBalance);
        kVarA.f278053m = true;
        return a0.d.r(currency2, kVarA.a());
    }

    private final String billAccountsTotal(d billAccountsTotal) {
        if (billAccountsTotal == null) {
            return null;
        }
        j jVar = k.Companion;
        b bVar = this.languageProvider;
        jVar.getClass();
        k kVarA = j.a(bVar);
        kVarA.v(billAccountsTotal);
        return kVarA.a();
    }

    private final long calculateTotal(List<? extends TransactionDbModel> transactions, Function1<? super TransactionDbModel, Boolean> predicate) {
        long amount = 0;
        for (TransactionDbModel transactionDbModel : transactions) {
            if (((Boolean) predicate.invoke(transactionDbModel)).booleanValue()) {
                amount = transactionDbModel.getAmount().getAmount() + amount;
            }
        }
        return amount;
    }

    private final long calculateTotalFee(List<? extends TransactionDbModel> transactions, Function1<? super TransactionDbModel, Boolean> predicate) {
        long jLongValue = 0;
        for (TransactionDbModel transactionDbModel : transactions) {
            if (predicate == null || ((Boolean) predicate.invoke(transactionDbModel)).booleanValue()) {
                long amount = transactionDbModel.f88269fee.getAmount() + jLongValue;
                Long surcharge = transactionDbModel.surcharge;
                if (surcharge != null) {
                    Intrinsics.checkNotNullExpressionValue(surcharge, "surcharge");
                    jLongValue = surcharge.longValue() + amount;
                } else {
                    jLongValue = amount;
                }
            }
        }
        return jLongValue;
    }

    private final boolean canShowRateMarkup(TransactionDbModel transactionModel) {
        return hasRateMarkup(transactionModel) || isTransactionEligibleForRateMarkup(transactionModel);
    }

    private final String cardAtmWithdrawalTotal(List<? extends TransactionDbModel> transactions, xi0.b currency) {
        long jCalculateTotal = calculateTotal(transactions, new com.revolut.feature.alipay_plus.mpm.webcontainer.a(8));
        j jVar = k.Companion;
        b bVar = this.languageProvider;
        jVar.getClass();
        k kVarA = j.a(bVar);
        kVarA.v(new d(jCalculateTotal, currency));
        kVarA.u = true;
        kVarA.i = true;
        return kVarA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean cardAtmWithdrawalTotal$lambda$0(TransactionDbModel transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return transaction.type == TransactionType.ATM;
    }

    private final String cardExchangeTotal(List<? extends TransactionDbModel> transactions, boolean toCurrentCurrency, xi0.b currency) {
        long jCalculateTotal = calculateTotal(transactions, new cmc.a(toCurrentCurrency, 1));
        j jVar = k.Companion;
        b bVar = this.languageProvider;
        jVar.getClass();
        k kVarA = j.a(bVar);
        kVarA.v(new d(jCalculateTotal, currency));
        kVarA.u = true;
        kVarA.i = true;
        return kVarA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean cardExchangeTotal$lambda$0(boolean z, TransactionDbModel transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return transaction.type == TransactionType.EXCHANGE && (((transaction.getAmount().getAmount() > 0L ? 1 : (transaction.getAmount().getAmount() == 0L ? 0 : -1)) > 0 && z) || ((transaction.getAmount().getAmount() > 0L ? 1 : (transaction.getAmount().getAmount() == 0L ? 0 : -1)) < 0 && !z));
    }

    private final String cardPaymentsTotal(List<? extends TransactionDbModel> transactions, xi0.b currency) {
        long jCalculateTotal = calculateTotal(transactions, new com.revolut.feature.alipay_plus.mpm.webcontainer.a(3));
        j jVar = k.Companion;
        b bVar = this.languageProvider;
        jVar.getClass();
        k kVarA = j.a(bVar);
        kVarA.v(new d(jCalculateTotal, currency));
        kVarA.u = true;
        kVarA.i = true;
        return kVarA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean cardPaymentsTotal$lambda$0(TransactionDbModel transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return transaction.type == TransactionType.CARD_PAYMENT;
    }

    private final String cardReceivedTotal(List<? extends TransactionDbModel> transactions, xi0.b currency) {
        long jCalculateTotal = calculateTotal(transactions, new com.revolut.feature.alipay_plus.mpm.webcontainer.a(10));
        long jCalculateTotal2 = calculateTotal(transactions, new com.revolut.feature.alipay_plus.mpm.webcontainer.a(11));
        j jVar = k.Companion;
        b bVar = this.languageProvider;
        jVar.getClass();
        k kVarA = j.a(bVar);
        kVarA.v(new d(jCalculateTotal + jCalculateTotal2, currency));
        kVarA.u = true;
        kVarA.i = true;
        return kVarA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean cardReceivedTotal$lambda$0(TransactionDbModel transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return transaction.type == TransactionType.TRANSFER && transaction.getAmount().getAmount() >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean cardReceivedTotal$lambda$1(TransactionDbModel transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return transaction.type == TransactionType.REWARD;
    }

    private final String cardRevolutFeesTotal(List<? extends TransactionDbModel> transactions, xi0.b currency) {
        long jCalculateTotalFee = calculateTotalFee(transactions, new com.revolut.feature.alipay_plus.mpm.webcontainer.a(4));
        long jCalculateTotal = calculateTotal(transactions, new com.revolut.feature.alipay_plus.mpm.webcontainer.a(5));
        j jVar = k.Companion;
        b bVar = this.languageProvider;
        jVar.getClass();
        k kVarA = j.a(bVar);
        kVarA.u = true;
        kVarA.v(new d((-jCalculateTotal) + jCalculateTotalFee, currency));
        kVarA.i = true;
        return kVarA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean cardRevolutFeesTotal$lambda$0(TransactionDbModel transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return transaction.type != TransactionType.CRYPTO_WITHDRAWAL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean cardRevolutFeesTotal$lambda$1(TransactionDbModel transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return transaction.type == TransactionType.FEE;
    }

    private final String cardSentTotal(List<? extends TransactionDbModel> transactions, xi0.b currency) {
        long jCalculateTotal = calculateTotal(transactions, new com.revolut.feature.alipay_plus.mpm.webcontainer.a(9));
        j jVar = k.Companion;
        b bVar = this.languageProvider;
        jVar.getClass();
        k kVarA = j.a(bVar);
        kVarA.v(new d(jCalculateTotal, currency));
        kVarA.u = true;
        kVarA.i = true;
        return kVarA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean cardSentTotal$lambda$0(TransactionDbModel transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return transaction.type == TransactionType.TRANSFER && transaction.getAmount().getAmount() < 0;
    }

    private final String cardTopUpTotal(List<? extends TransactionDbModel> transactions, xi0.b currency) {
        long jCalculateTotal = calculateTotal(transactions, new com.revolut.feature.alipay_plus.mpm.webcontainer.a(6));
        j jVar = k.Companion;
        b bVar = this.languageProvider;
        jVar.getClass();
        k kVarA = j.a(bVar);
        kVarA.v(new d(jCalculateTotal, currency));
        kVarA.u = true;
        kVarA.i = true;
        return kVarA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean cardTopUpTotal$lambda$0(TransactionDbModel transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return transaction.type == TransactionType.TOPUP;
    }

    private final StatementModel createStatementsInternal(ReportUtils.ReportData reportData, boolean simpleFormat, d balanceTotal, xi0.b currency, boolean single, Long startDate, Long endDate) {
        boolean z;
        n71.b bankRevolutBankAccount;
        String str;
        String str2;
        List<TransactionDbModel> transactions = reportData.getTransactions();
        List<TransactionRowModel> listCreateTransactionList = createTransactionList(transactions, simpleFormat, single, reportData.isRevolutPaymentUAB());
        n71.b bankRevolutBankAccount2 = reportData.getBankRevolutBankAccount();
        boolean z3 = bankRevolutBankAccount2 != null && Intrinsics.f(bankRevolutBankAccount2.f212979j, Boolean.TRUE) && !(((str = bankRevolutBankAccount2.d) == null || str.length() == 0) && ((str2 = bankRevolutBankAccount2.f212977g) == null || str2.length() == 0)) && reportData.getKycPassed();
        String str3 = (!z3 || bankRevolutBankAccount2 == null) ? null : bankRevolutBankAccount2.f212977g;
        String str4 = (!z3 || bankRevolutBankAccount2 == null) ? null : bankRevolutBankAccount2.f;
        String str5 = (!z3 || !(TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) || (bankRevolutBankAccount = reportData.getBankRevolutBankAccount()) == null) ? null : bankRevolutBankAccount.d;
        String str6 = (!z3 || bankRevolutBankAccount2 == null) ? null : bankRevolutBankAccount2.f212976c;
        n nVarA = ((ang.a) this.legacyUserProvider).a();
        Address address = nVarA != null ? nVarA.k : null;
        if (nVarA == null || address == null) {
            throw new IllegalStateException(p.a.p("user(id=", nVarA != null ? nVarA.f116408a : null, ") or address must not be null for statements"));
        }
        Address address2 = address;
        String str7 = currency.f306286a;
        String strPrintRangeDayOfMonthYear = printRangeDayOfMonthYear(startDate, Long.valueOf(getEndDate(endDate)));
        String phone = reportData.getPhone();
        String strI = w.I(nVarA);
        String streetLine1 = address2.getStreetLine1();
        String streetLine2 = address2.getStreetLine2();
        String country = address2.getCountry();
        String postcode = address2.getPostcode();
        String region = address2.getRegion();
        String city = address2.getCity();
        a aVar = this.datePrinter;
        long balanceDate = getBalanceDate(endDate);
        c cVar = (c) aVar;
        cVar.getClass();
        String strPrint = DateTimeFormat.mediumDate().withLocale(((s80.b) cVar.f192762a).b()).print(balanceDate);
        Intrinsics.checkNotNullExpressionValue(strPrint, "print(...)");
        String strBalanceTotal = balanceTotal(balanceTotal, simpleFormat, currency);
        String strAccountTotal = accountTotal(balanceTotal);
        String strCardPaymentsTotal = cardPaymentsTotal(transactions, currency);
        String strCardPaymentsTotal2 = cardPaymentsTotal(transactions, currency);
        String strCardSentTotal = cardSentTotal(transactions, currency);
        String strCardSentTotal2 = cardSentTotal(transactions, currency);
        String strCardReceivedTotal = cardReceivedTotal(transactions, currency);
        String strCardReceivedTotal2 = cardReceivedTotal(transactions, currency);
        String strCardTopUpTotal = cardTopUpTotal(transactions, currency);
        String strCardAtmWithdrawalTotal = cardAtmWithdrawalTotal(transactions, currency);
        String strCardExchangeTotal = cardExchangeTotal(transactions, true, currency);
        String strCardExchangeTotal2 = cardExchangeTotal(transactions, true, currency);
        String strCardExchangeTotal3 = cardExchangeTotal(transactions, false, currency);
        String strCardRevolutFeesTotal = cardRevolutFeesTotal(transactions, currency);
        String strCryptoWithdrawTotal = cryptoWithdrawTotal(transactions, currency);
        String strCryptoWithdrawTotalFees = cryptoWithdrawTotalFees(transactions, currency);
        j jVar = k.Companion;
        b bVar = this.languageProvider;
        jVar.getClass();
        k kVarA = j.a(bVar);
        kVarA.v(new d(0L, currency));
        kVarA.u = true;
        kVarA.i = true;
        String strA = kVarA.a();
        String footer = reportData.getFooter();
        String strPrepareCryptoInfo = prepareCryptoInfo(transactions, reportData.getCryptoFooter());
        f0 f0Var = f0.f322471a;
        String country2 = address2.getCountry();
        wi0.b.Companion.getClass();
        boolean zF = Intrinsics.f(country2, "SG");
        List<TransactionRowModel> list = listCreateTransactionList;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = false;
        } else {
            Iterator<T> it8 = list.iterator();
            while (it8.hasNext()) {
                String cryptoMarkupDescription = ((TransactionRowModel) it8.next()).getCryptoMarkupDescription();
                if (cryptoMarkupDescription != null && !d0.W(cryptoMarkupDescription)) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        return new StatementModel("Roboto", str7, strPrintRangeDayOfMonthYear, phone, strI, str5, str6, str3, str4, strPrint, strBalanceTotal, strAccountTotal, null, strCardPaymentsTotal, strCardPaymentsTotal2, null, strCardSentTotal, strCardSentTotal2, null, strCardReceivedTotal, strCardReceivedTotal2, null, strCardTopUpTotal, strCardAtmWithdrawalTotal, strCardExchangeTotal, strCardExchangeTotal2, null, strCardExchangeTotal3, strCardRevolutFeesTotal, strA, strCryptoWithdrawTotal, strCryptoWithdrawTotalFees, footer, strPrepareCryptoInfo, listCreateTransactionList, f0Var, null, streetLine1, streetLine2, city, postcode, region, country, zF, z, 0, 16, null);
    }

    private final TransactionRowModel createTransaction(TransactionDbModel model, boolean simpleFormat, boolean isRevolutPaymentUAB) {
        TransactionRowModel transactionRowModel = new TransactionRowModel(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
        String strR = (isRevolutPaymentUAB && isCreditTransaction(model)) ? a0.d.r(model.description, " (Revolut Bank UAB)") : model.description;
        Intrinsics.h(strR);
        transactionRowModel.setDescription(encloseCommas(strR));
        if (simpleFormat && transactionRowModel.getDescription() != null) {
            transactionRowModel.m3767setDescription(encloseCommas(transactionRowModel.getDescription()));
        }
        if (model.getAmount().getAmount() > 0) {
            addPaidInAmountValues(model, transactionRowModel, simpleFormat);
        } else {
            addPaidOutAmountValues(model, transactionRowModel, simpleFormat);
        }
        addRateAndFeeValues(model, transactionRowModel, simpleFormat);
        a aVar = this.datePrinter;
        Long l2 = model.completedDate;
        if (l2 == null) {
            l2 = model.startedDate;
        }
        Intrinsics.h(l2);
        long jLongValue = l2.longValue();
        c cVar = (c) aVar;
        cVar.getClass();
        String strPrint = DateTimeFormat.mediumDate().withLocale(((s80.b) cVar.f192762a).b()).print(jLongValue);
        Intrinsics.checkNotNullExpressionValue(strPrint, "print(...)");
        transactionRowModel.setTransactionDate(encloseCommas(strPrint));
        String tag2 = model.getTag();
        Intrinsics.checkNotNullExpressionValue(tag2, "getTag(...)");
        transactionRowModel.setCategory(encloseCommas(tag2));
        if (model.getType() == TransactionType.EXCHANGE) {
            setupExchangeParts(model, transactionRowModel, simpleFormat);
        }
        String userComment = model.userComment;
        if (userComment != null) {
            Intrinsics.checkNotNullExpressionValue(userComment, "userComment");
            transactionRowModel.setNote(encloseCommas(userComment));
        }
        Long l3 = model.startedDate;
        long jLongValue2 = l3 != null ? l3.longValue() : 0L;
        c cVar2 = (c) this.datePrinter;
        cVar2.getClass();
        Intrinsics.checkNotNullParameter("HHmmss", "pattern");
        String strPrint2 = DateTimeFormat.forPattern("HHmmss").withLocale(((s80.b) cVar2.f192762a).b()).print(jLongValue2);
        Intrinsics.checkNotNullExpressionValue(strPrint2, "print(...)");
        String sid2 = model.f88271sid;
        Intrinsics.checkNotNullExpressionValue(sid2, "sid");
        String strV0 = kotlin.text.f0.V0(8, sid2);
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String upperCase = strV0.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        transactionRowModel.setReferenceNumber(encloseCommas(a0.d.r(upperCase, strPrint2)));
        return transactionRowModel;
    }

    private final List<TransactionRowModel> createTransactionList(List<? extends TransactionDbModel> models, boolean simpleFormat, boolean single, boolean isRevolutPaymentUAB) {
        String strA;
        TransactionRowModel balance;
        List<? extends TransactionDbModel> list = models;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (TransactionDbModel transactionDbModel : list) {
            if (single) {
                balance = createTransaction(transactionDbModel, simpleFormat, isRevolutPaymentUAB);
            } else {
                if (transactionDbModel.balance == null || transactionDbModel.pocketCcy == null) {
                    strA = "";
                } else {
                    j jVar = k.Companion;
                    b bVar = this.languageProvider;
                    jVar.getClass();
                    k kVarA = j.a(bVar);
                    kVarA.u = true;
                    Long balance2 = transactionDbModel.balance;
                    Intrinsics.checkNotNullExpressionValue(balance2, "balance");
                    kVarA.q(balance2.longValue());
                    kVarA.s(transactionDbModel.getPocketCcy());
                    kVarA.f278053m = true;
                    strA = kVarA.a();
                }
                TransactionRowModel balanceLong = createTransaction(transactionDbModel, simpleFormat, isRevolutPaymentUAB).setBalanceLong(strA);
                String balance3 = TransactionTextsUtil.getBalance(transactionDbModel, this.languageProvider);
                Intrinsics.checkNotNullExpressionValue(balance3, "getBalance(...)");
                balance = balanceLong.setBalance(balance3);
            }
            arrayList.add(balance);
        }
        return arrayList;
    }

    private final String cryptoWithdrawTotal(List<? extends TransactionDbModel> transactionsModelsMainAccount, xi0.b currency) {
        return prepareCryptoWithdrawTotalMoney(transactionsModelsMainAccount, calculateTotal(transactionsModelsMainAccount, new com.revolut.feature.alipay_plus.mpm.webcontainer.a(2)), currency);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean cryptoWithdrawTotal$lambda$0(TransactionDbModel it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return it8.type == TransactionType.CRYPTO_WITHDRAWAL;
    }

    private final String cryptoWithdrawTotalFees(List<? extends TransactionDbModel> transactionsModelsMainAccount, xi0.b currency) {
        return prepareCryptoWithdrawTotalMoney(transactionsModelsMainAccount, calculateTotalFee(transactionsModelsMainAccount, new com.revolut.feature.alipay_plus.mpm.webcontainer.a(7)), currency);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean cryptoWithdrawTotalFees$lambda$0(TransactionDbModel it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return it8.type == TransactionType.CRYPTO_WITHDRAWAL;
    }

    private final String encloseCommas(String str) {
        return d0.J(str, ",", false) ? p.a.p("\"", str, "\"") : str;
    }

    private final String formatCurrency(boolean simpleFormat, String currency) {
        String strJ;
        if (simpleFormat) {
            return p.a.p(" ", currency, " ");
        }
        if (currency != null) {
            xi0.b.Companion.getClass();
            strJ = cp5.d.J(xi0.a.a(currency));
        } else {
            strJ = null;
        }
        return strJ == null ? "" : strJ;
    }

    private final String formatDateMedium(long time) {
        String strPrint = DateTimeFormat.mediumDate().withLocale(this.displayLanguage).print(time);
        Intrinsics.checkNotNullExpressionValue(strPrint, "print(...)");
        return strPrint;
    }

    private final String formatDateTimeMedium(long time) {
        String strPrint = DateTimeFormat.mediumDateTime().withLocale(this.displayLanguage).print(time);
        Intrinsics.checkNotNullExpressionValue(strPrint, "print(...)");
        return strPrint;
    }

    private final int get(long time, int calendarUnit) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(time));
        return calendar.get(calendarUnit);
    }

    private final long getBalanceDate(Long endDate) {
        return (endDate == null || endDate.longValue() >= now()) ? now() : endDate.longValue();
    }

    private final long getEndDate(Long endDate) {
        return (endDate == null || endDate.longValue() > now()) ? now() : endDate.longValue();
    }

    private final String getReceiptTitle(int counter) {
        return this.localization.i(R$string.statement_receipt_number, Integer.valueOf(counter));
    }

    private final boolean hasFeeOrSurcharge(TransactionDbModel model) {
        MoneySerializable moneySerializable = model.f88269fee;
        if (moneySerializable != null && moneySerializable.getAmount() > 0) {
            return true;
        }
        Long l2 = model.surcharge;
        if (l2 != null && l2.longValue() > 0) {
            return true;
        }
        Long l3 = model.feeFx;
        return (l3 != null ? l3.longValue() : 0L) > 0;
    }

    private final boolean hasRateMarkup(TransactionDbModel model) {
        return (model.rateMarkupAmount == null || model.rateMarkupAmountCurrency == null) ? false : true;
    }

    private final boolean isCreditTransaction(TransactionDbModel model) {
        String[] elements = {"credit_card_topup", "credit_card_interest_refund", "credit_card_monthly_admin_fee", "credit_card_forced_minimum_repayment", "credit_card_excess_balance_correction", "credit_card_late_payment_fee"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z = model.getType() == TransactionType.CREDIT_INTEREST || kotlin.collections.d.y0(elements).contains(model.getReason());
        TransactionType[] elements2 = {TransactionType.LOAN, TransactionType.LOAN_PAYMENT};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        return z || kotlin.collections.d.y0(elements2).contains(model.getType());
    }

    private final boolean isFxTransaction(TransactionDbModel model) {
        return (model.getFeeFxCcy() == null || Objects.equals(model.getPocketCcy(), model.getFeeFxCcy()) || model.rate == null) ? false : true;
    }

    private final boolean isTransactionEligibleForRateMarkup(TransactionDbModel model) {
        String currency;
        xi0.b bVarA;
        TransactionCounterpartDto counterPart = TransactionExtraAttrsUtil.getCounterPart(model);
        if (counterPart != null && (currency = counterPart.getCurrency()) != null) {
            String str = model.pocketCcy;
            if (str != null) {
                xi0.b.Companion.getClass();
                bVarA = xi0.a.a(str);
            } else {
                bVarA = null;
            }
            boolean z = cp5.d.z(bVarA) || r6.b.B(xi0.b.Companion, currency);
            if (model.type == TransactionType.EXCHANGE && z) {
                return true;
            }
        }
        return false;
    }

    private final boolean isUserFromUs() {
        Address address;
        n nVarA = ((ang.a) this.legacyUserProvider).a();
        String country = (nVarA == null || (address = nVarA.k) == null) ? null : address.getCountry();
        wi0.b.Companion.getClass();
        wi0.a aVar = wi0.b.Companion;
        return Intrinsics.f(country, "US");
    }

    private final long now() {
        return System.currentTimeMillis();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String prepareCryptoInfo(java.util.List<? extends com.revolut.feature.statements.impl.tools.transactions.TransactionDbModel> r2, java.lang.String r3) {
        /*
            r1 = this;
            boolean r0 = r1.isUserFromUs()
            if (r0 == 0) goto L2e
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L16
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L16
            goto L2e
        L16:
            java.util.Iterator r2 = r2.iterator()
        L1a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r2.next()
            com.revolut.feature.statements.impl.tools.transactions.TransactionDbModel r0 = (com.revolut.feature.statements.impl.tools.transactions.TransactionDbModel) r0
            boolean r0 = r1.canShowRateMarkup(r0)
            if (r0 == 0) goto L1a
            r2 = 1
            goto L2f
        L2e:
            r2 = 0
        L2f:
            r0 = 0
            if (r3 == 0) goto L3e
            if (r2 == 0) goto L35
            goto L36
        L35:
            r3 = r0
        L36:
            if (r3 == 0) goto L3e
            java.lang.String r2 = "* "
            java.lang.String r0 = r2.concat(r3)
        L3e:
            if (r0 != 0) goto L43
            java.lang.String r2 = ""
            return r2
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.statements.impl.tools.ReportUtilsImpl.prepareCryptoInfo(java.util.List, java.lang.String):java.lang.String");
    }

    private final String prepareCryptoWithdrawTotalMoney(List<? extends TransactionDbModel> transactionsModelsMainAccount, long amount, xi0.b currency) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : transactionsModelsMainAccount) {
            if (((TransactionDbModel) obj2).type == TransactionType.CRYPTO_WITHDRAWAL) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        j jVar = k.Companion;
        b bVar = this.languageProvider;
        jVar.getClass();
        k kVarA = j.a(bVar);
        kVarA.u = true;
        kVarA.v(new d(amount, currency));
        kVarA.i = true;
        return kVarA.a();
    }

    private final String printMonthShort(long time) {
        String strPrint = new DateTimeFormatterBuilder().appendMonthOfYearShortText().toFormatter().withLocale(this.displayLanguage).print(time);
        Intrinsics.checkNotNullExpressionValue(strPrint, "print(...)");
        return strPrint;
    }

    private final String printMonthShortYear(long time) {
        String strPrint = new DateTimeFormatterBuilder().appendMonthOfYearShortText().appendLiteral(' ').appendYear(4, 4).toFormatter().withLocale(this.displayLanguage).print(time);
        Intrinsics.checkNotNullExpressionValue(strPrint, "print(...)");
        return strPrint;
    }

    private final String printPrettyRangeMonthShortYear(long start, long end2) {
        return (start <= 0 || end2 <= 0) ? start > 0 ? com.google.android.gms.internal.mlkit_vision_face.a.o(printMonthShortYear(start), " – ", printMonthShortYear(now())) : printMonthShortYear(now()) : get(start, 1) == get(end2, 1) ? get(start, 2) == get(end2, 2) ? printMonthShortYear(end2) : com.google.android.gms.internal.mlkit_vision_face.a.o(printMonthShort(start), " – ", printMonthShortYear(end2)) : com.google.android.gms.internal.mlkit_vision_face.a.o(printMonthShortYear(start), " – ", printMonthShortYear(end2));
    }

    private final String printRangeDayOfMonthYear(Long start, Long end2) {
        return (start == null || end2 == null) ? start != null ? this.localization.i(R$string.statement_period, formatDateMedium(start.longValue()), formatDateMedium(now())) : formatDateMedium(now()) : this.localization.i(R$string.statement_period, formatDateMedium(start.longValue()), formatDateMedium(end2.longValue()));
    }

    private final String rate(TransactionDbModel model) {
        if (!isFxTransaction(model)) {
            return "";
        }
        String pocketCcy = model.getPocketCcy();
        String feeFxCcy = model.getFeeFxCcy();
        String currencyCode = feeFxCcy == null ? "" : feeFxCcy;
        xi0.a aVar = xi0.b.Companion;
        Intrinsics.h(pocketCcy);
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(pocketCcy);
        j jVar = k.Companion;
        b bVar = this.languageProvider;
        jVar.getClass();
        k kVarA = j.a(bVar);
        kVarA.f278047b = bVarA;
        kVarA.q(cp5.d.k(bVarA));
        kVarA.k = true;
        String strA = kVarA.a();
        g gVar = this.localization;
        int i = R$string.statement_fx_rate;
        Double rate = model.rate;
        Intrinsics.checkNotNullExpressionValue(rate, "rate");
        double dDoubleValue = rate.doubleValue();
        b languageProvider = ((e) l70.c.Companion.c()).n();
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        return gVar.i(i, strA, r.a(currencyCode, dDoubleValue, true, languageProvider, 12).a());
    }

    private final void setupExchangeParts(TransactionDbModel model, TransactionRowModel transaction, boolean simpleFormat) {
        TransactionCounterpartDto counterPart = TransactionExtraAttrsUtil.getCounterPart(model);
        if (counterPart == null) {
            return;
        }
        long amount = counterPart.getAmount();
        String currency = counterPart.getCurrency();
        boolean z = amount < 0;
        j jVar = k.Companion;
        b bVar = this.languageProvider;
        jVar.getClass();
        k kVarA = j.a(bVar);
        kVarA.q(amount);
        kVarA.s(currency);
        kVarA.i = true;
        kVarA.f278053m = true;
        String strA = kVarA.a();
        String currency2 = formatCurrency(simpleFormat, currency);
        k kVarA2 = j.a(this.languageProvider);
        kVarA2.v(model.getAmount().toDomain());
        kVarA2.i = true;
        kVarA2.f278053m = true;
        String strA2 = kVarA2.a();
        String currency3 = formatCurrency(simpleFormat, model.getAmount().getCurrency());
        transaction.setPartyAmount(z ? strA : strA2);
        transaction.setPartyCcy(z ? currency2 : currency3);
        MoneySerializable moneySerializable = model.f88269fee;
        if (moneySerializable == null || moneySerializable.getAmount() <= 0) {
            return;
        }
        if (z) {
            strA = strA2;
        }
        transaction.setPaidInPartyAmount(strA);
        if (z) {
            currency2 = currency3;
        }
        transaction.setPaidInPartyCcy(currency2);
    }

    @Override // com.revolut.feature.statements.impl.tools.ReportUtils
    @NotNull
    public StatementModel createSingleStatement(@NotNull ReportUtils.ReportData reportData, @NotNull xi0.b currency, boolean simpleFormat, Long startDate, Long endDate) {
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        Intrinsics.checkNotNullParameter(currency, "currency");
        List<TransactionDbModel> transactions = reportData.getTransactions();
        StatementModel statementModelCreateStatementsInternal = createStatementsInternal(reportData, simpleFormat, null, currency, true, startDate, endDate);
        if (!transactions.isEmpty()) {
            File revolutImagesDirectory = ImageUtil.getRevolutImagesDirectory();
            Intrinsics.checkNotNullExpressionValue(revolutImagesDirectory, "getRevolutImagesDirectory(...)");
            int i = 0;
            List listC = o80.c.c(revolutImagesDirectory, transactions.get(0).getSid());
            ArrayList arrayList = new ArrayList(zhm.w.t(listC, 10));
            for (Object obj2 : listC) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                String receiptTitle = getReceiptTitle(i);
                String imageBase64AndScale = ImageUtil.getImageBase64AndScale(this.context, ((File) obj2).getAbsolutePath());
                Intrinsics.checkNotNullExpressionValue(imageBase64AndScale, "getImageBase64AndScale(...)");
                arrayList.add(new ReceiptModel(receiptTitle, imageBase64AndScale));
                i = i2;
            }
            statementModelCreateStatementsInternal.setReceipts(arrayList);
        }
        return statementModelCreateStatementsInternal;
    }

    @Override // com.revolut.feature.statements.impl.tools.ReportUtils
    @NotNull
    public StatementModel createStatements(long balance, @NotNull ReportUtils.ReportData reportData, @NotNull xi0.b currency, boolean simpleFormat, Long startDate, Long endDate) {
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return createStatementsInternal(reportData, simpleFormat, new d(balance, currency), currency, false, startDate, endDate);
    }

    @Override // com.revolut.feature.statements.impl.tools.ReportUtils
    @NotNull
    public String generateFileName(Long startDate, Long endDate, @NotNull xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return a0.d.v(new Object[]{currency.f306286a, (startDate == null || endDate == null) ? endDate != null ? formatDateTimeMedium(endDate.longValue()) : formatDateTimeMedium(now()) : printPrettyRangeMonthShortYear(startDate.longValue(), endDate.longValue())}, 2, "Revolut-%1s-Statement-%2s", "format(...)");
    }
}
