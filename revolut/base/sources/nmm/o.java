package nmm;

import ard.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.n0;
import kotlin.text.CharsKt;
import kotlin.text.a0;
import mmm.g0;
import mmm.h0;
import mmm.l0;
import mmm.p0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.hpke.HPKE;
import zhm.d0;
import zhm.r0;

/* JADX INFO: loaded from: classes14.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f217429a = new byte[0];

    public static final int a(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' > c2 || c2 >= 'G') {
            throw new IllegalArgumentException(com.google.android.gms.internal.mlkit_vision_face.a.j(c2, "Unexpected hex digit: "));
        }
        return c2 - '7';
    }

    public static final LinkedHashMap b(ArrayList arrayList) {
        h0.Companion.getClass();
        h0 h0VarA = g0.a("/", false);
        LinkedHashMap linkedHashMapN = r0.n(new Pair(h0VarA, new l(h0VarA, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532)));
        for (l lVar : d0.P0(arrayList, new adh.k(6))) {
            if (((l) linkedHashMapN.put(lVar.f217412a, lVar)) == null) {
                while (true) {
                    h0 h0Var = lVar.f217412a;
                    h0 h0VarC = h0Var.c();
                    if (h0VarC != null) {
                        l lVar2 = (l) linkedHashMapN.get(h0VarC);
                        if (lVar2 != null) {
                            lVar2.f217422q.add(h0Var);
                            break;
                        }
                        l lVar3 = new l(h0VarC, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                        linkedHashMapN.put(h0VarC, lVar3);
                        lVar3.f217422q.add(h0Var);
                        lVar = lVar3;
                    }
                }
            }
        }
        return linkedHashMapN;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long c(mmm.l0 r18, mmm.m r19, int r20, long r21) {
        /*
            r0 = r18
            r2 = r19
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            int r1 = r2.d()
            long r3 = (long) r1
            r1 = 0
            long r5 = (long) r1
            r1 = r20
            long r7 = (long) r1
            mmm.b.b(r3, r5, r7)
            r8 = r7
            boolean r3 = r0.f207284c
            mmm.h r1 = r0.f207283b
            if (r3 != 0) goto L83
            r3 = 0
        L24:
            r7 = r20
            r5 = r21
            long r10 = nmm.a.a(r1, r2, r3, r5, r7)
            r5 = -1
            int r7 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r7 == 0) goto L33
            return r10
        L33:
            long r10 = r1.f207266b
            long r12 = r10 - r8
            r14 = 1
            long r12 = r12 + r14
            int r7 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r7 < 0) goto L41
        L3e:
            r16 = r5
            goto L82
        L41:
            int r7 = (r10 > r21 ? 1 : (r10 == r21 ? 0 : -1))
            if (r7 >= 0) goto L48
            r16 = r5
            goto L69
        L48:
            long r10 = r10 - r21
            long r10 = r10 + r14
            long r10 = java.lang.Math.max(r14, r10)
            int r7 = (int) r10
            long r10 = r1.f207266b
            long r10 = r10 - r3
            long r10 = r10 + r14
            long r10 = java.lang.Math.min(r8, r10)
            int r10 = (int) r10
            int r10 = r10 + (-1)
            if (r7 > r10) goto L3e
        L5d:
            long r14 = r1.f207266b
            r16 = r5
            long r5 = (long) r10
            long r14 = r14 - r5
            boolean r5 = r1.m(r10, r14, r2)
            if (r5 == 0) goto L7b
        L69:
            mmm.s0 r5 = r0.f207282a
            r6 = 8192(0x2000, double:4.0474E-320)
            long r5 = r5.read(r1, r6)
            int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r5 != 0) goto L76
            goto L82
        L76:
            long r3 = java.lang.Math.max(r3, r12)
            goto L24
        L7b:
            if (r10 == r7) goto L82
            int r10 = r10 + (-1)
            r5 = r16
            goto L5d
        L82:
            return r16
        L83:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "closed"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nmm.o.c(mmm.l0, mmm.m, int, long):long");
    }

    public static long d(l0 l0Var, mmm.m mVar) {
        return c(l0Var, mVar, mVar.d(), Long.MAX_VALUE);
    }

    public static final String e(int i) {
        StringBuilder sb6 = new StringBuilder("0x");
        String string = Integer.toString(i, CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sb6.append(string);
        return sb6.toString();
    }

    public static final l f(final l0 l0Var) throws IOException {
        Intrinsics.checkNotNullParameter(l0Var, "<this>");
        int iT9 = l0Var.t9();
        if (iT9 != 33639248) {
            throw new IOException("bad zip: expected " + e(33639248) + " but was " + e(iT9));
        }
        l0Var.skip(4L);
        short sS2 = l0Var.S2();
        int i = sS2 & HPKE.aead_EXPORT_ONLY;
        if ((sS2 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + e(i));
        }
        int iS2 = l0Var.S2() & HPKE.aead_EXPORT_ONLY;
        int iS22 = l0Var.S2() & HPKE.aead_EXPORT_ONLY;
        int iS23 = l0Var.S2() & HPKE.aead_EXPORT_ONLY;
        long jT9 = ((long) l0Var.t9()) & BodyPartID.bodyIdMax;
        final n0 n0Var = new n0();
        n0Var.f186428a = ((long) l0Var.t9()) & BodyPartID.bodyIdMax;
        final n0 n0Var2 = new n0();
        n0Var2.f186428a = ((long) l0Var.t9()) & BodyPartID.bodyIdMax;
        int iS24 = l0Var.S2() & HPKE.aead_EXPORT_ONLY;
        int iS25 = l0Var.S2() & HPKE.aead_EXPORT_ONLY;
        int iS26 = 65535 & l0Var.S2();
        l0Var.skip(8L);
        final n0 n0Var3 = new n0();
        n0Var3.f186428a = ((long) l0Var.t9()) & BodyPartID.bodyIdMax;
        String strH = l0Var.h(iS24);
        if (kotlin.text.d0.K(strH, (char) 0)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        final long j2 = n0Var2.f186428a == BodyPartID.bodyIdMax ? 8 : 0L;
        if (n0Var.f186428a == BodyPartID.bodyIdMax) {
            j2 += (long) 8;
        }
        if (n0Var3.f186428a == BodyPartID.bodyIdMax) {
            j2 += (long) 8;
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        final Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        g(l0Var, iS25, new Function2() { // from class: nmm.m
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws IOException {
                int iIntValue = ((Integer) obj2).intValue();
                long jLongValue = ((Long) obj3).longValue();
                l0 l0Var2 = l0Var;
                if (iIntValue == 1) {
                    Ref$BooleanRef ref$BooleanRef2 = ref$BooleanRef;
                    if (ref$BooleanRef2.f186407a) {
                        throw new IOException("bad zip: zip64 extra repeated");
                    }
                    ref$BooleanRef2.f186407a = true;
                    if (jLongValue < j2) {
                        throw new IOException("bad zip: zip64 extra too short");
                    }
                    n0 n0Var4 = n0Var2;
                    long jG = n0Var4.f186428a;
                    if (jG == BodyPartID.bodyIdMax) {
                        jG = l0Var2.g();
                    }
                    n0Var4.f186428a = jG;
                    n0 n0Var5 = n0Var;
                    n0Var5.f186428a = n0Var5.f186428a == BodyPartID.bodyIdMax ? l0Var2.g() : 0L;
                    n0 n0Var6 = n0Var3;
                    n0Var6.f186428a = n0Var6.f186428a == BodyPartID.bodyIdMax ? l0Var2.g() : 0L;
                } else if (iIntValue == 10) {
                    if (jLongValue < 4) {
                        throw new IOException("bad zip: NTFS extra too short");
                    }
                    l0Var2.skip(4L);
                    o.g(l0Var2, (int) (jLongValue - 4), new z(ref$ObjectRef, l0Var2, ref$ObjectRef2, ref$ObjectRef3, 4));
                }
                return Unit.f186387a;
            }
        });
        if (j2 > 0 && !ref$BooleanRef.f186407a) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String strH2 = l0Var.h(iS26);
        h0.Companion.getClass();
        return new l(g0.a("/", false).e(strH), a0.y(strH, "/", false), strH2, jT9, n0Var.f186428a, n0Var2.f186428a, iS2, n0Var3.f186428a, iS23, iS22, (Long) ref$ObjectRef.f186409a, (Long) ref$ObjectRef2.f186409a, (Long) ref$ObjectRef3.f186409a, 57344);
    }

    public static final void g(mmm.k kVar, int i, Function2 function2) throws IOException {
        long j2 = i;
        while (j2 != 0) {
            if (j2 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iS2 = kVar.S2() & HPKE.aead_EXPORT_ONLY;
            long jS2 = ((long) kVar.S2()) & 65535;
            long j3 = j2 - ((long) 4);
            if (j3 < jS2) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            kVar.b(jS2);
            long j5 = kVar.getBuffer().f207266b;
            function2.invoke(Integer.valueOf(iS2), Long.valueOf(jS2));
            long j16 = (kVar.getBuffer().f207266b + jS2) - j5;
            if (j16 < 0) {
                throw new IOException(a0.d.n("unsupported zip: too many bytes processed for ", iS2));
            }
            if (j16 > 0) {
                kVar.getBuffer().skip(j16);
            }
            j2 = j3 - jS2;
        }
    }

    public static final l h(l0 l0Var, l lVar) throws IOException {
        int iT9 = l0Var.t9();
        if (iT9 != 67324752) {
            throw new IOException("bad zip: expected " + e(67324752) + " but was " + e(iT9));
        }
        l0Var.skip(2L);
        short sS2 = l0Var.S2();
        int i = sS2 & HPKE.aead_EXPORT_ONLY;
        if ((sS2 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + e(i));
        }
        l0Var.skip(18L);
        long jS2 = ((long) l0Var.S2()) & 65535;
        int iS2 = l0Var.S2() & HPKE.aead_EXPORT_ONLY;
        l0Var.skip(jS2);
        if (lVar == null) {
            l0Var.skip(iS2);
            return null;
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        g(l0Var, iS2, new z(l0Var, ref$ObjectRef, ref$ObjectRef2, ref$ObjectRef3, 3));
        return new l(lVar.f217412a, lVar.f217413b, lVar.f217414c, lVar.d, lVar.e, lVar.f, lVar.f217415g, lVar.f217416h, lVar.i, lVar.f217417j, lVar.k, lVar.f217418l, lVar.f217419m, (Integer) ref$ObjectRef.f186409a, (Integer) ref$ObjectRef2.f186409a, (Integer) ref$ObjectRef3.f186409a);
    }

    public static final int i(p0 p0Var, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(p0Var, "<this>");
        int[] iArr = p0Var.f;
        int i3 = i + 1;
        int length = p0Var.e.length;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i5 = length - 1;
        int i6 = 0;
        while (true) {
            if (i6 <= i5) {
                i2 = (i6 + i5) >>> 1;
                int i21 = iArr[i2];
                if (i21 >= i3) {
                    if (i21 <= i3) {
                        break;
                    }
                    i5 = i2 - 1;
                } else {
                    i6 = i2 + 1;
                }
            } else {
                i2 = (-i6) - 1;
                break;
            }
        }
        return i2 >= 0 ? i2 : ~i2;
    }
}
