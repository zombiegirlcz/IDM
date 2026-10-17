package u4;

import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSourceEventListener;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f276953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediaSourceEventListener.EventDispatcher f276954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LoadEventInfo f276955c;
    public final /* synthetic */ MediaLoadData d;

    public /* synthetic */ b(MediaSourceEventListener.EventDispatcher eventDispatcher, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i) {
        this.f276953a = i;
        this.f276954b = eventDispatcher;
        this.f276955c = loadEventInfo;
        this.d = mediaLoadData;
    }

    @Override // androidx.media3.common.util.Consumer
    public final void accept(Object obj2) {
        switch (this.f276953a) {
            case 0:
                this.f276954b.lambda$loadCompleted$1(this.f276955c, this.d, (MediaSourceEventListener) obj2);
                break;
            default:
                this.f276954b.lambda$loadCanceled$2(this.f276955c, this.d, (MediaSourceEventListener) obj2);
                break;
        }
    }
}
