package ahm;

import fgm.l;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class d implements l {
    private static final /* synthetic */ d[] $VALUES;
    public static final d INSTANCE;

    static {
        d dVar = new d("INSTANCE", 0);
        INSTANCE = dVar;
        $VALUES = new d[]{dVar};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    @Override // fgm.l
    public final void onComplete() {
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
    }
}
