package com.revolut.feature.user_declarations.shared.flows.place_of_birth.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/user_declarations/shared/flows/place_of_birth/screen/PlaceOfBirthScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_user_declarations_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlaceOfBirthScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PlaceOfBirthScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f94671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f94672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f94673c;
    public final String d;
    public final Image e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mbl.a f94674g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PlaceOfBirthScreenContract$InputData((Clause) parcel.readParcelable(PlaceOfBirthScreenContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(PlaceOfBirthScreenContract$InputData.class.getClassLoader()), (b) parcel.readSerializable(), parcel.readString(), (Image) parcel.readParcelable(PlaceOfBirthScreenContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(PlaceOfBirthScreenContract$InputData.class.getClassLoader()), mbl.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlaceOfBirthScreenContract$InputData[i];
        }
    }

    public PlaceOfBirthScreenContract$InputData(Clause title, Clause clause, b bVar, String str, Image image, Clause buttonClause, mbl.a cityInputMode) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonClause, "buttonClause");
        Intrinsics.checkNotNullParameter(cityInputMode, "cityInputMode");
        this.f94671a = title;
        this.f94672b = clause;
        this.f94673c = bVar;
        this.d = str;
        this.e = image;
        this.f = buttonClause;
        this.f94674g = cityInputMode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlaceOfBirthScreenContract$InputData)) {
            return false;
        }
        PlaceOfBirthScreenContract$InputData placeOfBirthScreenContract$InputData = (PlaceOfBirthScreenContract$InputData) obj2;
        return Intrinsics.f(this.f94671a, placeOfBirthScreenContract$InputData.f94671a) && Intrinsics.f(this.f94672b, placeOfBirthScreenContract$InputData.f94672b) && Intrinsics.f(this.f94673c, placeOfBirthScreenContract$InputData.f94673c) && Intrinsics.f(this.d, placeOfBirthScreenContract$InputData.d) && Intrinsics.f(this.e, placeOfBirthScreenContract$InputData.e) && Intrinsics.f(this.f, placeOfBirthScreenContract$InputData.f) && this.f94674g == placeOfBirthScreenContract$InputData.f94674g;
    }

    public final int hashCode() {
        int iHashCode = this.f94671a.hashCode() * 31;
        Clause clause = this.f94672b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        b bVar = this.f94673c;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Image image = this.e;
        return this.f94674g.hashCode() + p.a.a((iHashCode4 + (image != null ? image.hashCode() : 0)) * 31, 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f94671a, i);
        dest.writeParcelable(this.f94672b, i);
        dest.writeSerializable(this.f94673c);
        dest.writeString(this.d);
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
        dest.writeString(this.f94674g.name());
    }
}
