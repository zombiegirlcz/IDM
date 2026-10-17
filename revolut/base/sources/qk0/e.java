package qk0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f246932a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final qlm.e f246933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SerialDescriptor f246934c;

    static {
        qlm.e eVarA = nlm.a.a(b.Companion.serializer());
        f246933b = eVarA;
        f246934c = eVarA.f247633b;
    }

    private e() {
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new d((List) f246933b.deserialize(decoder));
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f246934c;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        d value = (d) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        f246933b.serialize(encoder, value.f246931a);
    }
}
