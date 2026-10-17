package com.revolut.feature.apm.core.models.recipients;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/core/models/recipients/ApmContact;", "Lcom/revolut/feature/apm/core/models/recipients/ApmRecipient;", "State", "SimpleState", "Lcom/revolut/feature/apm/core/models/recipients/AaniContact;", "Lcom/revolut/feature/apm/core/models/recipients/BizumContact;", "Lcom/revolut/feature/apm/core/models/recipients/BlikContact;", "Lcom/revolut/feature/apm/core/models/recipients/BrebContact;", "Lcom/revolut/feature/apm/core/models/recipients/IrisContact;", "Lcom/revolut/feature/apm/core/models/recipients/MultibancoContact;", "Lcom/revolut/feature/apm/core/models/recipients/PixContact;", "Lcom/revolut/feature/apm/core/models/recipients/QvikContact;", "Lcom/revolut/feature/apm/core/models/recipients/SpinContact;", "Lcom/revolut/feature/apm/core/models/recipients/WeroContact;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ApmContact extends ApmRecipient {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/recipients/ApmContact$SimpleState;", "Lcom/revolut/feature/apm/core/models/recipients/ApmContact$State;", "Lcom/revolut/feature/apm/core/models/recipients/ApmContact$State$ACTIVE;", "Lcom/revolut/feature/apm/core/models/recipients/ApmContact$State$DELETED;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class SimpleState extends State {
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/core/models/recipients/ApmContact$State;", "Landroid/os/Parcelable;", "ACTIVE", "DELETED", "NOT_REGISTERED", "Lcom/revolut/feature/apm/core/models/recipients/ApmContact$SimpleState;", "Lcom/revolut/feature/apm/core/models/recipients/ApmContact$State$NOT_REGISTERED;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class State implements Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/recipients/ApmContact$State$ACTIVE;", "Lcom/revolut/feature/apm/core/models/recipients/ApmContact$SimpleState;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class ACTIVE extends SimpleState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final ACTIVE f62099a = new ACTIVE();

            @NotNull
            public static final Parcelable.Creator<ACTIVE> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ACTIVE.f62099a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ACTIVE[i];
                }
            }

            private ACTIVE() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/recipients/ApmContact$State$DELETED;", "Lcom/revolut/feature/apm/core/models/recipients/ApmContact$SimpleState;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class DELETED extends SimpleState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final DELETED f62100a = new DELETED();

            @NotNull
            public static final Parcelable.Creator<DELETED> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return DELETED.f62100a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new DELETED[i];
                }
            }

            private DELETED() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/recipients/ApmContact$State$NOT_REGISTERED;", "Lcom/revolut/feature/apm/core/models/recipients/ApmContact$State;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class NOT_REGISTERED extends State {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final NOT_REGISTERED f62101a = new NOT_REGISTERED();

            @NotNull
            public static final Parcelable.Creator<NOT_REGISTERED> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return NOT_REGISTERED.f62101a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NOT_REGISTERED[i];
                }
            }

            private NOT_REGISTERED() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }
    }

    default IdentityType P1() {
        return IdentityType.PERSONAL;
    }

    String S4();

    String getAlias();

    ApmDescriptor getDescriptor();

    State getState();

    @Override // com.revolut.feature.apm.core.models.recipients.ApmRecipient
    default String x0() {
        return getDescriptor().getF62112a();
    }
}
