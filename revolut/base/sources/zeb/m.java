package zeb;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import qlm.h0;
import qlm.v1;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f321666a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h0 f321667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SerialDescriptor f321668c;

    static {
        nlm.a.d(t0.f186434a);
        h0 h0VarB = nlm.a.b(v1.f247718a, n.f321669a);
        f321667b = h0VarB;
        f321668c = h0VarB.d;
    }

    private m() {
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return (Map) f321667b.deserialize(decoder);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f321668c;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        Map value = (Map) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        f321667b.serialize(encoder, value);
    }
}
