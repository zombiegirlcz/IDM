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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/BackendCardPhotoItem;", "Lcom/revolut/feature/backend_flow/domain/models/BackendFlowUploadItem;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BackendCardPhotoItem extends BackendFlowUploadItem {

    @NotNull
    public static final Parcelable.Creator<BackendCardPhotoItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f63258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63259c;
    public final List d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int iE = 0;
            boolean z = parcel.readInt() != 0;
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            while (iE != i) {
                iE = j6.a.e(BackendCardPhotoItem.class, parcel, arrayList, iE, 1);
            }
            return new BackendCardPhotoItem(arrayList, z, string, string2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BackendCardPhotoItem[i];
        }
    }

    public BackendCardPhotoItem(List files, boolean z, String id10, String buttonTitle) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(files, "files");
        this.f63257a = id10;
        this.f63258b = z;
        this.f63259c = buttonTitle;
        this.d = files;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.BackendFlowUploadItem
    /* JADX INFO: renamed from: S8, reason: from getter */
    public final String getF63259c() {
        return this.f63259c;
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63257a() {
        return this.f63257a;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.BackendFlowUploadItem
    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getD() {
        return this.d;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final boolean getF63258b() {
        return this.f63258b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BackendCardPhotoItem)) {
            return false;
        }
        BackendCardPhotoItem backendCardPhotoItem = (BackendCardPhotoItem) obj2;
        return Intrinsics.f(this.f63257a, backendCardPhotoItem.f63257a) && this.f63258b == backendCardPhotoItem.f63258b && Intrinsics.f(this.f63259c, backendCardPhotoItem.f63259c) && Intrinsics.f(this.d, backendCardPhotoItem.d);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    public final String getId() {
        return this.f63257a;
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(j6.a.c(this.f63257a.hashCode() * 31, 31, this.f63258b), 31, this.f63259c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63257a);
        dest.writeInt(this.f63258b ? 1 : 0);
        dest.writeString(this.f63259c);
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }
}
