package com.revolut.data.database.models.wallet.account;

import com.revolut.data.network.models.wallet.account.PixDto;
import com.revolut.data.network.models.wallet.account.TedDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\b\n\u0002\b,\b\u0080\b\u0018\u00002\u00020\u0001BÃ\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010*J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010*J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010*J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010*J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010*J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010*J\u0012\u00101\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010*J\u0012\u00104\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b6\u00105J\u0012\u00107\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b7\u00105J\u0012\u00108\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b8\u00105J\u0012\u00109\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u0010*J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u0010*J\u0012\u0010;\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b;\u0010*J\u0012\u0010<\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b<\u0010*J\u0012\u0010=\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b=\u0010*J\u0012\u0010>\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b>\u0010*J\u0012\u0010?\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b?\u0010*J\u0012\u0010@\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b@\u0010*J\u0012\u0010A\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bA\u0010*J\u0012\u0010B\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bF\u0010*J\u0012\u0010G\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bG\u0010*J\u0012\u0010H\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bH\u0010*J\u0012\u0010I\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bI\u0010*J\u0012\u0010J\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bJ\u0010*J\u0012\u0010K\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bK\u0010*J\u0012\u0010L\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bL\u0010*J\u0012\u0010M\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bM\u0010*J\u008c\u0003\u0010N\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\bN\u0010OJ\u0010\u0010Q\u001a\u00020PHÖ\u0001¢\u0006\u0004\bQ\u0010RJ\u001a\u0010T\u001a\u00020\r2\b\u0010S\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bT\u0010UJ\u0010\u0010V\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bV\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010W\u001a\u0004\bX\u0010*R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010W\u001a\u0004\bY\u0010*R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010W\u001a\u0004\bZ\u0010*R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010W\u001a\u0004\b[\u0010*R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010W\u001a\u0004\b\\\u0010*R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010W\u001a\u0004\b]\u0010*R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010W\u001a\u0004\b^\u0010*R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010_\u001a\u0004\b`\u00102R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010W\u001a\u0004\ba\u0010*R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010b\u001a\u0004\bc\u00105R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010b\u001a\u0004\bd\u00105R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010b\u001a\u0004\be\u00105R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010b\u001a\u0004\bf\u00105R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010W\u001a\u0004\bg\u0010*R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010W\u001a\u0004\bh\u0010*R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010W\u001a\u0004\bi\u0010*R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010W\u001a\u0004\bj\u0010*R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010W\u001a\u0004\bk\u0010*R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010W\u001a\u0004\bl\u0010*R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010W\u001a\u0004\bm\u0010*R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010W\u001a\u0004\bn\u0010*R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010W\u001a\u0004\bo\u0010*R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010p\u001a\u0004\bq\u0010CR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010r\u001a\u0004\bs\u0010ER\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010W\u001a\u0004\bt\u0010*R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010W\u001a\u0004\bu\u0010*R\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010W\u001a\u0004\bv\u0010*R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010W\u001a\u0004\bw\u0010*R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010W\u001a\u0004\bx\u0010*R\u001c\u0010$\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010W\u001a\u0004\by\u0010*R\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010W\u001a\u0004\bz\u0010*R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010W\u001a\u0004\b{\u0010*¨\u0006|"}, d2 = {"Lcom/revolut/data/database/models/wallet/account/AccountDetailsEntity;", "", "", "id", "sortCode", "accountNumber", "bankName", "bic", "currency", "iban", "Lno3/b;", "address", "beneficiaryName", "", "personal", "local", "activate", "kycRequired", "requiredReference", "transferTime", "achRoutingNumber", "bsb", "bankCode", "transitNumber", "institutionNumber", "pocketType", "fedwireRoutingNumber", "Lcom/revolut/data/network/models/wallet/account/TedDto;", "ted", "Lcom/revolut/data/network/models/wallet/account/PixDto;", "pix", "bankNameCode", "branchName", "branchCode", "accountType", "accountTypeCode", "branchNameLatin", "bankNameAndAddress", "intermediaryBic", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lno3/b;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/network/models/wallet/account/TedDto;Lcom/revolut/data/network/models/wallet/account/PixDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Lno3/b;", "component9", "component10", "()Ljava/lang/Boolean;", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "()Lcom/revolut/data/network/models/wallet/account/TedDto;", "component24", "()Lcom/revolut/data/network/models/wallet/account/PixDto;", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lno3/b;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/network/models/wallet/account/TedDto;Lcom/revolut/data/network/models/wallet/account/PixDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/revolut/data/database/models/wallet/account/AccountDetailsEntity;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljava/lang/String;", "getId", "getSortCode", "getAccountNumber", "getBankName", "getBic", "getCurrency", "getIban", "Lno3/b;", "getAddress", "getBeneficiaryName", "Ljava/lang/Boolean;", "getPersonal", "getLocal", "getActivate", "getKycRequired", "getRequiredReference", "getTransferTime", "getAchRoutingNumber", "getBsb", "getBankCode", "getTransitNumber", "getInstitutionNumber", "getPocketType", "getFedwireRoutingNumber", "Lcom/revolut/data/network/models/wallet/account/TedDto;", "getTed", "Lcom/revolut/data/network/models/wallet/account/PixDto;", "getPix", "getBankNameCode", "getBranchName", "getBranchCode", "getAccountType", "getAccountTypeCode", "getBranchNameLatin", "getBankNameAndAddress", "getIntermediaryBic", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccountDetailsEntity {

    @b("accountNumber")
    private final String accountNumber;

    @b("accountType")
    private final String accountType;

    @b("accountTypeCode")
    private final String accountTypeCode;

    @b("achRoutingNumber")
    private final String achRoutingNumber;

    @b("activate")
    private final Boolean activate;

    @b("address")
    private final no3.b address;

    @b("bankCode")
    private final String bankCode;

    @b("bankName")
    private final String bankName;

    @b("bankNameAndAddress")
    private final String bankNameAndAddress;

    @b("bankNameCode")
    private final String bankNameCode;

    @b("beneficiaryName")
    private final String beneficiaryName;

    @b("bic")
    private final String bic;

    @b("branchCode")
    private final String branchCode;

    @b("branchName")
    private final String branchName;

    @b("branchNameLatin")
    private final String branchNameLatin;

    @b("bsb")
    private final String bsb;

    @b("currency")
    @NotNull
    private final String currency;

    @b("fedwireRoutingNumber")
    private final String fedwireRoutingNumber;

    @b("iban")
    private final String iban;

    @b("id")
    @NotNull
    private final String id;

    @b("institutionNumber")
    private final String institutionNumber;

    @b("intermediaryBic")
    private final String intermediaryBic;

    @b("kycRequired")
    private final Boolean kycRequired;

    @b("local")
    private final Boolean local;

    @b("personal")
    private final Boolean personal;

    @b("pix")
    private final PixDto pix;

    @b("pocketType")
    private final String pocketType;

    @b("requiredReference")
    private final String requiredReference;

    @b("sortCode")
    private final String sortCode;

    @b("ted")
    private final TedDto ted;

    @b("transferTime")
    private final String transferTime;

    @b("transitNumber")
    private final String transitNumber;

    public AccountDetailsEntity(@NotNull String id10, String str, String str2, String str3, String str4, @NotNull String currency, String str5, no3.b bVar, String str6, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TedDto tedDto, PixDto pixDto, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.id = id10;
        this.sortCode = str;
        this.accountNumber = str2;
        this.bankName = str3;
        this.bic = str4;
        this.currency = currency;
        this.iban = str5;
        this.address = bVar;
        this.beneficiaryName = str6;
        this.personal = bool;
        this.local = bool2;
        this.activate = bool3;
        this.kycRequired = bool4;
        this.requiredReference = str7;
        this.transferTime = str8;
        this.achRoutingNumber = str9;
        this.bsb = str10;
        this.bankCode = str11;
        this.transitNumber = str12;
        this.institutionNumber = str13;
        this.pocketType = str14;
        this.fedwireRoutingNumber = str15;
        this.ted = tedDto;
        this.pix = pixDto;
        this.bankNameCode = str16;
        this.branchName = str17;
        this.branchCode = str18;
        this.accountType = str19;
        this.accountTypeCode = str20;
        this.branchNameLatin = str21;
        this.bankNameAndAddress = str22;
        this.intermediaryBic = str23;
    }

    public static /* synthetic */ AccountDetailsEntity copy$default(AccountDetailsEntity accountDetailsEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, no3.b bVar, String str8, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, TedDto tedDto, PixDto pixDto, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, int i, Object obj2) {
        String str26;
        String str27;
        String str28;
        String str29;
        String str30;
        String str31;
        String str32;
        String str33;
        String str34;
        TedDto tedDto2;
        PixDto pixDto2;
        String str35;
        String str36;
        String str37;
        String str38;
        String str39;
        String str40;
        String str41;
        String str42;
        String str43;
        String str44;
        String str45;
        String str46;
        String str47;
        no3.b bVar2;
        String str48;
        Boolean bool5;
        Boolean bool6;
        Boolean bool7;
        Boolean bool8;
        String str49;
        String str50 = (i & 1) != 0 ? accountDetailsEntity.id : str;
        String str51 = (i & 2) != 0 ? accountDetailsEntity.sortCode : str2;
        String str52 = (i & 4) != 0 ? accountDetailsEntity.accountNumber : str3;
        String str53 = (i & 8) != 0 ? accountDetailsEntity.bankName : str4;
        String str54 = (i & 16) != 0 ? accountDetailsEntity.bic : str5;
        String str55 = (i & 32) != 0 ? accountDetailsEntity.currency : str6;
        String str56 = (i & 64) != 0 ? accountDetailsEntity.iban : str7;
        no3.b bVar3 = (i & 128) != 0 ? accountDetailsEntity.address : bVar;
        String str57 = (i & 256) != 0 ? accountDetailsEntity.beneficiaryName : str8;
        Boolean bool9 = (i & 512) != 0 ? accountDetailsEntity.personal : bool;
        Boolean bool10 = (i & 1024) != 0 ? accountDetailsEntity.local : bool2;
        Boolean bool11 = (i & 2048) != 0 ? accountDetailsEntity.activate : bool3;
        Boolean bool12 = (i & 4096) != 0 ? accountDetailsEntity.kycRequired : bool4;
        String str58 = (i & 8192) != 0 ? accountDetailsEntity.requiredReference : str9;
        String str59 = str50;
        String str60 = (i & 16384) != 0 ? accountDetailsEntity.transferTime : str10;
        String str61 = (i & 32768) != 0 ? accountDetailsEntity.achRoutingNumber : str11;
        String str62 = (i & 65536) != 0 ? accountDetailsEntity.bsb : str12;
        String str63 = (i & 131072) != 0 ? accountDetailsEntity.bankCode : str13;
        String str64 = (i & 262144) != 0 ? accountDetailsEntity.transitNumber : str14;
        String str65 = (i & 524288) != 0 ? accountDetailsEntity.institutionNumber : str15;
        String str66 = (i & PKIFailureInfo.badCertTemplate) != 0 ? accountDetailsEntity.pocketType : str16;
        String str67 = (i & PKIFailureInfo.badSenderNonce) != 0 ? accountDetailsEntity.fedwireRoutingNumber : str17;
        TedDto tedDto3 = (i & 4194304) != 0 ? accountDetailsEntity.ted : tedDto;
        PixDto pixDto3 = (i & 8388608) != 0 ? accountDetailsEntity.pix : pixDto;
        String str68 = (i & 16777216) != 0 ? accountDetailsEntity.bankNameCode : str18;
        String str69 = (i & 33554432) != 0 ? accountDetailsEntity.branchName : str19;
        String str70 = (i & 67108864) != 0 ? accountDetailsEntity.branchCode : str20;
        String str71 = (i & 134217728) != 0 ? accountDetailsEntity.accountType : str21;
        String str72 = (i & 268435456) != 0 ? accountDetailsEntity.accountTypeCode : str22;
        String str73 = (i & PKIFailureInfo.duplicateCertReq) != 0 ? accountDetailsEntity.branchNameLatin : str23;
        String str74 = (i & 1073741824) != 0 ? accountDetailsEntity.bankNameAndAddress : str24;
        if ((i & Integer.MIN_VALUE) != 0) {
            str27 = str74;
            str26 = accountDetailsEntity.intermediaryBic;
            str29 = str62;
            str30 = str63;
            str31 = str64;
            str32 = str65;
            str33 = str66;
            str34 = str67;
            tedDto2 = tedDto3;
            pixDto2 = pixDto3;
            str35 = str68;
            str36 = str69;
            str37 = str70;
            str38 = str71;
            str39 = str72;
            str40 = str73;
            str41 = str60;
            str42 = str51;
            str43 = str52;
            str44 = str53;
            str45 = str54;
            str46 = str55;
            str47 = str56;
            bVar2 = bVar3;
            str48 = str57;
            bool5 = bool9;
            bool6 = bool10;
            bool7 = bool11;
            bool8 = bool12;
            str49 = str58;
            str28 = str61;
        } else {
            str26 = str25;
            str27 = str74;
            str28 = str61;
            str29 = str62;
            str30 = str63;
            str31 = str64;
            str32 = str65;
            str33 = str66;
            str34 = str67;
            tedDto2 = tedDto3;
            pixDto2 = pixDto3;
            str35 = str68;
            str36 = str69;
            str37 = str70;
            str38 = str71;
            str39 = str72;
            str40 = str73;
            str41 = str60;
            str42 = str51;
            str43 = str52;
            str44 = str53;
            str45 = str54;
            str46 = str55;
            str47 = str56;
            bVar2 = bVar3;
            str48 = str57;
            bool5 = bool9;
            bool6 = bool10;
            bool7 = bool11;
            bool8 = bool12;
            str49 = str58;
        }
        return accountDetailsEntity.copy(str59, str42, str43, str44, str45, str46, str47, bVar2, str48, bool5, bool6, bool7, bool8, str49, str41, str28, str29, str30, str31, str32, str33, str34, tedDto2, pixDto2, str35, str36, str37, str38, str39, str40, str27, str26);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getPersonal() {
        return this.personal;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getLocal() {
        return this.local;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getActivate() {
        return this.activate;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getKycRequired() {
        return this.kycRequired;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getRequiredReference() {
        return this.requiredReference;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getTransferTime() {
        return this.transferTime;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getAchRoutingNumber() {
        return this.achRoutingNumber;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getBsb() {
        return this.bsb;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getBankCode() {
        return this.bankCode;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getTransitNumber() {
        return this.transitNumber;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSortCode() {
        return this.sortCode;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getInstitutionNumber() {
        return this.institutionNumber;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getPocketType() {
        return this.pocketType;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getFedwireRoutingNumber() {
        return this.fedwireRoutingNumber;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final TedDto getTed() {
        return this.ted;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final PixDto getPix() {
        return this.pix;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getBankNameCode() {
        return this.bankNameCode;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getBranchName() {
        return this.branchName;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getBranchCode() {
        return this.branchCode;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getAccountType() {
        return this.accountType;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getAccountTypeCode() {
        return this.accountTypeCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getBranchNameLatin() {
        return this.branchNameLatin;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getBankNameAndAddress() {
        return this.bankNameAndAddress;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getIntermediaryBic() {
        return this.intermediaryBic;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBankName() {
        return this.bankName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBic() {
        return this.bic;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getIban() {
        return this.iban;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final no3.b getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getBeneficiaryName() {
        return this.beneficiaryName;
    }

    @NotNull
    public final AccountDetailsEntity copy(@NotNull String id10, String sortCode, String accountNumber, String bankName, String bic2, @NotNull String currency, String iban, no3.b address, String beneficiaryName, Boolean personal, Boolean local, Boolean activate, Boolean kycRequired, String requiredReference, String transferTime, String achRoutingNumber, String bsb2, String bankCode, String transitNumber, String institutionNumber, String pocketType, String fedwireRoutingNumber, TedDto ted2, PixDto pix, String bankNameCode, String branchName, String branchCode, String accountType, String accountTypeCode, String branchNameLatin, String bankNameAndAddress, String intermediaryBic) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new AccountDetailsEntity(id10, sortCode, accountNumber, bankName, bic2, currency, iban, address, beneficiaryName, personal, local, activate, kycRequired, requiredReference, transferTime, achRoutingNumber, bsb2, bankCode, transitNumber, institutionNumber, pocketType, fedwireRoutingNumber, ted2, pix, bankNameCode, branchName, branchCode, accountType, accountTypeCode, branchNameLatin, bankNameAndAddress, intermediaryBic);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountDetailsEntity)) {
            return false;
        }
        AccountDetailsEntity accountDetailsEntity = (AccountDetailsEntity) other;
        return Intrinsics.f(this.id, accountDetailsEntity.id) && Intrinsics.f(this.sortCode, accountDetailsEntity.sortCode) && Intrinsics.f(this.accountNumber, accountDetailsEntity.accountNumber) && Intrinsics.f(this.bankName, accountDetailsEntity.bankName) && Intrinsics.f(this.bic, accountDetailsEntity.bic) && Intrinsics.f(this.currency, accountDetailsEntity.currency) && Intrinsics.f(this.iban, accountDetailsEntity.iban) && Intrinsics.f(this.address, accountDetailsEntity.address) && Intrinsics.f(this.beneficiaryName, accountDetailsEntity.beneficiaryName) && Intrinsics.f(this.personal, accountDetailsEntity.personal) && Intrinsics.f(this.local, accountDetailsEntity.local) && Intrinsics.f(this.activate, accountDetailsEntity.activate) && Intrinsics.f(this.kycRequired, accountDetailsEntity.kycRequired) && Intrinsics.f(this.requiredReference, accountDetailsEntity.requiredReference) && Intrinsics.f(this.transferTime, accountDetailsEntity.transferTime) && Intrinsics.f(this.achRoutingNumber, accountDetailsEntity.achRoutingNumber) && Intrinsics.f(this.bsb, accountDetailsEntity.bsb) && Intrinsics.f(this.bankCode, accountDetailsEntity.bankCode) && Intrinsics.f(this.transitNumber, accountDetailsEntity.transitNumber) && Intrinsics.f(this.institutionNumber, accountDetailsEntity.institutionNumber) && Intrinsics.f(this.pocketType, accountDetailsEntity.pocketType) && Intrinsics.f(this.fedwireRoutingNumber, accountDetailsEntity.fedwireRoutingNumber) && Intrinsics.f(this.ted, accountDetailsEntity.ted) && Intrinsics.f(this.pix, accountDetailsEntity.pix) && Intrinsics.f(this.bankNameCode, accountDetailsEntity.bankNameCode) && Intrinsics.f(this.branchName, accountDetailsEntity.branchName) && Intrinsics.f(this.branchCode, accountDetailsEntity.branchCode) && Intrinsics.f(this.accountType, accountDetailsEntity.accountType) && Intrinsics.f(this.accountTypeCode, accountDetailsEntity.accountTypeCode) && Intrinsics.f(this.branchNameLatin, accountDetailsEntity.branchNameLatin) && Intrinsics.f(this.bankNameAndAddress, accountDetailsEntity.bankNameAndAddress) && Intrinsics.f(this.intermediaryBic, accountDetailsEntity.intermediaryBic);
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getAccountType() {
        return this.accountType;
    }

    public final String getAccountTypeCode() {
        return this.accountTypeCode;
    }

    public final String getAchRoutingNumber() {
        return this.achRoutingNumber;
    }

    public final Boolean getActivate() {
        return this.activate;
    }

    public final no3.b getAddress() {
        return this.address;
    }

    public final String getBankCode() {
        return this.bankCode;
    }

    public final String getBankName() {
        return this.bankName;
    }

    public final String getBankNameAndAddress() {
        return this.bankNameAndAddress;
    }

    public final String getBankNameCode() {
        return this.bankNameCode;
    }

    public final String getBeneficiaryName() {
        return this.beneficiaryName;
    }

    public final String getBic() {
        return this.bic;
    }

    public final String getBranchCode() {
        return this.branchCode;
    }

    public final String getBranchName() {
        return this.branchName;
    }

    public final String getBranchNameLatin() {
        return this.branchNameLatin;
    }

    public final String getBsb() {
        return this.bsb;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    public final String getFedwireRoutingNumber() {
        return this.fedwireRoutingNumber;
    }

    public final String getIban() {
        return this.iban;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final String getInstitutionNumber() {
        return this.institutionNumber;
    }

    public final String getIntermediaryBic() {
        return this.intermediaryBic;
    }

    public final Boolean getKycRequired() {
        return this.kycRequired;
    }

    public final Boolean getLocal() {
        return this.local;
    }

    public final Boolean getPersonal() {
        return this.personal;
    }

    public final PixDto getPix() {
        return this.pix;
    }

    public final String getPocketType() {
        return this.pocketType;
    }

    public final String getRequiredReference() {
        return this.requiredReference;
    }

    public final String getSortCode() {
        return this.sortCode;
    }

    public final TedDto getTed() {
        return this.ted;
    }

    public final String getTransferTime() {
        return this.transferTime;
    }

    public final String getTransitNumber() {
        return this.transitNumber;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.sortCode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.accountNumber;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bankName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bic;
        int iC = a.c((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.currency);
        String str5 = this.iban;
        int iHashCode5 = (iC + (str5 == null ? 0 : str5.hashCode())) * 31;
        no3.b bVar = this.address;
        int iHashCode6 = (iHashCode5 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str6 = this.beneficiaryName;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.personal;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.local;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.activate;
        int iHashCode10 = (iHashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.kycRequired;
        int iHashCode11 = (iHashCode10 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str7 = this.requiredReference;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.transferTime;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.achRoutingNumber;
        int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.bsb;
        int iHashCode15 = (iHashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.bankCode;
        int iHashCode16 = (iHashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.transitNumber;
        int iHashCode17 = (iHashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.institutionNumber;
        int iHashCode18 = (iHashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.pocketType;
        int iHashCode19 = (iHashCode18 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.fedwireRoutingNumber;
        int iHashCode20 = (iHashCode19 + (str15 == null ? 0 : str15.hashCode())) * 31;
        TedDto tedDto = this.ted;
        int iHashCode21 = (iHashCode20 + (tedDto == null ? 0 : tedDto.hashCode())) * 31;
        PixDto pixDto = this.pix;
        int iHashCode22 = (iHashCode21 + (pixDto == null ? 0 : pixDto.hashCode())) * 31;
        String str16 = this.bankNameCode;
        int iHashCode23 = (iHashCode22 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.branchName;
        int iHashCode24 = (iHashCode23 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.branchCode;
        int iHashCode25 = (iHashCode24 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.accountType;
        int iHashCode26 = (iHashCode25 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.accountTypeCode;
        int iHashCode27 = (iHashCode26 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.branchNameLatin;
        int iHashCode28 = (iHashCode27 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.bankNameAndAddress;
        int iHashCode29 = (iHashCode28 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.intermediaryBic;
        return iHashCode29 + (str23 != null ? str23.hashCode() : 0);
    }
}
