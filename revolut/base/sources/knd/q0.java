package knd;

import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import kotlin.jvm.internal.Intrinsics;
import tof.fc;
import tof.i7;

/* JADX INFO: loaded from: classes7.dex */
public abstract class q0 {
    public static final CategorisationFilter a(CategorisationFilter categorisationFilter, i7 transactionsFilter) {
        Intrinsics.checkNotNullParameter(categorisationFilter, "<this>");
        Intrinsics.checkNotNullParameter(transactionsFilter, "transactionsFilter");
        i7 i7Var = categorisationFilter.f;
        return i7Var != null ? CategorisationFilter.a(categorisationFilter, null, null, null, fc.a(i7Var, transactionsFilter), null, 991) : categorisationFilter;
    }
}
