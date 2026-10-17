package n4;

import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class h implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f212229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f212230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PlaybackException f212231c;

    public /* synthetic */ h(AnalyticsListener.EventTime eventTime, PlaybackException playbackException, int i) {
        this.f212229a = i;
        this.f212230b = eventTime;
        this.f212231c = playbackException;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj2) {
        switch (this.f212229a) {
            case 0:
                ((AnalyticsListener) obj2).onPlayerErrorChanged(this.f212230b, this.f212231c);
                break;
            default:
                ((AnalyticsListener) obj2).onPlayerError(this.f212230b, this.f212231c);
                break;
        }
    }
}
