package com.revolut.core.ui_kit_core.displayers.image.transformation;

import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/transformation/MaskTransformation;", "Lcom/revolut/core/ui_kit_core/displayers/image/transformation/ShapeTransformation;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MaskTransformation extends ShapeTransformation {

    @NotNull
    public static final Parcelable.Creator<MaskTransformation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f60067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PorterDuff.Mode f60068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f60069c;
    public final Integer d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MaskTransformation(parcel.readInt(), PorterDuff.Mode.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MaskTransformation[i];
        }
    }

    public MaskTransformation(int i, PorterDuff.Mode maskPorterDuffMode, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(maskPorterDuffMode, "maskPorterDuffMode");
        this.f60067a = i;
        this.f60068b = maskPorterDuffMode;
        this.f60069c = num;
        this.d = num2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF60067a() {
        return this.f60067a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final PorterDuff.Mode getF60068b() {
        return this.f60068b;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getF60069c() {
        return this.f60069c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MaskTransformation)) {
            return false;
        }
        MaskTransformation maskTransformation = (MaskTransformation) obj2;
        return this.f60067a == maskTransformation.f60067a && this.f60068b == maskTransformation.f60068b && Intrinsics.f(this.f60069c, maskTransformation.f60069c) && Intrinsics.f(this.d, maskTransformation.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f60068b.hashCode() + (Integer.hashCode(this.f60067a) * 31)) * 31;
        Integer num = this.f60069c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f60067a);
        dest.writeString(this.f60068b.name());
        Integer num = this.f60069c;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        Integer num2 = this.d;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num2);
        }
    }
}
