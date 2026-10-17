package n4;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f212202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f212203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Exception f212204c;

    public /* synthetic */ a(AnalyticsListener.EventTime eventTime, Exception exc2, int i) {
        this.f212202a = i;
        this.f212203b = eventTime;
        this.f212204c = exc2;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj2) {
        switch (this.f212202a) {
            case 0:
                ((AnalyticsListener) obj2).onVideoCodecError(this.f212203b, this.f212204c);
                break;
            case 1:
                ((AnalyticsListener) obj2).onAudioCodecError(this.f212203b, this.f212204c);
                break;
            case 2:
                ((AnalyticsListener) obj2).onDrmSessionManagerError(this.f212203b, this.f212204c);
                break;
            default:
                ((AnalyticsListener) obj2).onAudioSinkError(this.f212203b, this.f212204c);
                break;
        }
    }
}
