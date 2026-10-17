package m9;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class g extends i2b.a implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f203595c;
    public static final Object d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f203596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient HashMap f203597b;

    static {
        Map map = Collections.EMPTY_MAP;
        f203595c = new g();
        d = new Object();
    }

    public g() {
        this.f203596a = Collections.EMPTY_MAP;
        this.f203597b = null;
    }

    public g(HashMap map) {
        this.f203596a = Collections.EMPTY_MAP;
        this.f203597b = map;
    }
}
