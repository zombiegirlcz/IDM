package id;

import hd.s;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import md.w2;

/* JADX INFO: loaded from: classes17.dex */
public final class q implements ad.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mp.p f160372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final by5.a f160373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final by5.a f160374c;

    public q(mp.p pVar) {
        this.f160372a = pVar;
        boolean zIsEmpty = ((kd.a) pVar.d).f182757a.isEmpty();
        by5.a aVar = s.f151367a;
        if (zIsEmpty) {
            this.f160373b = aVar;
            this.f160374c = aVar;
            return;
        }
        hd.i iVar = (hd.i) hd.j.f151349b.f151351a.get();
        iVar = iVar == null ? hd.j.f151350c : iVar;
        s.a(pVar);
        iVar.getClass();
        this.f160373b = aVar;
        this.f160374c = aVar;
    }

    @Override // ad.n
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        by5.a aVar = this.f160374c;
        if (length <= 5) {
            aVar.getClass();
            throw new GeneralSecurityException("tag too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
        mp.p pVar = this.f160372a;
        for (ad.o oVar : pVar.l(bArrCopyOf)) {
            try {
                ((ad.n) oVar.f3204b).a(bArrCopyOfRange, oVar.e.equals(w2.LEGACY) ? hx7.i.c(bArr2, r.f160376b) : bArr2);
                aVar.getClass();
                return;
            } catch (GeneralSecurityException e) {
                r.f160375a.info("tag prefix matches a key, but cannot verify: " + e);
            }
        }
        Iterator it8 = pVar.l(ad.c.f3190a).iterator();
        while (it8.hasNext()) {
            try {
                ((ad.n) ((ad.o) it8.next()).f3204b).a(bArr, bArr2);
                aVar.getClass();
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        aVar.getClass();
        throw new GeneralSecurityException("invalid MAC");
    }

    @Override // ad.n
    public final byte[] b(byte[] bArr) throws GeneralSecurityException {
        by5.a aVar = this.f160373b;
        ad.o oVar = (ad.o) this.f160372a.f207710c;
        if (oVar.e.equals(w2.LEGACY)) {
            bArr = hx7.i.c(bArr, r.f160376b);
        }
        try {
            byte[] bArr2 = oVar.f3205c;
            byte[] bArrC = hx7.i.c(bArr2 == null ? null : Arrays.copyOf(bArr2, bArr2.length), ((ad.n) oVar.f3204b).b(bArr));
            int i = oVar.f;
            aVar.getClass();
            return bArrC;
        } catch (GeneralSecurityException e) {
            aVar.getClass();
            throw e;
        }
    }
}
