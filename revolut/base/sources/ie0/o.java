package ie0;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes19.dex */
public final class o implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f160615a = new o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SerialDescriptor f160616b = r.Companion.serializer().getDescriptor();

    private o() {
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        r rVar = (r) decoder.b(r.Companion.serializer());
        long j2 = rVar.f160618a;
        xi0.a aVar = xi0.b.Companion;
        String str = rVar.f160619b;
        aVar.getClass();
        return new dj0.d(j2, xi0.a.a(str));
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f160616b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        dj0.d value = (dj0.d) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeSerializableValue(r.Companion.serializer(), new r(value.f115082a, value.f115083b.f306286a));
    }
}
