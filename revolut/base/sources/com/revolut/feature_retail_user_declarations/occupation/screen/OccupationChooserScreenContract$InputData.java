package com.revolut.feature_retail_user_declarations.occupation.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_retail_user_declarations/occupation/screen/OccupationChooserScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OccupationChooserScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<OccupationChooserScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f97702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f97703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f97704c;
    public final String d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            b bVar = (b) parcel.readSerializable();
            Image image = (Image) parcel.readParcelable(OccupationChooserScreenContract$InputData.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            while (true) {
                String string = parcel.readString();
                if (i2 == i) {
                    return new OccupationChooserScreenContract$InputData(bVar, image, arrayList, string, parcel.readString());
                }
                arrayList.add(tbi.a.valueOf(string));
                i2++;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OccupationChooserScreenContract$InputData[i];
        }
    }

    public OccupationChooserScreenContract$InputData(b bVar, Image image, List occupations, String str, String str2) {
        Intrinsics.checkNotNullParameter(occupations, "occupations");
        this.f97702a = bVar;
        this.f97703b = image;
        this.f97704c = occupations;
        this.d = str;
        this.e = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OccupationChooserScreenContract$InputData)) {
            return false;
        }
        OccupationChooserScreenContract$InputData occupationChooserScreenContract$InputData = (OccupationChooserScreenContract$InputData) obj2;
        return Intrinsics.f(this.f97702a, occupationChooserScreenContract$InputData.f97702a) && Intrinsics.f(this.f97703b, occupationChooserScreenContract$InputData.f97703b) && Intrinsics.f(this.f97704c, occupationChooserScreenContract$InputData.f97704c) && Intrinsics.f(this.d, occupationChooserScreenContract$InputData.d) && Intrinsics.f(this.e, occupationChooserScreenContract$InputData.e);
    }

    public final int hashCode() {
        b bVar = this.f97702a;
        int iHashCode = (bVar == null ? 0 : bVar.f297794a.hashCode()) * 31;
        Image image = this.f97703b;
        int iD = p.a.d((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.f97704c);
        String str = this.d;
        int iHashCode2 = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f97702a);
        dest.writeParcelable(this.f97703b, i);
        Iterator itV = p.a.v(this.f97704c, dest);
        while (itV.hasNext()) {
            dest.writeString(((tbi.a) itV.next()).name());
        }
        dest.writeString(this.d);
        dest.writeString(this.e);
    }
}
