package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.IProjectionDelegate;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.VisibleRegion;

/* JADX INFO: loaded from: classes16.dex */
public final class Projection {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final IProjectionDelegate f46603zza;

    public Projection(IProjectionDelegate iProjectionDelegate) {
        this.f46603zza = iProjectionDelegate;
    }

    @NonNull
    public LatLng fromScreenLocation(@NonNull Point point) {
        Preconditions.checkNotNull(point);
        try {
            return this.f46603zza.fromScreenLocation(ObjectWrapper.wrap(point));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @NonNull
    public VisibleRegion getVisibleRegion() {
        try {
            return this.f46603zza.getVisibleRegion();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @NonNull
    public Point toScreenLocation(@NonNull LatLng latLng) {
        Preconditions.checkNotNull(latLng);
        try {
            return (Point) ObjectWrapper.unwrap(this.f46603zza.toScreenLocation(latLng));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
