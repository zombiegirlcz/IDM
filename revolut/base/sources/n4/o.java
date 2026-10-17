package n4;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f212250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f212251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DecoderCounters f212252c;

    public /* synthetic */ o(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters, int i) {
        this.f212250a = i;
        this.f212251b = eventTime;
        this.f212252c = decoderCounters;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj2) {
        switch (this.f212250a) {
            case 0:
                ((AnalyticsListener) obj2).onVideoDisabled(this.f212251b, this.f212252c);
                break;
            default:
                ((AnalyticsListener) obj2).onVideoEnabled(this.f212251b, this.f212252c);
                break;
        }
    }
}
