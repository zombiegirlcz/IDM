package ai0;

import android.content.Context;
import com.google.android.gms.maps.GoogleMapOptions;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s extends gi0.b {
    public static r a(Context context, n mapOptions) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mapOptions, "options");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mapOptions, "mapOptions");
        Intrinsics.checkNotNullParameter(mapOptions, "<this>");
        return new r(context, (GoogleMapOptions) mapOptions.f5156a);
    }
}
