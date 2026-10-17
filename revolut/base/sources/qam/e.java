package qam;

import android.hardware.Camera;
import android.view.Display;
import ip0.jp;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import nd.k;
import pak.h;
import skm.e0;
import skm.r;
import uam.j;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f244067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f244068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f244069c;
    public final hbm.a d;
    public final kdh.b e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public fbm.d f244070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public r f244071h;
    public nam.b i;

    public e(k logger, h display, j scaleType, hbm.a cameraRenderer, kdh.b executor, nam.b initialConfiguration, fbm.d newLensPosition) {
        int numberOfCameras = Camera.getNumberOfCameras();
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        Intrinsics.checkNotNullParameter(cameraRenderer, "cameraRenderer");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(initialConfiguration, "initialConfiguration");
        Intrinsics.checkNotNullParameter(newLensPosition, "initialLensPositionSelector");
        this.f244067a = logger;
        this.f244068b = display;
        this.f244069c = scaleType;
        this.d = cameraRenderer;
        this.e = executor;
        IntRange intRangeO = kotlin.ranges.f.o(0, numberOfCameras);
        ArrayList arrayList = new ArrayList(w.t(intRangeO, 10));
        vim.f it8 = intRangeO.iterator();
        while (it8.f289625c) {
            arrayList.add(new b(this.f244067a, qk.d.g(it8.nextInt())));
        }
        this.f = arrayList;
        this.f244070g = newLensPosition;
        this.f244071h = e0.b();
        nam.b.Companion.getClass();
        this.i = nam.a.a();
        Intrinsics.checkNotNullParameter(newLensPosition, "newLensPosition");
        this.f244067a.getClass();
        k.k();
        this.f244070g = newLensPosition;
        this.i = initialConfiguration;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(qam.e r17, qam.b r18, gim.c r19) {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qam.e.a(qam.e, qam.b, gim.c):java.lang.Object");
    }

    public final jp b() {
        sam.c cVar = sam.c.f261459c;
        int rotation = ((Display) this.f244068b.f234573b).getRotation();
        return rotation != 0 ? rotation != 1 ? rotation != 2 ? rotation != 3 ? cVar : sam.a.d : sam.c.d : sam.a.f261457c : cVar;
    }

    public final b c() {
        try {
            return (b) this.f244071h.I();
        } catch (IllegalStateException unused) {
            throw new IllegalStateException("Camera has not started!");
        }
    }

    public final void d(nam.c newConfiguration) {
        Intrinsics.checkNotNullParameter(newConfiguration, "newConfiguration");
        this.f244067a.getClass();
        k.k();
        nam.b savedConfiguration = this.i;
        Intrinsics.checkNotNullParameter(savedConfiguration, "savedConfiguration");
        Intrinsics.checkNotNullParameter(newConfiguration, "newConfiguration");
        Function1 function1E = newConfiguration.e();
        if (function1E == null) {
            function1E = savedConfiguration.f213941a;
        }
        Function1 function1 = function1E;
        Function1 function1H = newConfiguration.h();
        if (function1H == null) {
            function1H = savedConfiguration.f213942b;
        }
        Function1 function12 = function1H;
        Function1 function1B = newConfiguration.b();
        if (function1B == null) {
            function1B = savedConfiguration.d;
        }
        Function1 function13 = function1B;
        Function1 function1C = newConfiguration.c();
        if (function1C == null) {
            function1C = savedConfiguration.e;
        }
        Function1 function14 = function1C;
        Function1 function1F = newConfiguration.f();
        if (function1F == null) {
            function1F = savedConfiguration.f;
        }
        Function1 function15 = function1F;
        Function1 function1D = newConfiguration.d();
        if (function1D == null) {
            function1D = savedConfiguration.f213945h;
        }
        Function1 function16 = function1D;
        Function1 function1G = newConfiguration.g();
        if (function1G == null) {
            function1G = savedConfiguration.i;
        }
        Function1 function17 = function1G;
        Function1 function1A = newConfiguration.a();
        if (function1A == null) {
            function1A = savedConfiguration.f213946j;
        }
        this.i = new nam.b(function1, function12, (fbm.d) null, function13, function14, function15, function16, function17, function1A, 68);
    }
}
