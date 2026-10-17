package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/SummaryScreen;", "Lcom/revolut/feature/backend_flow/domain/models/BackendScreen;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SummaryScreen extends BackendScreen {

    @NotNull
    public static final Parcelable.Creator<SummaryScreen> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f63668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63669c;
    public final String d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(SummaryScreen.class, parcel, arrayList, iE, 1);
            }
            return new SummaryScreen(string, parcel.readString(), parcel.readString(), parcel.readString(), arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SummaryScreen[i];
        }
    }

    public SummaryScreen(String id10, String str, String str2, String str3, List items) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f63667a = id10;
        this.f63668b = items;
        this.f63669c = str;
        this.d = str2;
        this.e = str3;
    }

    public static SummaryScreen J(SummaryScreen summaryScreen, String str) {
        String id10 = summaryScreen.f63667a;
        List items = summaryScreen.f63668b;
        String str2 = summaryScreen.f63669c;
        String str3 = summaryScreen.d;
        summaryScreen.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(items, "items");
        return new SummaryScreen(id10, str2, str3, str, items);
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63667a() {
        return this.f63667a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SummaryScreen)) {
            return false;
        }
        SummaryScreen summaryScreen = (SummaryScreen) obj2;
        return Intrinsics.f(this.f63667a, summaryScreen.f63667a) && Intrinsics.f(this.f63668b, summaryScreen.f63668b) && Intrinsics.f(this.f63669c, summaryScreen.f63669c) && Intrinsics.f(this.d, summaryScreen.d) && Intrinsics.f(this.e, summaryScreen.e);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f63667a.hashCode() * 31, 31, this.f63668b);
        String str = this.f63669c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.BackendScreen
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getE() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63667a);
        Iterator itV = p.a.v(this.f63668b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeString(this.f63669c);
        dest.writeString(this.d);
        dest.writeString(this.e);
    }
}
