package rh0;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import gh0.d;
import gh0.f;
import gh0.g;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;

/* JADX INFO: loaded from: classes.dex */
public final class b extends gi0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f254292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f254293b;

    public b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        a googleApiProvider = a.f;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(googleApiProvider, "googleApiProvider");
        this.f254292a = context;
        this.f254293b = j.b(googleApiProvider);
    }

    public final GoogleApiAvailability a() {
        return (GoogleApiAvailability) this.f254293b.getValue();
    }

    public final g b() {
        GoogleApiAvailability googleApiAvailabilityA = a();
        Context context = this.f254292a;
        int iIsGooglePlayServicesAvailable = googleApiAvailabilityA.isGooglePlayServicesAvailable(context);
        f fVar = iIsGooglePlayServicesAvailable == 0 ? f.NOT_REQUIRED : a().isUserResolvableError(iIsGooglePlayServicesAvailable) ? f.AVAILABLE : f.NOT_AVAILABLE;
        d dVar = d.GOOGLE;
        int apkVersion = a().getApkVersion(context);
        boolean zIsPlayServicesPossiblyUpdating = a().isPlayServicesPossiblyUpdating(context, iIsGooglePlayServicesAvailable);
        boolean zIsPlayStorePossiblyUpdating = a().isPlayStorePossiblyUpdating(context, iIsGooglePlayServicesAvailable);
        String errorString = a().getErrorString(iIsGooglePlayServicesAvailable);
        Intrinsics.checkNotNullExpressionValue(errorString, "getErrorString(...)");
        return new g(dVar, apkVersion, zIsPlayServicesPossiblyUpdating, zIsPlayStorePossiblyUpdating, fVar, errorString);
    }
}
