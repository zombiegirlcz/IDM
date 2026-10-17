package hkl;

import com.bumptech.glide.c;
import gkl.b1;
import gkl.c1;
import gkl.d1;
import gkl.e1;
import gkl.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import olm.e;
import qlm.n1;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f152966a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f152967b = c.a("SessionToken.Payload.Profile", e.f226474j);

    private a() {
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        String strDecodeString = decoder.decodeString();
        return Intrinsics.f(strDecodeString, "PERSONAL") ? b1.f144437a : Intrinsics.f(strDecodeString, "BUSINESS_USER") ? z0.f144504a : Intrinsics.f(strDecodeString, "YOUTH") ? d1.f144441a : new c1(strDecodeString);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f152967b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        e1 value = (e1) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeString(value.getValue());
    }
}
