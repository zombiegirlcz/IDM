package zh0;

import android.location.Location;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import kotlin.jvm.internal.Intrinsics;
import tfm.z0;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends LocationCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0 f322206c;

    public d(z0 z0Var) {
        this.f322206c = z0Var;
    }

    @Override // com.google.android.gms.location.LocationCallback
    public final void onLocationResult(LocationResult result) {
        Location lastLocation;
        Intrinsics.checkNotNullParameter(result, "result");
        z0 z0Var = this.f322206c;
        if (z0Var.isDisposed() || (lastLocation = result.getLastLocation()) == null) {
            return;
        }
        z0Var.c(lastLocation);
    }
}
