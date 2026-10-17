package rlm;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes14.dex */
public final class e implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f255097a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f255098b = d.f255094b;

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        i26.l.b(decoder);
        return new kotlinx.serialization.json.a((List) nlm.a.a(k.f255111a).deserialize(decoder));
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f255098b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        kotlinx.serialization.json.a value = (kotlinx.serialization.json.a) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        i26.l.c(encoder);
        nlm.a.a(k.f255111a).serialize(encoder, value);
    }
}
