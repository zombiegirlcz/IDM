package com.revolut.feature_travel_hotels_models.property;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/HotelsPropertyBrief;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HotelsPropertyBrief implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HotelsPropertyBrief> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f98007c;
    public final HotelsPropertyLocation d;
    public final HotelsPropertyCheckInDetails e;
    public final HotelsPropertyCheckOutDetails f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HotelsPropertyContactDetails f98008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final fgi.a f98009h;

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
                iA = org.bouncycastle.jcajce.provider.digest.a.a(Image.CREATOR, parcel, arrayList, iA, 1);
            }
            return new HotelsPropertyBrief(string, string2, arrayList, HotelsPropertyLocation.CREATOR.createFromParcel(parcel), HotelsPropertyCheckInDetails.CREATOR.createFromParcel(parcel), HotelsPropertyCheckOutDetails.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : HotelsPropertyContactDetails.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? fgi.a.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HotelsPropertyBrief[i];
        }
    }

    public HotelsPropertyBrief(String id10, String name, ArrayList images, HotelsPropertyLocation location, HotelsPropertyCheckInDetails checkInDetails, HotelsPropertyCheckOutDetails checkOutDetails, HotelsPropertyContactDetails hotelsPropertyContactDetails, fgi.a aVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(checkInDetails, "checkInDetails");
        Intrinsics.checkNotNullParameter(checkOutDetails, "checkOutDetails");
        this.f98005a = id10;
        this.f98006b = name;
        this.f98007c = images;
        this.d = location;
        this.e = checkInDetails;
        this.f = checkOutDetails;
        this.f98008g = hotelsPropertyContactDetails;
        this.f98009h = aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HotelsPropertyBrief)) {
            return false;
        }
        HotelsPropertyBrief hotelsPropertyBrief = (HotelsPropertyBrief) obj2;
        return Intrinsics.f(this.f98005a, hotelsPropertyBrief.f98005a) && Intrinsics.f(this.f98006b, hotelsPropertyBrief.f98006b) && this.f98007c.equals(hotelsPropertyBrief.f98007c) && Intrinsics.f(this.d, hotelsPropertyBrief.d) && Intrinsics.f(this.e, hotelsPropertyBrief.e) && Intrinsics.f(this.f, hotelsPropertyBrief.f) && Intrinsics.f(this.f98008g, hotelsPropertyBrief.f98008g) && this.f98009h == hotelsPropertyBrief.f98009h;
    }

    public final int hashCode() {
        int iHashCode = (this.f.f98018a.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f98007c, p.a.c(this.f98005a.hashCode() * 31, 31, this.f98006b), 31)) * 31)) * 31)) * 31;
        HotelsPropertyContactDetails hotelsPropertyContactDetails = this.f98008g;
        int iHashCode2 = (iHashCode + (hotelsPropertyContactDetails == null ? 0 : hotelsPropertyContactDetails.hashCode())) * 31;
        fgi.a aVar = this.f98009h;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98005a);
        dest.writeString(this.f98006b);
        Iterator itY = j6.a.y(this.f98007c, dest);
        while (itY.hasNext()) {
            ((Image) itY.next()).writeToParcel(dest, i);
        }
        this.d.writeToParcel(dest, i);
        this.e.writeToParcel(dest, i);
        this.f.writeToParcel(dest, i);
        HotelsPropertyContactDetails hotelsPropertyContactDetails = this.f98008g;
        if (hotelsPropertyContactDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            hotelsPropertyContactDetails.writeToParcel(dest, i);
        }
        fgi.a aVar = this.f98009h;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
    }
}
