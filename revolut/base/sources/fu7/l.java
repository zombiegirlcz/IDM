package fu7;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import le.u1;
import qlm.n1;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1 f138115a = com.bumptech.glide.c.a("InsuranceSubtype", olm.e.f226474j);

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return (dl7.a) u1.t(decoder.decodeString(), dl7.a.UNKNOWN, k.f138114b);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return this.f138115a;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        dl7.a value = (dl7.a) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeString(u1.g(value, k.f138114b));
    }
}
