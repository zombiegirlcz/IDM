package com.revolut.feature.travel.experiences.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.experiences.models.TravelExperienceCancellationWindow;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/experiences/models/TravelExperienceCancellationPolicy;", "Landroid/os/Parcelable;", "Experience", "Booking", "Lcom/revolut/feature/travel/experiences/models/TravelExperienceCancellationPolicy$Booking;", "Lcom/revolut/feature/travel/experiences/models/TravelExperienceCancellationPolicy$Experience;", "feature_travel_experiences_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelExperienceCancellationPolicy implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/models/TravelExperienceCancellationPolicy$Booking;", "Lcom/revolut/feature/travel/experiences/models/TravelExperienceCancellationPolicy;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Booking extends TravelExperienceCancellationPolicy {

        @NotNull
        public static final Parcelable.Creator<Booking> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f93179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f93180b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f93181c;
        public final ArrayList d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int iA = 0;
                boolean z = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA2 = 0;
                while (iA2 != i) {
                    iA2 = org.bouncycastle.jcajce.provider.digest.a.a(TravelExperienceCancellationCondition.CREATOR, parcel, arrayList, iA2, 1);
                }
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                while (iA != i2) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(TravelExperienceCancellationWindow.Booking.CREATOR, parcel, arrayList2, iA, 1);
                }
                return new Booking(z, z3, arrayList, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Booking[i];
            }
        }

        public Booking(boolean z, boolean z3, ArrayList cancellationConditions, ArrayList cancellationWindows) {
            Intrinsics.checkNotNullParameter(cancellationConditions, "cancellationConditions");
            Intrinsics.checkNotNullParameter(cancellationWindows, "cancellationWindows");
            this.f93179a = z;
            this.f93180b = z3;
            this.f93181c = cancellationConditions;
            this.d = cancellationWindows;
        }

        @Override // com.revolut.feature.travel.experiences.models.TravelExperienceCancellationPolicy
        public final List a() {
            return this.f93181c;
        }

        @Override // com.revolut.feature.travel.experiences.models.TravelExperienceCancellationPolicy
        public final List b() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Booking)) {
                return false;
            }
            Booking booking = (Booking) obj2;
            return this.f93179a == booking.f93179a && this.f93180b == booking.f93180b && this.f93181c.equals(booking.f93181c) && this.d.equals(booking.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f93181c, j6.a.c(Boolean.hashCode(this.f93179a) * 31, 31, this.f93180b), 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f93179a ? 1 : 0);
            dest.writeInt(this.f93180b ? 1 : 0);
            Iterator itY = j6.a.y(this.f93181c, dest);
            while (itY.hasNext()) {
                ((TravelExperienceCancellationCondition) itY.next()).writeToParcel(dest, i);
            }
            Iterator itY2 = j6.a.y(this.d, dest);
            while (itY2.hasNext()) {
                ((TravelExperienceCancellationWindow.Booking) itY2.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/models/TravelExperienceCancellationPolicy$Experience;", "Lcom/revolut/feature/travel/experiences/models/TravelExperienceCancellationPolicy;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Experience extends TravelExperienceCancellationPolicy {

        @NotNull
        public static final Parcelable.Creator<Experience> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f93182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f93183b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f93184c;
        public final ArrayList d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int iA = 0;
                boolean z = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA2 = 0;
                while (iA2 != i) {
                    iA2 = org.bouncycastle.jcajce.provider.digest.a.a(TravelExperienceCancellationCondition.CREATOR, parcel, arrayList, iA2, 1);
                }
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                while (iA != i2) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(TravelExperienceCancellationWindow.Experience.CREATOR, parcel, arrayList2, iA, 1);
                }
                return new Experience(z, z3, arrayList, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Experience[i];
            }
        }

        public Experience(boolean z, boolean z3, ArrayList cancellationConditions, ArrayList cancellationWindows) {
            Intrinsics.checkNotNullParameter(cancellationConditions, "cancellationConditions");
            Intrinsics.checkNotNullParameter(cancellationWindows, "cancellationWindows");
            this.f93182a = z;
            this.f93183b = z3;
            this.f93184c = cancellationConditions;
            this.d = cancellationWindows;
        }

        @Override // com.revolut.feature.travel.experiences.models.TravelExperienceCancellationPolicy
        public final List a() {
            return this.f93184c;
        }

        @Override // com.revolut.feature.travel.experiences.models.TravelExperienceCancellationPolicy
        public final List b() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Experience)) {
                return false;
            }
            Experience experience = (Experience) obj2;
            return this.f93182a == experience.f93182a && this.f93183b == experience.f93183b && this.f93184c.equals(experience.f93184c) && this.d.equals(experience.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f93184c, j6.a.c(Boolean.hashCode(this.f93182a) * 31, 31, this.f93183b), 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f93182a ? 1 : 0);
            dest.writeInt(this.f93183b ? 1 : 0);
            Iterator itY = j6.a.y(this.f93184c, dest);
            while (itY.hasNext()) {
                ((TravelExperienceCancellationCondition) itY.next()).writeToParcel(dest, i);
            }
            Iterator itY2 = j6.a.y(this.d, dest);
            while (itY2.hasNext()) {
                ((TravelExperienceCancellationWindow.Experience) itY2.next()).writeToParcel(dest, i);
            }
        }
    }

    public abstract List a();

    public abstract List b();
}
