package com.google.android.gms.common.util.concurrent;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes16.dex */
@KeepForSdk
public class NumberedThreadFactory implements ThreadFactory {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final String f38325zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final AtomicInteger f38326zzb = new AtomicInteger();

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final ThreadFactory f38327zzc = Executors.defaultThreadFactory();

    @KeepForSdk
    public NumberedThreadFactory(@NonNull String str) {
        Preconditions.checkNotNull(str, "Name must not be null");
        this.f38325zza = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    @NonNull
    public final Thread newThread(@NonNull Runnable runnable) {
        Thread threadNewThread = this.f38327zzc.newThread(new zza(runnable, 0));
        int andIncrement = this.f38326zzb.getAndIncrement();
        int length = String.valueOf(andIncrement).length();
        String str = this.f38325zza;
        StringBuilder sb6 = new StringBuilder(str.length() + 1 + length + 1);
        sb6.append(str);
        sb6.append("[");
        sb6.append(andIncrement);
        sb6.append("]");
        threadNewThread.setName(sb6.toString());
        return threadNewThread;
    }
}
