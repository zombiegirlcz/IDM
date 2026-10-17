package com.revolut.feature.licenses.impl.ui.licenses.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/licenses/impl/ui/licenses/model/LicenseItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_licenses_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LicenseItem implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f78045c;
    public final String d;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<LicenseItem> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.feature.licenses.impl.ui.licenses.model.LicenseItem$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LicenseItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LicenseItem[i];
        }
    }

    public LicenseItem(String id10, String name, String url2, String html) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(html, "html");
        this.f78043a = id10;
        this.f78044b = name;
        this.f78045c = url2;
        this.d = html;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LicenseItem)) {
            return false;
        }
        LicenseItem licenseItem = (LicenseItem) obj2;
        return Intrinsics.f(this.f78043a, licenseItem.f78043a) && Intrinsics.f(this.f78044b, licenseItem.f78044b) && Intrinsics.f(this.f78045c, licenseItem.f78045c) && Intrinsics.f(this.d, licenseItem.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a.c(a.c(this.f78043a.hashCode() * 31, 31, this.f78044b), 31, this.f78045c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f78043a);
        dest.writeString(this.f78044b);
        dest.writeString(this.f78045c);
        dest.writeString(this.d);
    }
}
