package com.revolut.core.ui_kit_core.displayers.image.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/ResourceImage;", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "Lgz0/c;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ResourceImage implements Image, gz0.c {

    @NotNull
    public static final Parcelable.Creator<ResourceImage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f59995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f59996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f59997c;
    public final Integer d;
    public final List e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageTransformations f59998g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Clause f59999h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int i2 = parcel.readInt();
                arrayList = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList.add(Integer.valueOf(parcel.readInt()));
                }
            }
            return new ResourceImage(i, numValueOf, numValueOf2, numValueOf3, arrayList, parcel.readInt() != 0, ImageTransformations.CREATOR.createFromParcel(parcel), (Clause) parcel.readParcelable(ResourceImage.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ResourceImage[i];
        }
    }

    public ResourceImage(int i, Integer num, Integer num2, Integer num3, List list, boolean z, ImageTransformations transformations, Clause clause) {
        Intrinsics.checkNotNullParameter(transformations, "transformations");
        this.f59995a = i;
        this.f59996b = num;
        this.f59997c = num2;
        this.d = num3;
        this.e = list;
        this.f = z;
        this.f59998g = transformations;
        this.f59999h = clause;
    }

    public static ResourceImage a(ResourceImage resourceImage, int i, Integer num, ImageTransformations imageTransformations, int i2) {
        if ((i2 & 1) != 0) {
            i = resourceImage.f59995a;
        }
        int i3 = i;
        Integer num2 = resourceImage.f59996b;
        Integer num3 = resourceImage.f59997c;
        if ((i2 & 8) != 0) {
            num = resourceImage.d;
        }
        Integer num4 = num;
        List list = resourceImage.e;
        boolean z = resourceImage.f;
        if ((i2 & 64) != 0) {
            imageTransformations = resourceImage.f59998g;
        }
        ImageTransformations transformations = imageTransformations;
        Clause clause = resourceImage.f59999h;
        resourceImage.getClass();
        Intrinsics.checkNotNullParameter(transformations, "transformations");
        return new ResourceImage(i3, num2, num3, num4, list, z, transformations, clause);
    }

    @Override // gz0.c
    /* JADX INFO: renamed from: b, reason: from getter */
    public final ImageTransformations getF59919c() {
        return this.f59998g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ResourceImage)) {
            return false;
        }
        ResourceImage resourceImage = (ResourceImage) obj2;
        return this.f59995a == resourceImage.f59995a && Intrinsics.f(this.f59996b, resourceImage.f59996b) && Intrinsics.f(this.f59997c, resourceImage.f59997c) && Intrinsics.f(this.d, resourceImage.d) && Intrinsics.f(this.e, resourceImage.e) && this.f == resourceImage.f && Intrinsics.f(this.f59998g, resourceImage.f59998g) && Intrinsics.f(this.f59999h, resourceImage.f59999h);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getD() {
        return this.f59999h;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f59995a) * 31;
        Integer num = this.f59996b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f59997c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List list = this.e;
        int iHashCode5 = (this.f59998g.hashCode() + j6.a.c((iHashCode4 + (list == null ? 0 : list.hashCode())) * 31, 31, this.f)) * 31;
        Clause clause = this.f59999h;
        return iHashCode5 + (clause != null ? clause.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f59995a);
        Integer num = this.f59996b;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        Integer num2 = this.f59997c;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num2);
        }
        Integer num3 = this.d;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num3);
        }
        List list = this.e;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeInt(((Number) itQ.next()).intValue());
            }
        }
        dest.writeInt(this.f ? 1 : 0);
        this.f59998g.writeToParcel(dest, i);
        dest.writeParcelable(this.f59999h, i);
    }

    public /* synthetic */ ResourceImage(int i, Integer num, Integer num2, Integer num3, List list, ImageTransformations imageTransformations, Clause clause, int i2) {
        this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : num2, (i2 & 8) != 0 ? null : num3, (i2 & 16) != 0 ? null : list, (i2 & 32) != 0, (i2 & 64) != 0 ? new ImageTransformations(null, null, null, gz0.b.CenterInside, null, null, null, LDSFile.EF_SOD_TAG) : imageTransformations, (i2 & 128) != 0 ? null : clause);
    }
}
