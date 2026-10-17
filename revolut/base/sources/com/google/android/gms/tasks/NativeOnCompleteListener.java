package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes16.dex */
@KeepForSdk
public class NativeOnCompleteListener implements OnCompleteListener<Object> {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final long f48753zza;

    @KeepForSdk
    public NativeOnCompleteListener(long j2) {
        this.f48753zza = j2;
    }

    @KeepForSdk
    public static void createAndAddCallback(@NonNull Task<Object> task, long j2) {
        task.addOnCompleteListener(new NativeOnCompleteListener(j2));
    }

    @KeepForSdk
    public native void nativeOnComplete(long j2, Object obj2, boolean z, boolean z3, String str);

    @Override // com.google.android.gms.tasks.OnCompleteListener
    @KeepForSdk
    public void onComplete(@NonNull Task<Object> task) {
        Object result;
        String message;
        Exception exception;
        if (task.isSuccessful()) {
            result = task.getResult();
            message = null;
        } else if (task.isCanceled() || (exception = task.getException()) == null) {
            result = null;
            message = null;
        } else {
            message = exception.getMessage();
            result = null;
        }
        nativeOnComplete(this.f48753zza, result, task.isSuccessful(), task.isCanceled(), message);
    }
}
