package com.revolut.feature.card_management.impl.ui.replace_reasons;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wy2.d;

/* JADX INFO: loaded from: classes21.dex */
public final class CardSelectReplaceReasonContract {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ExplicitActivityDestination f64924a = new ExplicitActivityDestination(CardSelectReplaceReasonActivity.class);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_management/impl/ui/replace_reasons/CardSelectReplaceReasonContract$Configuration;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_card_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Configuration implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Configuration> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f64926b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Configuration(parcel.readString(), parcel.readInt() == 0 ? null : d.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Configuration[i];
            }
        }

        public Configuration(String cardId, d dVar) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            this.f64925a = cardId;
            this.f64926b = dVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) obj2;
            return Intrinsics.f(this.f64925a, configuration.f64925a) && this.f64926b == configuration.f64926b;
        }

        public final int hashCode() {
            int iHashCode = this.f64925a.hashCode() * 31;
            d dVar = this.f64926b;
            return iHashCode + (dVar == null ? 0 : dVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64925a);
            d dVar = this.f64926b;
            if (dVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(dVar.name());
            }
        }
    }

    public static final class a {
        private a() {
        }
    }
}
