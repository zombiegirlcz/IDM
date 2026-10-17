package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/Action;", "Landroid/os/Parcelable;", "Dismiss", "Deeplink", "Submit", "Lcom/revolut/feature/backend_flow/domain/models/Action$Deeplink;", "Lcom/revolut/feature/backend_flow/domain/models/Action$Dismiss;", "Lcom/revolut/feature/backend_flow/domain/models/Action$Submit;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface Action extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/Action$Deeplink;", "Lcom/revolut/feature/backend_flow/domain/models/Action;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Deeplink implements Action {

        @NotNull
        public static final Parcelable.Creator<Deeplink> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63224a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f63225b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f63226c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Deeplink(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Deeplink[i];
            }
        }

        public Deeplink(String id10, String title, String deeplink) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.f63224a = id10;
            this.f63225b = title;
            this.f63226c = deeplink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Deeplink)) {
                return false;
            }
            Deeplink deeplink = (Deeplink) obj2;
            return Intrinsics.f(this.f63224a, deeplink.f63224a) && Intrinsics.f(this.f63225b, deeplink.f63225b) && Intrinsics.f(this.f63226c, deeplink.f63226c);
        }

        @Override // com.revolut.feature.backend_flow.domain.models.Action
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF63229a() {
            return this.f63224a;
        }

        @Override // com.revolut.feature.backend_flow.domain.models.Action
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final String getF63230b() {
            return this.f63225b;
        }

        public final int hashCode() {
            return this.f63226c.hashCode() + p.a.c(this.f63224a.hashCode() * 31, 31, this.f63225b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63224a);
            dest.writeString(this.f63225b);
            dest.writeString(this.f63226c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/Action$Dismiss;", "Lcom/revolut/feature/backend_flow/domain/models/Action;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Dismiss implements Action {

        @NotNull
        public static final Parcelable.Creator<Dismiss> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f63228b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Dismiss(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Dismiss[i];
            }
        }

        public Dismiss(String id10, String title) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            this.f63227a = id10;
            this.f63228b = title;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Dismiss)) {
                return false;
            }
            Dismiss dismiss = (Dismiss) obj2;
            return Intrinsics.f(this.f63227a, dismiss.f63227a) && Intrinsics.f(this.f63228b, dismiss.f63228b);
        }

        @Override // com.revolut.feature.backend_flow.domain.models.Action
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF63229a() {
            return this.f63227a;
        }

        @Override // com.revolut.feature.backend_flow.domain.models.Action
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final String getF63230b() {
            return this.f63228b;
        }

        public final int hashCode() {
            return this.f63228b.hashCode() + (this.f63227a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63227a);
            dest.writeString(this.f63228b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/Action$Submit;", "Lcom/revolut/feature/backend_flow/domain/models/Action;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Submit implements Action {

        @NotNull
        public static final Parcelable.Creator<Submit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f63230b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f63231c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Submit(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Submit[i];
            }
        }

        public Submit(String id10, String title, boolean z) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            this.f63229a = id10;
            this.f63230b = title;
            this.f63231c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Submit)) {
                return false;
            }
            Submit submit = (Submit) obj2;
            return Intrinsics.f(this.f63229a, submit.f63229a) && Intrinsics.f(this.f63230b, submit.f63230b) && this.f63231c == submit.f63231c;
        }

        @Override // com.revolut.feature.backend_flow.domain.models.Action
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF63229a() {
            return this.f63229a;
        }

        @Override // com.revolut.feature.backend_flow.domain.models.Action
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final String getF63230b() {
            return this.f63230b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f63231c) + p.a.c(this.f63229a.hashCode() * 31, 31, this.f63230b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63229a);
            dest.writeString(this.f63230b);
            dest.writeInt(this.f63231c ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: getId */
    String getF63229a();

    /* JADX INFO: renamed from: getTitle */
    String getF63230b();
}
