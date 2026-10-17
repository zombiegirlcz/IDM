package com.revolut.feature.credit.application.plugins.api.models.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import ju3.e;
import ju3.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/KontomatikPopupScreenConfig;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/ScreenConfig;", "", "toString", "()Ljava/lang/String;", "Button", "ju3/e", "ju3/f", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class KontomatikPopupScreenConfig extends ScreenConfig {

    @NotNull
    public static final Parcelable.Creator<KontomatikPopupScreenConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f66361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f66362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Button f66363c;
    public final Button d;
    public final f e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/KontomatikPopupScreenConfig$Button;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Button implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Button> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f66364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f66365b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Button((Clause) parcel.readParcelable(Button.class.getClassLoader()), e.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Button[i];
            }
        }

        public Button(Clause label, e action) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(action, "action");
            this.f66364a = label;
            this.f66365b = action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Button)) {
                return false;
            }
            Button button = (Button) obj2;
            return Intrinsics.f(this.f66364a, button.f66364a) && this.f66365b == button.f66365b;
        }

        public final int hashCode() {
            return this.f66365b.hashCode() + (this.f66364a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66364a, i);
            dest.writeString(this.f66365b.name());
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Clause clause = (Clause) parcel.readParcelable(KontomatikPopupScreenConfig.class.getClassLoader());
            Clause clause2 = (Clause) parcel.readParcelable(KontomatikPopupScreenConfig.class.getClassLoader());
            Parcelable.Creator<Button> creator = Button.CREATOR;
            return new KontomatikPopupScreenConfig(clause, clause2, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), f.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new KontomatikPopupScreenConfig[i];
        }
    }

    public KontomatikPopupScreenConfig(Clause title, Clause description, Button primaryButton, Button button, f status) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f66361a = title;
        this.f66362b = description;
        this.f66363c = primaryButton;
        this.d = button;
        this.e = status;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof KontomatikPopupScreenConfig)) {
            return false;
        }
        KontomatikPopupScreenConfig kontomatikPopupScreenConfig = (KontomatikPopupScreenConfig) obj2;
        return Intrinsics.f(this.f66361a, kontomatikPopupScreenConfig.f66361a) && Intrinsics.f(this.f66362b, kontomatikPopupScreenConfig.f66362b) && Intrinsics.f(this.f66363c, kontomatikPopupScreenConfig.f66363c) && Intrinsics.f(this.d, kontomatikPopupScreenConfig.d) && this.e == kontomatikPopupScreenConfig.e;
    }

    public final int hashCode() {
        int iHashCode = (this.f66363c.hashCode() + p.a.a(this.f66361a.hashCode() * 31, 31, this.f66362b)) * 31;
        Button button = this.d;
        return this.e.hashCode() + ((iHashCode + (button == null ? 0 : button.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f66361a, i);
        dest.writeParcelable(this.f66362b, i);
        this.f66363c.writeToParcel(dest, i);
        Button button = this.d;
        if (button == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            button.writeToParcel(dest, i);
        }
        dest.writeString(this.e.name());
    }
}
