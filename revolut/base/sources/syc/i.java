package syc;

import cli.y;
import com.revolut.feature.selfserve.sot.api.models.IncomeSource;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends oki.h implements dli.b {
    public final List o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f266655p;

    public i(IncomeSource incomeSource, List list, at.r mapper) {
        Intrinsics.checkNotNullParameter(incomeSource, "incomeSource");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.o = list;
        this.f266655p = mra.d.b(this, new d(incomeSource, list), mapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f266655p;
    }
}
