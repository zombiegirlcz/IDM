package n4;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class f implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f212223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f212224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f212225c;

    public /* synthetic */ f(AnalyticsListener.EventTime eventTime, int i, int i2) {
        this.f212223a = i2;
        this.f212224b = eventTime;
        this.f212225c = i;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj2) {
        switch (this.f212223a) {
            case 0:
                ((AnalyticsListener) obj2).onPlaybackSuppressionReasonChanged(this.f212224b, this.f212225c);
                break;
            case 1:
                ((AnalyticsListener) obj2).onDroppedSeeksWhileScrubbing(this.f212224b, this.f212225c);
                break;
            case 2:
                DefaultAnalyticsCollector.lambda$onDrmSessionAcquired$64(this.f212224b, this.f212225c, (AnalyticsListener) obj2);
                break;
            default:
                ((AnalyticsListener) obj2).onAudioSessionIdChanged(this.f212224b, this.f212225c);
                break;
        }
    }
}
