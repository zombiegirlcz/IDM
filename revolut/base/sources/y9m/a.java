package y9m;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonObject;
import olm.m;
import org.json.JSONObject;
import qlm.o1;
import rlm.i;

/* JADX INFO: loaded from: classes17.dex */
public final class a implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f311869a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f311870b;

    static {
        SerialDescriptor original = JsonObject.INSTANCE.serializer().getDescriptor();
        Intrinsics.checkNotNullParameter("JSONObject", "serialName");
        Intrinsics.checkNotNullParameter(original, "original");
        if (d0.W("JSONObject")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if ("JSONObject".equals(original.e())) {
            throw new IllegalArgumentException(("The name of the wrapped descriptor (JSONObject) cannot be the same as the name of the original descriptor (" + original.e() + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
        }
        if (original.getKind() instanceof olm.f) {
            o1.a("JSONObject");
        }
        f311870b = new m(original);
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new JSONObject(((i) decoder).c().toString());
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f311870b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        JSONObject value = (JSONObject) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        rlm.b bVar = Json.d;
        String string = value.toString();
        Intrinsics.checkNotNullExpressionValue(string, "value.toString()");
        ((rlm.m) encoder).b(bVar.d(string));
    }
}
