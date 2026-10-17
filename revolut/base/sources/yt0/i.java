package yt0;

import ix0.i1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f316555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f316556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f316557c;
    public final /* synthetic */ float d;
    public final /* synthetic */ ks0.l e;
    public final /* synthetic */ j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f316558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f316559h;
    public final /* synthetic */ float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f316560j;

    public /* synthetic */ i(float f, float f4, float f5, float f6, ks0.l lVar, j jVar, float f32, float f35, float f36, int i) {
        this.f316555a = f;
        this.f316556b = f4;
        this.f316557c = f5;
        this.d = f6;
        this.e = lVar;
        this.f = jVar;
        this.f316558g = f32;
        this.f316559h = f35;
        this.i = f36;
        this.f316560j = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        float fFloatValue = ((Float) obj2).floatValue();
        float fB = i1.b(this.f316555a, this.f316556b, fFloatValue);
        float fB2 = i1.b(this.f316557c, this.d, fFloatValue);
        j jVar = this.f;
        ks0.l.d(this.e, jVar.i, Float.valueOf(fB), Float.valueOf(fB2), Float.valueOf(fB2), 2);
        jVar.f = i1.b(this.f316558g, this.f316559h, fFloatValue);
        jVar.f316569c.f168696a = i1.b(this.i, this.f316560j, fFloatValue);
        jVar.e();
        return Unit.f186387a;
    }
}
