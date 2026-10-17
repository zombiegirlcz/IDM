package com.revolut.feature.apm.bizum.impl.ui.transfer.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.bizum.BizumTransferInfo;
import com.revolut.feature.apm.core.models.recipients.BizumContact;
import com.revolut.feature.apm.core.models.transfers.money_requests.BizumMoneyRequestInfo;
import hrf.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/bizum/impl/ui/transfer/transfer/BizumTransferReviewInfo;", "Landroid/os/Parcelable;", "Send", "Request", "Lcom/revolut/feature/apm/bizum/impl/ui/transfer/transfer/BizumTransferReviewInfo$Request;", "Lcom/revolut/feature/apm/bizum/impl/ui/transfer/transfer/BizumTransferReviewInfo$Send;", "feature_apm_bizum_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BizumTransferReviewInfo extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bizum/impl/ui/transfer/transfer/BizumTransferReviewInfo$Request;", "Lcom/revolut/feature/apm/bizum/impl/ui/transfer/transfer/BizumTransferReviewInfo;", "", "toString", "()Ljava/lang/String;", "feature_apm_bizum_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Request implements BizumTransferReviewInfo {

        @NotNull
        public static final Parcelable.Creator<Request> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BizumMoneyRequestInfo f61634a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Request((BizumMoneyRequestInfo) parcel.readParcelable(Request.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Request[i];
            }
        }

        public Request(BizumMoneyRequestInfo info) {
            Intrinsics.checkNotNullParameter(info, "info");
            this.f61634a = info;
        }

        @Override // com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferReviewInfo
        public final BizumContact B8() {
            return this.f61634a.f62187b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Request) && Intrinsics.f(this.f61634a, ((Request) obj2).f61634a);
        }

        public final int hashCode() {
            return this.f61634a.hashCode();
        }

        @Override // com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferReviewInfo
        public final f k() {
            return f.INCOMING;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f61634a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bizum/impl/ui/transfer/transfer/BizumTransferReviewInfo$Send;", "Lcom/revolut/feature/apm/bizum/impl/ui/transfer/transfer/BizumTransferReviewInfo;", "", "toString", "()Ljava/lang/String;", "feature_apm_bizum_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Send implements BizumTransferReviewInfo {

        @NotNull
        public static final Parcelable.Creator<Send> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BizumTransferInfo f61635a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Send((BizumTransferInfo) parcel.readParcelable(Send.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Send[i];
            }
        }

        public Send(BizumTransferInfo info) {
            Intrinsics.checkNotNullParameter(info, "info");
            this.f61635a = info;
        }

        @Override // com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferReviewInfo
        public final BizumContact B8() {
            return this.f61635a.f61923b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Send) && Intrinsics.f(this.f61635a, ((Send) obj2).f61635a);
        }

        public final int hashCode() {
            return this.f61635a.hashCode();
        }

        @Override // com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferReviewInfo
        public final f k() {
            return f.OUTGOING;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f61635a, i);
        }
    }

    BizumContact B8();

    f k();
}
