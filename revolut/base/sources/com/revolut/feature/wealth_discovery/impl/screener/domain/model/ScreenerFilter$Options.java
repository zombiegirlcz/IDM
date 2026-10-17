package com.revolut.feature.wealth_discovery.impl.screener.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerOption;
import h30.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import soh.c;
import soh.e;
import zel.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004:\u0001\bJ\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"com/revolut/feature/wealth_discovery/impl/screener/domain/model/ScreenerFilter$Options", "Lcom/revolut/feature/wealth_discovery/impl/screener/domain/model/ScreenerOption;", "T", "Lsoh/e;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "soh/c", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ScreenerFilter$Options<T extends ScreenerOption> implements e, Parcelable {

    @NotNull
    public static final Parcelable.Creator<ScreenerFilter$Options<?>> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f96154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f96155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScreenerFilterInfo f96156c;
    public final c d;
    public final ArrayList e;
    public final Map f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f96157g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            g gVarValueOf = g.valueOf(parcel.readString());
            Clause clause = (Clause) parcel.readParcelable(ScreenerFilter$Options.class.getClassLoader());
            ScreenerFilterInfo screenerFilterInfo = (ScreenerFilterInfo) parcel.readParcelable(ScreenerFilter$Options.class.getClassLoader());
            c cVarValueOf = c.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(ScreenerFilter$Options.class, parcel, arrayList, iE, 1);
            }
            int i2 = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                linkedHashMap2.put(parcel.readParcelable(ScreenerFilter$Options.class.getClassLoader()), parcel.readParcelable(ScreenerFilter$Options.class.getClassLoader()));
            }
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i5 = parcel.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    linkedHashMap3.put(parcel.readParcelable(ScreenerFilter$Options.class.getClassLoader()), parcel.readParcelable(ScreenerFilter$Options.class.getClassLoader()));
                }
                linkedHashMap = linkedHashMap3;
            }
            return new ScreenerFilter$Options(gVarValueOf, clause, screenerFilterInfo, cVarValueOf, arrayList, linkedHashMap2, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ScreenerFilter$Options[i];
        }
    }

    public ScreenerFilter$Options(g metric, Clause title, ScreenerFilterInfo infoDialog, c viewType, ArrayList values, Map optionNames, Map map) {
        Intrinsics.checkNotNullParameter(metric, "metric");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(infoDialog, "infoDialog");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(optionNames, "optionNames");
        this.f96154a = metric;
        this.f96155b = title;
        this.f96156c = infoDialog;
        this.d = viewType;
        this.e = values;
        this.f = optionNames;
        this.f96157g = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ScreenerFilter$Options)) {
            return false;
        }
        ScreenerFilter$Options screenerFilter$Options = (ScreenerFilter$Options) obj2;
        return this.f96154a == screenerFilter$Options.f96154a && Intrinsics.f(this.f96155b, screenerFilter$Options.f96155b) && Intrinsics.f(this.f96156c, screenerFilter$Options.f96156c) && this.d == screenerFilter$Options.d && this.e.equals(screenerFilter$Options.e) && Intrinsics.f(this.f, screenerFilter$Options.f) && Intrinsics.f(this.f96157g, screenerFilter$Options.f96157g);
    }

    public final int hashCode() {
        int iE = p.a.e(com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, (this.d.hashCode() + ((this.f96156c.hashCode() + p.a.a(this.f96154a.hashCode() * 31, 31, this.f96155b)) * 31)) * 31, 31), 31, this.f);
        Map map = this.f96157g;
        return iE + (map == null ? 0 : map.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f96154a.name());
        dest.writeParcelable(this.f96155b, i);
        dest.writeParcelable(this.f96156c, i);
        dest.writeString(this.d.name());
        Iterator itY = j6.a.y(this.e, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
        Iterator itZ = j6.a.z(this.f, dest);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            dest.writeParcelable((Parcelable) entry.getKey(), i);
            dest.writeParcelable((Parcelable) entry.getValue(), i);
        }
        Map map = this.f96157g;
        if (map == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itV = l.v(dest, 1, map);
        while (itV.hasNext()) {
            Map.Entry entry2 = (Map.Entry) itV.next();
            dest.writeParcelable((Parcelable) entry2.getKey(), i);
            dest.writeParcelable((Parcelable) entry2.getValue(), i);
        }
    }
}
