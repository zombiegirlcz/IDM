package com.revolut.feature.wealth.impl.data.repositories;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.api.domain.model.collectionquote.CollectionQuoteParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class CollectionsRepository$Companion {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/impl/data/repositories/CollectionsRepository$Companion$CollectionQuoteRequestInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CollectionQuoteRequestInfo implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<CollectionQuoteRequestInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f95508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CollectionQuoteParams f95509b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CollectionQuoteRequestInfo(parcel.readString(), (CollectionQuoteParams) parcel.readParcelable(CollectionQuoteRequestInfo.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CollectionQuoteRequestInfo[i];
            }
        }

        public CollectionQuoteRequestInfo(String collectionId, CollectionQuoteParams collectionParams) {
            Intrinsics.checkNotNullParameter(collectionId, "collectionId");
            Intrinsics.checkNotNullParameter(collectionParams, "collectionParams");
            this.f95508a = collectionId;
            this.f95509b = collectionParams;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CollectionQuoteRequestInfo)) {
                return false;
            }
            CollectionQuoteRequestInfo collectionQuoteRequestInfo = (CollectionQuoteRequestInfo) obj2;
            return Intrinsics.f(this.f95508a, collectionQuoteRequestInfo.f95508a) && Intrinsics.f(this.f95509b, collectionQuoteRequestInfo.f95509b);
        }

        public final int hashCode() {
            return this.f95509b.hashCode() + (this.f95508a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95508a);
            dest.writeParcelable(this.f95509b, i);
        }
    }

    private CollectionsRepository$Companion() {
    }
}
