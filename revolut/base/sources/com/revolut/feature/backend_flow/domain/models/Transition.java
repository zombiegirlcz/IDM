package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import h30.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/Transition;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Transition implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Transition> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f63708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63710c;
    public final Map d;
    public final StatusDialogScreen e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(Transition.class, parcel, arrayList, iE, 1);
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i2 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readValue(Transition.class.getClassLoader()));
                }
                linkedHashMap = linkedHashMap2;
            }
            return new Transition(arrayList, string, string2, linkedHashMap, parcel.readInt() != 0 ? StatusDialogScreen.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Transition[i];
        }
    }

    public Transition(ArrayList conditions, String id10, String str, Map map, StatusDialogScreen statusDialogScreen) {
        Intrinsics.checkNotNullParameter(conditions, "conditions");
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f63708a = conditions;
        this.f63709b = id10;
        this.f63710c = str;
        this.d = map;
        this.e = statusDialogScreen;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Transition)) {
            return false;
        }
        Transition transition = (Transition) obj2;
        return this.f63708a.equals(transition.f63708a) && Intrinsics.f(this.f63709b, transition.f63709b) && Intrinsics.f(this.f63710c, transition.f63710c) && Intrinsics.f(this.d, transition.d) && Intrinsics.f(this.e, transition.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f63708a.hashCode() * 31, 31, this.f63709b);
        String str = this.f63710c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.d;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        StatusDialogScreen statusDialogScreen = this.e;
        return iHashCode2 + (statusDialogScreen != null ? statusDialogScreen.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itY = j6.a.y(this.f63708a, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
        dest.writeString(this.f63709b);
        dest.writeString(this.f63710c);
        Map map = this.d;
        if (map == null) {
            dest.writeInt(0);
        } else {
            Iterator itV = l.v(dest, 1, map);
            while (itV.hasNext()) {
                Map.Entry entry = (Map.Entry) itV.next();
                dest.writeString((String) entry.getKey());
                dest.writeValue(entry.getValue());
            }
        }
        StatusDialogScreen statusDialogScreen = this.e;
        if (statusDialogScreen == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            statusDialogScreen.writeToParcel(dest, i);
        }
    }
}
