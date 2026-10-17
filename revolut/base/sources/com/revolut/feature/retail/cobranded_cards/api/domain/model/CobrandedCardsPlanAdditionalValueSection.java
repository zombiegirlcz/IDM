package com.revolut.feature.retail.cobranded_cards.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsPlanAdditionalValueSection;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CobrandedCardsPlanAdditionalValueSection implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CobrandedCardsPlanAdditionalValueSection> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f82329c;
    public final CobrandedCardsPlanAdditionalValueBottomSheet d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(CobrandedCardsPlanAdditionalValueRow.CREATOR, parcel, arrayList, iA, 1);
            }
            return new CobrandedCardsPlanAdditionalValueSection(string, string2, arrayList, parcel.readInt() == 0 ? null : CobrandedCardsPlanAdditionalValueBottomSheet.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CobrandedCardsPlanAdditionalValueSection[i];
        }
    }

    public CobrandedCardsPlanAdditionalValueSection(String icon, String title, ArrayList items, CobrandedCardsPlanAdditionalValueBottomSheet cobrandedCardsPlanAdditionalValueBottomSheet) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f82327a = icon;
        this.f82328b = title;
        this.f82329c = items;
        this.d = cobrandedCardsPlanAdditionalValueBottomSheet;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CobrandedCardsPlanAdditionalValueSection)) {
            return false;
        }
        CobrandedCardsPlanAdditionalValueSection cobrandedCardsPlanAdditionalValueSection = (CobrandedCardsPlanAdditionalValueSection) obj2;
        return Intrinsics.f(this.f82327a, cobrandedCardsPlanAdditionalValueSection.f82327a) && Intrinsics.f(this.f82328b, cobrandedCardsPlanAdditionalValueSection.f82328b) && this.f82329c.equals(cobrandedCardsPlanAdditionalValueSection.f82329c) && Intrinsics.f(this.d, cobrandedCardsPlanAdditionalValueSection.d);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f82329c, p.a.c(this.f82327a.hashCode() * 31, 31, this.f82328b), 31);
        CobrandedCardsPlanAdditionalValueBottomSheet cobrandedCardsPlanAdditionalValueBottomSheet = this.d;
        return iB + (cobrandedCardsPlanAdditionalValueBottomSheet == null ? 0 : cobrandedCardsPlanAdditionalValueBottomSheet.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82327a);
        dest.writeString(this.f82328b);
        Iterator itY = j6.a.y(this.f82329c, dest);
        while (itY.hasNext()) {
            ((CobrandedCardsPlanAdditionalValueRow) itY.next()).writeToParcel(dest, i);
        }
        CobrandedCardsPlanAdditionalValueBottomSheet cobrandedCardsPlanAdditionalValueBottomSheet = this.d;
        if (cobrandedCardsPlanAdditionalValueBottomSheet == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cobrandedCardsPlanAdditionalValueBottomSheet.writeToParcel(dest, i);
        }
    }
}
