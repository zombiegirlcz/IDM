package com.revolut.feature.shared.help_centre.impl.extension;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.shared.help_centre.api.faq.model.DisplayableFaqItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/extension/HelpWidgetParcel;", "Landroid/os/Parcelable;", "SeeAll", "Item", "Support", "FaqExplicit", "Lcom/revolut/feature/shared/help_centre/impl/extension/HelpWidgetParcel$FaqExplicit;", "Lcom/revolut/feature/shared/help_centre/impl/extension/HelpWidgetParcel$Item;", "Lcom/revolut/feature/shared/help_centre/impl/extension/HelpWidgetParcel$SeeAll;", "Lcom/revolut/feature/shared/help_centre/impl/extension/HelpWidgetParcel$Support;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface HelpWidgetParcel extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/extension/HelpWidgetParcel$FaqExplicit;", "Lcom/revolut/feature/shared/help_centre/impl/extension/HelpWidgetParcel;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FaqExplicit implements HelpWidgetParcel {

        @NotNull
        public static final Parcelable.Creator<FaqExplicit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86152a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FaqExplicit(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FaqExplicit[i];
            }
        }

        public FaqExplicit(String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f86152a = key;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FaqExplicit) && Intrinsics.f(this.f86152a, ((FaqExplicit) obj2).f86152a);
        }

        public final int hashCode() {
            return this.f86152a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86152a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/extension/HelpWidgetParcel$Item;", "Lcom/revolut/feature/shared/help_centre/impl/extension/HelpWidgetParcel;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Item implements HelpWidgetParcel {

        @NotNull
        public static final Parcelable.Creator<Item> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DisplayableFaqItem f86153a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Item((DisplayableFaqItem) parcel.readParcelable(Item.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Item[i];
            }
        }

        public Item(DisplayableFaqItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.f86153a = item;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Item) && Intrinsics.f(this.f86153a, ((Item) obj2).f86153a);
        }

        public final int hashCode() {
            return this.f86153a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f86153a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/extension/HelpWidgetParcel$SeeAll;", "Lcom/revolut/feature/shared/help_centre/impl/extension/HelpWidgetParcel;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SeeAll implements HelpWidgetParcel {

        @NotNull
        public static final Parcelable.Creator<SeeAll> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f86154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f86155b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f86156c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Clause clause = (Clause) j6.a.f(parcel, "parcel", SeeAll.class);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(SeeAll.class, parcel, arrayList, iE, 1);
                }
                return new SeeAll(clause, parcel.readString(), arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SeeAll[i];
            }
        }

        public SeeAll(Clause title, String analyticsContextId, List items) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(analyticsContextId, "analyticsContextId");
            this.f86154a = title;
            this.f86155b = items;
            this.f86156c = analyticsContextId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SeeAll)) {
                return false;
            }
            SeeAll seeAll = (SeeAll) obj2;
            return Intrinsics.f(this.f86154a, seeAll.f86154a) && Intrinsics.f(this.f86155b, seeAll.f86155b) && Intrinsics.f(this.f86156c, seeAll.f86156c);
        }

        public final int hashCode() {
            return this.f86156c.hashCode() + p.a.d(this.f86154a.hashCode() * 31, 31, this.f86155b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f86154a, i);
            Iterator itV = p.a.v(this.f86155b, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeString(this.f86156c);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/extension/HelpWidgetParcel$Support;", "Lcom/revolut/feature/shared/help_centre/impl/extension/HelpWidgetParcel;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Support implements HelpWidgetParcel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Support f86157a = new Support();

        @NotNull
        public static final Parcelable.Creator<Support> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Support.f86157a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Support[i];
            }
        }

        private Support() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof Support);
        }

        public final int hashCode() {
            return -889493086;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }
}
