package com.revolut.feature.credit.application.plugins.impl.ui.address.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import cu3.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/address/flow/CreditAddressFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Main", "Search", "Lcom/revolut/feature/credit/application/plugins/impl/ui/address/flow/CreditAddressFlowContract$Step$Main;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/address/flow/CreditAddressFlowContract$Step$Search;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditAddressFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/address/flow/CreditAddressFlowContract$Step$Main;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/address/flow/CreditAddressFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Main implements CreditAddressFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Main> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f66948a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Main(e.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Main[i];
            }
        }

        public Main(e addressType) {
            Intrinsics.checkNotNullParameter(addressType, "addressType");
            this.f66948a = addressType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Main) && this.f66948a == ((Main) obj2).f66948a;
        }

        public final int hashCode() {
            return this.f66948a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f66948a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/address/flow/CreditAddressFlowContract$Step$Search;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/address/flow/CreditAddressFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Search implements CreditAddressFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Search> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f66949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f66950b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Search(parcel.readString(), e.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Search[i];
            }
        }

        public Search(String predefinedPostcode, e addressType) {
            Intrinsics.checkNotNullParameter(predefinedPostcode, "predefinedPostcode");
            Intrinsics.checkNotNullParameter(addressType, "addressType");
            this.f66949a = predefinedPostcode;
            this.f66950b = addressType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Search)) {
                return false;
            }
            Search search = (Search) obj2;
            return Intrinsics.f(this.f66949a, search.f66949a) && this.f66950b == search.f66950b;
        }

        public final int hashCode() {
            return this.f66950b.hashCode() + (this.f66949a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f66949a);
            dest.writeString(this.f66950b.name());
        }
    }
}
