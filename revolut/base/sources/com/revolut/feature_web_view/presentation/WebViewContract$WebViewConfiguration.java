package com.revolut.feature_web_view.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_web_view/presentation/WebViewContract$WebViewConfiguration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_web_view_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final /* data */ class WebViewContract$WebViewConfiguration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WebViewContract$WebViewConfiguration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f98175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f98176c;
    public final int d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f98177g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f98178h;
    public final Parcelable i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f98179j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f98180l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f98181m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f98182n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f98183p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f98184q;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            boolean z4;
            boolean z6;
            boolean z11;
            boolean z12;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            Clause clause = (Clause) parcel.readParcelable(WebViewContract$WebViewConfiguration.class.getClassLoader());
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            boolean z29 = false;
            boolean z31 = true;
            boolean z41 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z29 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
                z4 = z;
            } else {
                z3 = true;
                z31 = z;
                z4 = z31;
            }
            String string2 = parcel.readString();
            Parcelable parcelable = parcel.readParcelable(WebViewContract$WebViewConfiguration.class.getClassLoader());
            boolean z49 = z4;
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                z6 = z49;
                z49 = z3;
            } else {
                z6 = z49;
            }
            if (parcel.readInt() != 0) {
                z11 = z6;
                z6 = z3;
            } else {
                z11 = z6;
            }
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            boolean z54 = z11;
            String string6 = parcel.readString();
            if (parcel.readInt() != 0) {
                z12 = z54;
                z54 = z3;
            } else {
                z12 = z54;
            }
            if (parcel.readInt() != 0) {
                z12 = z3;
            }
            return new WebViewContract$WebViewConfiguration(string, clause, i, i2, z41, z29, z31, string2, parcelable, string3, z49, z6, string4, string5, string6, z54, z12);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WebViewContract$WebViewConfiguration[i];
        }
    }

    public WebViewContract$WebViewConfiguration(String url2, Clause clause, int i, int i2, boolean z, boolean z3, boolean z4, String str, Parcelable parcelable, String flowName, boolean z6, boolean z11, String str2, String str3, String str4, boolean z12, boolean z29) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(flowName, "flowName");
        this.f98174a = url2;
        this.f98175b = clause;
        this.f98176c = i;
        this.d = i2;
        this.e = z;
        this.f = z3;
        this.f98177g = z4;
        this.f98178h = str;
        this.i = parcelable;
        this.f98179j = flowName;
        this.k = z6;
        this.f98180l = z11;
        this.f98181m = str2;
        this.f98182n = str3;
        this.o = str4;
        this.f98183p = z12;
        this.f98184q = z29;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WebViewContract$WebViewConfiguration)) {
            return false;
        }
        WebViewContract$WebViewConfiguration webViewContract$WebViewConfiguration = (WebViewContract$WebViewConfiguration) obj2;
        return Intrinsics.f(this.f98174a, webViewContract$WebViewConfiguration.f98174a) && Intrinsics.f(this.f98175b, webViewContract$WebViewConfiguration.f98175b) && this.f98176c == webViewContract$WebViewConfiguration.f98176c && this.d == webViewContract$WebViewConfiguration.d && this.e == webViewContract$WebViewConfiguration.e && this.f == webViewContract$WebViewConfiguration.f && this.f98177g == webViewContract$WebViewConfiguration.f98177g && Intrinsics.f(this.f98178h, webViewContract$WebViewConfiguration.f98178h) && Intrinsics.f(this.i, webViewContract$WebViewConfiguration.i) && Intrinsics.f(this.f98179j, webViewContract$WebViewConfiguration.f98179j) && this.k == webViewContract$WebViewConfiguration.k && this.f98180l == webViewContract$WebViewConfiguration.f98180l && Intrinsics.f(this.f98181m, webViewContract$WebViewConfiguration.f98181m) && Intrinsics.f(this.f98182n, webViewContract$WebViewConfiguration.f98182n) && Intrinsics.f(this.o, webViewContract$WebViewConfiguration.o) && this.f98183p == webViewContract$WebViewConfiguration.f98183p && this.f98184q == webViewContract$WebViewConfiguration.f98184q;
    }

    public final int hashCode() {
        int iHashCode = this.f98174a.hashCode() * 31;
        Clause clause = this.f98175b;
        int iC = j6.a.c(j6.a.c(j6.a.c(j6.a.b(this.d, j6.a.b(this.f98176c, (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31), 31), 31, this.e), 31, this.f), 31, this.f98177g);
        String str = this.f98178h;
        int iHashCode2 = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Parcelable parcelable = this.i;
        int iC2 = j6.a.c(j6.a.c(p.a.c((iHashCode2 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31, this.f98179j), 31, this.k), 31, this.f98180l);
        String str2 = this.f98181m;
        int iHashCode3 = (iC2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f98182n;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.o;
        return Boolean.hashCode(this.f98184q) + j6.a.c((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.f98183p);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98174a);
        dest.writeParcelable(this.f98175b, i);
        dest.writeInt(this.f98176c);
        dest.writeInt(this.d);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeInt(this.f98177g ? 1 : 0);
        dest.writeString(this.f98178h);
        dest.writeParcelable(this.i, i);
        dest.writeString(this.f98179j);
        dest.writeInt(this.k ? 1 : 0);
        dest.writeInt(this.f98180l ? 1 : 0);
        dest.writeString(this.f98181m);
        dest.writeString(this.f98182n);
        dest.writeString(this.o);
        dest.writeInt(this.f98183p ? 1 : 0);
        dest.writeInt(this.f98184q ? 1 : 0);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ WebViewContract$WebViewConfiguration(java.lang.String r22, com.revolut.core.ui_kit.models.Clause r23, int r24, boolean r25, boolean r26, boolean r27, java.lang.String r28, android.os.Parcelable r29, java.lang.String r30, boolean r31, boolean r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, boolean r36, boolean r37, int r38) {
        /*
            r21 = this;
            r0 = r38
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L9
            r5 = r2
            goto Lb
        L9:
            r5 = r23
        Lb:
            r1 = r0 & 4
            if (r1 == 0) goto L13
            int r1 = com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_back
            r6 = r1
            goto L15
        L13:
            r6 = r24
        L15:
            int r7 = com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_back
            r1 = r0 & 16
            r3 = 0
            if (r1 == 0) goto L1e
            r8 = r3
            goto L20
        L1e:
            r8 = r25
        L20:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L26
            r11 = r2
            goto L28
        L26:
            r11 = r28
        L28:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L2e
            r12 = r2
            goto L30
        L2e:
            r12 = r29
        L30:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L38
            java.lang.String r1 = "WEB_VIEW_FLOW_NAME"
            r13 = r1
            goto L3a
        L38:
            r13 = r30
        L3a:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L40
            r14 = r3
            goto L42
        L40:
            r14 = r31
        L42:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L49
            r1 = 1
            r15 = r1
            goto L4b
        L49:
            r15 = r32
        L4b:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L52
            r16 = r2
            goto L54
        L52:
            r16 = r33
        L54:
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto L5b
            r17 = r2
            goto L5d
        L5b:
            r17 = r34
        L5d:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L64
            r18 = r2
            goto L66
        L64:
            r18 = r35
        L66:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L6f
            r19 = r3
            goto L71
        L6f:
            r19 = r36
        L71:
            r1 = 65536(0x10000, float:9.1835E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L81
            r20 = r3
            r4 = r22
            r9 = r26
            r10 = r27
            r3 = r21
            goto L8b
        L81:
            r20 = r37
            r3 = r21
            r4 = r22
            r9 = r26
            r10 = r27
        L8b:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature_web_view.presentation.WebViewContract$WebViewConfiguration.<init>(java.lang.String, com.revolut.core.ui_kit.models.Clause, int, boolean, boolean, boolean, java.lang.String, android.os.Parcelable, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, int):void");
    }
}
