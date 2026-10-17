package com.revolut.camerakit.ui.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/camerakit/ui/models/DocumentMaskModel;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "camera_kit_ui_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentMaskModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DocumentMaskModel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f50821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f50822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f50823c;
    public final Float d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(Guideline.CREATOR, parcel, arrayList, iA, 1);
            }
            return new DocumentMaskModel(arrayList, parcel.readFloat(), parcel.readFloat(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DocumentMaskModel[i];
        }
    }

    public DocumentMaskModel(List guidelines, float f, float f4, Float f5) {
        Intrinsics.checkNotNullParameter(guidelines, "guidelines");
        this.f50821a = guidelines;
        this.f50822b = f;
        this.f50823c = f4;
        this.d = f5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DocumentMaskModel)) {
            return false;
        }
        DocumentMaskModel documentMaskModel = (DocumentMaskModel) obj2;
        return Intrinsics.f(this.f50821a, documentMaskModel.f50821a) && Float.compare(this.f50822b, documentMaskModel.f50822b) == 0 && Float.compare(this.f50823c, documentMaskModel.f50823c) == 0 && Intrinsics.f(this.d, documentMaskModel.d);
    }

    public final int hashCode() {
        int iB = b.b(this.f50823c, b.b(this.f50822b, this.f50821a.hashCode() * 31, 31), 31);
        Float f = this.d;
        return iB + (f == null ? 0 : f.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f50821a, dest);
        while (itV.hasNext()) {
            ((Guideline) itV.next()).writeToParcel(dest, i);
        }
        dest.writeFloat(this.f50822b);
        dest.writeFloat(this.f50823c);
        Float f = this.d;
        if (f == null) {
            dest.writeInt(0);
        } else {
            r6.b.p(dest, 1, f);
        }
    }

    public /* synthetic */ DocumentMaskModel(List list, float f) {
        this(list, f, 8.0f, null);
    }
}
