package j3c;

import j1f.q0;
import j3c.b0;
import j3c.f0;
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
import qlm.v1;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u0000 42\u00020\u0001:\u0002\u0006\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R$\u0010\u000b\u001a\u00060\u0002j\u0002`\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\t\u0010\n\u001a\u0004\b\b\u0010\u0004R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0007\u0012\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\u0004R \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0007\u0012\u0004\b\u0010\u0010\n\u001a\u0004\b\u0006\u0010\u0004R \u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0007\u0012\u0004\b\u0013\u0010\n\u001a\u0004\b\u0012\u0010\u0004R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0016\u0012\u0004\b\u0019\u0010\n\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u001e\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u0012\u0004\b\u001d\u0010\n\u001a\u0004\b\u001c\u0010\u0018R\"\u0010\"\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u0016\u0012\u0004\b!\u0010\n\u001a\u0004\b \u0010\u0018R\"\u0010$\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0007\u0012\u0004\b#\u0010\n\u001a\u0004\b\u001f\u0010\u0004R&\u0010*\u001a\b\u0012\u0004\u0012\u00020&0%8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010'\u0012\u0004\b)\u0010\n\u001a\u0004\b\u000f\u0010(R&\u0010-\u001a\b\u0012\u0004\u0012\u00020+0%8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010'\u0012\u0004\b,\u0010\n\u001a\u0004\b\u001b\u0010(R\"\u00103\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b2\u0010\n\u001a\u0004\b/\u00101¨\u00065"}, d2 = {"Lj3c/x;", "", "", "toString", "()Ljava/lang/String;", "Lcom/revolut/feature/revolut_shop/data/model/IppCartId;", "a", "Ljava/lang/String;", "b", "getId$annotations", "()V", "id", "e", "getOrderId$annotations", "orderId", "c", "getCreatedBy$annotations", "createdBy", "d", "getMerchantId$annotations", "merchantId", "Lj3c/b0;", "Lj3c/b0;", "h", "()Lj3c/b0;", "getTotalAmount$annotations", "totalAmount", "f", "j", "getTotalTaxAmount$annotations", "totalTaxAmount", "g", "i", "getTotalDeliveryAmount$annotations", "totalDeliveryAmount", "getTaxRate$annotations", "taxRate", "", "Lj3c/z;", "Ljava/util/List;", "()Ljava/util/List;", "getItems$annotations", "items", "Lj3c/v;", "getShipments$annotations", "shipments", "Lj3c/f0;", "k", "Lj3c/f0;", "()Lj3c/f0;", "getVatSettings$annotations", "vatSettings", "Companion", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class x {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Lazy[] f171156l;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("orderId")
    private final String orderId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdBy")
    @NotNull
    private final String createdBy;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("merchantId")
    @NotNull
    private final String merchantId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("totalAmount")
    private final b0 totalAmount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("totalTaxAmount")
    private final b0 totalTaxAmount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalDeliveryAmount")
    private final b0 totalDeliveryAmount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("taxRate")
    private final String taxRate;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("items")
    @NotNull
    private final List<z> items;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("shipments")
    @NotNull
    private final List<v> shipments;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("vatSettings")
    private final f0 vatSettings;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f171163a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f171163a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.revolut_shop.data.model.IppUserCartDto", aVar, 11);
            pluginGeneratedSerialDescriptor.j("id", false);
            pluginGeneratedSerialDescriptor.j("orderId", false);
            pluginGeneratedSerialDescriptor.j("createdBy", false);
            pluginGeneratedSerialDescriptor.j("merchantId", false);
            pluginGeneratedSerialDescriptor.j("totalAmount", false);
            pluginGeneratedSerialDescriptor.j("totalTaxAmount", false);
            pluginGeneratedSerialDescriptor.j("totalDeliveryAmount", false);
            pluginGeneratedSerialDescriptor.j("taxRate", false);
            pluginGeneratedSerialDescriptor.j("items", false);
            pluginGeneratedSerialDescriptor.j("shipments", false);
            pluginGeneratedSerialDescriptor.j("vatSettings", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = x.f171156l;
            v1 v1Var = v1.f247718a;
            b0.a aVar = b0.a.f171028a;
            return new KSerializer[]{v1Var, nlm.a.c(v1Var), v1Var, v1Var, nlm.a.c(aVar), nlm.a.c(aVar), nlm.a.c(aVar), nlm.a.c(v1Var), lazyArr[8].getValue(), lazyArr[9].getValue(), nlm.a.c(f0.a.f171057a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Lazy[] lazyArr;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr2 = x.f171156l;
            dVarBeginStructure.getClass();
            List list = null;
            List list2 = null;
            f0 f0Var = null;
            String strDecodeStringElement = null;
            String str = null;
            String strDecodeStringElement2 = null;
            String strDecodeStringElement3 = null;
            b0 b0Var = null;
            b0 b0Var2 = null;
            b0 b0Var3 = null;
            String str2 = null;
            int i = 0;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        lazyArr = lazyArr2;
                        z = false;
                        break;
                    case 0:
                        lazyArr = lazyArr2;
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                        break;
                    case 1:
                        lazyArr = lazyArr2;
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str);
                        i |= 2;
                        break;
                    case 2:
                        lazyArr = lazyArr2;
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                        break;
                    case 3:
                        lazyArr = lazyArr2;
                        strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i |= 8;
                        break;
                    case 4:
                        lazyArr = lazyArr2;
                        b0Var = (b0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, b0.a.f171028a, b0Var);
                        i |= 16;
                        break;
                    case 5:
                        lazyArr = lazyArr2;
                        b0Var2 = (b0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, b0.a.f171028a, b0Var2);
                        i |= 32;
                        break;
                    case 6:
                        lazyArr = lazyArr2;
                        b0Var3 = (b0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, b0.a.f171028a, b0Var3);
                        i |= 64;
                        break;
                    case 7:
                        lazyArr = lazyArr2;
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, v1.f247718a, str2);
                        i |= 128;
                        break;
                    case 8:
                        lazyArr = lazyArr2;
                        list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 8, (mlm.b) lazyArr[8].getValue(), list);
                        i |= 256;
                        break;
                    case 9:
                        lazyArr = lazyArr2;
                        list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 9, (mlm.b) lazyArr[9].getValue(), list2);
                        i |= 512;
                        break;
                    case 10:
                        lazyArr = lazyArr2;
                        f0Var = (f0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, f0.a.f171057a, f0Var);
                        i |= 1024;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
                lazyArr2 = lazyArr;
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new x(i, strDecodeStringElement, str, strDecodeStringElement2, strDecodeStringElement3, b0Var, b0Var2, b0Var3, str2, list, list2, f0Var);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            x value = (x) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            x.l(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: j3c.x$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f171163a;
        }
    }

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f171156l = new Lazy[]{null, null, null, null, null, null, null, null, yhm.j.c(kVar, new q0(28)), yhm.j.c(kVar, new q0(29)), null};
    }

    public /* synthetic */ x(int i, String str, String str2, String str3, String str4, b0 b0Var, b0 b0Var2, b0 b0Var3, String str5, List list, List list2, f0 f0Var) {
        if (2047 != (i & 2047)) {
            j1.f(a.f171163a.getDescriptor(), i, 2047);
            throw null;
        }
        this.id = str;
        this.orderId = str2;
        this.createdBy = str3;
        this.merchantId = str4;
        this.totalAmount = b0Var;
        this.totalTaxAmount = b0Var2;
        this.totalDeliveryAmount = b0Var3;
        this.taxRate = str5;
        this.items = list;
        this.shipments = list2;
        this.vatSettings = f0Var;
    }

    public static final /* synthetic */ void l(x xVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, xVar.id);
        v1 v1Var = v1.f247718a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, v1Var, xVar.orderId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, xVar.createdBy);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, xVar.merchantId);
        b0.a aVar = b0.a.f171028a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, aVar, xVar.totalAmount);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, aVar, xVar.totalTaxAmount);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, aVar, xVar.totalDeliveryAmount);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, v1Var, xVar.taxRate);
        Lazy[] lazyArr = f171156l;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 8, (mlm.h) lazyArr[8].getValue(), xVar.items);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 9, (mlm.h) lazyArr[9].getValue(), xVar.shipments);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, f0.a.f171057a, xVar.vatSettings);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCreatedBy() {
        return this.createdBy;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getItems() {
        return this.items;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getMerchantId() {
        return this.merchantId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.id, xVar.id) && Intrinsics.f(this.orderId, xVar.orderId) && Intrinsics.f(this.createdBy, xVar.createdBy) && Intrinsics.f(this.merchantId, xVar.merchantId) && Intrinsics.f(this.totalAmount, xVar.totalAmount) && Intrinsics.f(this.totalTaxAmount, xVar.totalTaxAmount) && Intrinsics.f(this.totalDeliveryAmount, xVar.totalDeliveryAmount) && Intrinsics.f(this.taxRate, xVar.taxRate) && Intrinsics.f(this.items, xVar.items) && Intrinsics.f(this.shipments, xVar.shipments) && Intrinsics.f(this.vatSettings, xVar.vatSettings);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getShipments() {
        return this.shipments;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTaxRate() {
        return this.taxRate;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final b0 getTotalAmount() {
        return this.totalAmount;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.orderId;
        int iC = p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.createdBy), 31, this.merchantId);
        b0 b0Var = this.totalAmount;
        int iHashCode2 = (iC + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
        b0 b0Var2 = this.totalTaxAmount;
        int iHashCode3 = (iHashCode2 + (b0Var2 == null ? 0 : b0Var2.hashCode())) * 31;
        b0 b0Var3 = this.totalDeliveryAmount;
        int iHashCode4 = (iHashCode3 + (b0Var3 == null ? 0 : b0Var3.hashCode())) * 31;
        String str2 = this.taxRate;
        int iD = p.a.d(p.a.d((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.items), 31, this.shipments);
        f0 f0Var = this.vatSettings;
        return iD + (f0Var != null ? f0Var.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final b0 getTotalDeliveryAmount() {
        return this.totalDeliveryAmount;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final b0 getTotalTaxAmount() {
        return this.totalTaxAmount;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final f0 getVatSettings() {
        return this.vatSettings;
    }
}
