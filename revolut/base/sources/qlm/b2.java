package qlm;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes13.dex */
public final class b2 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b2 f247619a = new b2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j0 f247620b;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.r.f186431a, "<this>");
        f247620b = h1.a("kotlin.UInt", n0.f247680a);
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new yhm.u(decoder.decodeInline(f247620b).decodeInt());
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f247620b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        int i = ((yhm.u) obj2).f314206a;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.encodeInline(f247620b).encodeInt(i);
    }
}
