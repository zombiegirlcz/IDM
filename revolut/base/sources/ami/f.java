package ami;

import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f6445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o7.d f6446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uli.b f6447c;
    public final udj.m d;
    public final sri.m e;
    public volatile wli.o f;

    public f(l kompotDeeplinkGatewayResolver, o7.d deeplinkRouteResolverProvider, uli.b legacyDeeplinkActionPerformer, x2l.a appDeeplinkSchemeProvider, udj.m deeplinkMainScreenBlackListHandler, uli.e deeplinkMainScreenCommandProvider, vdj.c externalDeeplinkDestinationCommandProvider, wri.b singleActivityStateChecker, sri.m navigator) {
        Intrinsics.checkNotNullParameter(kompotDeeplinkGatewayResolver, "kompotDeeplinkGatewayResolver");
        Intrinsics.checkNotNullParameter(deeplinkRouteResolverProvider, "deeplinkRouteResolverProvider");
        Intrinsics.checkNotNullParameter(legacyDeeplinkActionPerformer, "legacyDeeplinkActionPerformer");
        Intrinsics.checkNotNullParameter(appDeeplinkSchemeProvider, "appDeeplinkSchemeProvider");
        Intrinsics.checkNotNullParameter(deeplinkMainScreenBlackListHandler, "deeplinkMainScreenBlackListHandler");
        Intrinsics.checkNotNullParameter(deeplinkMainScreenCommandProvider, "deeplinkMainScreenCommandProvider");
        Intrinsics.checkNotNullParameter(externalDeeplinkDestinationCommandProvider, "externalDeeplinkDestinationCommandProvider");
        Intrinsics.checkNotNullParameter(singleActivityStateChecker, "singleActivityStateChecker");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f6445a = kompotDeeplinkGatewayResolver;
        this.f6446b = deeplinkRouteResolverProvider;
        this.f6447c = legacyDeeplinkActionPerformer;
        this.d = deeplinkMainScreenBlackListHandler;
        this.e = navigator;
    }

    public static LinkedHashSet b(NaviCommand naviCommand) {
        List listB = com.revolut.retail.core.navigation.a.b(naviCommand);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listB) {
            if (obj2 instanceof FeatureCommand) {
                arrayList.add(obj2);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            linkedHashSet.add(((FeatureCommand) it8.next()).f98638a.getClass());
        }
        return linkedHashSet;
    }

    public final boolean a(zli.b deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        od0.a aVar = od0.a.f224253a;
        if (!od0.a.f() || zli.f.a(deeplink.d, "dev_skip_main_screen") == null) {
            List list = deeplink.f323280c;
            String str = deeplink.f323278a;
            if (list.size() != 3 || !Intrinsics.f(list.get(0), "donations") || d0.W((CharSequence) list.get(1)) || !Intrinsics.f(list.get(2), "donate")) {
                if (!d0.J(str, "form", false)) {
                    List list2 = this.d.f279243a;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            if (d0.J(str, (String) it8.next(), false)) {
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(zli.b r20, wli.q r21, com.revolut.kompot.common.ParcelableDestination r22, q06.c r23, gim.c r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ami.f.c(zli.b, wli.q, com.revolut.kompot.common.ParcelableDestination, q06.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(zli.b r11, wli.q r12, com.revolut.retail.core.navigation.NaviCommand r13, boolean r14, java.lang.Class r15, q06.c r16) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ami.f.d(zli.b, wli.q, com.revolut.retail.core.navigation.NaviCommand, boolean, java.lang.Class, q06.c):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(zli.b r26, wli.q r27, lg0.a r28, gim.c r29) {
        /*
            Method dump skipped, instruction units count: 729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ami.f.e(zli.b, wli.q, lg0.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(zli.b r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ami.e
            if (r0 == 0) goto L13
            r0 = r8
            ami.e r0 = (ami.e) r0
            int r1 = r0.f6444y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6444y = r1
            goto L18
        L13:
            ami.e r0 = new ami.e
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f6442w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f6444y
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            q06.k r7 = r0.v
            zli.b r0 = r0.u
            yhm.o.b(r8)     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L2e
            goto L58
        L2c:
            r8 = move-exception
            goto L66
        L2e:
            r7 = move-exception
            goto Lb0
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            yhm.o.b(r8)
            jf0.c r8 = n14.k.M(r7)
            o7.d r2 = r6.f6446b
            q06.k r2 = r2.n(r8)
            if (r2 != 0) goto L49
            goto L62
        L49:
            r0.u = r7     // Catch: java.util.concurrent.CancellationException -> L2e java.lang.Exception -> L63
            r0.v = r2     // Catch: java.util.concurrent.CancellationException -> L2e java.lang.Exception -> L63
            r0.f6444y = r3     // Catch: java.util.concurrent.CancellationException -> L2e java.lang.Exception -> L63
            java.lang.Object r8 = r2.e(r8, r0)     // Catch: java.util.concurrent.CancellationException -> L2e java.lang.Exception -> L63
            if (r8 != r1) goto L56
            return r1
        L56:
            r0 = r7
            r7 = r2
        L58:
            q06.j r8 = (q06.j) r8     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L2e
            if (r8 == 0) goto L62
            ami.o r0 = new ami.o
            r0.<init>(r8, r7)
            return r0
        L62:
            return r4
        L63:
            r8 = move-exception
            r0 = r7
            r7 = r2
        L66:
            ami.g r1 = new ami.g
            java.lang.String r2 = "resolver"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            java.lang.String r2 = "cause"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            java.lang.String r2 = r8.getMessage()
            r1.<init>(r2, r8)
            java.lang.StackTraceElement r8 = new java.lang.StackTraceElement
            java.lang.Class r2 = r7.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "resolve"
            r5 = -1
            r8.<init>(r2, r3, r4, r5)
            java.lang.StackTraceElement[] r8 = new java.lang.StackTraceElement[]{r8}
            r1.setStackTrace(r8)
            zhm.h0 r8 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r2 = rd0.c.ERROR
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getName()
            java.lang.String r0 = r0.a()
            java.lang.String r3 = "Resolver "
            java.lang.String r5 = " failed for "
            java.lang.String r7 = a0.d.s(r3, r7, r5, r0)
            java.lang.String r0 = "DeeplinkDestinationHandler"
            rd0.d.a(r2, r0, r7, r1, r8)
            return r4
        Lb0:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ami.f.f(zli.b, gim.c):java.lang.Object");
    }
}
