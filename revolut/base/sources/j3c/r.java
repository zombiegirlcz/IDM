package j3c;

import j1f.q0;
import j3c.s;
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
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0002\u0005\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0007\u0010\u0004R \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\r\u0010\t\u001a\u0004\b\f\u0010\u0004R \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0006\u0012\u0004\b\u0010\u0010\t\u001a\u0004\b\u000f\u0010\u0004R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0006\u0012\u0004\b\u0013\u0010\t\u001a\u0004\b\u000b\u0010\u0004R \u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0006\u0012\u0004\b\u0015\u0010\t\u001a\u0004\b\u0005\u0010\u0004R&\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001d\u0010\t\u001a\u0004\b\u001b\u0010\u001cR&\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u001a\u0012\u0004\b\u001f\u0010\t\u001a\u0004\b\u0019\u0010\u001cR\"\u0010%\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\"\u0012\u0004\b$\u0010\t\u001a\u0004\b\u0012\u0010#¨\u0006'"}, d2 = {"Lj3c/r;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "getProductType$annotations", "()V", "productType", "b", "g", "getTermsAndConditionsUri$annotations", "termsAndConditionsUri", "c", "getName$annotations", "name", "d", "getDescription$annotations", "description", "getCategory$annotations", "category", "", "Lj3c/u;", "f", "Ljava/util/List;", "h", "()Ljava/util/List;", "getVariations$annotations", "variations", "getRecommendations$annotations", "recommendations", "Lj3c/s;", "Lj3c/s;", "()Lj3c/s;", "getPageDefinition$annotations", "pageDefinition", "Companion", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class r {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] i;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("productType")
    @NotNull
    private final String productType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("termsAndConditionsUri")
    @NotNull
    private final String termsAndConditionsUri;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("category")
    @NotNull
    private final String category;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("variations")
    @NotNull
    private final List<u> variations;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("recommendations")
    @NotNull
    private final List<String> recommendations;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("pageDefinition")
    private final s pageDefinition;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f171111a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f171111a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.revolut_shop.data.model.IppProductDto", aVar, 8);
            pluginGeneratedSerialDescriptor.j("productType", false);
            pluginGeneratedSerialDescriptor.j("termsAndConditionsUri", false);
            pluginGeneratedSerialDescriptor.j("name", false);
            pluginGeneratedSerialDescriptor.j("description", false);
            pluginGeneratedSerialDescriptor.j("category", false);
            pluginGeneratedSerialDescriptor.j("variations", false);
            pluginGeneratedSerialDescriptor.j("recommendations", false);
            pluginGeneratedSerialDescriptor.j("pageDefinition", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = r.i;
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, v1Var, v1Var, nlm.a.c(v1Var), v1Var, lazyArr[5].getValue(), lazyArr[6].getValue(), nlm.a.c(s.a.f171115a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = r.i;
            dVarBeginStructure.getClass();
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            String strDecodeStringElement3 = null;
            String str = null;
            String strDecodeStringElement4 = null;
            List list = null;
            List list2 = null;
            s sVar = null;
            int i = 0;
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
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str);
                        i |= 8;
                        break;
                    case 4:
                        strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i |= 16;
                        break;
                    case 5:
                        list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, (mlm.b) lazyArr[5].getValue(), list);
                        i |= 32;
                        break;
                    case 6:
                        list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, (mlm.b) lazyArr[6].getValue(), list2);
                        i |= 64;
                        break;
                    case 7:
                        sVar = (s) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, s.a.f171115a, sVar);
                        i |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new r(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, str, strDecodeStringElement4, list, list2, sVar);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            r value = (r) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            r.i(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: j3c.r$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f171111a;
        }
    }

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        i = new Lazy[]{null, null, null, null, null, yhm.j.c(kVar, new q0(18)), yhm.j.c(kVar, new q0(19)), null};
    }

    public /* synthetic */ r(int i2, String str, String str2, String str3, String str4, String str5, List list, List list2, s sVar) {
        if (255 != (i2 & 255)) {
            j1.f(a.f171111a.getDescriptor(), i2, 255);
            throw null;
        }
        this.productType = str;
        this.termsAndConditionsUri = str2;
        this.name = str3;
        this.description = str4;
        this.category = str5;
        this.variations = list;
        this.recommendations = list2;
        this.pageDefinition = sVar;
    }

    public static final /* synthetic */ void i(r rVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, rVar.productType);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, rVar.termsAndConditionsUri);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, rVar.name);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, rVar.description);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, rVar.category);
        Lazy[] lazyArr = i;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, (mlm.h) lazyArr[5].getValue(), rVar.variations);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 6, (mlm.h) lazyArr[6].getValue(), rVar.recommendations);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, s.a.f171115a, rVar.pageDefinition);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final s getPageDefinition() {
        return this.pageDefinition;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.productType, rVar.productType) && Intrinsics.f(this.termsAndConditionsUri, rVar.termsAndConditionsUri) && Intrinsics.f(this.name, rVar.name) && Intrinsics.f(this.description, rVar.description) && Intrinsics.f(this.category, rVar.category) && Intrinsics.f(this.variations, rVar.variations) && Intrinsics.f(this.recommendations, rVar.recommendations) && Intrinsics.f(this.pageDefinition, rVar.pageDefinition);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getRecommendations() {
        return this.recommendations;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTermsAndConditionsUri() {
        return this.termsAndConditionsUri;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final List getVariations() {
        return this.variations;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.productType.hashCode() * 31, 31, this.termsAndConditionsUri), 31, this.name);
        String str = this.description;
        int iD = p.a.d(p.a.d(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.category), 31, this.variations), 31, this.recommendations);
        s sVar = this.pageDefinition;
        return iD + (sVar != null ? sVar.hashCode() : 0);
    }
}
