package no;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f217771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f217772b;

    public /* synthetic */ g0(String str, int i) {
        this.f217771a = i;
        this.f217772b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f217771a) {
            case 0:
                return new AnalyticsContext(m72.b.h("videoBufferingStart", com.bumptech.glide.c.g(new nj8.b(this.f217772b, 10)), AnalyticsContext.INSTANCE));
            case 1:
                return new AnalyticsContext(m72.b.h("firebase_analytics", com.bumptech.glide.c.g(new nj8.b(this.f217772b, 7)), AnalyticsContext.INSTANCE));
            case 2:
                return new AnalyticsContext(m72.b.h("activityCreation", com.bumptech.glide.c.g(new nj8.b(this.f217772b, 11)), AnalyticsContext.INSTANCE));
            default:
                return new AnalyticsContext(m72.b.h("flowCreation", com.bumptech.glide.c.g(new nj8.b(this.f217772b, 8)), AnalyticsContext.INSTANCE));
        }
    }
}
