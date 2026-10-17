package com.revolut.feature.apm.core.models.blik;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/blik/BlikEligibilityTerms;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BlikEligibilityTerms implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BlikEligibilityTerms> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f61930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f61931c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(BlikEligibilityTerms.class, parcel, arrayList, iE, 1);
            }
            return new BlikEligibilityTerms(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlikEligibilityTerms[i];
        }
    }

    public BlikEligibilityTerms(String title, String subtitle, ArrayList scopes) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        this.f61929a = title;
        this.f61930b = subtitle;
        this.f61931c = scopes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BlikEligibilityTerms)) {
            return false;
        }
        BlikEligibilityTerms blikEligibilityTerms = (BlikEligibilityTerms) obj2;
        return Intrinsics.f(this.f61929a, blikEligibilityTerms.f61929a) && Intrinsics.f(this.f61930b, blikEligibilityTerms.f61930b) && this.f61931c.equals(blikEligibilityTerms.f61931c);
    }

    public final int hashCode() {
        return this.f61931c.hashCode() + p.a.c(this.f61929a.hashCode() * 31, 31, this.f61930b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61929a);
        dest.writeString(this.f61930b);
        Iterator itY = j6.a.y(this.f61931c, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
    }
}
