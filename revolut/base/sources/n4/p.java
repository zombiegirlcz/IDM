package n4;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class p implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f212253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f212254b;

    public /* synthetic */ p(AnalyticsListener.EventTime eventTime, int i) {
        this.f212253a = i;
        this.f212254b = eventTime;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj2) {
        switch (this.f212253a) {
            case 0:
                ((AnalyticsListener) obj2).onPlayerReleased(this.f212254b);
                break;
            case 1:
                ((AnalyticsListener) obj2).onDrmSessionReleased(this.f212254b);
                break;
            case 2:
                ((AnalyticsListener) obj2).onDrmKeysRemoved(this.f212254b);
                break;
            default:
                ((AnalyticsListener) obj2).onDrmKeysRestored(this.f212254b);
                break;
        }
    }
}
