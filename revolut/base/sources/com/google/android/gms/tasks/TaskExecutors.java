package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class TaskExecutors {

    @NonNull
    public static final Executor MAIN_THREAD = new zzu();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final Executor f48755zza = new zzt();

    private TaskExecutors() {
    }
}
