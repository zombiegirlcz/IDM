package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xl2.c0;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/BackendFlow;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BackendFlow implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BackendFlow> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f63263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63265c;
    public final String d;
    public final List e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f63266g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f63267h;
    public final Map i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            c0 c0VarValueOf = c0.valueOf(parcel.readString());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iD = 0;
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(BackendFlow.class, parcel, arrayList, iE, 1);
            }
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i2 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                linkedHashMap.put(parcel.readString(), parcel.createStringArrayList());
            }
            int i5 = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(i5);
            while (iD != i5) {
                iD = j6.a.d(parcel, linkedHashMap2, parcel.readString(), iD, 1);
            }
            return new BackendFlow(c0VarValueOf, string, string2, string3, arrayList, string4, string5, linkedHashMap, linkedHashMap2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BackendFlow[i];
        }
    }

    public BackendFlow(c0 state, String id10, String name, String version, List screens, String str, String str2, Map parameters, Map attributes) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(screens, "screens");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f63263a = state;
        this.f63264b = id10;
        this.f63265c = name;
        this.d = version;
        this.e = screens;
        this.f = str;
        this.f63266g = str2;
        this.f63267h = parameters;
        this.i = attributes;
    }

    public static BackendFlow a(BackendFlow backendFlow, List list, String str, int i) {
        c0 state = backendFlow.f63263a;
        String id10 = backendFlow.f63264b;
        String name = backendFlow.f63265c;
        String version = backendFlow.d;
        if ((i & 16) != 0) {
            list = backendFlow.e;
        }
        List screens = list;
        String str2 = backendFlow.f;
        if ((i & 64) != 0) {
            str = backendFlow.f63266g;
        }
        Map parameters = backendFlow.f63267h;
        Map attributes = backendFlow.i;
        backendFlow.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(screens, "screens");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        return new BackendFlow(state, id10, name, version, screens, str2, str, parameters, attributes);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Map getI() {
        return this.i;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF63266g() {
        return this.f63266g;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Map getF63267h() {
        return this.f63267h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getE() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BackendFlow)) {
            return false;
        }
        BackendFlow backendFlow = (BackendFlow) obj2;
        return this.f63263a == backendFlow.f63263a && Intrinsics.f(this.f63264b, backendFlow.f63264b) && Intrinsics.f(this.f63265c, backendFlow.f63265c) && Intrinsics.f(this.d, backendFlow.d) && Intrinsics.f(this.e, backendFlow.e) && Intrinsics.f(this.f, backendFlow.f) && Intrinsics.f(this.f63266g, backendFlow.f63266g) && Intrinsics.f(this.f63267h, backendFlow.f63267h) && Intrinsics.f(this.i, backendFlow.i);
    }

    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF63264b() {
        return this.f63264b;
    }

    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getF63265c() {
        return this.f63265c;
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(p.a.c(p.a.c(this.f63263a.hashCode() * 31, 31, this.f63264b), 31, this.f63265c), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f63266g;
        return this.i.hashCode() + p.a.e((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f63267h);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final c0 getF63263a() {
        return this.f63263a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63263a.name());
        dest.writeString(this.f63264b);
        dest.writeString(this.f63265c);
        dest.writeString(this.d);
        Iterator itV = p.a.v(this.e, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeString(this.f);
        dest.writeString(this.f63266g);
        Iterator itZ = j6.a.z(this.f63267h, dest);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            dest.writeString((String) entry.getKey());
            dest.writeStringList((List) entry.getValue());
        }
        Iterator itZ2 = j6.a.z(this.i, dest);
        while (itZ2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) itZ2.next();
            dest.writeString((String) entry2.getKey());
            dest.writeString((String) entry2.getValue());
        }
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final String getD() {
        return this.d;
    }
}
