package j3c;

import j1f.q0;
import j3c.b0;
import j3c.c;
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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 52\u00020\u0001:\u0002\u0005\fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0007\u0010\u0004R \u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u000f\u0010\t\u001a\u0004\b\f\u0010\u000eR \u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0006\u0012\u0004\b\u0013\u0010\t\u001a\u0004\b\u0012\u0010\u0004R(\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\t\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u0012\u0004\b\u001e\u0010\t\u001a\u0004\b\u001d\u0010\u0004R \u0010%\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010!\u0012\u0004\b$\u0010\t\u001a\u0004\b\"\u0010#R\"\u0010'\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010!\u0012\u0004\b&\u0010\t\u001a\u0004\b\u001c\u0010#R \u0010)\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010!\u0012\u0004\b(\u0010\t\u001a\u0004\b\u0016\u0010#R \u0010,\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010\r\u0012\u0004\b+\u0010\t\u001a\u0004\b\u0011\u0010\u000eR&\u0010/\u001a\b\u0012\u0004\u0012\u00020-0\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0017\u0012\u0004\b.\u0010\t\u001a\u0004\b*\u0010\u0019R \u00104\u001a\u0002008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u00101\u0012\u0004\b3\u0010\t\u001a\u0004\b\u0005\u00102¨\u00066"}, d2 = {"Lj3c/u;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "j", "getSku$annotations", "()V", "sku", "", "b", "J", "()J", "getCountLimit$annotations", "countLimit", "c", "k", "getSmallImage$annotations", "smallImage", "", "d", "Ljava/util/List;", "f", "()Ljava/util/List;", "getImages$annotations", "images", "e", "g", "getName$annotations", "name", "Lj3c/b0;", "Lj3c/b0;", "h", "()Lj3c/b0;", "getPrice$annotations", "price", "getDiscountedPrice$annotations", "discountedPrice", "getDeliveryPrice$annotations", "deliveryPrice", "i", "getDeliveryDate$annotations", "deliveryDate", "Lj3c/c0;", "getPromotions$annotations", "promotions", "Lj3c/c;", "Lj3c/c;", "()Lj3c/c;", "getAssets$annotations", "assets", "Companion", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class u {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Lazy[] f171140l;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("sku")
    @NotNull
    private final String sku;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("countLimit")
    private final long countLimit;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("smallImage")
    @NotNull
    private final String smallImage;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("images")
    private final List<String> images;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("name")
    private final String name;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("price")
    @NotNull
    private final b0 price;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("discountedPrice")
    private final b0 discountedPrice;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("deliveryPrice")
    @NotNull
    private final b0 deliveryPrice;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("deliveryDate")
    private final long deliveryDate;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("promotions")
    @NotNull
    private final List<c0> promotions;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("assets")
    @NotNull
    private final c assets;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f171147a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f171147a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.revolut_shop.data.model.IppProductVariationDto", aVar, 11);
            pluginGeneratedSerialDescriptor.j("sku", false);
            pluginGeneratedSerialDescriptor.j("countLimit", false);
            pluginGeneratedSerialDescriptor.j("smallImage", false);
            pluginGeneratedSerialDescriptor.j("images", false);
            pluginGeneratedSerialDescriptor.j("name", false);
            pluginGeneratedSerialDescriptor.j("price", false);
            pluginGeneratedSerialDescriptor.j("discountedPrice", false);
            pluginGeneratedSerialDescriptor.j("deliveryPrice", false);
            pluginGeneratedSerialDescriptor.j("deliveryDate", false);
            pluginGeneratedSerialDescriptor.j("promotions", false);
            pluginGeneratedSerialDescriptor.j("assets", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = u.f171140l;
            v1 v1Var = v1.f247718a;
            t0 t0Var = t0.f247706a;
            b0.a aVar = b0.a.f171028a;
            return new KSerializer[]{v1Var, t0Var, v1Var, nlm.a.c((KSerializer) lazyArr[3].getValue()), nlm.a.c(v1Var), aVar, nlm.a.c(aVar), aVar, t0Var, lazyArr[9].getValue(), c.a.f171032a};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Lazy[] lazyArr;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr2 = u.f171140l;
            dVarBeginStructure.getClass();
            b0 b0Var = null;
            List list = null;
            c cVar = null;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            List list2 = null;
            String str = null;
            long jDecodeLongElement = 0;
            long jDecodeLongElement2 = 0;
            int i = 0;
            boolean z = true;
            b0 b0Var2 = null;
            b0 b0Var3 = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        lazyArr = lazyArr2;
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                        break;
                    case 1:
                        lazyArr = lazyArr2;
                        jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 1);
                        i |= 2;
                        break;
                    case 2:
                        lazyArr = lazyArr2;
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                        break;
                    case 3:
                        lazyArr = lazyArr2;
                        list2 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), list2);
                        i |= 8;
                        break;
                    case 4:
                        lazyArr = lazyArr2;
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str);
                        i |= 16;
                        break;
                    case 5:
                        lazyArr = lazyArr2;
                        b0Var = (b0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, b0.a.f171028a, b0Var);
                        i |= 32;
                        break;
                    case 6:
                        lazyArr = lazyArr2;
                        b0Var2 = (b0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, b0.a.f171028a, b0Var2);
                        i |= 64;
                        break;
                    case 7:
                        lazyArr = lazyArr2;
                        b0Var3 = (b0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 7, b0.a.f171028a, b0Var3);
                        i |= 128;
                        break;
                    case 8:
                        lazyArr = lazyArr2;
                        jDecodeLongElement2 = dVarBeginStructure.decodeLongElement(serialDescriptor, 8);
                        i |= 256;
                        break;
                    case 9:
                        lazyArr = lazyArr2;
                        list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 9, (mlm.b) lazyArr[9].getValue(), list);
                        i |= 512;
                        break;
                    case 10:
                        lazyArr = lazyArr2;
                        cVar = (c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 10, c.a.f171032a, cVar);
                        i |= 1024;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
                lazyArr2 = lazyArr;
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new u(i, strDecodeStringElement, jDecodeLongElement, strDecodeStringElement2, list2, str, b0Var, b0Var2, b0Var3, jDecodeLongElement2, list, cVar);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            u value = (u) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            u.l(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: j3c.u$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f171147a;
        }
    }

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f171140l = new Lazy[]{null, null, null, yhm.j.c(kVar, new q0(25)), null, null, null, null, null, yhm.j.c(kVar, new q0(26)), null};
    }

    public /* synthetic */ u(int i, String str, long j2, String str2, List list, String str3, b0 b0Var, b0 b0Var2, b0 b0Var3, long j3, List list2, c cVar) {
        if (2047 != (i & 2047)) {
            j1.f(a.f171147a.getDescriptor(), i, 2047);
            throw null;
        }
        this.sku = str;
        this.countLimit = j2;
        this.smallImage = str2;
        this.images = list;
        this.name = str3;
        this.price = b0Var;
        this.discountedPrice = b0Var2;
        this.deliveryPrice = b0Var3;
        this.deliveryDate = j3;
        this.promotions = list2;
        this.assets = cVar;
    }

    public static final /* synthetic */ void l(u uVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, uVar.sku);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, uVar.countLimit);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, uVar.smallImage);
        Lazy[] lazyArr = f171140l;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), uVar.images);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, uVar.name);
        b0.a aVar = b0.a.f171028a;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, aVar, uVar.price);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, aVar, uVar.discountedPrice);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 7, aVar, uVar.deliveryPrice);
        compositeEncoder.encodeLongElement(serialDescriptor, 8, uVar.deliveryDate);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 9, (mlm.h) lazyArr[9].getValue(), uVar.promotions);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 10, c.a.f171032a, uVar.assets);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c getAssets() {
        return this.assets;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getCountLimit() {
        return this.countLimit;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getDeliveryDate() {
        return this.deliveryDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b0 getDeliveryPrice() {
        return this.deliveryPrice;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b0 getDiscountedPrice() {
        return this.discountedPrice;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.sku, uVar.sku) && this.countLimit == uVar.countLimit && Intrinsics.f(this.smallImage, uVar.smallImage) && Intrinsics.f(this.images, uVar.images) && Intrinsics.f(this.name, uVar.name) && Intrinsics.f(this.price, uVar.price) && Intrinsics.f(this.discountedPrice, uVar.discountedPrice) && Intrinsics.f(this.deliveryPrice, uVar.deliveryPrice) && this.deliveryDate == uVar.deliveryDate && Intrinsics.f(this.promotions, uVar.promotions) && Intrinsics.f(this.assets, uVar.assets);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getImages() {
        return this.images;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final b0 getPrice() {
        return this.price;
    }

    public final int hashCode() {
        int iC = p.a.c(a0.d.c(this.sku.hashCode() * 31, 31, this.countLimit), 31, this.smallImage);
        List<String> list = this.images;
        int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.name;
        int iHashCode2 = (this.price.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        b0 b0Var = this.discountedPrice;
        return this.assets.hashCode() + p.a.d(a0.d.c((this.deliveryPrice.hashCode() + ((iHashCode2 + (b0Var != null ? b0Var.hashCode() : 0)) * 31)) * 31, 31, this.deliveryDate), 31, this.promotions);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final List getPromotions() {
        return this.promotions;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getSku() {
        return this.sku;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getSmallImage() {
        return this.smallImage;
    }
}
