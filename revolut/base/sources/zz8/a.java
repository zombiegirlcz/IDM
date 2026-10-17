package zz8;

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
import qlm.f0;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lzz8/a;", "Lzz8/c;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_learn_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class a extends c {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pz8.e f326587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f326588c;

    /* JADX INFO: renamed from: zz8.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1809a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1809a f326589a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            C1809a c1809a = new C1809a();
            f326589a = c1809a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("REWARD_CURRENCY", c1809a, 2);
            pluginGeneratedSerialDescriptor.j("from", false);
            pluginGeneratedSerialDescriptor.j("targetCurrency", false);
            pluginGeneratedSerialDescriptor.l(new b());
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private C1809a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{pz8.c.f240911a, v1.f247718a};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            pz8.e eVar = null;
            boolean z = true;
            int i = 0;
            String strDecodeStringElement = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    eVar = (pz8.e) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, pz8.c.f240911a, eVar);
                    i |= 1;
                } else {
                    if (iD != 1) {
                        throw new UnknownFieldException(iD);
                    }
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new a(i, eVar, strDecodeStringElement);
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
            Companion companion = a.INSTANCE;
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, pz8.c.f240911a, value.f326587b);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f326588c);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: zz8.a$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return C1809a.f326589a;
        }
    }

    public /* synthetic */ a(int i, pz8.e eVar, String str) {
        if (3 != (i & 3)) {
            j1.f(C1809a.f326589a.getDescriptor(), i, 3);
            throw null;
        }
        this.f326587b = eVar;
        this.f326588c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f326587b, aVar.f326587b) && Intrinsics.f(this.f326588c, aVar.f326588c);
    }

    public final int hashCode() {
        return this.f326588c.hashCode() + (this.f326587b.hashCode() * 31);
    }
}
