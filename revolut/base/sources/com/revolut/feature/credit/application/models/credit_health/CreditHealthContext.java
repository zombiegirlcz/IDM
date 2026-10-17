package com.revolut.feature.credit.application.models.credit_health;

import android.os.Parcel;
import android.os.Parcelable;
import ft3.h1;
import ft3.j1;
import gt3.f;
import it3.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/credit/application/models/credit_health/CreditHealthContext;", "Landroid/os/Parcelable;", "<init>", "()V", "AfterApplication", "BeforeApplication", "Lcom/revolut/feature/credit/application/models/credit_health/CreditHealthContext$AfterApplication;", "Lcom/revolut/feature/credit/application/models/credit_health/CreditHealthContext$BeforeApplication;", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CreditHealthContext implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/models/credit_health/CreditHealthContext$AfterApplication;", "Lcom/revolut/feature/credit/application/models/credit_health/CreditHealthContext;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AfterApplication extends CreditHealthContext {

        @NotNull
        public static final Parcelable.Creator<AfterApplication> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h1 f66235a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AfterApplication((h1) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AfterApplication[i];
            }
        }

        public AfterApplication(h1 payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            this.f66235a = payload;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AfterApplication) && Intrinsics.f(this.f66235a, ((AfterApplication) obj2).f66235a);
        }

        public final int hashCode() {
            return this.f66235a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f66235a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/models/credit_health/CreditHealthContext$BeforeApplication;", "Lcom/revolut/feature/credit/application/models/credit_health/CreditHealthContext;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BeforeApplication extends CreditHealthContext {

        @NotNull
        public static final Parcelable.Creator<BeforeApplication> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j1 f66236a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f66237b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final k f66238c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BeforeApplication(j1.valueOf(parcel.readString()), (f) parcel.readSerializable(), parcel.readInt() == 0 ? null : k.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BeforeApplication[i];
            }
        }

        public BeforeApplication(j1 productType, f fVar, k kVar) {
            Intrinsics.checkNotNullParameter(productType, "productType");
            this.f66236a = productType;
            this.f66237b = fVar;
            this.f66238c = kVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BeforeApplication)) {
                return false;
            }
            BeforeApplication beforeApplication = (BeforeApplication) obj2;
            return this.f66236a == beforeApplication.f66236a && Intrinsics.f(this.f66237b, beforeApplication.f66237b) && this.f66238c == beforeApplication.f66238c;
        }

        public final int hashCode() {
            int iHashCode = this.f66236a.hashCode() * 31;
            f fVar = this.f66237b;
            int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
            k kVar = this.f66238c;
            return iHashCode2 + (kVar != null ? kVar.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f66236a.name());
            dest.writeSerializable(this.f66237b);
            k kVar = this.f66238c;
            if (kVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(kVar.name());
            }
        }
    }

    private CreditHealthContext() {
    }
}
