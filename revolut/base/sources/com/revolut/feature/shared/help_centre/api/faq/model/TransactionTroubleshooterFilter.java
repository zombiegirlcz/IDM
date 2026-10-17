package com.revolut.feature.shared.help_centre.api.faq.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/shared/help_centre/api/faq/model/TransactionTroubleshooterFilter;", "Landroid/os/Parcelable;", "None", "Cards", "Lcom/revolut/feature/shared/help_centre/api/faq/model/TransactionTroubleshooterFilter$Cards;", "Lcom/revolut/feature/shared/help_centre/api/faq/model/TransactionTroubleshooterFilter$None;", "feature_shared_help_centre_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransactionTroubleshooterFilter extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/api/faq/model/TransactionTroubleshooterFilter$Cards;", "Lcom/revolut/feature/shared/help_centre/api/faq/model/TransactionTroubleshooterFilter;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Cards implements TransactionTroubleshooterFilter {

        @NotNull
        public static final Parcelable.Creator<Cards> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f86142a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Cards(parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Cards[i];
            }
        }

        public Cards(List cardIds) {
            Intrinsics.checkNotNullParameter(cardIds, "cardIds");
            this.f86142a = cardIds;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Cards) && Intrinsics.f(this.f86142a, ((Cards) obj2).f86142a);
        }

        public final int hashCode() {
            return this.f86142a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeStringList(this.f86142a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/shared/help_centre/api/faq/model/TransactionTroubleshooterFilter$None;", "Lcom/revolut/feature/shared/help_centre/api/faq/model/TransactionTroubleshooterFilter;", "<init>", "()V", "feature_shared_help_centre_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class None implements TransactionTroubleshooterFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final None f86143a = new None();

        @NotNull
        public static final Parcelable.Creator<None> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return None.f86143a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new None[i];
            }
        }

        private None() {
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
}
