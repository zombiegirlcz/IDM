package i9d;

import com.revolut.core.model.faq.FaqNodeBase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f159635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FaqNodeBase f159636b;

    public g(String transactionId, FaqNodeBase faqNodeBase) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f159635a = transactionId;
        this.f159636b = faqNodeBase;
    }
}
