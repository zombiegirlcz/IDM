package ie0;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import qlm.n1;

/* JADX INFO: loaded from: classes19.dex */
public final class i implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f160600a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f160601b = com.bumptech.glide.c.a("InstantInSeconds", olm.e.f226473h);

    private i() {
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Instant instantOfEpochSecond = Instant.ofEpochSecond(decoder.decodeLong());
        Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
        return instantOfEpochSecond;
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f160601b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        Instant value = (Instant) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeLong(value.toEpochMilli() / ((long) 1000));
    }
}
