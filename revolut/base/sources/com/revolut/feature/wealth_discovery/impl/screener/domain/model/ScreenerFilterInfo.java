package com.revolut.feature.wealth_discovery.impl.screener.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/screener/domain/model/ScreenerFilterInfo;", "Landroid/os/Parcelable;", "Dialog", "Destination", "Lcom/revolut/feature/wealth_discovery/impl/screener/domain/model/ScreenerFilterInfo$Destination;", "Lcom/revolut/feature/wealth_discovery/impl/screener/domain/model/ScreenerFilterInfo$Dialog;", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ScreenerFilterInfo extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/screener/domain/model/ScreenerFilterInfo$Destination;", "Lcom/revolut/feature/wealth_discovery/impl/screener/domain/model/ScreenerFilterInfo;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/wealth_discovery/impl/screener/domain/model/a", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Destination implements ScreenerFilterInfo {

        @NotNull
        public static final Parcelable.Creator<Destination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.revolut.feature.wealth_discovery.impl.screener.domain.model.a f96158a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Destination(com.revolut.feature.wealth_discovery.impl.screener.domain.model.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Destination[i];
            }
        }

        public Destination(com.revolut.feature.wealth_discovery.impl.screener.domain.model.a type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f96158a = type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Destination) && this.f96158a == ((Destination) obj2).f96158a;
        }

        public final int hashCode() {
            return this.f96158a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f96158a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/screener/domain/model/ScreenerFilterInfo$Dialog;", "Lcom/revolut/feature/wealth_discovery/impl/screener/domain/model/ScreenerFilterInfo;", "", "toString", "()Ljava/lang/String;", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Dialog implements ScreenerFilterInfo {

        @NotNull
        public static final Parcelable.Creator<Dialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f96159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f96160b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f96161c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Dialog((Clause) parcel.readParcelable(Dialog.class.getClassLoader()), (Clause) parcel.readParcelable(Dialog.class.getClassLoader()), (Clause) parcel.readParcelable(Dialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Dialog[i];
            }
        }

        public Dialog(Clause title, Clause description, Clause clause) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            this.f96159a = title;
            this.f96160b = description;
            this.f96161c = clause;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Dialog)) {
                return false;
            }
            Dialog dialog = (Dialog) obj2;
            return Intrinsics.f(this.f96159a, dialog.f96159a) && Intrinsics.f(this.f96160b, dialog.f96160b) && Intrinsics.f(this.f96161c, dialog.f96161c);
        }

        public final int hashCode() {
            int iA = p.a.a(this.f96159a.hashCode() * 31, 31, this.f96160b);
            Clause clause = this.f96161c;
            return iA + (clause == null ? 0 : clause.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f96159a, i);
            dest.writeParcelable(this.f96160b, i);
            dest.writeParcelable(this.f96161c, i);
        }

        public /* synthetic */ Dialog(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2) {
            this(textLocalisedClause, textLocalisedClause2, null);
        }
    }
}
