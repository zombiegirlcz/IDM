package androidx.media3.common;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes15.dex */
public interface VideoGraph {

    public interface Factory {
        VideoGraph create(Context context, ColorInfo colorInfo, DebugViewProvider debugViewProvider, Listener listener, Executor executor, long j2, boolean z);
    }

    public interface Listener {
    }
}
