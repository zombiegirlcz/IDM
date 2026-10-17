package com.revolut.feature.shared.help_centre.impl.utils;

import j6.a;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rd0.c;
import rd0.d;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00060\u0001j\u0002`\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/utils/FaqNotLoadedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Companion", "a", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FaqNotLoadedException extends Exception {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.shared.help_centre.impl.utils.FaqNotLoadedException$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static void a(String faqKey) throws FaqNotLoadedException {
            Intrinsics.checkNotNullParameter(faqKey, "faqKey");
            Intrinsics.checkNotNullParameter(faqKey, "faqKey");
            FaqNotLoadedException faqNotLoadedException = new FaqNotLoadedException(a.q("Faq not loaded with key: ", faqKey));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(c.ERROR, null, null, faqNotLoadedException, h0Var);
            throw faqNotLoadedException;
        }
    }
}
