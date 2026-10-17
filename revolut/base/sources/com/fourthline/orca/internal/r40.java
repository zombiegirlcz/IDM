package com.fourthline.orca.internal;

import androidx.content.NavBackStackEntry;
import androidx.content.NavController;
import androidx.content.NavDestination;
import androidx.content.NavHostController;
import androidx.content.NavOptionsBuilder;
import androidx.content.PopUpToBuilder;
import com.fourthline.orca.internal.q80;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class r40 implements z80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NavHostController f32628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32629b;

    public r40(NavHostController navHostController) {
        Intrinsics.checkNotNullParameter(navHostController, "navHostController");
        this.f32628a = navHostController;
        this.f32629b = "r40";
    }

    @Override // com.fourthline.orca.internal.z80
    public void a(NavController.OnDestinationChangedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f32628a.addOnDestinationChangedListener(listener);
    }

    @Override // com.fourthline.orca.internal.z80
    public NavDestination a() {
        return this.f32628a.getCurrentDestination();
    }

    @Override // com.fourthline.orca.internal.z80
    public boolean b() {
        return this.f32628a.popBackStack();
    }

    @Override // com.fourthline.orca.internal.z80
    public boolean a(q80 destination, boolean z) {
        Integer numValueOf;
        Object objPrevious;
        NavDestination destination2;
        Intrinsics.checkNotNullParameter(destination, "destination");
        NavHostController navHostController = this.f32628a;
        String strC = destination.c();
        Iterator it8 = zhm.b0.L((List) navHostController.getCurrentBackStack().getValue()).iterator();
        while (true) {
            ListIterator listIterator = ((zhm.w0) it8).f322483a;
            numValueOf = null;
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (Intrinsics.f(((NavBackStackEntry) objPrevious).getDestination().getRoute(), strC)) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) objPrevious;
        if (navBackStackEntry != null && (destination2 = navBackStackEntry.getDestination()) != null) {
            numValueOf = Integer.valueOf(destination2.getId());
        }
        if (numValueOf != null) {
            destination.toString();
            return navHostController.popBackStack(numValueOf.intValue(), z);
        }
        b(destination);
        return false;
    }

    private final void b(q80 q80Var) {
        NavDestination navDestinationA = a();
        String strA = navDestinationA != null ? r80.a(navDestinationA) : null;
        if (strA != null) {
            int iHashCode = strA.hashCode();
            if (iHashCode != -2103697634) {
                if (iHashCode != -1930722121) {
                    if (iHashCode == -1535808662) {
                        if (strA.equals("nfc_scanner") && Intrinsics.f(q80Var.b(), "document_details")) {
                            a((q80) q80.i.b.f32262b, false);
                            return;
                        }
                        return;
                    }
                    if (iHashCode != 1186133026 || !strA.equals("document_capture")) {
                        return;
                    }
                } else if (!strA.equals("document_processing")) {
                    return;
                }
            } else if (!strA.equals("document_details")) {
                return;
            }
            String strB = q80Var.b();
            int iHashCode2 = strB.hashCode();
            if (iHashCode2 != 985156020) {
                if (iHashCode2 != 1585573854) {
                    if (iHashCode2 != 1591379058 || !strB.equals("document_country")) {
                        return;
                    }
                } else if (!strB.equals("document_type")) {
                    return;
                }
            } else if (!strB.equals("document_version")) {
                return;
            }
            b();
            q80.i.a aVar = new q80.i.a(null, 1, null);
            cb cbVar = q80Var instanceof cb ? (cb) q80Var : null;
            a(aVar, cbVar != null ? cbVar.getConfig() : null);
        }
    }

    @Override // com.fourthline.orca.internal.z80
    public void a(q80 destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        cb cbVar = destination instanceof cb ? (cb) destination : null;
        a(destination, cbVar != null ? cbVar.getConfig() : null);
    }

    @Override // com.fourthline.orca.internal.z80
    public void a(q80 destination, p80 p80Var) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        NavHostController navHostController = this.f32628a;
        destination.c();
        navHostController.navigate(destination.c(), new mp1(p80Var, 24));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(p80 p80Var, NavOptionsBuilder navigate) {
        Intrinsics.checkNotNullParameter(navigate, "$this$navigate");
        if (p80Var != null) {
            navigate.setLaunchSingleTop(p80Var.d());
            navigate.setRestoreState(p80Var.c());
            sp0 sp0VarB = p80Var.b();
            if (sp0VarB != null) {
                navigate.popUpTo(sp0VarB.a().c(), new mp1(sp0VarB, 23));
            }
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(sp0 sp0Var, PopUpToBuilder popUpTo) {
        Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
        popUpTo.setInclusive(sp0Var.b());
        popUpTo.setSaveState(sp0Var.c());
        return Unit.f186387a;
    }
}
