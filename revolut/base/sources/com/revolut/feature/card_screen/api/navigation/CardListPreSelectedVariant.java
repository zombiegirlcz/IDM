package com.revolut.feature.card_screen.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n63.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/card_screen/api/navigation/CardListPreSelectedVariant;", "Landroid/os/Parcelable;", "Tab", "DependingOnLastOpenAccount", "Lcom/revolut/feature/card_screen/api/navigation/CardListPreSelectedVariant$DependingOnLastOpenAccount;", "Lcom/revolut/feature/card_screen/api/navigation/CardListPreSelectedVariant$Tab;", "feature_card_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CardListPreSelectedVariant extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_screen/api/navigation/CardListPreSelectedVariant$DependingOnLastOpenAccount;", "Lcom/revolut/feature/card_screen/api/navigation/CardListPreSelectedVariant;", "", "toString", "()Ljava/lang/String;", "feature_card_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DependingOnLastOpenAccount implements CardListPreSelectedVariant {

        @NotNull
        public static final Parcelable.Creator<DependingOnLastOpenAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MainScreenTab f65343a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DependingOnLastOpenAccount((MainScreenTab) parcel.readParcelable(DependingOnLastOpenAccount.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DependingOnLastOpenAccount[i];
            }
        }

        public DependingOnLastOpenAccount(MainScreenTab mainScreenTab) {
            Intrinsics.checkNotNullParameter(mainScreenTab, "mainScreenTab");
            this.f65343a = mainScreenTab;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DependingOnLastOpenAccount) && Intrinsics.f(this.f65343a, ((DependingOnLastOpenAccount) obj2).f65343a);
        }

        public final int hashCode() {
            return this.f65343a.f83420a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f65343a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_screen/api/navigation/CardListPreSelectedVariant$Tab;", "Lcom/revolut/feature/card_screen/api/navigation/CardListPreSelectedVariant;", "", "toString", "()Ljava/lang/String;", "feature_card_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Tab implements CardListPreSelectedVariant {

        @NotNull
        public static final Parcelable.Creator<Tab> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f65344a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Tab(c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Tab[i];
            }
        }

        public Tab(c tab2) {
            Intrinsics.checkNotNullParameter(tab2, "tab");
            this.f65344a = tab2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Tab) && this.f65344a == ((Tab) obj2).f65344a;
        }

        public final int hashCode() {
            return this.f65344a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f65344a.name());
        }
    }
}
