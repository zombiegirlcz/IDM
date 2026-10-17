package xhf;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import xhf.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002\u0005\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u0014R\u001c\u0010 \u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014R\u001c\u0010$\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010&\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0012\u001a\u0004\b\u001f\u0010\u0014R\u001c\u0010(\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0012\u001a\u0004\b'\u0010\u0014R\u001c\u0010*\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0012\u001a\u0004\b%\u0010\u0014R\u001c\u0010,\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0012\u001a\u0004\b#\u0010\u0014R\u001c\u0010.\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u0012\u001a\u0004\b)\u0010\u0014R\u001c\u00100\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u0012\u001a\u0004\b-\u0010\u0014R\u001c\u00102\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b1\u0010\u0014R\u001c\u00103\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b!\u0010\u0014R\u001c\u00104\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b+\u0010\u0014R\u001c\u00105\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u00106\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u00107\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010<\u001a\u0004\u0018\u0001088\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010;R\u001c\u0010=\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010\u0006\u001a\u0004\b/\u0010\u0004¨\u0006?"}, d2 = {"Lxhf/i0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "x", "repaymentType", "b", "w", "repaymentMode", "c", "e", "loanName", "d", "loanId", "", "Ljava/lang/Long;", "t", "()Ljava/lang/Long;", "regularLoanAmount", "f", "s", "regularInterestAmount", "g", "r", "regularFeeAmount", "h", "u", "regularPrincipalAmount", "i", "outstandingLoanAmount", "j", "outstandingInterestAmount", "k", "outstandingFeeAmount", "l", "outstandingPrincipalAmount", "m", "overdueLoanAmount", "n", "overdueInterestAmount", "o", "overdueFeeAmount", "p", "overduePrincipalAmount", "q", "penaltyAmount", "v", "regularRescheduledPrincipalAmount", "outstandingRescheduledPrincipalAmount", "overdueRescheduledPrincipalAmount", "bankIdentifier", "accountNumber", "debtorName", "Lxhf/j0;", "Lxhf/j0;", "y", "()Lxhf/j0;", "stampDuty", "product", "Companion", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class i0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("repaymentType")
    private final String repaymentType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("repaymentMode")
    private final String repaymentMode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("loanName")
    private final String loanName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("loanId")
    private final String loanId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("regularLoanAmount")
    private final Long regularLoanAmount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("regularInterestAmount")
    private final Long regularInterestAmount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("regularFeeAmount")
    private final Long regularFeeAmount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("regularPrincipalAmount")
    private final Long regularPrincipalAmount;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("outstandingLoanAmount")
    private final Long outstandingLoanAmount;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("outstandingInterestAmount")
    private final Long outstandingInterestAmount;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("outstandingFeeAmount")
    private final Long outstandingFeeAmount;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("outstandingPrincipalAmount")
    private final Long outstandingPrincipalAmount;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("overdueLoanAmount")
    private final Long overdueLoanAmount;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("overdueInterestAmount")
    private final Long overdueInterestAmount;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("overdueFeeAmount")
    private final Long overdueFeeAmount;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("overduePrincipalAmount")
    private final Long overduePrincipalAmount;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("penaltyAmount")
    private final Long penaltyAmount;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("regularRescheduledPrincipalAmount")
    private final Long regularRescheduledPrincipalAmount;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("outstandingRescheduledPrincipalAmount")
    private final Long outstandingRescheduledPrincipalAmount;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("overdueRescheduledPrincipalAmount")
    private final Long overdueRescheduledPrincipalAmount;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("bankIdentifier")
    private final String bankIdentifier;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("accountNumber")
    private final String accountNumber;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("debtorName")
    private final String debtorName;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @lg.b("stampDuty")
    private final j0 stampDuty;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @lg.b("product")
    private final String product;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f306041a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f306041a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transactions.dto.LoanRepaymentDetailsDto", aVar, 25);
            pluginGeneratedSerialDescriptor.j("repaymentType", false);
            pluginGeneratedSerialDescriptor.j("repaymentMode", false);
            pluginGeneratedSerialDescriptor.j("loanName", false);
            pluginGeneratedSerialDescriptor.j("loanId", false);
            pluginGeneratedSerialDescriptor.j("regularLoanAmount", false);
            pluginGeneratedSerialDescriptor.j("regularInterestAmount", false);
            pluginGeneratedSerialDescriptor.j("regularFeeAmount", false);
            pluginGeneratedSerialDescriptor.j("regularPrincipalAmount", false);
            pluginGeneratedSerialDescriptor.j("outstandingLoanAmount", false);
            pluginGeneratedSerialDescriptor.j("outstandingInterestAmount", false);
            pluginGeneratedSerialDescriptor.j("outstandingFeeAmount", false);
            pluginGeneratedSerialDescriptor.j("outstandingPrincipalAmount", false);
            pluginGeneratedSerialDescriptor.j("overdueLoanAmount", false);
            pluginGeneratedSerialDescriptor.j("overdueInterestAmount", false);
            pluginGeneratedSerialDescriptor.j("overdueFeeAmount", false);
            pluginGeneratedSerialDescriptor.j("overduePrincipalAmount", false);
            pluginGeneratedSerialDescriptor.j("penaltyAmount", false);
            pluginGeneratedSerialDescriptor.j("regularRescheduledPrincipalAmount", false);
            pluginGeneratedSerialDescriptor.j("outstandingRescheduledPrincipalAmount", false);
            pluginGeneratedSerialDescriptor.j("overdueRescheduledPrincipalAmount", false);
            pluginGeneratedSerialDescriptor.j("bankIdentifier", false);
            pluginGeneratedSerialDescriptor.j("accountNumber", false);
            pluginGeneratedSerialDescriptor.j("debtorName", false);
            pluginGeneratedSerialDescriptor.j("stampDuty", false);
            pluginGeneratedSerialDescriptor.j("product", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            qlm.v1 v1Var = qlm.v1.f247718a;
            KSerializer kSerializerC = nlm.a.c(v1Var);
            KSerializer kSerializerC2 = nlm.a.c(v1Var);
            KSerializer kSerializerC3 = nlm.a.c(v1Var);
            KSerializer kSerializerC4 = nlm.a.c(v1Var);
            qlm.t0 t0Var = qlm.t0.f247706a;
            return new KSerializer[]{kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, nlm.a.c(t0Var), nlm.a.c(t0Var), nlm.a.c(t0Var), nlm.a.c(t0Var), nlm.a.c(t0Var), nlm.a.c(t0Var), nlm.a.c(t0Var), nlm.a.c(t0Var), nlm.a.c(t0Var), nlm.a.c(t0Var), nlm.a.c(t0Var), nlm.a.c(t0Var), nlm.a.c(t0Var), nlm.a.c(t0Var), nlm.a.c(t0Var), nlm.a.c(t0Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(j0.a.f306056a), nlm.a.c(v1Var)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Long l2;
            int i;
            j0 j0Var;
            Long l3;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            j0 j0Var2 = null;
            Long l4 = null;
            Long l5 = null;
            String str = null;
            Long l22 = null;
            Long l31 = null;
            Long l37 = null;
            Long l39 = null;
            Long l51 = null;
            Long l52 = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            Long l60 = null;
            Long l66 = null;
            Long l69 = null;
            Long l79 = null;
            Long l81 = null;
            Long l82 = null;
            Long l90 = null;
            Long l100 = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                Long l101 = l5;
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        j0Var = j0Var2;
                        z = false;
                        l5 = l101;
                        str5 = str5;
                        j0Var2 = j0Var;
                        break;
                    case 0:
                        l2 = l4;
                        i2 |= 1;
                        str6 = str6;
                        l5 = l101;
                        j0Var2 = j0Var2;
                        str5 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, qlm.v1.f247718a, str5);
                        l4 = l2;
                        break;
                    case 1:
                        l3 = l4;
                        j0Var = j0Var2;
                        str6 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, str6);
                        i2 |= 2;
                        str7 = str7;
                        l5 = l101;
                        l4 = l3;
                        j0Var2 = j0Var;
                        break;
                    case 2:
                        l3 = l4;
                        j0Var = j0Var2;
                        str7 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qlm.v1.f247718a, str7);
                        i2 |= 4;
                        l5 = l101;
                        l4 = l3;
                        j0Var2 = j0Var;
                        break;
                    case 3:
                        l3 = l4;
                        j0Var = j0Var2;
                        str8 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.v1.f247718a, str8);
                        i2 |= 8;
                        l5 = l101;
                        l4 = l3;
                        j0Var2 = j0Var;
                        break;
                    case 4:
                        l3 = l4;
                        j0Var = j0Var2;
                        l60 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, qlm.t0.f247706a, l60);
                        i2 |= 16;
                        l5 = l101;
                        l4 = l3;
                        j0Var2 = j0Var;
                        break;
                    case 5:
                        l3 = l4;
                        j0Var = j0Var2;
                        l66 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, qlm.t0.f247706a, l66);
                        i2 |= 32;
                        l5 = l101;
                        l4 = l3;
                        j0Var2 = j0Var;
                        break;
                    case 6:
                        l3 = l4;
                        j0Var = j0Var2;
                        l69 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, qlm.t0.f247706a, l69);
                        i2 |= 64;
                        l5 = l101;
                        l4 = l3;
                        j0Var2 = j0Var;
                        break;
                    case 7:
                        l3 = l4;
                        j0Var = j0Var2;
                        l79 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, qlm.t0.f247706a, l79);
                        i2 |= 128;
                        l5 = l101;
                        l4 = l3;
                        j0Var2 = j0Var;
                        break;
                    case 8:
                        l3 = l4;
                        j0Var = j0Var2;
                        l81 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, qlm.t0.f247706a, l81);
                        i2 |= 256;
                        l5 = l101;
                        l4 = l3;
                        j0Var2 = j0Var;
                        break;
                    case 9:
                        l3 = l4;
                        j0Var = j0Var2;
                        l82 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, qlm.t0.f247706a, l82);
                        i2 |= 512;
                        l5 = l101;
                        l4 = l3;
                        j0Var2 = j0Var;
                        break;
                    case 10:
                        l3 = l4;
                        j0Var = j0Var2;
                        l90 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, qlm.t0.f247706a, l90);
                        i2 |= 1024;
                        l5 = l101;
                        l4 = l3;
                        j0Var2 = j0Var;
                        break;
                    case 11:
                        l3 = l4;
                        j0Var = j0Var2;
                        l100 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, qlm.t0.f247706a, l100);
                        i2 |= 2048;
                        l5 = l101;
                        l4 = l3;
                        j0Var2 = j0Var;
                        break;
                    case 12:
                        j0Var = j0Var2;
                        l3 = l4;
                        l5 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, qlm.t0.f247706a, l101);
                        i2 |= 4096;
                        l4 = l3;
                        j0Var2 = j0Var;
                        break;
                    case 13:
                        j0Var = j0Var2;
                        l4 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, qlm.t0.f247706a, l4);
                        i2 |= 8192;
                        l5 = l101;
                        j0Var2 = j0Var;
                        break;
                    case 14:
                        l2 = l4;
                        l22 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, qlm.t0.f247706a, l22);
                        i2 |= 16384;
                        l5 = l101;
                        l4 = l2;
                        break;
                    case 15:
                        l2 = l4;
                        l31 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, qlm.t0.f247706a, l31);
                        i = 32768;
                        i2 |= i;
                        l5 = l101;
                        l4 = l2;
                        break;
                    case 16:
                        l2 = l4;
                        l37 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, qlm.t0.f247706a, l37);
                        i = 65536;
                        i2 |= i;
                        l5 = l101;
                        l4 = l2;
                        break;
                    case 17:
                        l2 = l4;
                        l39 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, qlm.t0.f247706a, l39);
                        i = 131072;
                        i2 |= i;
                        l5 = l101;
                        l4 = l2;
                        break;
                    case 18:
                        l2 = l4;
                        l51 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, qlm.t0.f247706a, l51);
                        i = 262144;
                        i2 |= i;
                        l5 = l101;
                        l4 = l2;
                        break;
                    case 19:
                        l2 = l4;
                        l52 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, qlm.t0.f247706a, l52);
                        i = 524288;
                        i2 |= i;
                        l5 = l101;
                        l4 = l2;
                        break;
                    case 20:
                        l2 = l4;
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, qlm.v1.f247718a, str2);
                        i = PKIFailureInfo.badCertTemplate;
                        i2 |= i;
                        l5 = l101;
                        l4 = l2;
                        break;
                    case 21:
                        l2 = l4;
                        str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, qlm.v1.f247718a, str3);
                        i = PKIFailureInfo.badSenderNonce;
                        i2 |= i;
                        l5 = l101;
                        l4 = l2;
                        break;
                    case 22:
                        l2 = l4;
                        str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 22, qlm.v1.f247718a, str4);
                        i = 4194304;
                        i2 |= i;
                        l5 = l101;
                        l4 = l2;
                        break;
                    case 23:
                        l2 = l4;
                        j0Var2 = (j0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 23, j0.a.f306056a, j0Var2);
                        i = 8388608;
                        i2 |= i;
                        l5 = l101;
                        l4 = l2;
                        break;
                    case 24:
                        l2 = l4;
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 24, qlm.v1.f247718a, str);
                        i = 16777216;
                        i2 |= i;
                        l5 = l101;
                        l4 = l2;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            Long l102 = l5;
            j0 j0Var3 = j0Var2;
            String str9 = str5;
            String str10 = str6;
            String str11 = str7;
            dVarBeginStructure.endStructure(serialDescriptor);
            String str12 = str3;
            Long l103 = l100;
            String str13 = str4;
            return new i0(i2, str9, str10, str11, str8, l60, l66, l69, l79, l81, l82, l90, l103, l102, l4, l22, l31, l37, l39, l51, l52, str2, str12, str13, j0Var3, str);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            i0 value = (i0) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            i0.z(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: xhf.i0$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f306041a;
        }
    }

    public /* synthetic */ i0(int i, String str, String str2, String str3, String str4, Long l2, Long l3, Long l4, Long l5, Long l22, Long l31, Long l37, Long l39, Long l51, Long l52, Long l60, Long l66, Long l69, Long l79, Long l81, Long l82, String str5, String str6, String str7, j0 j0Var, String str8) {
        if (33554431 != (i & 33554431)) {
            qlm.j1.f(a.f306041a.getDescriptor(), i, 33554431);
            throw null;
        }
        this.repaymentType = str;
        this.repaymentMode = str2;
        this.loanName = str3;
        this.loanId = str4;
        this.regularLoanAmount = l2;
        this.regularInterestAmount = l3;
        this.regularFeeAmount = l4;
        this.regularPrincipalAmount = l5;
        this.outstandingLoanAmount = l22;
        this.outstandingInterestAmount = l31;
        this.outstandingFeeAmount = l37;
        this.outstandingPrincipalAmount = l39;
        this.overdueLoanAmount = l51;
        this.overdueInterestAmount = l52;
        this.overdueFeeAmount = l60;
        this.overduePrincipalAmount = l66;
        this.penaltyAmount = l69;
        this.regularRescheduledPrincipalAmount = l79;
        this.outstandingRescheduledPrincipalAmount = l81;
        this.overdueRescheduledPrincipalAmount = l82;
        this.bankIdentifier = str5;
        this.accountNumber = str6;
        this.debtorName = str7;
        this.stampDuty = j0Var;
        this.product = str8;
    }

    public static final /* synthetic */ void z(i0 i0Var, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        qlm.v1 v1Var = qlm.v1.f247718a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, v1Var, i0Var.repaymentType);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, v1Var, i0Var.repaymentMode);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, v1Var, i0Var.loanName);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, v1Var, i0Var.loanId);
        qlm.t0 t0Var = qlm.t0.f247706a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, t0Var, i0Var.regularLoanAmount);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, t0Var, i0Var.regularInterestAmount);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, t0Var, i0Var.regularFeeAmount);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, t0Var, i0Var.regularPrincipalAmount);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, t0Var, i0Var.outstandingLoanAmount);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, t0Var, i0Var.outstandingInterestAmount);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, t0Var, i0Var.outstandingFeeAmount);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, t0Var, i0Var.outstandingPrincipalAmount);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, t0Var, i0Var.overdueLoanAmount);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, t0Var, i0Var.overdueInterestAmount);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, t0Var, i0Var.overdueFeeAmount);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, t0Var, i0Var.overduePrincipalAmount);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, t0Var, i0Var.penaltyAmount);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, t0Var, i0Var.regularRescheduledPrincipalAmount);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, t0Var, i0Var.outstandingRescheduledPrincipalAmount);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, t0Var, i0Var.overdueRescheduledPrincipalAmount);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, v1Var, i0Var.bankIdentifier);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, v1Var, i0Var.accountNumber);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, v1Var, i0Var.debtorName);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, j0.a.f306056a, i0Var.stampDuty);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, v1Var, i0Var.product);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBankIdentifier() {
        return this.bankIdentifier;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDebtorName() {
        return this.debtorName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLoanId() {
        return this.loanId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getLoanName() {
        return this.loanName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.repaymentType, i0Var.repaymentType) && Intrinsics.f(this.repaymentMode, i0Var.repaymentMode) && Intrinsics.f(this.loanName, i0Var.loanName) && Intrinsics.f(this.loanId, i0Var.loanId) && Intrinsics.f(this.regularLoanAmount, i0Var.regularLoanAmount) && Intrinsics.f(this.regularInterestAmount, i0Var.regularInterestAmount) && Intrinsics.f(this.regularFeeAmount, i0Var.regularFeeAmount) && Intrinsics.f(this.regularPrincipalAmount, i0Var.regularPrincipalAmount) && Intrinsics.f(this.outstandingLoanAmount, i0Var.outstandingLoanAmount) && Intrinsics.f(this.outstandingInterestAmount, i0Var.outstandingInterestAmount) && Intrinsics.f(this.outstandingFeeAmount, i0Var.outstandingFeeAmount) && Intrinsics.f(this.outstandingPrincipalAmount, i0Var.outstandingPrincipalAmount) && Intrinsics.f(this.overdueLoanAmount, i0Var.overdueLoanAmount) && Intrinsics.f(this.overdueInterestAmount, i0Var.overdueInterestAmount) && Intrinsics.f(this.overdueFeeAmount, i0Var.overdueFeeAmount) && Intrinsics.f(this.overduePrincipalAmount, i0Var.overduePrincipalAmount) && Intrinsics.f(this.penaltyAmount, i0Var.penaltyAmount) && Intrinsics.f(this.regularRescheduledPrincipalAmount, i0Var.regularRescheduledPrincipalAmount) && Intrinsics.f(this.outstandingRescheduledPrincipalAmount, i0Var.outstandingRescheduledPrincipalAmount) && Intrinsics.f(this.overdueRescheduledPrincipalAmount, i0Var.overdueRescheduledPrincipalAmount) && Intrinsics.f(this.bankIdentifier, i0Var.bankIdentifier) && Intrinsics.f(this.accountNumber, i0Var.accountNumber) && Intrinsics.f(this.debtorName, i0Var.debtorName) && Intrinsics.f(this.stampDuty, i0Var.stampDuty) && Intrinsics.f(this.product, i0Var.product);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getOutstandingFeeAmount() {
        return this.outstandingFeeAmount;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Long getOutstandingInterestAmount() {
        return this.outstandingInterestAmount;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Long getOutstandingLoanAmount() {
        return this.outstandingLoanAmount;
    }

    public final int hashCode() {
        String str = this.repaymentType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.repaymentMode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.loanName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.loanId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l2 = this.regularLoanAmount;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.regularInterestAmount;
        int iHashCode6 = (iHashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.regularFeeAmount;
        int iHashCode7 = (iHashCode6 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.regularPrincipalAmount;
        int iHashCode8 = (iHashCode7 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l22 = this.outstandingLoanAmount;
        int iHashCode9 = (iHashCode8 + (l22 == null ? 0 : l22.hashCode())) * 31;
        Long l31 = this.outstandingInterestAmount;
        int iHashCode10 = (iHashCode9 + (l31 == null ? 0 : l31.hashCode())) * 31;
        Long l37 = this.outstandingFeeAmount;
        int iHashCode11 = (iHashCode10 + (l37 == null ? 0 : l37.hashCode())) * 31;
        Long l39 = this.outstandingPrincipalAmount;
        int iHashCode12 = (iHashCode11 + (l39 == null ? 0 : l39.hashCode())) * 31;
        Long l51 = this.overdueLoanAmount;
        int iHashCode13 = (iHashCode12 + (l51 == null ? 0 : l51.hashCode())) * 31;
        Long l52 = this.overdueInterestAmount;
        int iHashCode14 = (iHashCode13 + (l52 == null ? 0 : l52.hashCode())) * 31;
        Long l60 = this.overdueFeeAmount;
        int iHashCode15 = (iHashCode14 + (l60 == null ? 0 : l60.hashCode())) * 31;
        Long l66 = this.overduePrincipalAmount;
        int iHashCode16 = (iHashCode15 + (l66 == null ? 0 : l66.hashCode())) * 31;
        Long l69 = this.penaltyAmount;
        int iHashCode17 = (iHashCode16 + (l69 == null ? 0 : l69.hashCode())) * 31;
        Long l79 = this.regularRescheduledPrincipalAmount;
        int iHashCode18 = (iHashCode17 + (l79 == null ? 0 : l79.hashCode())) * 31;
        Long l81 = this.outstandingRescheduledPrincipalAmount;
        int iHashCode19 = (iHashCode18 + (l81 == null ? 0 : l81.hashCode())) * 31;
        Long l82 = this.overdueRescheduledPrincipalAmount;
        int iHashCode20 = (iHashCode19 + (l82 == null ? 0 : l82.hashCode())) * 31;
        String str5 = this.bankIdentifier;
        int iHashCode21 = (iHashCode20 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.accountNumber;
        int iHashCode22 = (iHashCode21 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.debtorName;
        int iHashCode23 = (iHashCode22 + (str7 == null ? 0 : str7.hashCode())) * 31;
        j0 j0Var = this.stampDuty;
        int iHashCode24 = (iHashCode23 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        String str8 = this.product;
        return iHashCode24 + (str8 != null ? str8.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Long getOutstandingPrincipalAmount() {
        return this.outstandingPrincipalAmount;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Long getOutstandingRescheduledPrincipalAmount() {
        return this.outstandingRescheduledPrincipalAmount;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Long getOverdueFeeAmount() {
        return this.overdueFeeAmount;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final Long getOverdueInterestAmount() {
        return this.overdueInterestAmount;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Long getOverdueLoanAmount() {
        return this.overdueLoanAmount;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Long getOverduePrincipalAmount() {
        return this.overduePrincipalAmount;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Long getOverdueRescheduledPrincipalAmount() {
        return this.overdueRescheduledPrincipalAmount;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final Long getPenaltyAmount() {
        return this.penaltyAmount;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getProduct() {
        return this.product;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Long getRegularFeeAmount() {
        return this.regularFeeAmount;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final Long getRegularInterestAmount() {
        return this.regularInterestAmount;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Long getRegularLoanAmount() {
        return this.regularLoanAmount;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final Long getRegularPrincipalAmount() {
        return this.regularPrincipalAmount;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final Long getRegularRescheduledPrincipalAmount() {
        return this.regularRescheduledPrincipalAmount;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final String getRepaymentMode() {
        return this.repaymentMode;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final String getRepaymentType() {
        return this.repaymentType;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final j0 getStampDuty() {
        return this.stampDuty;
    }
}
