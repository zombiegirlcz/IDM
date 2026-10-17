package ygm;

import fgm.p;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class e implements fgm.d, fgm.l, fgm.e, p, fgm.b, dom.b, Disposable {
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

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        bVar.cancel();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return true;
    }

    @Override // dom.a
    public final void onComplete() {
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        jb3.l.v(th10);
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        disposable.dispose();
    }

    @Override // fgm.e, fgm.p
    public final void onSuccess(Object obj2) {
    }
}
