package com.revolut.feature.licenses.impl.ui.licenses.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/licenses/impl/ui/licenses/model/LibraryItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_licenses_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LibraryItem implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f78042c;
    public final String d;
    public final String e;
    public final LicenseItem f;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<LibraryItem> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.feature.licenses.impl.ui.licenses.model.LibraryItem$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LibraryItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), LicenseItem.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LibraryItem[i];
        }
    }

    public LibraryItem(String identifier, String groupId, String artifactId, String version, String name, LicenseItem licenseItem) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(artifactId, "artifactId");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(licenseItem, "licenseItem");
        this.f78040a = identifier;
        this.f78041b = groupId;
        this.f78042c = artifactId;
        this.d = version;
        this.e = name;
        this.f = licenseItem;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LibraryItem)) {
            return false;
        }
        LibraryItem libraryItem = (LibraryItem) obj2;
        return Intrinsics.f(this.f78040a, libraryItem.f78040a) && Intrinsics.f(this.f78041b, libraryItem.f78041b) && Intrinsics.f(this.f78042c, libraryItem.f78042c) && Intrinsics.f(this.d, libraryItem.d) && Intrinsics.f(this.e, libraryItem.e) && Intrinsics.f(this.f, libraryItem.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + a.c(a.c(a.c(a.c(this.f78040a.hashCode() * 31, 31, this.f78041b), 31, this.f78042c), 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f78040a);
        dest.writeString(this.f78041b);
        dest.writeString(this.f78042c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        this.f.writeToParcel(dest, i);
    }
}
