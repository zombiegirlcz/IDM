package com.revolut.feature.credit.application.plugins.api.models.config;

import android.os.Parcel;
import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.retail.common.ui.R$string;
import hs3.r;
import hs3.s;
import hs3.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0002\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/CongratulationsScreenConfig;", "Landroid/os/Parcelable;", "Companion", "Prompt", "Popup", "a", "CongratulationsInfoDialog", "Lcom/revolut/feature/credit/application/plugins/api/models/config/CongratulationsScreenConfig$Popup;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/CongratulationsScreenConfig$Prompt;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CongratulationsScreenConfig extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f66351a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/CongratulationsScreenConfig$CongratulationsInfoDialog;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CongratulationsInfoDialog implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<CongratulationsInfoDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f66343a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f66344b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f66345c;
        public final Clause d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CongratulationsInfoDialog((Clause) parcel.readParcelable(CongratulationsInfoDialog.class.getClassLoader()), (Clause) parcel.readParcelable(CongratulationsInfoDialog.class.getClassLoader()), (Clause) parcel.readParcelable(CongratulationsInfoDialog.class.getClassLoader()), (Clause) parcel.readParcelable(CongratulationsInfoDialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CongratulationsInfoDialog[i];
            }
        }

        public CongratulationsInfoDialog(Clause title, Clause infoButtonText, Clause clause, Clause clause2) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(infoButtonText, "infoButtonText");
            this.f66343a = title;
            this.f66344b = infoButtonText;
            this.f66345c = clause;
            this.d = clause2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CongratulationsInfoDialog)) {
                return false;
            }
            CongratulationsInfoDialog congratulationsInfoDialog = (CongratulationsInfoDialog) obj2;
            return Intrinsics.f(this.f66343a, congratulationsInfoDialog.f66343a) && Intrinsics.f(this.f66344b, congratulationsInfoDialog.f66344b) && Intrinsics.f(this.f66345c, congratulationsInfoDialog.f66345c) && Intrinsics.f(this.d, congratulationsInfoDialog.d);
        }

        public final int hashCode() {
            int iA = p.a.a(this.f66343a.hashCode() * 31, 31, this.f66344b);
            Clause clause = this.f66345c;
            int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
            Clause clause2 = this.d;
            return iHashCode + (clause2 != null ? clause2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66343a, i);
            dest.writeParcelable(this.f66344b, i);
            dest.writeParcelable(this.f66345c, i);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/CongratulationsScreenConfig$Popup;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/CongratulationsScreenConfig;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Popup implements CongratulationsScreenConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f66346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f66347b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Popup> CREATOR = new b();

        /* JADX INFO: renamed from: com.revolut.feature.credit.application.plugins.api.models.config.CongratulationsScreenConfig$Popup$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Popup((Clause) parcel.readParcelable(Popup.class.getClassLoader()), (Clause) parcel.readParcelable(Popup.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Popup[i];
            }
        }

        public Popup(Clause title, Clause clause) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.f66346a = title;
            this.f66347b = clause;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Popup)) {
                return false;
            }
            Popup popup = (Popup) obj2;
            return Intrinsics.f(this.f66346a, popup.f66346a) && Intrinsics.f(this.f66347b, popup.f66347b);
        }

        public final int hashCode() {
            int iHashCode = this.f66346a.hashCode() * 31;
            Clause clause = this.f66347b;
            return iHashCode + (clause == null ? 0 : clause.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66346a, i);
            dest.writeParcelable(this.f66347b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/CongratulationsScreenConfig$Prompt;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/CongratulationsScreenConfig;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Prompt implements CongratulationsScreenConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f66348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f66349b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f66350c;
        public final Image d;
        public final CongratulationsInfoDialog e;
        public final boolean f;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Prompt> CREATOR = new b();

        /* JADX INFO: renamed from: com.revolut.feature.credit.application.plugins.api.models.config.CongratulationsScreenConfig$Prompt$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Prompt((Clause) parcel.readParcelable(Prompt.class.getClassLoader()), (Clause) parcel.readParcelable(Prompt.class.getClassLoader()), (Clause) parcel.readParcelable(Prompt.class.getClassLoader()), (Image) parcel.readParcelable(Prompt.class.getClassLoader()), parcel.readInt() == 0 ? null : CongratulationsInfoDialog.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Prompt[i];
            }
        }

        public Prompt(Clause title, Clause subtitle, Clause primaryButton, Image image, CongratulationsInfoDialog congratulationsInfoDialog, boolean z) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
            Intrinsics.checkNotNullParameter(image, "image");
            this.f66348a = title;
            this.f66349b = subtitle;
            this.f66350c = primaryButton;
            this.d = image;
            this.e = congratulationsInfoDialog;
            this.f = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Prompt)) {
                return false;
            }
            Prompt prompt = (Prompt) obj2;
            return Intrinsics.f(this.f66348a, prompt.f66348a) && Intrinsics.f(this.f66349b, prompt.f66349b) && Intrinsics.f(this.f66350c, prompt.f66350c) && Intrinsics.f(this.d, prompt.d) && Intrinsics.f(this.e, prompt.e) && this.f == prompt.f;
        }

        public final int hashCode() {
            int iC = a10.b.c(this.d, p.a.a(p.a.a(this.f66348a.hashCode() * 31, 31, this.f66349b), 31, this.f66350c), 31);
            CongratulationsInfoDialog congratulationsInfoDialog = this.e;
            return Boolean.hashCode(this.f) + ((iC + (congratulationsInfoDialog == null ? 0 : congratulationsInfoDialog.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66348a, i);
            dest.writeParcelable(this.f66349b, i);
            dest.writeParcelable(this.f66350c, i);
            dest.writeParcelable(this.d, i);
            CongratulationsInfoDialog congratulationsInfoDialog = this.e;
            if (congratulationsInfoDialog == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                congratulationsInfoDialog.writeToParcel(dest, i);
            }
            dest.writeInt(this.f ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.credit.application.plugins.api.models.config.CongratulationsScreenConfig$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f66351a = new Companion();

        private Companion() {
        }

        public static CongratulationsScreenConfig a(t congratulationsMetadata) {
            CongratulationsInfoDialog congratulationsInfoDialog;
            Intrinsics.checkNotNullParameter(congratulationsMetadata, "congratulationsMetadata");
            r rVar = congratulationsMetadata.e;
            String str = congratulationsMetadata.f154946b;
            int i = b.f66430a[rVar.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                Popup.INSTANCE.getClass();
                Intrinsics.checkNotNullParameter(congratulationsMetadata, "congratulationsMetadata");
                return new Popup(new TextClause(congratulationsMetadata.f154945a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null);
            }
            Prompt.INSTANCE.getClass();
            Intrinsics.checkNotNullParameter(congratulationsMetadata, "congratulationsMetadata");
            TextClause textClause = new TextClause(congratulationsMetadata.f154945a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            if (str == null) {
                str = "";
            }
            TextClause textClause2 = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str2 = congratulationsMetadata.d;
            Clause textClause3 = str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextLocalisedClause(R$string.common_action_ok, null, null, 14);
            String str3 = congratulationsMetadata.f154947c;
            Image urlImage = str3 != null ? new UrlImage(str3, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286) : com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D352", null, null, null, 30);
            s sVar = congratulationsMetadata.f;
            if (sVar != null) {
                TextClause textClause4 = new TextClause(sVar.f154939a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                TextClause textClause5 = new TextClause(sVar.f154940b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str4 = sVar.f154941c;
                TextClause textClause6 = str4 != null ? new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
                String str5 = sVar.d;
                congratulationsInfoDialog = new CongratulationsInfoDialog(textClause4, textClause5, textClause6, str5 != null ? new TextClause(str5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null);
            } else {
                congratulationsInfoDialog = null;
            }
            return new Prompt(textClause, textClause2, textClause3, urlImage, congratulationsInfoDialog, congratulationsMetadata.f154948g);
        }
    }
}
