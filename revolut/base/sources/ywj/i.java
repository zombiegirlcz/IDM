package ywj;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class i implements yil.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f317477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f317478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c f317479c;

    public /* synthetic */ i(int i, com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c cVar, Ref$ObjectRef ref$ObjectRef) {
        this.f317477a = i;
        this.f317478b = ref$ObjectRef;
        this.f317479c = cVar;
    }

    @Override // yil.a
    public final String generate() {
        switch (this.f317477a) {
            case 0:
                com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c cVar = this.f317479c;
                String strB = cVar.f101712r.b();
                this.f317478b.f186409a = strB;
                xjl.i iVar = cVar.f101712r;
                if (strB != null) {
                    return iVar.a(strB);
                }
                Intrinsics.r("codeVerifier");
                throw null;
            case 1:
                com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c cVar2 = this.f317479c;
                String strB2 = cVar2.f101712r.b();
                this.f317478b.f186409a = strB2;
                xjl.i iVar2 = cVar2.f101712r;
                if (strB2 != null) {
                    return iVar2.a(strB2);
                }
                Intrinsics.r("codeVerifier");
                throw null;
            case 2:
                com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c cVar3 = this.f317479c;
                String strB3 = cVar3.f101712r.b();
                this.f317478b.f186409a = strB3;
                xjl.i iVar3 = cVar3.f101712r;
                if (strB3 != null) {
                    return iVar3.a(strB3);
                }
                Intrinsics.r("codeVerifier");
                throw null;
            default:
                com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c cVar4 = this.f317479c;
                String strB4 = cVar4.f101712r.b();
                this.f317478b.f186409a = strB4;
                xjl.i iVar4 = cVar4.f101712r;
                if (strB4 != null) {
                    return iVar4.a(strB4);
                }
                Intrinsics.r("codeVerifier");
                throw null;
        }
    }
}
