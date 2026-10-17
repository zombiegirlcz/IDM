package fy6;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sr6.l f138954b;

    public /* synthetic */ v(sr6.l lVar, int i) {
        this.f138953a = i;
        this.f138954b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f138953a) {
            case 0:
                i update = (i) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                h hVar = update.f138939c;
                return i.a(update, null, null, hVar != null ? h.a(hVar, n.a(hVar.f138935a, null, this.f138954b, 1), null, 2) : null, null, 11);
            default:
                oy6.f update2 = (oy6.f) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                oy6.j jVar = update2.f230894c;
                return oy6.f.a(update2, null, jVar != null ? oy6.j.a(jVar, this.f138954b, null, 2) : null, 3);
        }
    }
}
