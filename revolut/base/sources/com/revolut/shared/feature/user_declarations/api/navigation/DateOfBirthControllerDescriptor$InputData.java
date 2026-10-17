package com.revolut.shared.feature.user_declarations.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.shared.feature.user_declarations.api.models.DateOfBirthScreenConfig;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/shared/feature/user_declarations/api/navigation/DateOfBirthControllerDescriptor$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_shared_user_declarations_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DateOfBirthControllerDescriptor$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<DateOfBirthControllerDescriptor$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f105049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateOfBirthScreenConfig f105050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rbl.a f105051c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DateOfBirthControllerDescriptor$InputData((LocalDate) parcel.readSerializable(), DateOfBirthScreenConfig.CREATOR.createFromParcel(parcel), rbl.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DateOfBirthControllerDescriptor$InputData[i];
        }
    }

    public DateOfBirthControllerDescriptor$InputData(LocalDate localDate, DateOfBirthScreenConfig screenConfig, rbl.a backNavigationType) {
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        Intrinsics.checkNotNullParameter(backNavigationType, "backNavigationType");
        this.f105049a = localDate;
        this.f105050b = screenConfig;
        this.f105051c = backNavigationType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DateOfBirthControllerDescriptor$InputData)) {
            return false;
        }
        DateOfBirthControllerDescriptor$InputData dateOfBirthControllerDescriptor$InputData = (DateOfBirthControllerDescriptor$InputData) obj2;
        return Intrinsics.f(this.f105049a, dateOfBirthControllerDescriptor$InputData.f105049a) && Intrinsics.f(this.f105050b, dateOfBirthControllerDescriptor$InputData.f105050b) && this.f105051c == dateOfBirthControllerDescriptor$InputData.f105051c;
    }

    public final int hashCode() {
        LocalDate localDate = this.f105049a;
        return this.f105051c.hashCode() + ((this.f105050b.hashCode() + ((localDate == null ? 0 : localDate.hashCode()) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f105049a);
        this.f105050b.writeToParcel(dest, i);
        dest.writeString(this.f105051c.name());
    }
}
