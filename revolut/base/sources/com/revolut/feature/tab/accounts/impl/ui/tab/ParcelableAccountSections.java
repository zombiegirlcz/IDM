package com.revolut.feature.tab.accounts.impl.ui.tab;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/tab/accounts/impl/ui/tab/ParcelableAccountSections;", "Landroid/os/Parcelable;", "ParcelableItem", "ParcelableRow", "ParcelablePlaceholderRow", "ParcelableButton", "feature_tab_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ParcelableAccountSections implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ParcelableAccountSections> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f89663a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/tab/accounts/impl/ui/tab/ParcelableAccountSections$ParcelableButton;", "Lcom/revolut/feature/tab/accounts/impl/ui/tab/ParcelableAccountSections$ParcelableItem;", "feature_tab_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ParcelableButton implements ParcelableItem {

        @NotNull
        public static final Parcelable.Creator<ParcelableButton> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f89664a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f89665b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Image f89666c;
        public final LargeActionButton.ButtonStyle d;
        public final Parcelable e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ParcelableButton(parcel.readString(), (Clause) parcel.readParcelable(ParcelableButton.class.getClassLoader()), (Image) parcel.readParcelable(ParcelableButton.class.getClassLoader()), (LargeActionButton.ButtonStyle) parcel.readParcelable(ParcelableButton.class.getClassLoader()), parcel.readParcelable(ParcelableButton.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ParcelableButton[i];
            }
        }

        public ParcelableButton(String listId, Clause clause, Image image, LargeActionButton.ButtonStyle style, Parcelable parcelable) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(style, "style");
            this.f89664a = listId;
            this.f89665b = clause;
            this.f89666c = image;
            this.d = style;
            this.e = parcelable;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f89664a);
            dest.writeParcelable(this.f89665b, i);
            dest.writeParcelable(this.f89666c, i);
            dest.writeParcelable(this.d, i);
            dest.writeParcelable(this.e, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/tab/accounts/impl/ui/tab/ParcelableAccountSections$ParcelableItem;", "Landroid/os/Parcelable;", "Lcom/revolut/feature/tab/accounts/impl/ui/tab/ParcelableAccountSections$ParcelableButton;", "Lcom/revolut/feature/tab/accounts/impl/ui/tab/ParcelableAccountSections$ParcelablePlaceholderRow;", "Lcom/revolut/feature/tab/accounts/impl/ui/tab/ParcelableAccountSections$ParcelableRow;", "feature_tab_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface ParcelableItem extends Parcelable {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/tab/accounts/impl/ui/tab/ParcelableAccountSections$ParcelablePlaceholderRow;", "Lcom/revolut/feature/tab/accounts/impl/ui/tab/ParcelableAccountSections$ParcelableItem;", "feature_tab_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ParcelablePlaceholderRow implements ParcelableItem {

        @NotNull
        public static final Parcelable.Creator<ParcelablePlaceholderRow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f89667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Image f89668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f89669c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                return new ParcelablePlaceholderRow((Clause) parcel.readParcelable(ParcelablePlaceholderRow.class.getClassLoader()), (Image) parcel.readParcelable(ParcelablePlaceholderRow.class.getClassLoader()), string);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ParcelablePlaceholderRow[i];
            }
        }

        public ParcelablePlaceholderRow(Clause title, Image image, String listId) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            this.f89667a = listId;
            this.f89668b = image;
            this.f89669c = title;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f89667a);
            dest.writeParcelable(this.f89668b, i);
            dest.writeParcelable(this.f89669c, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/tab/accounts/impl/ui/tab/ParcelableAccountSections$ParcelableRow;", "Lcom/revolut/feature/tab/accounts/impl/ui/tab/ParcelableAccountSections$ParcelableItem;", "ParcelableTransactionDescriptor", "feature_tab_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ParcelableRow implements ParcelableItem {

        @NotNull
        public static final Parcelable.Creator<ParcelableRow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f89670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RowDelegate.Model.MainImage f89671b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f89672c;
        public final Clause d;
        public final Clause e;
        public final Clause f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ParcelableTransactionDescriptor f89673g;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/tab/accounts/impl/ui/tab/ParcelableAccountSections$ParcelableRow$ParcelableTransactionDescriptor;", "Landroid/os/Parcelable;", "feature_tab_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class ParcelableTransactionDescriptor implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ParcelableTransactionDescriptor> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f89674a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f89675b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ParcelableTransactionDescriptor(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ParcelableTransactionDescriptor[i];
                }
            }

            public ParcelableTransactionDescriptor(String groupId, String legId) {
                Intrinsics.checkNotNullParameter(groupId, "groupId");
                Intrinsics.checkNotNullParameter(legId, "legId");
                this.f89674a = groupId;
                this.f89675b = legId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f89674a);
                dest.writeString(this.f89675b);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ParcelableRow(parcel.readString(), (RowDelegate.Model.MainImage) parcel.readParcelable(ParcelableRow.class.getClassLoader()), (Clause) parcel.readParcelable(ParcelableRow.class.getClassLoader()), (Clause) parcel.readParcelable(ParcelableRow.class.getClassLoader()), (Clause) parcel.readParcelable(ParcelableRow.class.getClassLoader()), (Clause) parcel.readParcelable(ParcelableRow.class.getClassLoader()), ParcelableTransactionDescriptor.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ParcelableRow[i];
            }
        }

        public ParcelableRow(String listId, RowDelegate.Model.MainImage mainImage, Clause title, Clause clause, Clause clause2, Clause clause3, ParcelableTransactionDescriptor parcel) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            this.f89670a = listId;
            this.f89671b = mainImage;
            this.f89672c = title;
            this.d = clause;
            this.e = clause2;
            this.f = clause3;
            this.f89673g = parcel;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f89670a);
            dest.writeParcelable(this.f89671b, i);
            dest.writeParcelable(this.f89672c, i);
            dest.writeParcelable(this.d, i);
            dest.writeParcelable(this.e, i);
            dest.writeParcelable(this.f, i);
            this.f89673g.writeToParcel(dest, i);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(ParcelableAccountSections.class, parcel, arrayList, iE, 1);
            }
            return new ParcelableAccountSections(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ParcelableAccountSections[i];
        }
    }

    public ParcelableAccountSections(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f89663a = items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itY = j6.a.y(this.f89663a, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
    }
}
