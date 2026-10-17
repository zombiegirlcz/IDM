package com.revolut.core.ui_kit.dialogs;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.sound.Sound;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;
import rp0.a1;
import rp0.f1;
import rp0.l1;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00062\u00020\u00012\u00020\u0002:\u0001\u0007J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"com/revolut/core/ui_kit/dialogs/ShotDialogDisplayer$Configuration", "Landroid/os/Parcelable;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ShotDialogDisplayer$Configuration implements Parcelable, TrackableItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f55717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f55718c;
    public final Clause d;
    public final a1 e;
    public final f1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Parcelable f55719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Sound f55720h;
    public Parcelable i;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<ShotDialogDisplayer$Configuration> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static ShotDialogDisplayer$Configuration a(Companion companion, String id10, Clause message, f1 f1Var, int i) {
            if ((i & 16) != 0) {
                f1Var = f1.BOTTOM;
            }
            f1 position = f1Var;
            companion.getClass();
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(position, "position");
            return new ShotDialogDisplayer$Configuration(id10, message, l1.f256115b, null, a1.SHORT, position, null, com.revolut.core.ui_kit_core.displayers.sound.b.a("sound_toast_confirmation"), null);
        }

        public static ShotDialogDisplayer$Configuration b(Companion companion, String id10, Clause message, Image image, Clause clause, a1 a1Var, f1 f1Var, Parcelable parcelable, int i) {
            Image image2 = (i & 4) != 0 ? null : image;
            Clause clause2 = (i & 8) != 0 ? null : clause;
            a1 duration = (i & 16) != 0 ? a1.SHORT : a1Var;
            f1 position = (i & 32) != 0 ? f1.BOTTOM : f1Var;
            Parcelable parcelable2 = (i & 64) != 0 ? null : parcelable;
            companion.getClass();
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(duration, "duration");
            Intrinsics.checkNotNullParameter(position, "position");
            return new ShotDialogDisplayer$Configuration(id10, message, image2, clause2, duration, position, parcelable2, com.revolut.core.ui_kit_core.displayers.sound.b.a("sound_toast_confirmation"), null);
        }

        public static ShotDialogDisplayer$Configuration c(Companion companion, String id10, Clause message, f1 f1Var, int i) {
            if ((i & 16) != 0) {
                f1Var = f1.BOTTOM;
            }
            f1 position = f1Var;
            companion.getClass();
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(position, "position");
            return new ShotDialogDisplayer$Configuration(id10, message, l1.f256116c, null, a1.SHORT, position, null, com.revolut.core.ui_kit_core.displayers.sound.b.a("sound_toast_confirmation"), null);
        }

        public static ShotDialogDisplayer$Configuration d(Companion companion, String id10, Clause message, f1 f1Var, int i) {
            f1 position = (i & 16) != 0 ? f1.BOTTOM : f1Var;
            companion.getClass();
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(position, "position");
            return new ShotDialogDisplayer$Configuration(id10, message, new ResourceImage(R$drawable.uikit_icn_16_warning, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, a1.SHORT, position, null, com.revolut.core.ui_kit_core.displayers.sound.b.a("sound_toast_error"), null);
        }

        public static ShotDialogDisplayer$Configuration e(Companion companion, String id10, Clause message, Parcelable parcelable, Clause clause, f1 f1Var, int i) {
            Parcelable parcelable2 = (i & 4) != 0 ? null : parcelable;
            Clause clause2 = (i & 8) != 0 ? null : clause;
            f1 position = (i & 16) != 0 ? f1.BOTTOM : f1Var;
            companion.getClass();
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(position, "position");
            return new ShotDialogDisplayer$Configuration(id10, message, l1.d, clause2, a1.SHORT, position, parcelable2, com.revolut.core.ui_kit_core.displayers.sound.b.a("sound_toast_confirmation"), null);
        }

        public static ShotDialogDisplayer$Configuration f(Companion companion, String id10, Clause message, Parcelable parcelable, Clause clause, f1 f1Var, int i) {
            Parcelable parcelable2 = (i & 4) != 0 ? null : parcelable;
            Clause clause2 = (i & 8) != 0 ? null : clause;
            f1 position = (i & 16) != 0 ? f1.BOTTOM : f1Var;
            companion.getClass();
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(position, "position");
            return new ShotDialogDisplayer$Configuration(id10, message, l1.f256114a, clause2, clause2 == null ? a1.SHORT : a1.LONG, position, parcelable2, com.revolut.core.ui_kit_core.displayers.sound.b.a("sound_toast_success"), null);
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShotDialogDisplayer$Configuration(parcel.readString(), (Clause) parcel.readParcelable(ShotDialogDisplayer$Configuration.class.getClassLoader()), (Image) parcel.readParcelable(ShotDialogDisplayer$Configuration.class.getClassLoader()), (Clause) parcel.readParcelable(ShotDialogDisplayer$Configuration.class.getClassLoader()), a1.valueOf(parcel.readString()), f1.valueOf(parcel.readString()), parcel.readParcelable(ShotDialogDisplayer$Configuration.class.getClassLoader()), (Sound) parcel.readParcelable(ShotDialogDisplayer$Configuration.class.getClassLoader()), parcel.readParcelable(ShotDialogDisplayer$Configuration.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ShotDialogDisplayer$Configuration[i];
        }
    }

    public ShotDialogDisplayer$Configuration(String id10, Clause message, Image image, Clause clause, a1 duration, f1 position, Parcelable parcelable, Sound sound, Parcelable parcelable2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(sound, "sound");
        this.f55716a = id10;
        this.f55717b = message;
        this.f55718c = image;
        this.d = clause;
        this.e = duration;
        this.f = position;
        this.f55719g = parcelable;
        this.f55720h = sound;
        this.i = parcelable2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ShotDialogDisplayer$Configuration)) {
            return false;
        }
        ShotDialogDisplayer$Configuration shotDialogDisplayer$Configuration = (ShotDialogDisplayer$Configuration) obj2;
        return Intrinsics.f(this.f55716a, shotDialogDisplayer$Configuration.f55716a) && Intrinsics.f(this.f55717b, shotDialogDisplayer$Configuration.f55717b) && Intrinsics.f(this.f55718c, shotDialogDisplayer$Configuration.f55718c) && Intrinsics.f(this.d, shotDialogDisplayer$Configuration.d) && this.e == shotDialogDisplayer$Configuration.e && this.f == shotDialogDisplayer$Configuration.f && Intrinsics.f(this.f55719g, shotDialogDisplayer$Configuration.f55719g) && Intrinsics.f(this.f55720h, shotDialogDisplayer$Configuration.f55720h) && Intrinsics.f(this.i, shotDialogDisplayer$Configuration.i);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public final Parcelable getI() {
        return this.i;
    }

    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF55716a() {
        return this.f55716a;
    }

    public final int hashCode() {
        int iA = a.a(this.f55716a.hashCode() * 31, 31, this.f55717b);
        Image image = this.f55718c;
        int iHashCode = (iA + (image == null ? 0 : image.hashCode())) * 31;
        Clause clause = this.d;
        int iHashCode2 = (this.f.hashCode() + ((this.e.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31)) * 31)) * 31;
        Parcelable parcelable = this.f55719g;
        int iHashCode3 = (this.f55720h.hashCode() + ((iHashCode2 + (parcelable == null ? 0 : parcelable.hashCode())) * 31)) * 31;
        Parcelable parcelable2 = this.i;
        return iHashCode3 + (parcelable2 != null ? parcelable2.hashCode() : 0);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public final void setAnalyticsContext(Parcelable parcelable) {
        this.i = parcelable;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f55716a);
        dest.writeParcelable(this.f55717b, i);
        dest.writeParcelable(this.f55718c, i);
        dest.writeParcelable(this.d, i);
        dest.writeString(this.e.name());
        dest.writeString(this.f.name());
        dest.writeParcelable(this.f55719g, i);
        dest.writeParcelable(this.f55720h, i);
        dest.writeParcelable(this.i, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ShotDialogDisplayer$Configuration(String id10, TextLocalisedClause message, Image image, TextLocalisedClause textLocalisedClause, a1 a1Var, f1 f1Var, Parcelable parcelable, int i) {
        Image image2 = (i & 4) != 0 ? null : image;
        TextLocalisedClause textLocalisedClause2 = (i & 8) != 0 ? null : textLocalisedClause;
        a1 duration = (i & 16) != 0 ? a1.SHORT : a1Var;
        f1 position = (i & 32) != 0 ? f1.BOTTOM : f1Var;
        Parcelable parcelable2 = (i & 64) != 0 ? null : parcelable;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(position, "position");
        this(id10, message, image2, textLocalisedClause2, duration, position, parcelable2, com.revolut.core.ui_kit_core.displayers.sound.b.a("sound_toast_confirmation"), null);
    }
}
