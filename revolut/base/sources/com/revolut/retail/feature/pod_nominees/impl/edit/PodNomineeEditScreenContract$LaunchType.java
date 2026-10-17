package com.revolut.retail.feature.pod_nominees.impl.edit;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.feature.pod_nominees.impl.model.PodNominee;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/pod_nominees/impl/edit/PodNomineeEditScreenContract$LaunchType", "Landroid/os/Parcelable;", "Create", "Edit", "Lcom/revolut/retail/feature/pod_nominees/impl/edit/PodNomineeEditScreenContract$LaunchType$Create;", "Lcom/revolut/retail/feature/pod_nominees/impl/edit/PodNomineeEditScreenContract$LaunchType$Edit;", "feature_pod_nominees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PodNomineeEditScreenContract$LaunchType extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pod_nominees/impl/edit/PodNomineeEditScreenContract$LaunchType$Create;", "Lcom/revolut/retail/feature/pod_nominees/impl/edit/PodNomineeEditScreenContract$LaunchType;", "", "toString", "()Ljava/lang/String;", "feature_pod_nominees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Create implements PodNomineeEditScreenContract$LaunchType {

        @NotNull
        public static final Parcelable.Creator<Create> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f102592a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Create(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Create[i];
            }
        }

        public Create(boolean z) {
            this.f102592a = z;
        }

        @Override // com.revolut.retail.feature.pod_nominees.impl.edit.PodNomineeEditScreenContract$LaunchType
        /* JADX INFO: renamed from: W8, reason: from getter */
        public final boolean getF102594b() {
            return this.f102592a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Create) && this.f102592a == ((Create) obj2).f102592a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f102592a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f102592a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pod_nominees/impl/edit/PodNomineeEditScreenContract$LaunchType$Edit;", "Lcom/revolut/retail/feature/pod_nominees/impl/edit/PodNomineeEditScreenContract$LaunchType;", "", "toString", "()Ljava/lang/String;", "feature_pod_nominees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Edit implements PodNomineeEditScreenContract$LaunchType {

        @NotNull
        public static final Parcelable.Creator<Edit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PodNominee f102593a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f102594b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Edit(PodNominee.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Edit[i];
            }
        }

        public Edit(PodNominee podNominee, boolean z) {
            Intrinsics.checkNotNullParameter(podNominee, "podNominee");
            this.f102593a = podNominee;
            this.f102594b = z;
        }

        @Override // com.revolut.retail.feature.pod_nominees.impl.edit.PodNomineeEditScreenContract$LaunchType
        /* JADX INFO: renamed from: W8, reason: from getter */
        public final boolean getF102594b() {
            return this.f102594b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Edit)) {
                return false;
            }
            Edit edit = (Edit) obj2;
            return Intrinsics.f(this.f102593a, edit.f102593a) && this.f102594b == edit.f102594b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f102594b) + (this.f102593a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f102593a.writeToParcel(dest, i);
            dest.writeInt(this.f102594b ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: W8 */
    boolean getF102594b();
}
