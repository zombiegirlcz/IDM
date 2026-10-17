package qr2;

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

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\t\b\u0081\b\u0018\u0000 \u00192\u00020\u0001:\u0002\u0005\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004¨\u0006\u001a"}, d2 = {"Lqr2/l;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "b", "h", "ownerId", "c", "g", "name", "e", "logo", "", "J", "()J", "activeSince", "f", "category", "brandId", "merchantId", "Companion", "feature_blocked_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class l {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("ownerId")
    private final String ownerId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    private final String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("logo")
    private final String logo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("activeSince")
    private final long activeSince;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("category")
    private final String category;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("brandId")
    private final String brandId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("merchantId")
    private final String merchantId;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f248628a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f248628a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.blocked_merchants.impl.data.network.model.BlockedMerchantDto", aVar, 8);
            pluginGeneratedSerialDescriptor.j("id", false);
            pluginGeneratedSerialDescriptor.j("ownerId", false);
            pluginGeneratedSerialDescriptor.j("name", false);
            pluginGeneratedSerialDescriptor.j("logo", false);
            pluginGeneratedSerialDescriptor.j("activeSince", false);
            pluginGeneratedSerialDescriptor.j("category", false);
            pluginGeneratedSerialDescriptor.j("brandId", false);
            pluginGeneratedSerialDescriptor.j("merchantId", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), t0.f247706a, nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            String str = null;
            String strDecodeStringElement = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            long jDecodeLongElement = 0;
            int i = 0;
            boolean z = true;
            String str6 = null;
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
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str2);
                        i |= 2;
                        break;
                    case 2:
                        str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str3);
                        i |= 4;
                        break;
                    case 3:
                        str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str4);
                        i |= 8;
                        break;
                    case 4:
                        jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 4);
                        i |= 16;
                        break;
                    case 5:
                        str5 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, str5);
                        i |= 32;
                        break;
                    case 6:
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, v1.f247718a, str);
                        i |= 64;
                        break;
                    case 7:
                        str6 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, v1.f247718a, str6);
                        i |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new l(i, strDecodeStringElement, str2, str3, str4, jDecodeLongElement, str5, str, str6);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            l value = (l) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            l.i(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: qr2.l$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f248628a;
        }
    }

    public /* synthetic */ l(int i, String str, String str2, String str3, String str4, long j2, String str5, String str6, String str7) {
        if (255 != (i & 255)) {
            j1.f(a.f248628a.getDescriptor(), i, 255);
            throw null;
        }
        this.id = str;
        this.ownerId = str2;
        this.name = str3;
        this.logo = str4;
        this.activeSince = j2;
        this.category = str5;
        this.brandId = str6;
        this.merchantId = str7;
    }

    public static final /* synthetic */ void i(l lVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, lVar.id);
        v1 v1Var = v1.f247718a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, v1Var, lVar.ownerId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, v1Var, lVar.name);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, v1Var, lVar.logo);
        compositeEncoder.encodeLongElement(serialDescriptor, 4, lVar.activeSince);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, v1Var, lVar.category);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, v1Var, lVar.brandId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, v1Var, lVar.merchantId);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getActiveSince() {
        return this.activeSince;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBrandId() {
        return this.brandId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.id, lVar.id) && Intrinsics.f(this.ownerId, lVar.ownerId) && Intrinsics.f(this.name, lVar.name) && Intrinsics.f(this.logo, lVar.logo) && this.activeSince == lVar.activeSince && Intrinsics.f(this.category, lVar.category) && Intrinsics.f(this.brandId, lVar.brandId) && Intrinsics.f(this.merchantId, lVar.merchantId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getMerchantId() {
        return this.merchantId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getOwnerId() {
        return this.ownerId;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.ownerId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.logo;
        int iC = a0.d.c((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.activeSince);
        String str4 = this.category;
        int iHashCode4 = (iC + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.brandId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.merchantId;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }
}
