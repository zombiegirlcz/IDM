package zh0;

import com.google.android.gms.location.LocationRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class a {
    public static final LocationRequest a(zg0.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        LocationRequest priority = LocationRequest.create().setSmallestDisplacement(bVar.f).setNumUpdates(bVar.e).setMaxWaitTime(bVar.f322047g).setInterval(bVar.f322045b).setFastestInterval(bVar.f322046c).setExpirationTime(0L).setExpirationDuration(bVar.d).setPriority(bVar.f322044a.a());
        Intrinsics.checkNotNullExpressionValue(priority, "setPriority(...)");
        return priority;
    }
}
