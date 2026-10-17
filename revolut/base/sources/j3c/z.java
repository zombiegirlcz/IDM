package j3c;

import j3c.a0;
import j3c.b0;
import j3c.k;
import j3c.l;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 D2\u00020\u0001:\u0002\u0005\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0007\u0010\u0004R \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\r\u0010\t\u001a\u0004\b\f\u0010\u0004R \u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0006\u0012\u0004\b\u0011\u0010\t\u001a\u0004\b\u0010\u0010\u0004R \u0010\u0018\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0017\u0010\t\u001a\u0004\b\u0005\u0010\u0016R \u0010\u001b\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0015\u0012\u0004\b\u001a\u0010\t\u001a\u0004\b\u000b\u0010\u0016R \u0010!\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u001d\u0012\u0004\b \u0010\t\u001a\u0004\b\u001e\u0010\u001fR \u0010$\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u001d\u0012\u0004\b#\u0010\t\u001a\u0004\b\"\u0010\u001fR \u0010(\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010\u001d\u0012\u0004\b'\u0010\t\u001a\u0004\b&\u0010\u001fR \u0010,\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010\u001d\u0012\u0004\b+\u0010\t\u001a\u0004\b*\u0010\u001fR \u00101\u001a\u00020-8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010.\u0012\u0004\b0\u0010\t\u001a\u0004\b\u0014\u0010/R\"\u00103\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010\u0006\u0012\u0004\b2\u0010\t\u001a\u0004\b)\u0010\u0004R&\u00109\u001a\b\u0012\u0004\u0012\u000205048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00106\u0012\u0004\b8\u0010\t\u001a\u0004\b\u0019\u00107R \u0010>\u001a\u00020:8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010;\u0012\u0004\b=\u0010\t\u001a\u0004\b%\u0010<R \u0010C\u001a\u00020?8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010@\u0012\u0004\bB\u0010\t\u001a\u0004\b\u000f\u0010A¨\u0006E"}, d2 = {"Lj3c/z;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "getSku$annotations", "()V", "sku", "b", "l", "getType$annotations", "type", "c", "g", "getState$annotations", "state", "", "d", "J", "()J", "getCount$annotations", "count", "e", "getCountLimit$annotations", "countLimit", "Lj3c/b0;", "Lj3c/b0;", "m", "()Lj3c/b0;", "getUnitPrice$annotations", "unitPrice", "n", "getUnitPriceWithoutDiscounts$annotations", "unitPriceWithoutDiscounts", "h", "j", "getTotalPrice$annotations", "totalPrice", "i", "k", "getTotalPriceWithoutDiscounts$annotations", "totalPriceWithoutDiscounts", "Lj3c/a0;", "Lj3c/a0;", "()Lj3c/a0;", "getMetadata$annotations", "metadata", "getTermsAndConditionsUri$annotations", "termsAndConditionsUri", "", "Lj3c/c0;", "Ljava/util/List;", "()Ljava/util/List;", "getPromotions$annotations", "promotions", "Lj3c/l;", "Lj3c/l;", "()Lj3c/l;", "getStrings$annotations", "strings", "Lj3c/k;", "Lj3c/k;", "()Lj3c/k;", "getImages$annotations", "images", "Companion", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class z {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] o = {null, null, null, null, null, null, null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new y(0)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("sku")
    @NotNull
    private final String sku;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("count")
    private final long count;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("countLimit")
    private final long countLimit;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("unitPrice")
    @NotNull
    private final b0 unitPrice;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("unitPriceWithoutDiscounts")
    @NotNull
    private final b0 unitPriceWithoutDiscounts;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalPrice")
    @NotNull
    private final b0 totalPrice;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("totalPriceWithoutDiscounts")
    @NotNull
    private final b0 totalPriceWithoutDiscounts;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("metadata")
    @NotNull
    private final a0 metadata;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("termsAndConditionsUri")
    private final String termsAndConditionsUri;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("promotions")
    @NotNull
    private final List<c0> promotions;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("strings")
    @NotNull
    private final l strings;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("images")
    @NotNull
    private final k images;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f171174a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f171174a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.revolut_shop.data.model.IppUserCartItemDto", aVar, 14);
            pluginGeneratedSerialDescriptor.j("sku", false);
            pluginGeneratedSerialDescriptor.j("type", false);
            pluginGeneratedSerialDescriptor.j("state", false);
            pluginGeneratedSerialDescriptor.j("count", false);
            pluginGeneratedSerialDescriptor.j("countLimit", false);
            pluginGeneratedSerialDescriptor.j("unitPrice", false);
            pluginGeneratedSerialDescriptor.j("unitPriceWithoutDiscounts", false);
            pluginGeneratedSerialDescriptor.j("totalPrice", false);
            pluginGeneratedSerialDescriptor.j("totalPriceWithoutDiscounts", false);
            pluginGeneratedSerialDescriptor.j("metadata", false);
            pluginGeneratedSerialDescriptor.j("termsAndConditionsUri", false);
            pluginGeneratedSerialDescriptor.j("promotions", false);
            pluginGeneratedSerialDescriptor.j("strings", false);
            pluginGeneratedSerialDescriptor.j("images", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = z.o;
            v1 v1Var = v1.f247718a;
            t0 t0Var = t0.f247706a;
            b0.a aVar = b0.a.f171028a;
            return new KSerializer[]{v1Var, v1Var, v1Var, t0Var, t0Var, aVar, aVar, aVar, aVar, a0.a.f171019a, nlm.a.c(v1Var), lazyArr[11].getValue(), l.a.f171072a, k.a.f171069a};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            String str;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = z.o;
            dVarBeginStructure.getClass();
            b0 b0Var = null;
            k kVar = null;
            b0 b0Var2 = null;
            a0 a0Var = null;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            String strDecodeStringElement3 = null;
            String str2 = null;
            List list = null;
            l lVar = null;
            long jDecodeLongElement = 0;
            long jDecodeLongElement2 = 0;
            int i = 0;
            boolean z = true;
            b0 b0Var3 = null;
            b0 b0Var4 = null;
            while (z) {
                Lazy[] lazyArr2 = lazyArr;
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        str = strDecodeStringElement;
                        z = false;
                        lazyArr = lazyArr2;
                        strDecodeStringElement = str;
                        break;
                    case 0:
                        i |= 1;
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        lazyArr = lazyArr2;
                        break;
                    case 1:
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        lazyArr = lazyArr2;
                        break;
                    case 2:
                        strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                        lazyArr = lazyArr2;
                        break;
                    case 3:
                        jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 3);
                        i |= 8;
                        lazyArr = lazyArr2;
                        break;
                    case 4:
                        jDecodeLongElement2 = dVarBeginStructure.decodeLongElement(serialDescriptor, 4);
                        i |= 16;
                        lazyArr = lazyArr2;
                        break;
                    case 5:
                        str = strDecodeStringElement;
                        b0Var = (b0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, b0.a.f171028a, b0Var);
                        i |= 32;
                        lazyArr = lazyArr2;
                        strDecodeStringElement = str;
                        break;
                    case 6:
                        str = strDecodeStringElement;
                        b0Var3 = (b0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, b0.a.f171028a, b0Var3);
                        i |= 64;
                        lazyArr = lazyArr2;
                        strDecodeStringElement = str;
                        break;
                    case 7:
                        str = strDecodeStringElement;
                        b0Var4 = (b0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 7, b0.a.f171028a, b0Var4);
                        i |= 128;
                        lazyArr = lazyArr2;
                        strDecodeStringElement = str;
                        break;
                    case 8:
                        str = strDecodeStringElement;
                        b0Var2 = (b0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 8, b0.a.f171028a, b0Var2);
                        i |= 256;
                        lazyArr = lazyArr2;
                        strDecodeStringElement = str;
                        break;
                    case 9:
                        str = strDecodeStringElement;
                        a0Var = (a0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 9, a0.a.f171019a, a0Var);
                        i |= 512;
                        lazyArr = lazyArr2;
                        strDecodeStringElement = str;
                        break;
                    case 10:
                        str = strDecodeStringElement;
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, v1.f247718a, str2);
                        i |= 1024;
                        lazyArr = lazyArr2;
                        strDecodeStringElement = str;
                        break;
                    case 11:
                        str = strDecodeStringElement;
                        list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 11, (mlm.b) lazyArr2[11].getValue(), list);
                        i |= 2048;
                        lazyArr = lazyArr2;
                        strDecodeStringElement = str;
                        break;
                    case 12:
                        str = strDecodeStringElement;
                        lVar = (l) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 12, l.a.f171072a, lVar);
                        i |= 4096;
                        lazyArr = lazyArr2;
                        strDecodeStringElement = str;
                        break;
                    case 13:
                        str = strDecodeStringElement;
                        kVar = (k) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 13, k.a.f171069a, kVar);
                        i |= 8192;
                        lazyArr = lazyArr2;
                        strDecodeStringElement = str;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new z(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, jDecodeLongElement, jDecodeLongElement2, b0Var, b0Var3, b0Var4, b0Var2, a0Var, str2, list, lVar, kVar);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            z value = (z) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            z.o(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: j3c.z$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f171174a;
        }
    }

    public /* synthetic */ z(int i, String str, String str2, String str3, long j2, long j3, b0 b0Var, b0 b0Var2, b0 b0Var3, b0 b0Var4, a0 a0Var, String str4, List list, l lVar, k kVar) {
        if (16383 != (i & 16383)) {
            j1.f(a.f171174a.getDescriptor(), i, 16383);
            throw null;
        }
        this.sku = str;
        this.type = str2;
        this.state = str3;
        this.count = j2;
        this.countLimit = j3;
        this.unitPrice = b0Var;
        this.unitPriceWithoutDiscounts = b0Var2;
        this.totalPrice = b0Var3;
        this.totalPriceWithoutDiscounts = b0Var4;
        this.metadata = a0Var;
        this.termsAndConditionsUri = str4;
        this.promotions = list;
        this.strings = lVar;
        this.images = kVar;
    }

    public static final /* synthetic */ void o(z zVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, zVar.sku);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, zVar.type);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, zVar.state);
        compositeEncoder.encodeLongElement(serialDescriptor, 3, zVar.count);
        compositeEncoder.encodeLongElement(serialDescriptor, 4, zVar.countLimit);
        b0.a aVar = b0.a.f171028a;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, aVar, zVar.unitPrice);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 6, aVar, zVar.unitPriceWithoutDiscounts);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 7, aVar, zVar.totalPrice);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 8, aVar, zVar.totalPriceWithoutDiscounts);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 9, a0.a.f171019a, zVar.metadata);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, v1.f247718a, zVar.termsAndConditionsUri);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 11, (mlm.h) o[11].getValue(), zVar.promotions);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 12, l.a.f171072a, zVar.strings);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 13, k.a.f171069a, zVar.images);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getCountLimit() {
        return this.countLimit;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final k getImages() {
        return this.images;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final a0 getMetadata() {
        return this.metadata;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getPromotions() {
        return this.promotions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.sku, zVar.sku) && Intrinsics.f(this.type, zVar.type) && Intrinsics.f(this.state, zVar.state) && this.count == zVar.count && this.countLimit == zVar.countLimit && Intrinsics.f(this.unitPrice, zVar.unitPrice) && Intrinsics.f(this.unitPriceWithoutDiscounts, zVar.unitPriceWithoutDiscounts) && Intrinsics.f(this.totalPrice, zVar.totalPrice) && Intrinsics.f(this.totalPriceWithoutDiscounts, zVar.totalPriceWithoutDiscounts) && Intrinsics.f(this.metadata, zVar.metadata) && Intrinsics.f(this.termsAndConditionsUri, zVar.termsAndConditionsUri) && Intrinsics.f(this.promotions, zVar.promotions) && Intrinsics.f(this.strings, zVar.strings) && Intrinsics.f(this.images, zVar.images);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSku() {
        return this.sku;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final l getStrings() {
        return this.strings;
    }

    public final int hashCode() {
        int iHashCode = (this.metadata.hashCode() + ((this.totalPriceWithoutDiscounts.hashCode() + ((this.totalPrice.hashCode() + ((this.unitPriceWithoutDiscounts.hashCode() + ((this.unitPrice.hashCode() + a0.d.c(a0.d.c(p.a.c(p.a.c(this.sku.hashCode() * 31, 31, this.type), 31, this.state), 31, this.count), 31, this.countLimit)) * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.termsAndConditionsUri;
        return this.images.hashCode() + ((this.strings.hashCode() + p.a.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.promotions)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getTermsAndConditionsUri() {
        return this.termsAndConditionsUri;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final b0 getTotalPrice() {
        return this.totalPrice;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final b0 getTotalPriceWithoutDiscounts() {
        return this.totalPriceWithoutDiscounts;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final b0 getUnitPrice() {
        return this.unitPrice;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final b0 getUnitPriceWithoutDiscounts() {
        return this.unitPriceWithoutDiscounts;
    }
}
