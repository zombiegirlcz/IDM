package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public abstract class zai {

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    public final int f37935zac;

    public zai(int i) {
        this.f37935zac = i;
    }

    public static /* bridge */ /* synthetic */ Status zah(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void zad(@NonNull Status status);

    public abstract void zae(@NonNull Exception exc2);

    public abstract void zaf(zabq zabqVar) throws DeadObjectException;

    public abstract void zag(@NonNull zaad zaadVar, boolean z);
}
