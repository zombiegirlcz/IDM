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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/CameraUploadItem;", "Lcom/revolut/feature/backend_flow/domain/models/BackendFlowUploadItem;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CameraUploadItem extends BackendFlowUploadItem {

    @NotNull
    public static final Parcelable.Creator<CameraUploadItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f63337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63338c;
    public final List d;
    public final CameraSource e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int iE = 0;
            boolean z = true;
            if (parcel.readInt() != 0) {
                i = 1;
            } else {
                i = 1;
                z = false;
            }
            String string2 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            while (iE != i2) {
                iE = j6.a.e(CameraUploadItem.class, parcel, arrayList, iE, i);
            }
            return new CameraUploadItem(string, z, string2, arrayList, (CameraSource) parcel.readParcelable(CameraUploadItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CameraUploadItem[i];
        }
    }

    public CameraUploadItem(String id10, boolean z, String buttonTitle, List files, CameraSource defaultSource) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(files, "files");
        Intrinsics.checkNotNullParameter(defaultSource, "defaultSource");
        this.f63336a = id10;
        this.f63337b = z;
        this.f63338c = buttonTitle;
        this.d = files;
        this.e = defaultSource;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.BackendFlowUploadItem
    /* JADX INFO: renamed from: S8, reason: from getter */
    public final String getF63338c() {
        return this.f63338c;
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63336a() {
        return this.f63336a;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.BackendFlowUploadItem
    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getD() {
        return this.d;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final boolean getF63337b() {
        return this.f63337b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CameraUploadItem)) {
            return false;
        }
        CameraUploadItem cameraUploadItem = (CameraUploadItem) obj2;
        return Intrinsics.f(this.f63336a, cameraUploadItem.f63336a) && this.f63337b == cameraUploadItem.f63337b && Intrinsics.f(this.f63338c, cameraUploadItem.f63338c) && Intrinsics.f(this.d, cameraUploadItem.d) && Intrinsics.f(this.e, cameraUploadItem.e);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    public final String getId() {
        return this.f63336a;
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.d(p.a.c(j6.a.c(this.f63336a.hashCode() * 31, 31, this.f63337b), 31, this.f63338c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63336a);
        dest.writeInt(this.f63337b ? 1 : 0);
        dest.writeString(this.f63338c);
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeParcelable(this.e, i);
    }
}
