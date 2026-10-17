package e9d;

import com.revolut.core.model.faq.FaqNodeBase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f123960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FaqNodeBase f123961b;

    public p(String transactionId, FaqNodeBase faqNodeBase) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f123960a = transactionId;
        this.f123961b = faqNodeBase;
    }
}
