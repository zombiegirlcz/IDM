package com.revolut.feature.profile.impl.ui.documents_redesigned;

import android.os.Parcel;
import android.os.Parcelable;
import ehe.n;
import ip0.v7;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import y7a.w;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/documents_redesigned/CurrencySelectionResult;", "Landroid/os/Parcelable;", "Ly7a/w;", "", "toString", "()Ljava/lang/String;", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CurrencySelectionResult implements Parcelable, w {

    @NotNull
    public static final Parcelable.Creator<CurrencySelectionResult> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f81408a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iD = 0;
            while (iD != i) {
                iD = v7.d(parcel, linkedHashSet, iD, 1);
            }
            return new CurrencySelectionResult(linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CurrencySelectionResult[i];
        }
    }

    public CurrencySelectionResult(Set selected) {
        Intrinsics.checkNotNullParameter(selected, "selected");
        this.f81408a = selected;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CurrencySelectionResult) && Intrinsics.f(this.f81408a, ((CurrencySelectionResult) obj2).f81408a);
    }

    public final int hashCode() {
        return this.f81408a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = n.v(this.f81408a, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
    }
}
