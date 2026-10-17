package ai0;

import android.content.Context;
import com.google.android.gms.maps.model.MapStyleOptions;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p extends gi0.b {
    public static o7.b a(int i, Context clientContext) {
        Intrinsics.checkNotNullParameter(clientContext, "clientContext");
        MapStyleOptions mapStyleOptionsLoadRawResourceStyle = MapStyleOptions.loadRawResourceStyle(clientContext, i);
        Intrinsics.checkNotNullExpressionValue(mapStyleOptionsLoadRawResourceStyle, "loadRawResourceStyle(...)");
        Intrinsics.checkNotNullParameter(mapStyleOptionsLoadRawResourceStyle, "<this>");
        return new o7.b(mapStyleOptionsLoadRawResourceStyle);
    }
}
