package zfm;

import efm.f0;
import efm.y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements efm.j, y, efm.l, f0, efm.d, dom.b, ifm.c {
    private static final /* synthetic */ e[] $VALUES;
    public static final e INSTANCE;

    static {
        e eVar = new e("INSTANCE", 0);
        INSTANCE = eVar;
        $VALUES = new e[]{eVar};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    @Override // dom.b
    public final void a(long j2) {
    }

    @Override // dom.b
    public final void cancel() {
    }

    @Override // ifm.c
    public final void dispose() {
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        bVar.cancel();
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return true;
    }

    @Override // dom.a
    public final void onComplete() {
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        mo3.a.m(th10);
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        cVar.dispose();
    }

    @Override // efm.l, efm.f0
    public final void onSuccess(Object obj2) {
    }
}
