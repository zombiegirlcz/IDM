package com.revolut.kompot.navigable;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\u0007\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lcom/revolut/kompot/navigable/TransitionAnimation;", "Landroid/os/Parcelable;", "Companion", "NONE", "REPLACE", "SLIDE_END_TO_START", "SLIDE_START_TO_END", "FADE", "NonDefault", "ViewDelegated", "Custom", "a", "Lcom/revolut/kompot/navigable/ModalTransitionAnimation;", "Lcom/revolut/kompot/navigable/TransitionAnimation$FADE;", "Lcom/revolut/kompot/navigable/TransitionAnimation$NONE;", "Lcom/revolut/kompot/navigable/TransitionAnimation$NonDefault;", "Lcom/revolut/kompot/navigable/TransitionAnimation$REPLACE;", "Lcom/revolut/kompot/navigable/TransitionAnimation$SLIDE_END_TO_START;", "Lcom/revolut/kompot/navigable/TransitionAnimation$SLIDE_START_TO_END;", "kompot_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransitionAnimation extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f98397a;

    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/revolut/kompot/navigable/TransitionAnimation$Custom;", "Lcom/revolut/kompot/navigable/TransitionAnimation$NonDefault;", "kompot_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Custom extends NonDefault {
    }

    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/kompot/navigable/TransitionAnimation$FADE;", "Lcom/revolut/kompot/navigable/TransitionAnimation;", "<init>", "()V", "kompot_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FADE implements TransitionAnimation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FADE f98392a = new FADE();

        @NotNull
        public static final Parcelable.Creator<FADE> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FADE.f98392a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FADE[i];
            }
        }

        private FADE() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/kompot/navigable/TransitionAnimation$NONE;", "Lcom/revolut/kompot/navigable/TransitionAnimation;", "<init>", "()V", "kompot_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NONE implements TransitionAnimation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NONE f98393a = new NONE();

        @NotNull
        public static final Parcelable.Creator<NONE> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NONE.f98393a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NONE[i];
            }
        }

        private NONE() {
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

    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/kompot/navigable/TransitionAnimation$NonDefault;", "Lcom/revolut/kompot/navigable/TransitionAnimation;", "Lcom/revolut/kompot/navigable/TransitionAnimation$Custom;", "Lcom/revolut/kompot/navigable/TransitionAnimation$ViewDelegated;", "kompot_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface NonDefault extends TransitionAnimation {
    }

    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/kompot/navigable/TransitionAnimation$REPLACE;", "Lcom/revolut/kompot/navigable/TransitionAnimation;", "<init>", "()V", "kompot_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class REPLACE implements TransitionAnimation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final REPLACE f98394a = new REPLACE();

        @NotNull
        public static final Parcelable.Creator<REPLACE> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return REPLACE.f98394a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new REPLACE[i];
            }
        }

        private REPLACE() {
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

    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/kompot/navigable/TransitionAnimation$SLIDE_END_TO_START;", "Lcom/revolut/kompot/navigable/TransitionAnimation;", "<init>", "()V", "kompot_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SLIDE_END_TO_START implements TransitionAnimation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SLIDE_END_TO_START f98395a = new SLIDE_END_TO_START();

        @NotNull
        public static final Parcelable.Creator<SLIDE_END_TO_START> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SLIDE_END_TO_START.f98395a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SLIDE_END_TO_START[i];
            }
        }

        private SLIDE_END_TO_START() {
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

    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/kompot/navigable/TransitionAnimation$SLIDE_START_TO_END;", "Lcom/revolut/kompot/navigable/TransitionAnimation;", "<init>", "()V", "kompot_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SLIDE_START_TO_END implements TransitionAnimation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SLIDE_START_TO_END f98396a = new SLIDE_START_TO_END();

        @NotNull
        public static final Parcelable.Creator<SLIDE_START_TO_END> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SLIDE_START_TO_END.f98396a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SLIDE_START_TO_END[i];
            }
        }

        private SLIDE_START_TO_END() {
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

    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003À\u0006\u0003"}, d2 = {"Lcom/revolut/kompot/navigable/TransitionAnimation$ViewDelegated;", "Lcom/revolut/kompot/navigable/TransitionAnimation$NonDefault;", "com/revolut/kompot/navigable/c", "kompot_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface ViewDelegated extends NonDefault {
        int b0();
    }

    /* JADX INFO: renamed from: com.revolut.kompot.navigable.TransitionAnimation$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes10.dex */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f98397a = new Companion();

        private Companion() {
        }
    }

    default boolean I0() {
        return true;
    }

    default boolean m3() {
        return false;
    }
}
