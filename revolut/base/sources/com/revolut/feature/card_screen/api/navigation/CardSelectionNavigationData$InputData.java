package com.revolut.feature.card_screen.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import b93.d;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/card_screen/api/navigation/CardSelectionNavigationData$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_card_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardSelectionNavigationData$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CardSelectionNavigationData$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f65350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f65351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f65352c;
    public final String d;
    public final d e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f65353g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardSelectionNavigationData$InputData((Clause) parcel.readParcelable(CardSelectionNavigationData$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(CardSelectionNavigationData$InputData.class.getClassLoader()), parcel.readString(), parcel.readString(), d.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardSelectionNavigationData$InputData[i];
        }
    }

    public CardSelectionNavigationData$InputData(Clause clause, Clause clause2, String str, String str2, d cardScope, boolean z, List list) {
        Intrinsics.checkNotNullParameter(cardScope, "cardScope");
        this.f65350a = clause;
        this.f65351b = clause2;
        this.f65352c = str;
        this.d = str2;
        this.e = cardScope;
        this.f = z;
        this.f65353g = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardSelectionNavigationData$InputData)) {
            return false;
        }
        CardSelectionNavigationData$InputData cardSelectionNavigationData$InputData = (CardSelectionNavigationData$InputData) obj2;
        return Intrinsics.f(this.f65350a, cardSelectionNavigationData$InputData.f65350a) && Intrinsics.f(this.f65351b, cardSelectionNavigationData$InputData.f65351b) && Intrinsics.f(this.f65352c, cardSelectionNavigationData$InputData.f65352c) && Intrinsics.f(this.d, cardSelectionNavigationData$InputData.d) && this.e == cardSelectionNavigationData$InputData.e && this.f == cardSelectionNavigationData$InputData.f && Intrinsics.f(this.f65353g, cardSelectionNavigationData$InputData.f65353g);
    }

    public final int hashCode() {
        Clause clause = this.f65350a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f65351b;
        int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        String str = this.f65352c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iC = j6.a.c((this.e.hashCode() + ((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.f);
        List list = this.f65353g;
        return iC + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f65350a, i);
        dest.writeParcelable(this.f65351b, i);
        dest.writeString(this.f65352c);
        dest.writeString(this.d);
        dest.writeString(this.e.name());
        dest.writeInt(this.f ? 1 : 0);
        dest.writeStringList(this.f65353g);
    }

    public /* synthetic */ CardSelectionNavigationData$InputData(String str, d dVar, List list, int i) {
        this(null, null, str, (i & 8) != 0 ? null : "retail_disposable", dVar, (i & 32) == 0, (i & 64) != 0 ? null : list);
    }
}
