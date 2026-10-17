package com.revolut.feature.credit.application.plugins.api.models.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/AgreementsScreenConfig;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/ScreenConfig;", "", "toString", "()Ljava/lang/String;", "Companion", "Disclaimer", "a", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AgreementsScreenConfig extends ScreenConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Disclaimer f66331a;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<AgreementsScreenConfig> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/AgreementsScreenConfig$Disclaimer;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/credit/application/plugins/api/models/config/a", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Disclaimer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Disclaimer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f66332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.revolut.feature.credit.application.plugins.api.models.config.a f66333b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Disclaimer((Clause) parcel.readParcelable(Disclaimer.class.getClassLoader()), com.revolut.feature.credit.application.plugins.api.models.config.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Disclaimer[i];
            }
        }

        public Disclaimer(Clause text, com.revolut.feature.credit.application.plugins.api.models.config.a displayStrategy) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(displayStrategy, "displayStrategy");
            this.f66332a = text;
            this.f66333b = displayStrategy;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Disclaimer)) {
                return false;
            }
            Disclaimer disclaimer = (Disclaimer) obj2;
            return Intrinsics.f(this.f66332a, disclaimer.f66332a) && this.f66333b == disclaimer.f66333b;
        }

        public final int hashCode() {
            return this.f66333b.hashCode() + (this.f66332a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66332a, i);
            dest.writeString(this.f66333b.name());
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.credit.application.plugins.api.models.config.AgreementsScreenConfig$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static AgreementsScreenConfig a() {
            return new AgreementsScreenConfig(null);
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AgreementsScreenConfig(parcel.readInt() == 0 ? null : Disclaimer.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AgreementsScreenConfig[i];
        }
    }

    public AgreementsScreenConfig(Disclaimer disclaimer) {
        this.f66331a = disclaimer;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof AgreementsScreenConfig) && Intrinsics.f(this.f66331a, ((AgreementsScreenConfig) obj2).f66331a);
    }

    public final int hashCode() {
        Disclaimer disclaimer = this.f66331a;
        if (disclaimer == null) {
            return 0;
        }
        return disclaimer.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Disclaimer disclaimer = this.f66331a;
        if (disclaimer == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            disclaimer.writeToParcel(dest, i);
        }
    }
}
