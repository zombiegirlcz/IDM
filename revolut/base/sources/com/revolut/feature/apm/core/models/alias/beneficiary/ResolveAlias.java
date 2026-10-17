package com.revolut.feature.apm.core.models.alias.beneficiary;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/core/models/alias/beneficiary/ResolveAlias;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "a02/a", "ExpectedOverrides", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ResolveAlias implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ResolveAlias> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a02.a f61903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f61904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExpectedOverrides f61905c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/alias/beneficiary/ResolveAlias$ExpectedOverrides;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExpectedOverrides implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ExpectedOverrides> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61906a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExpectedOverrides(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExpectedOverrides[i];
            }
        }

        public ExpectedOverrides(String str) {
            this.f61906a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ExpectedOverrides) && Intrinsics.f(this.f61906a, ((ExpectedOverrides) obj2).f61906a);
        }

        public final int hashCode() {
            String str = this.f61906a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f61906a);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ResolveAlias(a02.a.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : ExpectedOverrides.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ResolveAlias[i];
        }
    }

    public ResolveAlias(a02.a type, String value, ExpectedOverrides expectedOverrides) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f61903a = type;
        this.f61904b = value;
        this.f61905c = expectedOverrides;
    }

    public static ResolveAlias a(ResolveAlias resolveAlias, ExpectedOverrides expectedOverrides) {
        a02.a type = resolveAlias.f61903a;
        String value = resolveAlias.f61904b;
        resolveAlias.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        return new ResolveAlias(type, value, expectedOverrides);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ResolveAlias)) {
            return false;
        }
        ResolveAlias resolveAlias = (ResolveAlias) obj2;
        return this.f61903a == resolveAlias.f61903a && Intrinsics.f(this.f61904b, resolveAlias.f61904b) && Intrinsics.f(this.f61905c, resolveAlias.f61905c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f61903a.hashCode() * 31, 31, this.f61904b);
        ExpectedOverrides expectedOverrides = this.f61905c;
        return iC + (expectedOverrides == null ? 0 : expectedOverrides.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61903a.name());
        dest.writeString(this.f61904b);
        ExpectedOverrides expectedOverrides = this.f61905c;
        if (expectedOverrides == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            expectedOverrides.writeToParcel(dest, i);
        }
    }
}
