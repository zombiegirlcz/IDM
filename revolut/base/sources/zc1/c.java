package zc1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
import qlm.f0;
import qlm.j1;
import qlm.t0;
import qlm.v1;
import qlm.x;
import zc0.m;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010$\n\u0002\b\u0006\b\u0087\b\u0018\u0000 22\u00020\u0001:\u0004\u0007\u001a\u0005\fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0007\u0010\u0004R \u0010\u0011\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u0010\u0010\t\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0017\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0013\u0012\u0004\b\u0016\u0010\t\u001a\u0004\b\u0014\u0010\u0015R(\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\t\u001a\u0004\b\u001c\u0010\u001dR \u0010#\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\r\u0012\u0004\b\"\u0010\t\u001a\u0004\b!\u0010\u000fR \u0010&\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\r\u0012\u0004\b%\u0010\t\u001a\u0004\b$\u0010\u000fR\"\u0010(\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u0012\u0004\b'\u0010\t\u001a\u0004\b\u0005\u0010\u0004R\"\u0010*\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\u0006\u0012\u0004\b)\u0010\t\u001a\u0004\b\u001a\u0010\u0004R\"\u0010,\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010\u0006\u0012\u0004\b+\u0010\t\u001a\u0004\b \u0010\u0004R.\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010.\u0012\u0004\b0\u0010\t\u001a\u0004\b\f\u0010/¨\u00063"}, d2 = {"Lzc1/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "getName$annotations", "()V", "name", "", "b", "J", "j", "()J", "getUnitPriceAmount$annotations", "unitPriceAmount", "Lzc1/c$c;", "Lzc1/c$c;", "f", "()Lzc1/c$c;", "getQuantity$annotations", "quantity", "", "Lzc1/c$d;", "d", "Ljava/util/List;", "g", "()Ljava/util/List;", "getTaxes$annotations", "taxes", "e", "h", "getTotalAmount$annotations", "totalAmount", "i", "getTotalTaxAmount$annotations", "totalTaxAmount", "getDescription$annotations", "description", "getProductId$annotations", "productId", "getProductVariationId$annotations", "productVariationId", "", "Ljava/util/Map;", "()Ljava/util/Map;", "getMetadata$annotations", "metadata", "Companion", "feature_acquiring_lite_pos_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class c {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] k;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("unitPriceAmount")
    private final long unitPriceAmount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("quantity")
    @NotNull
    private final C1776c quantity;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("taxes")
    private final List<d> taxes;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("totalAmount")
    private final long totalAmount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("totalTaxAmount")
    private final long totalTaxAmount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("productId")
    private final String productId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("productVariationId")
    private final String productVariationId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("metadata")
    private final Map<String, String> metadata;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f321192a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f321192a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.acquiring.lite_pos.api.data.model.CatalogueLineItemDto", aVar, 10);
            pluginGeneratedSerialDescriptor.j("name", false);
            pluginGeneratedSerialDescriptor.j("unitPriceAmount", false);
            pluginGeneratedSerialDescriptor.j("quantity", false);
            pluginGeneratedSerialDescriptor.j("taxes", false);
            pluginGeneratedSerialDescriptor.j("totalAmount", false);
            pluginGeneratedSerialDescriptor.j("totalTaxAmount", false);
            pluginGeneratedSerialDescriptor.j("description", false);
            pluginGeneratedSerialDescriptor.j("productId", false);
            pluginGeneratedSerialDescriptor.j("productVariationId", true);
            pluginGeneratedSerialDescriptor.j("metadata", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = c.k;
            v1 v1Var = v1.f247718a;
            KSerializer kSerializerC = nlm.a.c((KSerializer) lazyArr[3].getValue());
            KSerializer kSerializerC2 = nlm.a.c(v1Var);
            KSerializer kSerializerC3 = nlm.a.c(v1Var);
            KSerializer kSerializerC4 = nlm.a.c(v1Var);
            KSerializer kSerializerC5 = nlm.a.c((KSerializer) lazyArr[9].getValue());
            t0 t0Var = t0.f247706a;
            return new KSerializer[]{v1Var, t0Var, C1776c.a.f321195a, kSerializerC, t0Var, t0Var, kSerializerC2, kSerializerC3, kSerializerC4, kSerializerC5};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Lazy[] lazyArr;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr2 = c.k;
            dVarBeginStructure.getClass();
            String str = null;
            Map map = null;
            String strDecodeStringElement = null;
            C1776c c1776c = null;
            List list = null;
            long jDecodeLongElement = 0;
            long jDecodeLongElement2 = 0;
            long jDecodeLongElement3 = 0;
            int i = 0;
            boolean z = true;
            String str2 = null;
            String str3 = null;
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
                        c1776c = (C1776c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, C1776c.a.f321195a, c1776c);
                        i |= 4;
                        break;
                    case 3:
                        lazyArr = lazyArr2;
                        list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), list);
                        i |= 8;
                        break;
                    case 4:
                        lazyArr = lazyArr2;
                        jDecodeLongElement2 = dVarBeginStructure.decodeLongElement(serialDescriptor, 4);
                        i |= 16;
                        break;
                    case 5:
                        lazyArr = lazyArr2;
                        jDecodeLongElement3 = dVarBeginStructure.decodeLongElement(serialDescriptor, 5);
                        i |= 32;
                        break;
                    case 6:
                        lazyArr = lazyArr2;
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, v1.f247718a, str);
                        i |= 64;
                        break;
                    case 7:
                        lazyArr = lazyArr2;
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, v1.f247718a, str2);
                        i |= 128;
                        break;
                    case 8:
                        lazyArr = lazyArr2;
                        str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, v1.f247718a, str3);
                        i |= 256;
                        break;
                    case 9:
                        lazyArr = lazyArr2;
                        map = (Map) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, (mlm.b) lazyArr2[9].getValue(), map);
                        i |= 512;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
                lazyArr2 = lazyArr;
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new c(i, strDecodeStringElement, jDecodeLongElement, c1776c, list, jDecodeLongElement2, jDecodeLongElement3, str, str2, str3, map);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            c value = (c) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            c.k(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: zc1.c$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f321192a;
        }
    }

    /* JADX INFO: renamed from: zc1.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\f\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0006\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\r\u0012\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0011"}, d2 = {"Lzc1/c$c;", "", "", "toString", "()Ljava/lang/String;", "", "a", "D", "b", "()D", "getValue$annotations", "()V", "value", "Ljava/lang/String;", "getUnit$annotations", "unit", "Companion", "feature_acquiring_lite_pos_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class C1776c {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("value")
        private final double value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("unit")
        @NotNull
        private final String unit;

        /* JADX INFO: renamed from: zc1.c$c$a */
        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f321195a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f321195a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.acquiring.lite_pos.api.data.model.CatalogueLineItemDto.QuantityDto", aVar, 2);
                pluginGeneratedSerialDescriptor.j("value", false);
                pluginGeneratedSerialDescriptor.j("unit", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{x.f247723a, v1.f247718a};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                double dDecodeDoubleElement = 0.0d;
                String strDecodeStringElement = null;
                boolean z = true;
                int i = 0;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        dDecodeDoubleElement = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 0);
                        i |= 1;
                    } else {
                        if (iD != 1) {
                            throw new UnknownFieldException(iD);
                        }
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new C1776c(dDecodeDoubleElement, i, strDecodeStringElement);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                C1776c value = (C1776c) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                C1776c.c(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: zc1.c$c$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f321195a;
            }
        }

        public /* synthetic */ C1776c(double d, int i, String str) {
            if (3 != (i & 3)) {
                j1.f(a.f321195a.getDescriptor(), i, 3);
                throw null;
            }
            this.value = d;
            this.unit = str;
        }

        public static final /* synthetic */ void c(C1776c c1776c, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 0, c1776c.value);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, c1776c.unit);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getUnit() {
            return this.unit;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final double getValue() {
            return this.value;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C1776c)) {
                return false;
            }
            C1776c c1776c = (C1776c) obj2;
            return Double.compare(this.value, c1776c.value) == 0 && Intrinsics.f(this.unit, c1776c.unit);
        }

        public final int hashCode() {
            return this.unit.hashCode() + (Double.hashCode(this.value) * 31);
        }

        public C1776c(double d, String unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.value = d;
            this.unit = unit;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0002\u0005\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0007\u0010\u0004R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\f\u0010\t\u001a\u0004\b\u000b\u0010\u0004R \u0010\u0013\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0012\u0010\t\u001a\u0004\b\u0005\u0010\u0011R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0015\u0012\u0004\b\u0017\u0010\t\u001a\u0004\b\u000f\u0010\u0016¨\u0006\u001a"}, d2 = {"Lzc1/c$d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "getRateId$annotations", "()V", "rateId", "b", "getName$annotations", "name", "", "c", "J", "()J", "getAmount$annotations", "amount", "", "Ljava/lang/Double;", "()Ljava/lang/Double;", "getRate$annotations", "rate", "Companion", "feature_acquiring_lite_pos_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class d {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("rateId")
        private final String rateId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("amount")
        private final long amount;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("rate")
        private final Double rate;

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f321199a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f321199a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.acquiring.lite_pos.api.data.model.CatalogueLineItemDto.TaxDto", aVar, 4);
                pluginGeneratedSerialDescriptor.j("rateId", false);
                pluginGeneratedSerialDescriptor.j("name", false);
                pluginGeneratedSerialDescriptor.j("amount", false);
                pluginGeneratedSerialDescriptor.j("rate", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{nlm.a.c(v1Var), v1Var, t0.f247706a, nlm.a.c(x.f247723a)};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                int i = 0;
                String str = null;
                String strDecodeStringElement = null;
                Double d = null;
                long jDecodeLongElement = 0;
                boolean z = true;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, str);
                        i |= 1;
                    } else if (iD == 1) {
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                    } else if (iD == 2) {
                        jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 2);
                        i |= 4;
                    } else {
                        if (iD != 3) {
                            throw new UnknownFieldException(iD);
                        }
                        d = (Double) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, x.f247723a, d);
                        i |= 8;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new d(i, str, strDecodeStringElement, jDecodeLongElement, d);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                d value = (d) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                d.e(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: zc1.c$d$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f321199a;
            }
        }

        public /* synthetic */ d(int i, String str, String str2, long j2, Double d) {
            if (15 != (i & 15)) {
                j1.f(a.f321199a.getDescriptor(), i, 15);
                throw null;
            }
            this.rateId = str;
            this.name = str2;
            this.amount = j2;
            this.rate = d;
        }

        public static final /* synthetic */ void e(d dVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, dVar.rateId);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, dVar.name);
            compositeEncoder.encodeLongElement(serialDescriptor, 2, dVar.amount);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, x.f247723a, dVar.rate);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getAmount() {
            return this.amount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Double getRate() {
            return this.rate;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getRateId() {
            return this.rateId;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.rateId, dVar.rateId) && Intrinsics.f(this.name, dVar.name) && this.amount == dVar.amount && Intrinsics.f(this.rate, dVar.rate);
        }

        public final int hashCode() {
            String str = this.rateId;
            int iC = a0.d.c(p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.name), 31, this.amount);
            Double d = this.rate;
            return iC + (d != null ? d.hashCode() : 0);
        }

        public d(String str, String name, long j2, Double d) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.rateId = str;
            this.name = name;
            this.amount = j2;
            this.rate = d;
        }
    }

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        k = new Lazy[]{null, null, null, yhm.j.c(kVar, new m(3)), null, null, null, null, null, yhm.j.c(kVar, new m(4))};
    }

    public /* synthetic */ c(int i, String str, long j2, C1776c c1776c, List list, long j3, long j5, String str2, String str3, String str4, Map map) {
        if (767 != (i & 767)) {
            j1.f(a.f321192a.getDescriptor(), i, 767);
            throw null;
        }
        this.name = str;
        this.unitPriceAmount = j2;
        this.quantity = c1776c;
        this.taxes = list;
        this.totalAmount = j3;
        this.totalTaxAmount = j5;
        this.description = str2;
        this.productId = str3;
        if ((i & 256) == 0) {
            this.productVariationId = null;
        } else {
            this.productVariationId = str4;
        }
        this.metadata = map;
    }

    public static final /* synthetic */ void k(c cVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, cVar.name);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, cVar.unitPriceAmount);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, C1776c.a.f321195a, cVar.quantity);
        Lazy[] lazyArr = k;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), cVar.taxes);
        compositeEncoder.encodeLongElement(serialDescriptor, 4, cVar.totalAmount);
        compositeEncoder.encodeLongElement(serialDescriptor, 5, cVar.totalTaxAmount);
        v1 v1Var = v1.f247718a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, v1Var, cVar.description);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, v1Var, cVar.productId);
        if (compositeEncoder.d(serialDescriptor) || cVar.productVariationId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, v1Var, cVar.productVariationId);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, (mlm.h) lazyArr[9].getValue(), cVar.metadata);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Map getMetadata() {
        return this.metadata;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getProductVariationId() {
        return this.productVariationId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.name, cVar.name) && this.unitPriceAmount == cVar.unitPriceAmount && Intrinsics.f(this.quantity, cVar.quantity) && Intrinsics.f(this.taxes, cVar.taxes) && this.totalAmount == cVar.totalAmount && this.totalTaxAmount == cVar.totalTaxAmount && Intrinsics.f(this.description, cVar.description) && Intrinsics.f(this.productId, cVar.productId) && Intrinsics.f(this.productVariationId, cVar.productVariationId) && Intrinsics.f(this.metadata, cVar.metadata);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C1776c getQuantity() {
        return this.quantity;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final List getTaxes() {
        return this.taxes;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getTotalAmount() {
        return this.totalAmount;
    }

    public final int hashCode() {
        int iHashCode = (this.quantity.hashCode() + a0.d.c(this.name.hashCode() * 31, 31, this.unitPriceAmount)) * 31;
        List<d> list = this.taxes;
        int iC = a0.d.c(a0.d.c((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.totalAmount), 31, this.totalTaxAmount);
        String str = this.description;
        int iHashCode2 = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.productId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.productVariationId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, String> map = this.metadata;
        return iHashCode4 + (map != null ? map.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getTotalTaxAmount() {
        return this.totalTaxAmount;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getUnitPriceAmount() {
        return this.unitPriceAmount;
    }

    public c(String name, long j2, C1776c quantity, ArrayList arrayList, long j3, long j5, String str, String str2, String str3, Map map) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        this.name = name;
        this.unitPriceAmount = j2;
        this.quantity = quantity;
        this.taxes = arrayList;
        this.totalAmount = j3;
        this.totalTaxAmount = j5;
        this.description = str;
        this.productId = str2;
        this.productVariationId = str3;
        this.metadata = map;
    }
}
