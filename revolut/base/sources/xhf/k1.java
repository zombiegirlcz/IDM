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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002\u0005\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u001c\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\b\u0010\u0004R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004R\u001a\u0010!\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u001b\u0010\u0004R\u001a\u0010\"\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001a\u0010#\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b\u001d\u0010\u0004¨\u0006%"}, d2 = {"Lxhf/k1;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "bin", "b", "k", "lastFour", "", "c", "Z", "e", "()Z", "cardPresent", "", "d", "I", "i", "()I", "expiryMonth", "j", "expiryYear", "f", "binScheme", "g", "binMemberName", "h", "cardBrand", "l", "productCode", "cardType", "cardSubType", "countryCode", "Companion", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class k1 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("bin")
    @NotNull
    private final String bin;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("lastFour")
    @NotNull
    private final String lastFour;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("cardPresent")
    private final boolean cardPresent;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("expiryMonth")
    private final int expiryMonth;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("expiryYear")
    private final int expiryYear;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("binScheme")
    @NotNull
    private final String binScheme;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("binMemberName")
    @NotNull
    private final String binMemberName;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("cardBrand")
    private final String cardBrand;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("productCode")
    @NotNull
    private final String productCode;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("cardType")
    @NotNull
    private final String cardType;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("cardSubType")
    @NotNull
    private final String cardSubType;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("countryCode")
    @NotNull
    private final String countryCode;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f306075a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f306075a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transactions.dto.TransactionMerchantCustomerCardDto", aVar, 12);
            pluginGeneratedSerialDescriptor.j("bin", false);
            pluginGeneratedSerialDescriptor.j("lastFour", false);
            pluginGeneratedSerialDescriptor.j("cardPresent", false);
            pluginGeneratedSerialDescriptor.j("expiryMonth", false);
            pluginGeneratedSerialDescriptor.j("expiryYear", false);
            pluginGeneratedSerialDescriptor.j("binScheme", false);
            pluginGeneratedSerialDescriptor.j("binMemberName", false);
            pluginGeneratedSerialDescriptor.j("cardBrand", false);
            pluginGeneratedSerialDescriptor.j("productCode", false);
            pluginGeneratedSerialDescriptor.j("cardType", false);
            pluginGeneratedSerialDescriptor.j("cardSubType", false);
            pluginGeneratedSerialDescriptor.j("countryCode", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            qlm.v1 v1Var = qlm.v1.f247718a;
            KSerializer kSerializerC = nlm.a.c(v1Var);
            qlm.n0 n0Var = qlm.n0.f247680a;
            return new KSerializer[]{v1Var, v1Var, qlm.h.f247648a, n0Var, n0Var, v1Var, v1Var, kSerializerC, v1Var, v1Var, v1Var, v1Var};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            String str = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            int i = 0;
            boolean zDecodeBooleanElement = false;
            int iDecodeIntElement = 0;
            int iDecodeIntElement2 = 0;
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
                        zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 2);
                        i |= 4;
                        break;
                    case 3:
                        iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i |= 8;
                        break;
                    case 4:
                        iDecodeIntElement2 = dVarBeginStructure.decodeIntElement(serialDescriptor, 4);
                        i |= 16;
                        break;
                    case 5:
                        strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i |= 32;
                        break;
                    case 6:
                        strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i |= 64;
                        break;
                    case 7:
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, qlm.v1.f247718a, str);
                        i |= 128;
                        break;
                    case 8:
                        strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i |= 256;
                        break;
                    case 9:
                        strDecodeStringElement6 = dVarBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i |= 512;
                        break;
                    case 10:
                        strDecodeStringElement7 = dVarBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i |= 1024;
                        break;
                    case 11:
                        strDecodeStringElement8 = dVarBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i |= 2048;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new k1(i, strDecodeStringElement, strDecodeStringElement2, zDecodeBooleanElement, iDecodeIntElement, iDecodeIntElement2, strDecodeStringElement3, strDecodeStringElement4, str, strDecodeStringElement5, strDecodeStringElement6, strDecodeStringElement7, strDecodeStringElement8);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            k1 value = (k1) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            k1.m(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: xhf.k1$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f306075a;
        }
    }

    public /* synthetic */ k1(int i, String str, String str2, boolean z, int i2, int i3, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        if (4095 != (i & 4095)) {
            qlm.j1.f(a.f306075a.getDescriptor(), i, 4095);
            throw null;
        }
        this.bin = str;
        this.lastFour = str2;
        this.cardPresent = z;
        this.expiryMonth = i2;
        this.expiryYear = i3;
        this.binScheme = str3;
        this.binMemberName = str4;
        this.cardBrand = str5;
        this.productCode = str6;
        this.cardType = str7;
        this.cardSubType = str8;
        this.countryCode = str9;
    }

    public static final /* synthetic */ void m(k1 k1Var, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, k1Var.bin);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, k1Var.lastFour);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 2, k1Var.cardPresent);
        compositeEncoder.encodeIntElement(serialDescriptor, 3, k1Var.expiryMonth);
        compositeEncoder.encodeIntElement(serialDescriptor, 4, k1Var.expiryYear);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, k1Var.binScheme);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, k1Var.binMemberName);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, qlm.v1.f247718a, k1Var.cardBrand);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, k1Var.productCode);
        compositeEncoder.encodeStringElement(serialDescriptor, 9, k1Var.cardType);
        compositeEncoder.encodeStringElement(serialDescriptor, 10, k1Var.cardSubType);
        compositeEncoder.encodeStringElement(serialDescriptor, 11, k1Var.countryCode);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBin() {
        return this.bin;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBinMemberName() {
        return this.binMemberName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBinScheme() {
        return this.binScheme;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCardBrand() {
        return this.cardBrand;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getCardPresent() {
        return this.cardPresent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj2;
        return Intrinsics.f(this.bin, k1Var.bin) && Intrinsics.f(this.lastFour, k1Var.lastFour) && this.cardPresent == k1Var.cardPresent && this.expiryMonth == k1Var.expiryMonth && this.expiryYear == k1Var.expiryYear && Intrinsics.f(this.binScheme, k1Var.binScheme) && Intrinsics.f(this.binMemberName, k1Var.binMemberName) && Intrinsics.f(this.cardBrand, k1Var.cardBrand) && Intrinsics.f(this.productCode, k1Var.productCode) && Intrinsics.f(this.cardType, k1Var.cardType) && Intrinsics.f(this.cardSubType, k1Var.cardSubType) && Intrinsics.f(this.countryCode, k1Var.countryCode);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCardSubType() {
        return this.cardSubType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getCardType() {
        return this.cardType;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(j6.a.b(this.expiryYear, j6.a.b(this.expiryMonth, j6.a.c(p.a.c(this.bin.hashCode() * 31, 31, this.lastFour), 31, this.cardPresent), 31), 31), 31, this.binScheme), 31, this.binMemberName);
        String str = this.cardBrand;
        return this.countryCode.hashCode() + p.a.c(p.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.productCode), 31, this.cardType), 31, this.cardSubType);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getExpiryMonth() {
        return this.expiryMonth;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getExpiryYear() {
        return this.expiryYear;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getLastFour() {
        return this.lastFour;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getProductCode() {
        return this.productCode;
    }
}
