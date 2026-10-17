package com.revolut.retail.core.navigation;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/core/navigation/ImplicitActivityDestination;", "Lcom/revolut/retail/core/navigation/ActivityDestination;", "", "toString", "()Ljava/lang/String;", "retail_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ImplicitActivityDestination extends ActivityDestination {

    @NotNull
    public static final Parcelable.Creator<ImplicitActivityDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f98658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f98659c;
    public final String d;
    public final Uri e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            return new ImplicitActivityDestination((Uri) parcel.readParcelable(ImplicitActivityDestination.class.getClassLoader()), string, parcel.readString(), parcel.readString(), arrayListCreateStringArrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ImplicitActivityDestination[i];
        }
    }

    public ImplicitActivityDestination(Uri uri2, String action, String str, String str2, List categories) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(categories, "categories");
        this.f98657a = action;
        this.f98658b = categories;
        this.f98659c = str;
        this.d = str2;
        this.e = uri2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF98657a() {
        return this.f98657a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getF98658b() {
        return this.f98658b;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getF98659c() {
        return this.f98659c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Uri getE() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ImplicitActivityDestination)) {
            return false;
        }
        ImplicitActivityDestination implicitActivityDestination = (ImplicitActivityDestination) obj2;
        return Intrinsics.f(this.f98657a, implicitActivityDestination.f98657a) && Intrinsics.f(this.f98658b, implicitActivityDestination.f98658b) && Intrinsics.f(this.f98659c, implicitActivityDestination.f98659c) && Intrinsics.f(this.d, implicitActivityDestination.d) && Intrinsics.f(this.e, implicitActivityDestination.e);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f98657a.hashCode() * 31, 31, this.f98658b);
        String str = this.f98659c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Uri uri2 = this.e;
        return iHashCode2 + (uri2 != null ? uri2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98657a);
        dest.writeStringList(this.f98658b);
        dest.writeString(this.f98659c);
        dest.writeString(this.d);
        dest.writeParcelable(this.e, i);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public ImplicitActivityDestination(java.lang.String r7, java.util.List r8, java.lang.String r9, java.lang.String r10, android.net.Uri r11, int r12) {
        /*
            r6 = this;
            r0 = r12 & 2
            if (r0 == 0) goto L6
            zhm.f0 r8 = zhm.f0.f322471a
        L6:
            r5 = r8
            r8 = r12 & 4
            r0 = 0
            if (r8 == 0) goto Le
            r3 = r0
            goto Lf
        Le:
            r3 = r9
        Lf:
            r8 = r12 & 8
            if (r8 == 0) goto L15
            r4 = r0
            goto L16
        L15:
            r4 = r10
        L16:
            r8 = r12 & 16
            if (r8 == 0) goto L1e
            r1 = r0
            r2 = r7
            r0 = r6
            goto L21
        L1e:
            r1 = r11
            r0 = r6
            r2 = r7
        L21:
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.core.navigation.ImplicitActivityDestination.<init>(java.lang.String, java.util.List, java.lang.String, java.lang.String, android.net.Uri, int):void");
    }
}
