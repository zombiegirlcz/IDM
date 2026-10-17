package ecm;

import com.google.common.io.BaseEncoding;
import java.nio.charset.Charset;
import java.util.BitSet;

/* JADX INFO: loaded from: classes13.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f124850a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final BaseEncoding f124851b = m1.e;

    public static k1 a(String str, gcm.m1 m1Var) {
        boolean z = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z = true;
        }
        BitSet bitSet = i1.d;
        return new k1(str, z, m1Var);
    }
}
