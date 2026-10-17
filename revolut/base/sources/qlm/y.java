package qlm;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes13.dex */
public final class y implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f247727a = new y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f247728b = new n1("kotlin.time.Duration", olm.e.f226474j);

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        b.Companion companion = kotlin.time.b.INSTANCE;
        String value = decoder.decodeString();
        companion.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            return new kotlin.time.b(kotlin.time.c.a(value));
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(p.a.p("Invalid ISO duration string format: '", value, "'."), e);
        }
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f247728b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        long j2 = ((kotlin.time.b) obj2).f187924a;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        b.Companion companion = kotlin.time.b.INSTANCE;
        StringBuilder sb6 = new StringBuilder();
        if (j2 < 0) {
            sb6.append(CoreConstants.DASH_CHAR);
        }
        sb6.append("PT");
        long jP = j2 < 0 ? kotlin.time.b.p(j2) : j2;
        long jN = kotlin.time.b.n(jP, pkm.e.HOURS);
        int iH = kotlin.time.b.h(jP);
        int iJ = kotlin.time.b.j(jP);
        int i = kotlin.time.b.i(jP);
        if (kotlin.time.b.k(j2)) {
            jN = 9999999999999L;
        }
        boolean z = false;
        boolean z3 = jN != 0;
        boolean z4 = (iJ == 0 && i == 0) ? false : true;
        if (iH != 0 || (z4 && z3)) {
            z = true;
        }
        if (z3) {
            sb6.append(jN);
            sb6.append('H');
        }
        if (z) {
            sb6.append(iH);
            sb6.append('M');
        }
        if (z4 || (!z3 && !z)) {
            kotlin.time.b.b(sb6, iJ, i, 9, "S", true);
        }
        encoder.encodeString(sb6.toString());
    }
}
