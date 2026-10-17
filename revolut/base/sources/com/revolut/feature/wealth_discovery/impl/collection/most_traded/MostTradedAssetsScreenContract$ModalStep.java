package com.revolut.feature.wealth_discovery.impl.collection.most_traded;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xzg.b0;
import xzg.d0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/wealth_discovery/impl/collection/most_traded/MostTradedAssetsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "SelectSection", "SelectTimeSpan", "Lcom/revolut/feature/wealth_discovery/impl/collection/most_traded/MostTradedAssetsScreenContract$ModalStep$SelectSection;", "Lcom/revolut/feature/wealth_discovery/impl/collection/most_traded/MostTradedAssetsScreenContract$ModalStep$SelectTimeSpan;", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MostTradedAssetsScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/collection/most_traded/MostTradedAssetsScreenContract$ModalStep$SelectSection;", "Lcom/revolut/feature/wealth_discovery/impl/collection/most_traded/MostTradedAssetsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectSection implements MostTradedAssetsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<SelectSection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d0 f96126a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectSection(d0.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectSection[i];
            }
        }

        public SelectSection(d0 selected) {
            Intrinsics.checkNotNullParameter(selected, "selected");
            this.f96126a = selected;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SelectSection) && this.f96126a == ((SelectSection) obj2).f96126a;
        }

        public final int hashCode() {
            return this.f96126a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f96126a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/collection/most_traded/MostTradedAssetsScreenContract$ModalStep$SelectTimeSpan;", "Lcom/revolut/feature/wealth_discovery/impl/collection/most_traded/MostTradedAssetsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectTimeSpan implements MostTradedAssetsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<SelectTimeSpan> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b0 f96127a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectTimeSpan(b0.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectTimeSpan[i];
            }
        }

        public SelectTimeSpan(b0 selected) {
            Intrinsics.checkNotNullParameter(selected, "selected");
            this.f96127a = selected;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SelectTimeSpan) && this.f96127a == ((SelectTimeSpan) obj2).f96127a;
        }

        public final int hashCode() {
            return this.f96127a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f96127a.name());
        }
    }
}
