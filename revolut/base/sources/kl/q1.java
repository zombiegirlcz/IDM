package kl;

import com.onfido.hosted.web.module.model.HostedWebModuleFailed;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class q1 implements igm.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q1 f185227b = new q1(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q1 f185228c = new q1(1);
    public static final q1 d = new q1(2);
    public static final q1 e = new q1(3);
    public static final q1 f = new q1(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final q1 f185229g = new q1(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final q1 f185230h = new q1(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f185231a;

    public /* synthetic */ q1(int i) {
        this.f185231a = i;
    }

    @Override // igm.p
    public final boolean test(Object it8) {
        switch (this.f185231a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof sl.v;
            case 1:
                sl.x task = (sl.x) it8;
                Intrinsics.checkNotNullParameter(task, "task");
                return (task instanceof sl.q) || (task instanceof sl.p);
            case 2:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof sl.w;
            case 3:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof ml.d0;
            case 4:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof HostedWebModuleFailed;
            case 5:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof sl.m;
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof ml.o0;
        }
    }
}
