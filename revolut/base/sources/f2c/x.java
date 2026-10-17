package f2c;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.data.model.Data;
import com.revolut.tracking.v3.SpareChangeContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class x implements cli.n {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jub.a f131516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f131517b;

    public x(gte.a featureToggleInteractor, jub.a revPointsDisclaimerProvider) {
        Intrinsics.checkNotNullParameter(revPointsDisclaimerProvider, "revPointsDisclaimerProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f131516a = revPointsDisclaimerProvider;
        this.f131517b = featureToggleInteractor;
    }

    public static w0 a(int i) {
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        SpareChangeContext.a aVarNewBuilder = SpareChangeContext.newBuilder();
        aVarNewBuilder.h(String.valueOf(i));
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        return AnalyticsContext.Companion.a(w0VarA);
    }

    public final CompositeClause b(Data data) {
        if (data.getContent() == null && data.getLoading() && data.getError() == null) {
            return null;
        }
        return ((ryb.b) this.f131516a).c((l71.d) data.getContent());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r22) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f2c.x.c(cli.j):cli.o");
    }
}
