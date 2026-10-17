package com.revolut.retail.retail_snackbar.mediator;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/retail/retail_snackbar/mediator/SnackbarViewAction;", "Landroid/os/Parcelable;", "<init>", "()V", "Show", "Update", "Dismiss", "Lcom/revolut/retail/retail_snackbar/mediator/SnackbarViewAction$Dismiss;", "Lcom/revolut/retail/retail_snackbar/mediator/SnackbarViewAction$Show;", "Lcom/revolut/retail/retail_snackbar/mediator/SnackbarViewAction$Update;", "retail_snackbar_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SnackbarViewAction implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/retail_snackbar/mediator/SnackbarViewAction$Dismiss;", "Lcom/revolut/retail/retail_snackbar/mediator/SnackbarViewAction;", "<init>", "()V", "retail_snackbar_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Dismiss extends SnackbarViewAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Dismiss f104431a = new Dismiss();

        @NotNull
        public static final Parcelable.Creator<Dismiss> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Dismiss.f104431a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Dismiss[i];
            }
        }

        private Dismiss() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/retail_snackbar/mediator/SnackbarViewAction$Show;", "Lcom/revolut/retail/retail_snackbar/mediator/SnackbarViewAction;", "", "toString", "()Ljava/lang/String;", "retail_snackbar_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Show extends SnackbarViewAction {

        @NotNull
        public static final Parcelable.Creator<Show> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f104432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t3l.b f104433b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Parcelable f104434c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Show((Clause) parcel.readParcelable(Show.class.getClassLoader()), t3l.b.valueOf(parcel.readString()), parcel.readParcelable(Show.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Show[i];
            }
        }

        public Show(Clause text, t3l.b duration, Parcelable parcelable) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.f104432a = text;
            this.f104433b = duration;
            this.f104434c = parcelable;
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
            return Intrinsics.f(this.f104432a, show.f104432a) && this.f104433b == show.f104433b && Intrinsics.f(this.f104434c, show.f104434c);
        }

        public final int hashCode() {
            int iHashCode = (this.f104433b.hashCode() + (this.f104432a.hashCode() * 31)) * 31;
            Parcelable parcelable = this.f104434c;
            return iHashCode + (parcelable == null ? 0 : parcelable.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f104432a, i);
            dest.writeString(this.f104433b.name());
            dest.writeParcelable(this.f104434c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/retail_snackbar/mediator/SnackbarViewAction$Update;", "Lcom/revolut/retail/retail_snackbar/mediator/SnackbarViewAction;", "", "toString", "()Ljava/lang/String;", "retail_snackbar_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Update extends SnackbarViewAction {

        @NotNull
        public static final Parcelable.Creator<Update> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f104435a;

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
            this.f104435a = text;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Update) && Intrinsics.f(this.f104435a, ((Update) obj2).f104435a);
        }

        public final int hashCode() {
            return this.f104435a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f104435a, i);
        }
    }

    private SnackbarViewAction() {
    }
}
