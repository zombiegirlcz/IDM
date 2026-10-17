package x35;

import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public abstract class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f302654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f302655b;

    public e(h hVar, String str) {
        this.f302654a = hVar;
        this.f302655b = str;
    }

    public String a() {
        return this.f302655b;
    }

    public h b() {
        return this.f302654a;
    }
}
