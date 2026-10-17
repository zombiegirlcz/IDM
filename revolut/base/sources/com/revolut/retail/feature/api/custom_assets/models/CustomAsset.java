package com.revolut.retail.feature.api.custom_assets.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import h30.l;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vzi.b;
import vzi.c;
import vzi.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/custom_assets/models/CustomAsset;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_analytics_cycle_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CustomAsset implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CustomAsset> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f99216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f99217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f99218c;
    public final ArrayList d;
    public final ZonedDateTime e;
    public final ZonedDateTime f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ZonedDateTime f99219g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f99220h;
    public final Map i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i f99221j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f99222l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f99223m;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            b bVarValueOf = b.valueOf(parcel.readString());
            d dVar = (d) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(ValueHistoryEntry.CREATOR, parcel, arrayList, iA, 1);
            }
            ZonedDateTime zonedDateTime = (ZonedDateTime) parcel.readSerializable();
            ZonedDateTime zonedDateTime2 = (ZonedDateTime) parcel.readSerializable();
            ZonedDateTime zonedDateTime3 = (ZonedDateTime) parcel.readSerializable();
            c cVarValueOf = c.valueOf(parcel.readString());
            int i2 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                linkedHashMap.put(parcel.readString(), parcel.readValue(CustomAsset.class.getClassLoader()));
            }
            return new CustomAsset(string, bVarValueOf, dVar, arrayList, zonedDateTime, zonedDateTime2, zonedDateTime3, cVarValueOf, linkedHashMap, i.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CustomAsset[i];
        }
    }

    public CustomAsset(String id10, b category, d dVar, ArrayList valueHistory, ZonedDateTime zonedDateTime, ZonedDateTime createdAt, ZonedDateTime updatedAt, c state, Map attributes, i currentValueSource, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(valueHistory, "valueHistory");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(currentValueSource, "currentValueSource");
        this.f99216a = id10;
        this.f99217b = category;
        this.f99218c = dVar;
        this.d = valueHistory;
        this.e = zonedDateTime;
        this.f = createdAt;
        this.f99219g = updatedAt;
        this.f99220h = state;
        this.i = attributes;
        this.f99221j = currentValueSource;
        this.k = z;
        this.f99222l = z3;
        this.f99223m = z && currentValueSource == i.USER && !z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CustomAsset)) {
            return false;
        }
        CustomAsset customAsset = (CustomAsset) obj2;
        return Intrinsics.f(this.f99216a, customAsset.f99216a) && this.f99217b == customAsset.f99217b && Intrinsics.f(this.f99218c, customAsset.f99218c) && this.d.equals(customAsset.d) && Intrinsics.f(this.e, customAsset.e) && Intrinsics.f(this.f, customAsset.f) && Intrinsics.f(this.f99219g, customAsset.f99219g) && this.f99220h == customAsset.f99220h && this.i.equals(customAsset.i) && this.f99221j == customAsset.f99221j && this.k == customAsset.k && this.f99222l == customAsset.f99222l;
    }

    public final int hashCode() {
        int iHashCode = (this.f99217b.hashCode() + (this.f99216a.hashCode() * 31)) * 31;
        d dVar = this.f99218c;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31);
        ZonedDateTime zonedDateTime = this.e;
        return Boolean.hashCode(this.f99222l) + j6.a.c((this.f99221j.hashCode() + p.a.e((this.f99220h.hashCode() + l.h(this.f99219g, l.h(this.f, (iB + (zonedDateTime != null ? zonedDateTime.hashCode() : 0)) * 31, 31), 31)) * 31, 31, this.i)) * 31, 31, this.k);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f99216a);
        dest.writeString(this.f99217b.name());
        dest.writeSerializable(this.f99218c);
        Iterator itY = j6.a.y(this.d, dest);
        while (itY.hasNext()) {
            ((ValueHistoryEntry) itY.next()).writeToParcel(dest, i);
        }
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        dest.writeSerializable(this.f99219g);
        dest.writeString(this.f99220h.name());
        Iterator itZ = j6.a.z(this.i, dest);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            dest.writeString((String) entry.getKey());
            dest.writeValue(entry.getValue());
        }
        dest.writeString(this.f99221j.name());
        dest.writeInt(this.k ? 1 : 0);
        dest.writeInt(this.f99222l ? 1 : 0);
    }
}
