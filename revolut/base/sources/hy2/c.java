package hy2;

import e93.o;
import h93.j0;
import h93.l0;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import v6l.s;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f156693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f156694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0 f156695c;
    public final /* synthetic */ l0 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f156696g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ List f156697h;
    public final /* synthetic */ o i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e93.b f156698j;
    public final /* synthetic */ boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f156699l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f156700m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j0 f156701n;
    public final /* synthetic */ l0 o;

    public /* synthetic */ c(f fVar, boolean z, j0 j0Var, l0 l0Var, String str, String str2, String str3, List list, o oVar, e93.b bVar, boolean z3, boolean z4, boolean z6, j0 j0Var2, l0 l0Var2) {
        this.f156693a = fVar;
        this.f156694b = z;
        this.f156695c = j0Var;
        this.d = l0Var;
        this.e = str;
        this.f = str2;
        this.f156696g = str3;
        this.f156697h = list;
        this.i = oVar;
        this.f156698j = bVar;
        this.k = z3;
        this.f156699l = z4;
        this.f156700m = z6;
        this.f156701n = j0Var2;
        this.o = l0Var2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String targetWalletId = (String) obj2;
        Intrinsics.checkNotNullParameter(targetWalletId, "targetWalletId");
        f fVar = this.f156693a;
        boolean zE = fVar.e();
        s sVar = fVar.f156704a;
        boolean z = this.f156694b;
        String str = this.e;
        String str2 = this.f;
        String str3 = this.f156696g;
        List list = this.f156697h;
        o oVar = this.i;
        e93.b bVar = this.f156698j;
        boolean z3 = this.k;
        return zE ? sVar.d(z, targetWalletId, this.f156695c, this.d, str, str2, str3, list, oVar, bVar, z3) : sVar.f(targetWalletId, z, this.f156699l, this.f156700m, str, str2, str3, this.f156701n, this.o, list, oVar, bVar, z3);
    }
}
