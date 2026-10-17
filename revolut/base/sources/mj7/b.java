package mj7;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f205936a;

    public b(j memoryCache) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f205936a = memoryCache;
    }

    public final List a() {
        List list = (List) this.f205936a.get("CACHE_KEY_CLAIM_DOCUMENTS");
        return list == null ? f0.f322471a : list;
    }

    public final List b() {
        List list = (List) this.f205936a.get("CACHE_KEY_EXPENSES");
        return list == null ? f0.f322471a : list;
    }

    public final void c(List expenses) {
        Intrinsics.checkNotNullParameter(expenses, "expenses");
        this.f205936a.f("CACHE_KEY_EXPENSES", expenses);
    }
}
