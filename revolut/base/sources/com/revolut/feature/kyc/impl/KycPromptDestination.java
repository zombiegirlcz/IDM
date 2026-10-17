package com.revolut.feature.kyc.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z9h.n;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/kyc/impl/KycPromptDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "Pending", "Failed", "Lcom/revolut/feature/kyc/impl/KycPromptDestination$Failed;", "Lcom/revolut/feature/kyc/impl/KycPromptDestination$Pending;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface KycPromptDestination extends KompotDestination {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/impl/KycPromptDestination$Failed;", "Lcom/revolut/feature/kyc/impl/KycPromptDestination;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Failed implements KycPromptDestination {

        @NotNull
        public static final Parcelable.Creator<Failed> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f77533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f77534b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f77535c;
        public final Clause d;
        public final Clause e;
        public final NaviCommand f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final NaviCommand f77536g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final AnalyticsProduct f77537h;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Failed((Clause) parcel.readParcelable(Failed.class.getClassLoader()), (Clause) parcel.readParcelable(Failed.class.getClassLoader()), parcel.readString(), (Clause) parcel.readParcelable(Failed.class.getClassLoader()), (Clause) parcel.readParcelable(Failed.class.getClassLoader()), (NaviCommand) parcel.readParcelable(Failed.class.getClassLoader()), (NaviCommand) parcel.readParcelable(Failed.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(Failed.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Failed[i];
            }
        }

        public Failed(Clause title, Clause clause, String illustrationId, Clause primaryActionLabel, Clause clause2, NaviCommand primaryActionCommand, NaviCommand naviCommand, AnalyticsProduct analyticsProduct) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(illustrationId, "illustrationId");
            Intrinsics.checkNotNullParameter(primaryActionLabel, "primaryActionLabel");
            Intrinsics.checkNotNullParameter(primaryActionCommand, "primaryActionCommand");
            Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
            this.f77533a = title;
            this.f77534b = clause;
            this.f77535c = illustrationId;
            this.d = primaryActionLabel;
            this.e = clause2;
            this.f = primaryActionCommand;
            this.f77536g = naviCommand;
            this.f77537h = analyticsProduct;
        }

        @Override // com.revolut.feature.kyc.impl.KycPromptDestination
        /* JADX INFO: renamed from: E9, reason: from getter */
        public final NaviCommand getD() {
            return this.f;
        }

        @Override // com.revolut.feature.kyc.impl.KycPromptDestination
        /* JADX INFO: renamed from: G, reason: from getter */
        public final Clause getF77538a() {
            return this.f77533a;
        }

        @Override // com.revolut.feature.kyc.impl.KycPromptDestination
        /* JADX INFO: renamed from: M8, reason: from getter */
        public final Clause getF77539b() {
            return this.f77534b;
        }

        @Override // com.revolut.feature.kyc.impl.KycPromptDestination
        /* JADX INFO: renamed from: P, reason: from getter */
        public final AnalyticsProduct getE() {
            return this.f77537h;
        }

        @Override // com.revolut.feature.kyc.impl.KycPromptDestination
        /* JADX INFO: renamed from: U9, reason: from getter */
        public final Clause getF77540c() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Failed)) {
                return false;
            }
            Failed failed = (Failed) obj2;
            return Intrinsics.f(this.f77533a, failed.f77533a) && Intrinsics.f(this.f77534b, failed.f77534b) && Intrinsics.f(this.f77535c, failed.f77535c) && Intrinsics.f(this.d, failed.d) && Intrinsics.f(this.e, failed.e) && Intrinsics.f(this.f, failed.f) && Intrinsics.f(this.f77536g, failed.f77536g) && Intrinsics.f(this.f77537h, failed.f77537h);
        }

        public final int hashCode() {
            int iHashCode = this.f77533a.hashCode() * 31;
            Clause clause = this.f77534b;
            int iA = p.a.a(p.a.c((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f77535c), 31, this.d);
            Clause clause2 = this.e;
            int iA2 = n.a(this.f, (iA + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31);
            NaviCommand naviCommand = this.f77536g;
            return this.f77537h.hashCode() + ((iA2 + (naviCommand != null ? naviCommand.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f77533a, i);
            dest.writeParcelable(this.f77534b, i);
            dest.writeString(this.f77535c);
            dest.writeParcelable(this.d, i);
            dest.writeParcelable(this.e, i);
            dest.writeParcelable(this.f, i);
            dest.writeParcelable(this.f77536g, i);
            dest.writeParcelable(this.f77537h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/impl/KycPromptDestination$Pending;", "Lcom/revolut/feature/kyc/impl/KycPromptDestination;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Pending implements KycPromptDestination {

        @NotNull
        public static final Parcelable.Creator<Pending> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f77538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f77539b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f77540c;
        public final NaviCommand d;
        public final AnalyticsProduct e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Pending((Clause) parcel.readParcelable(Pending.class.getClassLoader()), (Clause) parcel.readParcelable(Pending.class.getClassLoader()), (Clause) parcel.readParcelable(Pending.class.getClassLoader()), (NaviCommand) parcel.readParcelable(Pending.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(Pending.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pending[i];
            }
        }

        public Pending(Clause title, Clause clause, Clause primaryActionLabel, NaviCommand primaryActionCommand, AnalyticsProduct analyticsProduct) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(primaryActionLabel, "primaryActionLabel");
            Intrinsics.checkNotNullParameter(primaryActionCommand, "primaryActionCommand");
            Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
            this.f77538a = title;
            this.f77539b = clause;
            this.f77540c = primaryActionLabel;
            this.d = primaryActionCommand;
            this.e = analyticsProduct;
        }

        @Override // com.revolut.feature.kyc.impl.KycPromptDestination
        /* JADX INFO: renamed from: E9, reason: from getter */
        public final NaviCommand getD() {
            return this.d;
        }

        @Override // com.revolut.feature.kyc.impl.KycPromptDestination
        /* JADX INFO: renamed from: G, reason: from getter */
        public final Clause getF77538a() {
            return this.f77538a;
        }

        @Override // com.revolut.feature.kyc.impl.KycPromptDestination
        /* JADX INFO: renamed from: M8, reason: from getter */
        public final Clause getF77539b() {
            return this.f77539b;
        }

        @Override // com.revolut.feature.kyc.impl.KycPromptDestination
        /* JADX INFO: renamed from: P, reason: from getter */
        public final AnalyticsProduct getE() {
            return this.e;
        }

        @Override // com.revolut.feature.kyc.impl.KycPromptDestination
        /* JADX INFO: renamed from: U9, reason: from getter */
        public final Clause getF77540c() {
            return this.f77540c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Pending)) {
                return false;
            }
            Pending pending = (Pending) obj2;
            return Intrinsics.f(this.f77538a, pending.f77538a) && Intrinsics.f(this.f77539b, pending.f77539b) && Intrinsics.f(this.f77540c, pending.f77540c) && Intrinsics.f(this.d, pending.d) && Intrinsics.f(this.e, pending.e);
        }

        public final int hashCode() {
            int iHashCode = this.f77538a.hashCode() * 31;
            Clause clause = this.f77539b;
            return this.e.hashCode() + n.a(this.d, p.a.a((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f77540c), 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f77538a, i);
            dest.writeParcelable(this.f77539b, i);
            dest.writeParcelable(this.f77540c, i);
            dest.writeParcelable(this.d, i);
            dest.writeParcelable(this.e, i);
        }
    }

    /* JADX INFO: renamed from: E9 */
    NaviCommand getD();

    /* JADX INFO: renamed from: G */
    Clause getF77538a();

    /* JADX INFO: renamed from: M8 */
    Clause getF77539b();

    /* JADX INFO: renamed from: P */
    AnalyticsProduct getE();

    /* JADX INFO: renamed from: U9 */
    Clause getF77540c();
}
