package com.revolut.feature_travel_hotels_models.property;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature_travel_hotels_models.campaign.TravelHotelsCampaign;
import com.revolut.feature_travel_hotels_models.promotions.TravelHotelsPromotion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ufi.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/HotelsProperty;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HotelsProperty implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HotelsProperty> CREATOR = new a();
    public final h A;
    public final TravelHotelsPromotion B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f97982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f97983c;
    public final HotelsPropertyType d;
    public final List e;
    public final Integer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HotelsPropertyRatings f97984g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HotelsPropertyAvailability f97985h;
    public final Pricing i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HotelsPropertyPaymentOptions f97986j;
    public final HotelsPropertyCancellationOptions k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HotelsPropertyLocation f97987l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f97988m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final HotelsPositionToSearchLocationCentre f97989n;
    public final HotelsPropertyCheckInDetails o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final HotelsPropertyCheckOutDetails f97990p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final HotelsPropertyContactDetails f97991q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final HotelsPropertyAttributes f97992r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final HotelsPropertyAdditionalInformation f97993s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f97994t;
    public final fgi.a u;
    public final HotelsPropertyHostDetails v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List f97995w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f97996x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final List f97997y;
    public final Distance z;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            HotelsPropertyType hotelsPropertyType;
            HotelsPositionToSearchLocationCentre hotelsPositionToSearchLocationCentre;
            HotelsPropertyAttributes hotelsPropertyAttributesCreateFromParcel;
            HotelsPropertyAttributes hotelsPropertyAttributes;
            HotelsPropertyAdditionalInformation hotelsPropertyAdditionalInformationCreateFromParcel;
            HotelsPropertyAdditionalInformation hotelsPropertyAdditionalInformation;
            HotelsPropertyCheckInDetails hotelsPropertyCheckInDetails;
            ArrayList arrayList3;
            HotelsPropertyCheckOutDetails hotelsPropertyCheckOutDetails;
            ArrayList arrayList4;
            ArrayList arrayList5;
            HotelsPositionToSearchLocationCentre hotelsPositionToSearchLocationCentre2;
            HotelsPropertyAdditionalInformation hotelsPropertyAdditionalInformation2;
            fgi.a aVar;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(PropertyDescription.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            HotelsPropertyType hotelsPropertyTypeCreateFromParcel = parcel.readInt() == 0 ? null : HotelsPropertyType.CREATOR.createFromParcel(parcel);
            int i2 = parcel.readInt();
            ArrayList arrayList6 = arrayList;
            ArrayList arrayList7 = new ArrayList(i2);
            int iA2 = 0;
            while (iA2 != i2) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(Image.CREATOR, parcel, arrayList7, iA2, 1);
            }
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            HotelsPropertyRatings hotelsPropertyRatingsCreateFromParcel = parcel.readInt() == 0 ? null : HotelsPropertyRatings.CREATOR.createFromParcel(parcel);
            HotelsPropertyAvailability hotelsPropertyAvailabilityCreateFromParcel = parcel.readInt() == 0 ? null : HotelsPropertyAvailability.CREATOR.createFromParcel(parcel);
            Pricing pricingCreateFromParcel = parcel.readInt() == 0 ? null : Pricing.CREATOR.createFromParcel(parcel);
            HotelsPropertyPaymentOptions hotelsPropertyPaymentOptionsCreateFromParcel = parcel.readInt() == 0 ? null : HotelsPropertyPaymentOptions.CREATOR.createFromParcel(parcel);
            HotelsPropertyCancellationOptions hotelsPropertyCancellationOptionsCreateFromParcel = parcel.readInt() == 0 ? null : HotelsPropertyCancellationOptions.CREATOR.createFromParcel(parcel);
            HotelsPropertyLocation hotelsPropertyLocationCreateFromParcel = HotelsPropertyLocation.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                int iA3 = 0;
                while (true) {
                    hotelsPropertyType = hotelsPropertyTypeCreateFromParcel;
                    if (iA3 == i3) {
                        break;
                    }
                    iA3 = org.bouncycastle.jcajce.provider.digest.a.a(HotelsPropertyRelativeLocation.CREATOR, parcel, arrayList2, iA3, 1);
                    hotelsPropertyTypeCreateFromParcel = hotelsPropertyType;
                    string = string;
                }
            } else {
                arrayList2 = null;
                hotelsPropertyType = hotelsPropertyTypeCreateFromParcel;
            }
            String str = string;
            HotelsPositionToSearchLocationCentre hotelsPositionToSearchLocationCentreCreateFromParcel = parcel.readInt() == 0 ? null : HotelsPositionToSearchLocationCentre.CREATOR.createFromParcel(parcel);
            HotelsPropertyCheckInDetails hotelsPropertyCheckInDetailsCreateFromParcel = parcel.readInt() == 0 ? null : HotelsPropertyCheckInDetails.CREATOR.createFromParcel(parcel);
            HotelsPropertyCheckOutDetails hotelsPropertyCheckOutDetailsCreateFromParcel = parcel.readInt() == 0 ? null : HotelsPropertyCheckOutDetails.CREATOR.createFromParcel(parcel);
            HotelsPropertyContactDetails hotelsPropertyContactDetailsCreateFromParcel = parcel.readInt() == 0 ? null : HotelsPropertyContactDetails.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                hotelsPositionToSearchLocationCentre = hotelsPositionToSearchLocationCentreCreateFromParcel;
                hotelsPropertyAttributesCreateFromParcel = null;
            } else {
                hotelsPositionToSearchLocationCentre = hotelsPositionToSearchLocationCentreCreateFromParcel;
                hotelsPropertyAttributesCreateFromParcel = HotelsPropertyAttributes.CREATOR.createFromParcel(parcel);
            }
            HotelsPropertyAttributes hotelsPropertyAttributes2 = hotelsPropertyAttributesCreateFromParcel;
            if (parcel.readInt() == 0) {
                hotelsPropertyAttributes = hotelsPropertyAttributes2;
                hotelsPropertyAdditionalInformationCreateFromParcel = null;
            } else {
                hotelsPropertyAttributes = hotelsPropertyAttributes2;
                hotelsPropertyAdditionalInformationCreateFromParcel = HotelsPropertyAdditionalInformation.CREATOR.createFromParcel(parcel);
            }
            HotelsPropertyAdditionalInformation hotelsPropertyAdditionalInformation3 = hotelsPropertyAdditionalInformationCreateFromParcel;
            if (parcel.readInt() == 0) {
                hotelsPropertyAdditionalInformation = hotelsPropertyAdditionalInformation3;
                hotelsPropertyCheckInDetails = hotelsPropertyCheckInDetailsCreateFromParcel;
                hotelsPropertyCheckOutDetails = hotelsPropertyCheckOutDetailsCreateFromParcel;
                arrayList3 = null;
            } else {
                hotelsPropertyAdditionalInformation = hotelsPropertyAdditionalInformation3;
                int i5 = parcel.readInt();
                hotelsPropertyCheckInDetails = hotelsPropertyCheckInDetailsCreateFromParcel;
                arrayList3 = new ArrayList(i5);
                hotelsPropertyCheckOutDetails = hotelsPropertyCheckOutDetailsCreateFromParcel;
                int iA4 = 0;
                while (iA4 != i5) {
                    iA4 = org.bouncycastle.jcajce.provider.digest.a.a(TravelHotelsCampaign.CREATOR, parcel, arrayList3, iA4, 1);
                    i5 = i5;
                    string2 = string2;
                }
            }
            String str2 = string2;
            fgi.a aVarValueOf = parcel.readInt() == 0 ? null : fgi.a.valueOf(parcel.readString());
            HotelsPropertyHostDetails hotelsPropertyHostDetailsCreateFromParcel = parcel.readInt() == 0 ? null : HotelsPropertyHostDetails.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList5 = arrayList3;
                hotelsPositionToSearchLocationCentre2 = hotelsPositionToSearchLocationCentre;
                hotelsPropertyAdditionalInformation2 = hotelsPropertyAdditionalInformation;
                aVar = aVarValueOf;
                arrayList4 = null;
            } else {
                int i6 = parcel.readInt();
                fgi.a aVar2 = aVarValueOf;
                arrayList4 = new ArrayList(i6);
                arrayList5 = arrayList3;
                int iA5 = 0;
                while (iA5 != i6) {
                    iA5 = org.bouncycastle.jcajce.provider.digest.a.a(HotelsPropertySpace.CREATOR, parcel, arrayList4, iA5, 1);
                    hotelsPropertyHostDetailsCreateFromParcel = hotelsPropertyHostDetailsCreateFromParcel;
                    i6 = i6;
                }
                hotelsPositionToSearchLocationCentre2 = hotelsPositionToSearchLocationCentre;
                hotelsPropertyAdditionalInformation2 = hotelsPropertyAdditionalInformation;
                aVar = aVar2;
            }
            return new HotelsProperty(str, str2, arrayList6, hotelsPropertyType, arrayList7, numValueOf, hotelsPropertyRatingsCreateFromParcel, hotelsPropertyAvailabilityCreateFromParcel, pricingCreateFromParcel, hotelsPropertyPaymentOptionsCreateFromParcel, hotelsPropertyCancellationOptionsCreateFromParcel, hotelsPropertyLocationCreateFromParcel, arrayList2, hotelsPositionToSearchLocationCentre2, hotelsPropertyCheckInDetails, hotelsPropertyCheckOutDetails, hotelsPropertyContactDetailsCreateFromParcel, hotelsPropertyAttributes, hotelsPropertyAdditionalInformation2, arrayList5, aVar, hotelsPropertyHostDetailsCreateFromParcel, arrayList4, parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Distance.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : h.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : TravelHotelsPromotion.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HotelsProperty[i];
        }
    }

    public HotelsProperty(String id10, String name, ArrayList arrayList, HotelsPropertyType hotelsPropertyType, List images, Integer num, HotelsPropertyRatings hotelsPropertyRatings, HotelsPropertyAvailability hotelsPropertyAvailability, Pricing pricing, HotelsPropertyPaymentOptions hotelsPropertyPaymentOptions, HotelsPropertyCancellationOptions hotelsPropertyCancellationOptions, HotelsPropertyLocation location, ArrayList arrayList2, HotelsPositionToSearchLocationCentre hotelsPositionToSearchLocationCentre, HotelsPropertyCheckInDetails hotelsPropertyCheckInDetails, HotelsPropertyCheckOutDetails hotelsPropertyCheckOutDetails, HotelsPropertyContactDetails hotelsPropertyContactDetails, HotelsPropertyAttributes hotelsPropertyAttributes, HotelsPropertyAdditionalInformation hotelsPropertyAdditionalInformation, ArrayList arrayList3, fgi.a aVar, HotelsPropertyHostDetails hotelsPropertyHostDetails, ArrayList arrayList4, String str, List list, Distance distance, h hVar, TravelHotelsPromotion travelHotelsPromotion) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f97981a = id10;
        this.f97982b = name;
        this.f97983c = arrayList;
        this.d = hotelsPropertyType;
        this.e = images;
        this.f = num;
        this.f97984g = hotelsPropertyRatings;
        this.f97985h = hotelsPropertyAvailability;
        this.i = pricing;
        this.f97986j = hotelsPropertyPaymentOptions;
        this.k = hotelsPropertyCancellationOptions;
        this.f97987l = location;
        this.f97988m = arrayList2;
        this.f97989n = hotelsPositionToSearchLocationCentre;
        this.o = hotelsPropertyCheckInDetails;
        this.f97990p = hotelsPropertyCheckOutDetails;
        this.f97991q = hotelsPropertyContactDetails;
        this.f97992r = hotelsPropertyAttributes;
        this.f97993s = hotelsPropertyAdditionalInformation;
        this.f97994t = arrayList3;
        this.u = aVar;
        this.v = hotelsPropertyHostDetails;
        this.f97995w = arrayList4;
        this.f97996x = str;
        this.f97997y = list;
        this.z = distance;
        this.A = hVar;
        this.B = travelHotelsPromotion;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HotelsProperty)) {
            return false;
        }
        HotelsProperty hotelsProperty = (HotelsProperty) obj2;
        return Intrinsics.f(this.f97981a, hotelsProperty.f97981a) && Intrinsics.f(this.f97982b, hotelsProperty.f97982b) && Intrinsics.f(this.f97983c, hotelsProperty.f97983c) && Intrinsics.f(this.d, hotelsProperty.d) && Intrinsics.f(this.e, hotelsProperty.e) && Intrinsics.f(this.f, hotelsProperty.f) && Intrinsics.f(this.f97984g, hotelsProperty.f97984g) && Intrinsics.f(this.f97985h, hotelsProperty.f97985h) && Intrinsics.f(this.i, hotelsProperty.i) && Intrinsics.f(this.f97986j, hotelsProperty.f97986j) && Intrinsics.f(this.k, hotelsProperty.k) && Intrinsics.f(this.f97987l, hotelsProperty.f97987l) && Intrinsics.f(this.f97988m, hotelsProperty.f97988m) && Intrinsics.f(this.f97989n, hotelsProperty.f97989n) && Intrinsics.f(this.o, hotelsProperty.o) && Intrinsics.f(this.f97990p, hotelsProperty.f97990p) && Intrinsics.f(this.f97991q, hotelsProperty.f97991q) && Intrinsics.f(this.f97992r, hotelsProperty.f97992r) && Intrinsics.f(this.f97993s, hotelsProperty.f97993s) && Intrinsics.f(this.f97994t, hotelsProperty.f97994t) && this.u == hotelsProperty.u && Intrinsics.f(this.v, hotelsProperty.v) && Intrinsics.f(this.f97995w, hotelsProperty.f97995w) && Intrinsics.f(this.f97996x, hotelsProperty.f97996x) && Intrinsics.f(this.f97997y, hotelsProperty.f97997y) && Intrinsics.f(this.z, hotelsProperty.z) && this.A == hotelsProperty.A && Intrinsics.f(this.B, hotelsProperty.B);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f97981a.hashCode() * 31, 31, this.f97982b);
        List list = this.f97983c;
        int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
        HotelsPropertyType hotelsPropertyType = this.d;
        int iD = p.a.d((iHashCode + (hotelsPropertyType == null ? 0 : hotelsPropertyType.hashCode())) * 31, 31, this.e);
        Integer num = this.f;
        int iHashCode2 = (iD + (num == null ? 0 : num.hashCode())) * 31;
        HotelsPropertyRatings hotelsPropertyRatings = this.f97984g;
        int iHashCode3 = (iHashCode2 + (hotelsPropertyRatings == null ? 0 : hotelsPropertyRatings.hashCode())) * 31;
        HotelsPropertyAvailability hotelsPropertyAvailability = this.f97985h;
        int iHashCode4 = (iHashCode3 + (hotelsPropertyAvailability == null ? 0 : hotelsPropertyAvailability.hashCode())) * 31;
        Pricing pricing = this.i;
        int iHashCode5 = (iHashCode4 + (pricing == null ? 0 : pricing.hashCode())) * 31;
        HotelsPropertyPaymentOptions hotelsPropertyPaymentOptions = this.f97986j;
        int iHashCode6 = (iHashCode5 + (hotelsPropertyPaymentOptions == null ? 0 : hotelsPropertyPaymentOptions.hashCode())) * 31;
        HotelsPropertyCancellationOptions hotelsPropertyCancellationOptions = this.k;
        int iHashCode7 = (this.f97987l.hashCode() + ((iHashCode6 + (hotelsPropertyCancellationOptions == null ? 0 : Boolean.hashCode(hotelsPropertyCancellationOptions.f98010a))) * 31)) * 31;
        List list2 = this.f97988m;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        HotelsPositionToSearchLocationCentre hotelsPositionToSearchLocationCentre = this.f97989n;
        int iHashCode9 = (iHashCode8 + (hotelsPositionToSearchLocationCentre == null ? 0 : hotelsPositionToSearchLocationCentre.hashCode())) * 31;
        HotelsPropertyCheckInDetails hotelsPropertyCheckInDetails = this.o;
        int iHashCode10 = (iHashCode9 + (hotelsPropertyCheckInDetails == null ? 0 : hotelsPropertyCheckInDetails.hashCode())) * 31;
        HotelsPropertyCheckOutDetails hotelsPropertyCheckOutDetails = this.f97990p;
        int iHashCode11 = (iHashCode10 + (hotelsPropertyCheckOutDetails == null ? 0 : hotelsPropertyCheckOutDetails.f98018a.hashCode())) * 31;
        HotelsPropertyContactDetails hotelsPropertyContactDetails = this.f97991q;
        int iHashCode12 = (iHashCode11 + (hotelsPropertyContactDetails == null ? 0 : hotelsPropertyContactDetails.hashCode())) * 31;
        HotelsPropertyAttributes hotelsPropertyAttributes = this.f97992r;
        int iHashCode13 = (iHashCode12 + (hotelsPropertyAttributes == null ? 0 : Boolean.hashCode(hotelsPropertyAttributes.f97999a))) * 31;
        HotelsPropertyAdditionalInformation hotelsPropertyAdditionalInformation = this.f97993s;
        int iHashCode14 = (iHashCode13 + (hotelsPropertyAdditionalInformation == null ? 0 : hotelsPropertyAdditionalInformation.f97998a.hashCode())) * 31;
        List list3 = this.f97994t;
        int iHashCode15 = (iHashCode14 + (list3 == null ? 0 : list3.hashCode())) * 31;
        fgi.a aVar = this.u;
        int iHashCode16 = (iHashCode15 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        HotelsPropertyHostDetails hotelsPropertyHostDetails = this.v;
        int iHashCode17 = (iHashCode16 + (hotelsPropertyHostDetails == null ? 0 : hotelsPropertyHostDetails.hashCode())) * 31;
        List list4 = this.f97995w;
        int iHashCode18 = (iHashCode17 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str = this.f97996x;
        int iHashCode19 = (iHashCode18 + (str == null ? 0 : str.hashCode())) * 31;
        List list5 = this.f97997y;
        int iHashCode20 = (iHashCode19 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Distance distance = this.z;
        int iHashCode21 = (iHashCode20 + (distance == null ? 0 : distance.hashCode())) * 31;
        h hVar = this.A;
        int iHashCode22 = (iHashCode21 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        TravelHotelsPromotion travelHotelsPromotion = this.B;
        return iHashCode22 + (travelHotelsPromotion != null ? travelHotelsPromotion.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f97981a);
        dest.writeString(this.f97982b);
        List list = this.f97983c;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((PropertyDescription) itQ.next()).writeToParcel(dest, i);
            }
        }
        HotelsPropertyType hotelsPropertyType = this.d;
        if (hotelsPropertyType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            hotelsPropertyType.writeToParcel(dest, i);
        }
        Iterator itV = p.a.v(this.e, dest);
        while (itV.hasNext()) {
            ((Image) itV.next()).writeToParcel(dest, i);
        }
        Integer num = this.f;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        HotelsPropertyRatings hotelsPropertyRatings = this.f97984g;
        if (hotelsPropertyRatings == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            hotelsPropertyRatings.writeToParcel(dest, i);
        }
        HotelsPropertyAvailability hotelsPropertyAvailability = this.f97985h;
        if (hotelsPropertyAvailability == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            hotelsPropertyAvailability.writeToParcel(dest, i);
        }
        Pricing pricing = this.i;
        if (pricing == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pricing.writeToParcel(dest, i);
        }
        HotelsPropertyPaymentOptions hotelsPropertyPaymentOptions = this.f97986j;
        if (hotelsPropertyPaymentOptions == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            hotelsPropertyPaymentOptions.writeToParcel(dest, i);
        }
        HotelsPropertyCancellationOptions hotelsPropertyCancellationOptions = this.k;
        if (hotelsPropertyCancellationOptions == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            hotelsPropertyCancellationOptions.writeToParcel(dest, i);
        }
        this.f97987l.writeToParcel(dest, i);
        List list2 = this.f97988m;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ2 = v0.a.q(dest, 1, list2);
            while (itQ2.hasNext()) {
                ((HotelsPropertyRelativeLocation) itQ2.next()).writeToParcel(dest, i);
            }
        }
        HotelsPositionToSearchLocationCentre hotelsPositionToSearchLocationCentre = this.f97989n;
        if (hotelsPositionToSearchLocationCentre == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            hotelsPositionToSearchLocationCentre.writeToParcel(dest, i);
        }
        HotelsPropertyCheckInDetails hotelsPropertyCheckInDetails = this.o;
        if (hotelsPropertyCheckInDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            hotelsPropertyCheckInDetails.writeToParcel(dest, i);
        }
        HotelsPropertyCheckOutDetails hotelsPropertyCheckOutDetails = this.f97990p;
        if (hotelsPropertyCheckOutDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            hotelsPropertyCheckOutDetails.writeToParcel(dest, i);
        }
        HotelsPropertyContactDetails hotelsPropertyContactDetails = this.f97991q;
        if (hotelsPropertyContactDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            hotelsPropertyContactDetails.writeToParcel(dest, i);
        }
        HotelsPropertyAttributes hotelsPropertyAttributes = this.f97992r;
        if (hotelsPropertyAttributes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            hotelsPropertyAttributes.writeToParcel(dest, i);
        }
        HotelsPropertyAdditionalInformation hotelsPropertyAdditionalInformation = this.f97993s;
        if (hotelsPropertyAdditionalInformation == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            hotelsPropertyAdditionalInformation.writeToParcel(dest, i);
        }
        List list3 = this.f97994t;
        if (list3 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ3 = v0.a.q(dest, 1, list3);
            while (itQ3.hasNext()) {
                ((TravelHotelsCampaign) itQ3.next()).writeToParcel(dest, i);
            }
        }
        fgi.a aVar = this.u;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        HotelsPropertyHostDetails hotelsPropertyHostDetails = this.v;
        if (hotelsPropertyHostDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            hotelsPropertyHostDetails.writeToParcel(dest, i);
        }
        List list4 = this.f97995w;
        if (list4 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ4 = v0.a.q(dest, 1, list4);
            while (itQ4.hasNext()) {
                ((HotelsPropertySpace) itQ4.next()).writeToParcel(dest, i);
            }
        }
        dest.writeString(this.f97996x);
        dest.writeStringList(this.f97997y);
        Distance distance = this.z;
        if (distance == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            distance.writeToParcel(dest, i);
        }
        h hVar = this.A;
        if (hVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(hVar.name());
        }
        TravelHotelsPromotion travelHotelsPromotion = this.B;
        if (travelHotelsPromotion == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            travelHotelsPromotion.writeToParcel(dest, i);
        }
    }
}
