package vn5;

import com.fasterxml.jackson.core.n;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.zip.CRC32;
import kn5.f;
import kn5.h;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import zhm.a1;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements rn5.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f290754c;
    public static final LinkedHashSet d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mn5.b f290755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f290756b;

    static {
        String[] elements = {"addr1", "Ae2td", "DdzFFz", "stake1"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        f290754c = setY0;
        String[] elements2 = {"addr_test", "stake_test"};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        d = a1.l(kotlin.collections.d.y0(elements2), setY0);
    }

    public d(mn5.b base58Codec, ln5.c crc32Calculator, e bech32Validator) {
        Intrinsics.checkNotNullParameter(base58Codec, "base58Codec");
        Intrinsics.checkNotNullParameter(crc32Calculator, "crc32Calculator");
        Intrinsics.checkNotNullParameter(bech32Validator, "bech32Validator");
        this.f290755a = base58Codec;
        this.f290756b = bech32Validator;
    }

    public static b b(com.fasterxml.jackson.dataformat.cbor.e eVar) throws IOException {
        b bVar = new b(0);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        n nVarS = eVar.S();
        while (nVarS != n.END_ARRAY) {
            int i = nVarS == null ? -1 : c.f290753a[nVarS.ordinal()];
            if (i == 1) {
                com.fasterxml.jackson.core.b bVar2 = com.fasterxml.jackson.core.c.f26164a;
                n nVar = eVar.f123820a;
                if (nVar != n.VALUE_EMBEDDED_OBJECT) {
                    if (nVar != n.VALUE_STRING) {
                        throw eVar.d(nVar, "Current token (%s) not VALUE_EMBEDDED_OBJECT or VALUE_STRING, can not access as binary");
                    }
                    if (eVar.f26204q) {
                        eVar.C();
                    }
                    if (eVar.f26201m == null) {
                        j9.c cVar = eVar.f26200l;
                        if (cVar == null) {
                            eVar.f26200l = new j9.c(500);
                        } else {
                            cVar.f172251b = 0;
                            cVar.d = 0;
                            LinkedList linkedList = cVar.f172250a;
                            if (!linkedList.isEmpty()) {
                                linkedList.clear();
                            }
                        }
                        j9.c cVar2 = eVar.f26200l;
                        try {
                            bVar2.c(eVar.i(), cVar2);
                            eVar.f26201m = cVar2.h();
                        } catch (IllegalArgumentException e) {
                            eVar.g(e.getMessage());
                            throw null;
                        }
                    }
                    byte[] bArr = eVar.f26201m;
                    byteArrayOutputStream.write(bArr, 0, bArr.length);
                } else if (eVar.f26204q) {
                    eVar.f26204q = false;
                    int iU = eVar.u(eVar.f26205r & 31);
                    if (iU >= 0) {
                        eVar.K(byteArrayOutputStream, iU);
                    } else {
                        while (true) {
                            int iS = eVar.s(2);
                            if (iS < 0) {
                                break;
                            }
                            eVar.K(byteArrayOutputStream, iS);
                        }
                    }
                } else {
                    byte[] bArr2 = eVar.f26201m;
                    if (bArr2 != null) {
                        byteArrayOutputStream.write(bArr2, 0, bArr2.length);
                    }
                }
                bVar.f290751a = byteArrayOutputStream.toByteArray();
            } else if (i == 2) {
                bVar.f290752b = eVar.Q();
            }
            nVarS = eVar.S();
        }
        return bVar;
    }

    @Override // rn5.a
    public final f a(kn5.a params) {
        b bVar;
        n nVarS;
        Object eVar;
        Intrinsics.checkNotNullParameter(params, "params");
        String str = params.f185996a;
        if (str.length() == 0) {
            return new kn5.e(h.f186003a);
        }
        byte[] bArrA = this.f290755a.a(str, "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz");
        if (bArrA == null) {
            bVar = new b(0);
        } else {
            com.fasterxml.jackson.dataformat.cbor.e eVarE = new com.fasterxml.jackson.dataformat.cbor.b().e(bArrA);
            try {
                try {
                } catch (Throwable th10) {
                    try {
                        throw th10;
                    } catch (Throwable th11) {
                        com.bumptech.glide.d.e(eVarE, th10);
                        throw th11;
                    }
                }
            } catch (Exception unused) {
            }
            for (nVarS = eVarE.S(); nVarS != null; nVarS = eVarE.S()) {
                if (nVarS == n.START_ARRAY) {
                    b bVarB = b(eVarE);
                    eVarE.close();
                    bVar = bVarB;
                    break;
                }
                Unit unit = Unit.f186387a;
                eVarE.close();
                bVar = new b(0);
            }
            Unit unit2 = Unit.f186387a;
            eVarE.close();
            bVar = new b(0);
        }
        byte[] input = bVar.f290751a;
        kn5.c cVar = kn5.c.f186000a;
        if (input != null) {
            Intrinsics.checkNotNullParameter(input, "input");
            CRC32 crc32 = new CRC32();
            crc32.update(input);
            eVar = crc32.getValue() == bVar.f290752b ? cVar : new kn5.e(null);
        } else {
            eVar = new kn5.e(null);
        }
        f fVarB = this.f290756b.b(str);
        if (!eVar.equals(cVar) && fVarB.equals(cVar)) {
            Iterable iterable = params.f185998c ? d : f290754c;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it8 = iterable.iterator();
                while (it8.hasNext()) {
                    if (a0.H(str, (String) it8.next(), false)) {
                    }
                }
            }
            return new kn5.e(null);
        }
        return fVarB.equals(cVar) | eVar.equals(cVar) ? cVar : new kn5.e(null);
    }
}
