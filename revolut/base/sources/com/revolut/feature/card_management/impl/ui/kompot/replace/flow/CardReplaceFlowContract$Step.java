package com.revolut.feature.card_management.impl.ui.kompot.replace.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/card_management/impl/ui/kompot/replace/flow/CardReplaceFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "SelectReason", "Expectations", "Lcom/revolut/feature/card_management/impl/ui/kompot/replace/flow/CardReplaceFlowContract$Step$Expectations;", "Lcom/revolut/feature/card_management/impl/ui/kompot/replace/flow/CardReplaceFlowContract$Step$SelectReason;", "feature_card_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CardReplaceFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_management/impl/ui/kompot/replace/flow/CardReplaceFlowContract$Step$Expectations;", "Lcom/revolut/feature/card_management/impl/ui/kompot/replace/flow/CardReplaceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_card_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Expectations implements CardReplaceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Expectations> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wy2.d f64886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f64887b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final NaviCommand f64888c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Expectations(wy2.d.valueOf(parcel.readString()), parcel.readString(), (NaviCommand) parcel.readParcelable(Expectations.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Expectations[i];
            }
        }

        public Expectations(wy2.d reason, String cardId, NaviCommand nextCommand) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            Intrinsics.checkNotNullParameter(nextCommand, "nextCommand");
            this.f64886a = reason;
            this.f64887b = cardId;
            this.f64888c = nextCommand;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Expectations)) {
                return false;
            }
            Expectations expectations = (Expectations) obj2;
            return this.f64886a == expectations.f64886a && Intrinsics.f(this.f64887b, expectations.f64887b) && Intrinsics.f(this.f64888c, expectations.f64888c);
        }

        public final int hashCode() {
            return this.f64888c.hashCode() + p.a.c(this.f64886a.hashCode() * 31, 31, this.f64887b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64886a.name());
            dest.writeString(this.f64887b);
            dest.writeParcelable(this.f64888c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_management/impl/ui/kompot/replace/flow/CardReplaceFlowContract$Step$SelectReason;", "Lcom/revolut/feature/card_management/impl/ui/kompot/replace/flow/CardReplaceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_card_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectReason implements CardReplaceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SelectReason> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64889a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectReason(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectReason[i];
            }
        }

        public SelectReason(String cardId) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            this.f64889a = cardId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SelectReason) && Intrinsics.f(this.f64889a, ((SelectReason) obj2).f64889a);
        }

        public final int hashCode() {
            return this.f64889a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64889a);
        }
    }
}
