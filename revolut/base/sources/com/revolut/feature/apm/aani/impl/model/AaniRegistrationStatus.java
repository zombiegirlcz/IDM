package com.revolut.feature.apm.aani.impl.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/aani/impl/model/AaniRegistrationStatus;", "Landroid/os/Parcelable;", "NotRegistered", "Active", "Lcom/revolut/feature/apm/aani/impl/model/AaniRegistrationStatus$Active;", "Lcom/revolut/feature/apm/aani/impl/model/AaniRegistrationStatus$NotRegistered;", "feature_apm_aani_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AaniRegistrationStatus extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/aani/impl/model/AaniRegistrationStatus$Active;", "Lcom/revolut/feature/apm/aani/impl/model/AaniRegistrationStatus;", "", "toString", "()Ljava/lang/String;", "feature_apm_aani_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Active implements AaniRegistrationStatus {

        @NotNull
        public static final Parcelable.Creator<Active> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f61116a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Active(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Active[i];
            }
        }

        public Active(boolean z) {
            this.f61116a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Active) && this.f61116a == ((Active) obj2).f61116a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f61116a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f61116a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/aani/impl/model/AaniRegistrationStatus$NotRegistered;", "Lcom/revolut/feature/apm/aani/impl/model/AaniRegistrationStatus;", "", "toString", "()Ljava/lang/String;", "feature_apm_aani_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NotRegistered implements AaniRegistrationStatus {

        @NotNull
        public static final Parcelable.Creator<NotRegistered> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DataForRegistration f61117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f61118b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f61119c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                DataForRegistration dataForRegistrationCreateFromParcel = DataForRegistration.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(NotRegistered.class, parcel, arrayList, iE, 1);
                }
                return new NotRegistered(dataForRegistrationCreateFromParcel, arrayList, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NotRegistered[i];
            }
        }

        public NotRegistered(DataForRegistration dataForRegistration, ArrayList terms, boolean z) {
            Intrinsics.checkNotNullParameter(dataForRegistration, "dataForRegistration");
            Intrinsics.checkNotNullParameter(terms, "terms");
            this.f61117a = dataForRegistration;
            this.f61118b = terms;
            this.f61119c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NotRegistered)) {
                return false;
            }
            NotRegistered notRegistered = (NotRegistered) obj2;
            return Intrinsics.f(this.f61117a, notRegistered.f61117a) && this.f61118b.equals(notRegistered.f61118b) && this.f61119c == notRegistered.f61119c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f61119c) + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f61118b, this.f61117a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f61117a.writeToParcel(dest, i);
            Iterator itY = j6.a.y(this.f61118b, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
            dest.writeInt(this.f61119c ? 1 : 0);
        }
    }
}
