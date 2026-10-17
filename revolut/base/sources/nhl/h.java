package nhl;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends qlm.p0 {
    public static final h d = new h();

    public static final class a implements KSerializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f215524a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final SerialDescriptor f215525b = f.INSTANCE.serializer().getDescriptor();

        private a() {
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new f(decoder.decodeString());
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return f215525b;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            f value = (f) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeString(value.f215521a);
        }
    }

    private h() {
        super(kotlin.jvm.internal.o0.f186429a.b(g.class));
    }

    @Override // qlm.p0
    public final mlm.b c(JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        if (element instanceof kotlinx.serialization.json.b) {
            return a.f215524a;
        }
        boolean z = element instanceof JsonObject;
        if (z && ((JsonObject) element).containsKey("value")) {
            return f.INSTANCE.serializer();
        }
        if (z) {
            return e.INSTANCE.serializer();
        }
        throw new SerializationException("Unknown MetricValue format: " + element);
    }
}
