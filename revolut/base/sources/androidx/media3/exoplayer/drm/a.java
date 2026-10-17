package androidx.media3.exoplayer.drm;

import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Consumer {
    @Override // androidx.media3.common.util.Consumer
    public final void accept(Object obj2) {
        ((DrmSessionEventListener.EventDispatcher) obj2).drmSessionAcquired(3);
    }
}
