package com.revolut.feature.retail.reverywhere.impl.web_app;

import cli.j;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.reverywhere.impl.web_app.c;
import jfb.g0;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cjl.c f82929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f82930c;
    public final Data d;
    public final int e;
    public final c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f82931g;

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, 0 == true ? 1 : 0, CertificateBody.profileType);
    }

    public static b a(b bVar, cjl.c cVar, g0 g0Var, Data data, int i, c cVar2, int i2) {
        String webAppUrl = bVar.f82928a;
        if ((i2 & 2) != 0) {
            cVar = bVar.f82929b;
        }
        cjl.c cVar3 = cVar;
        if ((i2 & 4) != 0) {
            g0Var = bVar.f82930c;
        }
        g0 g0Var2 = g0Var;
        if ((i2 & 8) != 0) {
            data = bVar.d;
        }
        Data reverywhereToken = data;
        if ((i2 & 16) != 0) {
            i = bVar.e;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            cVar2 = bVar.f;
        }
        c webViewPageState = cVar2;
        boolean z = (i2 & 64) != 0 ? bVar.f82931g : false;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(webAppUrl, "webAppUrl");
        Intrinsics.checkNotNullParameter(reverywhereToken, "reverywhereToken");
        Intrinsics.checkNotNullParameter(webViewPageState, "webViewPageState");
        return new b(webAppUrl, cVar3, g0Var2, reverywhereToken, i3, webViewPageState, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f82928a, bVar.f82928a) && Intrinsics.f(this.f82929b, bVar.f82929b) && this.f82930c == bVar.f82930c && Intrinsics.f(this.d, bVar.d) && this.e == bVar.e && Intrinsics.f(this.f, bVar.f) && this.f82931g == bVar.f82931g;
    }

    public final int hashCode() {
        int iHashCode = this.f82928a.hashCode() * 31;
        cjl.c cVar = this.f82929b;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        g0 g0Var = this.f82930c;
        return Boolean.hashCode(this.f82931g) + ((this.f.hashCode() + j6.a.b(this.e, kii.e.c(this.d, (iHashCode2 + (g0Var != null ? g0Var.hashCode() : 0)) * 31, 31), 31)) * 31);
    }

    public b(String webAppUrl, cjl.c cVar, g0 g0Var, Data reverywhereToken, int i, c webViewPageState, boolean z) {
        Intrinsics.checkNotNullParameter(webAppUrl, "webAppUrl");
        Intrinsics.checkNotNullParameter(reverywhereToken, "reverywhereToken");
        Intrinsics.checkNotNullParameter(webViewPageState, "webViewPageState");
        this.f82928a = webAppUrl;
        this.f82929b = cVar;
        this.f82930c = g0Var;
        this.d = reverywhereToken;
        this.e = i;
        this.f = webViewPageState;
        this.f82931g = z;
    }

    public /* synthetic */ b(String str, c cVar, int i) {
        this((i & 1) != 0 ? "" : str, null, null, new Data(null, null, true, 3, null), 0, (i & 32) != 0 ? c.b.f82933a : cVar, true);
    }
}
