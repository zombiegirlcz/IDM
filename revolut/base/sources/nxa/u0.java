package nxa;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import qlm.n1;
import qlm.q1;

/* JADX INFO: loaded from: classes5.dex */
public final class u0 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u0 f220535a = new u0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q1 f220536b;

    static {
        n1 n1VarA = com.bumptech.glide.c.a("ReferralCampaignV4Type", olm.e.f226474j);
        Intrinsics.checkNotNullParameter(n1VarA, "<this>");
        f220536b = new q1(n1VarA);
    }

    private u0() {
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (!decoder.decodeNotNullMark()) {
            return (pwa.n) decoder.decodeNull();
        }
        String strDecodeString = decoder.decodeString();
        for (pwa.n nVar : pwa.n.values()) {
            if (kotlin.text.a0.z(nVar.name(), strDecodeString, true)) {
                return nVar;
            }
        }
        return null;
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f220536b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        pwa.n nVar = (pwa.n) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        if (nVar == null) {
            encoder.encodeNull();
        } else {
            encoder.encodeString(nVar.name());
        }
    }
}
