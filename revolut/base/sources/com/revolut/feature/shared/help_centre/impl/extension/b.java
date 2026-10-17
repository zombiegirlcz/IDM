package com.revolut.feature.shared.help_centre.impl.extension;

import akg.n;
import ard.c0;
import b8d.l0;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.shared.help_centre.impl.extension.HelpWidgetParcel;
import com.revolut.kompot.common.InternalDestination;
import go.g;
import i7d.e;
import i7d.f;
import i7d.j;
import i7d.k;
import i7d.l;
import i7d.m;
import i7d.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k18.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import sx2.h;
import t7d.d;
import wf0.k0;
import wli.x;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends o {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f86159l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x f86160m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l0 f86161n;
    public final m o;

    public b(c faqProvider, x deeplinkHandler, l0 deeplinkModifier, m navigationStrategy) {
        Intrinsics.checkNotNullParameter(faqProvider, "faqProvider");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(deeplinkModifier, "deeplinkModifier");
        Intrinsics.checkNotNullParameter(navigationStrategy, "navigationStrategy");
        this.f86159l = faqProvider;
        this.f86160m = deeplinkHandler;
        this.f86161n = deeplinkModifier;
        this.o = navigationStrategy;
    }

    public static List c3(String str, TextLocalisedClause textLocalisedClause, HelpWidgetParcel helpWidgetParcel) {
        List listC = u.c(new InputDisclosureDelegate.Model(str, textLocalisedClause, null, helpWidgetParcel, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return listC;
    }

    @Override // i7d.o
    public final Flow Z2(l input) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (input instanceof k) {
            k kVar = (k) input;
            return e3(kVar.f159276c, new h(this, kVar, 28));
        }
        if (!(input instanceof j)) {
            throw new NoWhenBranchMatchedException();
        }
        j jVar = (j) input;
        int iHashCode = jVar.hashCode();
        TextLocalisedClause textLocalisedClause = jVar.f159272b;
        String strValueOf = String.valueOf(iHashCode);
        e eVar = jVar.f159273c;
        if (eVar instanceof i7d.b) {
            return e3(((i7d.b) eVar).f159265b, new sc7.b(this, strValueOf, jVar, eVar, 3));
        }
        if (eVar.equals(i7d.d.f159267a)) {
            return new g(c3(strValueOf, textLocalisedClause, HelpWidgetParcel.Support.f86157a), 2);
        }
        if (eVar instanceof i7d.c) {
            return new g(c3(strValueOf, textLocalisedClause, new HelpWidgetParcel.FaqExplicit(((i7d.c) eVar).f159266a)), 2);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // i7d.o
    public final void b3(Object obj2) {
        V2(new a(obj2, this, null), new yi5.b(29));
    }

    public final void d3(InternalDestination internalDestination) {
        A2(this.o.a(internalDestination));
    }

    public final c0 e3(List list, Function1 function1) {
        n nVarV;
        String str;
        ArrayList keys = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            i7d.h hVar = (i7d.h) it8.next();
            if (hVar instanceof f) {
                str = null;
            } else {
                if (!(hVar instanceof i7d.g)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = ((i7d.g) hVar).f159270a;
            }
            if (str != null) {
                keys.add(str);
            }
        }
        c cVar = this.f86159l;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(keys, "keys");
        int i = m7d.a.f203388a[k0.Pigeon.ordinal()];
        boolean z = true;
        if (i == 1) {
            nVarV = nim.a.v(cVar.C(false, true), new lul.d(keys, cVar, 25));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            hg0.m mVar = (hg0.m) ((hg0.d) cVar.f180140b);
            Intrinsics.checkNotNullParameter(keys, "keys");
            nVarV = nim.a.v(((eg0.h) mVar.f152059a).d(false), new hg0.e(keys, mVar, z));
        }
        return new c0(nVarV, this, list, function1, 21);
    }

    public final Object f3(String str, a aVar) {
        String str2 = str == null ? "" : str;
        x xVar = this.f86160m;
        Object objM = gc0.c.m(xVar, this.f86161n.a(str, xVar.y1(str2)), "HelpWidgetControllerModelExtension", aVar);
        return objM == fim.a.COROUTINE_SUSPENDED ? objM : Unit.f186387a;
    }
}
