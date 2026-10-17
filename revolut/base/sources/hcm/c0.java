package hcm;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes13.dex */
public final class c0 {
    public static b0 a(int i) {
        return new b0(new mmm.h(), Math.min(PKIFailureInfo.badCertTemplate, Math.max(4096, i)));
    }
}
