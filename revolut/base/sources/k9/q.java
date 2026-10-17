package k9;

import d9.z0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes16.dex */
public final class q implements Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final q f182188h = new q(Boolean.TRUE, null, null, null, null, null, null);
    public static final q i = new q(Boolean.FALSE, null, null, null, null, null, null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final q f182189j = new q(null, null, null, null, null, null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f182190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f182191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f182192c;
    public final String d;
    public final transient qy5.a e;
    public final z0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z0 f182193g;

    public q(Boolean bool, String str, Integer num, String str2, qy5.a aVar, z0 z0Var, z0 z0Var2) {
        this.f182190a = bool;
        this.f182191b = str;
        this.f182192c = num;
        this.d = (str2 == null || str2.isEmpty()) ? null : str2;
        this.e = aVar;
        this.f = z0Var;
        this.f182193g = z0Var2;
    }
}
