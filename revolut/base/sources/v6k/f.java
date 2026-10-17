package v6k;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements wv9.e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wv9.c f286414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final thf.c f286415b;

    public f(wv9.c moneyRequestResourcesMapper, thf.c transactionCategoryResourcesMapper) {
        Intrinsics.checkNotNullParameter(moneyRequestResourcesMapper, "moneyRequestResourcesMapper");
        Intrinsics.checkNotNullParameter(transactionCategoryResourcesMapper, "transactionCategoryResourcesMapper");
        this.f286414a = moneyRequestResourcesMapper;
        this.f286415b = transactionCategoryResourcesMapper;
    }

    public static MoneyClause a(int i, dj0.d dVar) {
        return new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(i), false, null, false, null, 254), null, 8);
    }
}
