package kfj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u001b\u0010\u0004R\u001a\u0010!\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\"\u0010\u0004R\u001a\u0010%\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b$\u0010\u0004R\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0006\u001a\u0004\b'\u0010\u0004R\u001c\u0010-\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010*\u001a\u0004\b+\u0010,R\u001c\u00100\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b/\u0010\u0004R\u001c\u00106\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001c\u00109\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b8\u0010\u0004R\u001c\u0010?\u001a\u0004\u0018\u00010:8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001c\u0010C\u001a\u0004\u0018\u00010@8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010A\u001a\u0004\b\f\u0010BR\"\u0010G\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010\u0017\u001a\u0004\bF\u0010\u0019R\u001c\u0010L\u001a\u0004\u0018\u00010H8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\b\t\u0010KR\u001c\u0010N\u001a\u0004\u0018\u00010@8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010A\u001a\u0004\b;\u0010BR\u001c\u0010Q\u001a\u0004\u0018\u00010@8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010A\u001a\u0004\bP\u0010BR\u001c\u0010V\u001a\u0004\u0018\u00010R8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\b\u0012\u0010UR\u001c\u0010[\u001a\u0004\u0018\u00010W8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010X\u001a\u0004\bY\u0010ZR\u001a\u0010]\u001a\u00020@8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010+\u001a\u0004\b&\u0010\\R\u001c\u0010^\u001a\u0004\u0018\u00010@8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010A\u001a\u0004\b\u0005\u0010BR\u001c\u0010_\u001a\u0004\u0018\u00010@8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010A\u001a\u0004\b7\u0010BR\u001a\u0010a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b`\u0010\u0006\u001a\u0004\b2\u0010\u0004R\u001c\u0010c\u001a\u0004\u0018\u00010@8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bb\u0010A\u001a\u0004\bE\u0010BR\u001a\u0010h\u001a\u00020d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\b\u000f\u0010gR\u001c\u0010i\u001a\u0004\u0018\u00010@8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010A\u001a\u0004\bM\u0010BR\u001a\u0010l\u001a\u00020d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bj\u0010f\u001a\u0004\bk\u0010gR\u001c\u0010n\u001a\u0004\u0018\u00010@8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bm\u0010A\u001a\u0004\bI\u0010BR\u001a\u0010q\u001a\u00020d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bo\u0010f\u001a\u0004\bp\u0010gR\u001c\u0010v\u001a\u0004\u0018\u00010r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010s\u001a\u0004\bt\u0010uR\u001c\u0010z\u001a\u0004\u0018\u00010w8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010x\u001a\u0004\bO\u0010yR\u001c\u0010~\u001a\u0004\u0018\u00010{8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010|\u001a\u0004\b`\u0010}R\u001b\u0010\u0080\u0001\u001a\u00020d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bY\u0010f\u001a\u0004\b\u007f\u0010gR%\u0010\u0083\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0081\u0001\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\r\n\u0004\bF\u0010\u0017\u001a\u0005\b\u0082\u0001\u0010\u0019R$\u0010\u0085\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0084\u0001\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\bS\u0010\u0019R#\u0010\u0086\u0001\u001a\n\u0012\u0004\u0012\u00020:\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\bp\u0010\u0017\u001a\u0004\bm\u0010\u0019R\u001b\u0010\u0087\u0001\u001a\u00020@8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\bb\u0010\\R \u0010\u008b\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u007f\u0010\u0089\u0001\u001a\u0005\b\u0016\u0010\u008a\u0001R$\u0010\u008d\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u008c\u0001\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010\u0017\u001a\u0004\bj\u0010\u0019R!\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u008e\u00018\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\b\u0082\u0001\u0010\u008f\u0001\u001a\u0005\bo\u0010\u0090\u0001R \u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0092\u00018\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bt\u0010\u0093\u0001\u001a\u0005\b.\u0010\u0094\u0001R \u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0096\u00018\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bk\u0010\u0097\u0001\u001a\u0005\be\u0010\u0098\u0001¨\u0006\u009a\u0001"}, d2 = {"Lkfj/q3;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "q", "id", "b", "O", "state", "c", "z", "name", "d", "g", "coverageCode", "e", "j", "coverageType", "", "f", "Ljava/util/List;", "h", "()Ljava/util/List;", "coverageCountries", "i", "coverageName", "Lkfj/x2;", "Lkfj/x2;", "M", "()Lkfj/x2;", "simProfile", "l", "dataPlanId", "y", "mobilePlanType", "k", "x", "mobilePlanSubtype", "Lkfj/k4;", "Lkfj/k4;", "J", "()Lkfj/k4;", "recurring", "m", "w", "minimumPeriod", "Lkfj/x3;", "n", "Lkfj/x3;", "D", "()Lkfj/x3;", "pendingInvoice", "o", "I", "primaryPhoneNumber", "Lkfj/a4;", "p", "Lkfj/a4;", "H", "()Lkfj/a4;", "primaryPhone", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "bandwidthBitsPerSecond", "Lkfj/r4;", "r", "L", "roamingAllowances", "Lkfj/e3;", "s", "Lkfj/e3;", "()Lkfj/e3;", "autoRenewal", "t", "gracePeriodSinceDate", "u", "Q", "suspensionDate", "Lkfj/g3;", "v", "Lkfj/g3;", "()Lkfj/g3;", "cancellation", "Lkfj/q4;", "Lkfj/q4;", "K", "()Lkfj/q4;", "refund", "()J", "createdDate", "activationDate", "expirationDate", "A", "duration", "B", "initialBalanceBytes", "", "C", "Z", "()Z", "bytesUnlimited", "initialVoiceSeconds", "E", "T", "voiceSecondsUnlimited", "F", "initialSmsCount", "G", "N", "smsCountUnlimited", "Lkfj/v4;", "Lkfj/v4;", "S", "()Lkfj/v4;", "usage", "Lkfj/r3;", "Lkfj/r3;", "()Lkfj/r3;", "internationalUsage", "Lkfj/k2;", "Lkfj/k2;", "()Lkfj/k2;", "offer", "P", "statementAvailable", "Lkfj/u4;", "R", "transactions", "Lkfj/s3;", "invoices", "phoneNumbers", "order", "Lkfj/l3;", "Lkfj/l3;", "()Lkfj/l3;", "contextualOrder", "Lkfj/r0;", "perks", "Lkfj/j4;", "Lkfj/j4;", "()Lkfj/j4;", "planChange", "Lkfj/o3;", "Lkfj/o3;", "()Lkfj/o3;", "display", "Lkfj/w3;", "Lkfj/w3;", "()Lkfj/w3;", "payment", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class q3 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @lg.b("duration")
    @NotNull
    private final String duration;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @lg.b("initialBalanceBytes")
    private final Long initialBalanceBytes;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @lg.b("bytesUnlimited")
    private final boolean bytesUnlimited;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @lg.b("initialVoiceSeconds")
    private final Long initialVoiceSeconds;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @lg.b("voiceSecondsUnlimited")
    private final boolean voiceSecondsUnlimited;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @lg.b("initialSmsCount")
    private final Long initialSmsCount;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @lg.b("smsCountUnlimited")
    private final boolean smsCountUnlimited;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @lg.b("usage")
    private final v4 usage;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @lg.b("internationalUsage")
    private final r3 internationalUsage;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @lg.b("offer")
    private final k2 offer;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @lg.b("statementAvailable")
    private final boolean statementAvailable;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @lg.b("transactions")
    private final List<u4> transactions;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @lg.b("invoices")
    private final List<s3> invoices;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @lg.b("phoneNumbers")
    private final List<a4> phoneNumbers;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @lg.b("order")
    private final long order;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @lg.b("contextualOrder")
    private final l3 contextualOrder;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @lg.b("perks")
    private final List<r0> perks;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @lg.b("planChange")
    private final j4 planChange;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @lg.b("display")
    private final o3 display;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @lg.b("payment")
    private final w3 payment;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("coverageCode")
    @NotNull
    private final String coverageCode;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("coverageType")
    @NotNull
    private final String coverageType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("coverageCountries")
    @NotNull
    private final List<String> coverageCountries;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("subscriptionDetailsCoverageName")
    private final String coverageName;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("simProfile")
    @NotNull
    private final x2 simProfile;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("mobilePlanId")
    @NotNull
    private final String dataPlanId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("mobilePlanType")
    @NotNull
    private final String mobilePlanType;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("mobilePlanSubtype")
    private final String mobilePlanSubtype;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("recurring")
    private final k4 recurring;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("minimumPeriod")
    private final String minimumPeriod;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("pendingInvoice")
    private final x3 pendingInvoice;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("primaryPhoneNumber")
    private final String primaryPhoneNumber;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("primaryPhone")
    private final a4 primaryPhone;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("bandwidthBitsPerSecond")
    private final Long bandwidthBitsPerSecond;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("roamingAllowances")
    private final List<r4> roamingAllowances;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("autoRenewal")
    private final e3 autoRenewal;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("gracePeriodSinceDate")
    private final Long gracePeriodSinceDate;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("suspensionDate")
    private final Long suspensionDate;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("cancellation")
    private final g3 cancellation;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("refund")
    private final q4 refund;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdDate")
    private final long createdDate;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @lg.b("activationDate")
    private final Long activationDate;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @lg.b("expirationDate")
    private final Long expirationDate;

    public q3(String id10, String state, String name, String coverageCode, String coverageType, ArrayList coverageCountries, String str, x2 simProfile, String dataPlanId, String mobilePlanType, String str2, k4 k4Var, String str3, x3 x3Var, String str4, a4 a4Var, Long l2, ArrayList arrayList, e3 e3Var, Long l3, Long l4, g3 g3Var, q4 q4Var, long j2, Long l5, Long l22, String duration, Long l31, boolean z, Long l37, boolean z3, Long l39, boolean z4, v4 v4Var, r3 r3Var, k2 k2Var, boolean z6, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, long j3, l3 l3Var, ArrayList arrayList5, j4 j4Var, o3 o3Var, w3 w3Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(coverageCode, "coverageCode");
        Intrinsics.checkNotNullParameter(coverageType, "coverageType");
        Intrinsics.checkNotNullParameter(coverageCountries, "coverageCountries");
        Intrinsics.checkNotNullParameter(simProfile, "simProfile");
        Intrinsics.checkNotNullParameter(dataPlanId, "dataPlanId");
        Intrinsics.checkNotNullParameter(mobilePlanType, "mobilePlanType");
        Intrinsics.checkNotNullParameter(duration, "duration");
        this.id = id10;
        this.state = state;
        this.name = name;
        this.coverageCode = coverageCode;
        this.coverageType = coverageType;
        this.coverageCountries = coverageCountries;
        this.coverageName = str;
        this.simProfile = simProfile;
        this.dataPlanId = dataPlanId;
        this.mobilePlanType = mobilePlanType;
        this.mobilePlanSubtype = str2;
        this.recurring = k4Var;
        this.minimumPeriod = str3;
        this.pendingInvoice = x3Var;
        this.primaryPhoneNumber = str4;
        this.primaryPhone = a4Var;
        this.bandwidthBitsPerSecond = l2;
        this.roamingAllowances = arrayList;
        this.autoRenewal = e3Var;
        this.gracePeriodSinceDate = l3;
        this.suspensionDate = l4;
        this.cancellation = g3Var;
        this.refund = q4Var;
        this.createdDate = j2;
        this.activationDate = l5;
        this.expirationDate = l22;
        this.duration = duration;
        this.initialBalanceBytes = l31;
        this.bytesUnlimited = z;
        this.initialVoiceSeconds = l37;
        this.voiceSecondsUnlimited = z3;
        this.initialSmsCount = l39;
        this.smsCountUnlimited = z4;
        this.usage = v4Var;
        this.internationalUsage = r3Var;
        this.offer = k2Var;
        this.statementAvailable = z6;
        this.transactions = arrayList2;
        this.invoices = arrayList3;
        this.phoneNumbers = arrayList4;
        this.order = j3;
        this.contextualOrder = l3Var;
        this.perks = arrayList5;
        this.planChange = j4Var;
        this.display = o3Var;
        this.payment = w3Var;
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final k2 getOffer() {
        return this.offer;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final long getOrder() {
        return this.order;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final w3 getPayment() {
        return this.payment;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final x3 getPendingInvoice() {
        return this.pendingInvoice;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final List getPerks() {
        return this.perks;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final List getPhoneNumbers() {
        return this.phoneNumbers;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final j4 getPlanChange() {
        return this.planChange;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final a4 getPrimaryPhone() {
        return this.primaryPhone;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final String getPrimaryPhoneNumber() {
        return this.primaryPhoneNumber;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final k4 getRecurring() {
        return this.recurring;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final q4 getRefund() {
        return this.refund;
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final List getRoamingAllowances() {
        return this.roamingAllowances;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final x2 getSimProfile() {
        return this.simProfile;
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    public final boolean getSmsCountUnlimited() {
        return this.smsCountUnlimited;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final boolean getStatementAvailable() {
        return this.statementAvailable;
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final Long getSuspensionDate() {
        return this.suspensionDate;
    }

    /* JADX INFO: renamed from: R, reason: from getter */
    public final List getTransactions() {
        return this.transactions;
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public final v4 getUsage() {
        return this.usage;
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final boolean getVoiceSecondsUnlimited() {
        return this.voiceSecondsUnlimited;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getActivationDate() {
        return this.activationDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final e3 getAutoRenewal() {
        return this.autoRenewal;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getBandwidthBitsPerSecond() {
        return this.bandwidthBitsPerSecond;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getBytesUnlimited() {
        return this.bytesUnlimited;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final g3 getCancellation() {
        return this.cancellation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q3)) {
            return false;
        }
        q3 q3Var = (q3) obj2;
        return Intrinsics.f(this.id, q3Var.id) && Intrinsics.f(this.state, q3Var.state) && Intrinsics.f(this.name, q3Var.name) && Intrinsics.f(this.coverageCode, q3Var.coverageCode) && Intrinsics.f(this.coverageType, q3Var.coverageType) && Intrinsics.f(this.coverageCountries, q3Var.coverageCountries) && Intrinsics.f(this.coverageName, q3Var.coverageName) && Intrinsics.f(this.simProfile, q3Var.simProfile) && Intrinsics.f(this.dataPlanId, q3Var.dataPlanId) && Intrinsics.f(this.mobilePlanType, q3Var.mobilePlanType) && Intrinsics.f(this.mobilePlanSubtype, q3Var.mobilePlanSubtype) && Intrinsics.f(this.recurring, q3Var.recurring) && Intrinsics.f(this.minimumPeriod, q3Var.minimumPeriod) && Intrinsics.f(this.pendingInvoice, q3Var.pendingInvoice) && Intrinsics.f(this.primaryPhoneNumber, q3Var.primaryPhoneNumber) && Intrinsics.f(this.primaryPhone, q3Var.primaryPhone) && Intrinsics.f(this.bandwidthBitsPerSecond, q3Var.bandwidthBitsPerSecond) && Intrinsics.f(this.roamingAllowances, q3Var.roamingAllowances) && Intrinsics.f(this.autoRenewal, q3Var.autoRenewal) && Intrinsics.f(this.gracePeriodSinceDate, q3Var.gracePeriodSinceDate) && Intrinsics.f(this.suspensionDate, q3Var.suspensionDate) && Intrinsics.f(this.cancellation, q3Var.cancellation) && Intrinsics.f(this.refund, q3Var.refund) && this.createdDate == q3Var.createdDate && Intrinsics.f(this.activationDate, q3Var.activationDate) && Intrinsics.f(this.expirationDate, q3Var.expirationDate) && Intrinsics.f(this.duration, q3Var.duration) && Intrinsics.f(this.initialBalanceBytes, q3Var.initialBalanceBytes) && this.bytesUnlimited == q3Var.bytesUnlimited && Intrinsics.f(this.initialVoiceSeconds, q3Var.initialVoiceSeconds) && this.voiceSecondsUnlimited == q3Var.voiceSecondsUnlimited && Intrinsics.f(this.initialSmsCount, q3Var.initialSmsCount) && this.smsCountUnlimited == q3Var.smsCountUnlimited && Intrinsics.f(this.usage, q3Var.usage) && Intrinsics.f(this.internationalUsage, q3Var.internationalUsage) && Intrinsics.f(this.offer, q3Var.offer) && this.statementAvailable == q3Var.statementAvailable && Intrinsics.f(this.transactions, q3Var.transactions) && Intrinsics.f(this.invoices, q3Var.invoices) && Intrinsics.f(this.phoneNumbers, q3Var.phoneNumbers) && this.order == q3Var.order && Intrinsics.f(this.contextualOrder, q3Var.contextualOrder) && Intrinsics.f(this.perks, q3Var.perks) && Intrinsics.f(this.planChange, q3Var.planChange) && Intrinsics.f(this.display, q3Var.display) && Intrinsics.f(this.payment, q3Var.payment);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final l3 getContextualOrder() {
        return this.contextualOrder;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getCoverageCode() {
        return this.coverageCode;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final List getCoverageCountries() {
        return this.coverageCountries;
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(p.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.state), 31, this.name), 31, this.coverageCode), 31, this.coverageType), 31, this.coverageCountries);
        String str = this.coverageName;
        int iC = p.a.c(p.a.c((this.simProfile.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.dataPlanId), 31, this.mobilePlanType);
        String str2 = this.mobilePlanSubtype;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        k4 k4Var = this.recurring;
        int iHashCode2 = (iHashCode + (k4Var == null ? 0 : k4Var.hashCode())) * 31;
        String str3 = this.minimumPeriod;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        x3 x3Var = this.pendingInvoice;
        int iHashCode4 = (iHashCode3 + (x3Var == null ? 0 : x3Var.hashCode())) * 31;
        String str4 = this.primaryPhoneNumber;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        a4 a4Var = this.primaryPhone;
        int iHashCode6 = (iHashCode5 + (a4Var == null ? 0 : a4Var.hashCode())) * 31;
        Long l2 = this.bandwidthBitsPerSecond;
        int iHashCode7 = (iHashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        List<r4> list = this.roamingAllowances;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        e3 e3Var = this.autoRenewal;
        int iHashCode9 = (iHashCode8 + (e3Var == null ? 0 : e3Var.hashCode())) * 31;
        Long l3 = this.gracePeriodSinceDate;
        int iHashCode10 = (iHashCode9 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.suspensionDate;
        int iHashCode11 = (iHashCode10 + (l4 == null ? 0 : l4.hashCode())) * 31;
        g3 g3Var = this.cancellation;
        int iHashCode12 = (iHashCode11 + (g3Var == null ? 0 : g3Var.hashCode())) * 31;
        q4 q4Var = this.refund;
        int iC2 = a0.d.c((iHashCode12 + (q4Var == null ? 0 : q4Var.hashCode())) * 31, 31, this.createdDate);
        Long l5 = this.activationDate;
        int iHashCode13 = (iC2 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l22 = this.expirationDate;
        int iC3 = p.a.c((iHashCode13 + (l22 == null ? 0 : l22.hashCode())) * 31, 31, this.duration);
        Long l31 = this.initialBalanceBytes;
        int iC4 = j6.a.c((iC3 + (l31 == null ? 0 : l31.hashCode())) * 31, 31, this.bytesUnlimited);
        Long l37 = this.initialVoiceSeconds;
        int iC5 = j6.a.c((iC4 + (l37 == null ? 0 : l37.hashCode())) * 31, 31, this.voiceSecondsUnlimited);
        Long l39 = this.initialSmsCount;
        int iC6 = j6.a.c((iC5 + (l39 == null ? 0 : l39.hashCode())) * 31, 31, this.smsCountUnlimited);
        v4 v4Var = this.usage;
        int iHashCode14 = (iC6 + (v4Var == null ? 0 : v4Var.hashCode())) * 31;
        r3 r3Var = this.internationalUsage;
        int iHashCode15 = (iHashCode14 + (r3Var == null ? 0 : r3Var.hashCode())) * 31;
        k2 k2Var = this.offer;
        int iC7 = j6.a.c((iHashCode15 + (k2Var == null ? 0 : k2Var.hashCode())) * 31, 31, this.statementAvailable);
        List<u4> list2 = this.transactions;
        int iHashCode16 = (iC7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<s3> list3 = this.invoices;
        int iHashCode17 = (iHashCode16 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<a4> list4 = this.phoneNumbers;
        int iC8 = a0.d.c((iHashCode17 + (list4 == null ? 0 : list4.hashCode())) * 31, 31, this.order);
        l3 l3Var = this.contextualOrder;
        int iHashCode18 = (iC8 + (l3Var == null ? 0 : l3Var.hashCode())) * 31;
        List<r0> list5 = this.perks;
        int iHashCode19 = (iHashCode18 + (list5 == null ? 0 : list5.hashCode())) * 31;
        j4 j4Var = this.planChange;
        int iHashCode20 = (iHashCode19 + (j4Var == null ? 0 : j4Var.hashCode())) * 31;
        o3 o3Var = this.display;
        int iHashCode21 = (iHashCode20 + (o3Var == null ? 0 : o3Var.hashCode())) * 31;
        w3 w3Var = this.payment;
        return iHashCode21 + (w3Var != null ? w3Var.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getCoverageName() {
        return this.coverageName;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getCoverageType() {
        return this.coverageType;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getCreatedDate() {
        return this.createdDate;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getDataPlanId() {
        return this.dataPlanId;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final o3 getDisplay() {
        return this.display;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Long getExpirationDate() {
        return this.expirationDate;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final Long getGracePeriodSinceDate() {
        return this.gracePeriodSinceDate;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Long getInitialBalanceBytes() {
        return this.initialBalanceBytes;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final Long getInitialSmsCount() {
        return this.initialSmsCount;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Long getInitialVoiceSeconds() {
        return this.initialVoiceSeconds;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final r3 getInternationalUsage() {
        return this.internationalUsage;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final List getInvoices() {
        return this.invoices;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final String getMinimumPeriod() {
        return this.minimumPeriod;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final String getMobilePlanSubtype() {
        return this.mobilePlanSubtype;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final String getMobilePlanType() {
        return this.mobilePlanType;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final String getName() {
        return this.name;
    }
}
