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
import xhf.p0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\u0005\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u0005\u0010\u001bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004R\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b\u001d\u0010\u0004R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004¨\u0006$"}, d2 = {"Lxhf/g2;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "id", "b", "i", "legalName", "c", "e", "firstName", "d", "h", "lastName", "k", "phone", "m", "username", "g", "code", "country", "Lxhf/p0;", "Lxhf/p0;", "()Lxhf/p0;", "account", "j", "appMode", "l", "type", "name", "individualType", "Companion", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class g2 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("legalName")
    private final String legalName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("firstName")
    private final String firstName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("lastName")
    private final String lastName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("phone")
    private final String phone;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("username")
    private final String username;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("code")
    private final String code;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("country")
    private final String country;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("account")
    private final p0 account;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("appMode")
    private final String appMode;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("type")
    private final String type;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    private final String name;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("individualType")
    private final String individualType;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f306003a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f306003a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transactions.dto.TransactionTransferUserDto", aVar, 13);
            pluginGeneratedSerialDescriptor.j("id", false);
            pluginGeneratedSerialDescriptor.j("legalName", false);
            pluginGeneratedSerialDescriptor.j("firstName", false);
            pluginGeneratedSerialDescriptor.j("lastName", false);
            pluginGeneratedSerialDescriptor.j("phone", false);
            pluginGeneratedSerialDescriptor.j("username", false);
            pluginGeneratedSerialDescriptor.j("code", false);
            pluginGeneratedSerialDescriptor.j("country", false);
            pluginGeneratedSerialDescriptor.j("account", false);
            pluginGeneratedSerialDescriptor.j("appMode", false);
            pluginGeneratedSerialDescriptor.j("type", false);
            pluginGeneratedSerialDescriptor.j("name", false);
            pluginGeneratedSerialDescriptor.j("individualType", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            qlm.v1 v1Var = qlm.v1.f247718a;
            return new KSerializer[]{nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(p0.a.f306133a), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            String str;
            String str2;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            p0 p0Var = null;
            int i = 0;
            boolean z = true;
            while (z) {
                String str15 = str7;
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        str2 = str4;
                        str7 = str15;
                        z = false;
                        i = i;
                        str4 = str2;
                        break;
                    case 0:
                        str2 = str4;
                        str7 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, qlm.v1.f247718a, str15);
                        i |= 1;
                        str4 = str2;
                        break;
                    case 1:
                        str8 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, str8);
                        i |= 2;
                        str7 = str15;
                        break;
                    case 2:
                        str = str8;
                        str9 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qlm.v1.f247718a, str9);
                        i |= 4;
                        str7 = str15;
                        str8 = str;
                        break;
                    case 3:
                        str = str8;
                        str10 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.v1.f247718a, str10);
                        i |= 8;
                        str7 = str15;
                        str8 = str;
                        break;
                    case 4:
                        str = str8;
                        str11 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, qlm.v1.f247718a, str11);
                        i |= 16;
                        str7 = str15;
                        str8 = str;
                        break;
                    case 5:
                        str = str8;
                        str12 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, qlm.v1.f247718a, str12);
                        i |= 32;
                        str7 = str15;
                        str8 = str;
                        break;
                    case 6:
                        str = str8;
                        str13 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, qlm.v1.f247718a, str13);
                        i |= 64;
                        str7 = str15;
                        str8 = str;
                        break;
                    case 7:
                        str = str8;
                        str14 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, qlm.v1.f247718a, str14);
                        i |= 128;
                        str7 = str15;
                        str8 = str;
                        break;
                    case 8:
                        str = str8;
                        p0Var = (p0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, p0.a.f306133a, p0Var);
                        i |= 256;
                        str7 = str15;
                        str8 = str;
                        break;
                    case 9:
                        str = str8;
                        str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, qlm.v1.f247718a, str3);
                        i |= 512;
                        str7 = str15;
                        str8 = str;
                        break;
                    case 10:
                        str = str8;
                        str5 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, qlm.v1.f247718a, str5);
                        i |= 1024;
                        str7 = str15;
                        str8 = str;
                        break;
                    case 11:
                        str = str8;
                        str6 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, qlm.v1.f247718a, str6);
                        i |= 2048;
                        str7 = str15;
                        str8 = str;
                        break;
                    case 12:
                        str = str8;
                        str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, qlm.v1.f247718a, str4);
                        i |= 4096;
                        str7 = str15;
                        str8 = str;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new g2(i, str7, str8, str9, str10, str11, str12, str13, str14, p0Var, str3, str5, str6, str4);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            g2 value = (g2) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            g2.n(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: xhf.g2$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f306003a;
        }
    }

    public /* synthetic */ g2(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, p0 p0Var, String str9, String str10, String str11, String str12) {
        if (8191 != (i & 8191)) {
            qlm.j1.f(a.f306003a.getDescriptor(), i, 8191);
            throw null;
        }
        this.id = str;
        this.legalName = str2;
        this.firstName = str3;
        this.lastName = str4;
        this.phone = str5;
        this.username = str6;
        this.code = str7;
        this.country = str8;
        this.account = p0Var;
        this.appMode = str9;
        this.type = str10;
        this.name = str11;
        this.individualType = str12;
    }

    public static final /* synthetic */ void n(g2 g2Var, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        qlm.v1 v1Var = qlm.v1.f247718a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, v1Var, g2Var.id);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, v1Var, g2Var.legalName);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, v1Var, g2Var.firstName);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, v1Var, g2Var.lastName);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, v1Var, g2Var.phone);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, v1Var, g2Var.username);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, v1Var, g2Var.code);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, v1Var, g2Var.country);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, p0.a.f306133a, g2Var.account);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, v1Var, g2Var.appMode);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, v1Var, g2Var.type);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, v1Var, g2Var.name);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, v1Var, g2Var.individualType);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final p0 getAccount() {
        return this.account;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAppMode() {
        return this.appMode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj2;
        return Intrinsics.f(this.id, g2Var.id) && Intrinsics.f(this.legalName, g2Var.legalName) && Intrinsics.f(this.firstName, g2Var.firstName) && Intrinsics.f(this.lastName, g2Var.lastName) && Intrinsics.f(this.phone, g2Var.phone) && Intrinsics.f(this.username, g2Var.username) && Intrinsics.f(this.code, g2Var.code) && Intrinsics.f(this.country, g2Var.country) && Intrinsics.f(this.account, g2Var.account) && Intrinsics.f(this.appMode, g2Var.appMode) && Intrinsics.f(this.type, g2Var.type) && Intrinsics.f(this.name, g2Var.name) && Intrinsics.f(this.individualType, g2Var.individualType);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getIndividualType() {
        return this.individualType;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.legalName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.firstName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.lastName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.phone;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.username;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.code;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.country;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        p0 p0Var = this.account;
        int iHashCode9 = (iHashCode8 + (p0Var == null ? 0 : p0Var.hashCode())) * 31;
        String str9 = this.appMode;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.type;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.name;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.individualType;
        return iHashCode12 + (str12 != null ? str12.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getLegalName() {
        return this.legalName;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getUsername() {
        return this.username;
    }
}
