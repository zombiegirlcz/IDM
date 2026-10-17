package o9l;

import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhf.h0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010 \u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\u0004R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b%\u0010\u0004R\u001c\u0010)\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\u0004R\u001c\u0010,\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0006\u001a\u0004\b+\u0010\u0004R\u001c\u0010/\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\b.\u0010\u0004R\u001c\u00102\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\u0006\u001a\u0004\b1\u0010\u0004R\u001c\u00108\u001a\u0004\u0018\u0001038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001c\u0010=\u001a\u0004\u0018\u0001098\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010:\u001a\u0004\b;\u0010<R\u001c\u0010@\u001a\u0004\u0018\u0001098\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010:\u001a\u0004\b?\u0010<R\u001c\u0010B\u001a\u0004\u0018\u0001098\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010:\u001a\u0004\bA\u0010<R\u001c\u0010C\u001a\u0004\u0018\u0001098\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010:\u001a\u0004\b\u000f\u0010<R\u001a\u0010E\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010\u0006\u001a\u0004\b-\u0010\u0004R\u001c\u0010H\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010\u0006\u001a\u0004\bG\u0010\u0004R\u001c\u0010J\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010\u001d\u001a\u0004\b\u0005\u0010\u001fR\u001c\u0010L\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010\u0006\u001a\u0004\bK\u0010\u0004R\u001c\u0010O\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010\u0006\u001a\u0004\bN\u0010\u0004R\u001c\u0010Q\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010\u0006\u001a\u0004\b4\u0010\u0004R\u001c\u0010V\u001a\u0004\u0018\u00010R8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010S\u001a\u0004\bT\u0010UR\u001c\u0010Z\u001a\u0004\u0018\u00010W8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010X\u001a\u0004\bF\u0010YR\u001c\u0010_\u001a\u0004\u0018\u00010[8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b\n\u0010^R\u001c\u0010b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b`\u0010\u0006\u001a\u0004\ba\u0010\u0004R\u001c\u0010e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bc\u0010\u0006\u001a\u0004\bd\u0010\u0004R\u001c\u0010g\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bf\u0010\u0006\u001a\u0004\bP\u0010\u0004R\u001c\u0010l\u001a\u0004\u0018\u00010h8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\b$\u0010kR\"\u0010q\u001a\n\u0012\u0004\u0012\u00020n\u0018\u00010m8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010o\u001a\u0004\bc\u0010pR\u001c\u0010r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\bf\u0010\u0004R\u001c\u0010t\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bs\u0010\u001d\u001a\u0004\bI\u0010\u001fR\u001c\u0010y\u001a\u0004\u0018\u00010u8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\b\\\u0010xR\u001c\u0010z\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b*\u0010\u0004R\u001c\u0010\u007f\u001a\u0004\u0018\u00010{8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b|\u0010~R\u001f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010\u0006\u001a\u0005\b\u0081\u0001\u0010\u0004R(\u0010\u0088\u0001\u001a\f\u0012\u0005\u0012\u00030\u0084\u0001\u0018\u00010\u0083\u00018\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b\u0013\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R!\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u0089\u00018\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\ba\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001d\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010\u0006\u001a\u0004\b`\u0010\u0004R\u001e\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0005\b\u0086\u0001\u0010\u0006\u001a\u0004\bs\u0010\u0004R\u001e\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0005\b\u0090\u0001\u0010\u0006\u001a\u0004\bv\u0010\u0004R!\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0092\u00018\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b+\u0010\u0093\u0001\u001a\u0006\b\u0080\u0001\u0010\u0094\u0001R \u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0096\u00018\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bd\u0010\u0097\u0001\u001a\u0005\b!\u0010\u0098\u0001R!\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u009a\u00018\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\b\u0081\u0001\u0010\u009b\u0001\u001a\u0005\b\u001c\u0010\u009c\u0001R \u0010¡\u0001\u001a\u0005\u0018\u00010\u009e\u00018\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bG\u0010\u009f\u0001\u001a\u0005\b>\u0010 \u0001R&\u0010¢\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0083\u00018\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0018\u0010\u0085\u0001\u001a\u0005\b\u0016\u0010\u0087\u0001R \u0010¦\u0001\u001a\u0005\u0018\u00010£\u00018\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\"\u0010¤\u0001\u001a\u0005\bM\u0010¥\u0001R \u0010ª\u0001\u001a\u0005\u0018\u00010§\u00018\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\f\u0010¨\u0001\u001a\u0005\bD\u0010©\u0001R \u0010®\u0001\u001a\u0005\u0018\u00010«\u00018\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bK\u0010¬\u0001\u001a\u0005\bi\u0010\u00ad\u0001R \u0010²\u0001\u001a\u0005\u0018\u00010¯\u00018\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bT\u0010°\u0001\u001a\u0005\b\u0012\u0010±\u0001R\u001e\u0010³\u0001\u001a\u0004\u0018\u0001098\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u0010\u0010:\u001a\u0005\b\u0090\u0001\u0010<R\u001e\u0010´\u0001\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0005\b\u008b\u0001\u0010\u0006\u001a\u0004\b0\u0010\u0004R\u001d\u0010µ\u0001\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b'\u0010\u0004¨\u0006¶\u0001"}, d2 = {"Lo9l/r;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "y", "id", "Lo9l/v;", "b", "Lo9l/v;", "W", "()Lo9l/v;", "state", "c", "Z", "type", "d", "L", "receiver", "Lo9l/x;", "e", "Lo9l/x;", "U", "()Lo9l/x;", "speed", "", "f", "Ljava/lang/Long;", "b0", "()Ljava/lang/Long;", "updatedDate", "g", "V", "startDate", "h", "F", "nextDate", "i", "n", "dueDate", "j", "Q", "scheduledDate", "k", "p", "endDate", "l", "I", "period", "Lo9l/t;", "m", "Lo9l/t;", "u", "()Lo9l/t;", "frequency", "", "Ljava/lang/Boolean;", "N", "()Ljava/lang/Boolean;", "recurring", "o", "q", "estimated", "x", "hasEditableAmount", "autoExchangeEnabled", "r", "currency", "s", "T", "sourceCurrency", "t", "amount", "X", "title", "v", "E", "name", "w", "description", "Libl/d;", "Libl/d;", "Y", "()Libl/d;", "transferReason", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "fee", "Lo9l/p;", "z", "Lo9l/p;", "()Lo9l/p;", "attributes", "A", "M", "receiverInfo", "B", "R", "senderInfo", "C", "gif", "Lo9l/q;", "D", "Lo9l/q;", "()Lo9l/q;", "billMoneyBox", "", "Lo9l/w;", "Ljava/util/Set;", "()Ljava/util/Set;", "linkedTransactions", "logoUrl", "G", "feeAmount", "Lo9l/o;", "H", "Lo9l/o;", "()Lo9l/o;", "initiatedByExtra", "chargeBearer", "Lo9l/u;", "J", "Lo9l/u;", "()Lo9l/u;", "planInfo", "K", "S", "side", "", "Lyhf/h0;", "Ljava/util/List;", "O", "()Ljava/util/List;", "referenceFields", "Lo9l/z;", "Lo9l/z;", "a0", "()Lo9l/z;", "ultimateDebtor", "initiationMethod", "paymentMethod", "P", "paymentScheme", "Lo9l/l;", "Lo9l/l;", "()Lo9l/l;", "pocketInfo", "Lo9l/c;", "Lo9l/c;", "()Lo9l/c;", "billDetails", "Lo9l/n;", "Lo9l/n;", "()Lo9l/n;", "bill", "Lo9l/s;", "Lo9l/s;", "()Lo9l/s;", "endCriteria", "availableActions", "Lo9l/h;", "Lo9l/h;", "()Lo9l/h;", "fundsSource", "Lo9l/g;", "Lo9l/g;", "()Lo9l/g;", "excessBalance", "Lo9l/i;", "Lo9l/i;", "()Lo9l/i;", "lowBalance", "Lo9l/a;", "Lo9l/a;", "()Lo9l/a;", "automationLimit", "requestFrequencyConfirmation", "deactivatedDate", "blockExpiryDate", "feature_shared_recurring_payments_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class r {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @lg.b("receiverInfo")
    private final String receiverInfo;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @lg.b("senderInfo")
    private final String senderInfo;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @lg.b("gif")
    private final String gif;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @lg.b("billMoneyBox")
    private final q billMoneyBox;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @lg.b("transactions")
    private final Set<w> linkedTransactions;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @lg.b("logoURL")
    private final String logoUrl;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @lg.b("feeAmount")
    private final Long feeAmount;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @lg.b("initiatedBy")
    private final o initiatedByExtra;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @lg.b("chargeBearer")
    private final String chargeBearer;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @lg.b("planInfo")
    private final u planInfo;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @lg.b("side")
    private final String side;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @lg.b("referenceFields")
    private final List<h0> referenceFields;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @lg.b("ultimateDebtor")
    private final z ultimateDebtor;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @lg.b("initiationMethod")
    private final String initiationMethod;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @lg.b("paymentMethod")
    private final String paymentMethod;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @lg.b("paymentScheme")
    private final String paymentScheme;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @lg.b("pocket")
    private final l pocketInfo;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @lg.b("typeDetails")
    private final c billDetails;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @lg.b("bill")
    private final n bill;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @lg.b("endCriteria")
    private final s endCriteria;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @lg.b("availableActions")
    private final List<String> availableActions;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    @lg.b("fundsSource")
    private final h fundsSource;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    @lg.b("excessBalance")
    private final g excessBalance;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @lg.b("lowBalance")
    private final i lowBalance;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    @lg.b("limit")
    private final a automationLimit;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    @lg.b("requestFrequencyConfirmation")
    private final Boolean requestFrequencyConfirmation;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata */
    @lg.b("deactivatedDate")
    private final String deactivatedDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final v state;

    /* JADX INFO: renamed from: b0, reason: collision with root package name and from kotlin metadata */
    @lg.b("blockExpiryDate")
    private final String blockExpiryDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("receiver")
    private final String receiver;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("speed")
    private final x speed;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("updatedDate")
    private final Long updatedDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("startDate")
    private final String startDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("nextDate")
    private final String nextDate;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("dueDate")
    private final String dueDate;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("scheduledDate")
    private final String scheduledDate;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("endDate")
    private final String endDate;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("period")
    private final String period;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("frequency")
    private final t frequency;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("recurring")
    private final Boolean recurring;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("estimated")
    private final Boolean estimated;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("editableAmount")
    private final Boolean hasEditableAmount;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("autoExchangeEnabled")
    private final Boolean autoExchangeEnabled;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("sourceCurrency")
    private final String sourceCurrency;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    private final Long amount;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("title")
    private final String title;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("name")
    private final String name;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @lg.b("reason")
    private final ibl.d transferReason;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @lg.b("fee")
    private final jo3.a fee;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @lg.b("attributes")
    private final p attributes;

    /* JADX INFO: renamed from: A, reason: from getter */
    public final String getInitiationMethod() {
        return this.initiationMethod;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final Set getLinkedTransactions() {
        return this.linkedTransactions;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final i getLowBalance() {
        return this.lowBalance;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final String getNextDate() {
        return this.nextDate;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final String getPaymentScheme() {
        return this.paymentScheme;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final String getPeriod() {
        return this.period;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final u getPlanInfo() {
        return this.planInfo;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final l getPocketInfo() {
        return this.pocketInfo;
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final String getReceiver() {
        return this.receiver;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final String getReceiverInfo() {
        return this.receiverInfo;
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    public final Boolean getRecurring() {
        return this.recurring;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final List getReferenceFields() {
        return this.referenceFields;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final Boolean getRequestFrequencyConfirmation() {
        return this.requestFrequencyConfirmation;
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final String getScheduledDate() {
        return this.scheduledDate;
    }

    /* JADX INFO: renamed from: R, reason: from getter */
    public final String getSenderInfo() {
        return this.senderInfo;
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final String getSourceCurrency() {
        return this.sourceCurrency;
    }

    /* JADX INFO: renamed from: U, reason: from getter */
    public final x getSpeed() {
        return this.speed;
    }

    /* JADX INFO: renamed from: V, reason: from getter */
    public final String getStartDate() {
        return this.startDate;
    }

    /* JADX INFO: renamed from: W, reason: from getter */
    public final v getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: X, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: Y, reason: from getter */
    public final ibl.d getTransferReason() {
        return this.transferReason;
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: a0, reason: from getter */
    public final z getUltimateDebtor() {
        return this.ultimateDebtor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final p getAttributes() {
        return this.attributes;
    }

    /* JADX INFO: renamed from: b0, reason: from getter */
    public final Long getUpdatedDate() {
        return this.updatedDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getAutoExchangeEnabled() {
        return this.autoExchangeEnabled;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final a getAutomationLimit() {
        return this.automationLimit;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getAvailableActions() {
        return this.availableActions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.id, rVar.id) && this.state == rVar.state && Intrinsics.f(this.type, rVar.type) && Intrinsics.f(this.receiver, rVar.receiver) && this.speed == rVar.speed && Intrinsics.f(this.updatedDate, rVar.updatedDate) && Intrinsics.f(this.startDate, rVar.startDate) && Intrinsics.f(this.nextDate, rVar.nextDate) && Intrinsics.f(this.dueDate, rVar.dueDate) && Intrinsics.f(this.scheduledDate, rVar.scheduledDate) && Intrinsics.f(this.endDate, rVar.endDate) && Intrinsics.f(this.period, rVar.period) && this.frequency == rVar.frequency && Intrinsics.f(this.recurring, rVar.recurring) && Intrinsics.f(this.estimated, rVar.estimated) && Intrinsics.f(this.hasEditableAmount, rVar.hasEditableAmount) && Intrinsics.f(this.autoExchangeEnabled, rVar.autoExchangeEnabled) && Intrinsics.f(this.currency, rVar.currency) && Intrinsics.f(this.sourceCurrency, rVar.sourceCurrency) && Intrinsics.f(this.amount, rVar.amount) && Intrinsics.f(this.title, rVar.title) && Intrinsics.f(this.name, rVar.name) && Intrinsics.f(this.description, rVar.description) && Intrinsics.f(this.transferReason, rVar.transferReason) && Intrinsics.f(this.fee, rVar.fee) && Intrinsics.f(this.attributes, rVar.attributes) && Intrinsics.f(this.receiverInfo, rVar.receiverInfo) && Intrinsics.f(this.senderInfo, rVar.senderInfo) && Intrinsics.f(this.gif, rVar.gif) && Intrinsics.f(this.billMoneyBox, rVar.billMoneyBox) && Intrinsics.f(this.linkedTransactions, rVar.linkedTransactions) && Intrinsics.f(this.logoUrl, rVar.logoUrl) && Intrinsics.f(this.feeAmount, rVar.feeAmount) && Intrinsics.f(this.initiatedByExtra, rVar.initiatedByExtra) && Intrinsics.f(this.chargeBearer, rVar.chargeBearer) && Intrinsics.f(this.planInfo, rVar.planInfo) && Intrinsics.f(this.side, rVar.side) && Intrinsics.f(this.referenceFields, rVar.referenceFields) && Intrinsics.f(this.ultimateDebtor, rVar.ultimateDebtor) && Intrinsics.f(this.initiationMethod, rVar.initiationMethod) && Intrinsics.f(this.paymentMethod, rVar.paymentMethod) && Intrinsics.f(this.paymentScheme, rVar.paymentScheme) && Intrinsics.f(this.pocketInfo, rVar.pocketInfo) && Intrinsics.f(this.billDetails, rVar.billDetails) && Intrinsics.f(this.bill, rVar.bill) && Intrinsics.f(this.endCriteria, rVar.endCriteria) && Intrinsics.f(this.availableActions, rVar.availableActions) && Intrinsics.f(this.fundsSource, rVar.fundsSource) && Intrinsics.f(this.excessBalance, rVar.excessBalance) && Intrinsics.f(this.lowBalance, rVar.lowBalance) && Intrinsics.f(this.automationLimit, rVar.automationLimit) && Intrinsics.f(this.requestFrequencyConfirmation, rVar.requestFrequencyConfirmation) && Intrinsics.f(this.deactivatedDate, rVar.deactivatedDate) && Intrinsics.f(this.blockExpiryDate, rVar.blockExpiryDate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final n getBill() {
        return this.bill;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final c getBillDetails() {
        return this.billDetails;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final q getBillMoneyBox() {
        return this.billMoneyBox;
    }

    public final int hashCode() {
        int iC = p.a.c((this.state.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.type);
        String str = this.receiver;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        x xVar = this.speed;
        int iHashCode2 = (iHashCode + (xVar == null ? 0 : xVar.hashCode())) * 31;
        Long l2 = this.updatedDate;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.startDate;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nextDate;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.dueDate;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.scheduledDate;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.endDate;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.period;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        t tVar = this.frequency;
        int iHashCode10 = (iHashCode9 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        Boolean bool = this.recurring;
        int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.estimated;
        int iHashCode12 = (iHashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.hasEditableAmount;
        int iHashCode13 = (iHashCode12 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.autoExchangeEnabled;
        int iC2 = p.a.c((iHashCode13 + (bool4 == null ? 0 : bool4.hashCode())) * 31, 31, this.currency);
        String str8 = this.sourceCurrency;
        int iHashCode14 = (iC2 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Long l3 = this.amount;
        int iHashCode15 = (iHashCode14 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str9 = this.title;
        int iHashCode16 = (iHashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.name;
        int iHashCode17 = (iHashCode16 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.description;
        int iHashCode18 = (iHashCode17 + (str11 == null ? 0 : str11.hashCode())) * 31;
        ibl.d dVar = this.transferReason;
        int iHashCode19 = (iHashCode18 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        jo3.a aVar = this.fee;
        int iHashCode20 = (iHashCode19 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        p pVar = this.attributes;
        int iHashCode21 = (iHashCode20 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        String str12 = this.receiverInfo;
        int iHashCode22 = (iHashCode21 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.senderInfo;
        int iHashCode23 = (iHashCode22 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.gif;
        int iHashCode24 = (iHashCode23 + (str14 == null ? 0 : str14.hashCode())) * 31;
        q qVar = this.billMoneyBox;
        int iHashCode25 = (iHashCode24 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        Set<w> set = this.linkedTransactions;
        int iHashCode26 = (iHashCode25 + (set == null ? 0 : set.hashCode())) * 31;
        String str15 = this.logoUrl;
        int iHashCode27 = (iHashCode26 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Long l4 = this.feeAmount;
        int iHashCode28 = (iHashCode27 + (l4 == null ? 0 : l4.hashCode())) * 31;
        o oVar = this.initiatedByExtra;
        int iHashCode29 = (iHashCode28 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        String str16 = this.chargeBearer;
        int iHashCode30 = (iHashCode29 + (str16 == null ? 0 : str16.hashCode())) * 31;
        u uVar = this.planInfo;
        int iHashCode31 = (iHashCode30 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        String str17 = this.side;
        int iHashCode32 = (iHashCode31 + (str17 == null ? 0 : str17.hashCode())) * 31;
        List<h0> list = this.referenceFields;
        int iHashCode33 = (iHashCode32 + (list == null ? 0 : list.hashCode())) * 31;
        z zVar = this.ultimateDebtor;
        int iHashCode34 = (iHashCode33 + (zVar == null ? 0 : zVar.hashCode())) * 31;
        String str18 = this.initiationMethod;
        int iHashCode35 = (iHashCode34 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.paymentMethod;
        int iHashCode36 = (iHashCode35 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.paymentScheme;
        int iHashCode37 = (iHashCode36 + (str20 == null ? 0 : str20.hashCode())) * 31;
        l lVar = this.pocketInfo;
        int iHashCode38 = (iHashCode37 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        c cVar = this.billDetails;
        int iHashCode39 = (iHashCode38 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        n nVar = this.bill;
        int iHashCode40 = (iHashCode39 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        s sVar = this.endCriteria;
        int iHashCode41 = (iHashCode40 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        List<String> list2 = this.availableActions;
        int iHashCode42 = (iHashCode41 + (list2 == null ? 0 : list2.hashCode())) * 31;
        h hVar = this.fundsSource;
        int iHashCode43 = (iHashCode42 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        g gVar = this.excessBalance;
        int iHashCode44 = (iHashCode43 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        i iVar = this.lowBalance;
        int iHashCode45 = (iHashCode44 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        a aVar2 = this.automationLimit;
        int iHashCode46 = (iHashCode45 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        Boolean bool5 = this.requestFrequencyConfirmation;
        int iHashCode47 = (iHashCode46 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str21 = this.deactivatedDate;
        int iHashCode48 = (iHashCode47 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.blockExpiryDate;
        return iHashCode48 + (str22 != null ? str22.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getBlockExpiryDate() {
        return this.blockExpiryDate;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getChargeBearer() {
        return this.chargeBearer;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getDeactivatedDate() {
        return this.deactivatedDate;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getDueDate() {
        return this.dueDate;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final s getEndCriteria() {
        return this.endCriteria;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Boolean getEstimated() {
        return this.estimated;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final g getExcessBalance() {
        return this.excessBalance;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final jo3.a getFee() {
        return this.fee;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Long getFeeAmount() {
        return this.feeAmount;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final t getFrequency() {
        return this.frequency;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final h getFundsSource() {
        return this.fundsSource;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final String getGif() {
        return this.gif;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final Boolean getHasEditableAmount() {
        return this.hasEditableAmount;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final o getInitiatedByExtra() {
        return this.initiatedByExtra;
    }
}
