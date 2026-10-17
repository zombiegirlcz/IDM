package rlm;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonObject;
import qlm.v1;

/* JADX INFO: loaded from: classes14.dex */
public final class v implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f255125a = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f255126b = u.f255122b;

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        i26.l.b(decoder);
        nlm.a.d(t0.f186434a);
        return new JsonObject((Map) nlm.a.b(v1.f247718a, k.f255111a).deserialize(decoder));
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f255126b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        JsonObject value = (JsonObject) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        i26.l.c(encoder);
        nlm.a.d(t0.f186434a);
        nlm.a.b(v1.f247718a, k.f255111a).serialize(encoder, value);
    }
}
