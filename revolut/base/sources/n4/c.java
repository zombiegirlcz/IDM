package n4;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f212212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f212213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f212214c;
    public final /* synthetic */ int d;

    public /* synthetic */ c(AnalyticsListener.EventTime eventTime, int i, int i2, boolean z) {
        this.f212212a = i2;
        this.f212213b = eventTime;
        this.f212214c = z;
        this.d = i;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj2) {
        switch (this.f212212a) {
            case 0:
                ((AnalyticsListener) obj2).onPlayerStateChanged(this.f212213b, this.f212214c, this.d);
                break;
            default:
                ((AnalyticsListener) obj2).onPlayWhenReadyChanged(this.f212213b, this.f212214c, this.d);
                break;
        }
    }
}
