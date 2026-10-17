package cd;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.crypto.Cipher;
import nd.j;

/* JADX INFO: loaded from: classes17.dex */
public final class b extends ThreadLocal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23128a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f23128a) {
            case 0:
                try {
                    return (Cipher) j.f214261b.f214263a.e("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e) {
                    throw new IllegalStateException(e);
                }
            case 1:
                try {
                    return (Cipher) j.f214261b.f214263a.e("AES/GCM-SIV/NoPadding");
                } catch (GeneralSecurityException e2) {
                    throw new IllegalStateException(e2);
                }
            case 2:
                try {
                    return (Cipher) j.f214261b.f214263a.e("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e4) {
                    throw new IllegalStateException(e4);
                }
            case 3:
                try {
                    return (Cipher) j.f214261b.f214263a.e("AES/ECB/NOPADDING");
                } catch (GeneralSecurityException e5) {
                    throw new IllegalStateException(e5);
                }
            case 4:
                try {
                    return (Cipher) j.f214261b.f214263a.e("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e6) {
                    throw new IllegalStateException(e6);
                }
            case 5:
                SecureRandom secureRandom = new SecureRandom();
                secureRandom.nextLong();
                return secureRandom;
            default:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(vlm.j.f290512a);
                return simpleDateFormat;
        }
    }
}
