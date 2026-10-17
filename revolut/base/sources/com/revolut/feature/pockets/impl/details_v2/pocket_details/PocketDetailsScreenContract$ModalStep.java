package com.revolut.feature.pockets.impl.details_v2.pocket_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.pockets.api.navigation.PocketListType;
import com.revolut.kompot.navigable.flow.FlowStep;
import h30.l;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/pockets/impl/details_v2/pocket_details/PocketDetailsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "PocketList", "PopupListDialog", "Lcom/revolut/feature/pockets/impl/details_v2/pocket_details/PocketDetailsScreenContract$ModalStep$PocketList;", "Lcom/revolut/feature/pockets/impl/details_v2/pocket_details/PocketDetailsScreenContract$ModalStep$PopupListDialog;", "feature_pockets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PocketDetailsScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pockets/impl/details_v2/pocket_details/PocketDetailsScreenContract$ModalStep$PocketList;", "Lcom/revolut/feature/pockets/impl/details_v2/pocket_details/PocketDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_pockets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PocketList extends PocketDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PocketList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PocketListType f80851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f80852b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final wi0.b f80853c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PocketList((PocketListType) parcel.readParcelable(PocketList.class.getClassLoader()), (b) parcel.readSerializable(), (wi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PocketList[i];
            }
        }

        public PocketList(PocketListType pocketListType, b currency, wi0.b country) {
            Intrinsics.checkNotNullParameter(pocketListType, "pocketListType");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(country, "country");
            this.f80851a = pocketListType;
            this.f80852b = currency;
            this.f80853c = country;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PocketList)) {
                return false;
            }
            PocketList pocketList = (PocketList) obj2;
            return Intrinsics.f(this.f80851a, pocketList.f80851a) && Intrinsics.f(this.f80852b, pocketList.f80852b) && Intrinsics.f(this.f80853c, pocketList.f80853c);
        }

        public final int hashCode() {
            return this.f80853c.f297794a.hashCode() + l.j(this.f80852b, this.f80851a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f80851a, i);
            dest.writeSerializable(this.f80852b);
            dest.writeSerializable(this.f80853c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pockets/impl/details_v2/pocket_details/PocketDetailsScreenContract$ModalStep$PopupListDialog;", "Lcom/revolut/feature/pockets/impl/details_v2/pocket_details/PocketDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "PopupListItem", "feature_pockets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PopupListDialog extends PocketDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PopupListDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f80854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f80855b;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pockets/impl/details_v2/pocket_details/PocketDetailsScreenContract$ModalStep$PopupListDialog$PopupListItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pockets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PopupListItem implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<PopupListItem> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Integer f80856a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f80857b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PopupListItem(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PopupListItem[i];
                }
            }

            public PopupListItem(Integer num, String text) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.f80856a = num;
                this.f80857b = text;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof PopupListItem)) {
                    return false;
                }
                PopupListItem popupListItem = (PopupListItem) obj2;
                return Intrinsics.f(this.f80856a, popupListItem.f80856a) && Intrinsics.f(this.f80857b, popupListItem.f80857b);
            }

            public final int hashCode() {
                Integer num = this.f80856a;
                return this.f80857b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Integer num = this.f80856a;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    p.a.B(dest, 1, num);
                }
                dest.writeString(this.f80857b);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(PopupListItem.CREATOR, parcel, arrayList, iA, 1);
                }
                return new PopupListDialog(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PopupListDialog[i];
            }
        }

        public PopupListDialog(String title, ArrayList items) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(items, "items");
            this.f80854a = title;
            this.f80855b = items;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PopupListDialog)) {
                return false;
            }
            PopupListDialog popupListDialog = (PopupListDialog) obj2;
            return Intrinsics.f(this.f80854a, popupListDialog.f80854a) && this.f80855b.equals(popupListDialog.f80855b);
        }

        public final int hashCode() {
            return this.f80855b.hashCode() + (this.f80854a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f80854a);
            Iterator itY = j6.a.y(this.f80855b, dest);
            while (itY.hasNext()) {
                ((PopupListItem) itY.next()).writeToParcel(dest, i);
            }
        }
    }

    private PocketDetailsScreenContract$ModalStep() {
    }
}
