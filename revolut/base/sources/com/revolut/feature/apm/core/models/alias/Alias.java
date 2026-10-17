package com.revolut.feature.apm.core.models.alias;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/alias/Alias;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Alias implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Alias> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AliasType f61878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f61879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AliasStatus f61880c;
    public final AliasAttributes d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Alias((AliasType) parcel.readParcelable(Alias.class.getClassLoader()), parcel.readString(), (AliasStatus) parcel.readParcelable(Alias.class.getClassLoader()), AliasAttributes.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Alias[i];
        }
    }

    public Alias(AliasType type, String value, AliasStatus status, AliasAttributes attributes) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f61878a = type;
        this.f61879b = value;
        this.f61880c = status;
        this.d = attributes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Alias)) {
            return false;
        }
        Alias alias = (Alias) obj2;
        return Intrinsics.f(this.f61878a, alias.f61878a) && Intrinsics.f(this.f61879b, alias.f61879b) && Intrinsics.f(this.f61880c, alias.f61880c) && Intrinsics.f(this.d, alias.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f61880c.hashCode() + p.a.c(this.f61878a.hashCode() * 31, 31, this.f61879b)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f61878a, i);
        dest.writeString(this.f61879b);
        dest.writeParcelable(this.f61880c, i);
        this.d.writeToParcel(dest, i);
    }

    public /* synthetic */ Alias(AliasType aliasType, String str, AliasStatus aliasStatus) {
        this(aliasType, str, aliasStatus, new AliasAttributes((String) null, (Boolean) null, (LocalDate) null, (String) null, 31));
    }
}
