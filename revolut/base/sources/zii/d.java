package zii;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f322570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f322571c;

    public /* synthetic */ d(h hVar, Function1 function1, int i) {
        this.f322569a = i;
        this.f322570b = hVar;
        this.f322571c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Throwable th10 = (Throwable) obj2;
        switch (this.f322569a) {
            case 0:
                Intrinsics.h(th10);
                h hVar = this.f322570b;
                if (!hVar.a(th10)) {
                    if (!((Boolean) this.f322571c.invoke(th10)).booleanValue()) {
                        hVar.b(th10, false);
                    }
                }
                break;
            default:
                Intrinsics.h(th10);
                h hVar2 = this.f322570b;
                if (!hVar2.a(th10)) {
                    if (!((Boolean) this.f322571c.invoke(th10)).booleanValue()) {
                        hVar2.b(th10, false);
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
