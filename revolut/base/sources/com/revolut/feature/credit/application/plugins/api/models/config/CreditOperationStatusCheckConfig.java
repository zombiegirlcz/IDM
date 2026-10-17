package com.revolut.feature.credit.application.plugins.api.models.config;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import it3.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/CreditOperationStatusCheckConfig;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/ScreenConfig;", "", "toString", "()Ljava/lang/String;", "Companion", "SpinnerContent", "a", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditOperationStatusCheckConfig extends ScreenConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f66353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f66354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f66355c;
    public final long d;
    public final WaitingPopupScreenConfig e;
    public final List f;

    @NotNull
    public static final Parcelable.Creator<CreditOperationStatusCheckConfig> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/CreditOperationStatusCheckConfig$SpinnerContent;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SpinnerContent implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SpinnerContent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f66356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f66357b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SpinnerContent((Clause) parcel.readParcelable(SpinnerContent.class.getClassLoader()), (Clause) parcel.readParcelable(SpinnerContent.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SpinnerContent[i];
            }
        }

        public SpinnerContent(Clause title, Clause subtitle) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.f66356a = title;
            this.f66357b = subtitle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SpinnerContent)) {
                return false;
            }
            SpinnerContent spinnerContent = (SpinnerContent) obj2;
            return Intrinsics.f(this.f66356a, spinnerContent.f66356a) && Intrinsics.f(this.f66357b, spinnerContent.f66357b);
        }

        public final int hashCode() {
            return this.f66357b.hashCode() + (this.f66356a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66356a, i);
            dest.writeParcelable(this.f66357b, i);
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(SpinnerContent.CREATOR, parcel, arrayList2, iA, 1);
            }
            long j2 = parcel.readLong();
            int i2 = parcel.readInt();
            long j3 = parcel.readLong();
            WaitingPopupScreenConfig waitingPopupScreenConfigCreateFromParcel = WaitingPopupScreenConfig.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i3 = parcel.readInt();
                arrayList = new ArrayList(i3);
                for (int i5 = 0; i5 != i3; i5++) {
                    arrayList.add(f.valueOf(parcel.readString()));
                }
            }
            return new CreditOperationStatusCheckConfig(arrayList2, j2, i2, j3, waitingPopupScreenConfigCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditOperationStatusCheckConfig[i];
        }
    }

    public CreditOperationStatusCheckConfig(List content, long j2, int i, long j3, WaitingPopupScreenConfig waitingPopupScreenConfig, List list) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(waitingPopupScreenConfig, "waitingPopupScreenConfig");
        this.f66353a = content;
        this.f66354b = j2;
        this.f66355c = i;
        this.d = j3;
        this.e = waitingPopupScreenConfig;
        this.f = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditOperationStatusCheckConfig)) {
            return false;
        }
        CreditOperationStatusCheckConfig creditOperationStatusCheckConfig = (CreditOperationStatusCheckConfig) obj2;
        return Intrinsics.f(this.f66353a, creditOperationStatusCheckConfig.f66353a) && this.f66354b == creditOperationStatusCheckConfig.f66354b && this.f66355c == creditOperationStatusCheckConfig.f66355c && this.d == creditOperationStatusCheckConfig.d && Intrinsics.f(this.e, creditOperationStatusCheckConfig.e) && Intrinsics.f(this.f, creditOperationStatusCheckConfig.f);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + d.c(j6.a.b(this.f66355c, d.c(this.f66353a.hashCode() * 31, 31, this.f66354b), 31), 31, this.d)) * 31;
        List list = this.f;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f66353a, dest);
        while (itV.hasNext()) {
            ((SpinnerContent) itV.next()).writeToParcel(dest, i);
        }
        dest.writeLong(this.f66354b);
        dest.writeInt(this.f66355c);
        dest.writeLong(this.d);
        this.e.writeToParcel(dest, i);
        List list = this.f;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = v0.a.q(dest, 1, list);
        while (itQ.hasNext()) {
            dest.writeString(((f) itQ.next()).name());
        }
    }
}
