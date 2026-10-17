package qlm;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes13.dex */
public final class h2 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h2 f247654a = new h2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j0 f247655b;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.r0.f186432a, "<this>");
        f247655b = h1.a("kotlin.UShort", u1.f247712a);
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new yhm.z(decoder.decodeInline(f247655b).decodeShort());
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f247655b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        short s2 = ((yhm.z) obj2).f314211a;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.encodeInline(f247655b).encodeShort(s2);
    }
}
