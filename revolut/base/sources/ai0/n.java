package ai0;

import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.UiSettings;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n extends gi0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5156a;

    public n(GoogleMapOptions internal) {
        Intrinsics.checkNotNullParameter(internal, "internal");
        this.f5156a = internal;
    }

    public n(UiSettings googleUiSettings) {
        Intrinsics.checkNotNullParameter(googleUiSettings, "googleUiSettings");
        this.f5156a = googleUiSettings;
    }
}
