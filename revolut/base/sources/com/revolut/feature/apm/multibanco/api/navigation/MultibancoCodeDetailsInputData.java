package com.revolut.feature.apm.multibanco.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.multibanco.MultibancoWithdrawalCode;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/multibanco/api/navigation/MultibancoCodeDetailsInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "ByCode", "ById", "Lcom/revolut/feature/apm/multibanco/api/navigation/MultibancoCodeDetailsInputData$ByCode;", "Lcom/revolut/feature/apm/multibanco/api/navigation/MultibancoCodeDetailsInputData$ById;", "feature_apm_multibanco_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MultibancoCodeDetailsInputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/multibanco/api/navigation/MultibancoCodeDetailsInputData$ByCode;", "Lcom/revolut/feature/apm/multibanco/api/navigation/MultibancoCodeDetailsInputData;", "", "toString", "()Ljava/lang/String;", "feature_apm_multibanco_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ByCode implements MultibancoCodeDetailsInputData {

        @NotNull
        public static final Parcelable.Creator<ByCode> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MultibancoWithdrawalCode f62539a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ByCode((MultibancoWithdrawalCode) parcel.readParcelable(ByCode.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ByCode[i];
            }
        }

        public ByCode(MultibancoWithdrawalCode code) {
            Intrinsics.checkNotNullParameter(code, "code");
            this.f62539a = code;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ByCode) && Intrinsics.f(this.f62539a, ((ByCode) obj2).f62539a);
        }

        public final int hashCode() {
            return this.f62539a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62539a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/multibanco/api/navigation/MultibancoCodeDetailsInputData$ById;", "Lcom/revolut/feature/apm/multibanco/api/navigation/MultibancoCodeDetailsInputData;", "", "toString", "()Ljava/lang/String;", "feature_apm_multibanco_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ById implements MultibancoCodeDetailsInputData {

        @NotNull
        public static final Parcelable.Creator<ById> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f62540a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ById(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ById[i];
            }
        }

        public ById(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f62540a = id10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ById) && Intrinsics.f(this.f62540a, ((ById) obj2).f62540a);
        }

        public final int hashCode() {
            return this.f62540a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f62540a);
        }
    }
}
