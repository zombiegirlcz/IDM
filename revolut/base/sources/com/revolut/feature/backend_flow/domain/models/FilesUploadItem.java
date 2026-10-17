package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/FilesUploadItem;", "Lcom/revolut/feature/backend_flow/domain/models/BackendFlowUploadItem;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FilesUploadItem extends BackendFlowUploadItem {

    @NotNull
    public static final Parcelable.Creator<FilesUploadItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f63439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63440c;
    public final boolean d;
    public final List e;

    public static final class a implements Parcelable.Creator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            int i;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int iE = 0;
            if (parcel.readInt() != 0) {
                i = 1;
                z = true;
            } else {
                z = false;
                i = 1;
            }
            String string2 = parcel.readString();
            boolean z3 = parcel.readInt() != 0 ? i : 0;
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            while (iE != i2) {
                iE = j6.a.e(FilesUploadItem.class, parcel, arrayList, iE, i);
            }
            return new FilesUploadItem(string, string2, arrayList, z, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FilesUploadItem[i];
        }
    }

    public FilesUploadItem(String id10, String buttonTitle, List files, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(files, "files");
        this.f63438a = id10;
        this.f63439b = z;
        this.f63440c = buttonTitle;
        this.d = z3;
        this.e = files;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.BackendFlowUploadItem
    /* JADX INFO: renamed from: S8, reason: from getter */
    public final String getF63440c() {
        return this.f63440c;
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63438a() {
        return this.f63438a;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.BackendFlowUploadItem
    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getE() {
        return this.e;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final boolean getF63439b() {
        return this.f63439b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FilesUploadItem)) {
            return false;
        }
        FilesUploadItem filesUploadItem = (FilesUploadItem) obj2;
        return Intrinsics.f(this.f63438a, filesUploadItem.f63438a) && this.f63439b == filesUploadItem.f63439b && Intrinsics.f(this.f63440c, filesUploadItem.f63440c) && this.d == filesUploadItem.d && Intrinsics.f(this.e, filesUploadItem.e);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    public final String getId() {
        return this.f63438a;
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c(p.a.c(j6.a.c(this.f63438a.hashCode() * 31, 31, this.f63439b), 31, this.f63440c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63438a);
        dest.writeInt(this.f63439b ? 1 : 0);
        dest.writeString(this.f63440c);
        dest.writeInt(this.d ? 1 : 0);
        Iterator itV = p.a.v(this.e, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }
}
