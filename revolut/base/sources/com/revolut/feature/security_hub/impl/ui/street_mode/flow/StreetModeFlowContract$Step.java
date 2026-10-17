package com.revolut.feature.security_hub.impl.ui.street_mode.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.security_hub.api.models.StreetModeTrustedLocation;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"com/revolut/feature/security_hub/impl/ui/street_mode/flow/StreetModeFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "SetTrustedLocation", "SetTrustedWifiLocation", "EditTrustedLocation", "SearchLocationScreen", "NameLocation", "StreetModeProductArticle", "TrustedLocationsList", "TrustedWifisList", "Lcom/revolut/feature/security_hub/impl/ui/street_mode/flow/StreetModeFlowContract$Step$EditTrustedLocation;", "Lcom/revolut/feature/security_hub/impl/ui/street_mode/flow/StreetModeFlowContract$Step$NameLocation;", "Lcom/revolut/feature/security_hub/impl/ui/street_mode/flow/StreetModeFlowContract$Step$SearchLocationScreen;", "Lcom/revolut/feature/security_hub/impl/ui/street_mode/flow/StreetModeFlowContract$Step$SetTrustedLocation;", "Lcom/revolut/feature/security_hub/impl/ui/street_mode/flow/StreetModeFlowContract$Step$SetTrustedWifiLocation;", "Lcom/revolut/feature/security_hub/impl/ui/street_mode/flow/StreetModeFlowContract$Step$StreetModeProductArticle;", "Lcom/revolut/feature/security_hub/impl/ui/street_mode/flow/StreetModeFlowContract$Step$TrustedLocationsList;", "Lcom/revolut/feature/security_hub/impl/ui/street_mode/flow/StreetModeFlowContract$Step$TrustedWifisList;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface StreetModeFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/street_mode/flow/StreetModeFlowContract$Step$EditTrustedLocation;", "Lcom/revolut/feature/security_hub/impl/ui/street_mode/flow/StreetModeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditTrustedLocation implements StreetModeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EditTrustedLocation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StreetModeTrustedLocation f85656a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditTrustedLocation((StreetModeTrustedLocation) parcel.readParcelable(EditTrustedLocation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditTrustedLocation[i];
            }
        }

        public EditTrustedLocation(StreetModeTrustedLocation trustedLocation) {
            Intrinsics.checkNotNullParameter(trustedLocation, "trustedLocation");
            this.f85656a = trustedLocation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EditTrustedLocation) && Intrinsics.f(this.f85656a, ((EditTrustedLocation) obj2).f85656a);
        }

        public final int hashCode() {
            return this.f85656a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f85656a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/street_mode/flow/StreetModeFlowContract$Step$NameLocation;", "Lcom/revolut/feature/security_hub/impl/ui/street_mode/flow/StreetModeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NameLocation implements StreetModeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<NameLocation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocationDomain f85658b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f85659c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NameLocation(parcel.readString(), (LocationDomain) parcel.readParcelable(NameLocation.class.getClassLoader()), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NameLocation[i];
            }
        }

        public NameLocation(String str, LocationDomain location, int i) {
            Intrinsics.checkNotNullParameter(location, "location");
            this.f85657a = str;
            this.f85658b = location;
            this.f85659c = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NameLocation)) {
                return false;
            }
            NameLocation nameLocation = (NameLocation) obj2;
            return Intrinsics.f(this.f85657a, nameLocation.f85657a) && Intrinsics.f(this.f85658b, nameLocation.f85658b) && this.f85659c == nameLocation.f85659c;
        }

        public final int hashCode() {
            String str = this.f85657a;
            return Integer.hashCode(this.f85659c) + ((this.f85658b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85657a);
            dest.writeParcelable(this.f85658b, i);
            dest.writeInt(this.f85659c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/street_mode/flow/StreetModeFlowContract$Step$SearchLocationScreen;", "Lcom/revolut/feature/security_hub/impl/ui/street_mode/flow/StreetModeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SearchLocationScreen implements StreetModeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SearchLocationScreen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85660a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SearchLocationScreen(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SearchLocationScreen[i];
            }
        }

        public SearchLocationScreen(String countryCode) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f85660a = countryCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SearchLocationScreen) && Intrinsics.f(this.f85660a, ((SearchLocationScreen) obj2).f85660a);
        }

        public final int hashCode() {
            return this.f85660a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85660a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/street_mode/flow/StreetModeFlowContract$Step$SetTrustedLocation;", "Lcom/revolut/feature/security_hub/impl/ui/street_mode/flow/StreetModeFlowContract$Step;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SetTrustedLocation implements StreetModeFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SetTrustedLocation f85661a = new SetTrustedLocation();

        @NotNull
        public static final Parcelable.Creator<SetTrustedLocation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SetTrustedLocation.f85661a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SetTrustedLocation[i];
            }
        }

        private SetTrustedLocation() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/street_mode/flow/StreetModeFlowContract$Step$SetTrustedWifiLocation;", "Lcom/revolut/feature/security_hub/impl/ui/street_mode/flow/StreetModeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SetTrustedWifiLocation implements StreetModeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SetTrustedWifiLocation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85662a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SetTrustedWifiLocation(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SetTrustedWifiLocation[i];
            }
        }

        public SetTrustedWifiLocation(String ssid) {
            Intrinsics.checkNotNullParameter(ssid, "ssid");
            this.f85662a = ssid;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SetTrustedWifiLocation) && Intrinsics.f(this.f85662a, ((SetTrustedWifiLocation) obj2).f85662a);
        }

        public final int hashCode() {
            return this.f85662a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85662a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/street_mode/flow/StreetModeFlowContract$Step$StreetModeProductArticle;", "Lcom/revolut/feature/security_hub/impl/ui/street_mode/flow/StreetModeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StreetModeProductArticle implements StreetModeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<StreetModeProductArticle> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductArticleParams f85663a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StreetModeProductArticle((ProductArticleParams) parcel.readParcelable(StreetModeProductArticle.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StreetModeProductArticle[i];
            }
        }

        public StreetModeProductArticle(ProductArticleParams params) {
            Intrinsics.checkNotNullParameter(params, "params");
            this.f85663a = params;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof StreetModeProductArticle) && Intrinsics.f(this.f85663a, ((StreetModeProductArticle) obj2).f85663a);
        }

        public final int hashCode() {
            return this.f85663a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f85663a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/street_mode/flow/StreetModeFlowContract$Step$TrustedLocationsList;", "Lcom/revolut/feature/security_hub/impl/ui/street_mode/flow/StreetModeFlowContract$Step;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TrustedLocationsList implements StreetModeFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TrustedLocationsList f85664a = new TrustedLocationsList();

        @NotNull
        public static final Parcelable.Creator<TrustedLocationsList> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TrustedLocationsList.f85664a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TrustedLocationsList[i];
            }
        }

        private TrustedLocationsList() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/street_mode/flow/StreetModeFlowContract$Step$TrustedWifisList;", "Lcom/revolut/feature/security_hub/impl/ui/street_mode/flow/StreetModeFlowContract$Step;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TrustedWifisList implements StreetModeFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TrustedWifisList f85665a = new TrustedWifisList();

        @NotNull
        public static final Parcelable.Creator<TrustedWifisList> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TrustedWifisList.f85665a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TrustedWifisList[i];
            }
        }

        private TrustedWifisList() {
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
