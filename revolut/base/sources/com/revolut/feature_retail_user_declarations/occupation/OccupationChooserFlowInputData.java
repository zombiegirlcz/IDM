package com.revolut.feature_retail_user_declarations.occupation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/occupation/OccupationChooserFlowInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OccupationChooserFlowInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<OccupationChooserFlowInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f97697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f97698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f97699c;
    public final String d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            b bVar = (b) parcel.readSerializable();
            Image image = (Image) parcel.readParcelable(OccupationChooserFlowInputData.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            while (true) {
                String string = parcel.readString();
                if (i2 == i) {
                    return new OccupationChooserFlowInputData(bVar, image, arrayList, string, parcel.readString());
                }
                arrayList.add(tbi.a.valueOf(string));
                i2++;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OccupationChooserFlowInputData[i];
        }
    }

    public OccupationChooserFlowInputData() {
        this(null, null, 31);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OccupationChooserFlowInputData)) {
            return false;
        }
        OccupationChooserFlowInputData occupationChooserFlowInputData = (OccupationChooserFlowInputData) obj2;
        return Intrinsics.f(this.f97697a, occupationChooserFlowInputData.f97697a) && Intrinsics.f(this.f97698b, occupationChooserFlowInputData.f97698b) && Intrinsics.f(this.f97699c, occupationChooserFlowInputData.f97699c) && Intrinsics.f(this.d, occupationChooserFlowInputData.d) && Intrinsics.f(this.e, occupationChooserFlowInputData.e);
    }

    public final int hashCode() {
        b bVar = this.f97697a;
        int iHashCode = (bVar == null ? 0 : bVar.f297794a.hashCode()) * 31;
        Image image = this.f97698b;
        int iD = p.a.d((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.f97699c);
        String str = this.d;
        int iHashCode2 = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f97697a);
        dest.writeParcelable(this.f97698b, i);
        Iterator itV = p.a.v(this.f97699c, dest);
        while (itV.hasNext()) {
            dest.writeString(((tbi.a) itV.next()).name());
        }
        dest.writeString(this.d);
        dest.writeString(this.e);
    }

    public OccupationChooserFlowInputData(b bVar, Image image, List occupations, String str, String str2) {
        Intrinsics.checkNotNullParameter(occupations, "occupations");
        this.f97697a = bVar;
        this.f97698b = image;
        this.f97699c = occupations;
        this.d = str;
        this.e = str2;
    }

    public OccupationChooserFlowInputData(b bVar, ResourceImage resourceImage, int i) {
        this((i & 1) != 0 ? null : bVar, (i & 2) != 0 ? null : resourceImage, f0.f322471a, null, null);
    }
}
