package n4;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f212279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f212280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LoadEventInfo f212281c;
    public final /* synthetic */ MediaLoadData d;

    public /* synthetic */ y(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i) {
        this.f212279a = i;
        this.f212280b = eventTime;
        this.f212281c = loadEventInfo;
        this.d = mediaLoadData;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj2) {
        switch (this.f212279a) {
            case 0:
                ((AnalyticsListener) obj2).onLoadCanceled(this.f212280b, this.f212281c, this.d);
                break;
            default:
                ((AnalyticsListener) obj2).onLoadCompleted(this.f212280b, this.f212281c, this.d);
                break;
        }
    }
}
