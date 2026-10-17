package ecm;

import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes13.dex */
public abstract class i1 {
    public static final BitSet d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f124819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f124820c;

    static {
        BitSet bitSet = new BitSet(CertificateBody.profileType);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (char c2 = '0'; c2 <= '9'; c2 = (char) (c2 + 1)) {
            bitSet.set(c2);
        }
        for (char c3 = 'a'; c3 <= 'z'; c3 = (char) (c3 + 1)) {
            bitSet.set(c3);
        }
        d = bitSet;
    }

    public i1(String str, boolean z, Object obj2) {
        String lowerCase = ((String) Preconditions.checkNotNull(str, "name")).toLowerCase(Locale.ROOT);
        Preconditions.checkNotNull(lowerCase, "name");
        Preconditions.checkArgument(!lowerCase.isEmpty(), "token must have at least 1 tchar");
        if (lowerCase.equals("connection")) {
            m1.f124842c.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
        }
        for (int i = 0; i < lowerCase.length(); i++) {
            char cCharAt = lowerCase.charAt(i);
            if (!z || cCharAt != ':' || i != 0) {
                Preconditions.checkArgument(d.get(cCharAt), "Invalid character '%s' in key name '%s'", cCharAt, (Object) lowerCase);
            }
        }
        this.f124818a = lowerCase;
        this.f124819b = lowerCase.getBytes(Charsets.US_ASCII);
        this.f124820c = obj2;
    }

    public abstract Object a(byte[] bArr);

    public abstract byte[] b(Object obj2);

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        return this.f124818a.equals(((i1) obj2).f124818a);
    }

    public final int hashCode() {
        return this.f124818a.hashCode();
    }

    public final String toString() {
        return v0.a.i(new StringBuilder("Key{name='"), this.f124818a, "'}");
    }
}
