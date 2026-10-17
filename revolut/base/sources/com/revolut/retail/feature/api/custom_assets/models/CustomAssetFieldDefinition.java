package com.revolut.retail.feature.api.custom_assets.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;
import vzi.e;
import vzi.f;
import vzi.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/api/custom_assets/models/CustomAssetFieldDefinition;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_analytics_cycle_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CustomAssetFieldDefinition implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f99227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f99228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f99229c;
    public final List d;
    public final List e;
    public final Integer f;

    @NotNull
    public static final Parcelable.Creator<CustomAssetFieldDefinition> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            f fVarValueOf = f.valueOf(parcel.readString());
            e eVarValueOf = e.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(i.valueOf(parcel.readString()));
            }
            return new CustomAssetFieldDefinition(string, fVarValueOf, eVarValueOf, arrayList, parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CustomAssetFieldDefinition[i];
        }
    }

    public CustomAssetFieldDefinition(String name, f type, e component, List requiredFor, List options, Integer num) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(requiredFor, "requiredFor");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f99227a = name;
        this.f99228b = type;
        this.f99229c = component;
        this.d = requiredFor;
        this.e = options;
        this.f = num;
    }

    public final boolean a(boolean z) {
        return this.d.contains(z ? i.SMART_ESTIMATION : i.USER);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CustomAssetFieldDefinition)) {
            return false;
        }
        CustomAssetFieldDefinition customAssetFieldDefinition = (CustomAssetFieldDefinition) obj2;
        return Intrinsics.f(this.f99227a, customAssetFieldDefinition.f99227a) && this.f99228b == customAssetFieldDefinition.f99228b && this.f99229c == customAssetFieldDefinition.f99229c && Intrinsics.f(this.d, customAssetFieldDefinition.d) && Intrinsics.f(this.e, customAssetFieldDefinition.e) && Intrinsics.f(this.f, customAssetFieldDefinition.f);
    }

    public final int hashCode() {
        int iD = a.d(a.d((this.f99229c.hashCode() + ((this.f99228b.hashCode() + (this.f99227a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e);
        Integer num = this.f;
        return iD + (num == null ? 0 : num.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f99227a);
        dest.writeString(this.f99228b.name());
        dest.writeString(this.f99229c.name());
        Iterator itV = a.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeString(((i) itV.next()).name());
        }
        dest.writeStringList(this.e);
        Integer num = this.f;
        if (num == null) {
            dest.writeInt(0);
        } else {
            a.B(dest, 1, num);
        }
    }
}
