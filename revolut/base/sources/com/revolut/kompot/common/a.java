package com.revolut.kompot.common;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a {
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    public static final Intent a(ExternalDestination externalDestination, Context context) {
        Intrinsics.checkNotNullParameter(externalDestination, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (externalDestination instanceof ExternalDestination.Browser) {
            String str = ((ExternalDestination.Browser) externalDestination).f98287a;
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            return intent;
        }
        if (externalDestination instanceof ExternalDestination.ByIntent) {
            return ((ExternalDestination.ByIntent) externalDestination).f98289a;
        }
        if (externalDestination instanceof ExternalDestination.ExplicitActivity) {
            ExternalDestination.ExplicitActivity explicitActivity = (ExternalDestination.ExplicitActivity) externalDestination;
            Intent intent2 = new Intent(context, (Class<?>) explicitActivity.f98291a);
            intent2.setFlags(explicitActivity.f98293c);
            String str2 = explicitActivity.d;
            if (str2 != null) {
                intent2.setType(str2);
            }
            b(intent2, explicitActivity.f98292b);
            return intent2;
        }
        if (!(externalDestination instanceof ExternalDestination.ImplicitActivity)) {
            throw new NoWhenBranchMatchedException();
        }
        ExternalDestination.ImplicitActivity implicitActivity = (ExternalDestination.ImplicitActivity) externalDestination;
        Intent intent3 = new Intent(implicitActivity.f98294a);
        intent3.setDataAndType(implicitActivity.e, implicitActivity.f98297g);
        intent3.setFlags(implicitActivity.f);
        ComponentName componentName = implicitActivity.f98298h;
        if (componentName != null) {
            intent3.setComponent(componentName);
        }
        String str3 = implicitActivity.f98296c;
        String str4 = implicitActivity.d;
        if (str3 != null && str4 != null) {
            intent3.setClassName(str3, str4);
        }
        b(intent3, implicitActivity.f98295b);
        return intent3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(android.content.Intent r5, java.util.Map r6) {
        /*
            r0 = 0
            if (r6 == 0) goto L41
            java.util.Set r6 = r6.entrySet()
            if (r6 == 0) goto L41
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = zhm.w.t(r6, r2)
            r1.<init>(r2)
            java.util.Iterator r6 = r6.iterator()
        L1a:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r6.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r3, r2)
            r1.add(r4)
            goto L1a
        L37:
            kotlin.Pair[] r6 = new kotlin.Pair[r0]
            java.lang.Object[] r6 = r1.toArray(r6)
            kotlin.Pair[] r6 = (kotlin.Pair[]) r6
            if (r6 != 0) goto L43
        L41:
            kotlin.Pair[] r6 = new kotlin.Pair[r0]
        L43:
            int r0 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
            kotlin.Pair[] r6 = (kotlin.Pair[]) r6
            android.os.Bundle r6 = androidx.core.os.BundleKt.bundleOf(r6)
            r5.putExtras(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.kompot.common.a.b(android.content.Intent, java.util.Map):void");
    }
}
