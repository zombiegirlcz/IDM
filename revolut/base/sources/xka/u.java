package xka;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.lightprompt.LightPromptViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class u implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LightPromptViewModel f306648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsContext f306649b;

    public u(LightPromptViewModel model, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f306648a = model;
        this.f306649b = analyticsContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f306648a, uVar.f306648a) && Intrinsics.f(this.f306649b, uVar.f306649b);
    }

    public final int hashCode() {
        int iHashCode = this.f306648a.hashCode() * 31;
        AnalyticsContext analyticsContext = this.f306649b;
        return iHashCode + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a));
    }
}
