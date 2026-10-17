package h8f;

import com.revolut.feature.trading.managed_portfolios.impl.domain.template.model.TemplateIntroScreenContent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TemplateIntroScreenContent.PieChart f150033a;

    public e(TemplateIntroScreenContent.PieChart pieChart) {
        Intrinsics.checkNotNullParameter(pieChart, "pieChart");
        this.f150033a = pieChart;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f150033a, ((e) obj2).f150033a);
    }

    public final int hashCode() {
        return this.f150033a.f91258a.hashCode();
    }
}
