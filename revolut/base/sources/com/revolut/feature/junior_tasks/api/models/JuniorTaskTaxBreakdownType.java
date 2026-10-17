package com.revolut.feature.junior_tasks.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior_tasks/api/models/JuniorTaskTaxBreakdownType;", "Landroid/os/Parcelable;", "Companion", "Gmf", "Unknown", "a", "Lcom/revolut/feature/junior_tasks/api/models/JuniorTaskTaxBreakdownType$Gmf;", "Lcom/revolut/feature/junior_tasks/api/models/JuniorTaskTaxBreakdownType$Unknown;", "feature_junior_tasks_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorTaskTaxBreakdownType extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f77349a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/junior_tasks/api/models/JuniorTaskTaxBreakdownType$Gmf;", "Lcom/revolut/feature/junior_tasks/api/models/JuniorTaskTaxBreakdownType;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_junior_tasks_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Gmf implements JuniorTaskTaxBreakdownType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Gmf f77347a = new Gmf();

        @NotNull
        public static final Parcelable.Creator<Gmf> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Gmf.f77347a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Gmf[i];
            }
        }

        private Gmf() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof Gmf);
        }

        public final int hashCode() {
            return -1946402050;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_tasks/api/models/JuniorTaskTaxBreakdownType$Unknown;", "Lcom/revolut/feature/junior_tasks/api/models/JuniorTaskTaxBreakdownType;", "", "toString", "()Ljava/lang/String;", "feature_junior_tasks_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Unknown implements JuniorTaskTaxBreakdownType {

        @NotNull
        public static final Parcelable.Creator<Unknown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f77348a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Unknown(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Unknown[i];
            }
        }

        public Unknown(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f77348a = name;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Unknown) && Intrinsics.f(this.f77348a, ((Unknown) obj2).f77348a);
        }

        public final int hashCode() {
            return this.f77348a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77348a);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.junior_tasks.api.models.JuniorTaskTaxBreakdownType$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f77349a = new Companion();

        private Companion() {
        }
    }
}
