package fd;

import ad.d;
import ad.o;
import hd.i;
import hd.j;
import hd.s;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import mp.p;

/* JADX INFO: loaded from: classes17.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f133843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final by5.a f133844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final by5.a f133845c;

    public b(p pVar) {
        this.f133843a = pVar;
        boolean zIsEmpty = ((kd.a) pVar.d).f182757a.isEmpty();
        by5.a aVar = s.f151367a;
        if (zIsEmpty) {
            this.f133844b = aVar;
            this.f133845c = aVar;
            return;
        }
        i iVar = (i) j.f151349b.f151351a.get();
        iVar = iVar == null ? j.f151350c : iVar;
        s.a(pVar);
        iVar.getClass();
        this.f133844b = aVar;
        this.f133845c = aVar;
    }

    @Override // ad.d
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        p pVar = this.f133843a;
        by5.a aVar = this.f133845c;
        if (length > 5) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            Iterator it8 = pVar.l(bArrCopyOf).iterator();
            while (it8.hasNext()) {
                try {
                    byte[] bArrA = ((d) ((o) it8.next()).f3204b).a(bArrCopyOfRange, bArr2);
                    aVar.getClass();
                    return bArrA;
                } catch (GeneralSecurityException e) {
                    c.f133846a.info("ciphertext prefix matches a key, but cannot decrypt: " + e);
                }
            }
        }
        Iterator it9 = pVar.l(ad.c.f3190a).iterator();
        while (it9.hasNext()) {
            try {
                byte[] bArrA2 = ((d) ((o) it9.next()).f3204b).a(bArr, bArr2);
                aVar.getClass();
                return bArrA2;
            } catch (GeneralSecurityException unused) {
            }
        }
        aVar.getClass();
        throw new GeneralSecurityException("decryption failed");
    }

    @Override // ad.d
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        by5.a aVar = this.f133844b;
        o oVar = (o) this.f133843a.f207710c;
        try {
            byte[] bArr3 = oVar.f3205c;
            byte[] bArrC = hx7.i.c(bArr3 == null ? null : Arrays.copyOf(bArr3, bArr3.length), ((d) oVar.f3204b).b(bArr, bArr2));
            int i = oVar.f;
            aVar.getClass();
            return bArrC;
        } catch (GeneralSecurityException e) {
            aVar.getClass();
            throw e;
        }
    }
}
