package cl5;

import bl5.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import lg.b;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import plm.d;
import qlm.f0;
import qlm.j1;
import qlm.t0;
import qlm.v1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\b\u0087\b\u0018\u0000 12\u00020\u0001:\u0003\u000e\u000b\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0007\u0010\u0004R\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\f\u0010\t\u001a\u0004\b\u0005\u0010\u0004R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0006\u0012\u0004\b\u0010\u0010\t\u001a\u0004\b\u000f\u0010\u0004R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0006\u0012\u0004\b\u0013\u0010\t\u001a\u0004\b\u0012\u0010\u0004R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0006\u0012\u0004\b\u0016\u0010\t\u001a\u0004\b\u0015\u0010\u0004R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0006\u0012\u0004\b\u0018\u0010\t\u001a\u0004\b\u000e\u0010\u0004R\"\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001e\u0010\t\u001a\u0004\b\u000b\u0010\u001dR\"\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\u0006\u0012\u0004\b!\u0010\t\u001a\u0004\b\u001b\u0010\u0004R\"\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010\u0006\u0012\u0004\b$\u0010\t\u001a\u0004\b#\u0010\u0004R\"\u0010*\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010'\u0012\u0004\b)\u0010\t\u001a\u0004\b \u0010(R\"\u00100\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b/\u0010\t\u001a\u0004\b,\u0010.¨\u00062"}, d2 = {"Lcl5/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "getId$annotations", "()V", "id", "b", "getAddress$annotations", "address", "c", "j", "getState$annotations", "state", "d", "getHostingType$annotations", "hostingType", "e", "getHostingVerification$annotations", "hostingVerification", "getHostingPlatform$annotations", "hostingPlatform", "Lbl5/b;", "g", "Lbl5/b;", "()Lbl5/b;", "getDetails$annotations", "details", "h", "getOwnershipMethod$annotations", "ownershipMethod", "i", "getOwnershipState$annotations", "ownershipState", "Lcl5/a$c;", "Lcl5/a$c;", "()Lcl5/a$c;", "getOwnershipPayload$annotations", "ownershipPayload", "", "k", "Ljava/lang/Long;", "()Ljava/lang/Long;", "getUpdatedDate$annotations", "updatedDate", "Companion", "feature_crypto_remittance_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("address")
    private final String address;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("state")
    private final String state;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @b("hostingType")
    private final String hostingType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @b("hostingVerification")
    private final String hostingVerification;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @b("hostingPlatform")
    private final String hostingPlatform;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @b("details")
    private final bl5.b details;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @b("ownershipMethod")
    private final String ownershipMethod;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @b("ownershipState")
    private final String ownershipState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @b("ownershipPayload")
    private final c ownershipPayload;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @b("updatedDate")
    private final Long updatedDate;

    /* JADX INFO: renamed from: cl5.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0158a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0158a f24964a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            C0158a c0158a = new C0158a();
            f24964a = c0158a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.crypto.remittance.models.dto.counterparty.CryptoCounterpartyDto", c0158a, 11);
            pluginGeneratedSerialDescriptor.j("id", false);
            pluginGeneratedSerialDescriptor.j("address", false);
            pluginGeneratedSerialDescriptor.j("state", false);
            pluginGeneratedSerialDescriptor.j("hostingType", false);
            pluginGeneratedSerialDescriptor.j("hostingVerification", false);
            pluginGeneratedSerialDescriptor.j("hostingPlatform", false);
            pluginGeneratedSerialDescriptor.j("details", false);
            pluginGeneratedSerialDescriptor.j("ownershipMethod", false);
            pluginGeneratedSerialDescriptor.j("ownershipState", false);
            pluginGeneratedSerialDescriptor.j("ownershipPayload", false);
            pluginGeneratedSerialDescriptor.j("updatedDate", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private C0158a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(b.a.f16474a), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(c.C0159a.f24966a), nlm.a.c(t0.f247706a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            boolean z;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            c cVar = null;
            Long l2 = null;
            String strDecodeStringElement = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            bl5.b bVar = null;
            String str6 = null;
            String str7 = null;
            int i = 0;
            boolean z3 = true;
            while (z3) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        z3 = false;
                        continue;
                    case 0:
                        z = z3;
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                        break;
                    case 1:
                        z = z3;
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str);
                        i |= 2;
                        break;
                    case 2:
                        z = z3;
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str2);
                        i |= 4;
                        break;
                    case 3:
                        z = z3;
                        str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str3);
                        i |= 8;
                        break;
                    case 4:
                        z = z3;
                        str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str4);
                        i |= 16;
                        break;
                    case 5:
                        z = z3;
                        str5 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, str5);
                        i |= 32;
                        break;
                    case 6:
                        z = z3;
                        bVar = (bl5.b) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, b.a.f16474a, bVar);
                        i |= 64;
                        break;
                    case 7:
                        z = z3;
                        str6 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, v1.f247718a, str6);
                        i |= 128;
                        break;
                    case 8:
                        z = z3;
                        str7 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, v1.f247718a, str7);
                        i |= 256;
                        break;
                    case 9:
                        z = z3;
                        cVar = (c) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, c.C0159a.f24966a, cVar);
                        i |= 512;
                        break;
                    case 10:
                        z = z3;
                        l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, t0.f247706a, l2);
                        i |= 1024;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
                z3 = z;
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new a(i, strDecodeStringElement, str, str2, str3, str4, str5, bVar, str6, str7, cVar, l2);
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
            a.l(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: cl5.a$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return C0158a.f24964a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u0000 \n2\u00020\u0001:\u0002\u000b\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0004¨\u0006\f"}, d2 = {"Lcl5/a$c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getToken$annotations", "()V", "token", "Companion", "b", "feature_crypto_remittance_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class c {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("token")
        private final String token;

        /* JADX INFO: renamed from: cl5.a$c$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0159a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0159a f24966a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                C0159a c0159a = new C0159a();
                f24966a = c0159a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.crypto.remittance.models.dto.counterparty.CryptoCounterpartyDto.OwnershipPayload", c0159a, 1);
                pluginGeneratedSerialDescriptor.j("token", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private C0159a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{nlm.a.c(v1.f247718a)};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                String str = null;
                boolean z = true;
                int i = 0;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else {
                        if (iD != 0) {
                            throw new UnknownFieldException(iD);
                        }
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, str);
                        i = 1;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new c(i, str);
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
                c.b(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: cl5.a$c$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return C0159a.f24966a;
            }
        }

        public /* synthetic */ c(int i, String str) {
            if (1 == (i & 1)) {
                this.token = str;
            } else {
                j1.f(C0159a.f24966a.getDescriptor(), i, 1);
                throw null;
            }
        }

        public static final /* synthetic */ void b(c cVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, cVar.token);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getToken() {
            return this.token;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && Intrinsics.f(this.token, ((c) obj2).token);
        }

        public final int hashCode() {
            String str = this.token;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }
    }

    public /* synthetic */ a(int i, String str, String str2, String str3, String str4, String str5, String str6, bl5.b bVar, String str7, String str8, c cVar, Long l2) {
        if (1023 != (i & 1023)) {
            j1.f(C0158a.f24964a.getDescriptor(), i, 1023);
            throw null;
        }
        this.id = str;
        this.address = str2;
        this.state = str3;
        this.hostingType = str4;
        this.hostingVerification = str5;
        this.hostingPlatform = str6;
        this.details = bVar;
        this.ownershipMethod = str7;
        this.ownershipState = str8;
        this.ownershipPayload = cVar;
        if ((i & 1024) == 0) {
            this.updatedDate = null;
        } else {
            this.updatedDate = l2;
        }
    }

    public static final /* synthetic */ void l(a aVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, aVar.id);
        v1 v1Var = v1.f247718a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, v1Var, aVar.address);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, v1Var, aVar.state);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, v1Var, aVar.hostingType);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, v1Var, aVar.hostingVerification);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, v1Var, aVar.hostingPlatform);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, b.a.f16474a, aVar.details);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, v1Var, aVar.ownershipMethod);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, v1Var, aVar.ownershipState);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, c.C0159a.f24966a, aVar.ownershipPayload);
        if (!compositeEncoder.d(serialDescriptor) && aVar.updatedDate == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, t0.f247706a, aVar.updatedDate);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final bl5.b getDetails() {
        return this.details;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getHostingPlatform() {
        return this.hostingPlatform;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getHostingType() {
        return this.hostingType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getHostingVerification() {
        return this.hostingVerification;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.address, aVar.address) && Intrinsics.f(this.state, aVar.state) && Intrinsics.f(this.hostingType, aVar.hostingType) && Intrinsics.f(this.hostingVerification, aVar.hostingVerification) && Intrinsics.f(this.hostingPlatform, aVar.hostingPlatform) && Intrinsics.f(this.details, aVar.details) && Intrinsics.f(this.ownershipMethod, aVar.ownershipMethod) && Intrinsics.f(this.ownershipState, aVar.ownershipState) && Intrinsics.f(this.ownershipPayload, aVar.ownershipPayload) && Intrinsics.f(this.updatedDate, aVar.updatedDate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getOwnershipMethod() {
        return this.ownershipMethod;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final c getOwnershipPayload() {
        return this.ownershipPayload;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.address;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.state;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.hostingType;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.hostingVerification;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.hostingPlatform;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        bl5.b bVar = this.details;
        int iHashCode7 = (iHashCode6 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str6 = this.ownershipMethod;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.ownershipState;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        c cVar = this.ownershipPayload;
        int iHashCode10 = (iHashCode9 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Long l2 = this.updatedDate;
        return iHashCode10 + (l2 != null ? l2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getOwnershipState() {
        return this.ownershipState;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Long getUpdatedDate() {
        return this.updatedDate;
    }
}
