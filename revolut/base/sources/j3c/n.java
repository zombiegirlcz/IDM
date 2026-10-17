package j3c;

import j3c.a0;
import j3c.b0;
import j3c.k;
import j3c.l;
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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 .2\u00020\u0001:\u0002\u0005\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0007\u0010\u0004R \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\r\u0010\t\u001a\u0004\b\f\u0010\u0004R \u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0013\u0010\t\u001a\u0004\b\u0005\u0010\u0012R \u0010\u001a\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0016\u0012\u0004\b\u0019\u0010\t\u001a\u0004\b\u0017\u0010\u0018R \u0010\u001e\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u0012\u0004\b\u001d\u0010\t\u001a\u0004\b\u001c\u0010\u0018R \u0010#\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010 \u0012\u0004\b\"\u0010\t\u001a\u0004\b\u0010\u0010!R \u0010(\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010%\u0012\u0004\b'\u0010\t\u001a\u0004\b\u001b\u0010&R \u0010-\u001a\u00020)8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010*\u0012\u0004\b,\u0010\t\u001a\u0004\b\u000b\u0010+¨\u0006/"}, d2 = {"Lj3c/n;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "getSku$annotations", "()V", "sku", "b", "g", "getType$annotations", "type", "", "c", "J", "()J", "getCount$annotations", "count", "Lj3c/b0;", "Lj3c/b0;", "h", "()Lj3c/b0;", "getUnitPrice$annotations", "unitPrice", "e", "f", "getTotalPrice$annotations", "totalPrice", "Lj3c/a0;", "Lj3c/a0;", "()Lj3c/a0;", "getMetadata$annotations", "metadata", "Lj3c/l;", "Lj3c/l;", "()Lj3c/l;", "getStrings$annotations", "strings", "Lj3c/k;", "Lj3c/k;", "()Lj3c/k;", "getImages$annotations", "images", "Companion", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class n {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("sku")
    @NotNull
    private final String sku;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("count")
    private final long count;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("unitPrice")
    @NotNull
    private final b0 unitPrice;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("totalPrice")
    @NotNull
    private final b0 totalPrice;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("metadata")
    @NotNull
    private final a0 metadata;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("strings")
    @NotNull
    private final l strings;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("images")
    @NotNull
    private final k images;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f171092a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f171092a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.revolut_shop.data.model.IppOrderItemDto", aVar, 8);
            pluginGeneratedSerialDescriptor.j("sku", false);
            pluginGeneratedSerialDescriptor.j("type", false);
            pluginGeneratedSerialDescriptor.j("count", false);
            pluginGeneratedSerialDescriptor.j("unitPrice", false);
            pluginGeneratedSerialDescriptor.j("totalPrice", false);
            pluginGeneratedSerialDescriptor.j("metadata", false);
            pluginGeneratedSerialDescriptor.j("strings", false);
            pluginGeneratedSerialDescriptor.j("images", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            v1 v1Var = v1.f247718a;
            b0.a aVar = b0.a.f171028a;
            return new KSerializer[]{v1Var, v1Var, t0.f247706a, aVar, aVar, a0.a.f171019a, l.a.f171072a, k.a.f171069a};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            l lVar = null;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            b0 b0Var = null;
            b0 b0Var2 = null;
            a0 a0Var = null;
            long jDecodeLongElement = 0;
            int i = 0;
            boolean z = true;
            k kVar = null;
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
                        jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 2);
                        i |= 4;
                        break;
                    case 3:
                        b0Var = (b0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, b0.a.f171028a, b0Var);
                        i |= 8;
                        break;
                    case 4:
                        b0Var2 = (b0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, b0.a.f171028a, b0Var2);
                        i |= 16;
                        break;
                    case 5:
                        a0Var = (a0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, a0.a.f171019a, a0Var);
                        i |= 32;
                        break;
                    case 6:
                        lVar = (l) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, l.a.f171072a, lVar);
                        i |= 64;
                        break;
                    case 7:
                        kVar = (k) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 7, k.a.f171069a, kVar);
                        i |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new n(i, strDecodeStringElement, strDecodeStringElement2, jDecodeLongElement, b0Var, b0Var2, a0Var, lVar, kVar);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            n value = (n) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            n.i(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: j3c.n$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f171092a;
        }
    }

    public /* synthetic */ n(int i, String str, String str2, long j2, b0 b0Var, b0 b0Var2, a0 a0Var, l lVar, k kVar) {
        if (255 != (i & 255)) {
            j1.f(a.f171092a.getDescriptor(), i, 255);
            throw null;
        }
        this.sku = str;
        this.type = str2;
        this.count = j2;
        this.unitPrice = b0Var;
        this.totalPrice = b0Var2;
        this.metadata = a0Var;
        this.strings = lVar;
        this.images = kVar;
    }

    public static final /* synthetic */ void i(n nVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, nVar.sku);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, nVar.type);
        compositeEncoder.encodeLongElement(serialDescriptor, 2, nVar.count);
        b0.a aVar = b0.a.f171028a;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, aVar, nVar.unitPrice);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, aVar, nVar.totalPrice);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, a0.a.f171019a, nVar.metadata);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 6, l.a.f171072a, nVar.strings);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 7, k.a.f171069a, nVar.images);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final k getImages() {
        return this.images;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a0 getMetadata() {
        return this.metadata;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSku() {
        return this.sku;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final l getStrings() {
        return this.strings;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.sku, nVar.sku) && Intrinsics.f(this.type, nVar.type) && this.count == nVar.count && Intrinsics.f(this.unitPrice, nVar.unitPrice) && Intrinsics.f(this.totalPrice, nVar.totalPrice) && Intrinsics.f(this.metadata, nVar.metadata) && Intrinsics.f(this.strings, nVar.strings) && Intrinsics.f(this.images, nVar.images);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final b0 getTotalPrice() {
        return this.totalPrice;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final b0 getUnitPrice() {
        return this.unitPrice;
    }

    public final int hashCode() {
        return this.images.hashCode() + ((this.strings.hashCode() + ((this.metadata.hashCode() + ((this.totalPrice.hashCode() + ((this.unitPrice.hashCode() + a0.d.c(p.a.c(this.sku.hashCode() * 31, 31, this.type), 31, this.count)) * 31)) * 31)) * 31)) * 31);
    }
}
