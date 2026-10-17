package com.revolut.feature.insurance_credit.impl.data.model.action;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/data/model/action/InsuranceAction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ActionType", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InsuranceAction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InsuranceAction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ActionType f75760c;
    public final Prompt d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/data/model/action/InsuranceAction$ActionType;", "Landroid/os/Parcelable;", "ShowCancellationPrompt", "Lcom/revolut/feature/insurance_credit/impl/data/model/action/InsuranceAction$ActionType$ShowCancellationPrompt;", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface ActionType extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/data/model/action/InsuranceAction$ActionType$ShowCancellationPrompt;", "Lcom/revolut/feature/insurance_credit/impl/data/model/action/InsuranceAction$ActionType;", "<init>", "()V", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class ShowCancellationPrompt implements ActionType {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final ShowCancellationPrompt f75761a = new ShowCancellationPrompt();

            @NotNull
            public static final Parcelable.Creator<ShowCancellationPrompt> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ShowCancellationPrompt.f75761a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ShowCancellationPrompt[i];
                }
            }

            private ShowCancellationPrompt() {
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
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InsuranceAction(parcel.readString(), parcel.readString(), (ActionType) parcel.readParcelable(InsuranceAction.class.getClassLoader()), parcel.readInt() == 0 ? null : Prompt.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InsuranceAction[i];
        }
    }

    public InsuranceAction(String title, String str, ActionType actionType, Prompt prompt) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f75758a = title;
        this.f75759b = str;
        this.f75760c = actionType;
        this.d = prompt;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InsuranceAction)) {
            return false;
        }
        InsuranceAction insuranceAction = (InsuranceAction) obj2;
        return Intrinsics.f(this.f75758a, insuranceAction.f75758a) && Intrinsics.f(this.f75759b, insuranceAction.f75759b) && Intrinsics.f(this.f75760c, insuranceAction.f75760c) && Intrinsics.f(this.d, insuranceAction.d);
    }

    public final int hashCode() {
        int iHashCode = this.f75758a.hashCode() * 31;
        String str = this.f75759b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ActionType actionType = this.f75760c;
        int iHashCode3 = (iHashCode2 + (actionType == null ? 0 : actionType.hashCode())) * 31;
        Prompt prompt = this.d;
        return iHashCode3 + (prompt != null ? prompt.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75758a);
        dest.writeString(this.f75759b);
        dest.writeParcelable(this.f75760c, i);
        Prompt prompt = this.d;
        if (prompt == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            prompt.writeToParcel(dest, i);
        }
    }
}
