package uh8;

import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f280147a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final olm.g f280148b = com.bumptech.glide.c.d("JuniorAccountRequestDto", new SerialDescriptor[0], new okk.d(12));

    private g() {
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter("Deserialization is not supported.", "message");
        throw new NotImplementedError("Deserialization is not supported.");
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f280148b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        f value = (f) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof e) {
            encoder.encodeSerializableValue(e.INSTANCE.serializer(), value);
        } else if (value instanceof c) {
            encoder.encodeSerializableValue(c.INSTANCE.serializer(), value);
        } else {
            if (!(value instanceof b)) {
                throw new NoWhenBranchMatchedException();
            }
            encoder.encodeSerializableValue(b.INSTANCE.serializer(), value);
        }
    }
}
