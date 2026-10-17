package com.revolut.feature.robo.impl.data.storage.migration;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends we0.g {

    @NotNull
    private static final a Companion = new a();
    public static final Set d;

    public static final class a {
        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/robo/impl/data/storage/migration/d$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "portfolioId", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("portfolioId")
        private final String portfolioId;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPortfolioId() {
            return this.portfolioId;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.portfolioId, ((b) obj2).portfolioId);
        }

        public final int hashCode() {
            String str = this.portfolioId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }
    }

    static {
        String[] elements = {"BENCHMARKS_", "RISK_METRICS_", "STATS_", "STATS_LIST_", "TEMPLATE_PROJECTION_", "TEMPLATE_PERFORMANCE_CHART_", "DrawdownChartParams_"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        d = kotlin.collections.d.y0(elements);
    }

    public d() {
        super(15, 16, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e A[EDGE_INSN: B:65:0x008e->B:32:0x008e BREAK  A[LOOP:1: B:17:0x0063->B:66:?]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // we0.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.content.SharedPreferences r11, je0.d r12) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.robo.impl.data.storage.migration.d.c(android.content.SharedPreferences, je0.d):void");
    }
}
