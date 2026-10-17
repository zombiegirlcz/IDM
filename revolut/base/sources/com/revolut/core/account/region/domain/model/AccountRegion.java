package com.revolut.core.account.region.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003\u0088\u0001\u0004\u0092\u0001\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/account/region/domain/model/AccountRegion;", "Landroid/os/Parcelable;", "Companion", "a", "hostPrefix", "", "core_account_region_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AccountRegion implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51201a;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<AccountRegion> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.core.account.region.domain.model.AccountRegion$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static String a(String str) {
            if (str != null) {
                String lowerCase = d0.F0(str).toString().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (!d0.W(lowerCase)) {
                    return lowerCase;
                }
            }
            return "undefined";
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountRegion(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AccountRegion[i];
        }
    }

    public /* synthetic */ AccountRegion(String str) {
        this.f51201a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof AccountRegion) {
            return Intrinsics.f(this.f51201a, ((AccountRegion) obj2).f51201a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f51201a.hashCode();
    }

    public final String toString() {
        return a.p("AccountRegion(hostPrefix=", this.f51201a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f51201a);
    }
}
