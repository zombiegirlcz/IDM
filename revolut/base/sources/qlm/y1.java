package qlm;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes13.dex */
public final class y1 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y1 f247729a = new y1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j0 f247730b;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.f.f186419a, "<this>");
        f247730b = h1.a("kotlin.UByte", k.f247670a);
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new yhm.s(decoder.decodeInline(f247730b).decodeByte());
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f247730b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        byte b4 = ((yhm.s) obj2).f314204a;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.encodeInline(f247730b).encodeByte(b4);
    }
}
