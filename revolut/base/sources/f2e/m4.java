package f2e;

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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lf2e/m4;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class m4 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f131661c;
    public final String d;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f131662a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f131662a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.store.impl.data.network.model.RedeemRequestDto", aVar, 4);
            pluginGeneratedSerialDescriptor.j("rewardType", true);
            pluginGeneratedSerialDescriptor.j("adSetId", true);
            pluginGeneratedSerialDescriptor.j("adId", true);
            pluginGeneratedSerialDescriptor.j("placementId", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            qlm.v1 v1Var = qlm.v1.f247718a;
            return new KSerializer[]{nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
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
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, qlm.v1.f247718a, str);
                    i |= 1;
                } else if (iD == 1) {
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, str2);
                    i |= 2;
                } else if (iD == 2) {
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qlm.v1.f247718a, str3);
                    i |= 4;
                } else {
                    if (iD != 3) {
                        throw new UnknownFieldException(iD);
                    }
                    str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.v1.f247718a, str4);
                    i |= 8;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new m4(i, str, str2, str3, str4);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            m4 value = (m4) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f131659a != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, qlm.v1.f247718a, value.f131659a);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f131660b != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, value.f131660b);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f131661c != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, qlm.v1.f247718a, value.f131661c);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.d != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, qlm.v1.f247718a, value.d);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: f2e.m4$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f131662a;
        }
    }

    public /* synthetic */ m4(int i, String str, String str2, String str3, String str4) {
        if ((i & 1) == 0) {
            this.f131659a = null;
        } else {
            this.f131659a = str;
        }
        if ((i & 2) == 0) {
            this.f131660b = null;
        } else {
            this.f131660b = str2;
        }
        if ((i & 4) == 0) {
            this.f131661c = null;
        } else {
            this.f131661c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m4)) {
            return false;
        }
        m4 m4Var = (m4) obj2;
        return Intrinsics.f(this.f131659a, m4Var.f131659a) && Intrinsics.f(this.f131660b, m4Var.f131660b) && Intrinsics.f(this.f131661c, m4Var.f131661c) && Intrinsics.f(this.d, m4Var.d);
    }

    public final int hashCode() {
        String str = this.f131659a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f131660b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f131661c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public m4(String str, String str2, String str3, String str4) {
        this.f131659a = str;
        this.f131660b = str2;
        this.f131661c = str3;
        this.d = str4;
    }

    public m4() {
        this(null, null, null, null);
    }
}
