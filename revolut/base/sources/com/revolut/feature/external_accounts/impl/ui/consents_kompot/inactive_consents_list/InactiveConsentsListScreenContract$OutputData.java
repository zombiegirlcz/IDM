package com.revolut.feature.external_accounts.impl.ui.consents_kompot.inactive_consents_list;

import aii.r;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.openbanking.OpenBankingConsent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/consents_kompot/inactive_consents_list/InactiveConsentsListScreenContract$OutputData", "Laii/r;", "Landroid/os/Parcelable;", "<init>", "()V", "ConsentClicked", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/inactive_consents_list/InactiveConsentsListScreenContract$OutputData$ConsentClicked;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class InactiveConsentsListScreenContract$OutputData implements r, Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/inactive_consents_list/InactiveConsentsListScreenContract$OutputData$ConsentClicked;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/inactive_consents_list/InactiveConsentsListScreenContract$OutputData;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConsentClicked extends InactiveConsentsListScreenContract$OutputData {

        @NotNull
        public static final Parcelable.Creator<ConsentClicked> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OpenBankingConsent f72790a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ConsentClicked((OpenBankingConsent) parcel.readParcelable(ConsentClicked.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConsentClicked[i];
            }
        }

        public ConsentClicked(OpenBankingConsent consent) {
            Intrinsics.checkNotNullParameter(consent, "consent");
            this.f72790a = consent;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ConsentClicked) && Intrinsics.f(this.f72790a, ((ConsentClicked) obj2).f72790a);
        }

        public final int hashCode() {
            return this.f72790a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f72790a, i);
        }
    }

    private InactiveConsentsListScreenContract$OutputData() {
    }
}
