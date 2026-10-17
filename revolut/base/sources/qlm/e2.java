package qlm;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes13.dex */
public final class e2 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e2 f247637a = new e2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j0 f247638b;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.v.f186436a, "<this>");
        f247638b = h1.a("kotlin.ULong", t0.f247706a);
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new yhm.w(decoder.decodeInline(f247638b).decodeLong());
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f247638b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        long j2 = ((yhm.w) obj2).f314208a;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.encodeInline(f247638b).encodeLong(j2);
    }
}
