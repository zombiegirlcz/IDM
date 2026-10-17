package com.revolut.feature.widgets.impl.ui.screen.customisation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.kompot.common.IOData$Input;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/widgets/impl/ui/screen/customisation/WidgetCarouselScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_widgets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WidgetCarouselScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<WidgetCarouselScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WidgetContext f96384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f96385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f96386c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WidgetCarouselScreenContract$InputData((WidgetContext) parcel.readParcelable(WidgetCarouselScreenContract$InputData.class.getClassLoader()), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WidgetCarouselScreenContract$InputData[i];
        }
    }

    public WidgetCarouselScreenContract$InputData(WidgetContext widgetContext, String sourceId, List availableWidgetTypes, String defaultWidgetType) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(availableWidgetTypes, "availableWidgetTypes");
        Intrinsics.checkNotNullParameter(defaultWidgetType, "defaultWidgetType");
        this.f96384a = widgetContext;
        this.f96385b = sourceId;
        this.f96386c = availableWidgetTypes;
        this.d = defaultWidgetType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WidgetCarouselScreenContract$InputData)) {
            return false;
        }
        WidgetCarouselScreenContract$InputData widgetCarouselScreenContract$InputData = (WidgetCarouselScreenContract$InputData) obj2;
        return Intrinsics.f(this.f96384a, widgetCarouselScreenContract$InputData.f96384a) && Intrinsics.f(this.f96385b, widgetCarouselScreenContract$InputData.f96385b) && Intrinsics.f(this.f96386c, widgetCarouselScreenContract$InputData.f96386c) && Intrinsics.f(this.d, widgetCarouselScreenContract$InputData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(p.a.c(this.f96384a.hashCode() * 31, 31, this.f96385b), 31, this.f96386c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f96384a, i);
        dest.writeString(this.f96385b);
        dest.writeStringList(this.f96386c);
        dest.writeString(this.d);
    }
}
