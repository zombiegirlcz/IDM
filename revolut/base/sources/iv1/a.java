package iv1;

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
import qlm.h;
import qlm.j1;
import qlm.t0;
import qlm.v1;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\b\u0081\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u0005\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\t\u0010\u0018R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004¨\u0006\u001d"}, d2 = {"Liv1/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "type", "b", "h", "value", "c", "f", "status", "d", "ongoingClaimOperationId", "", "e", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "blockExtendable", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "blockedUntil", "name", "ownerAgent", "Companion", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("value")
    @NotNull
    private final String value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("status")
    @NotNull
    private final String status;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @b("ongoingClaimOperationId")
    private final String ongoingClaimOperationId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @b("blockExtendable")
    private final Boolean blockExtendable;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @b("blockedUntil")
    private final Long blockedUntil;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @b("name")
    private final String name;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @b("ownerAgent")
    private final String ownerAgent;

    /* JADX INFO: renamed from: iv1.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0949a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0949a f168705a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            C0949a c0949a = new C0949a();
            f168705a = c0949a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.apm.breb.impl.data.model.AliasStorageDto", c0949a, 8);
            pluginGeneratedSerialDescriptor.j("type", false);
            pluginGeneratedSerialDescriptor.j("value", false);
            pluginGeneratedSerialDescriptor.j("status", false);
            pluginGeneratedSerialDescriptor.j("ongoingClaimOperationId", false);
            pluginGeneratedSerialDescriptor.j("blockExtendable", false);
            pluginGeneratedSerialDescriptor.j("blockedUntil", false);
            pluginGeneratedSerialDescriptor.j("name", false);
            pluginGeneratedSerialDescriptor.j("ownerAgent", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private C0949a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, v1Var, v1Var, nlm.a.c(v1Var), nlm.a.c(h.f247648a), nlm.a.c(t0.f247706a), nlm.a.c(v1Var), nlm.a.c(v1Var)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            String strDecodeStringElement3 = null;
            String str = null;
            Boolean bool = null;
            Long l2 = null;
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
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str);
                        i |= 8;
                        break;
                    case 4:
                        bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, h.f247648a, bool);
                        i |= 16;
                        break;
                    case 5:
                        l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, t0.f247706a, l2);
                        i |= 32;
                        break;
                    case 6:
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, v1.f247718a, str2);
                        i |= 64;
                        break;
                    case 7:
                        str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, v1.f247718a, str3);
                        i |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new a(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, str, bool, l2, str2, str3);
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
            a.i(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: iv1.a$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return C0949a.f168705a;
        }
    }

    public /* synthetic */ a(int i, String str, String str2, String str3, String str4, Boolean bool, Long l2, String str5, String str6) {
        if (255 != (i & 255)) {
            j1.f(C0949a.f168705a.getDescriptor(), i, 255);
            throw null;
        }
        this.type = str;
        this.value = str2;
        this.status = str3;
        this.ongoingClaimOperationId = str4;
        this.blockExtendable = bool;
        this.blockedUntil = l2;
        this.name = str5;
        this.ownerAgent = str6;
    }

    public static final /* synthetic */ void i(a aVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, aVar.type);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, aVar.value);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, aVar.status);
        v1 v1Var = v1.f247718a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, v1Var, aVar.ongoingClaimOperationId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, h.f247648a, aVar.blockExtendable);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, t0.f247706a, aVar.blockedUntil);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, v1Var, aVar.name);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, v1Var, aVar.ownerAgent);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getBlockExtendable() {
        return this.blockExtendable;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getBlockedUntil() {
        return this.blockedUntil;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getOngoingClaimOperationId() {
        return this.ongoingClaimOperationId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getOwnerAgent() {
        return this.ownerAgent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.type, aVar.type) && Intrinsics.f(this.value, aVar.value) && Intrinsics.f(this.status, aVar.status) && Intrinsics.f(this.ongoingClaimOperationId, aVar.ongoingClaimOperationId) && Intrinsics.f(this.blockExtendable, aVar.blockExtendable) && Intrinsics.f(this.blockedUntil, aVar.blockedUntil) && Intrinsics.f(this.name, aVar.name) && Intrinsics.f(this.ownerAgent, aVar.ownerAgent);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.type.hashCode() * 31, 31, this.value), 31, this.status);
        String str = this.ongoingClaimOperationId;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.blockExtendable;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l2 = this.blockedUntil;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ownerAgent;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public a(String type, String value, String status, String str, Boolean bool, Long l2, String str2, String str3) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(status, "status");
        this.type = type;
        this.value = value;
        this.status = status;
        this.ongoingClaimOperationId = str;
        this.blockExtendable = bool;
        this.blockedUntil = l2;
        this.name = str2;
        this.ownerAgent = str3;
    }
}
