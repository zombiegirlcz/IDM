package m1c;

import com.revolut.feature.rev_points.models.RevPoints;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes6.dex */
public final class n1 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n1 f201419a = new n1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final qlm.n1 f201420b = com.bumptech.glide.c.a("RevPoints", olm.e.f226474j);

    private n1() {
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return qvb.a.d(decoder.decodeString());
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f201420b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        RevPoints value = (RevPoints) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeString(value.W());
    }
}
