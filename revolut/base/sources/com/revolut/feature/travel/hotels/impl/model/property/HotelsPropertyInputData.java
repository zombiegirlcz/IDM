package com.revolut.feature.travel.hotels.impl.model.property;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/model/property/HotelsPropertyInputData;", "Landroid/os/Parcelable;", "BookablePreview", "BookableProperty", "BookedProperty", "Lcom/revolut/feature/travel/hotels/impl/model/property/HotelsPropertyInputData$BookablePreview;", "Lcom/revolut/feature/travel/hotels/impl/model/property/HotelsPropertyInputData$BookableProperty;", "Lcom/revolut/feature/travel/hotels/impl/model/property/HotelsPropertyInputData$BookedProperty;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class HotelsPropertyInputData implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93670a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/model/property/HotelsPropertyInputData$BookedProperty;", "Lcom/revolut/feature/travel/hotels/impl/model/property/HotelsPropertyInputData;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BookedProperty extends HotelsPropertyInputData {

        @NotNull
        public static final Parcelable.Creator<BookedProperty> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HotelsProperty f93675b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BookedProperty((HotelsProperty) parcel.readParcelable(BookedProperty.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BookedProperty[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BookedProperty(HotelsProperty hotelsProperty) {
            super(hotelsProperty.f97981a);
            Intrinsics.checkNotNullParameter(hotelsProperty, "hotelsProperty");
            this.f93675b = hotelsProperty;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BookedProperty) && Intrinsics.f(this.f93675b, ((BookedProperty) obj2).f93675b);
        }

        public final int hashCode() {
            return this.f93675b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f93675b, i);
        }
    }

    public HotelsPropertyInputData(String str) {
        this.f93670a = str;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/model/property/HotelsPropertyInputData$BookablePreview;", "Lcom/revolut/feature/travel/hotels/impl/model/property/HotelsPropertyInputData;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BookablePreview extends HotelsPropertyInputData {

        @NotNull
        public static final Parcelable.Creator<BookablePreview> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HotelsPropertyPreview f93671b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LocalDate f93672c;
        public final LocalDate d;
        public final List e;
        public final String f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                HotelsPropertyPreview hotelsPropertyPreviewCreateFromParcel = HotelsPropertyPreview.CREATOR.createFromParcel(parcel);
                LocalDate localDate = (LocalDate) parcel.readSerializable();
                LocalDate localDate2 = (LocalDate) parcel.readSerializable();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i);
                    int iE = 0;
                    while (iE != i) {
                        iE = j6.a.e(BookablePreview.class, parcel, arrayList2, iE, 1);
                    }
                    arrayList = arrayList2;
                }
                return new BookablePreview(hotelsPropertyPreviewCreateFromParcel, localDate, localDate2, arrayList, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BookablePreview[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BookablePreview(HotelsPropertyPreview hotelsPropertyPreview, LocalDate localDate, LocalDate localDate2, List list, String str) {
            super(hotelsPropertyPreview.f93676a);
            Intrinsics.checkNotNullParameter(hotelsPropertyPreview, "hotelsPropertyPreview");
            this.f93671b = hotelsPropertyPreview;
            this.f93672c = localDate;
            this.d = localDate2;
            this.e = list;
            this.f = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BookablePreview)) {
                return false;
            }
            BookablePreview bookablePreview = (BookablePreview) obj2;
            return Intrinsics.f(this.f93671b, bookablePreview.f93671b) && Intrinsics.f(this.f93672c, bookablePreview.f93672c) && Intrinsics.f(this.d, bookablePreview.d) && Intrinsics.f(this.e, bookablePreview.e) && Intrinsics.f(this.f, bookablePreview.f);
        }

        public final int hashCode() {
            int iHashCode = this.f93671b.hashCode() * 31;
            LocalDate localDate = this.f93672c;
            int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
            LocalDate localDate2 = this.d;
            int iHashCode3 = (iHashCode2 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
            List list = this.e;
            int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.f;
            return iHashCode4 + (str != null ? str.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f93671b.writeToParcel(dest, i);
            dest.writeSerializable(this.f93672c);
            dest.writeSerializable(this.d);
            List list = this.e;
            if (list == null) {
                dest.writeInt(0);
            } else {
                Iterator itQ = v0.a.q(dest, 1, list);
                while (itQ.hasNext()) {
                    dest.writeParcelable((Parcelable) itQ.next(), i);
                }
            }
            dest.writeString(this.f);
        }

        public /* synthetic */ BookablePreview(HotelsPropertyPreview hotelsPropertyPreview, LocalDate localDate, LocalDate localDate2, List list, int i) {
            this(hotelsPropertyPreview, (i & 2) != 0 ? null : localDate, (i & 4) != 0 ? null : localDate2, (i & 8) != 0 ? null : list, (String) null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/model/property/HotelsPropertyInputData$BookableProperty;", "Lcom/revolut/feature/travel/hotels/impl/model/property/HotelsPropertyInputData;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BookableProperty extends HotelsPropertyInputData {

        @NotNull
        public static final Parcelable.Creator<BookableProperty> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HotelsProperty f93673b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LocalDate f93674c;
        public final LocalDate d;
        public final List e;
        public final String f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                HotelsProperty hotelsProperty = (HotelsProperty) j6.a.f(parcel, "parcel", BookableProperty.class);
                LocalDate localDate = (LocalDate) parcel.readSerializable();
                LocalDate localDate2 = (LocalDate) parcel.readSerializable();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i);
                    int iE = 0;
                    while (iE != i) {
                        iE = j6.a.e(BookableProperty.class, parcel, arrayList2, iE, 1);
                    }
                    arrayList = arrayList2;
                }
                return new BookableProperty(hotelsProperty, localDate, localDate2, arrayList, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BookableProperty[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BookableProperty(HotelsProperty hotelsProperty, LocalDate localDate, LocalDate localDate2, List list, String str) {
            super(hotelsProperty.f97981a);
            Intrinsics.checkNotNullParameter(hotelsProperty, "hotelsProperty");
            this.f93673b = hotelsProperty;
            this.f93674c = localDate;
            this.d = localDate2;
            this.e = list;
            this.f = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BookableProperty)) {
                return false;
            }
            BookableProperty bookableProperty = (BookableProperty) obj2;
            return Intrinsics.f(this.f93673b, bookableProperty.f93673b) && Intrinsics.f(this.f93674c, bookableProperty.f93674c) && Intrinsics.f(this.d, bookableProperty.d) && Intrinsics.f(this.e, bookableProperty.e) && Intrinsics.f(this.f, bookableProperty.f);
        }

        public final int hashCode() {
            int iHashCode = this.f93673b.hashCode() * 31;
            LocalDate localDate = this.f93674c;
            int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
            LocalDate localDate2 = this.d;
            int iHashCode3 = (iHashCode2 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
            List list = this.e;
            int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.f;
            return iHashCode4 + (str != null ? str.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f93673b, i);
            dest.writeSerializable(this.f93674c);
            dest.writeSerializable(this.d);
            List list = this.e;
            if (list == null) {
                dest.writeInt(0);
            } else {
                Iterator itQ = v0.a.q(dest, 1, list);
                while (itQ.hasNext()) {
                    dest.writeParcelable((Parcelable) itQ.next(), i);
                }
            }
            dest.writeString(this.f);
        }

        public /* synthetic */ BookableProperty(HotelsProperty hotelsProperty, LocalDate localDate, LocalDate localDate2, List list, String str, int i) {
            this(hotelsProperty, (i & 2) != 0 ? null : localDate, (i & 4) != 0 ? null : localDate2, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : str);
        }
    }
}
