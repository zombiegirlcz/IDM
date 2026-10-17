package com.revolut.shared.feature.workflow.engine.api.models.workflow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.kyc_documents_scan.api.models.DocType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import my8.b0;
import my8.k;
import my8.v;
import org.jetbrains.annotations.NotNull;
import ril.g;
import ril.i;
import wi0.b;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/SdkStep;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SdkStep implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SdkStep> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f105647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f105648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f105649c;
    public final g d;
    public final String e;
    public final v f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f105650g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DocType f105651h;
    public final b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f105652j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Set f105653l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final VendorSideAttributes f105654m;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            LinkedHashSet linkedHashSet;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            i iVarValueOf = i.valueOf(parcel.readString());
            g gVarValueOf = parcel.readInt() == 0 ? null : g.valueOf(parcel.readString());
            String string3 = parcel.readString();
            v vVarValueOf = v.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(b0.valueOf(parcel.readString()));
                }
            }
            DocType docType = (DocType) parcel.readParcelable(SdkStep.class.getClassLoader());
            b bVar = (b) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                int iE = 0;
                while (iE != i3) {
                    iE = j6.a.e(SdkStep.class, parcel, arrayList2, iE, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i5 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i5);
                int iA = 0;
                while (iA != i5) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Redirect.CREATOR, parcel, arrayList4, iA, 1);
                }
                arrayList3 = arrayList4;
            }
            if (parcel.readInt() == 0) {
                linkedHashSet = null;
            } else {
                int i6 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i6);
                for (int i21 = 0; i21 != i6; i21++) {
                    linkedHashSet2.add(k.valueOf(parcel.readString()));
                }
                linkedHashSet = linkedHashSet2;
            }
            return new SdkStep(string, string2, iVarValueOf, gVarValueOf, string3, vVarValueOf, arrayList, docType, bVar, arrayList2, arrayList3, linkedHashSet, parcel.readInt() == 0 ? null : VendorSideAttributes.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SdkStep[i];
        }
    }

    public SdkStep(String uri2, String str, i vendor, g gVar, String str2, v nfcType, ArrayList arrayList, DocType docType, b bVar, ArrayList arrayList2, ArrayList arrayList3, Set set, VendorSideAttributes vendorSideAttributes) {
        Intrinsics.checkNotNullParameter(uri2, "uri");
        Intrinsics.checkNotNullParameter(vendor, "vendor");
        Intrinsics.checkNotNullParameter(nfcType, "nfcType");
        this.f105647a = uri2;
        this.f105648b = str;
        this.f105649c = vendor;
        this.d = gVar;
        this.e = str2;
        this.f = nfcType;
        this.f105650g = arrayList;
        this.f105651h = docType;
        this.i = bVar;
        this.f105652j = arrayList2;
        this.k = arrayList3;
        this.f105653l = set;
        this.f105654m = vendorSideAttributes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SdkStep)) {
            return false;
        }
        SdkStep sdkStep = (SdkStep) obj2;
        return Intrinsics.f(this.f105647a, sdkStep.f105647a) && Intrinsics.f(this.f105648b, sdkStep.f105648b) && this.f105649c == sdkStep.f105649c && this.d == sdkStep.d && Intrinsics.f(this.e, sdkStep.e) && this.f == sdkStep.f && Intrinsics.f(this.f105650g, sdkStep.f105650g) && Intrinsics.f(this.f105651h, sdkStep.f105651h) && Intrinsics.f(this.i, sdkStep.i) && Intrinsics.f(this.f105652j, sdkStep.f105652j) && Intrinsics.f(this.k, sdkStep.k) && Intrinsics.f(this.f105653l, sdkStep.f105653l) && Intrinsics.f(this.f105654m, sdkStep.f105654m);
    }

    public final int hashCode() {
        int iHashCode = this.f105647a.hashCode() * 31;
        String str = this.f105648b;
        int iHashCode2 = (this.f105649c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        g gVar = this.d;
        int iHashCode3 = (iHashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode4 = (this.f.hashCode() + ((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        List list = this.f105650g;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        DocType docType = this.f105651h;
        int iHashCode6 = (iHashCode5 + (docType == null ? 0 : docType.f77926a.hashCode())) * 31;
        b bVar = this.i;
        int iHashCode7 = (iHashCode6 + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31;
        List list2 = this.f105652j;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.k;
        int iHashCode9 = (iHashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Set set = this.f105653l;
        int iHashCode10 = (iHashCode9 + (set == null ? 0 : set.hashCode())) * 31;
        VendorSideAttributes vendorSideAttributes = this.f105654m;
        return iHashCode10 + (vendorSideAttributes != null ? vendorSideAttributes.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f105647a);
        dest.writeString(this.f105648b);
        dest.writeString(this.f105649c.name());
        g gVar = this.d;
        if (gVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(gVar.name());
        }
        dest.writeString(this.e);
        dest.writeString(this.f.name());
        List list = this.f105650g;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeString(((b0) itQ.next()).name());
            }
        }
        dest.writeParcelable(this.f105651h, i);
        dest.writeSerializable(this.i);
        List list2 = this.f105652j;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ2 = v0.a.q(dest, 1, list2);
            while (itQ2.hasNext()) {
                dest.writeParcelable((Parcelable) itQ2.next(), i);
            }
        }
        List list3 = this.k;
        if (list3 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ3 = v0.a.q(dest, 1, list3);
            while (itQ3.hasNext()) {
                ((Redirect) itQ3.next()).writeToParcel(dest, i);
            }
        }
        Set set = this.f105653l;
        if (set == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ4 = e.q(dest, 1, set);
            while (itQ4.hasNext()) {
                dest.writeString(((k) itQ4.next()).name());
            }
        }
        VendorSideAttributes vendorSideAttributes = this.f105654m;
        if (vendorSideAttributes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            vendorSideAttributes.writeToParcel(dest, i);
        }
    }
}
