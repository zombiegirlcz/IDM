package up0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f281764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f281765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f281766c;
    public final int d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f281767g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f281768h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f281769j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f281770l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f281771m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f281772n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f281773p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f281774q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f281775r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f281776s;

    public v(r glProgram) {
        Intrinsics.checkNotNullParameter(glProgram, "glProgram");
        this.f281764a = glProgram.b("resolution");
        this.f281765b = glProgram.b("sceneCenter");
        this.f281766c = glProgram.b("time");
        this.d = glProgram.b("density");
        this.e = glProgram.b("particleColor");
        this.f = glProgram.b("primaryEndIndex");
        this.f281767g = glProgram.b("grayEndIndex");
        this.f281768h = glProgram.b("blackHoleRawMotionProgress");
        this.i = glProgram.b("blackHoleOpacityProgress");
        this.f281769j = glProgram.b("blackHoleStartIndex");
        this.k = glProgram.b("blackHoleEndIndex");
        this.f281770l = glProgram.b("blackHoleDirection");
        this.f281771m = glProgram.b("interactionPoint");
        this.f281772n = glProgram.b("interactionRadius");
        this.o = glProgram.b("interactionStrength");
        this.f281773p = glProgram.b("rectCollapseEnabled");
        this.f281774q = glProgram.b("rectCollapseCenter");
        this.f281775r = glProgram.b("rectCollapseHalfSize");
        this.f281776s = glProgram.b("rectCollapseProgress");
    }
}
