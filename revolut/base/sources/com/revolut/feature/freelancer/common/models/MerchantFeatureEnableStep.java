package com.revolut.feature.freelancer.common.models;

import android.os.Parcel;
import android.os.Parcelable;
import jf0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lr6.c0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/MerchantFeatureEnableStep;", "Landroid/os/Parcelable;", "<init>", "()V", "DeepLink", "Action", "Lcom/revolut/feature/freelancer/common/models/MerchantFeatureEnableStep$Action;", "Lcom/revolut/feature/freelancer/common/models/MerchantFeatureEnableStep$DeepLink;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class MerchantFeatureEnableStep implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/MerchantFeatureEnableStep$Action;", "Lcom/revolut/feature/freelancer/common/models/MerchantFeatureEnableStep;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Action extends MerchantFeatureEnableStep {

        @NotNull
        public static final Parcelable.Creator<Action> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c0 f73338a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Action(c0.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Action[i];
            }
        }

        public Action(c0 value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f73338a = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Action) && this.f73338a == ((Action) obj2).f73338a;
        }

        public final int hashCode() {
            return this.f73338a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73338a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/MerchantFeatureEnableStep$DeepLink;", "Lcom/revolut/feature/freelancer/common/models/MerchantFeatureEnableStep;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeepLink extends MerchantFeatureEnableStep {

        @NotNull
        public static final Parcelable.Creator<DeepLink> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f73339a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeepLink((c) parcel.readValue(DeepLink.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeepLink[i];
            }
        }

        public DeepLink(c value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f73339a = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DeepLink) && Intrinsics.f(this.f73339a, ((DeepLink) obj2).f73339a);
        }

        public final int hashCode() {
            return this.f73339a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeValue(this.f73339a);
        }
    }

    private MerchantFeatureEnableStep() {
    }
}
