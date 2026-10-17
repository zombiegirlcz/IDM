package com.revolut.retail.toast.mediator;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/retail/toast/mediator/ToastViewAction;", "Landroid/os/Parcelable;", "<init>", "()V", "Show", "Update", "Hide", "Lcom/revolut/retail/toast/mediator/ToastViewAction$Hide;", "Lcom/revolut/retail/toast/mediator/ToastViewAction$Show;", "Lcom/revolut/retail/toast/mediator/ToastViewAction$Update;", "retail_toast_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ToastViewAction implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/toast/mediator/ToastViewAction$Hide;", "Lcom/revolut/retail/toast/mediator/ToastViewAction;", "<init>", "()V", "retail_toast_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Hide extends ToastViewAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Hide f104446a = new Hide();

        @NotNull
        public static final Parcelable.Creator<Hide> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Hide.f104446a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Hide[i];
            }
        }

        private Hide() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/toast/mediator/ToastViewAction$Update;", "Lcom/revolut/retail/toast/mediator/ToastViewAction;", "", "toString", "()Ljava/lang/String;", "retail_toast_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Update extends ToastViewAction {

        @NotNull
        public static final Parcelable.Creator<Update> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f104449a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Update((Clause) parcel.readParcelable(Update.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Update[i];
            }
        }

        public Update(Clause text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.f104449a = text;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Update) && Intrinsics.f(this.f104449a, ((Update) obj2).f104449a);
        }

        public final int hashCode() {
            return this.f104449a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f104449a, i);
        }
    }

    private ToastViewAction() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/toast/mediator/ToastViewAction$Show;", "Lcom/revolut/retail/toast/mediator/ToastViewAction;", "", "toString", "()Ljava/lang/String;", "retail_toast_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Show extends ToastViewAction {

        @NotNull
        public static final Parcelable.Creator<Show> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f104447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c4l.a f104448b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Show((Clause) parcel.readParcelable(Show.class.getClassLoader()), c4l.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Show[i];
            }
        }

        public Show(Clause text, c4l.a duration) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.f104447a = text;
            this.f104448b = duration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Show)) {
                return false;
            }
            Show show = (Show) obj2;
            return Intrinsics.f(this.f104447a, show.f104447a) && this.f104448b == show.f104448b;
        }

        public final int hashCode() {
            return this.f104448b.hashCode() + (this.f104447a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f104447a, i);
            dest.writeString(this.f104448b.name());
        }

        public /* synthetic */ Show(TextLocalisedClause textLocalisedClause) {
            this(textLocalisedClause, c4l.a.LONG);
        }
    }
}
