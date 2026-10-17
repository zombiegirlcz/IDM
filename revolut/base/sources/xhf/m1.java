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
import qo3.a;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 52\u00020\u0001:\u0002\u0005\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u001b\u0010\u0004R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u001d\u0010\u0004R\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\u0004R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\"\u0010)\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b\u0015\u0010&R\u001c\u0010*\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010-\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u0006\u001a\u0004\b,\u0010\u0004R\u001c\u0010/\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b.\u0010\u0004R\u001c\u00104\u001a\u0004\u0018\u0001008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b\u001f\u00103¨\u00066"}, d2 = {"Lxhf/m1;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "j", "id", "b", "n", "merchantId", "c", "o", "name", "d", "m", "mcc", "e", "g", "category", "f", "h", "city", "i", "country", "address", "r", "state", "p", "postcode", "k", "l", "logo", "bgColor", "blockedMerchantId", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getCanBeBlocked$annotations", "()V", "canBeBlocked", "blockEligibility", "brandId", "q", "scheme", "getUrl", "url", "Lqo3/a;", "s", "Lqo3/a;", "()Lqo3/a;", "location", "Companion", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class m1 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("merchantId")
    private final String merchantId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    private final String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("mcc")
    private final String mcc;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("category")
    private final String category;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("city")
    private final String city;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("country")
    private final String country;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("address")
    private final String address;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("state")
    private final String state;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("postcode")
    private final String postcode;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("logo")
    private final String logo;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("bgColor")
    private final String bgColor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("blockedMerchantId")
    private final String blockedMerchantId;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("canBeBlocked")
    private final Boolean canBeBlocked;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("blockEligibility")
    private final String blockEligibility;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("brandId")
    private final String brandId;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("scheme")
    private final String scheme;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("url")
    private final String url;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("location")
    private final qo3.a location;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f306108a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f306108a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transactions.dto.TransactionMerchantDto", aVar, 19);
            pluginGeneratedSerialDescriptor.j("id", false);
            pluginGeneratedSerialDescriptor.j("merchantId", false);
            pluginGeneratedSerialDescriptor.j("name", false);
            pluginGeneratedSerialDescriptor.j("mcc", false);
            pluginGeneratedSerialDescriptor.j("category", false);
            pluginGeneratedSerialDescriptor.j("city", false);
            pluginGeneratedSerialDescriptor.j("country", false);
            pluginGeneratedSerialDescriptor.j("address", false);
            pluginGeneratedSerialDescriptor.j("state", false);
            pluginGeneratedSerialDescriptor.j("postcode", false);
            pluginGeneratedSerialDescriptor.j("logo", false);
            pluginGeneratedSerialDescriptor.j("bgColor", false);
            pluginGeneratedSerialDescriptor.j("blockedMerchantId", false);
            pluginGeneratedSerialDescriptor.j("canBeBlocked", false);
            pluginGeneratedSerialDescriptor.j("blockEligibility", false);
            pluginGeneratedSerialDescriptor.j("brandId", false);
            pluginGeneratedSerialDescriptor.j("scheme", false);
            pluginGeneratedSerialDescriptor.j("url", false);
            pluginGeneratedSerialDescriptor.j("location", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            qlm.v1 v1Var = qlm.v1.f247718a;
            return new KSerializer[]{nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(qlm.h.f247648a), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(a.C1353a.f248002a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            String str;
            int i;
            Boolean bool;
            String str2;
            String str3;
            String str4;
            Boolean bool2;
            String str5;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            String str6 = null;
            Boolean bool3 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            qo3.a aVar = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            String str22 = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                String str23 = str14;
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        bool = bool3;
                        str2 = str15;
                        str3 = str19;
                        str4 = str7;
                        z = false;
                        str7 = str4;
                        str14 = str23;
                        str15 = str2;
                        bool3 = bool;
                        str19 = str3;
                        break;
                    case 0:
                        bool = bool3;
                        str2 = str15;
                        str3 = str19;
                        str4 = str7;
                        str17 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, qlm.v1.f247718a, str17);
                        i2 |= 1;
                        str7 = str4;
                        str14 = str23;
                        str15 = str2;
                        bool3 = bool;
                        str19 = str3;
                        break;
                    case 1:
                        bool2 = bool3;
                        str5 = str15;
                        str18 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, str18);
                        i2 |= 2;
                        str19 = str19;
                        str14 = str23;
                        str15 = str5;
                        bool3 = bool2;
                        break;
                    case 2:
                        bool2 = bool3;
                        str5 = str15;
                        str19 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qlm.v1.f247718a, str19);
                        i2 |= 4;
                        str14 = str23;
                        str15 = str5;
                        bool3 = bool2;
                        break;
                    case 3:
                        bool2 = bool3;
                        str5 = str15;
                        str20 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.v1.f247718a, str20);
                        i2 |= 8;
                        str14 = str23;
                        str15 = str5;
                        bool3 = bool2;
                        break;
                    case 4:
                        bool2 = bool3;
                        str5 = str15;
                        str21 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, qlm.v1.f247718a, str21);
                        i2 |= 16;
                        str14 = str23;
                        str15 = str5;
                        bool3 = bool2;
                        break;
                    case 5:
                        bool2 = bool3;
                        str5 = str15;
                        str22 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, qlm.v1.f247718a, str22);
                        i2 |= 32;
                        str14 = str23;
                        str15 = str5;
                        bool3 = bool2;
                        break;
                    case 6:
                        bool2 = bool3;
                        str5 = str15;
                        str14 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, qlm.v1.f247718a, str23);
                        i2 |= 64;
                        str15 = str5;
                        bool3 = bool2;
                        break;
                    case 7:
                        bool2 = bool3;
                        str15 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, qlm.v1.f247718a, str15);
                        i2 |= 128;
                        str14 = str23;
                        bool3 = bool2;
                        break;
                    case 8:
                        str = str15;
                        str16 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, qlm.v1.f247718a, str16);
                        i2 |= 256;
                        str14 = str23;
                        str15 = str;
                        break;
                    case 9:
                        str = str15;
                        str6 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, qlm.v1.f247718a, str6);
                        i2 |= 512;
                        str14 = str23;
                        str15 = str;
                        break;
                    case 10:
                        str = str15;
                        str8 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, qlm.v1.f247718a, str8);
                        i2 |= 1024;
                        str14 = str23;
                        str15 = str;
                        break;
                    case 11:
                        str = str15;
                        str9 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, qlm.v1.f247718a, str9);
                        i2 |= 2048;
                        str14 = str23;
                        str15 = str;
                        break;
                    case 12:
                        str = str15;
                        str7 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, qlm.v1.f247718a, str7);
                        i2 |= 4096;
                        str14 = str23;
                        str15 = str;
                        break;
                    case 13:
                        str = str15;
                        bool3 = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, qlm.h.f247648a, bool3);
                        i2 |= 8192;
                        str14 = str23;
                        str15 = str;
                        break;
                    case 14:
                        str = str15;
                        str10 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, qlm.v1.f247718a, str10);
                        i2 |= 16384;
                        str14 = str23;
                        str15 = str;
                        break;
                    case 15:
                        str = str15;
                        str11 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, qlm.v1.f247718a, str11);
                        i = 32768;
                        i2 |= i;
                        str14 = str23;
                        str15 = str;
                        break;
                    case 16:
                        str = str15;
                        str12 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, qlm.v1.f247718a, str12);
                        i = 65536;
                        i2 |= i;
                        str14 = str23;
                        str15 = str;
                        break;
                    case 17:
                        str = str15;
                        str13 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, qlm.v1.f247718a, str13);
                        i = 131072;
                        i2 |= i;
                        str14 = str23;
                        str15 = str;
                        break;
                    case 18:
                        str = str15;
                        aVar = (qo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, a.C1353a.f248002a, aVar);
                        i = 262144;
                        i2 |= i;
                        str14 = str23;
                        str15 = str;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            Boolean bool4 = bool3;
            String str24 = str15;
            dVarBeginStructure.endStructure(serialDescriptor);
            return new m1(i2, str17, str18, str19, str20, str21, str22, str14, str24, str16, str6, str8, str9, str7, bool4, str10, str11, str12, str13, aVar);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            m1 value = (m1) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            m1.s(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: xhf.m1$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f306108a;
        }
    }

    public /* synthetic */ m1(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool, String str14, String str15, String str16, String str17, qo3.a aVar) {
        if (262143 != (i & 262143)) {
            qlm.j1.f(a.f306108a.getDescriptor(), i, 262143);
            throw null;
        }
        this.id = str;
        this.merchantId = str2;
        this.name = str3;
        this.mcc = str4;
        this.category = str5;
        this.city = str6;
        this.country = str7;
        this.address = str8;
        this.state = str9;
        this.postcode = str10;
        this.logo = str11;
        this.bgColor = str12;
        this.blockedMerchantId = str13;
        this.canBeBlocked = bool;
        this.blockEligibility = str14;
        this.brandId = str15;
        this.scheme = str16;
        this.url = str17;
        if ((i & 262144) == 0) {
            this.location = null;
        } else {
            this.location = aVar;
        }
    }

    public static final /* synthetic */ void s(m1 m1Var, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        qlm.v1 v1Var = qlm.v1.f247718a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, v1Var, m1Var.id);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, v1Var, m1Var.merchantId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, v1Var, m1Var.name);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, v1Var, m1Var.mcc);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, v1Var, m1Var.category);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, v1Var, m1Var.city);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, v1Var, m1Var.country);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, v1Var, m1Var.address);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, v1Var, m1Var.state);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, v1Var, m1Var.postcode);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, v1Var, m1Var.logo);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, v1Var, m1Var.bgColor);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, v1Var, m1Var.blockedMerchantId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, qlm.h.f247648a, m1Var.canBeBlocked);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, v1Var, m1Var.blockEligibility);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, v1Var, m1Var.brandId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, v1Var, m1Var.scheme);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, v1Var, m1Var.url);
        if (!compositeEncoder.d(serialDescriptor) && m1Var.location == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, a.C1353a.f248002a, m1Var.location);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBgColor() {
        return this.bgColor;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBlockEligibility() {
        return this.blockEligibility;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getBlockedMerchantId() {
        return this.blockedMerchantId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getBrandId() {
        return this.brandId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj2;
        return Intrinsics.f(this.id, m1Var.id) && Intrinsics.f(this.merchantId, m1Var.merchantId) && Intrinsics.f(this.name, m1Var.name) && Intrinsics.f(this.mcc, m1Var.mcc) && Intrinsics.f(this.category, m1Var.category) && Intrinsics.f(this.city, m1Var.city) && Intrinsics.f(this.country, m1Var.country) && Intrinsics.f(this.address, m1Var.address) && Intrinsics.f(this.state, m1Var.state) && Intrinsics.f(this.postcode, m1Var.postcode) && Intrinsics.f(this.logo, m1Var.logo) && Intrinsics.f(this.bgColor, m1Var.bgColor) && Intrinsics.f(this.blockedMerchantId, m1Var.blockedMerchantId) && Intrinsics.f(this.canBeBlocked, m1Var.canBeBlocked) && Intrinsics.f(this.blockEligibility, m1Var.blockEligibility) && Intrinsics.f(this.brandId, m1Var.brandId) && Intrinsics.f(this.scheme, m1Var.scheme) && Intrinsics.f(this.url, m1Var.url) && Intrinsics.f(this.location, m1Var.location);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Boolean getCanBeBlocked() {
        return this.canBeBlocked;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.merchantId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.mcc;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.category;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.city;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.country;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.address;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.state;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.postcode;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.logo;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.bgColor;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.blockedMerchantId;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Boolean bool = this.canBeBlocked;
        int iHashCode14 = (iHashCode13 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str14 = this.blockEligibility;
        int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.brandId;
        int iHashCode16 = (iHashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.scheme;
        int iHashCode17 = (iHashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.url;
        int iHashCode18 = (iHashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
        qo3.a aVar = this.location;
        return iHashCode18 + (aVar != null ? aVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final qo3.a getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getMcc() {
        return this.mcc;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getMerchantId() {
        return this.merchantId;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getPostcode() {
        return this.postcode;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getScheme() {
        return this.scheme;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getState() {
        return this.state;
    }
}
