package ecm;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public final class j0 {
    public static final Logger d = Logger.getLogger(j0.class.getName());
    public static final j0 e = new j0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentSkipListMap f124824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f124825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f124826c;

    public j0() {
        new ConcurrentSkipListMap();
        this.f124824a = new ConcurrentSkipListMap();
        this.f124825b = new ConcurrentHashMap();
        this.f124826c = new ConcurrentHashMap();
        new ConcurrentHashMap();
    }
}
