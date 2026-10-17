package com.revolut.feature.junior_core.models.configuration;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_core/models/configuration/JuniorPlanConfiguration;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_junior_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorPlanConfiguration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<JuniorPlanConfiguration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f76899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f76900c;
    public final int d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f76901g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f76902h;
    public final d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f76903j;
    public final ArrayList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f76904l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f76905m;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            int i5 = parcel.readInt();
            int i6 = parcel.readInt();
            int i21 = parcel.readInt();
            int i22 = parcel.readInt();
            d dVar = (d) parcel.readSerializable();
            d dVar2 = (d) parcel.readSerializable();
            int i32 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i32);
            int iC = 0;
            while (iC != i32) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            return new JuniorPlanConfiguration(string, i, i2, i3, i5, i6, i21, i22, dVar, dVar2, arrayList, parcel.readInt() != 0, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorPlanConfiguration[i];
        }
    }

    public JuniorPlanConfiguration(String planId, int i, int i2, int i3, int i5, int i6, int i21, int i22, d minimumTopUpAmount, d dVar, ArrayList features, boolean z, int i32) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(minimumTopUpAmount, "minimumTopUpAmount");
        Intrinsics.checkNotNullParameter(features, "features");
        this.f76898a = planId;
        this.f76899b = i;
        this.f76900c = i2;
        this.d = i3;
        this.e = i5;
        this.f = i6;
        this.f76901g = i21;
        this.f76902h = i22;
        this.i = minimumTopUpAmount;
        this.f76903j = dVar;
        this.k = features;
        this.f76904l = z;
        this.f76905m = i32;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JuniorPlanConfiguration)) {
            return false;
        }
        JuniorPlanConfiguration juniorPlanConfiguration = (JuniorPlanConfiguration) obj2;
        return Intrinsics.f(this.f76898a, juniorPlanConfiguration.f76898a) && this.f76899b == juniorPlanConfiguration.f76899b && this.f76900c == juniorPlanConfiguration.f76900c && this.d == juniorPlanConfiguration.d && this.e == juniorPlanConfiguration.e && this.f == juniorPlanConfiguration.f && this.f76901g == juniorPlanConfiguration.f76901g && this.f76902h == juniorPlanConfiguration.f76902h && Intrinsics.f(this.i, juniorPlanConfiguration.i) && Intrinsics.f(this.f76903j, juniorPlanConfiguration.f76903j) && this.k.equals(juniorPlanConfiguration.k) && this.f76904l == juniorPlanConfiguration.f76904l && this.f76905m == juniorPlanConfiguration.f76905m;
    }

    public final int hashCode() {
        int iC = v7.c(j6.a.b(this.f76902h, j6.a.b(this.f76901g, j6.a.b(this.f, j6.a.b(this.e, j6.a.b(this.d, j6.a.b(this.f76900c, j6.a.b(this.f76899b, this.f76898a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.i);
        d dVar = this.f76903j;
        return Integer.hashCode(this.f76905m) + j6.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.k, (iC + (dVar == null ? 0 : dVar.hashCode())) * 31, 31), 31, this.f76904l);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f76898a);
        dest.writeInt(this.f76899b);
        dest.writeInt(this.f76900c);
        dest.writeInt(this.d);
        dest.writeInt(this.e);
        dest.writeInt(this.f);
        dest.writeInt(this.f76901g);
        dest.writeInt(this.f76902h);
        dest.writeSerializable(this.i);
        dest.writeSerializable(this.f76903j);
        Iterator itY = j6.a.y(this.k, dest);
        while (itY.hasNext()) {
            dest.writeSerializable((Serializable) itY.next());
        }
        dest.writeInt(this.f76904l ? 1 : 0);
        dest.writeInt(this.f76905m);
    }
}
