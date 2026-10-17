package eg;

import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f125401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f125402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f125403c;

    public b(String appId, e0 logEnvironment, a androidAppInfo) {
        String deviceModel = Build.MODEL;
        String osVersion = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter("2.1.2", "sessionSdkVersion");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(logEnvironment, "logEnvironment");
        Intrinsics.checkNotNullParameter(androidAppInfo, "androidAppInfo");
        this.f125401a = appId;
        this.f125402b = logEnvironment;
        this.f125403c = androidAppInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        if (!Intrinsics.f(this.f125401a, bVar.f125401a)) {
            return false;
        }
        String str = Build.MODEL;
        if (!Intrinsics.f(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        return Intrinsics.f(str2, str2) && this.f125402b == bVar.f125402b && this.f125403c.equals(bVar.f125403c);
    }

    public final int hashCode() {
        return this.f125403c.hashCode() + ((this.f125402b.hashCode() + p.a.c((((Build.MODEL.hashCode() + (this.f125401a.hashCode() * 31)) * 31) + 47595001) * 31, 31, Build.VERSION.RELEASE)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f125401a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=2.1.2, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + this.f125402b + ", androidAppInfo=" + this.f125403c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
