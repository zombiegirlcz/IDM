package n4;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f212235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f212236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f212237c;

    public /* synthetic */ j(AnalyticsListener.EventTime eventTime, int i, int i2) {
        this.f212235a = i2;
        this.f212236b = eventTime;
        this.f212237c = i;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj2) {
        switch (this.f212235a) {
            case 0:
                ((AnalyticsListener) obj2).onPlaybackStateChanged(this.f212236b, this.f212237c);
                break;
            case 1:
                ((AnalyticsListener) obj2).onRepeatModeChanged(this.f212236b, this.f212237c);
                break;
            default:
                ((AnalyticsListener) obj2).onTimelineChanged(this.f212236b, this.f212237c);
                break;
        }
    }
}
