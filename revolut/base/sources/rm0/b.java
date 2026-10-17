package rm0;

import android.security.keystore.KeyPermanentlyInvalidatedException;
import com.revolut.core.security.exception.CertificateException;
import com.revolut.core.security.provider.cipher.ClearedCipherProviderException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.time.Clock;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements q, h {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f255137n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qm.e f255138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f255139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScope f255140c;
    public final wm0.c d;
    public final n e;
    public final o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a0 f255141g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f255142h;
    public final ReentrantReadWriteLock i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ConcurrentHashMap f255143j;
    public final ConcurrentHashMap k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicInteger f255144l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AtomicInteger f255145m;

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        f255137n = kotlin.time.c.g(15, pkm.e.SECONDS);
    }

    public b(qm.e secureKeyChecker, e0 securityFeatureToggles, CoroutineScope coroutineScope, wm0.c keystoreProvider, n cipherCertificateGenerator, o cipherFactory, a0 keyStoreErrorsTracker) {
        Intrinsics.checkNotNullParameter(secureKeyChecker, "secureKeyChecker");
        Intrinsics.checkNotNullParameter(securityFeatureToggles, "securityFeatureToggles");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(keystoreProvider, "keystoreProvider");
        Intrinsics.checkNotNullParameter(cipherCertificateGenerator, "cipherCertificateGenerator");
        Intrinsics.checkNotNullParameter(cipherFactory, "cipherFactory");
        Intrinsics.checkNotNullParameter(keyStoreErrorsTracker, "keyStoreErrorsTracker");
        this.f255138a = secureKeyChecker;
        this.f255139b = securityFeatureToggles;
        this.f255140c = coroutineScope;
        this.d = keystoreProvider;
        this.e = cipherCertificateGenerator;
        this.f = cipherFactory;
        this.f255141g = keyStoreErrorsTracker;
        this.f255142h = new AtomicBoolean(false);
        this.i = new ReentrantReadWriteLock();
        this.f255143j = new ConcurrentHashMap();
        this.k = new ConcurrentHashMap();
        this.f255144l = new AtomicInteger(0);
        this.f255145m = new AtomicInteger(0);
    }

    public static String c(Object obj2) {
        return obj2.equals(d.f255149a) ? "CertificateExist" : obj2.equals(c.f255146a) ? "CertificateAbsent" : obj2.equals(g.f255157a) ? "CertificateInvalidated" : obj2 instanceof f ? "CertificateFail" : obj2 instanceof e ? "CertificateExistWithCryptoObject" : "Unknown state";
    }

    public static void l(String str) {
        String str2 = str + " When: " + Clock.systemUTC().instant() + " Thread: " + Thread.currentThread();
    }

    public final Cipher a(int i, Key key, hn0.k kVar) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipherA = this.f.a(kVar.b(), i, key);
        if (i == 2) {
            this.f255144l.incrementAndGet();
            return cipherA;
        }
        this.f255145m.incrementAndGet();
        return cipherA;
    }

    public final j b(hn0.k alias) {
        j jVarD;
        Intrinsics.checkNotNullParameter(alias, "alias");
        r6.b.s("createOrReplaceCertificate(", alias.c(), ") started");
        ReentrantReadWriteLock reentrantReadWriteLock = this.i;
        reentrantReadWriteLock.writeLock().lock();
        r6.b.s("createOrReplaceCertificate(", alias.c(), ") writeLock locked");
        try {
            wm0.f fVarA = this.d.a();
            if (Intrinsics.f(alias.a(), hn0.d.f154015a)) {
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.WARNING, "AsymmetricCipherProvider", "Deleting Default certificate (createOrReplaceCertificate, " + alias.b() + ")", null, null, 16);
            }
            wm0.g gVar = (wm0.g) fVarA;
            gVar.c(alias.c());
            this.f255143j.remove(alias);
            j(gVar, alias);
            jVarD = d(alias);
        } catch (Throwable th10) {
            try {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, "alias:" + alias.c(), th10, h0Var);
                f fVar = new f(th10);
                reentrantReadWriteLock.writeLock().unlock();
                r6.b.s("createOrReplaceCertificate(", alias.c(), ") writeLock unlocked");
                jVarD = fVar;
            } finally {
                reentrantReadWriteLock.writeLock().unlock();
                r6.b.s("createOrReplaceCertificate(", alias.c(), ") writeLock unlocked");
            }
        }
        l("createOrReplaceCertificate(" + alias.c() + ") ended with " + c(jVarD));
        return jVarD;
    }

    @Override // od0.e
    public final void clear() {
        l("clear() started");
        ReentrantReadWriteLock reentrantReadWriteLock = this.i;
        reentrantReadWriteLock.writeLock().lock();
        l("clear() writeLock locked");
        try {
            wm0.f fVarA = this.d.a();
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.WARNING, "AsymmetricCipherProvider", "Deleting all certificates (clear)", null, null, 16);
            wm0.g gVar = (wm0.g) fVarA;
            Enumeration enumerationA = gVar.a();
            Intrinsics.checkNotNullParameter(enumerationA, "<this>");
            ge0.a aVar = new ge0.a(enumerationA, 1);
            while (aVar.hasNext()) {
                gVar.c((String) aVar.next());
            }
            this.f255143j.clear();
            reentrantReadWriteLock.writeLock().unlock();
            l("clear() writeLock unlocked");
            this.f255145m.set(0);
            this.f255144l.set(0);
            this.f255142h.set(true);
            l("clear() ended");
        } catch (Throwable th10) {
            reentrantReadWriteLock.writeLock().unlock();
            l("clear() writeLock unlocked");
            throw th10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, rm0.j] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final j d(hn0.k alias) {
        ?? fVar = this.f255143j;
        Intrinsics.checkNotNullParameter(alias, "alias");
        r6.b.s("getCertificateState(", alias.c(), ") started");
        ReentrantReadWriteLock reentrantReadWriteLock = this.i;
        reentrantReadWriteLock.readLock().lock();
        r6.b.s("getCertificateState(", alias.c(), ") readLock locked");
        try {
            wm0.g gVar = (wm0.g) this.d.a();
            if (gVar.b(alias.c())) {
                Key keyE = gVar.e(alias.c());
                Intrinsics.i(keyE, "null cannot be cast to non-null type java.security.Key");
                fVar.remove(alias);
                h(keyE, alias);
                fVar = d.f255149a;
            } else {
                fVar = c.f255146a;
            }
        } finally {
            try {
            } catch (Throwable th10) {
            }
        }
        reentrantReadWriteLock.readLock().unlock();
        r6.b.s("getCertificateState(", alias.c(), ") readLock unlocked");
        l("getCertificateState(" + alias.c() + ") ended with " + c(fVar));
        return fVar;
    }

    public final i e(hn0.k alias) {
        i fVar;
        Cipher cipher;
        ConcurrentHashMap concurrentHashMap = this.f255143j;
        Intrinsics.checkNotNullParameter(alias, "alias");
        r6.b.s("getCipherInitializedForDecryption(", alias.c(), ") started");
        if (this.f255142h.get()) {
            ClearedCipherProviderException clearedCipherProviderException = new ClearedCipherProviderException(alias);
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "AsymmetricCipherProvider", null, clearedCipherProviderException, h0Var);
        }
        ReentrantReadWriteLock reentrantReadWriteLock = this.i;
        reentrantReadWriteLock.readLock().lock();
        r6.b.s("getCipherInitializedForDecryption(", alias.c(), ") readLock locked");
        try {
            cipher = (Cipher) concurrentHashMap.get(alias);
        } finally {
            try {
            } finally {
            }
        }
        if (cipher != null) {
            e eVar = new e(cipher);
            reentrantReadWriteLock.readLock().unlock();
            r6.b.s("getCipherInitializedForDecryption(", alias.c(), ") readLock unlocked");
            return eVar;
        }
        Key keyE = ((wm0.g) this.d.a()).e(alias.c());
        if (keyE == null) {
            fVar = c.f255146a;
        } else {
            PrivateKey privateKey = (PrivateKey) keyE;
            if (alias.a().b()) {
                this.f255138a.b(privateKey);
            }
            fVar = new e(h(privateKey, alias));
        }
        l("getCipherInitializedForDecryption(" + alias.c() + ") ended with " + c(fVar));
        return fVar;
    }

    public final Cipher g(hn0.k alias) {
        i fVar;
        Intrinsics.checkNotNullParameter(alias, "alias");
        l("getCipherInitializedForEncryptionOrThrow(" + alias.c() + ") started");
        Intrinsics.checkNotNullParameter(alias, "alias");
        r6.b.s("getCipherInitializedForEncryption(", alias.c(), ") started");
        if (this.f255142h.get()) {
            ClearedCipherProviderException clearedCipherProviderException = new ClearedCipherProviderException(alias);
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "AsymmetricCipherProvider", null, clearedCipherProviderException, h0Var);
        }
        ReentrantReadWriteLock reentrantReadWriteLock = this.i;
        reentrantReadWriteLock.writeLock().lock();
        r6.b.s("getCipherInitializedForEncryption(", alias.c(), ") writeLock locked");
        try {
            try {
                PublicKey publicKey = i(this.d.a(), alias).getPublicKey();
                Intrinsics.h(publicKey);
                fVar = new e(a(1, publicKey, alias));
            } catch (Throwable th10) {
                reentrantReadWriteLock.writeLock().unlock();
                r6.b.s("getCipherInitializedForEncryption(", alias.c(), ") writeLock unlocked");
                throw th10;
            }
        } catch (KeyPermanentlyInvalidatedException unused) {
            fVar = g.f255157a;
        } catch (Throwable th11) {
            fVar = new f(th11);
        }
        reentrantReadWriteLock.writeLock().unlock();
        r6.b.s("getCipherInitializedForEncryption(", alias.c(), ") writeLock unlocked");
        l("getCipherInitializedForEncryption(" + alias.c() + ") ended with " + c(fVar));
        Cipher cipherK = k(fVar, alias, true);
        l("getCipherInitializedForEncryptionOrThrow(" + alias.c() + ") ended with " + cipherK);
        return cipherK;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public final Cipher h(Key key, hn0.k kVar) {
        if (!((Boolean) this.f255139b.f.getValue()).booleanValue()) {
            return a(2, key, kVar);
        }
        Object objComputeIfAbsent = this.f255143j.computeIfAbsent(kVar, new bpd.a(new qz9.o(this, 20, key, kVar), 17));
        Intrinsics.h(objComputeIfAbsent);
        return (Cipher) objComputeIfAbsent;
    }

    public final Certificate i(wm0.f fVar, hn0.k kVar) {
        List listC;
        wm0.g gVar = (wm0.g) fVar;
        Certificate certificateD = gVar.d(kVar.c());
        if (certificateD != null) {
            return certificateD;
        }
        j jVarB = b(kVar);
        if (jVarB.equals(c.f255146a)) {
            try {
                listC = Collections.list(gVar.a());
                Intrinsics.checkNotNullExpressionValue(listC, "list(...)");
            } catch (Throwable unused) {
                listC = zhm.u.c("N/A");
            }
            throw new CertificateException.CertificateAbsent(kVar, listC, true);
        }
        if (jVarB.equals(d.f255149a)) {
            Certificate certificateD2 = gVar.d(kVar.c());
            if (certificateD2 != null) {
                return certificateD2;
            }
            throw new CertificateException.CertificateFailure(kVar, new IllegalStateException("Unable to get certificate"));
        }
        if (jVarB instanceof f) {
            throw new CertificateException.CertificateFailure(kVar, ((f) jVarB).f255156a);
        }
        if (jVarB.equals(g.f255157a)) {
            throw new CertificateException.CertificateInvalidated(kVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void j(wm0.g gVar, hn0.k kVar) throws KeyStoreException {
        boolean zB = gVar.b(kVar.c());
        Certificate certificateD = null;
        if (zB) {
            try {
                certificateD = gVar.d(kVar.c());
            } catch (Exception e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            }
        }
        if (certificateD == null && zB) {
            gVar.c(kVar.c());
            this.f255143j.remove(kVar);
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.b(rd0.c.WARNING, "AsymmetricCipherProvider", j6.a.q("Key store contains non certificate entry for ", kVar.c()), null, null, 16);
        }
        if (certificateD == null) {
            Intrinsics.h(this.e.a(kVar).getPublic());
        } else {
            Intrinsics.h(certificateD.getPublicKey());
        }
    }

    public final Cipher k(i iVar, hn0.k kVar, boolean z) {
        List listC;
        if (iVar instanceof e) {
            return (Cipher) ((e) iVar).a();
        }
        if (iVar.equals(c.f255146a)) {
            try {
                listC = Collections.list(((wm0.g) this.d.a()).a());
                Intrinsics.checkNotNullExpressionValue(listC, "list(...)");
            } catch (Throwable unused) {
                listC = zhm.u.c("N/A");
            }
            throw new CertificateException.CertificateAbsent(kVar, listC, z);
        }
        if (iVar instanceof f) {
            throw new CertificateException.CertificateFailure(kVar, ((f) iVar).f255156a);
        }
        if (iVar.equals(g.f255157a)) {
            throw new CertificateException.CertificateInvalidated(kVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void m(hn0.k alias) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        r6.b.s("removeCertificate(", alias.c(), ") started");
        ReentrantReadWriteLock reentrantReadWriteLock = this.i;
        reentrantReadWriteLock.writeLock().lock();
        r6.b.s("removeCertificate(", alias.c(), ") writeLock locked");
        try {
            wm0.g gVar = (wm0.g) this.d.a();
            if (gVar.b(alias.c())) {
                if (Intrinsics.f(alias.a(), hn0.d.f154015a)) {
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.b(rd0.c.WARNING, "AsymmetricCipherProvider", "Deleting Default certificate (removeCertificate)", null, null, 16);
                }
                gVar.c(alias.c());
                this.f255143j.remove(alias);
            }
            reentrantReadWriteLock.writeLock().unlock();
            l("removeCertificate(" + alias.c() + ") writeLock unlocked");
            r6.b.s("removeCertificate(", alias.c(), ") ended");
        } catch (Throwable th10) {
            reentrantReadWriteLock.writeLock().unlock();
            r6.b.s("removeCertificate(", alias.c(), ") writeLock unlocked");
            throw th10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        r4.readLock().unlock();
        l("useCipherInitializedForDecryptionOrThrow(" + r17.c() + ") ended with " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0082, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(hn0.k r17, rlh.d0 r18) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r3 = r18
            java.lang.String r0 = "alias"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "decrypt"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.concurrent.locks.ReentrantReadWriteLock r4 = r1.i
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r4.readLock()
            r0.lock()
            java.lang.String r0 = r2.c()
            java.lang.String r5 = ") started"
            java.lang.String r6 = "useCipherInitializedForDecryptionOrThrow("
            r6.b.s(r6, r0, r5)
            rm0.a0 r5 = r1.f255141g
            eo.e r7 = new eo.e
            eo.d r0 = eo.d.DECRYPTION_WITH_CIPHER
            hn0.c r8 = r2.a()
            eo.c r8 = ifk.b.t(r8)
            r7.<init>(r0, r8)
            r8 = 1
            r0 = 0
            r9 = 0
            r14 = r8
            r12 = r9
        L3c:
            r11 = r0
            int r15 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r15 <= 0) goto L47
            java.lang.Thread.sleep(r12)     // Catch: java.lang.Throwable -> L45
            goto L47
        L45:
            r0 = move-exception
            goto La9
        L47:
            r9 = 0
            rm0.i r0 = r16.e(r17)     // Catch: java.lang.Throwable -> L5e
            javax.crypto.Cipher r0 = r1.k(r0, r2, r9)     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r0 = r3.invoke(r0)     // Catch: java.lang.Throwable -> L5e
            if (r11 == 0) goto L60
            eo.e r10 = eo.e.a(r7, r14, r8)     // Catch: java.lang.Throwable -> L5e
            r5.a(r10, r11)     // Catch: java.lang.Throwable -> L5e
            goto L60
        L5e:
            r0 = move-exception
            goto L83
        L60:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r4.readLock()
            r3.unlock()
            java.lang.String r2 = r2.c()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r6)
            r3.append(r2)
            java.lang.String r2 = ") ended with "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r2 = r3.toString()
            l(r2)
            return r0
        L83:
            if (r15 != 0) goto L89
            r12 = 100
            r8 = r9
            goto L8d
        L89:
            r10 = 2
            long r8 = (long) r10
            long r12 = r12 * r8
            r8 = 0
        L8d:
            eo.e r8 = eo.e.a(r7, r14, r8)     // Catch: java.lang.Throwable -> L45
            r5.a(r8, r0)     // Catch: java.lang.Throwable -> L45
            if (r11 == 0) goto L99
            yhm.f.a(r0, r11)     // Catch: java.lang.Throwable -> L45
        L99:
            java.util.concurrent.ConcurrentHashMap r8 = r1.f255143j     // Catch: java.lang.Throwable -> L45
            r8.remove(r2)     // Catch: java.lang.Throwable -> L45
            int r8 = r14 + 1
            r9 = 3
            if (r14 >= r9) goto La8
            r14 = r8
            r8 = 1
            r9 = 0
            goto L3c
        La8:
            throw r0     // Catch: java.lang.Throwable -> L45
        La9:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r4.readLock()
            r2.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rm0.b.n(hn0.k, rlh.d0):java.lang.Object");
    }
}
