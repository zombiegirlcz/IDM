package af6;

import af6.a;
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
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.h;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u001a2\u00020\u0001:\u0002\u0005\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\t\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0010R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u001b"}, d2 = {"Laf6/d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "b", "countryCode", "e", "name", "", "d", "Z", "()Z", "hasBranches", "infoProvider", "f", "g", "paymentInitiation", "Laf6/a$c;", "Laf6/a$c;", "()Laf6/a$c;", "paymentInfo", "Companion", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("countryCode")
    @NotNull
    private final String countryCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("hasBranches")
    private final boolean hasBranches;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("infoProvider")
    private final boolean infoProvider;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("paymentInitiation")
    private final boolean paymentInitiation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentInfo")
    private final a.c paymentInfo;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f3927a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f3927a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.external_accounts.impl.data.cross_border.entity.ExternalInstitutionCountryDepartmentEntity", aVar, 7);
            pluginGeneratedSerialDescriptor.j("id", false);
            pluginGeneratedSerialDescriptor.j("countryCode", false);
            pluginGeneratedSerialDescriptor.j("name", false);
            pluginGeneratedSerialDescriptor.j("hasBranches", false);
            pluginGeneratedSerialDescriptor.j("infoProvider", false);
            pluginGeneratedSerialDescriptor.j("paymentInitiation", false);
            pluginGeneratedSerialDescriptor.j("paymentInfo", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            KSerializer kSerializerC = nlm.a.c(a.c.C0013a.f3914a);
            v1 v1Var = v1.f247718a;
            h hVar = h.f247648a;
            return new KSerializer[]{v1Var, v1Var, v1Var, hVar, hVar, hVar, kSerializerC};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            boolean zDecodeBooleanElement = false;
            boolean zDecodeBooleanElement2 = false;
            boolean zDecodeBooleanElement3 = false;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            String strDecodeStringElement3 = null;
            a.c cVar = null;
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
                        zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                        i |= 8;
                        break;
                    case 4:
                        zDecodeBooleanElement2 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i |= 16;
                        break;
                    case 5:
                        zDecodeBooleanElement3 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 5);
                        i |= 32;
                        break;
                    case 6:
                        cVar = (a.c) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, a.c.C0013a.f3914a, cVar);
                        i |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new d(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, zDecodeBooleanElement, zDecodeBooleanElement2, zDecodeBooleanElement3, cVar);
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
            d.h(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: af6.d$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f3927a;
        }
    }

    public /* synthetic */ d(int i, String str, String str2, String str3, boolean z, boolean z3, boolean z4, a.c cVar) {
        if (127 != (i & CertificateBody.profileType)) {
            j1.f(a.f3927a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.id = str;
        this.countryCode = str2;
        this.name = str3;
        this.hasBranches = z;
        this.infoProvider = z3;
        this.paymentInitiation = z4;
        this.paymentInfo = cVar;
    }

    public static final /* synthetic */ void h(d dVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, dVar.id);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, dVar.countryCode);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, dVar.name);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 3, dVar.hasBranches);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 4, dVar.infoProvider);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 5, dVar.paymentInitiation);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, a.c.C0013a.f3914a, dVar.paymentInfo);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getHasBranches() {
        return this.hasBranches;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getInfoProvider() {
        return this.infoProvider;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.id, dVar.id) && Intrinsics.f(this.countryCode, dVar.countryCode) && Intrinsics.f(this.name, dVar.name) && this.hasBranches == dVar.hasBranches && this.infoProvider == dVar.infoProvider && this.paymentInitiation == dVar.paymentInitiation && Intrinsics.f(this.paymentInfo, dVar.paymentInfo);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final a.c getPaymentInfo() {
        return this.paymentInfo;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getPaymentInitiation() {
        return this.paymentInitiation;
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(j6.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.countryCode), 31, this.name), 31, this.hasBranches), 31, this.infoProvider), 31, this.paymentInitiation);
        a.c cVar = this.paymentInfo;
        return iC + (cVar == null ? 0 : cVar.hashCode());
    }

    public d(String id10, String countryCode, String name, boolean z, boolean z3, boolean z4, a.c cVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = id10;
        this.countryCode = countryCode;
        this.name = name;
        this.hasBranches = z;
        this.infoProvider = z3;
        this.paymentInitiation = z4;
        this.paymentInfo = cVar;
    }
}
