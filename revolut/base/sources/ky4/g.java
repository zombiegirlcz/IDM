package ky4;

import aii.r;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f190625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f190626c;

    public /* synthetic */ g(AtomicBoolean atomicBoolean, Function1 function1, int i) {
        this.f190624a = i;
        this.f190625b = atomicBoolean;
        this.f190626c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f190624a) {
            case 0:
                r it8 = (r) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f190625b.set(true);
                this.f190626c.invoke(it8);
                break;
            case 1:
                r it9 = (r) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                this.f190625b.set(true);
                this.f190626c.invoke(it9);
                break;
            default:
                if (this.f190625b.compareAndSet(true, false)) {
                    this.f190626c.invoke(obj2);
                }
                break;
        }
        return Unit.f186387a;
    }
}
