package zeb;

import com.revolut.feature.terms.api.model.TermsScope;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import qlm.n1;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f321669a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f321670b = com.bumptech.glide.c.a("TermsScope", olm.e.f226474j);

    private n() {
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new TermsScope(decoder.decodeString());
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f321670b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        TermsScope value = (TermsScope) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeString(value.f90390a);
    }
}
