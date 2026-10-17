package tx9;

import java.util.concurrent.Callable;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.internal.o0;
import org.joda.time.DateTime;
import te0.v;
import te0.w;
import wim.z;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f275370b;

    public /* synthetic */ a(e eVar, int i) {
        this.f275369a = i;
        this.f275370b = eVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f275369a) {
            case 0:
                e eVar = this.f275370b;
                eVar.f275375a.G(0, "REFACTORED_RECENTS_INITIAL_LOAD_TIMESTAMP_V2", z.d(o0.b(Integer.TYPE)));
                ((v) eVar.f275377c.getValue()).set(0L);
                return Unit.f186387a;
            case 1:
                return (Long) w.M((v) this.f275370b.f275377c.getValue(), 0L);
            case 2:
                e eVar2 = this.f275370b;
                Lazy lazy = eVar2.f275377c;
                if (((Number) w.M((v) lazy.getValue(), 0L)).longValue() > 0) {
                    return Unit.f186387a;
                }
                long millis = DateTime.now().getMillis();
                eVar2.f275375a.G(Long.valueOf(millis), "REFACTORED_RECENTS_INITIAL_LOAD_TIMESTAMP_V2", z.d(o0.b(Long.TYPE)));
                ((v) lazy.getValue()).set(Long.valueOf(millis));
                return Unit.f186387a;
            case 3:
                return (Long) w.M((v) this.f275370b.d.getValue(), 0L);
            case 4:
                return (Boolean) w.M((v) this.f275370b.e.getValue(), Boolean.FALSE);
            default:
                e eVar3 = this.f275370b;
                Lazy lazy2 = eVar3.f275376b;
                if (((Number) w.M((v) lazy2.getValue(), 0L)).longValue() > 0) {
                    return Unit.f186387a;
                }
                long millis2 = DateTime.now().getMillis();
                eVar3.f275375a.G(Long.valueOf(millis2), "REFACTORED_RECENTS_DEFAULT_TIMESTAMP_V2", z.d(o0.b(Long.TYPE)));
                ((v) lazy2.getValue()).set(Long.valueOf(millis2));
                return Unit.f186387a;
        }
    }
}
