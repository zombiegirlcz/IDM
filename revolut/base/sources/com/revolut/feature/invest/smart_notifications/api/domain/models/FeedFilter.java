package com.revolut.feature.invest.smart_notifications.api.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/invest/smart_notifications/api/domain/models/FeedFilter;", "Landroid/os/Parcelable;", "ByRef", "ByAssetFilter", "Lcom/revolut/feature/invest/smart_notifications/api/domain/models/FeedFilter$ByAssetFilter;", "Lcom/revolut/feature/invest/smart_notifications/api/domain/models/FeedFilter$ByRef;", "feature_invest_smart_notifications_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FeedFilter extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/invest/smart_notifications/api/domain/models/FeedFilter$ByAssetFilter;", "Lcom/revolut/feature/invest/smart_notifications/api/domain/models/FeedFilter;", "", "toString", "()Ljava/lang/String;", "feature_invest_smart_notifications_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ByAssetFilter implements FeedFilter {

        @NotNull
        public static final Parcelable.Creator<ByAssetFilter> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f76423a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet.add(tdh.a.valueOf(parcel.readString()));
                }
                return new ByAssetFilter(linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ByAssetFilter[i];
            }
        }

        public ByAssetFilter(Set selectedFilters) {
            Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
            this.f76423a = selectedFilters;
        }

        @Override // com.revolut.feature.invest.smart_notifications.api.domain.models.FeedFilter
        /* JADX INFO: renamed from: C6, reason: from getter */
        public final Set getF76423a() {
            return this.f76423a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ByAssetFilter) && Intrinsics.f(this.f76423a, ((ByAssetFilter) obj2).f76423a);
        }

        public final int hashCode() {
            return this.f76423a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f76423a, dest);
            while (itV.hasNext()) {
                dest.writeString(((tdh.a) itV.next()).name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/invest/smart_notifications/api/domain/models/FeedFilter$ByRef;", "Lcom/revolut/feature/invest/smart_notifications/api/domain/models/FeedFilter;", "", "toString", "()Ljava/lang/String;", "feature_invest_smart_notifications_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ByRef implements FeedFilter {

        @NotNull
        public static final Parcelable.Creator<ByRef> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h0 f76425b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ByRef(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ByRef[i];
            }
        }

        public ByRef(String ref2) {
            Intrinsics.checkNotNullParameter(ref2, "ref");
            this.f76424a = ref2;
            this.f76425b = h0.f322473a;
        }

        @Override // com.revolut.feature.invest.smart_notifications.api.domain.models.FeedFilter
        /* JADX INFO: renamed from: C6 */
        public final Set getF76423a() {
            return this.f76425b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ByRef) && Intrinsics.f(this.f76424a, ((ByRef) obj2).f76424a);
        }

        public final int hashCode() {
            return this.f76424a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76424a);
        }
    }

    /* JADX INFO: renamed from: C6 */
    Set getF76423a();
}
