package zej;

import dfj.a1;
import dfj.o0;
import dfj.p0;
import dfj.q0;
import dfj.r0;
import dfj.s0;
import dfj.t0;
import dfj.u0;
import dfj.v0;
import dfj.w0;
import dfj.y0;
import efm.d0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.z1;
import wp5.y;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements zdj.a {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f321682b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f321683a;

    static {
        String[] elements = {"activate-plan", "install", "start-porting-in", "confirm-transfer", "plan-change", "plan-upgrade", "submit-portability-form", "cancel-portability-form", "portability-form"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f321682b = kotlin.collections.d.y0(elements);
    }

    public e(y0 internalDeepLinkActionHandler) {
        Intrinsics.checkNotNullParameter(internalDeepLinkActionHandler, "internalDeepLinkActionHandler");
        this.f321683a = internalDeepLinkActionHandler;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        if (y.D(cVar, "deeplink", 1, "esim")) {
            return f321682b.contains(cVar.e(2));
        }
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.ArrayList] */
    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Object r0Var;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        ?? arrayList;
        Object next;
        String str8;
        String str9;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String strE = deeplink.e(2);
        HashMap map = deeplink.d;
        Object action = null;
        switch (strE.hashCode()) {
            case -1646762756:
                if (strE.equals("start-porting-in") && (str = (String) map.get("subscriptionId")) != null && (str2 = (String) map.get("mobilePlanId")) != null) {
                    r0Var = new r0(str, str2);
                    action = r0Var;
                }
                break;
            case -1472409736:
                if (strE.equals("plan-upgrade") && (str3 = (String) map.get("mobilePlanId")) != null) {
                    r0Var = new u0(str3, (String) map.get("subscriptionId"));
                    action = r0Var;
                }
                break;
            case -16203052:
                if (strE.equals("plan-change") && (str4 = (String) map.get("mobilePlanId")) != null) {
                    r0Var = new t0(str4, (String) map.get("subscriptionId"));
                    action = r0Var;
                }
                break;
            case 476507224:
                if (strE.equals("confirm-transfer") && (str5 = (String) map.get("subscriptionId")) != null && (str6 = (String) map.get("portingId")) != null && (str7 = (String) map.get("mobilePlanId")) != null) {
                    r0Var = new q0(str5, str6, str7);
                    action = r0Var;
                }
                break;
            case 947452829:
                if (strE.equals("submit-portability-form")) {
                    action = w0.f114140a;
                }
                break;
            case 1116560763:
                if (strE.equals("cancel-portability-form")) {
                    action = p0.f114063a;
                }
                break;
            case 1539572360:
                if (strE.equals("portability-form")) {
                    String strE2 = deeplink.e(3);
                    if (kotlin.text.d0.W(strE2)) {
                        strE2 = null;
                    }
                    if (strE2 != null) {
                        String str10 = (String) map.get("requiredParams");
                        if (str10 == null || kotlin.text.d0.W(str10)) {
                            arrayList = f0.f322471a;
                        } else {
                            List listN0 = kotlin.text.d0.n0(str10, new String[]{","}, 0, 6);
                            arrayList = new ArrayList();
                            Iterator it8 = listN0.iterator();
                            while (it8.hasNext()) {
                                String string = kotlin.text.d0.F0((String) it8.next()).toString();
                                Iterator it9 = f.a().iterator();
                                while (true) {
                                    if (it9.hasNext()) {
                                        next = it9.next();
                                        if (Intrinsics.f(((f) next).name(), string)) {
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                f fVar = (f) next;
                                if (fVar == null) {
                                    IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Unknown portability form required param: ", string));
                                    h0 h0Var = h0.f322473a;
                                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                    rd0.d.a(rd0.c.ERROR, "EsimInternalDeeplinkActionPerformerImpl", null, illegalStateException, h0Var);
                                    fVar = null;
                                }
                                if (fVar != null) {
                                    arrayList.add(fVar);
                                }
                            }
                        }
                        action = new v0(strE2, arrayList);
                    }
                }
                break;
            case 1582364611:
                if (strE.equals("activate-plan") && (str8 = (String) map.get("subscriptionId")) != null) {
                    r0Var = new o0(str8);
                    action = r0Var;
                }
                break;
            case 1957569947:
                if (strE.equals("install") && (str9 = (String) map.get("profileId")) != null) {
                    r0Var = new s0(str9);
                    action = r0Var;
                }
                break;
        }
        if (action == null) {
            ufm.b bVarM = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        a1 a1Var = (a1) this.f321683a;
        a1Var.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        z1 z1Var = a1Var.f113903a;
        if (((Number) ((wkm.y) z1Var.l()).getValue()).intValue() > 0) {
            z1Var.k(action);
        }
        ufm.b bVarM2 = d0.m(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
        return bVarM2;
    }
}
