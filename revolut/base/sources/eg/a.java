package eg;

import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f125392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f125393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f125394c;
    public final f0 d;
    public final ArrayList e;

    public a(String packageName, String versionName, String appBuildVersion, f0 currentProcessDetails, ArrayList appProcessDetails) {
        String deviceManufacturer = Build.MANUFACTURER;
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(appBuildVersion, "appBuildVersion");
        Intrinsics.checkNotNullParameter(deviceManufacturer, "deviceManufacturer");
        Intrinsics.checkNotNullParameter(currentProcessDetails, "currentProcessDetails");
        Intrinsics.checkNotNullParameter(appProcessDetails, "appProcessDetails");
        this.f125392a = packageName;
        this.f125393b = versionName;
        this.f125394c = appBuildVersion;
        this.d = currentProcessDetails;
        this.e = appProcessDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        if (!Intrinsics.f(this.f125392a, aVar.f125392a) || !Intrinsics.f(this.f125393b, aVar.f125393b) || !Intrinsics.f(this.f125394c, aVar.f125394c)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return Intrinsics.f(str, str) && this.d.equals(aVar.d) && this.e.equals(aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + p.a.c(p.a.c(p.a.c(this.f125392a.hashCode() * 31, 31, this.f125393b), 31, this.f125394c), 31, Build.MANUFACTURER)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f125392a + ", versionName=" + this.f125393b + ", appBuildVersion=" + this.f125394c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
