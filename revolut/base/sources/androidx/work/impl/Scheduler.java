package androidx.work.impl;

import androidx.annotation.NonNull;
import androidx.work.impl.model.WorkSpec;

/* JADX INFO: loaded from: classes.dex */
public interface Scheduler {
    void cancel(@NonNull String str);

    boolean hasLimitedSchedulingSlots();

    void schedule(@NonNull WorkSpec... workSpecArr);
}
