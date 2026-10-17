package aka;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.h0;
import qlm.j0;
import qlm.v1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class m implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f5765a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        m mVar = new m();
        f5765a = mVar;
        j0 j0Var = new j0("com.revolut.feature.product_article.api.models.ProductArticlesConfig", mVar);
        j0Var.j("map", false);
        descriptor = j0Var;
    }

    private m() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{o.f5766b[0].getValue()};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Decoder decoderDecodeInline = decoder.decodeInline(descriptor);
        v1 v1Var = v1.f247718a;
        Map map = (Map) decoderDecodeInline.b(new h0(v1Var, v1Var, 1));
        n nVar = o.Companion;
        Intrinsics.checkNotNullParameter(map, "map");
        return new o(map);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        Map map = ((o) obj2).f5767a;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(map, "$v$c$com-revolut-feature-product_article-api-models-ProductArticlesConfig$-value$0");
        Encoder encoderEncodeInline = encoder.encodeInline(descriptor);
        if (encoderEncodeInline == null) {
            return;
        }
        v1 v1Var = v1.f247718a;
        encoderEncodeInline.encodeSerializableValue(new h0(v1Var, v1Var, 1), map);
    }
}
