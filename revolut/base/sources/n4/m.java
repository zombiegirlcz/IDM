package n4;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class m implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f212244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f212245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f212246c;

    public /* synthetic */ m(AnalyticsListener.EventTime eventTime, int i, boolean z) {
        this.f212244a = i;
        this.f212245b = eventTime;
        this.f212246c = z;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj2) {
        switch (this.f212244a) {
            case 0:
                ((AnalyticsListener) obj2).onShuffleModeChanged(this.f212245b, this.f212246c);
                break;
            default:
                ((AnalyticsListener) obj2).onSkipSilenceEnabledChanged(this.f212245b, this.f212246c);
                break;
        }
    }
}
