package n4;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f212217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f212218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f212219c;

    public /* synthetic */ d(AnalyticsListener.EventTime eventTime, int i, boolean z) {
        this.f212217a = i;
        this.f212218b = eventTime;
        this.f212219c = z;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj2) {
        switch (this.f212217a) {
            case 0:
                ((AnalyticsListener) obj2).onIsPlayingChanged(this.f212218b, this.f212219c);
                break;
            default:
                DefaultAnalyticsCollector.lambda$onIsLoadingChanged$35(this.f212218b, this.f212219c, (AnalyticsListener) obj2);
                break;
        }
    }
}
