package com.revolut.feature.credit.application.models.preapplication;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItem;", "Landroid/os/Parcelable;", "<init>", "()V", "Informative", "Remediable", "Pending", "NonRemediable", "Completed", "Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItem$Completed;", "Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItem$Informative;", "Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItem$NonRemediable;", "Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItem$Pending;", "Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItem$Remediable;", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PreApplicationCheckItem implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItem$Completed;", "Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItem;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Completed extends PreApplicationCheckItem {

        @NotNull
        public static final Parcelable.Creator<Completed> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PreApplicationCheckItemId f66250a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Completed((PreApplicationCheckItemId) parcel.readParcelable(Completed.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Completed[i];
            }
        }

        public Completed(PreApplicationCheckItemId id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f66250a = id10;
        }

        @Override // com.revolut.feature.credit.application.models.preapplication.PreApplicationCheckItem
        /* JADX INFO: renamed from: a, reason: from getter */
        public final PreApplicationCheckItemId getF66254a() {
            return this.f66250a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Completed) && Intrinsics.f(this.f66250a, ((Completed) obj2).f66250a);
        }

        public final int hashCode() {
            return this.f66250a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66250a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItem$Informative;", "Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItem;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Informative extends PreApplicationCheckItem {

        @NotNull
        public static final Parcelable.Creator<Informative> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PreApplicationCheckItemId f66251a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Informative((PreApplicationCheckItemId) parcel.readParcelable(Informative.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Informative[i];
            }
        }

        public Informative(PreApplicationCheckItemId id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f66251a = id10;
        }

        @Override // com.revolut.feature.credit.application.models.preapplication.PreApplicationCheckItem
        /* JADX INFO: renamed from: a, reason: from getter */
        public final PreApplicationCheckItemId getF66254a() {
            return this.f66251a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Informative) && Intrinsics.f(this.f66251a, ((Informative) obj2).f66251a);
        }

        public final int hashCode() {
            return this.f66251a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66251a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItem$NonRemediable;", "Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItem;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NonRemediable extends PreApplicationCheckItem {

        @NotNull
        public static final Parcelable.Creator<NonRemediable> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PreApplicationCheckItemId f66252a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NonRemediable((PreApplicationCheckItemId) parcel.readParcelable(NonRemediable.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NonRemediable[i];
            }
        }

        public NonRemediable(PreApplicationCheckItemId id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f66252a = id10;
        }

        @Override // com.revolut.feature.credit.application.models.preapplication.PreApplicationCheckItem
        /* JADX INFO: renamed from: a, reason: from getter */
        public final PreApplicationCheckItemId getF66254a() {
            return this.f66252a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof NonRemediable) && Intrinsics.f(this.f66252a, ((NonRemediable) obj2).f66252a);
        }

        public final int hashCode() {
            return this.f66252a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66252a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItem$Pending;", "Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItem;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Pending extends PreApplicationCheckItem {

        @NotNull
        public static final Parcelable.Creator<Pending> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PreApplicationCheckItemId f66253a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Pending((PreApplicationCheckItemId) parcel.readParcelable(Pending.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pending[i];
            }
        }

        public Pending(PreApplicationCheckItemId id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f66253a = id10;
        }

        @Override // com.revolut.feature.credit.application.models.preapplication.PreApplicationCheckItem
        /* JADX INFO: renamed from: a, reason: from getter */
        public final PreApplicationCheckItemId getF66254a() {
            return this.f66253a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Pending) && Intrinsics.f(this.f66253a, ((Pending) obj2).f66253a);
        }

        public final int hashCode() {
            return this.f66253a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66253a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItem$Remediable;", "Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItem;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Remediable extends PreApplicationCheckItem {

        @NotNull
        public static final Parcelable.Creator<Remediable> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PreApplicationCheckItemId f66254a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Remediable((PreApplicationCheckItemId) parcel.readParcelable(Remediable.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Remediable[i];
            }
        }

        public Remediable(PreApplicationCheckItemId id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f66254a = id10;
        }

        @Override // com.revolut.feature.credit.application.models.preapplication.PreApplicationCheckItem
        /* JADX INFO: renamed from: a, reason: from getter */
        public final PreApplicationCheckItemId getF66254a() {
            return this.f66254a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Remediable) && Intrinsics.f(this.f66254a, ((Remediable) obj2).f66254a);
        }

        public final int hashCode() {
            return this.f66254a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66254a, i);
        }
    }

    private PreApplicationCheckItem() {
    }

    /* JADX INFO: renamed from: a */
    public abstract PreApplicationCheckItemId getF66254a();
}
