package com.revolut.feature.home_feed.api.deeplink;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import dsh.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/home_feed/api/deeplink/AddWidgetDeeplinkAction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddWidgetDeeplinkAction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AddWidgetDeeplinkAction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WidgetContext f74688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f74689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f74690c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AddWidgetDeeplinkAction((WidgetContext) parcel.readParcelable(AddWidgetDeeplinkAction.class.getClassLoader()), parcel.readString(), (e) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AddWidgetDeeplinkAction[i];
        }
    }

    public AddWidgetDeeplinkAction(WidgetContext widgetContext, String widgetType, e eVar) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        this.f74688a = widgetContext;
        this.f74689b = widgetType;
        this.f74690c = eVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AddWidgetDeeplinkAction)) {
            return false;
        }
        AddWidgetDeeplinkAction addWidgetDeeplinkAction = (AddWidgetDeeplinkAction) obj2;
        return Intrinsics.f(this.f74688a, addWidgetDeeplinkAction.f74688a) && Intrinsics.f(this.f74689b, addWidgetDeeplinkAction.f74689b) && Intrinsics.f(this.f74690c, addWidgetDeeplinkAction.f74690c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f74688a.hashCode() * 31, 31, this.f74689b);
        e eVar = this.f74690c;
        return iC + (eVar == null ? 0 : eVar.f117319a.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f74688a, i);
        dest.writeString(this.f74689b);
        dest.writeSerializable(this.f74690c);
    }
}
