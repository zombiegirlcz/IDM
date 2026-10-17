package bmm;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class z implements Closeable {

    @NotNull
    public static final x Companion = new x();
    public static final Logger d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mmm.k f16986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f16987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f16988c;

    static {
        Logger logger = Logger.getLogger(i.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(...)");
        d = logger;
    }

    public z(mmm.k source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f16986a = source;
        y yVar = new y(source);
        this.f16987b = yVar;
        this.f16988c = new f(yVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f16986a.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x026f, code lost:
    
        throw new java.io.IOException(a0.d.n("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r9));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(boolean r20, bjm.d r21) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bmm.z.d(boolean, bjm.d):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x013a, code lost:
    
        if (r21 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013c, code lost:
    
        r9.j(ulm.u0.f281141b, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(bjm.d r19, int r20, int r21, int r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bmm.z.f(bjm.d, int, int, int):void");
    }

    public final List g(int i, int i2, int i3, int i5) throws IOException {
        y yVar = this.f16987b;
        yVar.e = i;
        yVar.f16984b = i;
        yVar.f = i2;
        yVar.f16985c = i3;
        yVar.d = i5;
        f fVar = this.f16988c;
        mmm.l0 l0Var = fVar.f16914c;
        ArrayList arrayList = fVar.f16913b;
        while (!l0Var.J()) {
            int iB = vlm.h.b(l0Var.readByte());
            if (iB == 128) {
                throw new IOException("index == 0");
            }
            if ((iB & 128) == 128) {
                int iE = fVar.e(iB, CertificateBody.profileType);
                int i6 = iE - 1;
                if (i6 >= 0) {
                    e[] eVarArr = h.f16924a;
                    if (i6 <= eVarArr.length - 1) {
                        arrayList.add(eVarArr[i6]);
                    }
                }
                int length = fVar.e + 1 + (i6 - h.f16924a.length);
                if (length >= 0) {
                    e[] eVarArr2 = fVar.d;
                    if (length < eVarArr2.length) {
                        e eVar = eVarArr2[length];
                        Intrinsics.h(eVar);
                        arrayList.add(eVar);
                    }
                }
                throw new IOException(a0.d.n("Header index too large ", iE));
            }
            if (iB == 64) {
                e[] eVarArr3 = h.f16924a;
                mmm.m mVarD = fVar.d();
                h.a(mVarD);
                fVar.c(new e(mVarD, fVar.d()));
            } else if ((iB & 64) == 64) {
                fVar.c(new e(fVar.b(fVar.e(iB, 63) - 1), fVar.d()));
            } else if ((iB & 32) == 32) {
                int iE2 = fVar.e(iB, 31);
                fVar.f16912a = iE2;
                if (iE2 < 0 || iE2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + fVar.f16912a);
                }
                int i21 = fVar.f16915g;
                if (iE2 < i21) {
                    if (iE2 == 0) {
                        e[] eVarArr4 = fVar.d;
                        zhm.p.p(eVarArr4, 0, eVarArr4.length, null);
                        fVar.e = fVar.d.length - 1;
                        fVar.f = 0;
                        fVar.f16915g = 0;
                    } else {
                        fVar.a(i21 - iE2);
                    }
                }
            } else if (iB == 16 || iB == 0) {
                e[] eVarArr5 = h.f16924a;
                mmm.m mVarD2 = fVar.d();
                h.a(mVarD2);
                arrayList.add(new e(mVarD2, fVar.d()));
            } else {
                arrayList.add(new e(fVar.b(fVar.e(iB, 15) - 1), fVar.d()));
            }
        }
        List listD1 = zhm.d0.d1(arrayList);
        arrayList.clear();
        return listD1;
    }

    public final void h(bjm.d dVar, int i, int i2, int i3) throws IOException {
        int i5;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        int i6 = 0;
        boolean z = (i2 & 1) != 0;
        int iB = (i2 & 8) != 0 ? vlm.h.b(this.f16986a.readByte()) : 0;
        if ((i2 & 32) != 0) {
            mmm.k kVar = this.f16986a;
            kVar.readInt();
            kVar.readByte();
            byte[] bArr = vlm.h.f290508a;
            i5 = i - 5;
        } else {
            i5 = i;
        }
        Companion.getClass();
        List requestHeaders = g(x.a(i5, i2, iB), iB, i2, i3);
        Intrinsics.checkNotNullParameter(requestHeaders, "headerBlock");
        u uVar = (u) dVar.f16204c;
        if (i3 != 0 && (i3 & 1) == 0) {
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            xlm.b.c(uVar.i, uVar.f16963c + '[' + i3 + "] onHeaders", 0L, new m(uVar, i3, requestHeaders, z), 6);
            return;
        }
        synchronized (uVar) {
            e0 e0VarF = uVar.f(i3);
            if (e0VarF != null) {
                Unit unit = Unit.f186387a;
                e0VarF.j(vlm.j.n(requestHeaders), z);
                return;
            }
            if (uVar.f) {
                return;
            }
            if (i3 <= uVar.d) {
                return;
            }
            if (i3 % 2 == uVar.e % 2) {
                return;
            }
            e0 e0Var = new e0(i3, uVar, false, z, vlm.j.n(requestHeaders));
            uVar.d = i3;
            uVar.f16962b.put(Integer.valueOf(i3), e0Var);
            xlm.b.c(uVar.f16964g.d(), uVar.f16963c + '[' + i3 + "] onStream", 0L, new t(uVar, e0Var, i6), 6);
        }
    }

    public final void i(bjm.d dVar, int i, int i2, int i3) throws IOException {
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iB = (i2 & 8) != 0 ? vlm.h.b(this.f16986a.readByte()) : 0;
        int i5 = this.f16986a.readInt() & Integer.MAX_VALUE;
        Companion.getClass();
        List requestHeaders = g(x.a(i - 4, i2, iB), iB, i2, i3);
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        u uVar = (u) dVar.f16204c;
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        synchronized (uVar) {
            if (uVar.z.contains(Integer.valueOf(i5))) {
                uVar.k(i5, b.PROTOCOL_ERROR);
                return;
            }
            uVar.z.add(Integer.valueOf(i5));
            xlm.b.c(uVar.i, uVar.f16963c + '[' + i5 + "] onRequest", 0L, new m(uVar, i5, requestHeaders), 6);
        }
    }
}
