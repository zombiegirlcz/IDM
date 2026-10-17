package com.revolut.feature.be_driven_design.models.domain;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/be_driven_design/models/domain/FincrimeHomeScreen$V2", "Lfr2/c;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FincrimeHomeScreen$V2 implements fr2.c, Parcelable {

    @NotNull
    public static final Parcelable.Creator<FincrimeHomeScreen$V2> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f64128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aal.a f64129c;
    public final FincrimeHomeScreenDescriptionAction d;
    public final List e;
    public final FincrimeHomeScreenActionButton f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FincrimeHomeScreenActionButton f64130g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f64131h;
    public final String i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            aal.a aVarValueOf = parcel.readInt() == 0 ? null : aal.a.valueOf(parcel.readString());
            FincrimeHomeScreenDescriptionAction fincrimeHomeScreenDescriptionActionCreateFromParcel = parcel.readInt() == 0 ? null : FincrimeHomeScreenDescriptionAction.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            int iA2 = 0;
            while (iA2 != i) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(FincrimeHomeScreenSection.CREATOR, parcel, arrayList, iA2, 1);
            }
            FincrimeHomeScreenActionButton fincrimeHomeScreenActionButtonCreateFromParcel = parcel.readInt() == 0 ? null : FincrimeHomeScreenActionButton.CREATOR.createFromParcel(parcel);
            FincrimeHomeScreenActionButton fincrimeHomeScreenActionButtonCreateFromParcel2 = parcel.readInt() != 0 ? FincrimeHomeScreenActionButton.CREATOR.createFromParcel(parcel) : null;
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(FincrimeHomeScreenHeaderAction.CREATOR, parcel, arrayList2, iA, 1);
            }
            return new FincrimeHomeScreen$V2(string, string2, aVarValueOf, fincrimeHomeScreenDescriptionActionCreateFromParcel, arrayList, fincrimeHomeScreenActionButtonCreateFromParcel, fincrimeHomeScreenActionButtonCreateFromParcel2, arrayList2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FincrimeHomeScreen$V2[i];
        }
    }

    public FincrimeHomeScreen$V2(String title, String str, aal.a aVar, FincrimeHomeScreenDescriptionAction fincrimeHomeScreenDescriptionAction, List sections, FincrimeHomeScreenActionButton fincrimeHomeScreenActionButton, FincrimeHomeScreenActionButton fincrimeHomeScreenActionButton2, List menuItems, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f64127a = title;
        this.f64128b = str;
        this.f64129c = aVar;
        this.d = fincrimeHomeScreenDescriptionAction;
        this.e = sections;
        this.f = fincrimeHomeScreenActionButton;
        this.f64130g = fincrimeHomeScreenActionButton2;
        this.f64131h = menuItems;
        this.i = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FincrimeHomeScreen$V2)) {
            return false;
        }
        FincrimeHomeScreen$V2 fincrimeHomeScreen$V2 = (FincrimeHomeScreen$V2) obj2;
        return Intrinsics.f(this.f64127a, fincrimeHomeScreen$V2.f64127a) && Intrinsics.f(this.f64128b, fincrimeHomeScreen$V2.f64128b) && this.f64129c == fincrimeHomeScreen$V2.f64129c && Intrinsics.f(this.d, fincrimeHomeScreen$V2.d) && Intrinsics.f(this.e, fincrimeHomeScreen$V2.e) && Intrinsics.f(this.f, fincrimeHomeScreen$V2.f) && Intrinsics.f(this.f64130g, fincrimeHomeScreen$V2.f64130g) && Intrinsics.f(this.f64131h, fincrimeHomeScreen$V2.f64131h) && Intrinsics.f(this.i, fincrimeHomeScreen$V2.i);
    }

    public final int hashCode() {
        int iHashCode = this.f64127a.hashCode() * 31;
        String str = this.f64128b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        aal.a aVar = this.f64129c;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        FincrimeHomeScreenDescriptionAction fincrimeHomeScreenDescriptionAction = this.d;
        int iD = p.a.d((iHashCode3 + (fincrimeHomeScreenDescriptionAction == null ? 0 : fincrimeHomeScreenDescriptionAction.hashCode())) * 31, 31, this.e);
        FincrimeHomeScreenActionButton fincrimeHomeScreenActionButton = this.f;
        int iHashCode4 = (iD + (fincrimeHomeScreenActionButton == null ? 0 : fincrimeHomeScreenActionButton.hashCode())) * 31;
        FincrimeHomeScreenActionButton fincrimeHomeScreenActionButton2 = this.f64130g;
        int iD2 = p.a.d((iHashCode4 + (fincrimeHomeScreenActionButton2 == null ? 0 : fincrimeHomeScreenActionButton2.hashCode())) * 31, 31, this.f64131h);
        String str2 = this.i;
        return iD2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f64127a);
        dest.writeString(this.f64128b);
        aal.a aVar = this.f64129c;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        FincrimeHomeScreenDescriptionAction fincrimeHomeScreenDescriptionAction = this.d;
        if (fincrimeHomeScreenDescriptionAction == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            fincrimeHomeScreenDescriptionAction.writeToParcel(dest, i);
        }
        Iterator itV = p.a.v(this.e, dest);
        while (itV.hasNext()) {
            ((FincrimeHomeScreenSection) itV.next()).writeToParcel(dest, i);
        }
        FincrimeHomeScreenActionButton fincrimeHomeScreenActionButton = this.f;
        if (fincrimeHomeScreenActionButton == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            fincrimeHomeScreenActionButton.writeToParcel(dest, i);
        }
        FincrimeHomeScreenActionButton fincrimeHomeScreenActionButton2 = this.f64130g;
        if (fincrimeHomeScreenActionButton2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            fincrimeHomeScreenActionButton2.writeToParcel(dest, i);
        }
        Iterator itV2 = p.a.v(this.f64131h, dest);
        while (itV2.hasNext()) {
            ((FincrimeHomeScreenHeaderAction) itV2.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.i);
    }
}
