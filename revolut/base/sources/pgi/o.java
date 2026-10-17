package pgi;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.IntentCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class o implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f235965a = r0.k(new Pair("Chrome", "com.android.chrome"), new Pair("Firefox", "org.mozilla.firefox"), new Pair("Samsung", "com.sec.android.app.sbrowser"), new Pair("Opera", "com.opera.browser"), new Pair("Opera Touch", "com.opera.browser"), new Pair("Unrecognized", null));

    public static String f(String str) {
        Uri uri2 = Uri.parse(str);
        Set<String> queryParameterNames = uri2.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
        Set<String> set = queryParameterNames;
        ArrayList arrayList = new ArrayList(w.t(set, 10));
        for (String str2 : set) {
            arrayList.add(new Pair(str2, uri2.getQueryParameter(str2)));
        }
        Map mapT = r0.t(arrayList);
        Uri.Builder builderQuery = uri2.buildUpon().clearQuery().query("embedded");
        for (Map.Entry entry : mapT.entrySet()) {
            builderQuery.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String string = builderQuery.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.Map] */
    @Override // pgi.l
    public final NaviCommand a(Uri returnUri, Uri uri2, String str) {
        Intrinsics.checkNotNullParameter(returnUri, "returnUri");
        if (uri2 == null) {
            return new IntentCommand(new Intent("android.intent.action.VIEW", returnUri), null);
        }
        String str2 = str != null ? (String) this.f235965a.get(str) : null;
        Intent intent = new Intent("android.intent.action.VIEW", uri2);
        if (str2 != null && str2.length() != 0) {
            intent = intent.setPackage(str2);
        }
        Intrinsics.h(intent);
        return new IntentCommand(intent, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    @Override // pgi.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final efm.r b(com.revolut.feature_web_view.presentation.WebViewContract$WebViewConfiguration r5) {
        /*
            r4 = this;
            java.lang.String r0 = "config"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            boolean r0 = r5.f98180l
            java.lang.String r5 = r5.f98174a
            r1 = 0
            if (r0 == 0) goto L22
            if (r5 == 0) goto L1d
            java.lang.String r0 = f(r5)     // Catch: java.lang.Exception -> L13
            goto L1e
        L13:
            r0 = move-exception
            zhm.h0 r2 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r3 = rd0.d.f253311a
            rd0.c r3 = rd0.c.ERROR
            rd0.d.a(r3, r1, r1, r0, r2)
        L1d:
            r0 = r1
        L1e:
            if (r0 != 0) goto L21
            goto L22
        L21:
            r5 = r0
        L22:
            pgi.m r0 = new pgi.m
            r0.<init>(r5)
            r5 = 0
            r2 = 3
            com.revolut.data.model.Data r5 = zi0.c.P(r0, r5, r1, r2)
            efm.r r5 = te0.w.h(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pgi.o.b(com.revolut.feature_web_view.presentation.WebViewContract$WebViewConfiguration):efm.r");
    }

    @Override // pgi.l
    public final void c(Parcelable parcelable) {
    }

    @Override // pgi.l
    public final efm.b d(Parcelable parcelable) {
        pfm.m mVar = pfm.m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }

    @Override // pgi.l
    public final void e(Parcelable parcelable, String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
    }
}
