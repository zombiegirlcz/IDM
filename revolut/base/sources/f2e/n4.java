package f2e;

import java.time.Instant;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lf2e/n4;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class n4 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f131668c;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f131669a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f131669a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.store.impl.data.network.model.RedeemResponseDto", aVar, 3);
            pluginGeneratedSerialDescriptor.j("webhook", true);
            pluginGeneratedSerialDescriptor.j("promoCode", true);
            pluginGeneratedSerialDescriptor.j("expiresAt", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            qlm.v1 v1Var = qlm.v1.f247718a;
            return new KSerializer[]{nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(ie0.j.f160602a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            String str = null;
            boolean z = true;
            int i = 0;
            String str2 = null;
            Instant instant = null;
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
                } else {
                    if (iD != 2) {
                        throw new UnknownFieldException(iD);
                    }
                    instant = (Instant) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, ie0.j.f160602a, instant);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new n4(i, str, str2, instant);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            n4 value = (n4) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f131666a != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, qlm.v1.f247718a, value.f131666a);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f131667b != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, value.f131667b);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f131668c != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, ie0.j.f160602a, value.f131668c);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: f2e.n4$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f131669a;
        }
    }

    public n4() {
        this.f131666a = null;
        this.f131667b = null;
        this.f131668c = null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n4)) {
            return false;
        }
        n4 n4Var = (n4) obj2;
        return Intrinsics.f(this.f131666a, n4Var.f131666a) && Intrinsics.f(this.f131667b, n4Var.f131667b) && Intrinsics.f(this.f131668c, n4Var.f131668c);
    }

    public final int hashCode() {
        String str = this.f131666a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f131667b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Instant instant = this.f131668c;
        return iHashCode2 + (instant != null ? instant.hashCode() : 0);
    }

    public /* synthetic */ n4(int i, String str, String str2, Instant instant) {
        if ((i & 1) == 0) {
            this.f131666a = null;
        } else {
            this.f131666a = str;
        }
        if ((i & 2) == 0) {
            this.f131667b = null;
        } else {
            this.f131667b = str2;
        }
        if ((i & 4) == 0) {
            this.f131668c = null;
        } else {
            this.f131668c = instant;
        }
    }
}
