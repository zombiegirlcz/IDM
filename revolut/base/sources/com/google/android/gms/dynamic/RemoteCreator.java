package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
@KeepForSdk
public abstract class RemoteCreator<T> {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final String f38402zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private Object f38403zzb;

    @KeepForSdk
    public static class RemoteCreatorException extends Exception {
        @KeepForSdk
        public RemoteCreatorException(@NonNull String str) {
            super(str);
        }

        @KeepForSdk
        public RemoteCreatorException(@NonNull String str, @NonNull Throwable th10) {
            super(str, th10);
        }
    }

    @KeepForSdk
    public RemoteCreator(@NonNull String str) {
        this.f38402zza = str;
    }

    @NonNull
    @KeepForSdk
    public abstract T getRemoteCreator(@NonNull IBinder iBinder);

    @NonNull
    @KeepForSdk
    public final T getRemoteCreatorInstance(@NonNull Context context) throws RemoteCreatorException {
        if (this.f38403zzb == null) {
            Preconditions.checkNotNull(context);
            Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (remoteContext == null) {
                throw new RemoteCreatorException("Could not get remote context.");
            }
            try {
                this.f38403zzb = getRemoteCreator((IBinder) remoteContext.getClassLoader().loadClass(this.f38402zza).newInstance());
            } catch (ClassNotFoundException e) {
                throw new RemoteCreatorException("Could not load creator class.", e);
            } catch (IllegalAccessException e2) {
                throw new RemoteCreatorException("Could not access creator.", e2);
            } catch (InstantiationException e4) {
                throw new RemoteCreatorException("Could not instantiate creator.", e4);
            }
        }
        return (T) this.f38403zzb;
    }
}
