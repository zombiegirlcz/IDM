package com.google.firebase.perf.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.metrics.Counter;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.PerfSession;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49610a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f49610a) {
            case 0:
                return new Timer(parcel.readLong(), parcel.readLong());
            case 1:
                return new Counter(parcel);
            case 2:
                return new Trace(parcel, false);
            default:
                return new PerfSession(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f49610a) {
            case 0:
                return new Timer[i];
            case 1:
                return new Counter[i];
            case 2:
                return new Trace[i];
            default:
                return new PerfSession[i];
        }
    }
}
