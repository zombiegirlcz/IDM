package f9d;

import com.revolut.core.model.faq.FaqNodeBase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f132927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FaqNodeBase f132928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f132929c;
    public final String d;

    public i(String transactionId, FaqNodeBase faqNodeBase, String key, String title) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f132927a = transactionId;
        this.f132928b = faqNodeBase;
        this.f132929c = key;
        this.d = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f132927a, iVar.f132927a) && Intrinsics.f(this.f132928b, iVar.f132928b) && Intrinsics.f(this.f132929c, iVar.f132929c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f132927a.hashCode() * 31;
        FaqNodeBase faqNodeBase = this.f132928b;
        return this.d.hashCode() + p.a.c((iHashCode + (faqNodeBase == null ? 0 : faqNodeBase.hashCode())) * 31, 31, this.f132929c);
    }
}
