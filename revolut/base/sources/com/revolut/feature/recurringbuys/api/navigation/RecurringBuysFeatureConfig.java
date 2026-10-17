package com.revolut.feature.recurringbuys.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import dj0.d;
import h30.l;
import jli.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import xi0.b;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/recurringbuys/api/navigation/RecurringBuysFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "<init>", "()V", "CreateFromScratch", "CreateWithPresetValues", "Lcom/revolut/feature/recurringbuys/api/navigation/RecurringBuysFeatureConfig$CreateFromScratch;", "Lcom/revolut/feature/recurringbuys/api/navigation/RecurringBuysFeatureConfig$CreateWithPresetValues;", "feature_recurring_buys_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RecurringBuysFeatureConfig implements FeatureConfig {

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/recurringbuys/api/navigation/RecurringBuysFeatureConfig$CreateFromScratch;", "Lcom/revolut/feature/recurringbuys/api/navigation/RecurringBuysFeatureConfig;", "<init>", "()V", "feature_recurring_buys_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CreateFromScratch extends RecurringBuysFeatureConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CreateFromScratch f81655a = new CreateFromScratch();

        @NotNull
        public static final Parcelable.Creator<CreateFromScratch> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreateFromScratch.f81655a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreateFromScratch[i];
            }
        }

        private CreateFromScratch() {
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

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/recurringbuys/api/navigation/RecurringBuysFeatureConfig$CreateWithPresetValues;", "Lcom/revolut/feature/recurringbuys/api/navigation/RecurringBuysFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_recurring_buys_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreateWithPresetValues extends RecurringBuysFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<CreateWithPresetValues> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f81656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f81657b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LocalDate f81658c;
        public final c d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreateWithPresetValues((d) parcel.readSerializable(), (b) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), parcel.readInt() == 0 ? null : c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreateWithPresetValues[i];
            }
        }

        public CreateWithPresetValues(d sourceMoney, b destinationCurrency, LocalDate localDate, c cVar) {
            Intrinsics.checkNotNullParameter(sourceMoney, "sourceMoney");
            Intrinsics.checkNotNullParameter(destinationCurrency, "destinationCurrency");
            this.f81656a = sourceMoney;
            this.f81657b = destinationCurrency;
            this.f81658c = localDate;
            this.d = cVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CreateWithPresetValues)) {
                return false;
            }
            CreateWithPresetValues createWithPresetValues = (CreateWithPresetValues) obj2;
            return Intrinsics.f(this.f81656a, createWithPresetValues.f81656a) && Intrinsics.f(this.f81657b, createWithPresetValues.f81657b) && Intrinsics.f(this.f81658c, createWithPresetValues.f81658c) && this.d == createWithPresetValues.d;
        }

        public final int hashCode() {
            int iJ = l.j(this.f81657b, this.f81656a.hashCode() * 31, 31);
            LocalDate localDate = this.f81658c;
            int iHashCode = (iJ + (localDate == null ? 0 : localDate.hashCode())) * 31;
            c cVar = this.d;
            return iHashCode + (cVar != null ? cVar.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f81656a);
            dest.writeSerializable(this.f81657b);
            dest.writeSerializable(this.f81658c);
            c cVar = this.d;
            if (cVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(cVar.name());
            }
        }
    }

    private RecurringBuysFeatureConfig() {
    }
}
