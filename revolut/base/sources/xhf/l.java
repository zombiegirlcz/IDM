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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0005\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\r\u0010\u0004¨\u0006\u0011"}, d2 = {"Lxhf/l;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "orderId", "b", "collectionKey", "c", "collectionName", "d", "avatar", "icon", "Companion", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class l {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("orderId")
    @NotNull
    private final String orderId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("collectionKey")
    private final String collectionKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("collectionName")
    private final String collectionName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("avatar")
    private final String avatar;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("icon")
    private final String icon;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f306079a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f306079a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transactions.dto.CollectionTradingDto", aVar, 5);
            pluginGeneratedSerialDescriptor.j("orderId", false);
            pluginGeneratedSerialDescriptor.j("collectionKey", false);
            pluginGeneratedSerialDescriptor.j("collectionName", false);
            pluginGeneratedSerialDescriptor.j("avatar", false);
            pluginGeneratedSerialDescriptor.j("icon", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            qlm.v1 v1Var = qlm.v1.f247718a;
            return new KSerializer[]{v1Var, nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            String strDecodeStringElement = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                } else if (iD == 1) {
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, str);
                    i |= 2;
                } else if (iD == 2) {
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qlm.v1.f247718a, str2);
                    i |= 4;
                } else if (iD == 3) {
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.v1.f247718a, str3);
                    i |= 8;
                } else {
                    if (iD != 4) {
                        throw new UnknownFieldException(iD);
                    }
                    str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, qlm.v1.f247718a, str4);
                    i |= 16;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new l(i, strDecodeStringElement, str, str2, str3, str4);
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
            l.f(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: xhf.l$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f306079a;
        }
    }

    public /* synthetic */ l(int i, String str, String str2, String str3, String str4, String str5) {
        if (31 != (i & 31)) {
            qlm.j1.f(a.f306079a.getDescriptor(), i, 31);
            throw null;
        }
        this.orderId = str;
        this.collectionKey = str2;
        this.collectionName = str3;
        this.avatar = str4;
        this.icon = str5;
    }

    public static final /* synthetic */ void f(l lVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, lVar.orderId);
        qlm.v1 v1Var = qlm.v1.f247718a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, v1Var, lVar.collectionKey);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, v1Var, lVar.collectionName);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, v1Var, lVar.avatar);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, v1Var, lVar.icon);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCollectionKey() {
        return this.collectionKey;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCollectionName() {
        return this.collectionName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.orderId, lVar.orderId) && Intrinsics.f(this.collectionKey, lVar.collectionKey) && Intrinsics.f(this.collectionName, lVar.collectionName) && Intrinsics.f(this.avatar, lVar.avatar) && Intrinsics.f(this.icon, lVar.icon);
    }

    public final int hashCode() {
        int iHashCode = this.orderId.hashCode() * 31;
        String str = this.collectionKey;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.collectionName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.avatar;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.icon;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }
}
