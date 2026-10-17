package qlm;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes13.dex */
public final class b1 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b1 f247617a = new b1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a1 f247618b = a1.f247612a;

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        throw new SerializationException("'kotlin.Nothing' does not have instances");
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f247618b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        Void value = (Void) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        throw new SerializationException("'kotlin.Nothing' cannot be serialized");
    }
}
