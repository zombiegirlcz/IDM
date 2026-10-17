package fb9;

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

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0083\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lfb9/a;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f133528a;

    /* JADX INFO: renamed from: fb9.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0784a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0784a f133529a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            C0784a c0784a = new C0784a();
            f133529a = c0784a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.onboarding.impl.onboarding.junior.error.UserUnder18ErrorParserImpl.UserUnder18Error", c0784a, 1);
            pluginGeneratedSerialDescriptor.j("retailMinAge", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private C0784a() {
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
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f133528a != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, n0.f247680a, value.f133528a);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: fb9.a$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return C0784a.f133529a;
        }
    }

    public a() {
        this.f133528a = null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f133528a, ((a) obj2).f133528a);
    }

    public final int hashCode() {
        Integer num = this.f133528a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public /* synthetic */ a(int i, Integer num) {
        if ((i & 1) == 0) {
            this.f133528a = null;
        } else {
            this.f133528a = num;
        }
    }
}
