package cdh;

import kotlin.jvm.functions.Function0;
import xzg.n0;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f23253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f23254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f23255c;
    public final /* synthetic */ n0 d;

    public h(j jVar, String str, String str2, n0 n0Var) {
        this.f23253a = jVar;
        this.f23254b = str;
        this.f23255c = str2;
        this.d = n0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new go.g(this.f23253a.j(this.f23254b, this.f23255c, this.d), 2);
    }
}
