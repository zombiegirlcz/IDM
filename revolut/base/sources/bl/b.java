package bl;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes17.dex */
public final class b implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f16441a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SerialDescriptor f16442b = e.Companion.serializer().getDescriptor();

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        e eVar = (e) decoder.b(e.Companion.serializer());
        return new Locale(eVar.f16444a, eVar.f16445b);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f16442b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        Locale value = (Locale) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        KSerializer kSerializerSerializer = e.Companion.serializer();
        String language = value.getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        String country = value.getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "getCountry(...)");
        encoder.encodeSerializableValue(kSerializerSerializer, new e(language, country));
    }
}
