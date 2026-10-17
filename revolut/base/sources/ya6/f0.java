package ya6;

import java.lang.reflect.Type;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import s7a.m0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f311962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f311963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f311964c;

    public /* synthetic */ f0(h0 h0Var, Set set, int i) {
        this.f311962a = i;
        this.f311963b = h0Var;
        this.f311964c = set;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Set setI1;
        Set setI12;
        switch (this.f311962a) {
            case 0:
                h0 h0Var = this.f311963b;
                Set set = this.f311964c;
                synchronized (h0Var) {
                    try {
                        xe0.e eVar = h0Var.f311970a;
                        Type PENDING_DONATIONS_TYPE = h0.f311969b;
                        Intrinsics.checkNotNullExpressionValue(PENDING_DONATIONS_TYPE, "PENDING_DONATIONS_TYPE");
                        Iterable iterable = (Set) eVar.T2("STORAGE_KEY_PENDING_DONATIONS", PENDING_DONATIONS_TYPE);
                        if (iterable == null) {
                            iterable = zhm.h0.f322473a;
                        }
                        Set setH1 = zhm.d0.h1(iterable);
                        if (setH1.removeIf(new xge.c0(3, new m0(26, set)))) {
                            xe0.e eVar2 = h0Var.f311970a;
                            KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                            KType kTypeB = o0.b(ab6.a.class);
                            companion.getClass();
                            eVar2.G(setH1, "STORAGE_KEY_PENDING_DONATIONS", wim.z.d(o0.f186429a.d(o0.c(Set.class, KTypeProjection.Companion.a(kTypeB)))));
                        }
                        setI1 = zhm.d0.i1(setH1);
                    } catch (Throwable th10) {
                        throw th10;
                    }
                }
                return setI1;
            default:
                h0 h0Var2 = this.f311963b;
                Set set2 = this.f311964c;
                synchronized (h0Var2) {
                    try {
                        xe0.e eVar3 = h0Var2.f311970a;
                        Type PENDING_DONATIONS_TYPE2 = h0.f311969b;
                        Intrinsics.checkNotNullExpressionValue(PENDING_DONATIONS_TYPE2, "PENDING_DONATIONS_TYPE");
                        Iterable iterable2 = (Set) eVar3.T2("STORAGE_KEY_PENDING_DONATIONS", PENDING_DONATIONS_TYPE2);
                        if (iterable2 == null) {
                            iterable2 = zhm.h0.f322473a;
                        }
                        Set setH12 = zhm.d0.h1(iterable2);
                        setH12.addAll(set2);
                        xe0.e eVar4 = h0Var2.f311970a;
                        KTypeProjection.Companion companion2 = KTypeProjection.INSTANCE;
                        KType kTypeB2 = o0.b(ab6.a.class);
                        companion2.getClass();
                        eVar4.G(setH12, "STORAGE_KEY_PENDING_DONATIONS", wim.z.d(o0.f186429a.d(o0.c(Set.class, KTypeProjection.Companion.a(kTypeB2)))));
                        setI12 = zhm.d0.i1(setH12);
                    } catch (Throwable th11) {
                        throw th11;
                    }
                }
                return setI12;
        }
    }
}
