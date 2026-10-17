package ug6;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f279950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f279951b;

    public /* synthetic */ g(v vVar, int i) {
        this.f279950a = i;
        this.f279951b = vVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f279950a;
        v vVar = this.f279951b;
        Throwable it8 = (Throwable) obj2;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, it8, h0Var);
                vVar.e3();
                break;
            case 1:
                Intrinsics.checkNotNullParameter(it8, "it");
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, it8, h0Var2);
                vVar.c3();
                break;
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                h0 h0Var3 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, it8, h0Var3);
                vVar.e3();
                break;
        }
        return Boolean.TRUE;
    }
}
