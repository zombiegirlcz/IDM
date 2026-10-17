package nam;

import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements c {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fbm.d f213947a;

    public e(fbm.d dVar) {
        this.f213947a = dVar;
    }

    @Override // nam.c
    public final Function1 a() {
        return null;
    }

    @Override // nam.c
    public final Function1 b() {
        return null;
    }

    @Override // nam.c
    public final Function1 c() {
        return null;
    }

    @Override // nam.c
    public final Function1 d() {
        return null;
    }

    @Override // nam.c
    public final Function1 e() {
        return this.f213947a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f213947a.equals(((e) obj2).f213947a);
    }

    @Override // nam.c
    public final Function1 f() {
        return null;
    }

    @Override // nam.c
    public final Function1 g() {
        return null;
    }

    @Override // nam.c
    public final Function1 h() {
        return null;
    }

    public final int hashCode() {
        return this.f213947a.hashCode() * (-196513505);
    }

    public final String toString() {
        return "UpdateConfiguration(flashMode=" + this.f213947a + ", focusMode=null, jpegQuality=null, exposureCompensation=null, frameProcessor=null, previewFpsRange=null, antiBandingMode=null, sensorSensitivity=null, previewResolution=null, pictureResolution=null)";
    }
}
