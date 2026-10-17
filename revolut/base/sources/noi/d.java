package noi;

import ho.y;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f218050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f218051b;

    public /* synthetic */ d(h hVar, int i) {
        this.f218050a = i;
        this.f218051b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f218050a;
        h hVar = this.f218051b;
        switch (i) {
            case 0:
                String simpleName = hVar.getClass().getSimpleName();
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.DEBUG, simpleName, "User properties event generated " + ((Map) obj2), null, null, 16);
                break;
            case 1:
                ho.n it8 = (ho.n) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            case 2:
                ho.n nVar = (ho.n) obj2;
                String str = "Track custom event " + nVar;
                try {
                    Intrinsics.h(nVar);
                    hVar.f(nVar);
                } catch (Throwable th10) {
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.b(rd0.c.ERROR, null, str != null ? "Failed to do action: ".concat(str) : null, th10, null, 16);
                }
                break;
            case 3:
                String simpleName2 = hVar.getClass().getSimpleName();
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.b(rd0.c.DEBUG, simpleName2, "User info event generated " + ((y) obj2), null, null, 16);
                break;
            default:
                y yVar = (y) obj2;
                String str2 = "Track user info event " + yVar;
                try {
                    Intrinsics.h(yVar);
                    hVar.d(yVar);
                } catch (Throwable th11) {
                    CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                    rd0.d.b(rd0.c.ERROR, null, str2 != null ? "Failed to do action: ".concat(str2) : null, th11, null, 16);
                }
                break;
        }
        return Unit.f186387a;
    }
}
