package sph;

import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class l {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f264956c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f264957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f264958b;

    static {
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            arrayList.add(h.SLIDER);
        }
        f264956c = new g(arrayList);
    }

    public l(e rangeMapper, a optionsMapper, d optionsRowsMapper, nd.n loadingItemsMapper) {
        Intrinsics.checkNotNullParameter(rangeMapper, "rangeMapper");
        Intrinsics.checkNotNullParameter(optionsMapper, "optionsMapper");
        Intrinsics.checkNotNullParameter(optionsRowsMapper, "optionsRowsMapper");
        Intrinsics.checkNotNullParameter(loadingItemsMapper, "loadingItemsMapper");
        this.f264957a = rangeMapper;
        this.f264958b = optionsMapper;
    }

    public final List a(Data availableFilters, List selectedFilters, g loadingConfig) {
        Intrinsics.checkNotNullParameter(availableFilters, "availableFilters");
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        Intrinsics.checkNotNullParameter(loadingConfig, "loadingConfig");
        return (List) iii.c.f(availableFilters, new sl5.a(this, loadingConfig, 12), new sl5.g(21), new si5.c(this, selectedFilters, 2));
    }
}
