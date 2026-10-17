package ai0;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class r extends MapView implements ah0.g {
    public final void a(final ah0.h callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        super.getMapAsync(new OnMapReadyCallback() { // from class: ai0.q
            @Override // com.google.android.gms.maps.OnMapReadyCallback
            public final void onMapReady(GoogleMap p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                Intrinsics.checkNotNullParameter(p0, "<this>");
                callback.a(new k(p0));
            }
        });
    }

    @Override // gh0.a
    @NotNull
    public gh0.d getSource() {
        return gh0.d.GOOGLE;
    }
}
