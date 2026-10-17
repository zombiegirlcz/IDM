package rlm;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.text.d0;
import kotlin.text.g0;
import kotlin.text.y;
import kotlin.text.z;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import qlm.e2;
import qlm.n1;

/* JADX INFO: loaded from: classes14.dex */
public final class q implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f255117a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f255118b = com.bumptech.glide.c.a("kotlinx.serialization.json.JsonLiteral", olm.e.f226474j);

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        JsonElement jsonElementC = i26.l.b(decoder).c();
        if (jsonElementC instanceof p) {
            return (p) jsonElementC;
        }
        StringBuilder sb6 = new StringBuilder("Unexpected JSON element, expected JsonLiteral, had ");
        throw slm.q.d(jsonElementC.toString(), -1, h30.l.t(o0.f186429a, jsonElementC.getClass(), sb6));
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f255118b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        p value = (p) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        i26.l.c(encoder);
        boolean z = value.f255114a;
        String str = value.f255116c;
        if (z) {
            encoder.encodeString(str);
            return;
        }
        SerialDescriptor serialDescriptor = value.f255115b;
        if (serialDescriptor != null) {
            encoder.encodeInline(serialDescriptor).encodeString(str);
            return;
        }
        Long lN = z.n(str);
        if (lN != null) {
            encoder.encodeLong(lN.longValue());
            return;
        }
        yhm.w wVarE = g0.e(str);
        if (wVarE != null) {
            long j2 = wVarE.f314208a;
            Intrinsics.checkNotNullParameter(yhm.w.INSTANCE, "<this>");
            encoder.encodeInline(e2.f247638b).encodeLong(j2);
            return;
        }
        Double dK = y.k(str);
        if (dK != null) {
            encoder.encodeDouble(dK.doubleValue());
            return;
        }
        Boolean boolE0 = d0.E0(str);
        if (boolE0 != null) {
            encoder.encodeBoolean(boolE0.booleanValue());
        } else {
            encoder.encodeString(str);
        }
    }
}
