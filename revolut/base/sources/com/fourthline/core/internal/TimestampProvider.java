package com.fourthline.core.internal;

import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/fourthline/core/internal/TimestampProvider;", "", "currentTime", "Ljava/util/Date;", "getCurrentTime", "()Ljava/util/Date;", "currentTimestamp", "", "getCurrentTimestamp", "()J", "currentCalendar", "Ljava/util/Calendar;", "getCurrentCalendar", "()Ljava/util/Calendar;", "fourthline-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TimestampProvider {
    @NotNull
    Calendar getCurrentCalendar();

    @NotNull
    Date getCurrentTime();

    long getCurrentTimestamp();
}
