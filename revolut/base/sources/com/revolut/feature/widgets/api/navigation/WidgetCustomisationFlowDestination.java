package com.revolut.feature.widgets.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import dsh.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/feature/widgets/api/navigation/WidgetCustomisationFlowDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/widgets/api/navigation/WidgetCustomisationFlowDestination$InputData;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "InputData", "feature_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WidgetCustomisationFlowDestination extends InternalDestination<InputData> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<WidgetCustomisationFlowDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f96352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WidgetContext f96353c;
    public final String d;
    public final String e;
    public final e f;

    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/widgets/api/navigation/WidgetCustomisationFlowDestination$InputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InputData implements IOData$Input {

        @NotNull
        public static final Parcelable.Creator<InputData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class f96354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WidgetContext f96355b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f96356c;
        public final String d;
        public final e e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InputData((Class) parcel.readSerializable(), (WidgetContext) parcel.readParcelable(InputData.class.getClassLoader()), parcel.readString(), parcel.readString(), (e) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InputData[i];
            }
        }

        public InputData(Class dependenciesClazz, WidgetContext widgetContext, String widgetId, String widgetType, e config) {
            Intrinsics.checkNotNullParameter(dependenciesClazz, "dependenciesClazz");
            Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
            Intrinsics.checkNotNullParameter(widgetId, "widgetId");
            Intrinsics.checkNotNullParameter(widgetType, "widgetType");
            Intrinsics.checkNotNullParameter(config, "config");
            this.f96354a = dependenciesClazz;
            this.f96355b = widgetContext;
            this.f96356c = widgetId;
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
            if (!(obj2 instanceof InputData)) {
                return false;
            }
            InputData inputData = (InputData) obj2;
            return Intrinsics.f(this.f96354a, inputData.f96354a) && Intrinsics.f(this.f96355b, inputData.f96355b) && Intrinsics.f(this.f96356c, inputData.f96356c) && Intrinsics.f(this.d, inputData.d) && Intrinsics.f(this.e, inputData.e);
        }

        public final int hashCode() {
            return this.e.f117319a.hashCode() + p.a.c(p.a.c((this.f96355b.hashCode() + (this.f96354a.hashCode() * 31)) * 31, 31, this.f96356c), 31, this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f96354a);
            dest.writeParcelable(this.f96355b, i);
            dest.writeString(this.f96356c);
            dest.writeString(this.d);
            dest.writeSerializable(this.e);
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WidgetCustomisationFlowDestination((Class) parcel.readSerializable(), (WidgetContext) parcel.readParcelable(WidgetCustomisationFlowDestination.class.getClassLoader()), parcel.readString(), parcel.readString(), (e) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WidgetCustomisationFlowDestination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetCustomisationFlowDestination(Class dependenciesClazz, WidgetContext widgetContext, String widgetId, String widgetType, e config) {
        super(new InputData(dependenciesClazz, widgetContext, widgetId, widgetType, config));
        Intrinsics.checkNotNullParameter(dependenciesClazz, "dependenciesClazz");
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f96352b = dependenciesClazz;
        this.f96353c = widgetContext;
        this.d = widgetId;
        this.e = widgetType;
        this.f = config;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WidgetCustomisationFlowDestination)) {
            return false;
        }
        WidgetCustomisationFlowDestination widgetCustomisationFlowDestination = (WidgetCustomisationFlowDestination) obj2;
        return Intrinsics.f(this.f96352b, widgetCustomisationFlowDestination.f96352b) && Intrinsics.f(this.f96353c, widgetCustomisationFlowDestination.f96353c) && Intrinsics.f(this.d, widgetCustomisationFlowDestination.d) && Intrinsics.f(this.e, widgetCustomisationFlowDestination.e) && Intrinsics.f(this.f, widgetCustomisationFlowDestination.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c(p.a.c((this.f96353c.hashCode() + (this.f96352b.hashCode() * 31)) * 31, 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f96352b);
        dest.writeParcelable(this.f96353c, i);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeSerializable(this.f);
    }
}
