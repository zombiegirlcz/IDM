package com.revolut.feature.categorisation.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.subaccount.api.models.Subaccount;
import io3.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/categorisation/api/model/AnalyticsAccountPocketSource;", "Landroid/os/Parcelable;", "PocketSource", "SubaccountSource", "Lcom/revolut/feature/categorisation/api/model/AnalyticsAccountPocketSource$PocketSource;", "Lcom/revolut/feature/categorisation/api/model/AnalyticsAccountPocketSource$SubaccountSource;", "feature_categorization_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AnalyticsAccountPocketSource extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/categorisation/api/model/AnalyticsAccountPocketSource$PocketSource;", "Lcom/revolut/feature/categorisation/api/model/AnalyticsAccountPocketSource;", "", "toString", "()Ljava/lang/String;", "feature_categorization_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PocketSource implements AnalyticsAccountPocketSource {

        @NotNull
        public static final Parcelable.Creator<PocketSource> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f65740a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PocketSource((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PocketSource[i];
            }
        }

        public PocketSource(d pocket) {
            Intrinsics.checkNotNullParameter(pocket, "pocket");
            this.f65740a = pocket;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PocketSource) && Intrinsics.f(this.f65740a, ((PocketSource) obj2).f65740a);
        }

        public final int hashCode() {
            return this.f65740a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f65740a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/categorisation/api/model/AnalyticsAccountPocketSource$SubaccountSource;", "Lcom/revolut/feature/categorisation/api/model/AnalyticsAccountPocketSource;", "", "toString", "()Ljava/lang/String;", "feature_categorization_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SubaccountSource implements AnalyticsAccountPocketSource {

        @NotNull
        public static final Parcelable.Creator<SubaccountSource> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Subaccount f65741a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SubaccountSource((Subaccount) parcel.readParcelable(SubaccountSource.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SubaccountSource[i];
            }
        }

        public SubaccountSource(Subaccount subaccount) {
            Intrinsics.checkNotNullParameter(subaccount, "subaccount");
            this.f65741a = subaccount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SubaccountSource) && Intrinsics.f(this.f65741a, ((SubaccountSource) obj2).f65741a);
        }

        public final int hashCode() {
            return this.f65741a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f65741a, i);
        }
    }
}
