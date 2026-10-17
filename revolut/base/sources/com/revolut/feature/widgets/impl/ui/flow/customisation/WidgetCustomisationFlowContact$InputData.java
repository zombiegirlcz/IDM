package com.revolut.feature.widgets.impl.ui.flow.customisation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.kompot.common.IOData$Input;
import dsh.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/widgets/impl/ui/flow/customisation/WidgetCustomisationFlowContact$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_widgets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WidgetCustomisationFlowContact$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<WidgetCustomisationFlowContact$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f96370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WidgetContext f96371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f96372c;
    public final String d;
    public final e e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WidgetCustomisationFlowContact$InputData((Class) parcel.readSerializable(), (WidgetContext) parcel.readParcelable(WidgetCustomisationFlowContact$InputData.class.getClassLoader()), parcel.readString(), parcel.readString(), (e) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WidgetCustomisationFlowContact$InputData[i];
        }
    }

    public WidgetCustomisationFlowContact$InputData(Class dependenciesClazz, WidgetContext widgetContext, String widgetId, String widgetType, e config) {
        Intrinsics.checkNotNullParameter(dependenciesClazz, "dependenciesClazz");
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f96370a = dependenciesClazz;
        this.f96371b = widgetContext;
        this.f96372c = widgetId;
        this.d = widgetType;
        this.e = config;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WidgetCustomisationFlowContact$InputData)) {
            return false;
        }
        WidgetCustomisationFlowContact$InputData widgetCustomisationFlowContact$InputData = (WidgetCustomisationFlowContact$InputData) obj2;
        return Intrinsics.f(this.f96370a, widgetCustomisationFlowContact$InputData.f96370a) && Intrinsics.f(this.f96371b, widgetCustomisationFlowContact$InputData.f96371b) && Intrinsics.f(this.f96372c, widgetCustomisationFlowContact$InputData.f96372c) && Intrinsics.f(this.d, widgetCustomisationFlowContact$InputData.d) && Intrinsics.f(this.e, widgetCustomisationFlowContact$InputData.e);
    }

    public final int hashCode() {
        return this.e.f117319a.hashCode() + p.a.c(p.a.c((this.f96371b.hashCode() + (this.f96370a.hashCode() * 31)) * 31, 31, this.f96372c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f96370a);
        dest.writeParcelable(this.f96371b, i);
        dest.writeString(this.f96372c);
        dest.writeString(this.d);
        dest.writeSerializable(this.e);
    }
}
