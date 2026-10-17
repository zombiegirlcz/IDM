package qo3;

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
import qlm.j1;
import qlm.x;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\b\u0087\b\u0018\u0000 \f2\u00020\u0001:\u0002\u0006\nJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\b¨\u0006\r"}, d2 = {"Lqo3/a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "D", "()D", "latitude", "b", "longitude", "Companion", "feature_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("latitude")
    private final double latitude;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("longitude")
    private final double longitude;

    /* JADX INFO: renamed from: qo3.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1353a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1353a f248002a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            C1353a c1353a = new C1353a();
            f248002a = c1353a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.core.model.network.location.LocationDto", c1353a, 2);
            pluginGeneratedSerialDescriptor.j("latitude", false);
            pluginGeneratedSerialDescriptor.j("longitude", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private C1353a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            x xVar = x.f247723a;
            return new KSerializer[]{xVar, xVar};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            double dDecodeDoubleElement = 0.0d;
            double dDecodeDoubleElement2 = 0.0d;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    dDecodeDoubleElement = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 0);
                    i |= 1;
                } else {
                    if (iD != 1) {
                        throw new UnknownFieldException(iD);
                    }
                    dDecodeDoubleElement2 = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 1);
                    i |= 2;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new a(i, dDecodeDoubleElement, dDecodeDoubleElement2);
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
            a.c(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: qo3.a$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return C1353a.f248002a;
        }
    }

    public /* synthetic */ a(int i, double d, double d5) {
        if (3 != (i & 3)) {
            j1.f(C1353a.f248002a.getDescriptor(), i, 3);
            throw null;
        }
        this.latitude = d;
        this.longitude = d5;
    }

    public static final /* synthetic */ void c(a aVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeDoubleElement(serialDescriptor, 0, aVar.latitude);
        compositeEncoder.encodeDoubleElement(serialDescriptor, 1, aVar.longitude);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Double.compare(this.latitude, aVar.latitude) == 0 && Double.compare(this.longitude, aVar.longitude) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.longitude) + (Double.hashCode(this.latitude) * 31);
    }
}
