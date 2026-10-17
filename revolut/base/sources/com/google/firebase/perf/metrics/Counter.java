package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.util.q;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public class Counter implements Parcelable {
    public static final Parcelable.Creator<Counter> CREATOR = new q(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f49580b;

    public Counter(String str) {
        this.f49579a = str;
        this.f49580b = new AtomicLong(0L);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f49579a);
        parcel.writeLong(this.f49580b.get());
    }

    public Counter(Parcel parcel) {
        this.f49579a = parcel.readString();
        this.f49580b = new AtomicLong(parcel.readLong());
    }
}
