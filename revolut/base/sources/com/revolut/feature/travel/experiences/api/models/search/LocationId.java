package com.revolut.feature.travel.experiences.api.models.search;

import android.os.Parcel;
import android.os.Parcelable;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/search/LocationId;", "Landroid/os/Parcelable;", "AttractionId", "DestinationId", "Lcom/revolut/feature/travel/experiences/api/models/search/LocationId$AttractionId;", "Lcom/revolut/feature/travel/experiences/api/models/search/LocationId$DestinationId;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface LocationId extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/search/LocationId$AttractionId;", "Lcom/revolut/feature/travel/experiences/api/models/search/LocationId;", "value", "", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AttractionId implements LocationId {

        @NotNull
        public static final Parcelable.Creator<AttractionId> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f92880a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new AttractionId(v7.t(parcel, "parcel", "value"));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AttractionId[i];
            }
        }

        public /* synthetic */ AttractionId(String str) {
            this.f92880a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (obj2 instanceof AttractionId) {
                return Intrinsics.f(this.f92880a, ((AttractionId) obj2).f92880a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f92880a.hashCode();
        }

        public final String toString() {
            return p.a.p("AttractionId(value=", this.f92880a, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f92880a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/search/LocationId$DestinationId;", "Lcom/revolut/feature/travel/experiences/api/models/search/LocationId;", "value", "", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DestinationId implements LocationId {

        @NotNull
        public static final Parcelable.Creator<DestinationId> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f92881a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new DestinationId(v7.t(parcel, "parcel", "value"));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DestinationId[i];
            }
        }

        public /* synthetic */ DestinationId(String str) {
            this.f92881a = str;
        }

        public static void a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
        }

        public static String b(String str) {
            return p.a.p("DestinationId(value=", str, ")");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (obj2 instanceof DestinationId) {
                return Intrinsics.f(this.f92881a, ((DestinationId) obj2).f92881a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f92881a.hashCode();
        }

        public final String toString() {
            return b(this.f92881a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f92881a);
        }
    }
}
