package po3;

import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import no3.b;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f237883a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SerialDescriptor f237884b = b.INSTANCE.serializer().getDescriptor();

    private a() {
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return oo3.a.a((b) decoder.b(b.INSTANCE.serializer()));
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f237884b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        Address value = (Address) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeSerializableValue(b.INSTANCE.serializer(), oo3.a.d(value));
    }
}
