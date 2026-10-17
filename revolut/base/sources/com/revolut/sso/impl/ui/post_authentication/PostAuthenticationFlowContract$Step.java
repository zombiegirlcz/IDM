package com.revolut.sso.impl.ui.post_authentication;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.sso.impl.ui.country_selection.CountrySelectionScreenContract$InputData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/sso/impl/ui/post_authentication/PostAuthenticationFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "CountrySelection", "Lcom/revolut/sso/impl/ui/post_authentication/PostAuthenticationFlowContract$Step$CountrySelection;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PostAuthenticationFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/post_authentication/PostAuthenticationFlowContract$Step$CountrySelection;", "Lcom/revolut/sso/impl/ui/post_authentication/PostAuthenticationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CountrySelection implements PostAuthenticationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CountrySelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CountrySelectionScreenContract$InputData f106680a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CountrySelection(CountrySelectionScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CountrySelection[i];
            }
        }

        public CountrySelection(CountrySelectionScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f106680a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CountrySelection) && Intrinsics.f(this.f106680a, ((CountrySelection) obj2).f106680a);
        }

        public final int hashCode() {
            return this.f106680a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f106680a.writeToParcel(dest, i);
        }
    }
}
