package com.revolut.feature_retail_user_declarations.purpose.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/purpose/model/PurposeOfAccountProductType;", "Landroid/os/Parcelable;", "<init>", "()V", "Personal", "Joint", "MultiIbanEur", "Lcom/revolut/feature_retail_user_declarations/purpose/model/PurposeOfAccountProductType$Joint;", "Lcom/revolut/feature_retail_user_declarations/purpose/model/PurposeOfAccountProductType$MultiIbanEur;", "Lcom/revolut/feature_retail_user_declarations/purpose/model/PurposeOfAccountProductType$Personal;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PurposeOfAccountProductType implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/purpose/model/PurposeOfAccountProductType$Joint;", "Lcom/revolut/feature_retail_user_declarations/purpose/model/PurposeOfAccountProductType;", "<init>", "()V", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Joint extends PurposeOfAccountProductType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Joint f97716a = new Joint();

        @NotNull
        public static final Parcelable.Creator<Joint> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Joint.f97716a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Joint[i];
            }
        }

        private Joint() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/purpose/model/PurposeOfAccountProductType$MultiIbanEur;", "Lcom/revolut/feature_retail_user_declarations/purpose/model/PurposeOfAccountProductType;", "<init>", "()V", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MultiIbanEur extends PurposeOfAccountProductType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MultiIbanEur f97717a = new MultiIbanEur();

        @NotNull
        public static final Parcelable.Creator<MultiIbanEur> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MultiIbanEur.f97717a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MultiIbanEur[i];
            }
        }

        private MultiIbanEur() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/purpose/model/PurposeOfAccountProductType$Personal;", "Lcom/revolut/feature_retail_user_declarations/purpose/model/PurposeOfAccountProductType;", "<init>", "()V", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Personal extends PurposeOfAccountProductType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Personal f97718a = new Personal();

        @NotNull
        public static final Parcelable.Creator<Personal> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Personal.f97718a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Personal[i];
            }
        }

        private Personal() {
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

    private PurposeOfAccountProductType() {
    }
}
