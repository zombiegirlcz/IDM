package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.feature.esim.api.model.EsimIcon;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimMobilePlanPerk;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimMobilePlanPerk implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimMobilePlanPerk> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f100302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f100303c;
    public final String d;
    public final EsimInfoBottomSheetData e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            EsimIcon.Url urlCreateFromParcel = parcel.readInt() == 0 ? null : EsimIcon.Url.CREATOR.createFromParcel(parcel);
            return new EsimMobilePlanPerk(string, string2, string3, urlCreateFromParcel != null ? urlCreateFromParcel.f100282a : null, parcel.readInt() != 0 ? EsimInfoBottomSheetData.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimMobilePlanPerk[i];
        }
    }

    public EsimMobilePlanPerk(String name, String value, String str, String str2, EsimInfoBottomSheetData esimInfoBottomSheetData) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f100301a = name;
        this.f100302b = value;
        this.f100303c = str;
        this.d = str2;
        this.e = esimInfoBottomSheetData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.revolut.retail.feature.esim.api.model.EsimMobilePlanPerk
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.revolut.retail.feature.esim.api.model.EsimMobilePlanPerk r5 = (com.revolut.retail.feature.esim.api.model.EsimMobilePlanPerk) r5
            java.lang.String r1 = r4.f100301a
            java.lang.String r3 = r5.f100301a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f100302b
            java.lang.String r3 = r5.f100302b
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.f100303c
            java.lang.String r3 = r5.f100303c
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r5.d
            java.lang.String r3 = r4.d
            if (r3 != 0) goto L39
            if (r1 != 0) goto L37
            r1 = r0
            goto L40
        L37:
            r1 = r2
            goto L40
        L39:
            if (r1 != 0) goto L3c
            goto L37
        L3c:
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r3, r1)
        L40:
            if (r1 != 0) goto L43
            return r2
        L43:
            com.revolut.retail.feature.esim.api.model.EsimInfoBottomSheetData r1 = r4.e
            com.revolut.retail.feature.esim.api.model.EsimInfoBottomSheetData r5 = r5.e
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r1, r5)
            if (r5 != 0) goto L4e
            return r2
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.esim.api.model.EsimMobilePlanPerk.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iC = p.a.c(this.f100301a.hashCode() * 31, 31, this.f100302b);
        String str = this.f100303c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        EsimInfoBottomSheetData esimInfoBottomSheetData = this.e;
        return iHashCode2 + (esimInfoBottomSheetData != null ? esimInfoBottomSheetData.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100301a);
        dest.writeString(this.f100302b);
        dest.writeString(this.f100303c);
        String str = this.d;
        if (str == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(str);
        }
        EsimInfoBottomSheetData esimInfoBottomSheetData = this.e;
        if (esimInfoBottomSheetData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimInfoBottomSheetData.writeToParcel(dest, i);
        }
    }
}
