package n4;

import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import java.io.IOException;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class x implements ListenerSet.Event, Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LoadEventInfo f212276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediaLoadData f212277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IOException f212278c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ x(Object obj2, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        this.e = obj2;
        this.f212276a = loadEventInfo;
        this.f212277b = mediaLoadData;
        this.f212278c = iOException;
        this.d = z;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj2) {
        ((MediaSourceEventListener.EventDispatcher) this.e).lambda$loadError$3(this.f212276a, this.f212277b, this.f212278c, this.d, (MediaSourceEventListener) obj2);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj2) {
        ((AnalyticsListener) obj2).onLoadError((AnalyticsListener.EventTime) this.e, this.f212276a, this.f212277b, this.f212278c, this.d);
    }
}
