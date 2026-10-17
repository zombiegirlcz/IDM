package a8g;

import java.util.List;
import jo3.a;
import kotlin.Lazy;
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
import qlm.n0;
import qlm.v1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"La8g/c0;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class c0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new a32.g(26))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f2209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f2210c;
    public final List d;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f2211a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f2211a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.travel.flights.models.dto.search.FlightSearchRequestFiltersDto", aVar, 4);
            pluginGeneratedSerialDescriptor.j("stopOption", true);
            pluginGeneratedSerialDescriptor.j("maximumPrice", true);
            pluginGeneratedSerialDescriptor.j("maximumDurationMinutes", true);
            pluginGeneratedSerialDescriptor.j("airlineCodes", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{nlm.a.c(v1.f247718a), nlm.a.c(a.C1001a.f176860a), nlm.a.c(n0.f247680a), nlm.a.c((KSerializer) c0.e[3].getValue())};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = c0.e;
            dVarBeginStructure.getClass();
            int i = 0;
            String str = null;
            jo3.a aVar = null;
            Integer num = null;
            List list = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, str);
                    i |= 1;
                } else if (iD == 1) {
                    aVar = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, a.C1001a.f176860a, aVar);
                    i |= 2;
                } else if (iD == 2) {
                    num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, n0.f247680a, num);
                    i |= 4;
                } else {
                    if (iD != 3) {
                        throw new UnknownFieldException(iD);
                    }
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), list);
                    i |= 8;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new c0(i, str, aVar, num, list);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            c0 value = (c0) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = c0.e;
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f2208a != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, value.f2208a);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f2209b != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, a.C1001a.f176860a, value.f2209b);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f2210c != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, n0.f247680a, value.f2210c);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.d != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), value.d);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: a8g.c0$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f2211a;
        }
    }

    public /* synthetic */ c0(int i, String str, jo3.a aVar, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f2208a = null;
        } else {
            this.f2208a = str;
        }
        if ((i & 2) == 0) {
            this.f2209b = null;
        } else {
            this.f2209b = aVar;
        }
        if ((i & 4) == 0) {
            this.f2210c = null;
        } else {
            this.f2210c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f2208a, c0Var.f2208a) && Intrinsics.f(this.f2209b, c0Var.f2209b) && Intrinsics.f(this.f2210c, c0Var.f2210c) && Intrinsics.f(this.d, c0Var.d);
    }

    public final int hashCode() {
        String str = this.f2208a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        jo3.a aVar = this.f2209b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Integer num = this.f2210c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public c0(String str, jo3.a aVar, Integer num, List list) {
        this.f2208a = str;
        this.f2209b = aVar;
        this.f2210c = num;
        this.d = list;
    }

    public c0() {
        this(null, null, null, null);
    }
}
