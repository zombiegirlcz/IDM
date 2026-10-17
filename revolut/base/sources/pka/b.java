package pka;

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
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0004\u0006\u0007\b\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\n"}, d2 = {"Lpka/b;", "Lpka/f0;", "", "toString", "()Ljava/lang/String;", "Companion", "pka/f", "pka/i", "a", "b", "feature_product_article_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class b implements f0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f236955a;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f236956a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f236956a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("BULLET_LIST", aVar, 1);
            pluginGeneratedSerialDescriptor.j("content", false);
            Intrinsics.checkNotNullParameter("type", "discriminator");
            pluginGeneratedSerialDescriptor.l(new pka.a());
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{d.f236959a};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            f fVar = null;
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
                    fVar = (f) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, d.f236959a, fVar);
                    i = 1;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new b(i, fVar);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            b value = (b) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, d.f236959a, value.f236955a);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: pka.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f236956a;
        }
    }

    public /* synthetic */ b(int i, f fVar) {
        if (1 == (i & 1)) {
            this.f236955a = fVar;
        } else {
            j1.f(a.f236956a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f236955a, ((b) obj2).f236955a);
    }

    public final int hashCode() {
        return this.f236955a.f236963a.hashCode();
    }

    public b(f content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f236955a = content;
    }
}
