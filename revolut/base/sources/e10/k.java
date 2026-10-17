package e10;

import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: loaded from: classes16.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f121818a;

    public k(m thresholds) {
        Intrinsics.checkNotNullParameter(thresholds, "thresholds");
        this.f121818a = thresholds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f121818a.equals(((k) obj2).f121818a);
    }

    public final int hashCode() {
        return Integer.hashCode(BERTags.FLAGS) + j6.a.b(BERTags.FLAGS, this.f121818a.hashCode() * 31, 31);
    }
}
