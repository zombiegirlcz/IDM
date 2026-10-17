package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import h30.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xl2.d0;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/StatusDialogScreen;", "Lcom/revolut/feature/backend_flow/domain/models/BackendScreen;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StatusDialogScreen extends BackendScreen {

    @NotNull
    public static final Parcelable.Creator<StatusDialogScreen> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63660c;
    public final d0 d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f63661g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f63662h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            d0 d0VarValueOf = d0.valueOf(parcel.readString());
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readValue(StatusDialogScreen.class.getClassLoader()));
                }
                linkedHashMap = linkedHashMap2;
            }
            return new StatusDialogScreen(string, string2, string3, d0VarValueOf, string4, string5, linkedHashMap, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StatusDialogScreen[i];
        }
    }

    public StatusDialogScreen(String id10, String title, String str, d0 type, String str2, String str3, Map map, String str4) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f63658a = id10;
        this.f63659b = title;
        this.f63660c = str;
        this.d = type;
        this.e = str2;
        this.f = str3;
        this.f63661g = map;
        this.f63662h = str4;
    }

    public static StatusDialogScreen J(StatusDialogScreen statusDialogScreen, String str) {
        String id10 = statusDialogScreen.f63658a;
        String title = statusDialogScreen.f63659b;
        String str2 = statusDialogScreen.f63660c;
        d0 type = statusDialogScreen.d;
        String str3 = statusDialogScreen.e;
        String str4 = statusDialogScreen.f;
        Map map = statusDialogScreen.f63661g;
        statusDialogScreen.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        return new StatusDialogScreen(id10, title, str2, type, str3, str4, map, str);
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63658a() {
        return this.f63658a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StatusDialogScreen)) {
            return false;
        }
        StatusDialogScreen statusDialogScreen = (StatusDialogScreen) obj2;
        return Intrinsics.f(this.f63658a, statusDialogScreen.f63658a) && Intrinsics.f(this.f63659b, statusDialogScreen.f63659b) && Intrinsics.f(this.f63660c, statusDialogScreen.f63660c) && this.d == statusDialogScreen.d && Intrinsics.f(this.e, statusDialogScreen.e) && Intrinsics.f(this.f, statusDialogScreen.f) && Intrinsics.f(this.f63661g, statusDialogScreen.f63661g) && Intrinsics.f(this.f63662h, statusDialogScreen.f63662h);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f63658a.hashCode() * 31, 31, this.f63659b);
        String str = this.f63660c;
        int iHashCode = (this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map map = this.f63661g;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        String str4 = this.f63662h;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.BackendScreen
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getF63662h() {
        return this.f63662h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63658a);
        dest.writeString(this.f63659b);
        dest.writeString(this.f63660c);
        dest.writeString(this.d.name());
        dest.writeString(this.e);
        dest.writeString(this.f);
        Map map = this.f63661g;
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
        dest.writeString(this.f63662h);
    }
}
