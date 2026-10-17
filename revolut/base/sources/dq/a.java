package dq;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import plm.d;
import qlm.f0;
import qlm.n0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Ldq/a;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "appupdate_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f116892a;

    /* JADX INFO: renamed from: dq.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0694a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0694a f116893a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            C0694a c0694a = new C0694a();
            f116893a = c0694a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.appupdate.impl.data.AppNeedsUpdateErrorDto", c0694a, 1);
            pluginGeneratedSerialDescriptor.j("code", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private C0694a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{nlm.a.c(n0.f247680a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            Integer num = null;
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
                    num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, n0.f247680a, num);
                    i = 1;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new a(i, num);
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
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f116892a != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, n0.f247680a, value.f116892a);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: dq.a$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return C0694a.f116893a;
        }
    }

    public a() {
        this.f116892a = null;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getF116892a() {
        return this.f116892a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f116892a, ((a) obj2).f116892a);
    }

    public final int hashCode() {
        Integer num = this.f116892a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public /* synthetic */ a(int i, Integer num) {
        if ((i & 1) == 0) {
            this.f116892a = null;
        } else {
            this.f116892a = num;
        }
    }
}
