package ie0;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import qlm.n1;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f160593a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f160594b = com.bumptech.glide.c.a("Currency", olm.e.f226474j);

    private d() {
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        xi0.a aVar = xi0.b.Companion;
        String strDecodeString = decoder.decodeString();
        aVar.getClass();
        return xi0.a.a(strDecodeString);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f160594b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        xi0.b value = (xi0.b) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeString(value.f306286a);
    }
}
