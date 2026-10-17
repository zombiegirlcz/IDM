package com.revolut.feature.transaction.troubleshooter.api.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transaction/troubleshooter/api/domain/models/Troubleshooter;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_troubleshooter_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Troubleshooter implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Troubleshooter> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f91842c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f91843g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TroubleshooterSubContent f91844h;
    public final TroubleshooterAction i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f91845j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(TroubleshooterAction.CREATOR, parcel, arrayList, iA, 1);
            }
            return new Troubleshooter(string, string2, string3, string4, string5, string6, arrayList, parcel.readInt() == 0 ? null : TroubleshooterSubContent.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? TroubleshooterAction.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Troubleshooter[i];
        }
    }

    public Troubleshooter(String id10, String title, String key, String str, String str2, String str3, ArrayList actions, TroubleshooterSubContent troubleshooterSubContent, TroubleshooterAction troubleshooterAction, String str4) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f91840a = id10;
        this.f91841b = title;
        this.f91842c = key;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.f91843g = actions;
        this.f91844h = troubleshooterSubContent;
        this.i = troubleshooterAction;
        this.f91845j = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Troubleshooter)) {
            return false;
        }
        Troubleshooter troubleshooter = (Troubleshooter) obj2;
        return Intrinsics.f(this.f91840a, troubleshooter.f91840a) && Intrinsics.f(this.f91841b, troubleshooter.f91841b) && Intrinsics.f(this.f91842c, troubleshooter.f91842c) && Intrinsics.f(this.d, troubleshooter.d) && Intrinsics.f(this.e, troubleshooter.e) && Intrinsics.f(this.f, troubleshooter.f) && this.f91843g.equals(troubleshooter.f91843g) && Intrinsics.f(this.f91844h, troubleshooter.f91844h) && Intrinsics.f(this.i, troubleshooter.i) && Intrinsics.f(this.f91845j, troubleshooter.f91845j);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f91840a.hashCode() * 31, 31, this.f91841b), 31, this.f91842c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f91843g, (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        TroubleshooterSubContent troubleshooterSubContent = this.f91844h;
        int iHashCode3 = (iB + (troubleshooterSubContent == null ? 0 : troubleshooterSubContent.hashCode())) * 31;
        TroubleshooterAction troubleshooterAction = this.i;
        int iHashCode4 = (iHashCode3 + (troubleshooterAction == null ? 0 : troubleshooterAction.hashCode())) * 31;
        String str4 = this.f91845j;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91840a);
        dest.writeString(this.f91841b);
        dest.writeString(this.f91842c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        Iterator itY = j6.a.y(this.f91843g, dest);
        while (itY.hasNext()) {
            ((TroubleshooterAction) itY.next()).writeToParcel(dest, i);
        }
        TroubleshooterSubContent troubleshooterSubContent = this.f91844h;
        if (troubleshooterSubContent == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            troubleshooterSubContent.writeToParcel(dest, i);
        }
        TroubleshooterAction troubleshooterAction = this.i;
        if (troubleshooterAction == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            troubleshooterAction.writeToParcel(dest, i);
        }
        dest.writeString(this.f91845j);
    }
}
