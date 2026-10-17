package com.revolut.feature.tax_residency.impl.v2.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/v2/models/UserSpecificRule;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserSpecificRule implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f90186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f90187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f90188c;
    public final Popup d;
    public final Popup e;
    public final Popup f;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<UserSpecificRule> CREATOR = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final UserSpecificRule f90185g = new UserSpecificRule(true, null, null, null, null, null);

    /* JADX INFO: renamed from: com.revolut.feature.tax_residency.impl.v2.models.UserSpecificRule$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int iA = 0;
            boolean z = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iA2 = 0;
                while (iA2 != i) {
                    iA2 = org.bouncycastle.jcajce.provider.digest.a.a(Exemption.CREATOR, parcel, arrayList, iA2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i2 = parcel.readInt();
                arrayList2 = new ArrayList(i2);
                while (iA != i2) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Exemption.CREATOR, parcel, arrayList2, iA, 1);
                }
            }
            return new UserSpecificRule(z, arrayList, arrayList2, parcel.readInt() == 0 ? null : Popup.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Popup.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Popup.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UserSpecificRule[i];
        }
    }

    public UserSpecificRule(boolean z, List list, List list2, Popup popup, Popup popup2, Popup popup3) {
        this.f90186a = z;
        this.f90187b = list;
        this.f90188c = list2;
        this.d = popup;
        this.e = popup2;
        this.f = popup3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UserSpecificRule)) {
            return false;
        }
        UserSpecificRule userSpecificRule = (UserSpecificRule) obj2;
        return this.f90186a == userSpecificRule.f90186a && Intrinsics.f(this.f90187b, userSpecificRule.f90187b) && Intrinsics.f(this.f90188c, userSpecificRule.f90188c) && Intrinsics.f(this.d, userSpecificRule.d) && Intrinsics.f(this.e, userSpecificRule.e) && Intrinsics.f(this.f, userSpecificRule.f);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f90186a) * 31;
        List list = this.f90187b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f90188c;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Popup popup = this.d;
        int iHashCode4 = (iHashCode3 + (popup == null ? 0 : popup.hashCode())) * 31;
        Popup popup2 = this.e;
        int iHashCode5 = (iHashCode4 + (popup2 == null ? 0 : popup2.hashCode())) * 31;
        Popup popup3 = this.f;
        return iHashCode5 + (popup3 != null ? popup3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f90186a ? 1 : 0);
        List list = this.f90187b;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((Exemption) itQ.next()).writeToParcel(dest, i);
            }
        }
        List list2 = this.f90188c;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ2 = v0.a.q(dest, 1, list2);
            while (itQ2.hasNext()) {
                ((Exemption) itQ2.next()).writeToParcel(dest, i);
            }
        }
        Popup popup = this.d;
        if (popup == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            popup.writeToParcel(dest, i);
        }
        Popup popup2 = this.e;
        if (popup2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            popup2.writeToParcel(dest, i);
        }
        Popup popup3 = this.f;
        if (popup3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            popup3.writeToParcel(dest, i);
        }
    }
}
