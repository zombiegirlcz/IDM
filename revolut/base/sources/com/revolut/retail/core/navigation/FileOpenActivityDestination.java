package com.revolut.retail.core.navigation;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/core/navigation/FileOpenActivityDestination;", "Lcom/revolut/retail/core/navigation/ActivityDestination;", "", "toString", "()Ljava/lang/String;", "retail_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FileOpenActivityDestination extends ActivityDestination {

    @NotNull
    public static final Parcelable.Creator<FileOpenActivityDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f98640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f98641c;
    public final List d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            Uri uri2 = (Uri) parcel.readParcelable(FileOpenActivityDestination.class.getClassLoader());
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
            return new FileOpenActivityDestination(string, uri2, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FileOpenActivityDestination[i];
        }
    }

    public FileOpenActivityDestination(String action, Uri fileUri, String str, List permissionFlags) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(fileUri, "fileUri");
        Intrinsics.checkNotNullParameter(permissionFlags, "permissionFlags");
        this.f98639a = action;
        this.f98640b = fileUri;
        this.f98641c = str;
        this.d = permissionFlags;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF98639a() {
        return this.f98639a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Uri getF98640b() {
        return this.f98640b;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF98641c() {
        return this.f98641c;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getD() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FileOpenActivityDestination)) {
            return false;
        }
        FileOpenActivityDestination fileOpenActivityDestination = (FileOpenActivityDestination) obj2;
        return Intrinsics.f(this.f98639a, fileOpenActivityDestination.f98639a) && Intrinsics.f(this.f98640b, fileOpenActivityDestination.f98640b) && Intrinsics.f(this.f98641c, fileOpenActivityDestination.f98641c) && Intrinsics.f(this.d, fileOpenActivityDestination.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f98640b.hashCode() + (this.f98639a.hashCode() * 31)) * 31;
        String str = this.f98641c;
        return this.d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98639a);
        dest.writeParcelable(this.f98640b, i);
        dest.writeString(this.f98641c);
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeInt(((Number) itV.next()).intValue());
        }
    }
}
