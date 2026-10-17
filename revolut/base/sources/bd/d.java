package bd;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes17.dex */
public final class d implements ad.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mp.p f14465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final by5.a f14466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final by5.a f14467c;

    public d(mp.p pVar) {
        this.f14465a = pVar;
        boolean zIsEmpty = ((kd.a) pVar.d).f182757a.isEmpty();
        by5.a aVar = hd.s.f151367a;
        if (zIsEmpty) {
            this.f14466b = aVar;
            this.f14467c = aVar;
            return;
        }
        hd.i iVar = (hd.i) hd.j.f151349b.f151351a.get();
        iVar = iVar == null ? hd.j.f151350c : iVar;
        hd.s.a(pVar);
        iVar.getClass();
        this.f14466b = aVar;
        this.f14467c = aVar;
    }

    @Override // ad.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        by5.a aVar = this.f14466b;
        ad.o oVar = (ad.o) this.f14465a.f207710c;
        try {
            byte[] bArr3 = oVar.f3205c;
            byte[] bArrC = hx7.i.c(bArr3 == null ? null : Arrays.copyOf(bArr3, bArr3.length), ((ad.a) oVar.f3204b).a(bArr, bArr2));
            int i = oVar.f;
            int length = bArr.length;
            aVar.getClass();
            return bArrC;
        } catch (GeneralSecurityException e) {
            aVar.getClass();
            throw e;
        }
    }

    @Override // ad.a
    public final byte[] decrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        mp.p pVar = this.f14465a;
        by5.a aVar = this.f14467c;
        if (length > 5) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            Iterator it8 = pVar.l(bArrCopyOf).iterator();
            while (it8.hasNext()) {
                try {
                    byte[] bArrDecrypt = ((ad.a) ((ad.o) it8.next()).f3204b).decrypt(bArrCopyOfRange, bArr2);
                    aVar.getClass();
                    return bArrDecrypt;
                } catch (GeneralSecurityException e) {
                    e.f14471a.info("ciphertext prefix matches a key, but cannot decrypt: " + e);
                }
            }
        }
        Iterator it9 = pVar.l(ad.c.f3190a).iterator();
        while (it9.hasNext()) {
            try {
                byte[] bArrDecrypt2 = ((ad.a) ((ad.o) it9.next()).f3204b).decrypt(bArr, bArr2);
                aVar.getClass();
                return bArrDecrypt2;
            } catch (GeneralSecurityException unused) {
            }
        }
        aVar.getClass();
        throw new GeneralSecurityException("decryption failed");
    }
}
