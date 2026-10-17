package n4;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.audio.AudioSink;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class u implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f212267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f212268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AudioSink.AudioTrackConfig f212269c;

    public /* synthetic */ u(AnalyticsListener.EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig, int i) {
        this.f212267a = i;
        this.f212268b = eventTime;
        this.f212269c = audioTrackConfig;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj2) {
        switch (this.f212267a) {
            case 0:
                ((AnalyticsListener) obj2).onAudioTrackInitialized(this.f212268b, this.f212269c);
                break;
            default:
                ((AnalyticsListener) obj2).onAudioTrackReleased(this.f212268b, this.f212269c);
                break;
        }
    }
}
