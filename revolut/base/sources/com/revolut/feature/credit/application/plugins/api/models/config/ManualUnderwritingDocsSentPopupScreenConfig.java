package com.revolut.feature.credit.application.plugins.api.models.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/ManualUnderwritingDocsSentPopupScreenConfig;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/ScreenConfig;", "<init>", "()V", "RequestSent", "DocsInReview", "Lcom/revolut/feature/credit/application/plugins/api/models/config/ManualUnderwritingDocsSentPopupScreenConfig$DocsInReview;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/ManualUnderwritingDocsSentPopupScreenConfig$RequestSent;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ManualUnderwritingDocsSentPopupScreenConfig extends ScreenConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/ManualUnderwritingDocsSentPopupScreenConfig$DocsInReview;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/ManualUnderwritingDocsSentPopupScreenConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocsInReview extends ManualUnderwritingDocsSentPopupScreenConfig {

        @NotNull
        public static final Parcelable.Creator<DocsInReview> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f66366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f66367b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocsInReview((Clause) parcel.readParcelable(DocsInReview.class.getClassLoader()), (Clause) parcel.readParcelable(DocsInReview.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocsInReview[i];
            }
        }

        public DocsInReview(Clause title, Clause description) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            this.f66366a = title;
            this.f66367b = description;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DocsInReview)) {
                return false;
            }
            DocsInReview docsInReview = (DocsInReview) obj2;
            return Intrinsics.f(this.f66366a, docsInReview.f66366a) && Intrinsics.f(this.f66367b, docsInReview.f66367b);
        }

        public final int hashCode() {
            return this.f66367b.hashCode() + (this.f66366a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66366a, i);
            dest.writeParcelable(this.f66367b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/ManualUnderwritingDocsSentPopupScreenConfig$RequestSent;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/ManualUnderwritingDocsSentPopupScreenConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RequestSent extends ManualUnderwritingDocsSentPopupScreenConfig {

        @NotNull
        public static final Parcelable.Creator<RequestSent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f66368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f66369b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f66370c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RequestSent((Clause) parcel.readParcelable(RequestSent.class.getClassLoader()), (Clause) parcel.readParcelable(RequestSent.class.getClassLoader()), (Clause) parcel.readParcelable(RequestSent.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RequestSent[i];
            }
        }

        public RequestSent(Clause title, Clause description, Clause primaryButtonText) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
            this.f66368a = title;
            this.f66369b = description;
            this.f66370c = primaryButtonText;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RequestSent)) {
                return false;
            }
            RequestSent requestSent = (RequestSent) obj2;
            return Intrinsics.f(this.f66368a, requestSent.f66368a) && Intrinsics.f(this.f66369b, requestSent.f66369b) && Intrinsics.f(this.f66370c, requestSent.f66370c);
        }

        public final int hashCode() {
            return this.f66370c.hashCode() + p.a.a(this.f66368a.hashCode() * 31, 31, this.f66369b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66368a, i);
            dest.writeParcelable(this.f66369b, i);
            dest.writeParcelable(this.f66370c, i);
        }
    }

    private ManualUnderwritingDocsSentPopupScreenConfig() {
    }
}
