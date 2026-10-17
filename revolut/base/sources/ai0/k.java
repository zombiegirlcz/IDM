package ai0;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.MapStyleOptions;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k extends gi0.b implements ah0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GoogleMap f5155a;

    public k(GoogleMap internal) {
        Intrinsics.checkNotNullParameter(internal, "internal");
        this.f5155a = internal;
    }

    public final void a(zjh.j update) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(update, "<this>");
        this.f5155a.animateCamera((CameraUpdate) update.f322839a);
    }

    public final n b() {
        UiSettings uiSettings = this.f5155a.getUiSettings();
        Intrinsics.checkNotNullExpressionValue(uiSettings, "getUiSettings(...)");
        Intrinsics.checkNotNullParameter(uiSettings, "<this>");
        return new n(uiSettings);
    }

    public final void c(o7.b styleOptions) {
        Intrinsics.checkNotNullParameter(styleOptions, "styleOptions");
        Intrinsics.checkNotNullParameter(styleOptions, "<this>");
        this.f5155a.setMapStyle((MapStyleOptions) styleOptions.f222639b);
    }

    public final void d(ah0.f value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(value, "<this>");
        this.f5155a.setMapType(value.ordinal());
    }
}
