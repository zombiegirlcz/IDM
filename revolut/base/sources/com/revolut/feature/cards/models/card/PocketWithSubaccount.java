package com.revolut.feature.cards.models.card;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import io3.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cards/models/card/PocketWithSubaccount;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_cards_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PocketWithSubaccount implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PocketWithSubaccount> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f65523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f65525c;
    public final b d;
    public final List e;
    public final boolean f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PocketWithSubaccount((d) parcel.readSerializable(), parcel.readString(), (Image) parcel.readParcelable(PocketWithSubaccount.class.getClassLoader()), (b) parcel.readSerializable(), parcel.createStringArrayList(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PocketWithSubaccount[i];
        }
    }

    public PocketWithSubaccount(d pocket, String str, Image image, b bVar, List subaccountBills, boolean z) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(subaccountBills, "subaccountBills");
        this.f65523a = pocket;
        this.f65524b = str;
        this.f65525c = image;
        this.d = bVar;
        this.e = subaccountBills;
        this.f = z;
    }

    public final boolean a() {
        return (this.f65524b == null || this.d == null) ? false : true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PocketWithSubaccount)) {
            return false;
        }
        PocketWithSubaccount pocketWithSubaccount = (PocketWithSubaccount) obj2;
        return Intrinsics.f(this.f65523a, pocketWithSubaccount.f65523a) && Intrinsics.f(this.f65524b, pocketWithSubaccount.f65524b) && Intrinsics.f(this.f65525c, pocketWithSubaccount.f65525c) && Intrinsics.f(this.d, pocketWithSubaccount.d) && Intrinsics.f(this.e, pocketWithSubaccount.e) && this.f == pocketWithSubaccount.f;
    }

    public final int hashCode() {
        int iHashCode = this.f65523a.hashCode() * 31;
        String str = this.f65524b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Image image = this.f65525c;
        int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        b bVar = this.d;
        return Boolean.hashCode(this.f) + p.a.d((iHashCode3 + (bVar != null ? bVar.hashCode() : 0)) * 31, 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f65523a);
        dest.writeString(this.f65524b);
        dest.writeParcelable(this.f65525c, i);
        dest.writeSerializable(this.d);
        dest.writeStringList(this.e);
        dest.writeInt(this.f ? 1 : 0);
    }

    public PocketWithSubaccount(d dVar, String str, b bVar, List list, boolean z, int i) {
        this(dVar, (i & 2) != 0 ? null : str, (Image) null, (i & 8) != 0 ? null : bVar, (i & 16) != 0 ? f0.f322471a : list, (i & 32) != 0 ? false : z);
    }
}
