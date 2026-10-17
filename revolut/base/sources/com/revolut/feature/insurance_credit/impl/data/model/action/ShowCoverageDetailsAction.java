package com.revolut.feature.insurance_credit.impl.data.model.action;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/data/model/action/ShowCoverageDetailsAction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "BottomSheetContent", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ShowCoverageDetailsAction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ShowCoverageDetailsAction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BottomSheetContent f75784b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/data/model/action/ShowCoverageDetailsAction$BottomSheetContent;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BottomSheetContent implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<BottomSheetContent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f75786b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f75787c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i);
                    int iE = 0;
                    while (iE != i) {
                        iE = j6.a.e(BottomSheetContent.class, parcel, arrayList2, iE, 1);
                    }
                    arrayList = arrayList2;
                }
                return new BottomSheetContent(string, parcel.readString(), arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BottomSheetContent[i];
            }
        }

        public BottomSheetContent(String title, String str, ArrayList arrayList) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.f75785a = title;
            this.f75786b = arrayList;
            this.f75787c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BottomSheetContent)) {
                return false;
            }
            BottomSheetContent bottomSheetContent = (BottomSheetContent) obj2;
            return Intrinsics.f(this.f75785a, bottomSheetContent.f75785a) && Intrinsics.f(this.f75786b, bottomSheetContent.f75786b) && Intrinsics.f(this.f75787c, bottomSheetContent.f75787c);
        }

        public final int hashCode() {
            int iHashCode = this.f75785a.hashCode() * 31;
            List list = this.f75786b;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.f75787c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75785a);
            List list = this.f75786b;
            if (list == null) {
                dest.writeInt(0);
            } else {
                Iterator itQ = v0.a.q(dest, 1, list);
                while (itQ.hasNext()) {
                    dest.writeParcelable((Parcelable) itQ.next(), i);
                }
            }
            dest.writeString(this.f75787c);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShowCoverageDetailsAction(parcel.readString(), BottomSheetContent.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ShowCoverageDetailsAction[i];
        }
    }

    public ShowCoverageDetailsAction(String str, BottomSheetContent bottomSheetContent) {
        Intrinsics.checkNotNullParameter(bottomSheetContent, "bottomSheetContent");
        this.f75783a = str;
        this.f75784b = bottomSheetContent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ShowCoverageDetailsAction)) {
            return false;
        }
        ShowCoverageDetailsAction showCoverageDetailsAction = (ShowCoverageDetailsAction) obj2;
        return Intrinsics.f(this.f75783a, showCoverageDetailsAction.f75783a) && Intrinsics.f(this.f75784b, showCoverageDetailsAction.f75784b);
    }

    public final int hashCode() {
        String str = this.f75783a;
        return this.f75784b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75783a);
        this.f75784b.writeToParcel(dest, i);
    }
}
