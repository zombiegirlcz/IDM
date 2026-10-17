package com.revolut.feature.shared.help_centre.impl.faq.screens.article;

import com.revolut.feature.shared.help_centre.impl.faq.screens.article.FaqArticleScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b {
    public static final String a(FaqArticleScreenContract$InputData faqArticleScreenContract$InputData) {
        Intrinsics.checkNotNullParameter(faqArticleScreenContract$InputData, "<this>");
        if (faqArticleScreenContract$InputData instanceof FaqArticleScreenContract$InputData.OpenByFaqKey) {
            return ((FaqArticleScreenContract$InputData.OpenByFaqKey) faqArticleScreenContract$InputData).f86227b;
        }
        if (faqArticleScreenContract$InputData instanceof FaqArticleScreenContract$InputData.TransactionTroubleshooter) {
            return ((FaqArticleScreenContract$InputData.TransactionTroubleshooter) faqArticleScreenContract$InputData).f86233b;
        }
        if (faqArticleScreenContract$InputData instanceof FaqArticleScreenContract$InputData.OpenByFaqNode) {
            return ((FaqArticleScreenContract$InputData.OpenByFaqNode) faqArticleScreenContract$InputData).f86230b.getF51430a();
        }
        throw new NoWhenBranchMatchedException();
    }
}
