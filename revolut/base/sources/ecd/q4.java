package ecd;

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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lecd/q4;", "Lecd/s4;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_shared_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class q4 implements s4 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f124653a;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f124654a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f124654a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("MIN_CURRENT_BALANCE", aVar, 1);
            pluginGeneratedSerialDescriptor.j("balance", false);
            pluginGeneratedSerialDescriptor.l(new n4());
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{ie0.o.f160615a};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            dj0.d dVar = null;
            boolean z = true;
            int i = 0;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else {
                    if (iD != 0) {
                        throw new UnknownFieldException(iD);
                    }
                    dVar = (dj0.d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, ie0.o.f160615a, dVar);
                    i = 1;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new q4(i, dVar);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            q4 value = (q4) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, ie0.o.f160615a, value.f124653a);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: ecd.q4$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f124654a;
        }
    }

    public /* synthetic */ q4(int i, dj0.d dVar) {
        if (1 == (i & 1)) {
            this.f124653a = dVar;
        } else {
            qlm.j1.f(a.f124654a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q4) && Intrinsics.f(this.f124653a, ((q4) obj2).f124653a);
    }

    public final int hashCode() {
        return this.f124653a.hashCode();
    }

    public q4(dj0.d balance) {
        Intrinsics.checkNotNullParameter(balance, "balance");
        this.f124653a = balance;
    }
}
