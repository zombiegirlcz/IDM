package o98;

import com.bumptech.glide.c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import le.u1;
import olm.e;
import qlm.n1;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f223139a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f223140b = c.a("GraduationState", e.f226474j);

    private b() {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return (p98.a) u1.u(decoder.decodeString(), a.f223138a);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f223140b;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        p98.a value = (p98.a) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeString(u1.g(value, a.f223138a));
    }
}
