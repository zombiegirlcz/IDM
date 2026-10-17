package com.revolut.feature.rev_points.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.terms.api.model.Terms;
import com.revolut.feature.terms.api.model.TermsScope;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/rev_points/models/TermsInfo;", "Landroid/os/Parcelable;", "Id", "Scope", "Full", "Lcom/revolut/feature/rev_points/models/TermsInfo$Full;", "Lcom/revolut/feature/rev_points/models/TermsInfo$Id;", "Lcom/revolut/feature/rev_points/models/TermsInfo$Scope;", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TermsInfo extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/models/TermsInfo$Full;", "Lcom/revolut/feature/rev_points/models/TermsInfo;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Full implements TermsInfo {

        @NotNull
        public static final Parcelable.Creator<Full> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Terms f84096a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Full((Terms) parcel.readParcelable(Full.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Full[i];
            }
        }

        public Full(Terms terms) {
            Intrinsics.checkNotNullParameter(terms, "terms");
            this.f84096a = terms;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Full) && Intrinsics.f(this.f84096a, ((Full) obj2).f84096a);
        }

        public final int hashCode() {
            return this.f84096a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f84096a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/models/TermsInfo$Id;", "Lcom/revolut/feature/rev_points/models/TermsInfo;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Id implements TermsInfo {

        @NotNull
        public static final Parcelable.Creator<Id> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84097a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Id(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Id[i];
            }
        }

        public Id(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f84097a = id10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Id) && Intrinsics.f(this.f84097a, ((Id) obj2).f84097a);
        }

        public final int hashCode() {
            return this.f84097a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84097a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/models/TermsInfo$Scope;", "Lcom/revolut/feature/rev_points/models/TermsInfo;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Scope implements TermsInfo {

        @NotNull
        public static final Parcelable.Creator<Scope> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TermsScope f84098a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Scope((TermsScope) parcel.readParcelable(Scope.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Scope[i];
            }
        }

        public Scope(TermsScope scope) {
            Intrinsics.checkNotNullParameter(scope, "scope");
            this.f84098a = scope;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Scope) && Intrinsics.f(this.f84098a, ((Scope) obj2).f84098a);
        }

        public final int hashCode() {
            return this.f84098a.f90390a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f84098a, i);
        }
    }
}
