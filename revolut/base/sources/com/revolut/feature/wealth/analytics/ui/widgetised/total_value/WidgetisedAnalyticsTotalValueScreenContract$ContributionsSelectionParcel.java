package com.revolut.feature.wealth.analytics.ui.widgetised.total_value;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/revolut/feature/wealth/analytics/ui/widgetised/total_value/WidgetisedAnalyticsTotalValueScreenContract$ContributionsSelectionParcel", "Landroid/os/Parcelable;", "", "Lcom/revolut/feature/wealth/analytics/ui/widgetised/total_value/WidgetisedAnalyticsTotalValueScreenContract$ContributionsSelectionParcel;", "", "isSelected", "Z", "a", "()Z", "Show", "Hide", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WidgetisedAnalyticsTotalValueScreenContract$ContributionsSelectionParcel implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ WidgetisedAnalyticsTotalValueScreenContract$ContributionsSelectionParcel[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<WidgetisedAnalyticsTotalValueScreenContract$ContributionsSelectionParcel> CREATOR;
    public static final WidgetisedAnalyticsTotalValueScreenContract$ContributionsSelectionParcel Hide;
    public static final WidgetisedAnalyticsTotalValueScreenContract$ContributionsSelectionParcel Show;
    private final boolean isSelected;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return WidgetisedAnalyticsTotalValueScreenContract$ContributionsSelectionParcel.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WidgetisedAnalyticsTotalValueScreenContract$ContributionsSelectionParcel[i];
        }
    }

    static {
        WidgetisedAnalyticsTotalValueScreenContract$ContributionsSelectionParcel widgetisedAnalyticsTotalValueScreenContract$ContributionsSelectionParcel = new WidgetisedAnalyticsTotalValueScreenContract$ContributionsSelectionParcel("Show", 0, true);
        Show = widgetisedAnalyticsTotalValueScreenContract$ContributionsSelectionParcel;
        WidgetisedAnalyticsTotalValueScreenContract$ContributionsSelectionParcel widgetisedAnalyticsTotalValueScreenContract$ContributionsSelectionParcel2 = new WidgetisedAnalyticsTotalValueScreenContract$ContributionsSelectionParcel("Hide", 1, false);
        Hide = widgetisedAnalyticsTotalValueScreenContract$ContributionsSelectionParcel2;
        WidgetisedAnalyticsTotalValueScreenContract$ContributionsSelectionParcel[] widgetisedAnalyticsTotalValueScreenContract$ContributionsSelectionParcelArr = {widgetisedAnalyticsTotalValueScreenContract$ContributionsSelectionParcel, widgetisedAnalyticsTotalValueScreenContract$ContributionsSelectionParcel2};
        $VALUES = widgetisedAnalyticsTotalValueScreenContract$ContributionsSelectionParcelArr;
        $ENTRIES = s.n(widgetisedAnalyticsTotalValueScreenContract$ContributionsSelectionParcelArr);
        CREATOR = new a();
    }

    public WidgetisedAnalyticsTotalValueScreenContract$ContributionsSelectionParcel(String str, int i, boolean z) {
        this.isSelected = z;
    }

    public static WidgetisedAnalyticsTotalValueScreenContract$ContributionsSelectionParcel valueOf(String str) {
        return (WidgetisedAnalyticsTotalValueScreenContract$ContributionsSelectionParcel) Enum.valueOf(WidgetisedAnalyticsTotalValueScreenContract$ContributionsSelectionParcel.class, str);
    }

    public static WidgetisedAnalyticsTotalValueScreenContract$ContributionsSelectionParcel[] values() {
        return (WidgetisedAnalyticsTotalValueScreenContract$ContributionsSelectionParcel[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}
