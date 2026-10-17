package w29;

import k19.h;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import olm.e;
import qlm.n1;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f293982a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f293983b = com.bumptech.glide.c.a("formatting", e.f226474j);

    private c() {
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        try {
            return h.valueOf(decoder.decodeString());
        } catch (IllegalArgumentException unused) {
            return h.UNKNOWN;
        }
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f293983b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        h value = (h) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeString(value.name());
    }
}
