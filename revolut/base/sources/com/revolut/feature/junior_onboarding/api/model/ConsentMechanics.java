package com.revolut.feature.junior_onboarding.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/junior_onboarding/api/model/ConsentMechanics;", "Landroid/os/Parcelable;", "<init>", "()V", "OptOut", "OptIn", "Lcom/revolut/feature/junior_onboarding/api/model/ConsentMechanics$OptIn;", "Lcom/revolut/feature/junior_onboarding/api/model/ConsentMechanics$OptOut;", "feature_junior_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ConsentMechanics implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_onboarding/api/model/ConsentMechanics$OptIn;", "Lcom/revolut/feature/junior_onboarding/api/model/ConsentMechanics;", "", "toString", "()Ljava/lang/String;", "feature_junior_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OptIn extends ConsentMechanics {

        @NotNull
        public static final Parcelable.Creator<OptIn> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v6d.a f76950a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OptIn(v6d.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OptIn[i];
            }
        }

        public OptIn(v6d.a consentName) {
            Intrinsics.checkNotNullParameter(consentName, "consentName");
            this.f76950a = consentName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OptIn) && this.f76950a == ((OptIn) obj2).f76950a;
        }

        public final int hashCode() {
            return this.f76950a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76950a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_onboarding/api/model/ConsentMechanics$OptOut;", "Lcom/revolut/feature/junior_onboarding/api/model/ConsentMechanics;", "", "toString", "()Ljava/lang/String;", "feature_junior_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OptOut extends ConsentMechanics {

        @NotNull
        public static final Parcelable.Creator<OptOut> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f76952b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f76953c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OptOut(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OptOut[i];
            }
        }

        public OptOut(String code, String title, boolean z) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(title, "title");
            this.f76951a = code;
            this.f76952b = title;
            this.f76953c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OptOut)) {
                return false;
            }
            OptOut optOut = (OptOut) obj2;
            return Intrinsics.f(this.f76951a, optOut.f76951a) && Intrinsics.f(this.f76952b, optOut.f76952b) && this.f76953c == optOut.f76953c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f76953c) + p.a.c(this.f76951a.hashCode() * 31, 31, this.f76952b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76951a);
            dest.writeString(this.f76952b);
            dest.writeInt(this.f76953c ? 1 : 0);
        }
    }

    private ConsentMechanics() {
    }
}
