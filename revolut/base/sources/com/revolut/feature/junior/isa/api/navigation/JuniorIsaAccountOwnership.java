package com.revolut.feature.junior.isa.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior/isa/api/navigation/JuniorIsaAccountOwnership;", "Landroid/os/Parcelable;", "Personal", "Custodian", "Lcom/revolut/feature/junior/isa/api/navigation/JuniorIsaAccountOwnership$Custodian;", "Lcom/revolut/feature/junior/isa/api/navigation/JuniorIsaAccountOwnership$Personal;", "feature_junior_isa_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorIsaAccountOwnership extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior/isa/api/navigation/JuniorIsaAccountOwnership$Custodian;", "Lcom/revolut/feature/junior/isa/api/navigation/JuniorIsaAccountOwnership;", "", "toString", "()Ljava/lang/String;", "feature_junior_isa_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Custodian implements JuniorIsaAccountOwnership {

        @NotNull
        public static final Parcelable.Creator<Custodian> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76735a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Custodian(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Custodian[i];
            }
        }

        public Custodian(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f76735a = name;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Custodian) && Intrinsics.f(this.f76735a, ((Custodian) obj2).f76735a);
        }

        public final int hashCode() {
            return this.f76735a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76735a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior/isa/api/navigation/JuniorIsaAccountOwnership$Personal;", "Lcom/revolut/feature/junior/isa/api/navigation/JuniorIsaAccountOwnership;", "<init>", "()V", "feature_junior_isa_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Personal implements JuniorIsaAccountOwnership {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Personal f76736a = new Personal();

        @NotNull
        public static final Parcelable.Creator<Personal> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Personal.f76736a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Personal[i];
            }
        }

        private Personal() {
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
