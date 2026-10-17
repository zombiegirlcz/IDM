package com.revolut.feature.profile.impl.ui.documents_redesigned;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.core.model.domain.wallet.WalletId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/documents_redesigned/YearlyStatementsRequest;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class YearlyStatementsRequest implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<YearlyStatementsRequest> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f81411b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            WalletId walletId = (WalletId) parcel.readParcelable(YearlyStatementsRequest.class.getClassLoader());
            return new YearlyStatementsRequest(walletId != null ? walletId.f66106a : null, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new YearlyStatementsRequest[i];
        }
    }

    public YearlyStatementsRequest(String str, int i) {
        this.f81410a = str;
        this.f81411b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.revolut.feature.profile.impl.ui.documents_redesigned.YearlyStatementsRequest
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.revolut.feature.profile.impl.ui.documents_redesigned.YearlyStatementsRequest r5 = (com.revolut.feature.profile.impl.ui.documents_redesigned.YearlyStatementsRequest) r5
            java.lang.String r1 = r5.f81410a
            java.lang.String r3 = r4.f81410a
            if (r3 != 0) goto L18
            if (r1 != 0) goto L16
            r1 = r0
            goto L1f
        L16:
            r1 = r2
            goto L1f
        L18:
            if (r1 != 0) goto L1b
            goto L16
        L1b:
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r3, r1)
        L1f:
            if (r1 != 0) goto L22
            return r2
        L22:
            int r1 = r4.f81411b
            int r5 = r5.f81411b
            if (r1 == r5) goto L29
            return r2
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.profile.impl.ui.documents_redesigned.YearlyStatementsRequest.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f81410a;
        return Integer.hashCode(this.f81411b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        String str = this.f81410a;
        dest.writeParcelable(str != null ? new WalletId(str) : null, i);
        dest.writeInt(this.f81411b);
    }
}
