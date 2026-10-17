package oq3;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import ft3.a1;
import ft3.d1;
import ft3.g1;
import grl.r2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.p0;
import te0.w;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements kq3.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f227703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rz3.c f227704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mw3.a f227705c;
    public final mw3.d d;
    public final vie.h e;

    public c(sri.m navigator, rz3.c creditApplicationRouter, mw3.a akahuAppLinkInteractor, mw3.d akahuPendingDeeplinkInteractor, vie.h tabCreditAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(creditApplicationRouter, "creditApplicationRouter");
        Intrinsics.checkNotNullParameter(akahuAppLinkInteractor, "akahuAppLinkInteractor");
        Intrinsics.checkNotNullParameter(akahuPendingDeeplinkInteractor, "akahuPendingDeeplinkInteractor");
        Intrinsics.checkNotNullParameter(tabCreditAvailabilityInteractor, "tabCreditAvailabilityInteractor");
        this.f227703a = navigator;
        this.f227704b = creditApplicationRouter;
        this.f227705c = akahuAppLinkInteractor;
        this.d = akahuPendingDeeplinkInteractor;
        this.e = tabCreditAvailabilityInteractor;
    }

    public static FeatureCommand b(it3.d dVar) {
        Object obj2 = g1.f137832a;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return new FeatureCommand(new CreditApplicationFeatureConfig.StartApplication(new a1(r2.DEEPLINK, null, null, null, null, 30), g1.c(new d1(dVar.f168328j, dVar.k, null), dVar.f168332p, dVar.f168334r), wp3.a.OPEN_EXISTING_APPLICATION, null, null, null, null, null, null, null, 2040));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        pq3.b.Companion.getClass();
        return pq3.a.a(deeplink) != null;
    }

    public final q06.i c() {
        return new q06.i(new q06.b(this.e.a() ? ibb.c.f : ibb.c.f160140a, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, s24.a] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, java.lang.String] */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r10, kotlin.coroutines.Continuation r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oq3.c.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        pq3.b.Companion.getClass();
        pq3.b bVarA = pq3.a.a(deeplink);
        if (bVarA == null) {
            ufm.b bVarM = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        String applicationId = bVarA.f238676b.group(2);
        if (applicationId == null) {
            throw new IllegalStateException("Group 1 does not exist");
        }
        String str = (String) bVarA.f238675a.d.get("action");
        if (str != null) {
            return (str.equals("submitted") || str.equals("cancelled")) ? w.o0(p0.f264003c, new ack.o(bVarA, this, z, (Continuation) null, 19)) : d0.m(Boolean.FALSE);
        }
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        mw3.d dVar = this.d;
        mw3.e eVar = dVar.f209321a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        boolean z3 = false;
        if (Intrinsics.f(eVar.f209323a, applicationId)) {
            Context context = dVar.f209322b;
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage != null) {
                try {
                    context.startActivity(launchIntentForPackage);
                    Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                    eVar.f209324b.k(new mw3.f(applicationId));
                    z3 = true;
                } catch (ActivityNotFoundException unused) {
                }
            }
        }
        ufm.b bVarM2 = d0.m(Boolean.valueOf(z3));
        Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
        return bVarM2;
    }
}
