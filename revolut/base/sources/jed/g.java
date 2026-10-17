package jed;

import jo3.a;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0006\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR \u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0007\u0012\u0004\b\r\u0010\u000b\u001a\u0004\b\u0006\u0010\t¨\u0006\u0010"}, d2 = {"Ljed/g;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "b", "()Ljo3/a;", "getLow$annotations", "()V", "low", "getHigh$annotations", "high", "Companion", "feature_shared_wealth_data_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class g {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("low")
    @NotNull
    private final jo3.a low;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("high")
    @NotNull
    private final jo3.a high;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f173356a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f173356a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.shared.wealth.data.stats.MoneyRangeDto", aVar, 2);
            pluginGeneratedSerialDescriptor.j("low", false);
            pluginGeneratedSerialDescriptor.j("high", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            a.C1001a c1001a = a.C1001a.f176860a;
            return new KSerializer[]{c1001a, c1001a};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            jo3.a aVar = null;
            boolean z = true;
            int i = 0;
            jo3.a aVar2 = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    aVar = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, a.C1001a.f176860a, aVar);
                    i |= 1;
                } else {
                    if (iD != 1) {
                        throw new UnknownFieldException(iD);
                    }
                    aVar2 = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, a.C1001a.f176860a, aVar2);
                    i |= 2;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new g(i, aVar, aVar2);
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
            g.c(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: jed.g$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f173356a;
        }
    }

    public /* synthetic */ g(int i, jo3.a aVar, jo3.a aVar2) {
        if (3 != (i & 3)) {
            j1.f(a.f173356a.getDescriptor(), i, 3);
            throw null;
        }
        this.low = aVar;
        this.high = aVar2;
    }

    public static final /* synthetic */ void c(g gVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        a.C1001a c1001a = a.C1001a.f176860a;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, c1001a, gVar.low);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, c1001a, gVar.high);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getHigh() {
        return this.high;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getLow() {
        return this.low;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.low, gVar.low) && Intrinsics.f(this.high, gVar.high);
    }

    public final int hashCode() {
        return this.high.hashCode() + (this.low.hashCode() * 31);
    }
}
