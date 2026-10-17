package com.revolut.feature.credit.application.models.preapplication;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationChecksScenario;", "Landroid/os/Parcelable;", "<init>", "()V", "Ready", "ReadyWithInfo", "RemediationRequired", "Blocked", "RejectedUndisclosed", "Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationChecksScenario$Blocked;", "Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationChecksScenario$Ready;", "Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationChecksScenario$ReadyWithInfo;", "Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationChecksScenario$RejectedUndisclosed;", "Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationChecksScenario$RemediationRequired;", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PreApplicationChecksScenario implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationChecksScenario$Blocked;", "Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationChecksScenario;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Blocked extends PreApplicationChecksScenario {

        @NotNull
        public static final Parcelable.Creator<Blocked> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f66266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f66267b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f66268c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                int iE2 = 0;
                while (iE2 != i) {
                    iE2 = j6.a.e(Blocked.class, parcel, arrayList, iE2, 1);
                }
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                int iE3 = 0;
                while (iE3 != i2) {
                    iE3 = j6.a.e(Blocked.class, parcel, arrayList2, iE3, 1);
                }
                int i3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i3);
                while (iE != i3) {
                    iE = j6.a.e(Blocked.class, parcel, arrayList3, iE, 1);
                }
                return new Blocked(arrayList, arrayList2, arrayList3);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Blocked[i];
            }
        }

        public Blocked(ArrayList reasons, ArrayList actions, ArrayList informative) {
            Intrinsics.checkNotNullParameter(reasons, "reasons");
            Intrinsics.checkNotNullParameter(actions, "actions");
            Intrinsics.checkNotNullParameter(informative, "informative");
            this.f66266a = reasons;
            this.f66267b = actions;
            this.f66268c = informative;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Blocked)) {
                return false;
            }
            Blocked blocked = (Blocked) obj2;
            return this.f66266a.equals(blocked.f66266a) && this.f66267b.equals(blocked.f66267b) && this.f66268c.equals(blocked.f66268c);
        }

        public final int hashCode() {
            return this.f66268c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f66267b, this.f66266a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f66266a, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
            Iterator itY2 = j6.a.y(this.f66267b, dest);
            while (itY2.hasNext()) {
                dest.writeParcelable((Parcelable) itY2.next(), i);
            }
            Iterator itY3 = j6.a.y(this.f66268c, dest);
            while (itY3.hasNext()) {
                dest.writeParcelable((Parcelable) itY3.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationChecksScenario$Ready;", "Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationChecksScenario;", "<init>", "()V", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Ready extends PreApplicationChecksScenario {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Ready f66269a = new Ready();

        @NotNull
        public static final Parcelable.Creator<Ready> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Ready.f66269a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Ready[i];
            }
        }

        private Ready() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationChecksScenario$ReadyWithInfo;", "Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationChecksScenario;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReadyWithInfo extends PreApplicationChecksScenario {

        @NotNull
        public static final Parcelable.Creator<ReadyWithInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f66270a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(ReadyWithInfo.class, parcel, arrayList, iE, 1);
                }
                return new ReadyWithInfo(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReadyWithInfo[i];
            }
        }

        public ReadyWithInfo(ArrayList informative) {
            Intrinsics.checkNotNullParameter(informative, "informative");
            this.f66270a = informative;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ReadyWithInfo) && this.f66270a.equals(((ReadyWithInfo) obj2).f66270a);
        }

        public final int hashCode() {
            return this.f66270a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f66270a, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationChecksScenario$RejectedUndisclosed;", "Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationChecksScenario;", "<init>", "()V", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RejectedUndisclosed extends PreApplicationChecksScenario {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RejectedUndisclosed f66271a = new RejectedUndisclosed();

        @NotNull
        public static final Parcelable.Creator<RejectedUndisclosed> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RejectedUndisclosed.f66271a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RejectedUndisclosed[i];
            }
        }

        private RejectedUndisclosed() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationChecksScenario$RemediationRequired;", "Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationChecksScenario;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RemediationRequired extends PreApplicationChecksScenario {

        @NotNull
        public static final Parcelable.Creator<RemediationRequired> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f66272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f66273b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                int iE2 = 0;
                while (iE2 != i) {
                    iE2 = j6.a.e(RemediationRequired.class, parcel, arrayList, iE2, 1);
                }
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                while (iE != i2) {
                    iE = j6.a.e(RemediationRequired.class, parcel, arrayList2, iE, 1);
                }
                return new RemediationRequired(arrayList, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RemediationRequired[i];
            }
        }

        public RemediationRequired(ArrayList actions, ArrayList informative) {
            Intrinsics.checkNotNullParameter(actions, "actions");
            Intrinsics.checkNotNullParameter(informative, "informative");
            this.f66272a = actions;
            this.f66273b = informative;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RemediationRequired)) {
                return false;
            }
            RemediationRequired remediationRequired = (RemediationRequired) obj2;
            return this.f66272a.equals(remediationRequired.f66272a) && this.f66273b.equals(remediationRequired.f66273b);
        }

        public final int hashCode() {
            return this.f66273b.hashCode() + (this.f66272a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f66272a, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
            Iterator itY2 = j6.a.y(this.f66273b, dest);
            while (itY2.hasNext()) {
                dest.writeParcelable((Parcelable) itY2.next(), i);
            }
        }
    }

    private PreApplicationChecksScenario() {
    }
}
