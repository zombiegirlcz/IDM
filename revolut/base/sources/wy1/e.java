package wy1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.j1;
import qlm.v1;
import wy1.b;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\b\u0081\b\u0018\u0000 \u00172\u00020\u0001:\u0002\u0005\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0018"}, d2 = {"Lwy1/e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "type", "b", "g", "value", "c", "e", "status", "Lwy1/b;", "d", "Lwy1/b;", "()Lwy1/b;", "attributes", "ongoingClaimOperationId", "name", "ownerAgent", "Companion", "feature_apm_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class e {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("value")
    @NotNull
    private final String value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("status")
    @NotNull
    private final String status;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("attributes")
    private final b attributes;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("ongoingClaimOperationId")
    private final String ongoingClaimOperationId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("name")
    private final String name;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("ownerAgent")
    private final String ownerAgent;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f301035a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f301035a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.apm.core.impl.data.network.alias.model.AliasDto", aVar, 7);
            pluginGeneratedSerialDescriptor.j("type", false);
            pluginGeneratedSerialDescriptor.j("value", false);
            pluginGeneratedSerialDescriptor.j("status", false);
            pluginGeneratedSerialDescriptor.j("attributes", false);
            pluginGeneratedSerialDescriptor.j("ongoingClaimOperationId", false);
            pluginGeneratedSerialDescriptor.j("name", false);
            pluginGeneratedSerialDescriptor.j("ownerAgent", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, v1Var, v1Var, nlm.a.c(b.a.f301025a), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            String strDecodeStringElement3 = null;
            b bVar = null;
            String str = null;
            String str2 = null;
            String str3 = null;
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
                        bVar = (b) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, b.a.f301025a, bVar);
                        i |= 8;
                        break;
                    case 4:
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str);
                        i |= 16;
                        break;
                    case 5:
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, str2);
                        i |= 32;
                        break;
                    case 6:
                        str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, v1.f247718a, str3);
                        i |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new e(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, bVar, str, str2, str3);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            e value = (e) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            e.h(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: wy1.e$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f301035a;
        }
    }

    public /* synthetic */ e(int i, String str, String str2, String str3, b bVar, String str4, String str5, String str6) {
        if (127 != (i & CertificateBody.profileType)) {
            j1.f(a.f301035a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.type = str;
        this.value = str2;
        this.status = str3;
        this.attributes = bVar;
        this.ongoingClaimOperationId = str4;
        this.name = str5;
        this.ownerAgent = str6;
    }

    public static final /* synthetic */ void h(e eVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, eVar.type);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, eVar.value);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, eVar.status);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, b.a.f301025a, eVar.attributes);
        v1 v1Var = v1.f247718a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, v1Var, eVar.ongoingClaimOperationId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, v1Var, eVar.name);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, v1Var, eVar.ownerAgent);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getAttributes() {
        return this.attributes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getOngoingClaimOperationId() {
        return this.ongoingClaimOperationId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getOwnerAgent() {
        return this.ownerAgent;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.type, eVar.type) && Intrinsics.f(this.value, eVar.value) && Intrinsics.f(this.status, eVar.status) && Intrinsics.f(this.attributes, eVar.attributes) && Intrinsics.f(this.ongoingClaimOperationId, eVar.ongoingClaimOperationId) && Intrinsics.f(this.name, eVar.name) && Intrinsics.f(this.ownerAgent, eVar.ownerAgent);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.type.hashCode() * 31, 31, this.value), 31, this.status);
        b bVar = this.attributes;
        int iHashCode = (iC + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.ongoingClaimOperationId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ownerAgent;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public e(String type, String value, String status, b bVar, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(status, "status");
        this.type = type;
        this.value = value;
        this.status = status;
        this.attributes = bVar;
        this.ongoingClaimOperationId = str;
        this.name = str2;
        this.ownerAgent = str3;
    }
}
