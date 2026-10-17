package vga;

import dwi.r;
import ffk.t;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import svi.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f288808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f288809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f288810c;

    public d(t pricingPlanInteractor, l80.e dateProvider, r airportLoungePassesCheckoutInteractor) {
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(airportLoungePassesCheckoutInteractor, "airportLoungePassesCheckoutInteractor");
        this.f288808a = pricingPlanInteractor;
        this.f288809b = dateProvider;
        this.f288810c = airportLoungePassesCheckoutInteractor;
    }

    public static h0 a(hha.d dVar, List list) {
        Object next;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((h0) next).f265916a, dVar.f152287a)) {
                break;
            }
        }
        return (h0) next;
    }
}
