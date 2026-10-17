package com.revolut.retail.feature.pda.impl.ui;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/retail/feature/pda/impl/ui/SetUpPdaActivityContract$Step", "Landroid/os/Parcelable;", "<init>", "()V", "Intro", "SelectBeneficiary", "Confirmation", "Eof", "Lcom/revolut/retail/feature/pda/impl/ui/SetUpPdaActivityContract$Step$Confirmation;", "Lcom/revolut/retail/feature/pda/impl/ui/SetUpPdaActivityContract$Step$Eof;", "Lcom/revolut/retail/feature/pda/impl/ui/SetUpPdaActivityContract$Step$Intro;", "Lcom/revolut/retail/feature/pda/impl/ui/SetUpPdaActivityContract$Step$SelectBeneficiary;", "feature_pda_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SetUpPdaActivityContract$Step implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pda/impl/ui/SetUpPdaActivityContract$Step$Confirmation;", "Lcom/revolut/retail/feature/pda/impl/ui/SetUpPdaActivityContract$Step;", "<init>", "()V", "feature_pda_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Confirmation extends SetUpPdaActivityContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Confirmation f102379a = new Confirmation();

        @NotNull
        public static final Parcelable.Creator<Confirmation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Confirmation.f102379a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Confirmation[i];
            }
        }

        private Confirmation() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pda/impl/ui/SetUpPdaActivityContract$Step$Eof;", "Lcom/revolut/retail/feature/pda/impl/ui/SetUpPdaActivityContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pda_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Eof extends SetUpPdaActivityContract$Step {

        @NotNull
        public static final Parcelable.Creator<Eof> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f102380a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Eof(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Eof[i];
            }
        }

        public Eof(boolean z) {
            this.f102380a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Eof) && this.f102380a == ((Eof) obj2).f102380a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f102380a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f102380a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pda/impl/ui/SetUpPdaActivityContract$Step$Intro;", "Lcom/revolut/retail/feature/pda/impl/ui/SetUpPdaActivityContract$Step;", "<init>", "()V", "feature_pda_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Intro extends SetUpPdaActivityContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Intro f102381a = new Intro();

        @NotNull
        public static final Parcelable.Creator<Intro> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Intro.f102381a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Intro[i];
            }
        }

        private Intro() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pda/impl/ui/SetUpPdaActivityContract$Step$SelectBeneficiary;", "Lcom/revolut/retail/feature/pda/impl/ui/SetUpPdaActivityContract$Step;", "<init>", "()V", "feature_pda_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelectBeneficiary extends SetUpPdaActivityContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelectBeneficiary f102382a = new SelectBeneficiary();

        @NotNull
        public static final Parcelable.Creator<SelectBeneficiary> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelectBeneficiary.f102382a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectBeneficiary[i];
            }
        }

        private SelectBeneficiary() {
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

    private SetUpPdaActivityContract$Step() {
    }
}
