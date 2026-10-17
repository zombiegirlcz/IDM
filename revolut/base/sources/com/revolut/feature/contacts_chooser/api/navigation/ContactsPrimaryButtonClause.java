package com.revolut.feature.contacts_chooser.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/contacts_chooser/api/navigation/ContactsPrimaryButtonClause;", "Landroid/os/Parcelable;", "Plain", "Plural", "Lcom/revolut/feature/contacts_chooser/api/navigation/ContactsPrimaryButtonClause$Plain;", "Lcom/revolut/feature/contacts_chooser/api/navigation/ContactsPrimaryButtonClause$Plural;", "feature_contacts_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ContactsPrimaryButtonClause extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/contacts_chooser/api/navigation/ContactsPrimaryButtonClause$Plain;", "Lcom/revolut/feature/contacts_chooser/api/navigation/ContactsPrimaryButtonClause;", "", "toString", "()Ljava/lang/String;", "feature_contacts_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Plain implements ContactsPrimaryButtonClause {

        @NotNull
        public static final Parcelable.Creator<Plain> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f66079a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Plain((Clause) parcel.readParcelable(Plain.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Plain[i];
            }
        }

        public Plain(Clause clause) {
            Intrinsics.checkNotNullParameter(clause, "clause");
            this.f66079a = clause;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Plain) && Intrinsics.f(this.f66079a, ((Plain) obj2).f66079a);
        }

        public final int hashCode() {
            return this.f66079a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66079a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/contacts_chooser/api/navigation/ContactsPrimaryButtonClause$Plural;", "Lcom/revolut/feature/contacts_chooser/api/navigation/ContactsPrimaryButtonClause;", "", "toString", "()Ljava/lang/String;", "feature_contacts_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Plural implements ContactsPrimaryButtonClause {

        @NotNull
        public static final Parcelable.Creator<Plural> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f66080a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Plural(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Plural[i];
            }
        }

        public Plural(int i) {
            this.f66080a = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Plural) && this.f66080a == ((Plural) obj2).f66080a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f66080a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f66080a);
        }
    }
}
