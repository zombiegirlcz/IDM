package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.MediaSourceList;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7618c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y(Object obj2, int i, Object obj3, Object obj4) {
        this.f7616a = i;
        this.f7617b = obj2;
        this.f7618c = obj3;
        this.d = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7616a) {
            case 0:
                ((MediaPeriodQueue) this.f7617b).lambda$notifyQueueUpdate$0((ImmutableList.Builder) this.f7618c, (MediaSource.MediaPeriodId) this.d);
                break;
            default:
                ((MediaSourceList.ForwardingEventListener) this.f7617b).lambda$onDownstreamFormatChanged$5((Pair) this.f7618c, (MediaLoadData) this.d);
                break;
        }
    }
}
