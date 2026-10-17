package s7g;

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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Ls7g/g;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class g {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f260722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f260723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f260724c;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f260725a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f260725a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.travel.flights.models.dto.booking.BookingConfirmationStageDto", aVar, 3);
            pluginGeneratedSerialDescriptor.j("passed", true);
            pluginGeneratedSerialDescriptor.j("title", true);
            pluginGeneratedSerialDescriptor.j("description", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            KSerializer kSerializerC = nlm.a.c(qlm.h.f247648a);
            qlm.v1 v1Var = qlm.v1.f247718a;
            return new KSerializer[]{kSerializerC, nlm.a.c(v1Var), nlm.a.c(v1Var)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            Boolean bool = null;
            boolean z = true;
            int i = 0;
            String str = null;
            String str2 = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, qlm.h.f247648a, bool);
                    i |= 1;
                } else if (iD == 1) {
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, str);
                    i |= 2;
                } else {
                    if (iD != 2) {
                        throw new UnknownFieldException(iD);
                    }
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qlm.v1.f247718a, str2);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new g(i, bool, str, str2);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            g value = (g) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f260722a != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, qlm.h.f247648a, value.f260722a);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f260723b != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, value.f260723b);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f260724c != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, qlm.v1.f247718a, value.f260724c);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: s7g.g$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f260725a;
        }
    }

    public g() {
        this.f260722a = null;
        this.f260723b = null;
        this.f260724c = null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f260722a, gVar.f260722a) && Intrinsics.f(this.f260723b, gVar.f260723b) && Intrinsics.f(this.f260724c, gVar.f260724c);
    }

    public final int hashCode() {
        Boolean bool = this.f260722a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.f260723b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f260724c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public /* synthetic */ g(int i, Boolean bool, String str, String str2) {
        if ((i & 1) == 0) {
            this.f260722a = null;
        } else {
            this.f260722a = bool;
        }
        if ((i & 2) == 0) {
            this.f260723b = null;
        } else {
            this.f260723b = str;
        }
        if ((i & 4) == 0) {
            this.f260724c = null;
        } else {
            this.f260724c = str2;
        }
    }
}
