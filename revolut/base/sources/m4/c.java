package m4;

import androidx.media3.exoplayer.DefaultLoadControl;
import androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager;
import com.google.common.base.Supplier;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202613a;

    public /* synthetic */ c(int i) {
        this.f202613a = i;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f202613a) {
            case 0:
                return new DefaultLoadControl();
            default:
                return DefaultPlaybackSessionManager.generateDefaultSessionId();
        }
    }
}
