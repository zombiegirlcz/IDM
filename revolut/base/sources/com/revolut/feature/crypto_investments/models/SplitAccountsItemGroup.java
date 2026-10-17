package com.revolut.feature.crypto_investments.models;

import a10.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.crypto_investments.api.widget.split.SplitAccountsWidgetContract$ReloadParcel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.provider.digest.a;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\u0006\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroup;", "Landroid/os/Parcelable;", "GroupWithActionHeader", "LoadingGroup", "ErrorGroup", "Empty", "GroupWithHeader", "ItemsGroup", "ActionHeaderItem", "Item", "RowItem", "SwipeAction", "rv5/a", "LoadingItem", "ErrorItem", "Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroup$Empty;", "Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroup$ErrorGroup;", "Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroup$GroupWithActionHeader;", "Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroup$GroupWithHeader;", "Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroup$ItemsGroup;", "Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroup$LoadingGroup;", "feature_crypto_investments_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SplitAccountsItemGroup extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroup$ActionHeaderItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_investments_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ActionHeaderItem implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ActionHeaderItem> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f71452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f71453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f71454c;
        public final Image d;
        public final Clause e;
        public final Parcelable f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ActionHeaderItem(parcel.readString(), (Clause) parcel.readParcelable(ActionHeaderItem.class.getClassLoader()), (Clause) parcel.readParcelable(ActionHeaderItem.class.getClassLoader()), (Image) parcel.readParcelable(ActionHeaderItem.class.getClassLoader()), (Clause) parcel.readParcelable(ActionHeaderItem.class.getClassLoader()), parcel.readParcelable(ActionHeaderItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ActionHeaderItem[i];
            }
        }

        public ActionHeaderItem(String listId, Clause title, Clause clause, Image mainImage, Clause actionText, Parcelable parcelable) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(mainImage, "mainImage");
            Intrinsics.checkNotNullParameter(actionText, "actionText");
            this.f71452a = listId;
            this.f71453b = title;
            this.f71454c = clause;
            this.d = mainImage;
            this.e = actionText;
            this.f = parcelable;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ActionHeaderItem)) {
                return false;
            }
            ActionHeaderItem actionHeaderItem = (ActionHeaderItem) obj2;
            return Intrinsics.f(this.f71452a, actionHeaderItem.f71452a) && Intrinsics.f(this.f71453b, actionHeaderItem.f71453b) && Intrinsics.f(this.f71454c, actionHeaderItem.f71454c) && Intrinsics.f(this.d, actionHeaderItem.d) && Intrinsics.f(this.e, actionHeaderItem.e) && Intrinsics.f(this.f, actionHeaderItem.f);
        }

        public final int hashCode() {
            int iA = p.a.a(this.f71452a.hashCode() * 31, 31, this.f71453b);
            Clause clause = this.f71454c;
            int iA2 = p.a.a(b.c(this.d, (iA + (clause == null ? 0 : clause.hashCode())) * 31, 31), 31, this.e);
            Parcelable parcelable = this.f;
            return iA2 + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71452a);
            dest.writeParcelable(this.f71453b, i);
            dest.writeParcelable(this.f71454c, i);
            dest.writeParcelable(this.d, i);
            dest.writeParcelable(this.e, i);
            dest.writeParcelable(this.f, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroup$Empty;", "Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroup;", "<init>", "()V", "feature_crypto_investments_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Empty implements SplitAccountsItemGroup {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Empty f71455a = new Empty();

        @NotNull
        public static final Parcelable.Creator<Empty> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Empty.f71455a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Empty[i];
            }
        }

        private Empty() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroup$ErrorGroup;", "Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroup;", "", "toString", "()Ljava/lang/String;", "feature_crypto_investments_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ErrorGroup implements SplitAccountsItemGroup {

        @NotNull
        public static final Parcelable.Creator<ErrorGroup> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ErrorItem f71456a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ErrorGroup(ErrorItem.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ErrorGroup[i];
            }
        }

        public ErrorGroup(ErrorItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.f71456a = item;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ErrorGroup) && Intrinsics.f(this.f71456a, ((ErrorGroup) obj2).f71456a);
        }

        public final int hashCode() {
            return this.f71456a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f71456a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroup$GroupWithActionHeader;", "Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroup;", "", "toString", "()Ljava/lang/String;", "feature_crypto_investments_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GroupWithActionHeader implements SplitAccountsItemGroup {

        @NotNull
        public static final Parcelable.Creator<GroupWithActionHeader> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ActionHeaderItem f71460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SplitAccountsItemGroup f71461b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GroupWithActionHeader(ActionHeaderItem.CREATOR.createFromParcel(parcel), (SplitAccountsItemGroup) parcel.readParcelable(GroupWithActionHeader.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GroupWithActionHeader[i];
            }
        }

        public GroupWithActionHeader(ActionHeaderItem headerItem, SplitAccountsItemGroup contentGroup) {
            Intrinsics.checkNotNullParameter(headerItem, "headerItem");
            Intrinsics.checkNotNullParameter(contentGroup, "contentGroup");
            this.f71460a = headerItem;
            this.f71461b = contentGroup;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof GroupWithActionHeader)) {
                return false;
            }
            GroupWithActionHeader groupWithActionHeader = (GroupWithActionHeader) obj2;
            return Intrinsics.f(this.f71460a, groupWithActionHeader.f71460a) && Intrinsics.f(this.f71461b, groupWithActionHeader.f71461b);
        }

        public final int hashCode() {
            return this.f71461b.hashCode() + (this.f71460a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f71460a.writeToParcel(dest, i);
            dest.writeParcelable(this.f71461b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroup$Item;", "Landroid/os/Parcelable;", "<init>", "()V", "Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroup$ErrorItem;", "Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroup$LoadingItem;", "Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroup$RowItem;", "feature_crypto_investments_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Item implements Parcelable {
        private Item() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroup$ItemsGroup;", "Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroup;", "", "toString", "()Ljava/lang/String;", "feature_crypto_investments_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ItemsGroup implements SplitAccountsItemGroup {

        @NotNull
        public static final Parcelable.Creator<ItemsGroup> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f71467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f71468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f71469c;
        public final Parcelable d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(ItemsGroup.class, parcel, arrayList, iE, 1);
                }
                return new ItemsGroup(arrayList, parcel.readInt() != 0, parcel.readInt(), parcel.readParcelable(ItemsGroup.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ItemsGroup[i];
            }
        }

        public ItemsGroup(List items, boolean z, int i, Parcelable parcelable) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.f71467a = items;
            this.f71468b = z;
            this.f71469c = i;
            this.d = parcelable;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ItemsGroup)) {
                return false;
            }
            ItemsGroup itemsGroup = (ItemsGroup) obj2;
            return Intrinsics.f(this.f71467a, itemsGroup.f71467a) && this.f71468b == itemsGroup.f71468b && this.f71469c == itemsGroup.f71469c && Intrinsics.f(this.d, itemsGroup.d);
        }

        public final int hashCode() {
            int iB = j6.a.b(this.f71469c, j6.a.c(this.f71467a.hashCode() * 31, 31, this.f71468b), 31);
            Parcelable parcelable = this.d;
            return iB + (parcelable == null ? 0 : parcelable.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f71467a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeInt(this.f71468b ? 1 : 0);
            dest.writeInt(this.f71469c);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroup$LoadingGroup;", "Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroup;", "", "toString", "()Ljava/lang/String;", "feature_crypto_investments_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LoadingGroup implements SplitAccountsItemGroup {

        @NotNull
        public static final Parcelable.Creator<LoadingGroup> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f71470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RowItem f71471b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f71472c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(LoadingItem.CREATOR, parcel, arrayList, iA, 1);
                }
                return new LoadingGroup(arrayList, parcel.readInt() == 0 ? null : RowItem.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LoadingGroup[i];
            }
        }

        public /* synthetic */ LoadingGroup(ArrayList arrayList) {
            this(arrayList, null, true);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LoadingGroup)) {
                return false;
            }
            LoadingGroup loadingGroup = (LoadingGroup) obj2;
            return Intrinsics.f(this.f71470a, loadingGroup.f71470a) && Intrinsics.f(this.f71471b, loadingGroup.f71471b) && this.f71472c == loadingGroup.f71472c;
        }

        public final int hashCode() {
            int iHashCode = this.f71470a.hashCode() * 31;
            RowItem rowItem = this.f71471b;
            return Boolean.hashCode(this.f71472c) + ((iHashCode + (rowItem == null ? 0 : rowItem.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f71470a, dest);
            while (itV.hasNext()) {
                ((LoadingItem) itV.next()).writeToParcel(dest, i);
            }
            RowItem rowItem = this.f71471b;
            if (rowItem == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                rowItem.writeToParcel(dest, i);
            }
            dest.writeInt(this.f71472c ? 1 : 0);
        }

        public LoadingGroup(List placeholderItems, RowItem rowItem, boolean z) {
            Intrinsics.checkNotNullParameter(placeholderItems, "placeholderItems");
            this.f71470a = placeholderItems;
            this.f71471b = rowItem;
            this.f71472c = z;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroup$LoadingItem;", "Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroup$Item;", "", "toString", "()Ljava/lang/String;", "feature_crypto_investments_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LoadingItem extends Item {

        @NotNull
        public static final Parcelable.Creator<LoadingItem> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f71473a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f71474b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f71475c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LoadingItem(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LoadingItem[i];
            }
        }

        public LoadingItem(String listId, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            this.f71473a = listId;
            this.f71474b = z;
            this.f71475c = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LoadingItem)) {
                return false;
            }
            LoadingItem loadingItem = (LoadingItem) obj2;
            return Intrinsics.f(this.f71473a, loadingItem.f71473a) && this.f71474b == loadingItem.f71474b && this.f71475c == loadingItem.f71475c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f71475c) + j6.a.c(this.f71473a.hashCode() * 31, 31, this.f71474b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71473a);
            dest.writeInt(this.f71474b ? 1 : 0);
            dest.writeInt(this.f71475c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroup$SwipeAction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_investments_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SwipeAction implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SwipeAction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f71485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Image f71486b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f71487c;
        public final rv5.a d;
        public final Parcelable e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SwipeAction(parcel.readString(), (Image) parcel.readParcelable(SwipeAction.class.getClassLoader()), (Clause) parcel.readParcelable(SwipeAction.class.getClassLoader()), rv5.a.valueOf(parcel.readString()), parcel.readParcelable(SwipeAction.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SwipeAction[i];
            }
        }

        public SwipeAction(String id10, Image image, Clause text, rv5.a style, Parcelable parcelable) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(style, "style");
            this.f71485a = id10;
            this.f71486b = image;
            this.f71487c = text;
            this.d = style;
            this.e = parcelable;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SwipeAction)) {
                return false;
            }
            SwipeAction swipeAction = (SwipeAction) obj2;
            return Intrinsics.f(this.f71485a, swipeAction.f71485a) && Intrinsics.f(this.f71486b, swipeAction.f71486b) && Intrinsics.f(this.f71487c, swipeAction.f71487c) && this.d == swipeAction.d && Intrinsics.f(this.e, swipeAction.e);
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + p.a.a(b.c(this.f71486b, this.f71485a.hashCode() * 31, 31), 31, this.f71487c)) * 31;
            Parcelable parcelable = this.e;
            return iHashCode + (parcelable == null ? 0 : parcelable.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71485a);
            dest.writeParcelable(this.f71486b, i);
            dest.writeParcelable(this.f71487c, i);
            dest.writeString(this.d.name());
            dest.writeParcelable(this.e, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroup$ErrorItem;", "Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroup$Item;", "", "toString", "()Ljava/lang/String;", "feature_crypto_investments_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ErrorItem extends Item {

        @NotNull
        public static final Parcelable.Creator<ErrorItem> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f71457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Parcelable f71458b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f71459c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ErrorItem(parcel.readInt() != 0, parcel.readParcelable(ErrorItem.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ErrorItem[i];
            }
        }

        public ErrorItem(boolean z, Parcelable parcelable, String str) {
            this.f71457a = z;
            this.f71458b = parcelable;
            this.f71459c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ErrorItem)) {
                return false;
            }
            ErrorItem errorItem = (ErrorItem) obj2;
            return this.f71457a == errorItem.f71457a && Intrinsics.f(this.f71458b, errorItem.f71458b) && Intrinsics.f(this.f71459c, errorItem.f71459c);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f71457a) * 31;
            Parcelable parcelable = this.f71458b;
            int iHashCode2 = (iHashCode + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            String str = this.f71459c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f71457a ? 1 : 0);
            dest.writeParcelable(this.f71458b, i);
            dest.writeString(this.f71459c);
        }

        public /* synthetic */ ErrorItem() {
            this(true, SplitAccountsWidgetContract$ReloadParcel.f71418a, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroup$GroupWithHeader;", "Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroup;", "", "toString", "()Ljava/lang/String;", "feature_crypto_investments_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GroupWithHeader implements SplitAccountsItemGroup {

        @NotNull
        public static final Parcelable.Creator<GroupWithHeader> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f71462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RowItem f71463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f71464c;
        public final List d;
        public final List e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f71465g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f71466h;
        public final Parcelable i;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                boolean z3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                RowItem rowItemCreateFromParcel = RowItem.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (true) {
                    z = true;
                    if (iE == i) {
                        break;
                    }
                    iE = j6.a.e(GroupWithHeader.class, parcel, arrayList, iE, 1);
                }
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                int iE2 = 0;
                while (iE2 != i2) {
                    iE2 = j6.a.e(GroupWithHeader.class, parcel, arrayList2, iE2, 1);
                }
                int i3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i3);
                int iE3 = 0;
                while (iE3 != i3) {
                    iE3 = j6.a.e(GroupWithHeader.class, parcel, arrayList3, iE3, 1);
                }
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = true;
                    z = false;
                }
                return new GroupWithHeader(string, rowItemCreateFromParcel, arrayList, arrayList2, arrayList3, z, parcel.readInt() != 0 ? z3 : false, parcel.readInt(), parcel.readParcelable(GroupWithHeader.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GroupWithHeader[i];
            }
        }

        public GroupWithHeader(String listId, RowItem headerItem, List leadingItems, List items, List footerItems, boolean z, boolean z3, int i, Parcelable parcelable) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(headerItem, "headerItem");
            Intrinsics.checkNotNullParameter(leadingItems, "leadingItems");
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(footerItems, "footerItems");
            this.f71462a = listId;
            this.f71463b = headerItem;
            this.f71464c = leadingItems;
            this.d = items;
            this.e = footerItems;
            this.f = z;
            this.f71465g = z3;
            this.f71466h = i;
            this.i = parcelable;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof GroupWithHeader)) {
                return false;
            }
            GroupWithHeader groupWithHeader = (GroupWithHeader) obj2;
            return Intrinsics.f(this.f71462a, groupWithHeader.f71462a) && Intrinsics.f(this.f71463b, groupWithHeader.f71463b) && Intrinsics.f(this.f71464c, groupWithHeader.f71464c) && Intrinsics.f(this.d, groupWithHeader.d) && Intrinsics.f(this.e, groupWithHeader.e) && this.f == groupWithHeader.f && this.f71465g == groupWithHeader.f71465g && this.f71466h == groupWithHeader.f71466h && Intrinsics.f(this.i, groupWithHeader.i);
        }

        public final int hashCode() {
            int iB = j6.a.b(this.f71466h, j6.a.c(j6.a.c(p.a.d(p.a.d(p.a.d((this.f71463b.hashCode() + (this.f71462a.hashCode() * 31)) * 31, 31, this.f71464c), 31, this.d), 31, this.e), 31, this.f), 31, this.f71465g), 31);
            Parcelable parcelable = this.i;
            return iB + (parcelable == null ? 0 : parcelable.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71462a);
            this.f71463b.writeToParcel(dest, i);
            Iterator itV = p.a.v(this.f71464c, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            Iterator itV2 = p.a.v(this.d, dest);
            while (itV2.hasNext()) {
                dest.writeParcelable((Parcelable) itV2.next(), i);
            }
            Iterator itV3 = p.a.v(this.e, dest);
            while (itV3.hasNext()) {
                dest.writeParcelable((Parcelable) itV3.next(), i);
            }
            dest.writeInt(this.f ? 1 : 0);
            dest.writeInt(this.f71465g ? 1 : 0);
            dest.writeInt(this.f71466h);
            dest.writeParcelable(this.i, i);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public GroupWithHeader(String str, RowItem rowItem, List list, boolean z, boolean z3, int i, Parcelable parcelable, int i2) {
            f0 f0Var = f0.f322471a;
            this(str, rowItem, f0Var, list, f0Var, z, z3, i, (i2 & 256) != 0 ? null : parcelable);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroup$RowItem;", "Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroup$Item;", "", "toString", "()Ljava/lang/String;", "Companion", "Value", "a", "feature_crypto_investments_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RowItem extends Item {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f71476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RowDelegate.Model.MainImage f71477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f71478c;
        public final Image d;
        public final Clause e;
        public final Value f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f71479g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f71480h;
        public final List i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Parcelable f71481j;

        @NotNull
        public static final Parcelable.Creator<RowItem> CREATOR = new b();

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroup$RowItem$Value;", "Landroid/os/Parcelable;", "TrailingImage", "Texts", "Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroup$RowItem$Value$Texts;", "Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroup$RowItem$Value$TrailingImage;", "feature_crypto_investments_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface Value extends Parcelable {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroup$RowItem$Value$Texts;", "Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroup$RowItem$Value;", "", "toString", "()Ljava/lang/String;", "feature_crypto_investments_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Texts implements Value {

                @NotNull
                public static final Parcelable.Creator<Texts> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Clause f71482a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Clause f71483b;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Texts((Clause) parcel.readParcelable(Texts.class.getClassLoader()), (Clause) parcel.readParcelable(Texts.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Texts[i];
                    }
                }

                public Texts(Clause primary, Clause clause) {
                    Intrinsics.checkNotNullParameter(primary, "primary");
                    this.f71482a = primary;
                    this.f71483b = clause;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof Texts)) {
                        return false;
                    }
                    Texts texts = (Texts) obj2;
                    return Intrinsics.f(this.f71482a, texts.f71482a) && Intrinsics.f(this.f71483b, texts.f71483b);
                }

                public final int hashCode() {
                    int iHashCode = this.f71482a.hashCode() * 31;
                    Clause clause = this.f71483b;
                    return iHashCode + (clause == null ? 0 : clause.hashCode());
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f71482a, i);
                    dest.writeParcelable(this.f71483b, i);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroup$RowItem$Value$TrailingImage;", "Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroup$RowItem$Value;", "", "toString", "()Ljava/lang/String;", "feature_crypto_investments_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class TrailingImage implements Value {

                @NotNull
                public static final Parcelable.Creator<TrailingImage> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Image f71484a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new TrailingImage((Image) parcel.readParcelable(TrailingImage.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new TrailingImage[i];
                    }
                }

                public TrailingImage(Image image) {
                    Intrinsics.checkNotNullParameter(image, "image");
                    this.f71484a = image;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof TrailingImage) && Intrinsics.f(this.f71484a, ((TrailingImage) obj2).f71484a);
                }

                public final int hashCode() {
                    return this.f71484a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f71484a, i);
                }
            }
        }

        public static final class b implements Parcelable.Creator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                int iA;
                int i;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                RowDelegate.Model.MainImage mainImage = (RowDelegate.Model.MainImage) parcel.readParcelable(RowItem.class.getClassLoader());
                Clause clause = (Clause) parcel.readParcelable(RowItem.class.getClassLoader());
                Image image = (Image) parcel.readParcelable(RowItem.class.getClassLoader());
                Clause clause2 = (Clause) parcel.readParcelable(RowItem.class.getClassLoader());
                Value value = (Value) parcel.readParcelable(RowItem.class.getClassLoader());
                boolean z = false;
                boolean z3 = 1;
                if (parcel.readInt() != 0) {
                    iA = 0;
                    z = true;
                } else {
                    iA = 0;
                }
                if (parcel.readInt() != 0) {
                    i = 1;
                } else {
                    i = 1;
                    z3 = iA;
                }
                int i2 = parcel.readInt();
                int i3 = i;
                ArrayList arrayList = new ArrayList(i2);
                while (iA != i2) {
                    iA = a.a(SwipeAction.CREATOR, parcel, arrayList, iA, i3);
                }
                return new RowItem(string, mainImage, clause, image, clause2, value, z, z3, arrayList, parcel.readParcelable(RowItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RowItem[i];
            }
        }

        public RowItem(String listId, RowDelegate.Model.MainImage mainImage, Clause title, Image image, Clause clause, Value value, boolean z, boolean z3, List swipeActions, Parcelable parcelable) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(swipeActions, "swipeActions");
            this.f71476a = listId;
            this.f71477b = mainImage;
            this.f71478c = title;
            this.d = image;
            this.e = clause;
            this.f = value;
            this.f71479g = z;
            this.f71480h = z3;
            this.i = swipeActions;
            this.f71481j = parcelable;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RowItem)) {
                return false;
            }
            RowItem rowItem = (RowItem) obj2;
            return Intrinsics.f(this.f71476a, rowItem.f71476a) && Intrinsics.f(this.f71477b, rowItem.f71477b) && Intrinsics.f(this.f71478c, rowItem.f71478c) && Intrinsics.f(this.d, rowItem.d) && Intrinsics.f(this.e, rowItem.e) && Intrinsics.f(this.f, rowItem.f) && this.f71479g == rowItem.f71479g && this.f71480h == rowItem.f71480h && Intrinsics.f(this.i, rowItem.i) && Intrinsics.f(this.f71481j, rowItem.f71481j);
        }

        public final int hashCode() {
            int iHashCode = this.f71476a.hashCode() * 31;
            RowDelegate.Model.MainImage mainImage = this.f71477b;
            int iA = p.a.a((iHashCode + (mainImage == null ? 0 : mainImage.hashCode())) * 31, 31, this.f71478c);
            Image image = this.d;
            int iHashCode2 = (iA + (image == null ? 0 : image.hashCode())) * 31;
            Clause clause = this.e;
            int iHashCode3 = (iHashCode2 + (clause == null ? 0 : clause.hashCode())) * 31;
            Value value = this.f;
            int iD = p.a.d(j6.a.c(j6.a.c((iHashCode3 + (value == null ? 0 : value.hashCode())) * 31, 31, this.f71479g), 31, this.f71480h), 31, this.i);
            Parcelable parcelable = this.f71481j;
            return iD + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71476a);
            dest.writeParcelable(this.f71477b, i);
            dest.writeParcelable(this.f71478c, i);
            dest.writeParcelable(this.d, i);
            dest.writeParcelable(this.e, i);
            dest.writeParcelable(this.f, i);
            dest.writeInt(this.f71479g ? 1 : 0);
            dest.writeInt(this.f71480h ? 1 : 0);
            Iterator itV = p.a.v(this.i, dest);
            while (itV.hasNext()) {
                ((SwipeAction) itV.next()).writeToParcel(dest, i);
            }
            dest.writeParcelable(this.f71481j, i);
        }

        public RowItem(String str, RowDelegate.Model.MainImage.Image40 image40, Clause clause, ResourceImage resourceImage, Clause clause2, Value value, boolean z, boolean z3, Parcelable parcelable, int i) {
            this(str, image40, clause, (i & 8) != 0 ? null : resourceImage, clause2, value, (i & 64) != 0 ? true : z, (i & 128) != 0 ? true : z3, f0.f322471a, parcelable);
        }
    }
}
