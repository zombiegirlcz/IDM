package com.rd.draw.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import cm.c;

/* JADX INFO: loaded from: classes17.dex */
public class PositionSavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<PositionSavedState> CREATOR = new c(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f50259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f50261c;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f50259a);
        parcel.writeInt(this.f50260b);
        parcel.writeInt(this.f50261c);
    }
}
