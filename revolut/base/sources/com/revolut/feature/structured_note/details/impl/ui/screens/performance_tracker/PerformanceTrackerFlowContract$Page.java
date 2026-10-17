package com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/revolut/feature/structured_note/details/impl/ui/screens/performance_tracker/PerformanceTrackerFlowContract$Page", "Lcom/revolut/kompot/navigable/vc/pager/PagerItem;", "", "Lcom/revolut/feature/structured_note/details/impl/ui/screens/performance_tracker/PerformanceTrackerFlowContract$Page;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "UNDERLYING_ASSETS", "TERMS", "feature_structured_note_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PerformanceTrackerFlowContract$Page implements PagerItem {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PerformanceTrackerFlowContract$Page[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<PerformanceTrackerFlowContract$Page> CREATOR;
    public static final PerformanceTrackerFlowContract$Page TERMS;
    public static final PerformanceTrackerFlowContract$Page UNDERLYING_ASSETS;

    @NotNull
    private final String id;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return PerformanceTrackerFlowContract$Page.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PerformanceTrackerFlowContract$Page[i];
        }
    }

    static {
        PerformanceTrackerFlowContract$Page performanceTrackerFlowContract$Page = new PerformanceTrackerFlowContract$Page("UNDERLYING_ASSETS", 0, "underlying_assets");
        UNDERLYING_ASSETS = performanceTrackerFlowContract$Page;
        PerformanceTrackerFlowContract$Page performanceTrackerFlowContract$Page2 = new PerformanceTrackerFlowContract$Page("TERMS", 1, "terms");
        TERMS = performanceTrackerFlowContract$Page2;
        PerformanceTrackerFlowContract$Page[] performanceTrackerFlowContract$PageArr = {performanceTrackerFlowContract$Page, performanceTrackerFlowContract$Page2};
        $VALUES = performanceTrackerFlowContract$PageArr;
        $ENTRIES = s.n(performanceTrackerFlowContract$PageArr);
        CREATOR = new a();
    }

    public PerformanceTrackerFlowContract$Page(String str, int i, String str2) {
        this.id = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static PerformanceTrackerFlowContract$Page valueOf(String str) {
        return (PerformanceTrackerFlowContract$Page) Enum.valueOf(PerformanceTrackerFlowContract$Page.class, str);
    }

    public static PerformanceTrackerFlowContract$Page[] values() {
        return (PerformanceTrackerFlowContract$Page[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.revolut.kompot.navigable.vc.pager.PagerItem
    public final String getId() {
        return this.id;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}
