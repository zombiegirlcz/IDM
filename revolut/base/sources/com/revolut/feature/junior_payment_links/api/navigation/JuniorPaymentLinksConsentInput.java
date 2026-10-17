package com.revolut.feature.junior_payment_links.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_payment_links/api/navigation/JuniorPaymentLinksConsentInput;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_junior_payment_links_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorPaymentLinksConsentInput implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<JuniorPaymentLinksConsentInput> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f77077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f77078c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JuniorPaymentLinksConsentInput(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorPaymentLinksConsentInput[i];
        }
    }

    public JuniorPaymentLinksConsentInput(String juniorId, String firstName, String username, boolean z) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(username, "username");
        this.f77076a = juniorId;
        this.f77077b = z;
        this.f77078c = firstName;
        this.d = username;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JuniorPaymentLinksConsentInput)) {
            return false;
        }
        JuniorPaymentLinksConsentInput juniorPaymentLinksConsentInput = (JuniorPaymentLinksConsentInput) obj2;
        return Intrinsics.f(this.f77076a, juniorPaymentLinksConsentInput.f77076a) && this.f77077b == juniorPaymentLinksConsentInput.f77077b && Intrinsics.f(this.f77078c, juniorPaymentLinksConsentInput.f77078c) && Intrinsics.f(this.d, juniorPaymentLinksConsentInput.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(j6.a.c(this.f77076a.hashCode() * 31, 31, this.f77077b), 31, this.f77078c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f77076a);
        dest.writeInt(this.f77077b ? 1 : 0);
        dest.writeString(this.f77078c);
        dest.writeString(this.d);
    }
}
