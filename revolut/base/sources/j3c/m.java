package j3c;

import j1f.q0;
import j3c.b;
import j3c.b0;
import j3c.o;
import java.util.List;
import kotlin.Lazy;
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
import qlm.j1;
import qlm.t0;
import qlm.v1;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0081\b\u0018\u0000 S2\u00020\u0001:\u0002\u0005\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0007\u0010\u0004R \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\r\u0010\t\u001a\u0004\b\f\u0010\u0004R \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0006\u0012\u0004\b\u0010\u0010\t\u001a\u0004\b\u000b\u0010\u0004R \u0010\u0017\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0016\u0010\t\u001a\u0004\b\u000f\u0010\u0015R \u0010\u001b\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0014\u0012\u0004\b\u001a\u0010\t\u001a\u0004\b\u0019\u0010\u0015R \u0010\u001f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u0012\u0004\b\u001e\u0010\t\u001a\u0004\b\u001d\u0010\u0004R \u0010\"\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0006\u0012\u0004\b!\u0010\t\u001a\u0004\b \u0010\u0004R \u0010)\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010\t\u001a\u0004\b&\u0010'R \u0010.\u001a\u00020*8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010+\u0012\u0004\b-\u0010\t\u001a\u0004\b\u0013\u0010,R \u00104\u001a\u00020/8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u00100\u0012\u0004\b3\u0010\t\u001a\u0004\b1\u00102R \u00109\u001a\u0002058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u00106\u0012\u0004\b8\u0010\t\u001a\u0004\b\u001c\u00107R&\u0010@\u001a\b\u0012\u0004\u0012\u00020;0:8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b<\u0010=\u0012\u0004\b?\u0010\t\u001a\u0004\b$\u0010>R&\u0010C\u001a\b\u0012\u0004\u0012\u00020A0:8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010=\u0012\u0004\bB\u0010\t\u001a\u0004\b<\u0010>R\"\u0010H\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bD\u0010E\u0012\u0004\bG\u0010\t\u001a\u0004\b\u0018\u0010FR\"\u0010K\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010%\u0012\u0004\bJ\u0010\t\u001a\u0004\bI\u0010'R\"\u0010N\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bI\u0010%\u0012\u0004\bM\u0010\t\u001a\u0004\bL\u0010'R\"\u0010P\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bL\u0010\u0006\u0012\u0004\bO\u0010\t\u001a\u0004\bD\u0010\u0004R\"\u0010R\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u0012\u0004\bQ\u0010\t\u001a\u0004\b\u0005\u0010\u0004¨\u0006T"}, d2 = {"Lj3c/m;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "getId$annotations", "()V", "id", "b", "m", "getState$annotations", "state", "c", "getCreatedBy$annotations", "createdBy", "", "d", "J", "()J", "getCreatedDate$annotations", "createdDate", "e", "r", "getUpdatedDate$annotations", "updatedDate", "f", "i", "getMerchantId$annotations", "merchantId", "j", "getOrderNumber$annotations", "orderNumber", "Lj3c/b0;", "h", "Lj3c/b0;", "o", "()Lj3c/b0;", "getTotalAmount$annotations", "totalAmount", "Lj3c/b;", "Lj3c/b;", "()Lj3c/b;", "getDeliveryAddress$annotations", "deliveryAddress", "Lj3c/o;", "Lj3c/o;", "k", "()Lj3c/o;", "getPaymentMethod$annotations", "paymentMethod", "", "Z", "()Z", "getHasFailedPayments$annotations", "hasFailedPayments", "", "Lj3c/n;", "l", "Ljava/util/List;", "()Ljava/util/List;", "getItems$annotations", "items", "Lj3c/p;", "getShipments$annotations", "shipments", "n", "Ljava/lang/Long;", "()Ljava/lang/Long;", "getExpirationDate$annotations", "expirationDate", "p", "getTotalDeliveryAmount$annotations", "totalDeliveryAmount", "q", "getTotalTaxAmount$annotations", "totalTaxAmount", "getTaxRate$annotations", "taxRate", "getCancellationReason$annotations", "cancellationReason", "Companion", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class m {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Lazy[] f171073s;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdBy")
    @NotNull
    private final String createdBy;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("createdDate")
    private final long createdDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("updatedDate")
    private final long updatedDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("merchantId")
    @NotNull
    private final String merchantId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("orderNumber")
    @NotNull
    private final String orderNumber;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalAmount")
    @NotNull
    private final b0 totalAmount;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("deliveryAddress")
    @NotNull
    private final b deliveryAddress;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentMethod")
    @NotNull
    private final o paymentMethod;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("hasFailedPayments")
    private final boolean hasFailedPayments;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("items")
    @NotNull
    private final List<n> items;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("shipments")
    @NotNull
    private final List<p> shipments;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("expirationDate")
    private final Long expirationDate;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("totalDeliveryAmount")
    private final b0 totalDeliveryAmount;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalTaxAmount")
    private final b0 totalTaxAmount;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("taxRate")
    private final String taxRate;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("cancellationReason")
    private final String cancellationReason;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f171086a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f171086a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.revolut_shop.data.model.IppOrderDto", aVar, 18);
            pluginGeneratedSerialDescriptor.j("id", false);
            pluginGeneratedSerialDescriptor.j("state", false);
            pluginGeneratedSerialDescriptor.j("createdBy", false);
            pluginGeneratedSerialDescriptor.j("createdDate", false);
            pluginGeneratedSerialDescriptor.j("updatedDate", false);
            pluginGeneratedSerialDescriptor.j("merchantId", false);
            pluginGeneratedSerialDescriptor.j("orderNumber", false);
            pluginGeneratedSerialDescriptor.j("totalAmount", false);
            pluginGeneratedSerialDescriptor.j("deliveryAddress", false);
            pluginGeneratedSerialDescriptor.j("paymentMethod", false);
            pluginGeneratedSerialDescriptor.j("hasFailedPayments", false);
            pluginGeneratedSerialDescriptor.j("items", false);
            pluginGeneratedSerialDescriptor.j("shipments", false);
            pluginGeneratedSerialDescriptor.j("expirationDate", false);
            pluginGeneratedSerialDescriptor.j("totalDeliveryAmount", false);
            pluginGeneratedSerialDescriptor.j("totalTaxAmount", false);
            pluginGeneratedSerialDescriptor.j("taxRate", false);
            pluginGeneratedSerialDescriptor.j("cancellationReason", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = m.f171073s;
            v1 v1Var = v1.f247718a;
            t0 t0Var = t0.f247706a;
            b0.a aVar = b0.a.f171028a;
            return new KSerializer[]{v1Var, v1Var, v1Var, t0Var, t0Var, v1Var, v1Var, aVar, b.a.f171025a, o.a.f171096a, qlm.h.f247648a, lazyArr[11].getValue(), lazyArr[12].getValue(), nlm.a.c(t0Var), nlm.a.c(aVar), nlm.a.c(aVar), nlm.a.c(v1Var), nlm.a.c(v1Var)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            String str;
            int i;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = m.f171073s;
            dVarBeginStructure.getClass();
            b0 b0Var = null;
            String str2 = null;
            String str3 = null;
            List list = null;
            List list2 = null;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            String strDecodeStringElement3 = null;
            Long l2 = null;
            b0 b0Var2 = null;
            b0 b0Var3 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            long jDecodeLongElement = 0;
            long jDecodeLongElement2 = 0;
            int i2 = 0;
            boolean z = true;
            boolean zDecodeBooleanElement = false;
            b bVar = null;
            o oVar = null;
            while (true) {
                String str4 = strDecodeStringElement;
                if (!z) {
                    dVarBeginStructure.endStructure(serialDescriptor);
                    return new m(i2, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, jDecodeLongElement, jDecodeLongElement2, strDecodeStringElement4, strDecodeStringElement5, b0Var, bVar, oVar, zDecodeBooleanElement, list, list2, l2, b0Var2, b0Var3, str3, str2);
                }
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        str = strDecodeStringElement2;
                        z = false;
                        strDecodeStringElement = str4;
                        strDecodeStringElement2 = str;
                        break;
                    case 0:
                        str = strDecodeStringElement2;
                        i2 |= 1;
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        strDecodeStringElement2 = str;
                        break;
                    case 1:
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i2 |= 2;
                        strDecodeStringElement = str4;
                        break;
                    case 2:
                        strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i2 |= 4;
                        strDecodeStringElement = str4;
                        break;
                    case 3:
                        jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 3);
                        i2 |= 8;
                        strDecodeStringElement = str4;
                        break;
                    case 4:
                        jDecodeLongElement2 = dVarBeginStructure.decodeLongElement(serialDescriptor, 4);
                        i2 |= 16;
                        strDecodeStringElement = str4;
                        break;
                    case 5:
                        strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i2 |= 32;
                        strDecodeStringElement = str4;
                        break;
                    case 6:
                        strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i2 |= 64;
                        strDecodeStringElement = str4;
                        break;
                    case 7:
                        str = strDecodeStringElement2;
                        b0Var = (b0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 7, b0.a.f171028a, b0Var);
                        i2 |= 128;
                        strDecodeStringElement = str4;
                        strDecodeStringElement2 = str;
                        break;
                    case 8:
                        str = strDecodeStringElement2;
                        bVar = (b) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 8, b.a.f171025a, bVar);
                        i2 |= 256;
                        strDecodeStringElement = str4;
                        strDecodeStringElement2 = str;
                        break;
                    case 9:
                        str = strDecodeStringElement2;
                        oVar = (o) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 9, o.a.f171096a, oVar);
                        i2 |= 512;
                        strDecodeStringElement = str4;
                        strDecodeStringElement2 = str;
                        break;
                    case 10:
                        zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 10);
                        i2 |= 1024;
                        strDecodeStringElement = str4;
                        break;
                    case 11:
                        str = strDecodeStringElement2;
                        list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 11, (mlm.b) lazyArr[11].getValue(), list);
                        i2 |= 2048;
                        strDecodeStringElement = str4;
                        strDecodeStringElement2 = str;
                        break;
                    case 12:
                        str = strDecodeStringElement2;
                        list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 12, (mlm.b) lazyArr[12].getValue(), list2);
                        i2 |= 4096;
                        strDecodeStringElement = str4;
                        strDecodeStringElement2 = str;
                        break;
                    case 13:
                        str = strDecodeStringElement2;
                        l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, t0.f247706a, l2);
                        i2 |= 8192;
                        strDecodeStringElement = str4;
                        strDecodeStringElement2 = str;
                        break;
                    case 14:
                        str = strDecodeStringElement2;
                        b0Var2 = (b0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, b0.a.f171028a, b0Var2);
                        i2 |= 16384;
                        strDecodeStringElement = str4;
                        strDecodeStringElement2 = str;
                        break;
                    case 15:
                        str = strDecodeStringElement2;
                        b0Var3 = (b0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, b0.a.f171028a, b0Var3);
                        i = 32768;
                        i2 |= i;
                        strDecodeStringElement = str4;
                        strDecodeStringElement2 = str;
                        break;
                    case 16:
                        str = strDecodeStringElement2;
                        str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, v1.f247718a, str3);
                        i = 65536;
                        i2 |= i;
                        strDecodeStringElement = str4;
                        strDecodeStringElement2 = str;
                        break;
                    case 17:
                        str = strDecodeStringElement2;
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, v1.f247718a, str2);
                        i = 131072;
                        i2 |= i;
                        strDecodeStringElement = str4;
                        strDecodeStringElement2 = str;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            m value = (m) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            m.s(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: j3c.m$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f171086a;
        }
    }

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f171073s = new Lazy[]{null, null, null, null, null, null, null, null, null, null, null, yhm.j.c(kVar, new q0(15)), yhm.j.c(kVar, new q0(16)), null, null, null, null, null};
    }

    public /* synthetic */ m(int i, String str, String str2, String str3, long j2, long j3, String str4, String str5, b0 b0Var, b bVar, o oVar, boolean z, List list, List list2, Long l2, b0 b0Var2, b0 b0Var3, String str6, String str7) {
        if (262143 != (i & 262143)) {
            j1.f(a.f171086a.getDescriptor(), i, 262143);
            throw null;
        }
        this.id = str;
        this.state = str2;
        this.createdBy = str3;
        this.createdDate = j2;
        this.updatedDate = j3;
        this.merchantId = str4;
        this.orderNumber = str5;
        this.totalAmount = b0Var;
        this.deliveryAddress = bVar;
        this.paymentMethod = oVar;
        this.hasFailedPayments = z;
        this.items = list;
        this.shipments = list2;
        this.expirationDate = l2;
        this.totalDeliveryAmount = b0Var2;
        this.totalTaxAmount = b0Var3;
        this.taxRate = str6;
        this.cancellationReason = str7;
    }

    public static final /* synthetic */ void s(m mVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, mVar.id);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, mVar.state);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, mVar.createdBy);
        compositeEncoder.encodeLongElement(serialDescriptor, 3, mVar.createdDate);
        compositeEncoder.encodeLongElement(serialDescriptor, 4, mVar.updatedDate);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, mVar.merchantId);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, mVar.orderNumber);
        b0.a aVar = b0.a.f171028a;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 7, aVar, mVar.totalAmount);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 8, b.a.f171025a, mVar.deliveryAddress);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 9, o.a.f171096a, mVar.paymentMethod);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 10, mVar.hasFailedPayments);
        Lazy[] lazyArr = f171073s;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 11, (mlm.h) lazyArr[11].getValue(), mVar.items);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 12, (mlm.h) lazyArr[12].getValue(), mVar.shipments);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, t0.f247706a, mVar.expirationDate);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, aVar, mVar.totalDeliveryAmount);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, aVar, mVar.totalTaxAmount);
        v1 v1Var = v1.f247718a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, v1Var, mVar.taxRate);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, v1Var, mVar.cancellationReason);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCancellationReason() {
        return this.cancellationReason;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCreatedBy() {
        return this.createdBy;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getCreatedDate() {
        return this.createdDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b getDeliveryAddress() {
        return this.deliveryAddress;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getExpirationDate() {
        return this.expirationDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.id, mVar.id) && Intrinsics.f(this.state, mVar.state) && Intrinsics.f(this.createdBy, mVar.createdBy) && this.createdDate == mVar.createdDate && this.updatedDate == mVar.updatedDate && Intrinsics.f(this.merchantId, mVar.merchantId) && Intrinsics.f(this.orderNumber, mVar.orderNumber) && Intrinsics.f(this.totalAmount, mVar.totalAmount) && Intrinsics.f(this.deliveryAddress, mVar.deliveryAddress) && Intrinsics.f(this.paymentMethod, mVar.paymentMethod) && this.hasFailedPayments == mVar.hasFailedPayments && Intrinsics.f(this.items, mVar.items) && Intrinsics.f(this.shipments, mVar.shipments) && Intrinsics.f(this.expirationDate, mVar.expirationDate) && Intrinsics.f(this.totalDeliveryAmount, mVar.totalDeliveryAmount) && Intrinsics.f(this.totalTaxAmount, mVar.totalTaxAmount) && Intrinsics.f(this.taxRate, mVar.taxRate) && Intrinsics.f(this.cancellationReason, mVar.cancellationReason);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getHasFailedPayments() {
        return this.hasFailedPayments;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final List getItems() {
        return this.items;
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.d(j6.a.c((this.paymentMethod.hashCode() + ((this.deliveryAddress.hashCode() + ((this.totalAmount.hashCode() + p.a.c(p.a.c(a0.d.c(a0.d.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.state), 31, this.createdBy), 31, this.createdDate), 31, this.updatedDate), 31, this.merchantId), 31, this.orderNumber)) * 31)) * 31)) * 31, 31, this.hasFailedPayments), 31, this.items), 31, this.shipments);
        Long l2 = this.expirationDate;
        int iHashCode = (iD + (l2 == null ? 0 : l2.hashCode())) * 31;
        b0 b0Var = this.totalDeliveryAmount;
        int iHashCode2 = (iHashCode + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
        b0 b0Var2 = this.totalTaxAmount;
        int iHashCode3 = (iHashCode2 + (b0Var2 == null ? 0 : b0Var2.hashCode())) * 31;
        String str = this.taxRate;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cancellationReason;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getMerchantId() {
        return this.merchantId;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getOrderNumber() {
        return this.orderNumber;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final o getPaymentMethod() {
        return this.paymentMethod;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final List getShipments() {
        return this.shipments;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getTaxRate() {
        return this.taxRate;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final b0 getTotalAmount() {
        return this.totalAmount;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final b0 getTotalDeliveryAmount() {
        return this.totalDeliveryAmount;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final b0 getTotalTaxAmount() {
        return this.totalTaxAmount;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final long getUpdatedDate() {
        return this.updatedDate;
    }
}
