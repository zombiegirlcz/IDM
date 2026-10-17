package com.revolut.feature.freelancer.api.terms;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.terms.api.model.Terms;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/freelancer/api/terms/FreelancerTerms;", "Landroid/os/Parcelable;", "<init>", "()V", "Scoped", "Template", "Lcom/revolut/feature/freelancer/api/terms/FreelancerTerms$Scoped;", "Lcom/revolut/feature/freelancer/api/terms/FreelancerTerms$Template;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class FreelancerTerms implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/api/terms/FreelancerTerms$Scoped;", "Lcom/revolut/feature/freelancer/api/terms/FreelancerTerms;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Scoped extends FreelancerTerms {

        @NotNull
        public static final Parcelable.Creator<Scoped> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Terms f73262a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Scoped((Terms) parcel.readParcelable(Scoped.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Scoped[i];
            }
        }

        public Scoped(Terms terms) {
            Intrinsics.checkNotNullParameter(terms, "terms");
            this.f73262a = terms;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Scoped) && Intrinsics.f(this.f73262a, ((Scoped) obj2).f73262a);
        }

        public final int hashCode() {
            return this.f73262a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f73262a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/freelancer/api/terms/FreelancerTerms$Template;", "Lcom/revolut/feature/freelancer/api/terms/FreelancerTerms;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Template extends FreelancerTerms {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73263a;

        @NotNull
        public static final Parcelable.Creator<Template> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Template(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Template[i];
            }
        }

        public Template(String templateId) {
            Intrinsics.checkNotNullParameter(templateId, "templateId");
            this.f73263a = templateId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Template) && Intrinsics.f(this.f73263a, ((Template) obj2).f73263a);
        }

        public final int hashCode() {
            return this.f73263a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73263a);
        }
    }

    private FreelancerTerms() {
    }
}
