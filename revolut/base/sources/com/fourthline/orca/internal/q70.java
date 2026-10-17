package com.fourthline.orca.internal;

import android.os.Bundle;
import androidx.content.NavController;
import androidx.content.NavDestination;
import com.fourthline.orca.internal.cf1;
import com.fourthline.orca.internal.d80;
import com.fourthline.orca.internal.dj0;
import com.fourthline.orca.internal.q80;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;

/* JADX INFO: loaded from: classes23.dex */
public final class q70 implements yc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r70 f32221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fh0 f32222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z80 f32223c;
    private final r71 d;
    private final k80 e;
    private final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private py f32224g;

    public q70(r70 mainRepository, fh0 orcaDestroyer, z80 navigator, r71 systemBarsController, k80 navigationAnalytics) {
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        Intrinsics.checkNotNullParameter(orcaDestroyer, "orcaDestroyer");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(systemBarsController, "systemBarsController");
        Intrinsics.checkNotNullParameter(navigationAnalytics, "navigationAnalytics");
        this.f32221a = mainRepository;
        this.f32222b = orcaDestroyer;
        this.f32223c = navigator;
        this.d = systemBarsController;
        this.e = navigationAnalytics;
        this.f = "q70";
        navigator.a(new NavController.OnDestinationChangedListener() { // from class: com.fourthline.orca.internal.lr1
            @Override // androidx.navigation.NavController.OnDestinationChangedListener
            public final void onDestinationChanged(NavController navController, NavDestination navDestination, Bundle bundle) {
                q70.a(this.f30735a, navController, navDestination, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(q70 q70Var, NavController controller, NavDestination destination, Bundle bundle) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(destination, "destination");
        q70Var.e.d(r80.a(destination));
    }

    private final void c() {
        a((kh0) cf1.a.d);
    }

    private final NavDestination d() {
        return this.f32223c.a();
    }

    private final oy e() {
        py pyVar = this.f32224g;
        if (pyVar != null) {
            return pyVar.a();
        }
        Intrinsics.r("flowIterator");
        throw null;
    }

    public final void a(lg0 flowManager) {
        Intrinsics.checkNotNullParameter(flowManager, "flowManager");
        kg0 kg0Var = new kg0(flowManager);
        a(kg0Var, this.f32221a.e());
        this.f32224g = kg0Var;
    }

    @Override // com.fourthline.orca.internal.yc
    public q80 a(ee1 navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        return new q80.o(null, 1, null);
    }

    public final void a(q80 destination) {
        Object obj2;
        sp0 sp0VarB;
        sp0 sp0VarB2;
        Intrinsics.checkNotNullParameter(destination, "destination");
        Objects.toString(destination);
        a(destination, this);
        if (destination instanceof q80.b) {
            NavDestination navDestinationD = d();
            if (navDestinationD != null) {
                this.e.a(r80.a(navDestinationD));
            }
            p80 config = ((q80.b) destination).getConfig();
            if (config != null && (sp0VarB2 = config.b()) != null) {
                this.f32223c.a(sp0VarB2.a(), sp0VarB2.b());
                return;
            } else {
                this.f32223c.b();
                return;
            }
        }
        if (destination instanceof q80.d) {
            NavDestination navDestinationD2 = d();
            if (navDestinationD2 != null) {
                this.e.a(r80.a(navDestinationD2));
            }
            oy oyVarE = e();
            if (oyVarE != null && this.e.a(oyVarE.a(), oyVarE)) {
                this.e.a(oyVarE.a(), d80.a.f27668a);
            }
            py pyVar = this.f32224g;
            if (pyVar == null) {
                Intrinsics.r("flowIterator");
                throw null;
            }
            q80.d dVar = (q80.d) destination;
            oy oyVarA = pyVar.a(dVar.getConfig());
            if (oyVarA != null) {
                if (this.e.a(oyVarA.a())) {
                    this.e.a(oyVarA.a(), (ny) null);
                }
                p80 config2 = dVar.getConfig();
                if (config2 != null && (sp0VarB = config2.b()) != null) {
                    this.f32223c.a(sp0VarB.a(), sp0VarB.b());
                    return;
                } else {
                    this.f32223c.b();
                    return;
                }
            }
            c();
            Unit unit = Unit.f186387a;
            return;
        }
        if (destination instanceof q80.k) {
            NavDestination navDestinationD3 = d();
            if (navDestinationD3 != null) {
                this.e.b(r80.a(navDestinationD3));
            }
            oy oyVarE2 = e();
            if (oyVarE2 != null && this.e.a(oyVarE2.a(), oyVarE2, ((q80.k) destination).d())) {
                this.e.b(oyVarE2.a());
            }
            q80.k kVar = (q80.k) destination;
            ny nyVarD = kVar.d();
            if (nyVarD != null) {
                py pyVar2 = this.f32224g;
                if (pyVar2 == null) {
                    Intrinsics.r("flowIterator");
                    throw null;
                }
                oy oyVarA2 = a(pyVar2, nyVarD);
                if (oyVarA2 != null) {
                    q80 q80VarB = oyVarA2.b();
                    a(q80VarB, this);
                    this.f32223c.a(q80VarB, kVar.getConfig());
                    obj2 = oyVarA2;
                } else {
                    a((dj0) dj0.c.f27797a);
                    obj2 = Unit.f186387a;
                }
                if (obj2 != null) {
                    return;
                }
            }
            a((dj0) dj0.c.f27797a);
            Unit unit2 = Unit.f186387a;
            return;
        }
        if (destination instanceof q80.m) {
            NavDestination navDestinationD4 = d();
            if (navDestinationD4 != null) {
                this.e.b(r80.a(navDestinationD4));
            }
            oy oyVarE3 = e();
            if (oyVarE3 != null && this.e.a(oyVarE3.a(), oyVarE3, null)) {
                this.e.b(oyVarE3.a());
            }
            a(((q80.m) destination).d());
            Unit unit3 = Unit.f186387a;
            return;
        }
        if (destination instanceof q80.l) {
            NavDestination navDestinationD5 = d();
            if (navDestinationD5 != null) {
                this.e.c(r80.a(navDestinationD5));
            }
            oy oyVarE4 = e();
            if (oyVarE4 != null) {
                this.e.a(oyVarE4.a(), ((q80.l) destination).d());
            }
            a(((q80.l) destination).d());
            Unit unit4 = Unit.f186387a;
            return;
        }
        if (destination instanceof q80.o) {
            Unit unit5 = Unit.f186387a;
            return;
        }
        NavDestination navDestinationD6 = d();
        if (navDestinationD6 != null && this.e.a(r80.a(navDestinationD6), destination.b())) {
            this.e.b(r80.a(navDestinationD6));
        }
        this.f32223c.a(destination);
        Unit unit6 = Unit.f186387a;
    }

    private static final void a(q80 q80Var, q70 q70Var) {
        p80 config;
        if ((q80Var instanceof cb) && (config = ((cb) q80Var).getConfig()) != null && config.a()) {
            q70Var.d.b();
        } else {
            q70Var.d.a();
        }
    }

    private final void a(dj0 dj0Var) {
        m.Companion companion = yhm.m.INSTANCE;
        a((Object) dj0Var);
    }

    private final void a(kh0 kh0Var) {
        m.Companion companion = yhm.m.INSTANCE;
        a(yhm.o.a(kh0Var));
    }

    private final void a(Object obj2) {
        this.f32222b.a(obj2);
    }

    private final oy a(py pyVar, ny nyVar) {
        pyVar.a();
        oy oyVarA = pyVar.a(nyVar);
        if (oyVarA != null && this.e.a(oyVarA.a())) {
            this.e.a(oyVarA.a(), nyVar);
        }
        return oyVarA;
    }
}
