package com.revolut.feature.apm.bizum.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/bizum/api/navigation/BizumFlowInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "StartType", "feature_apm_bizum_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BizumFlowInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BizumFlowInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StartType f61556a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/bizum/api/navigation/BizumFlowInputData$StartType;", "Landroid/os/Parcelable;", "Area", "NewContact", "RecipientList", "Lcom/revolut/feature/apm/bizum/api/navigation/BizumFlowInputData$StartType$Area;", "Lcom/revolut/feature/apm/bizum/api/navigation/BizumFlowInputData$StartType$NewContact;", "Lcom/revolut/feature/apm/bizum/api/navigation/BizumFlowInputData$StartType$RecipientList;", "feature_apm_bizum_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface StartType extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/bizum/api/navigation/BizumFlowInputData$StartType$Area;", "Lcom/revolut/feature/apm/bizum/api/navigation/BizumFlowInputData$StartType;", "<init>", "()V", "feature_apm_bizum_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Area implements StartType {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Area f61557a = new Area();

            @NotNull
            public static final Parcelable.Creator<Area> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Area.f61557a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Area[i];
                }
            }

            private Area() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/bizum/api/navigation/BizumFlowInputData$StartType$NewContact;", "Lcom/revolut/feature/apm/bizum/api/navigation/BizumFlowInputData$StartType;", "<init>", "()V", "feature_apm_bizum_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class NewContact implements StartType {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final NewContact f61558a = new NewContact();

            @NotNull
            public static final Parcelable.Creator<NewContact> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return NewContact.f61558a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NewContact[i];
                }
            }

            private NewContact() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/bizum/api/navigation/BizumFlowInputData$StartType$RecipientList;", "Lcom/revolut/feature/apm/bizum/api/navigation/BizumFlowInputData$StartType;", "<init>", "()V", "feature_apm_bizum_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class RecipientList implements StartType {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final RecipientList f61559a = new RecipientList();

            @NotNull
            public static final Parcelable.Creator<RecipientList> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return RecipientList.f61559a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new RecipientList[i];
                }
            }

            private RecipientList() {
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
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BizumFlowInputData((StartType) parcel.readParcelable(BizumFlowInputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BizumFlowInputData[i];
        }
    }

    public BizumFlowInputData(StartType startType) {
        Intrinsics.checkNotNullParameter(startType, "startType");
        this.f61556a = startType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof BizumFlowInputData) && Intrinsics.f(this.f61556a, ((BizumFlowInputData) obj2).f61556a);
    }

    public final int hashCode() {
        return this.f61556a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f61556a, i);
    }

    public BizumFlowInputData() {
        this(StartType.Area.f61557a);
    }
}
