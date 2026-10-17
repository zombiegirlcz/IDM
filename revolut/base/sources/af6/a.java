package af6;

import af6.d;
import java.util.ArrayList;
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
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.h;
import qlm.j1;
import qlm.v1;
import uo3.a;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0003\f\u0005\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\f\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0016R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u001c\u0010(\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'¨\u0006*"}, d2 = {"Laf6/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "f", "name", "Luo3/a;", "c", "Luo3/a;", "e", "()Luo3/a;", "logo", "d", "institutionType", "countryCode", "", "Z", "()Z", "infoProvider", "g", "h", "paymentInitiation", "Laf6/a$c;", "Laf6/a$c;", "()Laf6/a$c;", "paymentInfo", "", "i", "Ljava/util/List;", "()Ljava/util/List;", "tags", "Laf6/d;", "j", "Laf6/d;", "()Laf6/d;", "userRegionCountryDepartment", "Companion", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] k = {null, null, null, null, null, null, null, null, j.c(k.PUBLICATION, new a92.d(19)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("logo")
    @NotNull
    private final uo3.a logo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("institutionType")
    @NotNull
    private final String institutionType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("countryCode")
    private final String countryCode;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("infoProvider")
    private final boolean infoProvider;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentInitiation")
    private final boolean paymentInitiation;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentInfo")
    private final c paymentInfo;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("tags")
    @NotNull
    private final List<String> tags;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("userRegionCountryDepartment")
    private final d userRegionCountryDepartment;

    /* JADX INFO: renamed from: af6.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0012a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0012a f3910a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            C0012a c0012a = new C0012a();
            f3910a = c0012a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.external_accounts.impl.data.cross_border.entity.CrossBorderExternalInstitutionEntity", c0012a, 10);
            pluginGeneratedSerialDescriptor.j("id", false);
            pluginGeneratedSerialDescriptor.j("name", false);
            pluginGeneratedSerialDescriptor.j("logo", false);
            pluginGeneratedSerialDescriptor.j("institutionType", false);
            pluginGeneratedSerialDescriptor.j("countryCode", false);
            pluginGeneratedSerialDescriptor.j("infoProvider", false);
            pluginGeneratedSerialDescriptor.j("paymentInitiation", false);
            pluginGeneratedSerialDescriptor.j("paymentInfo", false);
            pluginGeneratedSerialDescriptor.j("tags", false);
            pluginGeneratedSerialDescriptor.j("userRegionCountryDepartment", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private C0012a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = a.k;
            v1 v1Var = v1.f247718a;
            h hVar = h.f247648a;
            return new KSerializer[]{v1Var, v1Var, a.C1556a.f281535a, v1Var, nlm.a.c(v1Var), hVar, hVar, nlm.a.c(c.C0013a.f3914a), lazyArr[8].getValue(), nlm.a.c(d.a.f3927a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = a.k;
            dVarBeginStructure.getClass();
            List list = null;
            d dVar = null;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            uo3.a aVar = null;
            String strDecodeStringElement3 = null;
            String str = null;
            c cVar = null;
            boolean z = true;
            int i = 0;
            boolean zDecodeBooleanElement = false;
            boolean zDecodeBooleanElement2 = false;
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
                        aVar = (uo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, a.C1556a.f281535a, aVar);
                        i |= 4;
                        break;
                    case 3:
                        strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i |= 8;
                        break;
                    case 4:
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str);
                        i |= 16;
                        break;
                    case 5:
                        zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 5);
                        i |= 32;
                        break;
                    case 6:
                        zDecodeBooleanElement2 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 6);
                        i |= 64;
                        break;
                    case 7:
                        cVar = (c) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, c.C0013a.f3914a, cVar);
                        i |= 128;
                        break;
                    case 8:
                        list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 8, (mlm.b) lazyArr[8].getValue(), list);
                        i |= 256;
                        break;
                    case 9:
                        dVar = (d) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, d.a.f3927a, dVar);
                        i |= 512;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new a(i, strDecodeStringElement, strDecodeStringElement2, aVar, strDecodeStringElement3, str, zDecodeBooleanElement, zDecodeBooleanElement2, cVar, list, dVar);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            a value = (a) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            a.k(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: af6.a$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return C0012a.f3910a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0002\u0006\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0006\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0012\u0010\u0004¨\u0006\u0016"}, d2 = {"Laf6/a$c;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "c", "()Z", "mandateInitiation", "b", "Ljava/lang/String;", "e", "topUpSystem", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "ibanRequired", "d", "hasActiveMandate", "supportedCurrencyCode", "Companion", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class c {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("mandateInitiation")
        private final boolean mandateInitiation;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("topUpSystem")
        private final String topUpSystem;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("ibanRequired")
        private final Boolean ibanRequired;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("hasActiveMandate")
        private final Boolean hasActiveMandate;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("supportedCurrencyCode")
        private final String supportedCurrencyCode;

        /* JADX INFO: renamed from: af6.a$c$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0013a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0013a f3914a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                C0013a c0013a = new C0013a();
                f3914a = c0013a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.external_accounts.impl.data.cross_border.entity.CrossBorderExternalInstitutionEntity.PaymentInfoEntity", c0013a, 5);
                pluginGeneratedSerialDescriptor.j("mandateInitiation", false);
                pluginGeneratedSerialDescriptor.j("topUpSystem", false);
                pluginGeneratedSerialDescriptor.j("ibanRequired", false);
                pluginGeneratedSerialDescriptor.j("hasActiveMandate", false);
                pluginGeneratedSerialDescriptor.j("supportedCurrencyCode", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private C0013a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                h hVar = h.f247648a;
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{hVar, nlm.a.c(v1Var), nlm.a.c(hVar), nlm.a.c(hVar), nlm.a.c(v1Var)};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                int i = 0;
                boolean zDecodeBooleanElement = false;
                String str = null;
                Boolean bool = null;
                Boolean bool2 = null;
                String str2 = null;
                boolean z = true;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                        i |= 1;
                    } else if (iD == 1) {
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str);
                        i |= 2;
                    } else if (iD == 2) {
                        bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, h.f247648a, bool);
                        i |= 4;
                    } else if (iD == 3) {
                        bool2 = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, h.f247648a, bool2);
                        i |= 8;
                    } else {
                        if (iD != 4) {
                            throw new UnknownFieldException(iD);
                        }
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str2);
                        i |= 16;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new c(i, zDecodeBooleanElement, str, bool, bool2, str2);
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
                c.f(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: af6.a$c$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return C0013a.f3914a;
            }
        }

        public /* synthetic */ c(int i, boolean z, String str, Boolean bool, Boolean bool2, String str2) {
            if (31 != (i & 31)) {
                j1.f(C0013a.f3914a.getDescriptor(), i, 31);
                throw null;
            }
            this.mandateInitiation = z;
            this.topUpSystem = str;
            this.ibanRequired = bool;
            this.hasActiveMandate = bool2;
            this.supportedCurrencyCode = str2;
        }

        public static final /* synthetic */ void f(c cVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, cVar.mandateInitiation);
            v1 v1Var = v1.f247718a;
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, v1Var, cVar.topUpSystem);
            h hVar = h.f247648a;
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, hVar, cVar.ibanRequired);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, hVar, cVar.hasActiveMandate);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, v1Var, cVar.supportedCurrencyCode);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Boolean getHasActiveMandate() {
            return this.hasActiveMandate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Boolean getIbanRequired() {
            return this.ibanRequired;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getMandateInitiation() {
            return this.mandateInitiation;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getSupportedCurrencyCode() {
            return this.supportedCurrencyCode;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getTopUpSystem() {
            return this.topUpSystem;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return this.mandateInitiation == cVar.mandateInitiation && Intrinsics.f(this.topUpSystem, cVar.topUpSystem) && Intrinsics.f(this.ibanRequired, cVar.ibanRequired) && Intrinsics.f(this.hasActiveMandate, cVar.hasActiveMandate) && Intrinsics.f(this.supportedCurrencyCode, cVar.supportedCurrencyCode);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.mandateInitiation) * 31;
            String str = this.topUpSystem;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.ibanRequired;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.hasActiveMandate;
            int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str2 = this.supportedCurrencyCode;
            return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
        }

        public c(boolean z, String str, Boolean bool, Boolean bool2, String str2) {
            this.mandateInitiation = z;
            this.topUpSystem = str;
            this.ibanRequired = bool;
            this.hasActiveMandate = bool2;
            this.supportedCurrencyCode = str2;
        }
    }

    public /* synthetic */ a(int i, String str, String str2, uo3.a aVar, String str3, String str4, boolean z, boolean z3, c cVar, List list, d dVar) {
        if (1023 != (i & 1023)) {
            j1.f(C0012a.f3910a.getDescriptor(), i, 1023);
            throw null;
        }
        this.id = str;
        this.name = str2;
        this.logo = aVar;
        this.institutionType = str3;
        this.countryCode = str4;
        this.infoProvider = z;
        this.paymentInitiation = z3;
        this.paymentInfo = cVar;
        this.tags = list;
        this.userRegionCountryDepartment = dVar;
    }

    public static final /* synthetic */ void k(a aVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, aVar.id);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, aVar.name);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, a.C1556a.f281535a, aVar.logo);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, aVar.institutionType);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, aVar.countryCode);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 5, aVar.infoProvider);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 6, aVar.paymentInitiation);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, c.C0013a.f3914a, aVar.paymentInfo);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 8, (mlm.h) k[8].getValue(), aVar.tags);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, d.a.f3927a, aVar.userRegionCountryDepartment);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getInfoProvider() {
        return this.infoProvider;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getInstitutionType() {
        return this.institutionType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final uo3.a getLogo() {
        return this.logo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.name, aVar.name) && Intrinsics.f(this.logo, aVar.logo) && Intrinsics.f(this.institutionType, aVar.institutionType) && Intrinsics.f(this.countryCode, aVar.countryCode) && this.infoProvider == aVar.infoProvider && this.paymentInitiation == aVar.paymentInitiation && Intrinsics.f(this.paymentInfo, aVar.paymentInfo) && Intrinsics.f(this.tags, aVar.tags) && Intrinsics.f(this.userRegionCountryDepartment, aVar.userRegionCountryDepartment);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final c getPaymentInfo() {
        return this.paymentInfo;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getPaymentInitiation() {
        return this.paymentInitiation;
    }

    public final int hashCode() {
        int iC = p.a.c((this.logo.hashCode() + p.a.c(this.id.hashCode() * 31, 31, this.name)) * 31, 31, this.institutionType);
        String str = this.countryCode;
        int iC2 = j6.a.c(j6.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.infoProvider), 31, this.paymentInitiation);
        c cVar = this.paymentInfo;
        int iD = p.a.d((iC2 + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, this.tags);
        d dVar = this.userRegionCountryDepartment;
        return iD + (dVar != null ? dVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final List getTags() {
        return this.tags;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final d getUserRegionCountryDepartment() {
        return this.userRegionCountryDepartment;
    }

    public a(String id10, String name, uo3.a logo, String institutionType, String str, boolean z, boolean z3, c cVar, ArrayList tags, d dVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(institutionType, "institutionType");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.id = id10;
        this.name = name;
        this.logo = logo;
        this.institutionType = institutionType;
        this.countryCode = str;
        this.infoProvider = z;
        this.paymentInitiation = z3;
        this.paymentInfo = cVar;
        this.tags = tags;
        this.userRegionCountryDepartment = dVar;
    }
}
