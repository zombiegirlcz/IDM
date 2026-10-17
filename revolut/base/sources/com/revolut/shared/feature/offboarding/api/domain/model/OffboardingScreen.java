package com.revolut.shared.feature.offboarding.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/offboarding/api/domain/model/OffboardingScreen;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_offboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OffboardingScreen implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OffboardingScreen> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f104874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f104875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f104876c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            int iA2 = 0;
            while (iA2 != i) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(OffboardingRestriction.CREATOR, parcel, arrayList, iA2, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            int iA3 = 0;
            while (iA3 != i2) {
                iA3 = org.bouncycastle.jcajce.provider.digest.a.a(OffboardingScreenAction.CREATOR, parcel, arrayList2, iA3, 1);
            }
            int i3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i3);
            while (iA != i3) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(OffboardingInfo.CREATOR, parcel, arrayList3, iA, 1);
            }
            return new OffboardingScreen(string, string2, string3, arrayList, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OffboardingScreen[i];
        }
    }

    public OffboardingScreen(String title, String description, String status, ArrayList restrictions, ArrayList actions, ArrayList moreInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(restrictions, "restrictions");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(moreInfo, "moreInfo");
        this.f104874a = title;
        this.f104875b = description;
        this.f104876c = status;
        this.d = restrictions;
        this.e = actions;
        this.f = moreInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OffboardingScreen)) {
            return false;
        }
        OffboardingScreen offboardingScreen = (OffboardingScreen) obj2;
        return Intrinsics.f(this.f104874a, offboardingScreen.f104874a) && Intrinsics.f(this.f104875b, offboardingScreen.f104875b) && Intrinsics.f(this.f104876c, offboardingScreen.f104876c) && this.d.equals(offboardingScreen.d) && this.e.equals(offboardingScreen.e) && this.f.equals(offboardingScreen.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, p.a.c(p.a.c(this.f104874a.hashCode() * 31, 31, this.f104875b), 31, this.f104876c), 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f104874a);
        dest.writeString(this.f104875b);
        dest.writeString(this.f104876c);
        Iterator itY = j6.a.y(this.d, dest);
        while (itY.hasNext()) {
            ((OffboardingRestriction) itY.next()).writeToParcel(dest, i);
        }
        Iterator itY2 = j6.a.y(this.e, dest);
        while (itY2.hasNext()) {
            ((OffboardingScreenAction) itY2.next()).writeToParcel(dest, i);
        }
        Iterator itY3 = j6.a.y(this.f, dest);
        while (itY3.hasNext()) {
            ((OffboardingInfo) itY3.next()).writeToParcel(dest, i);
        }
    }
}
