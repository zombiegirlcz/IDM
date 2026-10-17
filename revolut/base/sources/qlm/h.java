package qlm;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes13.dex */
public final class h implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f247648a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f247649b = new n1("kotlin.Boolean", olm.e.f226470b);

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Boolean.valueOf(decoder.decodeBoolean());
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f247649b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.encodeBoolean(zBooleanValue);
    }
}
