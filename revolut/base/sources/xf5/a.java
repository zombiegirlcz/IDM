package xf5;

import com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangePricingFee;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f304775a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SerialDescriptor f304776b = d.Companion.serializer().getDescriptor();

    private a() {
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        d dVar = (d) decoder.b(d.Companion.serializer());
        return new CryptoExchangePricingFee(dVar.f304778a, dVar.f304779b, dVar.f304780c);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f304776b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        CryptoExchangePricingFee value = (CryptoExchangePricingFee) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeSerializableValue(d.Companion.serializer(), new d(value.f70817a, value.f70818b, value.f70819c));
    }
}
