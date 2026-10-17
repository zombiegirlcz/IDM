package com.revolut.retail.operation_status.modal_status;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/retail/operation_status/modal_status/SuccessType;", "Landroid/os/Parcelable;", "<init>", "()V", "Simple", "OptionalAction", "ResultAction", "Lcom/revolut/retail/operation_status/modal_status/SuccessType$OptionalAction;", "Lcom/revolut/retail/operation_status/modal_status/SuccessType$ResultAction;", "Lcom/revolut/retail/operation_status/modal_status/SuccessType$Simple;", "retail_operation_status_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SuccessType implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/operation_status/modal_status/SuccessType$OptionalAction;", "Lcom/revolut/retail/operation_status/modal_status/SuccessType;", "", "toString", "()Ljava/lang/String;", "retail_operation_status_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OptionalAction extends SuccessType {

        @NotNull
        public static final Parcelable.Creator<OptionalAction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f104393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f104394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f104395c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OptionalAction((Clause) parcel.readParcelable(OptionalAction.class.getClassLoader()), (Clause) parcel.readParcelable(OptionalAction.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OptionalAction[i];
            }
        }

        public OptionalAction(Clause primaryButtonText, Clause clause, boolean z) {
            Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
            this.f104393a = primaryButtonText;
            this.f104394b = clause;
            this.f104395c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OptionalAction)) {
                return false;
            }
            OptionalAction optionalAction = (OptionalAction) obj2;
            return Intrinsics.f(this.f104393a, optionalAction.f104393a) && Intrinsics.f(this.f104394b, optionalAction.f104394b) && this.f104395c == optionalAction.f104395c;
        }

        public final int hashCode() {
            int iHashCode = this.f104393a.hashCode() * 31;
            Clause clause = this.f104394b;
            return Boolean.hashCode(this.f104395c) + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f104393a, i);
            dest.writeParcelable(this.f104394b, i);
            dest.writeInt(this.f104395c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/operation_status/modal_status/SuccessType$ResultAction;", "Lcom/revolut/retail/operation_status/modal_status/SuccessType;", "", "toString", "()Ljava/lang/String;", "retail_operation_status_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ResultAction extends SuccessType {

        @NotNull
        public static final Parcelable.Creator<ResultAction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f104396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f104397b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ResultAction((Clause) parcel.readParcelable(ResultAction.class.getClassLoader()), (Clause) parcel.readParcelable(ResultAction.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ResultAction[i];
            }
        }

        public ResultAction(Clause primaryButtonText, Clause clause) {
            Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
            this.f104396a = primaryButtonText;
            this.f104397b = clause;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ResultAction)) {
                return false;
            }
            ResultAction resultAction = (ResultAction) obj2;
            return Intrinsics.f(this.f104396a, resultAction.f104396a) && Intrinsics.f(this.f104397b, resultAction.f104397b);
        }

        public final int hashCode() {
            int iHashCode = this.f104396a.hashCode() * 31;
            Clause clause = this.f104397b;
            return iHashCode + (clause == null ? 0 : clause.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f104396a, i);
            dest.writeParcelable(this.f104397b, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/operation_status/modal_status/SuccessType$Simple;", "Lcom/revolut/retail/operation_status/modal_status/SuccessType;", "<init>", "()V", "retail_operation_status_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Simple extends SuccessType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Simple f104398a = new Simple();

        @NotNull
        public static final Parcelable.Creator<Simple> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Simple.f104398a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Simple[i];
            }
        }

        private Simple() {
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

    private SuccessType() {
    }
}
