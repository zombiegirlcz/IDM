package androidx.work.impl.foreground;

import androidx.annotation.NonNull;
import androidx.work.ForegroundInfo;

/* JADX INFO: loaded from: classes.dex */
public interface ForegroundProcessor {
    void startForeground(@NonNull String str, @NonNull ForegroundInfo foregroundInfo);
}
