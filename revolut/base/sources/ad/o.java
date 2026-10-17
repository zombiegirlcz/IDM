package ad;

import java.util.Arrays;
import md.w1;
import md.w2;

/* JADX INFO: loaded from: classes17.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f3205c;
    public final w1 d;
    public final w2 e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f3206g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f3207h;

    public o(Object obj2, Object obj3, byte[] bArr, w1 w1Var, w2 w2Var, int i, String str, c cVar) {
        this.f3203a = obj2;
        this.f3204b = obj3;
        this.f3205c = Arrays.copyOf(bArr, bArr.length);
        this.d = w1Var;
        this.e = w2Var;
        this.f = i;
        this.f3206g = str;
        this.f3207h = cVar;
    }
}
