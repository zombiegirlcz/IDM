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
import org.jetbrains.annotations.NotNull;
import xhf.l1;
import xhf.n1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0002\u0005\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0005\u0010\u0015R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001c"}, d2 = {"Lxhf/o1;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "f", "type", "c", "d", "paymentMethod", "Lxhf/n1;", "Lxhf/n1;", "()Lxhf/n1;", "order", "Lxhf/l1;", "e", "Lxhf/l1;", "()Lxhf/l1;", "customer", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "settleOn", "Companion", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class o1 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentMethod")
    @NotNull
    private final String paymentMethod;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("order")
    @NotNull
    private final n1 order;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("customer")
    @NotNull
    private final l1 customer;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("settleOn")
    private final Long settleOn;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f306126a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f306126a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transactions.dto.TransactionMerchantPaymentDto", aVar, 6);
            pluginGeneratedSerialDescriptor.j("id", false);
            pluginGeneratedSerialDescriptor.j("type", false);
            pluginGeneratedSerialDescriptor.j("paymentMethod", false);
            pluginGeneratedSerialDescriptor.j("order", false);
            pluginGeneratedSerialDescriptor.j("customer", false);
            pluginGeneratedSerialDescriptor.j("settleOn", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            KSerializer kSerializerC = nlm.a.c(qlm.t0.f247706a);
            qlm.v1 v1Var = qlm.v1.f247718a;
            return new KSerializer[]{v1Var, v1Var, v1Var, n1.a.f306117a, l1.a.f306088a, kSerializerC};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            String strDecodeStringElement3 = null;
            n1 n1Var = null;
            l1 l1Var = null;
            Long l2 = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                        break;
                    case 1:
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        break;
                    case 2:
                        strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                        break;
                    case 3:
                        n1Var = (n1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, n1.a.f306117a, n1Var);
                        i |= 8;
                        break;
                    case 4:
                        l1Var = (l1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, l1.a.f306088a, l1Var);
                        i |= 16;
                        break;
                    case 5:
                        l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, qlm.t0.f247706a, l2);
                        i |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new o1(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, n1Var, l1Var, l2);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            o1 value = (o1) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            o1.g(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: xhf.o1$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f306126a;
        }
    }

    public /* synthetic */ o1(int i, String str, String str2, String str3, n1 n1Var, l1 l1Var, Long l2) {
        if (63 != (i & 63)) {
            qlm.j1.f(a.f306126a.getDescriptor(), i, 63);
            throw null;
        }
        this.id = str;
        this.type = str2;
        this.paymentMethod = str3;
        this.order = n1Var;
        this.customer = l1Var;
        this.settleOn = l2;
    }

    public static final /* synthetic */ void g(o1 o1Var, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, o1Var.id);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, o1Var.type);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, o1Var.paymentMethod);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, n1.a.f306117a, o1Var.order);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, l1.a.f306088a, o1Var.customer);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, qlm.t0.f247706a, o1Var.settleOn);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final l1 getCustomer() {
        return this.customer;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final n1 getOrder() {
        return this.order;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getSettleOn() {
        return this.settleOn;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj2;
        return Intrinsics.f(this.id, o1Var.id) && Intrinsics.f(this.type, o1Var.type) && Intrinsics.f(this.paymentMethod, o1Var.paymentMethod) && Intrinsics.f(this.order, o1Var.order) && Intrinsics.f(this.customer, o1Var.customer) && Intrinsics.f(this.settleOn, o1Var.settleOn);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        int iHashCode = (this.customer.hashCode() + ((this.order.hashCode() + p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.type), 31, this.paymentMethod)) * 31)) * 31;
        Long l2 = this.settleOn;
        return iHashCode + (l2 == null ? 0 : l2.hashCode());
    }
}
