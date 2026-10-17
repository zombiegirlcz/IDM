package slm;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes13.dex */
public final class d0 extends plm.a implements rlm.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Json f264247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f264248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f264249c;
    public final tlm.e d;
    public int e;
    public cfm.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final rlm.h f264250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p f264251h;

    public d0(Json json, j0 mode, a lexer, SerialDescriptor descriptor, cfm.c cVar) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f264247a = json;
        this.f264248b = mode;
        this.f264249c = lexer;
        this.d = json.f187949b;
        this.e = -1;
        this.f = cVar;
        rlm.h hVar = json.f187948a;
        this.f264250g = hVar;
        this.f264251h = hVar.d ? null : new p(descriptor);
    }

    @Override // rlm.i
    public final Json a() {
        return this.f264247a;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0112  */
    @Override // kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(mlm.b r11) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: slm.d0.b(mlm.b):java.lang.Object");
    }

    @Override // plm.a, kotlinx.serialization.encoding.Decoder
    public final plm.d beginStructure(SerialDescriptor sd4) {
        Intrinsics.checkNotNullParameter(sd4, "descriptor");
        Json json = this.f264247a;
        j0 j0VarQ = q.q(sd4, json);
        a aVar = this.f264249c;
        e8.q qVar = aVar.f264233b;
        Intrinsics.checkNotNullParameter(sd4, "sd");
        int i = qVar.f123509b + 1;
        qVar.f123509b = i;
        Object[] objArr = (Object[]) qVar.f123510c;
        if (i == objArr.length) {
            int i2 = i * 2;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i2);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            qVar.f123510c = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf((int[]) qVar.d, i2);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            qVar.d = iArrCopyOf;
        }
        ((Object[]) qVar.f123510c)[i] = sd4;
        aVar.h(j0VarQ.begin);
        if (aVar.w() != 4) {
            int i3 = c0.f264244a[j0VarQ.ordinal()];
            return (i3 == 1 || i3 == 2 || i3 == 3) ? new d0(json, j0VarQ, aVar, sd4, this.f) : (this.f264248b == j0VarQ && json.f187948a.d) ? this : new d0(json, j0VarQ, aVar, sd4, this.f);
        }
        a.r(aVar, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    @Override // rlm.i
    public final JsonElement c() {
        return new jx.e(this.f264247a.f187948a, this.f264249c).e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d5, code lost:
    
        if (r14 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d7, code lost:
    
        r14.f264276a.a(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00dc, code lost:
    
        r12 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f9, code lost:
    
        r1 = r3.f123509b;
        r4 = (int[]) r3.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0102, code lost:
    
        if (r4[r1] != (-2)) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0104, code lost:
    
        r4[r1] = r16;
        r3.f123509b = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x010a, code lost:
    
        r1 = r3.f123509b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x010e, code lost:
    
        if (r1 == r16) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0110, code lost:
    
        r3.f123509b = r1 + r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0113, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, "key");
        r1 = kotlin.text.d0.Y(r2.A(0, r2.f264232a), r15, 0, 6);
        r5 = v0.a.k(r1, "Encountered an unknown key '", r15, "' at offset ", " at path: ");
        r5.append(r3.e());
        r5.append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
        r5.append((java.lang.Object) slm.q.o(r1, r2.t()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x014d, code lost:
    
        throw new kotlinx.serialization.json.internal.JsonDecodingException(r5.toString());
     */
    @Override // plm.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(kotlinx.serialization.descriptors.SerialDescriptor r20) {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: slm.d0.d(kotlinx.serialization.descriptors.SerialDescriptor):int");
    }

    @Override // plm.a, kotlinx.serialization.encoding.Decoder
    public final boolean decodeBoolean() {
        boolean z;
        boolean z3;
        a aVar = this.f264249c;
        int iZ = aVar.z();
        if (iZ == aVar.t().length()) {
            a.r(aVar, "EOF", 0, null, 6);
            throw null;
        }
        if (aVar.t().charAt(iZ) == '\"') {
            iZ++;
            z = true;
        } else {
            z = false;
        }
        int iY = aVar.y(iZ);
        if (iY >= aVar.t().length() || iY == -1) {
            a.r(aVar, "EOF", 0, null, 6);
            throw null;
        }
        int i = iY + 1;
        int iCharAt = aVar.t().charAt(iY) | zsc.p.SPACE_CHAR;
        if (iCharAt == 102) {
            aVar.d(i, "alse");
            z3 = false;
        } else {
            if (iCharAt != 116) {
                a.r(aVar, "Expected valid boolean literal prefix, but had '" + aVar.l() + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6);
                throw null;
            }
            aVar.d(i, "rue");
            z3 = true;
        }
        if (!z) {
            return z3;
        }
        if (aVar.f264232a == aVar.t().length()) {
            a.r(aVar, "EOF", 0, null, 6);
            throw null;
        }
        if (aVar.t().charAt(aVar.f264232a) == '\"') {
            aVar.f264232a++;
            return z3;
        }
        a.r(aVar, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // plm.a, kotlinx.serialization.encoding.Decoder
    public final byte decodeByte() {
        a aVar = this.f264249c;
        long jI = aVar.i();
        byte b4 = (byte) jI;
        if (jI == b4) {
            return b4;
        }
        a.r(aVar, "Failed to parse byte for input '" + jI + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6);
        throw null;
    }

    @Override // plm.a, kotlinx.serialization.encoding.Decoder
    public final char decodeChar() {
        a aVar = this.f264249c;
        String strL = aVar.l();
        if (strL.length() == 1) {
            return strL.charAt(0);
        }
        a.r(aVar, p.a.l(CoreConstants.SINGLE_QUOTE_CHAR, "Expected single char, but got '", strL), 0, null, 6);
        throw null;
    }

    @Override // plm.a, kotlinx.serialization.encoding.Decoder
    public final double decodeDouble() {
        a aVar = this.f264249c;
        String strL = aVar.l();
        try {
            double d = Double.parseDouble(strL);
            if (Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            q.r(aVar, Double.valueOf(d));
            throw null;
        } catch (IllegalArgumentException unused) {
            a.r(aVar, p.a.l(CoreConstants.SINGLE_QUOTE_CHAR, "Failed to parse type 'double' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // plm.a, kotlinx.serialization.encoding.Decoder
    public final int decodeEnum(SerialDescriptor enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return q.l(enumDescriptor, this.f264247a, decodeString(), " at path " + this.f264249c.f264233b.e());
    }

    @Override // plm.a, kotlinx.serialization.encoding.Decoder
    public final float decodeFloat() {
        a aVar = this.f264249c;
        String strL = aVar.l();
        try {
            float f = Float.parseFloat(strL);
            if (Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            q.r(aVar, Float.valueOf(f));
            throw null;
        } catch (IllegalArgumentException unused) {
            a.r(aVar, p.a.l(CoreConstants.SINGLE_QUOTE_CHAR, "Failed to parse type 'float' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // plm.a, kotlinx.serialization.encoding.Decoder
    public final Decoder decodeInline(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return g0.a(descriptor) ? new o(this.f264249c, this.f264247a) : super.decodeInline(descriptor);
    }

    @Override // plm.a, kotlinx.serialization.encoding.Decoder
    public final int decodeInt() {
        a aVar = this.f264249c;
        long jI = aVar.i();
        int i = (int) jI;
        if (jI == i) {
            return i;
        }
        a.r(aVar, "Failed to parse int for input '" + jI + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6);
        throw null;
    }

    @Override // plm.a, kotlinx.serialization.encoding.Decoder
    public final long decodeLong() {
        return this.f264249c.i();
    }

    @Override // plm.a, kotlinx.serialization.encoding.Decoder
    public final boolean decodeNotNullMark() {
        p pVar = this.f264251h;
        return ((pVar != null ? pVar.f264277b : false) || this.f264249c.C(true)) ? false : true;
    }

    @Override // plm.a, kotlinx.serialization.encoding.Decoder
    public final Void decodeNull() {
        return null;
    }

    @Override // plm.a, plm.d
    public final Object decodeSerializableElement(SerialDescriptor descriptor, int i, mlm.b deserializer, Object obj2) {
        e8.q qVar = this.f264249c.f264233b;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        boolean z = this.f264248b == j0.MAP && (i & 1) == 0;
        if (z) {
            int[] iArr = (int[]) qVar.d;
            int i2 = qVar.f123509b;
            if (iArr[i2] == -2) {
                ((Object[]) qVar.f123510c)[i2] = r.f264279a;
            }
        }
        Object objDecodeSerializableElement = super.decodeSerializableElement(descriptor, i, deserializer, obj2);
        if (z) {
            int[] iArr2 = (int[]) qVar.d;
            int i3 = qVar.f123509b;
            if (iArr2[i3] != -2) {
                int i5 = i3 + 1;
                qVar.f123509b = i5;
                Object[] objArr = (Object[]) qVar.f123510c;
                if (i5 == objArr.length) {
                    int i6 = i5 * 2;
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, i6);
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                    qVar.f123510c = objArrCopyOf;
                    int[] iArrCopyOf = Arrays.copyOf((int[]) qVar.d, i6);
                    Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
                    qVar.d = iArrCopyOf;
                }
            }
            Object[] objArr2 = (Object[]) qVar.f123510c;
            int i21 = qVar.f123509b;
            objArr2[i21] = objDecodeSerializableElement;
            ((int[]) qVar.d)[i21] = -2;
        }
        return objDecodeSerializableElement;
    }

    @Override // plm.a, kotlinx.serialization.encoding.Decoder
    public final short decodeShort() {
        a aVar = this.f264249c;
        long jI = aVar.i();
        short s2 = (short) jI;
        if (jI == s2) {
            return s2;
        }
        a.r(aVar, "Failed to parse short for input '" + jI + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6);
        throw null;
    }

    @Override // plm.a, kotlinx.serialization.encoding.Decoder
    public final String decodeString() {
        boolean z = this.f264250g.f255106c;
        a aVar = this.f264249c;
        return z ? aVar.m() : aVar.j();
    }

    @Override // plm.a, plm.d
    public final void endStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor.c() == 0 && q.m(descriptor, this.f264247a)) {
            while (d(descriptor) != -1) {
            }
        }
        a aVar = this.f264249c;
        if (aVar.B()) {
            q.n(aVar, "");
            throw null;
        }
        aVar.h(this.f264248b.f264269end);
        e8.q qVar = aVar.f264233b;
        int i = qVar.f123509b;
        int[] iArr = (int[]) qVar.d;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            qVar.f123509b = i - 1;
        }
        int i2 = qVar.f123509b;
        if (i2 != -1) {
            qVar.f123509b = i2 - 1;
        }
    }

    @Override // kotlinx.serialization.encoding.Decoder, plm.d
    public final tlm.e getSerializersModule() {
        return this.d;
    }
}
