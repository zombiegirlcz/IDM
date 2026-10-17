package com.revolut.feature.credit.application.plugins.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.models.config.KontomatikPopupScreenConfig;
import hs3.e0;
import ju3.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/KontomatikIncomeCheckEntryPoint;", "Landroid/os/Parcelable;", "<init>", "()V", "Default", "Popup", "Lcom/revolut/feature/credit/application/plugins/api/navigation/KontomatikIncomeCheckEntryPoint$Default;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/KontomatikIncomeCheckEntryPoint$Popup;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class KontomatikIncomeCheckEntryPoint implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/KontomatikIncomeCheckEntryPoint$Default;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/KontomatikIncomeCheckEntryPoint;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Default extends KontomatikIncomeCheckEntryPoint {

        @NotNull
        public static final Parcelable.Creator<Default> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e0 f66888a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Default((e0) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Default[i];
            }
        }

        public Default(e0 metadata) {
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            this.f66888a = metadata;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Default) && Intrinsics.f(this.f66888a, ((Default) obj2).f66888a);
        }

        public final int hashCode() {
            return this.f66888a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f66888a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/KontomatikIncomeCheckEntryPoint$Popup;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/KontomatikIncomeCheckEntryPoint;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Popup extends KontomatikIncomeCheckEntryPoint {

        @NotNull
        public static final Parcelable.Creator<Popup> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final KontomatikPopupScreenConfig f66889a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g f66890b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Popup(KontomatikPopupScreenConfig.CREATOR.createFromParcel(parcel), g.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Popup[i];
            }
        }

        public Popup(KontomatikPopupScreenConfig config, g popupType) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(popupType, "popupType");
            this.f66889a = config;
            this.f66890b = popupType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Popup)) {
                return false;
            }
            Popup popup = (Popup) obj2;
            return Intrinsics.f(this.f66889a, popup.f66889a) && this.f66890b == popup.f66890b;
        }

        public final int hashCode() {
            return this.f66890b.hashCode() + (this.f66889a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66889a.writeToParcel(dest, i);
            dest.writeString(this.f66890b.name());
        }
    }

    private KontomatikIncomeCheckEntryPoint() {
    }
}
