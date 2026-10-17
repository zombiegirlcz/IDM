package com.revolut.shared.feature.move_money.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/model/MoveMoneyReason;", "Landroid/os/Parcelable;", "<init>", "()V", "Predefined", "Custom", "Lcom/revolut/shared/feature/move_money/api/model/MoveMoneyReason$Custom;", "Lcom/revolut/shared/feature/move_money/api/model/MoveMoneyReason$Predefined;", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class MoveMoneyReason implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/model/MoveMoneyReason$Custom;", "Lcom/revolut/shared/feature/move_money/api/model/MoveMoneyReason;", "", "toString", "()Ljava/lang/String;", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Custom extends MoveMoneyReason {

        @NotNull
        public static final Parcelable.Creator<Custom> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104798a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Custom(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Custom[i];
            }
        }

        public Custom(String description) {
            Intrinsics.checkNotNullParameter(description, "description");
            this.f104798a = description;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Custom) && Intrinsics.f(this.f104798a, ((Custom) obj2).f104798a);
        }

        public final int hashCode() {
            return this.f104798a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104798a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/model/MoveMoneyReason$Predefined;", "Lcom/revolut/shared/feature/move_money/api/model/MoveMoneyReason;", "", "toString", "()Ljava/lang/String;", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Predefined extends MoveMoneyReason {

        @NotNull
        public static final Parcelable.Creator<Predefined> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f104800b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Predefined(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Predefined[i];
            }
        }

        public Predefined(String code, String description) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(description, "description");
            this.f104799a = code;
            this.f104800b = description;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Predefined)) {
                return false;
            }
            Predefined predefined = (Predefined) obj2;
            return Intrinsics.f(this.f104799a, predefined.f104799a) && Intrinsics.f(this.f104800b, predefined.f104800b);
        }

        public final int hashCode() {
            return this.f104800b.hashCode() + (this.f104799a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104799a);
            dest.writeString(this.f104800b);
        }
    }

    private MoveMoneyReason() {
    }
}
