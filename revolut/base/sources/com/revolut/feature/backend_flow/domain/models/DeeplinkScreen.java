package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/DeeplinkScreen;", "Lcom/revolut/feature/backend_flow/domain/models/BackendScreen;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeeplinkScreen extends BackendScreen {

    @NotNull
    public static final Parcelable.Creator<DeeplinkScreen> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f63392c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeeplinkScreen(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeeplinkScreen[i];
        }
    }

    public DeeplinkScreen(String id10, String link, String str, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(link, "link");
        this.f63390a = id10;
        this.f63391b = link;
        this.f63392c = z;
        this.d = str;
    }

    public static DeeplinkScreen J(DeeplinkScreen deeplinkScreen, String str) {
        String id10 = deeplinkScreen.f63390a;
        String link = deeplinkScreen.f63391b;
        boolean z = deeplinkScreen.f63392c;
        deeplinkScreen.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(link, "link");
        return new DeeplinkScreen(id10, link, str, z);
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63390a() {
        return this.f63390a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeeplinkScreen)) {
            return false;
        }
        DeeplinkScreen deeplinkScreen = (DeeplinkScreen) obj2;
        return Intrinsics.f(this.f63390a, deeplinkScreen.f63390a) && Intrinsics.f(this.f63391b, deeplinkScreen.f63391b) && this.f63392c == deeplinkScreen.f63392c && Intrinsics.f(this.d, deeplinkScreen.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(this.f63390a.hashCode() * 31, 31, this.f63391b), 31, this.f63392c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // com.revolut.feature.backend_flow.domain.models.BackendScreen
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getD() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63390a);
        dest.writeString(this.f63391b);
        dest.writeInt(this.f63392c ? 1 : 0);
        dest.writeString(this.d);
    }
}
