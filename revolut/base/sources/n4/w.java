package n4;

import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSourceEventListener;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class w implements ListenerSet.Event, Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LoadEventInfo f212273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediaLoadData f212274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f212275c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w(Object obj2, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i) {
        this.d = obj2;
        this.f212273a = loadEventInfo;
        this.f212274b = mediaLoadData;
        this.f212275c = i;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj2) {
        ((MediaSourceEventListener.EventDispatcher) this.d).lambda$loadStarted$0(this.f212273a, this.f212274b, this.f212275c, (MediaSourceEventListener) obj2);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj2) {
        DefaultAnalyticsCollector.lambda$onLoadStarted$26((AnalyticsListener.EventTime) this.d, this.f212273a, this.f212274b, this.f212275c, (AnalyticsListener) obj2);
    }
}
