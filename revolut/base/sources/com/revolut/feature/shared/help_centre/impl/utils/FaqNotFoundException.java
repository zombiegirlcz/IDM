package com.revolut.feature.shared.help_centre.impl.utils;

import a10.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00060\u0001j\u0002`\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/utils/FaqNotFoundException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Companion", "a", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FaqNotFoundException extends Exception {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.shared.help_centre.impl.utils.FaqNotFoundException$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public FaqNotFoundException(String str) {
        super(b.t(str, "faqKey", "faq not found with key ", str));
    }
}
