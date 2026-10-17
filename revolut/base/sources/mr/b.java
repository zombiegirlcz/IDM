package mr;

import com.bumptech.glide.c;
import java.util.List;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import okk.d;
import olm.g;
import olm.i;

/* JADX INFO: loaded from: classes17.dex */
public final class b implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f208029a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f208030b = c.e("ExtrasSerializer", i.f226485b, new SerialDescriptor[0], new d(13));

    private b() {
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter("Deserialization is not supported.", "message");
        throw new NotImplementedError("Deserialization is not supported.");
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f208030b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        if (obj2 == null) {
            encoder.encodeNull();
            return;
        }
        if (obj2 instanceof String) {
            encoder.encodeString((String) obj2);
            return;
        }
        if (!(obj2 instanceof Number)) {
            if (obj2 instanceof List) {
                nlm.a.a(this).serialize(encoder, obj2);
                return;
            } else {
                encoder.encodeNull();
                return;
            }
        }
        Number number = (Number) obj2;
        if (number instanceof Integer) {
            encoder.encodeInt(number.intValue());
            return;
        }
        if (number instanceof Long) {
            encoder.encodeLong(number.longValue());
            return;
        }
        if (number instanceof Double) {
            encoder.encodeDouble(number.doubleValue());
        } else if (number instanceof Float) {
            encoder.encodeFloat(number.floatValue());
        } else {
            encoder.encodeString(number.toString());
        }
    }
}
