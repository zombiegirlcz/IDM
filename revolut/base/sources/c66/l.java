package c66;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;
import org.bouncycastle.crypto.digests.SHA512Digest;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l extends q implements Function0 {
    public static final l f = new l();

    public l() {
        super(0, SHA512Digest.class, "<init>", "<init>()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new SHA512Digest();
    }
}
