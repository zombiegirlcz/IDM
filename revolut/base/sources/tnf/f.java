package tnf;

import com.revolut.data.model.Data;
import efm.r;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import pcd.s;
import sgm.e3;
import snf.f0;
import snf.i0;
import snf.u;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e3 f272445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final onh.b f272446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q78.e f272447c;

    public f(e3 vaultNavigationProvider, onh.b creditCardNavigationProvider, yjf.a cryptoAssetDetailsNavigationProvider, yjf.b currentFiatPocketNavigationProvider, q78.e juniorAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(vaultNavigationProvider, "vaultNavigationProvider");
        Intrinsics.checkNotNullParameter(creditCardNavigationProvider, "creditCardNavigationProvider");
        Intrinsics.checkNotNullParameter(cryptoAssetDetailsNavigationProvider, "cryptoAssetDetailsNavigationProvider");
        Intrinsics.checkNotNullParameter(currentFiatPocketNavigationProvider, "currentFiatPocketNavigationProvider");
        Intrinsics.checkNotNullParameter(juniorAccountDestinationResolver, "juniorAccountDestinationResolver");
        this.f272445a = vaultNavigationProvider;
        this.f272446b = creditCardNavigationProvider;
        this.f272447c = juniorAccountDestinationResolver;
    }

    public static s a(io3.d dVar, i0 i0Var, String str) {
        Object next;
        Object next2;
        Object next3;
        s sVar;
        String str2 = dVar.f163145a;
        Iterator it8 = i0Var.f264586a.d.values().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((npg.b) next).f218207a.f234885h.getPocketId(), str2)) {
                break;
            }
        }
        npg.b bVar = (npg.b) next;
        if (bVar != null && (sVar = bVar.f218207a) != null) {
            return sVar;
        }
        Iterator it9 = i0Var.f264587b.iterator();
        while (true) {
            if (!it9.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it9.next();
            if (Intrinsics.f(((s) next2).f234885h.getPocketId(), str2)) {
                break;
            }
        }
        s sVar2 = (s) next2;
        if (sVar2 != null) {
            return sVar2;
        }
        if (str != null) {
            Iterator it10 = i0Var.f264586a.d.values().iterator();
            while (true) {
                if (!it10.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it10.next();
                if (Intrinsics.f(((npg.b) next3).f218207a.f234881a, str)) {
                    break;
                }
            }
            npg.b bVar2 = (npg.b) next3;
            if (bVar2 != null) {
                return bVar2.f218207a;
            }
        }
        return null;
    }

    public static r b(u uVar, f0 f0Var) {
        r rVarJust = r.just(new Data(null, new IllegalStateException("Cannot determine navigation for accountType=" + uVar.a() + " in wallet=" + f0Var.a()), false, 5, null));
        Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
        return rVarJust;
    }
}
