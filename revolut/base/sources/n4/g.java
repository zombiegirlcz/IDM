package n4;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class g implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f212226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f212227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f212228c;

    public /* synthetic */ g(AnalyticsListener.EventTime eventTime, String str, int i) {
        this.f212226a = i;
        this.f212227b = eventTime;
        this.f212228c = str;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj2) {
        switch (this.f212226a) {
            case 0:
                ((AnalyticsListener) obj2).onVideoDecoderReleased(this.f212227b, this.f212228c);
                break;
            default:
                ((AnalyticsListener) obj2).onAudioDecoderReleased(this.f212227b, this.f212228c);
                break;
        }
    }
}
