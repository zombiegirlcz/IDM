package ez8;

import com.revolut.kompot.bridge.navigation.BridgeDestination;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f130917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BridgeDestination f130918b;

    public a(byte[] imageBytes, BridgeDestination backCommandDestination) {
        Intrinsics.checkNotNullParameter(imageBytes, "imageBytes");
        Intrinsics.checkNotNullParameter(backCommandDestination, "backCommandDestination");
        this.f130917a = imageBytes;
        this.f130918b = backCommandDestination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Arrays.equals(this.f130917a, aVar.f130917a) && this.f130918b.equals(aVar.f130918b);
    }

    public final int hashCode() {
        return this.f130918b.f98270a.hashCode() + (Arrays.hashCode(this.f130917a) * 31);
    }
}
