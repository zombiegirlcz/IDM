package com.revolut.feature.be_driven_design.models.domain;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/be_driven_design/models/domain/FincrimeHomeScreenSection;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FincrimeHomeScreenSection implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FincrimeHomeScreenSection> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f64156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f64157c;

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
                iE = j6.a.e(FincrimeHomeScreenSection.class, parcel, arrayList, iE, 1);
            }
            return new FincrimeHomeScreenSection(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FincrimeHomeScreenSection[i];
        }
    }

    public FincrimeHomeScreenSection(String str, String str2, ArrayList sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f64155a = str;
        this.f64156b = str2;
        this.f64157c = sections;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FincrimeHomeScreenSection)) {
            return false;
        }
        FincrimeHomeScreenSection fincrimeHomeScreenSection = (FincrimeHomeScreenSection) obj2;
        return Intrinsics.f(this.f64155a, fincrimeHomeScreenSection.f64155a) && Intrinsics.f(this.f64156b, fincrimeHomeScreenSection.f64156b) && this.f64157c.equals(fincrimeHomeScreenSection.f64157c);
    }

    public final int hashCode() {
        String str = this.f64155a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f64156b;
        return this.f64157c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f64155a);
        dest.writeString(this.f64156b);
        Iterator itY = j6.a.y(this.f64157c, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
    }
}
