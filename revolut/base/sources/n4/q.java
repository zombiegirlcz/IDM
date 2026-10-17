package n4;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class q implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f212255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f212256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DecoderCounters f212257c;

    public /* synthetic */ q(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters, int i) {
        this.f212255a = i;
        this.f212256b = eventTime;
        this.f212257c = decoderCounters;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj2) {
        switch (this.f212255a) {
            case 0:
                ((AnalyticsListener) obj2).onAudioEnabled(this.f212256b, this.f212257c);
                break;
            default:
                ((AnalyticsListener) obj2).onAudioDisabled(this.f212256b, this.f212257c);
                break;
        }
    }
}
