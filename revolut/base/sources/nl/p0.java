package nl;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class p0 implements igm.o, igm.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p0 f216934b = new p0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p0 f216935c = new p0(1);
    public static final p0 d = new p0(2);
    public static final p0 e = new p0(3);
    public static final p0 f = new p0(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p0 f216936g = new p0(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f216937a;

    public /* synthetic */ p0(int i) {
        this.f216937a = i;
    }

    @Override // igm.o
    public Object apply(Object obj2) {
        switch (this.f216937a) {
            case 0:
                ml.a0 it8 = (ml.a0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Unit.f186387a;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            default:
                return w0.f.invoke(obj2);
            case 6:
                return j.f.invoke(obj2);
            case 7:
                return a0.f.invoke(obj2);
            case 8:
                return u0.f.invoke(obj2);
        }
    }

    @Override // igm.p
    public boolean test(Object it8) {
        switch (this.f216937a) {
            case 1:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof ml.d0;
            case 2:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof ml.k0;
            case 3:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof ml.i0;
            case 4:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof ml.l0;
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof ml.m0;
        }
    }
}
