package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/BackendFlowIcon;", "Landroid/os/Parcelable;", "<init>", "()V", "Default", "Country", "Lcom/revolut/feature/backend_flow/domain/models/BackendFlowIcon$Country;", "Lcom/revolut/feature/backend_flow/domain/models/BackendFlowIcon$Default;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BackendFlowIcon implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/BackendFlowIcon$Country;", "Lcom/revolut/feature/backend_flow/domain/models/BackendFlowIcon;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Country extends BackendFlowIcon {

        @NotNull
        public static final Parcelable.Creator<Country> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63282a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Country(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Country[i];
            }
        }

        public Country(String countryCode) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f63282a = countryCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Country) && Intrinsics.f(this.f63282a, ((Country) obj2).f63282a);
        }

        public final int hashCode() {
            return this.f63282a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63282a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/BackendFlowIcon$Default;", "Lcom/revolut/feature/backend_flow/domain/models/BackendFlowIcon;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Default extends BackendFlowIcon {

        @NotNull
        public static final Parcelable.Creator<Default> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f63284b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Default(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Default[i];
            }
        }

        public Default(String str, String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f63283a = str;
            this.f63284b = name;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Default)) {
                return false;
            }
            Default r56 = (Default) obj2;
            return Intrinsics.f(this.f63283a, r56.f63283a) && Intrinsics.f(this.f63284b, r56.f63284b);
        }

        public final int hashCode() {
            String str = this.f63283a;
            return this.f63284b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63283a);
            dest.writeString(this.f63284b);
        }
    }

    private BackendFlowIcon() {
    }
}
