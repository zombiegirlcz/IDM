package com.revolut.core.backend_flow.impl.ui.base_form_screen;

import android.os.Parcel;
import android.os.Parcelable;
import cli.i;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ya0.a;

/* JADX INFO: loaded from: classes19.dex */
public final class FormScreenSaveStateDelegate extends i {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/backend_flow/impl/ui/base_form_screen/FormScreenSaveStateDelegate$RetainedBackendScreenDomainState;", "Lya0/a;", "Lcom/revolut/feature/backend_flow/domain/models/FormScreen;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RetainedBackendScreenDomainState implements ya0.a, Parcelable {

        @NotNull
        public static final Parcelable.Creator<RetainedBackendScreenDomainState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FormScreen f51257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f51258b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RetainedBackendScreenDomainState((FormScreen) parcel.readParcelable(RetainedBackendScreenDomainState.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RetainedBackendScreenDomainState[i];
            }
        }

        public RetainedBackendScreenDomainState(FormScreen screen, String searchQuery) {
            Intrinsics.checkNotNullParameter(screen, "screen");
            Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
            this.f51257a = screen;
            this.f51258b = searchQuery;
        }

        @Override // ya0.a
        public final BackendScreen b() {
            return this.f51257a;
        }

        @Override // ya0.a
        public final ya0.a c0(RetainedBackendScreenDomainState updatedState) {
            Intrinsics.checkNotNullParameter(updatedState, "updatedState");
            throw new UnsupportedOperationException("RetainedBackendScreenDomainState doesn't support copy method");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RetainedBackendScreenDomainState)) {
                return false;
            }
            RetainedBackendScreenDomainState retainedBackendScreenDomainState = (RetainedBackendScreenDomainState) obj2;
            return Intrinsics.f(this.f51257a, retainedBackendScreenDomainState.f51257a) && Intrinsics.f(this.f51258b, retainedBackendScreenDomainState.f51258b);
        }

        public final int hashCode() {
            return this.f51258b.hashCode() + (this.f51257a.hashCode() * 31);
        }

        @Override // ya0.a
        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getF51258b() {
            return this.f51258b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f51257a, i);
            dest.writeString(this.f51258b);
        }
    }

    @Override // cli.i
    public final Parcelable a(Object obj2) {
        a other = (a) obj2;
        Intrinsics.checkNotNullParameter(other, "currentState");
        Intrinsics.checkNotNullParameter(other, "other");
        return new RetainedBackendScreenDomainState((FormScreen) other.b(), other.getF51258b());
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        a initialState = (a) obj2;
        RetainedBackendScreenDomainState retainedState = (RetainedBackendScreenDomainState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        a aVarC0 = initialState.c0(retainedState);
        Intrinsics.i(aVarC0, "null cannot be cast to non-null type S of com.revolut.core.backend_flow.impl.ui.base_form_screen.FormScreenSaveStateDelegate");
        return aVarC0;
    }
}
