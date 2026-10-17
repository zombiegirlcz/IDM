package com.revolut.feature.kyc.impl.choosedocument.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/kyc/impl/choosedocument/model/SelectedKycDocs;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "SelectionMode", "a", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SelectedKycDocs implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f77598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SelectionMode f77599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f77600c;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<SelectedKycDocs> CREATOR = new b();
    public static final SelectedKycDocs d = new SelectedKycDocs(f0.f322471a, SelectionMode.NONE, null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/impl/choosedocument/model/SelectedKycDocs$SelectionMode;", "Landroid/os/Parcelable;", "", "NONE", "MULTICHOICE", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelectionMode implements Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SelectionMode[] $VALUES;

        @NotNull
        public static final Parcelable.Creator<SelectionMode> CREATOR;
        public static final SelectionMode MULTICHOICE;
        public static final SelectionMode NONE;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return SelectionMode.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectionMode[i];
            }
        }

        static {
            SelectionMode selectionMode = new SelectionMode("NONE", 0);
            NONE = selectionMode;
            SelectionMode selectionMode2 = new SelectionMode("MULTICHOICE", 1);
            MULTICHOICE = selectionMode2;
            SelectionMode[] selectionModeArr = {selectionMode, selectionMode2};
            $VALUES = selectionModeArr;
            $ENTRIES = s.n(selectionModeArr);
            CREATOR = new a();
        }

        public static SelectionMode valueOf(String str) {
            return (SelectionMode) Enum.valueOf(SelectionMode.class, str);
        }

        public static SelectionMode[] values() {
            return (SelectionMode[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(name());
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.kyc.impl.choosedocument.model.SelectedKycDocs$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iC = 0;
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            return new SelectedKycDocs(arrayList, SelectionMode.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SelectedKycDocs[i];
        }
    }

    public SelectedKycDocs(List kycDocs, SelectionMode selectionMode, String str) {
        Intrinsics.checkNotNullParameter(kycDocs, "kycDocs");
        Intrinsics.checkNotNullParameter(selectionMode, "selectionMode");
        this.f77598a = kycDocs;
        this.f77599b = selectionMode;
        this.f77600c = str;
    }

    public static SelectedKycDocs a(SelectedKycDocs selectedKycDocs, List kycDocs, String str, int i) {
        if ((i & 1) != 0) {
            kycDocs = selectedKycDocs.f77598a;
        }
        SelectionMode selectionMode = selectedKycDocs.f77599b;
        selectedKycDocs.getClass();
        Intrinsics.checkNotNullParameter(kycDocs, "kycDocs");
        Intrinsics.checkNotNullParameter(selectionMode, "selectionMode");
        return new SelectedKycDocs(kycDocs, selectionMode, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SelectedKycDocs)) {
            return false;
        }
        SelectedKycDocs selectedKycDocs = (SelectedKycDocs) obj2;
        return Intrinsics.f(this.f77598a, selectedKycDocs.f77598a) && this.f77599b == selectedKycDocs.f77599b && Intrinsics.f(this.f77600c, selectedKycDocs.f77600c);
    }

    public final int hashCode() {
        int iHashCode = (this.f77599b.hashCode() + (this.f77598a.hashCode() * 31)) * 31;
        String str = this.f77600c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f77598a, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
        this.f77599b.writeToParcel(dest, i);
        dest.writeString(this.f77600c);
    }
}
