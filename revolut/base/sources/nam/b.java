package nam;

import ch.qos.logback.core.CoreConstants;
import ip0.v00;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f213941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f213942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f213943c;
    public final Function1 d;
    public final Function1 e;
    public final Function1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Function1 f213944g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Function1 f213945h;
    public final Function1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Function1 f213946j;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(Function1 function1, Function1 function12, fbm.d dVar, Function1 function13, Function1 function14, Function1 function15, Function1 function16, Function1 function17, Function1 function18, int i) {
        Function1 function1K;
        fbm.b bVar = fbm.b.k;
        Function1 dVar2 = (i & 1) != 0 ? new fbm.d(uam.c.d, 1) : function1;
        Function1 function1K2 = (i & 2) != 0 ? czi.c.k(new fbm.d(uam.e.f278691c, 1), new fbm.d(uam.e.f278690b, 1), new fbm.d(uam.e.f, 1), new fbm.d(uam.e.f278692g, 1)) : function12;
        fbm.d dVar3 = (i & 4) != 0 ? new fbm.d(90, 1) : dVar;
        Function1 dVar4 = (i & 8) != 0 ? new fbm.d(0, 1) : function13;
        Function1 function19 = (i & 16) != 0 ? null : function14;
        if ((i & 32) != 0) {
            fbm.b bVar2 = fbm.b.f133562j;
            function1K = czi.c.k(czi.c.j(bVar2, fbm.b.i), czi.c.j(bVar2, fbm.b.f133561h));
        } else {
            function1K = function15;
        }
        this(dVar2, function1K2, dVar3, dVar4, function19, function1K, czi.c.k(new fbm.d(uam.a.f278684b, 1), new fbm.d(uam.a.f278685c, 1), new fbm.d(uam.a.d, 1), new fbm.d(uam.a.e, 1)), (i & 128) == 0 ? function16 : null, (i & 256) != 0 ? bVar : function17, (i & 512) != 0 ? bVar : function18);
    }

    public static b i(b bVar, v00 v00Var) {
        Function1 flashMode = bVar.f213941a;
        Function1 focusMode = bVar.f213942b;
        Function1 jpegQuality = bVar.f213943c;
        Function1 exposureCompensation = bVar.d;
        Function1 previewFpsRange = bVar.f;
        Function1 antiBandingMode = bVar.f213944g;
        Function1 function1 = bVar.f213945h;
        Function1 pictureResolution = bVar.i;
        Function1 previewResolution = bVar.f213946j;
        Intrinsics.checkNotNullParameter(flashMode, "flashMode");
        Intrinsics.checkNotNullParameter(focusMode, "focusMode");
        Intrinsics.checkNotNullParameter(jpegQuality, "jpegQuality");
        Intrinsics.checkNotNullParameter(exposureCompensation, "exposureCompensation");
        Intrinsics.checkNotNullParameter(previewFpsRange, "previewFpsRange");
        Intrinsics.checkNotNullParameter(antiBandingMode, "antiBandingMode");
        Intrinsics.checkNotNullParameter(pictureResolution, "pictureResolution");
        Intrinsics.checkNotNullParameter(previewResolution, "previewResolution");
        return new b(flashMode, focusMode, jpegQuality, exposureCompensation, v00Var, previewFpsRange, antiBandingMode, function1, pictureResolution, previewResolution);
    }

    @Override // nam.c
    public final Function1 a() {
        return this.f213946j;
    }

    @Override // nam.c
    public final Function1 b() {
        return this.d;
    }

    @Override // nam.c
    public final Function1 c() {
        return this.e;
    }

    @Override // nam.c
    public final Function1 d() {
        return this.f213945h;
    }

    @Override // nam.c
    public final Function1 e() {
        return this.f213941a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f213941a, bVar.f213941a) && Intrinsics.f(this.f213942b, bVar.f213942b) && Intrinsics.f(this.f213943c, bVar.f213943c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f213944g, bVar.f213944g) && Intrinsics.f(this.f213945h, bVar.f213945h) && Intrinsics.f(this.i, bVar.i) && Intrinsics.f(this.f213946j, bVar.f213946j);
    }

    @Override // nam.c
    public final Function1 f() {
        return this.f;
    }

    @Override // nam.c
    public final Function1 g() {
        return this.i;
    }

    @Override // nam.c
    public final Function1 h() {
        return this.f213942b;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.f213943c.hashCode() + ((this.f213942b.hashCode() + (this.f213941a.hashCode() * 31)) * 31)) * 31)) * 31;
        Function1 function1 = this.e;
        int iHashCode2 = (this.f213944g.hashCode() + ((this.f.hashCode() + ((iHashCode + (function1 == null ? 0 : function1.hashCode())) * 31)) * 31)) * 31;
        Function1 function12 = this.f213945h;
        return this.f213946j.hashCode() + ((this.i.hashCode() + ((iHashCode2 + (function12 != null ? function12.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "CameraConfiguration(flashMode=" + this.f213941a + ", focusMode=" + this.f213942b + ", jpegQuality=" + this.f213943c + ", exposureCompensation=" + this.d + ", frameProcessor=" + this.e + ", previewFpsRange=" + this.f + ", antiBandingMode=" + this.f213944g + ", sensorSensitivity=" + this.f213945h + ", pictureResolution=" + this.i + ", previewResolution=" + this.f213946j + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public b(Function1 flashMode, Function1 focusMode, Function1 jpegQuality, Function1 exposureCompensation, Function1 function1, Function1 previewFpsRange, Function1 antiBandingMode, Function1 function12, Function1 pictureResolution, Function1 previewResolution) {
        Intrinsics.checkNotNullParameter(flashMode, "flashMode");
        Intrinsics.checkNotNullParameter(focusMode, "focusMode");
        Intrinsics.checkNotNullParameter(jpegQuality, "jpegQuality");
        Intrinsics.checkNotNullParameter(exposureCompensation, "exposureCompensation");
        Intrinsics.checkNotNullParameter(previewFpsRange, "previewFpsRange");
        Intrinsics.checkNotNullParameter(antiBandingMode, "antiBandingMode");
        Intrinsics.checkNotNullParameter(pictureResolution, "pictureResolution");
        Intrinsics.checkNotNullParameter(previewResolution, "previewResolution");
        this.f213941a = flashMode;
        this.f213942b = focusMode;
        this.f213943c = jpegQuality;
        this.d = exposureCompensation;
        this.e = function1;
        this.f = previewFpsRange;
        this.f213944g = antiBandingMode;
        this.f213945h = function12;
        this.i = pictureResolution;
        this.f213946j = previewResolution;
    }
}
