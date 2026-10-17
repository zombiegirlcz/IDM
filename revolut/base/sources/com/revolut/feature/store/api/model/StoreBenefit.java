package com.revolut.feature.store.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreBenefit;", "Landroid/os/Parcelable;", "Cashback", "RevPoints", "Lcom/revolut/feature/store/api/model/StoreBenefit$Cashback;", "Lcom/revolut/feature/store/api/model/StoreBenefit$RevPoints;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class StoreBenefit implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88428a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreBenefit$Cashback;", "Lcom/revolut/feature/store/api/model/StoreBenefit;", "<init>", "()V", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Cashback extends StoreBenefit {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Cashback f88429b = new Cashback();

        @NotNull
        public static final Parcelable.Creator<Cashback> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Cashback.f88429b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Cashback[i];
            }
        }

        private Cashback() {
            super("CASHBACK");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreBenefit$RevPoints;", "Lcom/revolut/feature/store/api/model/StoreBenefit;", "<init>", "()V", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevPoints extends StoreBenefit {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final RevPoints f88430b = new RevPoints();

        @NotNull
        public static final Parcelable.Creator<RevPoints> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevPoints.f88430b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPoints[i];
            }
        }

        private RevPoints() {
            super("POINTS");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    public StoreBenefit(String str) {
        this.f88428a = str;
    }
}
