package slm;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* JADX INFO: loaded from: classes14.dex */
public final class o extends plm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f264274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tlm.e f264275b;

    public o(a lexer, Json json) {
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f264274a = lexer;
        this.f264275b = json.f187949b;
    }

    @Override // plm.d
    public final int d(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override // plm.a, kotlinx.serialization.encoding.Decoder
    public final byte decodeByte() {
        yhm.s sVar;
        a aVar = this.f264274a;
        String strL = aVar.l();
        try {
            Intrinsics.checkNotNullParameter(strL, "<this>");
            Intrinsics.checkNotNullParameter(strL, "<this>");
            Intrinsics.checkNotNullParameter(strL, "<this>");
            yhm.u uVarD = kotlin.text.g0.d(strL);
            if (uVarD != null) {
                int i = uVarD.f314206a;
                sVar = Integer.compareUnsigned(i, 255) > 0 ? null : new yhm.s((byte) i);
            }
            if (sVar != null) {
                return sVar.f314204a;
            }
            kotlin.text.z.l(strL);
            throw null;
        } catch (IllegalArgumentException unused) {
            a.r(aVar, p.a.l(CoreConstants.SINGLE_QUOTE_CHAR, "Failed to parse type 'UByte' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // plm.a, kotlinx.serialization.encoding.Decoder
    public final int decodeInt() {
        a aVar = this.f264274a;
        String strL = aVar.l();
        try {
            Intrinsics.checkNotNullParameter(strL, "<this>");
            Intrinsics.checkNotNullParameter(strL, "<this>");
            yhm.u uVarD = kotlin.text.g0.d(strL);
            if (uVarD != null) {
                return uVarD.f314206a;
            }
            kotlin.text.z.l(strL);
            throw null;
        } catch (IllegalArgumentException unused) {
            a.r(aVar, p.a.l(CoreConstants.SINGLE_QUOTE_CHAR, "Failed to parse type 'UInt' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // plm.a, kotlinx.serialization.encoding.Decoder
    public final long decodeLong() {
        a aVar = this.f264274a;
        String strL = aVar.l();
        try {
            Intrinsics.checkNotNullParameter(strL, "<this>");
            yhm.w wVarE = kotlin.text.g0.e(strL);
            if (wVarE != null) {
                return wVarE.f314208a;
            }
            kotlin.text.z.l(strL);
            throw null;
        } catch (IllegalArgumentException unused) {
            a.r(aVar, p.a.l(CoreConstants.SINGLE_QUOTE_CHAR, "Failed to parse type 'ULong' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // plm.a, kotlinx.serialization.encoding.Decoder
    public final short decodeShort() {
        yhm.z zVar;
        a aVar = this.f264274a;
        String strL = aVar.l();
        try {
            Intrinsics.checkNotNullParameter(strL, "<this>");
            Intrinsics.checkNotNullParameter(strL, "<this>");
            Intrinsics.checkNotNullParameter(strL, "<this>");
            yhm.u uVarD = kotlin.text.g0.d(strL);
            if (uVarD != null) {
                int i = uVarD.f314206a;
                zVar = Integer.compareUnsigned(i, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) > 0 ? null : new yhm.z((short) i);
            }
            if (zVar != null) {
                return zVar.f314211a;
            }
            kotlin.text.z.l(strL);
            throw null;
        } catch (IllegalArgumentException unused) {
            a.r(aVar, p.a.l(CoreConstants.SINGLE_QUOTE_CHAR, "Failed to parse type 'UShort' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.Decoder, plm.d
    public final tlm.e getSerializersModule() {
        return this.f264275b;
    }
}
