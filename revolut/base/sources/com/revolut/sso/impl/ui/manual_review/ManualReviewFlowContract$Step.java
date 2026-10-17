package com.revolut.sso.impl.ui.manual_review;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.sso.impl.domain.models.AuthResult;
import ehe.n;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import jkl.a3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/sso/impl/ui/manual_review/ManualReviewFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ReviewAwaiting", "AuthCancellation", "ReviewPassed", "ReviewRejected", "Lcom/revolut/sso/impl/ui/manual_review/ManualReviewFlowContract$Step$AuthCancellation;", "Lcom/revolut/sso/impl/ui/manual_review/ManualReviewFlowContract$Step$ReviewAwaiting;", "Lcom/revolut/sso/impl/ui/manual_review/ManualReviewFlowContract$Step$ReviewPassed;", "Lcom/revolut/sso/impl/ui/manual_review/ManualReviewFlowContract$Step$ReviewRejected;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ManualReviewFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/manual_review/ManualReviewFlowContract$Step$AuthCancellation;", "Lcom/revolut/sso/impl/ui/manual_review/ManualReviewFlowContract$Step;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AuthCancellation extends ManualReviewFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AuthCancellation f106574a = new AuthCancellation();

        @NotNull
        public static final Parcelable.Creator<AuthCancellation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AuthCancellation.f106574a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AuthCancellation[i];
            }
        }

        private AuthCancellation() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/manual_review/ManualReviewFlowContract$Step$ReviewAwaiting;", "Lcom/revolut/sso/impl/ui/manual_review/ManualReviewFlowContract$Step;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ReviewAwaiting extends ManualReviewFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ReviewAwaiting f106575a = new ReviewAwaiting();

        @NotNull
        public static final Parcelable.Creator<ReviewAwaiting> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ReviewAwaiting.f106575a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReviewAwaiting[i];
            }
        }

        private ReviewAwaiting() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/manual_review/ManualReviewFlowContract$Step$ReviewPassed;", "Lcom/revolut/sso/impl/ui/manual_review/ManualReviewFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReviewPassed extends ManualReviewFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ReviewPassed> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AuthResult f106576a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ReviewPassed((AuthResult) parcel.readParcelable(ReviewPassed.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReviewPassed[i];
            }
        }

        public ReviewPassed(AuthResult authResult) {
            Intrinsics.checkNotNullParameter(authResult, "authResult");
            this.f106576a = authResult;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ReviewPassed) && Intrinsics.f(this.f106576a, ((ReviewPassed) obj2).f106576a);
        }

        public final int hashCode() {
            return this.f106576a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f106576a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/manual_review/ManualReviewFlowContract$Step$ReviewRejected;", "Lcom/revolut/sso/impl/ui/manual_review/ManualReviewFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReviewRejected extends ManualReviewFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ReviewRejected> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ZonedDateTime f106577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f106578b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                ZonedDateTime zonedDateTime = (ZonedDateTime) parcel.readSerializable();
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet.add(a3.valueOf(parcel.readString()));
                }
                return new ReviewRejected(zonedDateTime, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReviewRejected[i];
            }
        }

        public ReviewRejected(ZonedDateTime zonedDateTime, Set actions) {
            Intrinsics.checkNotNullParameter(actions, "actions");
            this.f106577a = zonedDateTime;
            this.f106578b = actions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ReviewRejected)) {
                return false;
            }
            ReviewRejected reviewRejected = (ReviewRejected) obj2;
            return Intrinsics.f(this.f106577a, reviewRejected.f106577a) && Intrinsics.f(this.f106578b, reviewRejected.f106578b);
        }

        public final int hashCode() {
            ZonedDateTime zonedDateTime = this.f106577a;
            return this.f106578b.hashCode() + ((zonedDateTime == null ? 0 : zonedDateTime.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f106577a);
            Iterator itV = n.v(this.f106578b, dest);
            while (itV.hasNext()) {
                dest.writeString(((a3) itV.next()).name());
            }
        }
    }

    private ManualReviewFlowContract$Step() {
    }
}
