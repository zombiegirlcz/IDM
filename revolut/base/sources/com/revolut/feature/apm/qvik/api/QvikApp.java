package com.revolut.feature.apm.qvik.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/qvik/api/QvikApp;", "Landroid/os/Parcelable;", "Revolut", "ThirdParty", "Lcom/revolut/feature/apm/qvik/api/QvikApp$Revolut;", "Lcom/revolut/feature/apm/qvik/api/QvikApp$ThirdParty;", "feature_apm_qvik_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface QvikApp extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/qvik/api/QvikApp$Revolut;", "Lcom/revolut/feature/apm/qvik/api/QvikApp;", "", "toString", "()Ljava/lang/String;", "feature_apm_qvik_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Revolut implements QvikApp {

        @NotNull
        public static final Parcelable.Creator<Revolut> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f62765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f62766b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Image f62767c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Revolut((Clause) parcel.readParcelable(Revolut.class.getClassLoader()), (Image) parcel.readParcelable(Revolut.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Revolut[i];
            }
        }

        public Revolut(Clause label, Image logo, String packageName) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(logo, "logo");
            this.f62765a = packageName;
            this.f62766b = label;
            this.f62767c = logo;
        }

        @Override // com.revolut.feature.apm.qvik.api.QvikApp
        /* JADX INFO: renamed from: F, reason: from getter */
        public final Image getF62770c() {
            return this.f62767c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Revolut)) {
                return false;
            }
            Revolut revolut = (Revolut) obj2;
            return Intrinsics.f(this.f62765a, revolut.f62765a) && Intrinsics.f(this.f62766b, revolut.f62766b) && Intrinsics.f(this.f62767c, revolut.f62767c);
        }

        @Override // com.revolut.feature.apm.qvik.api.QvikApp
        /* JADX INFO: renamed from: getLabel, reason: from getter */
        public final Clause getF62769b() {
            return this.f62766b;
        }

        public final int hashCode() {
            return this.f62767c.hashCode() + p.a.a(this.f62765a.hashCode() * 31, 31, this.f62766b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f62765a);
            dest.writeParcelable(this.f62766b, i);
            dest.writeParcelable(this.f62767c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/qvik/api/QvikApp$ThirdParty;", "Lcom/revolut/feature/apm/qvik/api/QvikApp;", "", "toString", "()Ljava/lang/String;", "feature_apm_qvik_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ThirdParty implements QvikApp {

        @NotNull
        public static final Parcelable.Creator<ThirdParty> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f62768a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f62769b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Image f62770c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ThirdParty((Clause) parcel.readParcelable(ThirdParty.class.getClassLoader()), (Image) parcel.readParcelable(ThirdParty.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ThirdParty[i];
            }
        }

        public ThirdParty(Clause label, Image logo, String packageName) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(logo, "logo");
            this.f62768a = packageName;
            this.f62769b = label;
            this.f62770c = logo;
        }

        @Override // com.revolut.feature.apm.qvik.api.QvikApp
        /* JADX INFO: renamed from: F, reason: from getter */
        public final Image getF62770c() {
            return this.f62770c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ThirdParty)) {
                return false;
            }
            ThirdParty thirdParty = (ThirdParty) obj2;
            return Intrinsics.f(this.f62768a, thirdParty.f62768a) && Intrinsics.f(this.f62769b, thirdParty.f62769b) && Intrinsics.f(this.f62770c, thirdParty.f62770c);
        }

        @Override // com.revolut.feature.apm.qvik.api.QvikApp
        /* JADX INFO: renamed from: getLabel, reason: from getter */
        public final Clause getF62769b() {
            return this.f62769b;
        }

        public final int hashCode() {
            return this.f62770c.hashCode() + p.a.a(this.f62768a.hashCode() * 31, 31, this.f62769b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f62768a);
            dest.writeParcelable(this.f62769b, i);
            dest.writeParcelable(this.f62770c, i);
        }
    }

    /* JADX INFO: renamed from: F */
    Image getF62770c();

    /* JADX INFO: renamed from: getLabel */
    Clause getF62769b();
}
