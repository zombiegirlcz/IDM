package com.revolut.feature.shared.help_centre.impl.faq.screens.quick_help.card;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/shared/help_centre/impl/faq/screens/quick_help/card/HelpWithCardScreenContract$Input", "Lcom/revolut/kompot/common/IOData$Input;", "HelpWithCard", "ViewPin", "Lcom/revolut/feature/shared/help_centre/impl/faq/screens/quick_help/card/HelpWithCardScreenContract$Input$HelpWithCard;", "Lcom/revolut/feature/shared/help_centre/impl/faq/screens/quick_help/card/HelpWithCardScreenContract$Input$ViewPin;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface HelpWithCardScreenContract$Input extends IOData$Input {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/screens/quick_help/card/HelpWithCardScreenContract$Input$HelpWithCard;", "Lcom/revolut/feature/shared/help_centre/impl/faq/screens/quick_help/card/HelpWithCardScreenContract$Input;", "<init>", "()V", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class HelpWithCard implements HelpWithCardScreenContract$Input {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HelpWithCard f86296a = new HelpWithCard();

        @NotNull
        public static final Parcelable.Creator<HelpWithCard> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return HelpWithCard.f86296a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HelpWithCard[i];
            }
        }

        private HelpWithCard() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/screens/quick_help/card/HelpWithCardScreenContract$Input$ViewPin;", "Lcom/revolut/feature/shared/help_centre/impl/faq/screens/quick_help/card/HelpWithCardScreenContract$Input;", "<init>", "()V", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ViewPin implements HelpWithCardScreenContract$Input {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ViewPin f86297a = new ViewPin();

        @NotNull
        public static final Parcelable.Creator<ViewPin> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ViewPin.f86297a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ViewPin[i];
            }
        }

        private ViewPin() {
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
}
