package vf0;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f288471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f288472b;

    public /* synthetic */ u(int i, Set set) {
        this.f288471a = i;
        this.f288472b = set;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f288471a;
        Set set = this.f288472b;
        Throwable th10 = (Throwable) obj2;
        switch (i) {
            case 0:
                Intrinsics.h(th10);
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, th10, set);
                break;
            case 1:
                Intrinsics.h(th10);
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, th10, set);
                break;
            case 2:
                Intrinsics.h(th10);
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, th10, set);
                break;
            default:
                Intrinsics.h(th10);
                CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, th10, set);
                break;
        }
        return Unit.f186387a;
    }
}
