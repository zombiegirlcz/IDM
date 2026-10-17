package a8g;

import a8g.c0;
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
import qlm.v1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"La8g/b0;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class b0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f2200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2202c;
    public final c0 d;
    public final String e;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f2203a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f2203a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.travel.flights.models.dto.search.FlightSearchRequestDto", aVar, 5);
            pluginGeneratedSerialDescriptor.j("query", true);
            pluginGeneratedSerialDescriptor.j("searchToken", true);
            pluginGeneratedSerialDescriptor.j("cursor", true);
            pluginGeneratedSerialDescriptor.j("filters", true);
            pluginGeneratedSerialDescriptor.j("sort", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            KSerializer kSerializerC = nlm.a.c(y.f2246a);
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{kSerializerC, nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(c0.a.f2211a), nlm.a.c(v1Var)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            a0 a0Var = null;
            String str = null;
            String str2 = null;
            c0 c0Var = null;
            String str3 = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    a0Var = (a0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, y.f2246a, a0Var);
                    i |= 1;
                } else if (iD == 1) {
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str);
                    i |= 2;
                } else if (iD == 2) {
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str2);
                    i |= 4;
                } else if (iD == 3) {
                    c0Var = (c0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, c0.a.f2211a, c0Var);
                    i |= 8;
                } else {
                    if (iD != 4) {
                        throw new UnknownFieldException(iD);
                    }
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str3);
                    i |= 16;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new b0(i, a0Var, str, str2, c0Var, str3);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            b0 value = (b0) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f2200a != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, y.f2246a, value.f2200a);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f2201b != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, value.f2201b);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f2202c != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, value.f2202c);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.d != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, c0.a.f2211a, value.d);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.e != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, value.e);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: a8g.b0$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f2203a;
        }
    }

    public /* synthetic */ b0(int i, a0 a0Var, String str, String str2, c0 c0Var, String str3) {
        if ((i & 1) == 0) {
            this.f2200a = null;
        } else {
            this.f2200a = a0Var;
        }
        if ((i & 2) == 0) {
            this.f2201b = null;
        } else {
            this.f2201b = str;
        }
        if ((i & 4) == 0) {
            this.f2202c = null;
        } else {
            this.f2202c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = c0Var;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f2200a, b0Var.f2200a) && Intrinsics.f(this.f2201b, b0Var.f2201b) && Intrinsics.f(this.f2202c, b0Var.f2202c) && Intrinsics.f(this.d, b0Var.d) && Intrinsics.f(this.e, b0Var.e);
    }

    public final int hashCode() {
        a0 a0Var = this.f2200a;
        int iHashCode = (a0Var == null ? 0 : a0Var.hashCode()) * 31;
        String str = this.f2201b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f2202c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        c0 c0Var = this.d;
        int iHashCode4 = (iHashCode3 + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        String str3 = this.e;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public b0(a0 a0Var, String str, String str2, c0 c0Var, String str3) {
        this.f2200a = a0Var;
        this.f2201b = str;
        this.f2202c = str2;
        this.d = c0Var;
        this.e = str3;
    }

    public b0() {
        this(null, null, null, null, null);
    }
}
