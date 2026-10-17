package e9d;

import com.revolut.core.model.faq.FaqNodeBase;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FaqNodeBase f123953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f123954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f123955c;
    public final j7d.a d;
    public final boolean e;

    public k(FaqNodeBase faqNodeBase, Data transactions, Data faqActions, j7d.a type, boolean z) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(faqActions, "faqActions");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f123953a = faqNodeBase;
        this.f123954b = transactions;
        this.f123955c = faqActions;
        this.d = type;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f123953a, kVar.f123953a) && Intrinsics.f(this.f123954b, kVar.f123954b) && Intrinsics.f(this.f123955c, kVar.f123955c) && this.d == kVar.d && this.e == kVar.e;
    }

    public final int hashCode() {
        FaqNodeBase faqNodeBase = this.f123953a;
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + kii.e.c(this.f123955c, kii.e.c(this.f123954b, (faqNodeBase == null ? 0 : faqNodeBase.hashCode()) * 31, 31), 31)) * 31);
    }
}
