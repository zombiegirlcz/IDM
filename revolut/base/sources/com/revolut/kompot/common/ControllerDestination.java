package com.revolut.kompot.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/kompot/common/ControllerDestination;", "Lcom/revolut/kompot/common/ParcelableDestination;", "Stack", "Modal", "Lcom/revolut/kompot/common/ControllerDestination$Modal;", "Lcom/revolut/kompot/common/ControllerDestination$Stack;", "kompot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ControllerDestination extends ParcelableDestination {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/kompot/common/ControllerDestination$Modal;", "Lcom/revolut/kompot/common/ControllerDestination;", "", "toString", "()Ljava/lang/String;", "kompot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Modal implements ControllerDestination {

        @NotNull
        public static final Parcelable.Creator<Modal> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ParcelableControllerDescriptor f98282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ModalDestination.Style f98283b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Modal((ParcelableControllerDescriptor) parcel.readParcelable(Modal.class.getClassLoader()), (ModalDestination.Style) parcel.readParcelable(Modal.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Modal[i];
            }
        }

        public Modal(ParcelableControllerDescriptor descriptor, ModalDestination.Style style) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(style, "style");
            this.f98282a = descriptor;
            this.f98283b = style;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ModalDestination.Style getF98283b() {
            return this.f98283b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Modal)) {
                return false;
            }
            Modal modal = (Modal) obj2;
            return Intrinsics.f(this.f98282a, modal.f98282a) && Intrinsics.f(this.f98283b, modal.f98283b);
        }

        @Override // com.revolut.kompot.common.ControllerDestination
        /* JADX INFO: renamed from: getDescriptor, reason: from getter */
        public final ParcelableControllerDescriptor getF98284a() {
            return this.f98282a;
        }

        public final int hashCode() {
            return this.f98283b.hashCode() + (this.f98282a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f98282a, i);
            dest.writeParcelable(this.f98283b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/kompot/common/ControllerDestination$Stack;", "Lcom/revolut/kompot/common/ControllerDestination;", "Lcom/revolut/kompot/common/StackDestination;", "", "toString", "()Ljava/lang/String;", "kompot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Stack implements ControllerDestination, StackDestination {

        @NotNull
        public static final Parcelable.Creator<Stack> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ParcelableControllerDescriptor f98284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TransitionAnimation f98285b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f98286c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Stack((ParcelableControllerDescriptor) parcel.readParcelable(Stack.class.getClassLoader()), (TransitionAnimation) parcel.readParcelable(Stack.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Stack[i];
            }
        }

        public Stack(ParcelableControllerDescriptor descriptor, TransitionAnimation transitionAnimation, boolean z) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            this.f98284a = descriptor;
            this.f98285b = transitionAnimation;
            this.f98286c = z;
        }

        @Override // aii.d0
        /* JADX INFO: renamed from: Y0, reason: from getter */
        public final TransitionAnimation getF98285b() {
            return this.f98285b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Stack)) {
                return false;
            }
            Stack stack = (Stack) obj2;
            return Intrinsics.f(this.f98284a, stack.f98284a) && Intrinsics.f(this.f98285b, stack.f98285b) && this.f98286c == stack.f98286c;
        }

        @Override // com.revolut.kompot.common.ControllerDestination
        /* JADX INFO: renamed from: getDescriptor, reason: from getter */
        public final ParcelableControllerDescriptor getF98284a() {
            return this.f98284a;
        }

        public final int hashCode() {
            int iHashCode = this.f98284a.hashCode() * 31;
            TransitionAnimation transitionAnimation = this.f98285b;
            return Boolean.hashCode(this.f98286c) + ((iHashCode + (transitionAnimation == null ? 0 : transitionAnimation.hashCode())) * 31);
        }

        @Override // aii.d0
        /* JADX INFO: renamed from: n1, reason: from getter */
        public final boolean getF98286c() {
            return this.f98286c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f98284a, i);
            dest.writeParcelable(this.f98285b, i);
            dest.writeInt(this.f98286c ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: getDescriptor */
    ParcelableControllerDescriptor getF98284a();
}
