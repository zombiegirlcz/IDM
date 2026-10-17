package com.revolut.shared.feature.user_declarations.api.flows.place_of_birth;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.shared.feature.user_declarations.api.R$string;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/user_declarations/api/flows/place_of_birth/PlaceOfBirthFlowInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "mbl/a", "feature_shared_user_declarations_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlaceOfBirthFlowInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PlaceOfBirthFlowInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f105023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f105024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f105025c;
    public final String d;
    public final Image e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mbl.a f105026g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PlaceOfBirthFlowInputData((Clause) parcel.readParcelable(PlaceOfBirthFlowInputData.class.getClassLoader()), (Clause) parcel.readParcelable(PlaceOfBirthFlowInputData.class.getClassLoader()), (b) parcel.readSerializable(), parcel.readString(), (Image) parcel.readParcelable(PlaceOfBirthFlowInputData.class.getClassLoader()), (Clause) parcel.readParcelable(PlaceOfBirthFlowInputData.class.getClassLoader()), mbl.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlaceOfBirthFlowInputData[i];
        }
    }

    public PlaceOfBirthFlowInputData() {
        this(null, null, null, null, null, CertificateBody.profileType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlaceOfBirthFlowInputData)) {
            return false;
        }
        PlaceOfBirthFlowInputData placeOfBirthFlowInputData = (PlaceOfBirthFlowInputData) obj2;
        return Intrinsics.f(this.f105023a, placeOfBirthFlowInputData.f105023a) && Intrinsics.f(this.f105024b, placeOfBirthFlowInputData.f105024b) && Intrinsics.f(this.f105025c, placeOfBirthFlowInputData.f105025c) && Intrinsics.f(this.d, placeOfBirthFlowInputData.d) && Intrinsics.f(this.e, placeOfBirthFlowInputData.e) && Intrinsics.f(this.f, placeOfBirthFlowInputData.f) && this.f105026g == placeOfBirthFlowInputData.f105026g;
    }

    public final int hashCode() {
        int iHashCode = this.f105023a.hashCode() * 31;
        Clause clause = this.f105024b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        b bVar = this.f105025c;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Image image = this.e;
        return this.f105026g.hashCode() + p.a.a((iHashCode4 + (image != null ? image.hashCode() : 0)) * 31, 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f105023a, i);
        dest.writeParcelable(this.f105024b, i);
        dest.writeSerializable(this.f105025c);
        dest.writeString(this.d);
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
        dest.writeString(this.f105026g.name());
    }

    public PlaceOfBirthFlowInputData(Clause title, Clause clause, b bVar, String str, Image image, Clause buttonClause, mbl.a cityInputMode) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonClause, "buttonClause");
        Intrinsics.checkNotNullParameter(cityInputMode, "cityInputMode");
        this.f105023a = title;
        this.f105024b = clause;
        this.f105025c = bVar;
        this.d = str;
        this.e = image;
        this.f = buttonClause;
        this.f105026g = cityInputMode;
    }

    public /* synthetic */ PlaceOfBirthFlowInputData(TextClause textClause, CompositeClause compositeClause, b bVar, ResourceImage resourceImage, TextLocalisedClause textLocalisedClause, int i) {
        this((i & 1) != 0 ? new TextLocalisedClause(R$string.user_migration_place_of_birth_title, null, null, 14) : textClause, (i & 2) != 0 ? null : compositeClause, (i & 4) != 0 ? null : bVar, null, (i & 16) != 0 ? new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : resourceImage, (i & 32) != 0 ? new TextLocalisedClause(R$string.common_action_confirm, null, null, 14) : textLocalisedClause, mbl.a.SearchEnabledInSupportedCountries);
    }
}
