package tdl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import qlm.e;
import zhm.d0;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f270005a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f270006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SerialDescriptor f270007c;

    static {
        e eVarA = nlm.a.a(a.f270003a);
        f270006b = eVarA;
        f270007c = eVarA.f247633b;
    }

    private b() {
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return d0.Z((List) decoder.b(f270006b));
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f270007c;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        List value = (List) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeSerializableValue(f270006b, value);
    }
}
