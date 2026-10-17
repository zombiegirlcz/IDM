package ie0;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import qlm.n1;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f160591a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f160592b = com.bumptech.glide.c.a("CountryCode", olm.e.f226474j);

    private c() {
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        wi0.a aVar = wi0.b.Companion;
        String strDecodeString = decoder.decodeString();
        aVar.getClass();
        return wi0.a.a(strDecodeString);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f160592b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        wi0.b value = (wi0.b) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeString(value.f297794a);
    }
}
