package com.revolut.core.ui_kit.models;

import com.revolut.core.ui_kit.models.TimeClause;
import java.time.Duration;
import java.time.LocalTime;
import java.time.ZoneOffset;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ k f58088a = new k();

    private k() {
    }

    public static TimeClause a(k kVar, LocalTime time) {
        kVar.getClass();
        Intrinsics.checkNotNullParameter(time, "time");
        return new TimeClause(Duration.ofNanos(time.toNanoOfDay()).toMillis(), TimeClause.Format.TimeDefault.f57977b, null, ZoneOffset.UTC);
    }
}
