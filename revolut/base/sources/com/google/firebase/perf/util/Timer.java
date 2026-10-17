package com.google.firebase.perf.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class Timer implements Parcelable {
    public static final Parcelable.Creator<Timer> CREATOR = new q(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f49592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f49593b;

    public Timer() {
        this(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()), TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos()));
    }

    public final long a() {
        return new Timer().f49593b - this.f49593b;
    }

    public final long b(Timer timer) {
        return timer.f49593b - this.f49593b;
    }

    public final void c() {
        this.f49592a = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.f49593b = TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f49592a);
        parcel.writeLong(this.f49593b);
    }

    public Timer(long j2, long j3) {
        this.f49592a = j2;
        this.f49593b = j3;
    }
}
