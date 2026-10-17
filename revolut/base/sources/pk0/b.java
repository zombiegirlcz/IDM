package pk0;

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
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0081\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0005\nJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0004R \u0010\u000e\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\r\u0010\b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Lpk0/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getKey$annotations", "()V", "key", "b", "Ljava/lang/Object;", "()Ljava/lang/Object;", "getValue$annotations", "value", "Companion", "core_personalisation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("key")
    @NotNull
    private final String key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("value")
    @NotNull
    private final Object value;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f236909a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f236909a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.core.personalisation.data.network.dto.PersonalisationEntryDto", aVar, 2);
            pluginGeneratedSerialDescriptor.j("key", false);
            pluginGeneratedSerialDescriptor.j("value", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{v1.f247718a, c.f236910a};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            String strDecodeStringElement = null;
            boolean z = true;
            int i = 0;
            Object objDecodeSerializableElement = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                } else {
                    if (iD != 1) {
                        throw new UnknownFieldException(iD);
                    }
                    objDecodeSerializableElement = dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, c.f236910a, objDecodeSerializableElement);
                    i |= 2;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new b(i, strDecodeStringElement, objDecodeSerializableElement);
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
            b.c(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: pk0.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f236909a;
        }
    }

    public /* synthetic */ b(int i, String str, Object obj2) {
        if (3 != (i & 3)) {
            j1.f(a.f236909a.getDescriptor(), i, 3);
            throw null;
        }
        this.key = str;
        this.value = obj2;
    }

    public static final /* synthetic */ void c(b bVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, bVar.key);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, c.f236910a, bVar.value);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Object getValue() {
        return this.value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.key, bVar.key) && Intrinsics.f(this.value, bVar.value);
    }

    public final int hashCode() {
        return this.value.hashCode() + (this.key.hashCode() * 31);
    }

    public b(String key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.key = key;
        this.value = value;
    }
}
