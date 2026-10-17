package g31;

import efm.k;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Unit;
import lr9.r;
import mif.o;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f140165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f140166c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(Object obj2, Object obj3, long j2, int i) {
        this.f140164a = i;
        this.f140166c = obj2;
        this.d = obj3;
        this.f140165b = j2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f140164a) {
            case 0:
                Set set = (Set) this.f140166c;
                ue0.c cVar = ((c) this.d).f140167a;
                Iterator it8 = set.iterator();
                while (true) {
                    boolean zHasNext = it8.hasNext();
                    long j2 = this.f140165b;
                    Class cls = Long.TYPE;
                    if (!zHasNext) {
                        if (((Long) cVar.T2("NOTIFICATION_INIT_TIMESTAMP_ID", cls)) == null) {
                            com.google.android.gms.internal.mlkit_vision_face.a.B(cls, cVar, "NOTIFICATION_INIT_TIMESTAMP_ID", Long.valueOf(j2));
                        }
                        return Unit.f186387a;
                    }
                    com.google.android.gms.internal.mlkit_vision_face.a.B(cls, cVar, (String) it8.next(), Long.valueOf(j2));
                }
                break;
            case 1:
                com.google.android.gms.internal.mlkit_vision_face.a.B(Long.TYPE, ((r) this.f140166c).f199470a, j6.a.q("GROUP_CHAT_UPDATE_TS_ID_", (String) this.d), Long.valueOf(this.f140165b));
                return Unit.f186387a;
            case 2:
                Long lX = ((o) this.f140166c).x(this.f140165b, (String) this.d);
                return lX != null ? k.g(Long.valueOf(lX.longValue())) : rfm.h.f253943a;
            default:
                tx9.e eVar = (tx9.e) this.f140166c;
                com.google.android.gms.internal.mlkit_vision_face.a.B(Long.TYPE, eVar.f275375a, (String) this.d, Long.valueOf(this.f140165b));
                return Unit.f186387a;
        }
    }
}
