package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xl2.z;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/TutorialScreen;", "Lcom/revolut/feature/backend_flow/domain/models/BackendScreen;", "Lxl2/z;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TutorialScreen extends BackendScreen implements z {

    @NotNull
    public static final Parcelable.Creator<TutorialScreen> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PollingInfo f63712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63713c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f63714g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageItem f63715h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f63716j;
    public final String k;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TutorialScreen(parcel.readString(), parcel.readInt() == 0 ? null : PollingInfo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (ImageItem) parcel.readParcelable(TutorialScreen.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TutorialScreen[i];
        }
    }

    public TutorialScreen(String id10, PollingInfo pollingInfo, String str, String str2, String title, String str3, String lottieUrl, ImageItem imageItem, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(lottieUrl, "lottieUrl");
        this.f63711a = id10;
        this.f63712b = pollingInfo;
        this.f63713c = str;
        this.d = str2;
        this.e = title;
        this.f = str3;
        this.f63714g = lottieUrl;
        this.f63715h = imageItem;
        this.i = str4;
        this.f63716j = str5;
        this.k = str6;
    }

    public static TutorialScreen J(TutorialScreen tutorialScreen, String str) {
        String id10 = tutorialScreen.f63711a;
        PollingInfo pollingInfo = tutorialScreen.f63712b;
        String str2 = tutorialScreen.f63713c;
        String str3 = tutorialScreen.d;
        String title = tutorialScreen.e;
        String str4 = tutorialScreen.f;
        String lottieUrl = tutorialScreen.f63714g;
        ImageItem imageItem = tutorialScreen.f63715h;
        String str5 = tutorialScreen.i;
        String str6 = tutorialScreen.f63716j;
        tutorialScreen.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(lottieUrl, "lottieUrl");
        return new TutorialScreen(id10, pollingInfo, str2, str3, title, str4, lottieUrl, imageItem, str5, str6, str);
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63711a() {
        return this.f63711a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TutorialScreen)) {
            return false;
        }
        TutorialScreen tutorialScreen = (TutorialScreen) obj2;
        return Intrinsics.f(this.f63711a, tutorialScreen.f63711a) && Intrinsics.f(this.f63712b, tutorialScreen.f63712b) && Intrinsics.f(this.f63713c, tutorialScreen.f63713c) && Intrinsics.f(this.d, tutorialScreen.d) && Intrinsics.f(this.e, tutorialScreen.e) && Intrinsics.f(this.f, tutorialScreen.f) && Intrinsics.f(this.f63714g, tutorialScreen.f63714g) && Intrinsics.f(this.f63715h, tutorialScreen.f63715h) && Intrinsics.f(this.i, tutorialScreen.i) && Intrinsics.f(this.f63716j, tutorialScreen.f63716j) && Intrinsics.f(this.k, tutorialScreen.k);
    }

    public final int hashCode() {
        int iHashCode = this.f63711a.hashCode() * 31;
        PollingInfo pollingInfo = this.f63712b;
        int iHashCode2 = (iHashCode + (pollingInfo == null ? 0 : Long.hashCode(pollingInfo.f63577a))) * 31;
        String str = this.f63713c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iC = p.a.c((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e);
        String str3 = this.f;
        int iC2 = p.a.c((iC + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f63714g);
        ImageItem imageItem = this.f63715h;
        int iHashCode4 = (iC2 + (imageItem == null ? 0 : imageItem.hashCode())) * 31;
        String str4 = this.i;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f63716j;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.k;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.BackendScreen
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getK() {
        return this.k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63711a);
        PollingInfo pollingInfo = this.f63712b;
        if (pollingInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pollingInfo.writeToParcel(dest, i);
        }
        dest.writeString(this.f63713c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f63714g);
        dest.writeParcelable(this.f63715h, i);
        dest.writeString(this.i);
        dest.writeString(this.f63716j);
        dest.writeString(this.k);
    }
}
