package kotlin.reflect;

import wim.n;

/* JADX INFO: loaded from: classes13.dex */
public interface KProperty extends KCallable {

    /* JADX INFO: loaded from: classes14.dex */
    public interface Getter extends n, KFunction {
    }

    Getter getGetter();

    boolean isConst();

    boolean isLateinit();
}
