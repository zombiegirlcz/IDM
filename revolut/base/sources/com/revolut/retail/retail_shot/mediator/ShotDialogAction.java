package com.revolut.retail.retail_shot.mediator;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/retail/retail_shot/mediator/ShotDialogAction;", "Landroid/os/Parcelable;", "<init>", "()V", "Show", "Hide", "Lcom/revolut/retail/retail_shot/mediator/ShotDialogAction$Hide;", "Lcom/revolut/retail/retail_shot/mediator/ShotDialogAction$Show;", "retail_shot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ShotDialogAction implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/retail_shot/mediator/ShotDialogAction$Hide;", "Lcom/revolut/retail/retail_shot/mediator/ShotDialogAction;", "<init>", "()V", "retail_shot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Hide extends ShotDialogAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Hide f104425a = new Hide();

        @NotNull
        public static final Parcelable.Creator<Hide> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Hide.f104425a;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/retail_shot/mediator/ShotDialogAction$Show;", "Lcom/revolut/retail/retail_shot/mediator/ShotDialogAction;", "", "toString", "()Ljava/lang/String;", "retail_shot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Show extends ShotDialogAction {

        @NotNull
        public static final Parcelable.Creator<Show> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ShotDialogDisplayer$Configuration f104426a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Show((ShotDialogDisplayer$Configuration) parcel.readParcelable(Show.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Show[i];
            }
        }

        public Show(ShotDialogDisplayer$Configuration configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f104426a = configuration;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ShotDialogDisplayer$Configuration getF104426a() {
            return this.f104426a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Show) && Intrinsics.f(this.f104426a, ((Show) obj2).f104426a);
        }

        public final int hashCode() {
            return this.f104426a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f104426a, i);
        }
    }

    private ShotDialogAction() {
    }
}
