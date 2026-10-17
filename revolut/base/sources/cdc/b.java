package cdc;

import android.content.Intent;
import android.net.Uri;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.jvm.internal.Intrinsics;
import u6c.k;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f23227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f23228b;

    public b(d returnUrlFactory, a browserPackageResolver) {
        Intrinsics.checkNotNullParameter(returnUrlFactory, "returnUrlFactory");
        Intrinsics.checkNotNullParameter(browserPackageResolver, "browserPackageResolver");
        this.f23227a = returnUrlFactory;
        this.f23228b = browserPackageResolver;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    public final ExternalDestination.ByIntent a(Uri uri2, String browserName) {
        String str;
        if (browserName != null) {
            Intrinsics.checkNotNullParameter(browserName, "browserName");
            str = (String) this.f23228b.f23226a.get(browserName);
        } else {
            str = null;
        }
        Intent intent = new Intent("android.intent.action.VIEW", uri2);
        intent.addFlags(268435456);
        if (str != null && str.length() != 0) {
            intent.setPackage(str);
        }
        return new ExternalDestination.ByIntent(intent, null);
    }

    public final ExternalDestination.ByIntent b(String str, String str2, String str3, boolean z) {
        Object objA;
        try {
            m.Companion companion = m.INSTANCE;
            d dVar = this.f23227a;
            objA = z ? dVar.b(str, str2) : dVar.c(str, str2);
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (objA instanceof n) {
            objA = null;
        }
        Uri uri2 = (Uri) objA;
        if (uri2 != null) {
            return a(uri2, str3);
        }
        return null;
    }

    public final ExternalDestination.ByIntent c(String str, String str2, String str3, boolean z, k kVar) {
        Object objA;
        try {
            m.Companion companion = m.INSTANCE;
            d dVar = this.f23227a;
            objA = z ? dVar.d(str, kVar, str2) : dVar.e(str, kVar, str2);
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (objA instanceof n) {
            objA = null;
        }
        Uri uri2 = (Uri) objA;
        if (uri2 != null) {
            return a(uri2, str3);
        }
        return null;
    }

    public final ExternalDestination.ByIntent d(String str, String str2, String str3, boolean z) {
        Object objA;
        try {
            m.Companion companion = m.INSTANCE;
            d dVar = this.f23227a;
            objA = z ? dVar.f(str, str2) : dVar.g(str, str2);
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (objA instanceof n) {
            objA = null;
        }
        Uri uri2 = (Uri) objA;
        if (uri2 != null) {
            return a(uri2, str3);
        }
        return null;
    }
}
