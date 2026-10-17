package com.revolut.feature_retail_user_declarations.citizenship;

import aii.r;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0005\u0004\u0005\u0006\u0007\b\u0082\u0001\u0004\t\n\u000b\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/citizenship/SubmitCitizenshipFlowOutput;", "Laii/r;", "Landroid/os/Parcelable;", "Companion", "SelectedCitizenship", "Decline", "Close", "Back", "a", "Lcom/revolut/feature_retail_user_declarations/citizenship/SubmitCitizenshipFlowOutput$Back;", "Lcom/revolut/feature_retail_user_declarations/citizenship/SubmitCitizenshipFlowOutput$Close;", "Lcom/revolut/feature_retail_user_declarations/citizenship/SubmitCitizenshipFlowOutput$Decline;", "Lcom/revolut/feature_retail_user_declarations/citizenship/SubmitCitizenshipFlowOutput$SelectedCitizenship;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SubmitCitizenshipFlowOutput extends r, Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f97508a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/citizenship/SubmitCitizenshipFlowOutput$Back;", "Lcom/revolut/feature_retail_user_declarations/citizenship/SubmitCitizenshipFlowOutput;", "<init>", "()V", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Back implements SubmitCitizenshipFlowOutput {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Back f97504a = new Back();

        @NotNull
        public static final Parcelable.Creator<Back> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Back.f97504a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Back[i];
            }
        }

        private Back() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/citizenship/SubmitCitizenshipFlowOutput$Close;", "Lcom/revolut/feature_retail_user_declarations/citizenship/SubmitCitizenshipFlowOutput;", "<init>", "()V", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Close implements SubmitCitizenshipFlowOutput {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Close f97505a = new Close();

        @NotNull
        public static final Parcelable.Creator<Close> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Close.f97505a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Close[i];
            }
        }

        private Close() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/citizenship/SubmitCitizenshipFlowOutput$Decline;", "Lcom/revolut/feature_retail_user_declarations/citizenship/SubmitCitizenshipFlowOutput;", "<init>", "()V", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Decline implements SubmitCitizenshipFlowOutput {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Decline f97506a = new Decline();

        @NotNull
        public static final Parcelable.Creator<Decline> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Decline.f97506a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Decline[i];
            }
        }

        private Decline() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/citizenship/SubmitCitizenshipFlowOutput$SelectedCitizenship;", "Lcom/revolut/feature_retail_user_declarations/citizenship/SubmitCitizenshipFlowOutput;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectedCitizenship implements SubmitCitizenshipFlowOutput {

        @NotNull
        public static final Parcelable.Creator<SelectedCitizenship> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f97507a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectedCitizenship((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectedCitizenship[i];
            }
        }

        public SelectedCitizenship(b citizenship) {
            Intrinsics.checkNotNullParameter(citizenship, "citizenship");
            this.f97507a = citizenship;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SelectedCitizenship) && Intrinsics.f(this.f97507a, ((SelectedCitizenship) obj2).f97507a);
        }

        public final int hashCode() {
            return this.f97507a.f297794a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f97507a);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature_retail_user_declarations.citizenship.SubmitCitizenshipFlowOutput$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f97508a = new Companion();

        private Companion() {
        }
    }
}
