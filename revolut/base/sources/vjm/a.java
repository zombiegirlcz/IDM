package vjm;

import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f289824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f289825b;

    public a(MessageLite messageLite, int i) {
        this.f289824a = messageLite;
        this.f289825b = i;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f289824a == aVar.f289824a && this.f289825b == aVar.f289825b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f289824a) * Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) + this.f289825b;
    }
}
