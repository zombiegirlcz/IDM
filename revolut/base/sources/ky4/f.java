package ky4;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.q;
import pgk.k;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f190622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f190623c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f(Object obj2, int i, Object obj3, Object obj4) {
        this.f190621a = i;
        this.f190623c = obj2;
        this.d = obj3;
        this.f190622b = obj4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b1  */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.q] */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke() {
        /*
            Method dump skipped, instruction units count: 1824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ky4.f.invoke():java.lang.Object");
    }

    public /* synthetic */ f(String str, k kVar, jf0.c cVar, String str2) {
        this.f190621a = 27;
        this.f190623c = str;
        this.d = cVar;
        this.f190622b = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ f(Function2 function2, AtomicBoolean atomicBoolean, Function1 function1) {
        this.f190621a = 0;
        this.f190623c = (q) function2;
        this.d = atomicBoolean;
        this.f190622b = function1;
    }

    public /* synthetic */ f(Ref$BooleanRef ref$BooleanRef, Function1 function1, Ref$ObjectRef ref$ObjectRef) {
        this.f190621a = 1;
        this.f190623c = ref$BooleanRef;
        this.f190622b = function1;
        this.d = ref$ObjectRef;
    }
}
