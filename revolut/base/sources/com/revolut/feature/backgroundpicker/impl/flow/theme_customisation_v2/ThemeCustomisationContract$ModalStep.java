package com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/backgroundpicker/impl/flow/theme_customisation_v2/ThemeCustomisationContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "BackgroundPicker", "ThemesGallery", "ResetBackgroundsConfirmation", "SeasonalStyleDisclaimer", "Lcom/revolut/feature/backgroundpicker/impl/flow/theme_customisation_v2/ThemeCustomisationContract$ModalStep$BackgroundPicker;", "Lcom/revolut/feature/backgroundpicker/impl/flow/theme_customisation_v2/ThemeCustomisationContract$ModalStep$ResetBackgroundsConfirmation;", "Lcom/revolut/feature/backgroundpicker/impl/flow/theme_customisation_v2/ThemeCustomisationContract$ModalStep$SeasonalStyleDisclaimer;", "Lcom/revolut/feature/backgroundpicker/impl/flow/theme_customisation_v2/ThemeCustomisationContract$ModalStep$ThemesGallery;", "feature_background_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ThemeCustomisationContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backgroundpicker/impl/flow/theme_customisation_v2/ThemeCustomisationContract$ModalStep$BackgroundPicker;", "Lcom/revolut/feature/backgroundpicker/impl/flow/theme_customisation_v2/ThemeCustomisationContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_background_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BackgroundPicker extends ThemeCustomisationContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<BackgroundPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ThemedBackgroundKey f63762a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f63763b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                ThemedBackgroundKey themedBackgroundKey = (ThemedBackgroundKey) j6.a.f(parcel, "parcel", BackgroundPicker.class);
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList2.add(em2.b.valueOf(parcel.readString()));
                    }
                    arrayList = arrayList2;
                }
                return new BackgroundPicker(themedBackgroundKey, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BackgroundPicker[i];
            }
        }

        public BackgroundPicker(ThemedBackgroundKey backgroundKey, List list) {
            Intrinsics.checkNotNullParameter(backgroundKey, "backgroundKey");
            this.f63762a = backgroundKey;
            this.f63763b = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BackgroundPicker)) {
                return false;
            }
            BackgroundPicker backgroundPicker = (BackgroundPicker) obj2;
            return Intrinsics.f(this.f63762a, backgroundPicker.f63762a) && Intrinsics.f(this.f63763b, backgroundPicker.f63763b);
        }

        public final int hashCode() {
            int iHashCode = this.f63762a.hashCode() * 31;
            List list = this.f63763b;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f63762a, i);
            List list = this.f63763b;
            if (list == null) {
                dest.writeInt(0);
                return;
            }
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeString(((em2.b) itQ.next()).name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/backgroundpicker/impl/flow/theme_customisation_v2/ThemeCustomisationContract$ModalStep$ResetBackgroundsConfirmation;", "Lcom/revolut/feature/backgroundpicker/impl/flow/theme_customisation_v2/ThemeCustomisationContract$ModalStep;", "<init>", "()V", "feature_background_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ResetBackgroundsConfirmation extends ThemeCustomisationContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ResetBackgroundsConfirmation f63764a = new ResetBackgroundsConfirmation();

        @NotNull
        public static final Parcelable.Creator<ResetBackgroundsConfirmation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ResetBackgroundsConfirmation.f63764a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ResetBackgroundsConfirmation[i];
            }
        }

        private ResetBackgroundsConfirmation() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/backgroundpicker/impl/flow/theme_customisation_v2/ThemeCustomisationContract$ModalStep$SeasonalStyleDisclaimer;", "Lcom/revolut/feature/backgroundpicker/impl/flow/theme_customisation_v2/ThemeCustomisationContract$ModalStep;", "<init>", "()V", "feature_background_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SeasonalStyleDisclaimer extends ThemeCustomisationContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SeasonalStyleDisclaimer f63765a = new SeasonalStyleDisclaimer();

        @NotNull
        public static final Parcelable.Creator<SeasonalStyleDisclaimer> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SeasonalStyleDisclaimer.f63765a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SeasonalStyleDisclaimer[i];
            }
        }

        private SeasonalStyleDisclaimer() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backgroundpicker/impl/flow/theme_customisation_v2/ThemeCustomisationContract$ModalStep$ThemesGallery;", "Lcom/revolut/feature/backgroundpicker/impl/flow/theme_customisation_v2/ThemeCustomisationContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_background_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ThemesGallery extends ThemeCustomisationContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ThemesGallery> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63766a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ThemesGallery(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ThemesGallery[i];
            }
        }

        public ThemesGallery(String selectedThemeId) {
            Intrinsics.checkNotNullParameter(selectedThemeId, "selectedThemeId");
            this.f63766a = selectedThemeId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ThemesGallery) && Intrinsics.f(this.f63766a, ((ThemesGallery) obj2).f63766a);
        }

        public final int hashCode() {
            return this.f63766a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63766a);
        }
    }

    private ThemeCustomisationContract$ModalStep() {
    }
}
