package com.revolut.sso.impl.ui.reauthentication_wrapper.wrapper_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/sso/impl/ui/reauthentication_wrapper/wrapper_flow/ReauthenticationWrapperFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Regular", "Modal", "Lcom/revolut/sso/impl/ui/reauthentication_wrapper/wrapper_flow/ReauthenticationWrapperFlowContract$Step$Modal;", "Lcom/revolut/sso/impl/ui/reauthentication_wrapper/wrapper_flow/ReauthenticationWrapperFlowContract$Step$Regular;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ReauthenticationWrapperFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/reauthentication_wrapper/wrapper_flow/ReauthenticationWrapperFlowContract$Step$Modal;", "Lcom/revolut/sso/impl/ui/reauthentication_wrapper/wrapper_flow/ReauthenticationWrapperFlowContract$Step;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Modal implements ReauthenticationWrapperFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Modal f106691a = new Modal();

        @NotNull
        public static final Parcelable.Creator<Modal> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Modal.f106691a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Modal[i];
            }
        }

        private Modal() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/reauthentication_wrapper/wrapper_flow/ReauthenticationWrapperFlowContract$Step$Regular;", "Lcom/revolut/sso/impl/ui/reauthentication_wrapper/wrapper_flow/ReauthenticationWrapperFlowContract$Step;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Regular implements ReauthenticationWrapperFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Regular f106692a = new Regular();

        @NotNull
        public static final Parcelable.Creator<Regular> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Regular.f106692a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Regular[i];
            }
        }

        private Regular() {
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
