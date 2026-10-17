package com.revolut.feature.push_to_card.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/push_to_card/api/model/DropdownFieldContent;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_push_to_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DropdownFieldContent implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DropdownFieldContent> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f81516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f81518c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int iA = 0;
            boolean z = parcel.readInt() != 0;
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(AdditionalFieldOption.CREATOR, parcel, arrayList, iA, 1);
            }
            return new DropdownFieldContent(string, arrayList, z);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DropdownFieldContent[i];
        }
    }

    public DropdownFieldContent(String label, ArrayList options, boolean z) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f81516a = z;
        this.f81517b = label;
        this.f81518c = options;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DropdownFieldContent)) {
            return false;
        }
        DropdownFieldContent dropdownFieldContent = (DropdownFieldContent) obj2;
        return this.f81516a == dropdownFieldContent.f81516a && Intrinsics.f(this.f81517b, dropdownFieldContent.f81517b) && this.f81518c.equals(dropdownFieldContent.f81518c);
    }

    public final int hashCode() {
        return this.f81518c.hashCode() + p.a.c(Boolean.hashCode(this.f81516a) * 31, 31, this.f81517b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f81516a ? 1 : 0);
        dest.writeString(this.f81517b);
        Iterator itY = j6.a.y(this.f81518c, dest);
        while (itY.hasNext()) {
            ((AdditionalFieldOption) itY.next()).writeToParcel(dest, i);
        }
    }
}
