package slm;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import yhm.m;

/* JADX INFO: loaded from: classes14.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f264252a;

    static {
        Object objA;
        try {
            m.Companion aVar = yhm.m.INSTANCE;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            objA = property != null ? kotlin.text.z.m(property) : null;
        } catch (Throwable th10) {
            m.Companion aVar2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        Integer num = (Integer) (objA instanceof yhm.n ? null : objA);
        f264252a = num != null ? num.intValue() : PKIFailureInfo.badSenderNonce;
    }
}
