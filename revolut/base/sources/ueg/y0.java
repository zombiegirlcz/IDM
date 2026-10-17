package ueg;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class y0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f279445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsContext f279446b;

    public /* synthetic */ y0(AnalyticsContext analyticsContext, int i) {
        this.f279445a = i;
        this.f279446b = analyticsContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f279445a) {
            case 0:
                return v.a((v) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, this.f279446b, null, 6291455);
            default:
                return xka.r.a((xka.r) obj2, null, this.f279446b, 1);
        }
    }
}
