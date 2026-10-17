package grj;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class m extends q implements Function0 {
    public static final m f = new m();

    public m() {
        super(0, System.class, "nanoTime", "nanoTime()J", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Long.valueOf(System.nanoTime());
    }
}
