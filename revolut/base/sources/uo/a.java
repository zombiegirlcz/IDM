package uo;

import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f281458a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f281459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f281460c;

    public /* synthetic */ a(Object obj2, b bVar) {
        this.f281459b = obj2;
        this.f281460c = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f281458a) {
            case 0:
                b bVar = this.f281460c;
                Object obj2 = this.f281459b;
                bVar.f281462b.removeIf(new akl.p(new sx4.b(obj2, 7), 25));
                synchronized (bVar) {
                    bVar.f281463c.entrySet().removeIf(new akl.p(new sx4.b(obj2, 8), 26));
                }
                if (bVar.f281461a) {
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.b(rd0.c.DEBUG, "ActiveScreenHolder", a0.d.s("Screen detached: ", b.g(obj2), "\n", b.a(bVar)), null, null, 16);
                }
                return Unit.f186387a;
            default:
                Object obj3 = this.f281459b;
                b bVar2 = this.f281460c;
                if (Intrinsics.f(bVar2.c(), obj3)) {
                    if (bVar2.f281461a) {
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.b(rd0.c.DEBUG, "ActiveScreenHolder", j6.a.q("Ignore attaching the same screen ", b.g(obj3)), null, null, 16);
                    }
                    return Unit.f186387a;
                }
                Object objC = bVar2.c();
                bVar2.f281462b.add(new WeakReference(obj3));
                if (objC != null) {
                    synchronized (bVar2) {
                        bVar2.f281463c.put(obj3, new WeakReference(objC));
                        Unit unit = Unit.f186387a;
                    }
                }
                if (bVar2.f281461a) {
                    CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                    rd0.d.b(rd0.c.DEBUG, "ActiveScreenHolder", a0.d.s("Screen attached: ", b.g(obj3), "\n", b.a(bVar2)), null, null, 16);
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ a(b bVar, Object obj2) {
        this.f281460c = bVar;
        this.f281459b = obj2;
    }
}
