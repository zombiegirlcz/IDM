package ie0;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import qlm.n1;

/* JADX INFO: loaded from: classes19.dex */
public final class s implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f160620a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f160621b = com.bumptech.glide.c.a("UUID", olm.e.f226474j);

    private s() {
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        UUID uuidFromString = UUID.fromString(decoder.decodeString());
        Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
        return uuidFromString;
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f160621b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        UUID value = (UUID) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        String string = value.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        encoder.encodeString(string);
    }
}
