package k2j;

import amd.j;
import android.view.View;
import c2d.v0;
import com.revolut.domain.models.openbanking.OutboundOpenBankingClient;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.credit.loan.api.models.rev10.LoanState;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesCounterpartAsset;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPass;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTerminal;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import hd.r;
import he3.h;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.LinkedHashSet;
import knd.m0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l97.b0;
import m2j.s;
import mk5.l;
import mti.m;
import n30.k;
import nel.n;
import nvk.z;
import o55.p;
import v30.c0;
import v30.y;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f180602b;

    public /* synthetic */ d(Object obj2, int i) {
        this.f180601a = i;
        this.f180602b = obj2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        Integer num;
        switch (this.f180601a) {
            case 0:
                int iCompare = ((c) this.f180602b).compare(obj2, obj3);
                return iCompare != 0 ? iCompare : cim.b.b(cp5.d.e((xi0.b) obj2), cp5.d.e((xi0.b) obj3));
            case 1:
                int iCompare2 = ((b83.a) this.f180602b).compare(obj2, obj3);
                return iCompare2 != 0 ? iCompare2 : cim.b.b(((eh5.b) obj2).f125736a.f306286a, ((eh5.b) obj3).f125736a.f306286a);
            case 2:
                Function1 function1 = (Function1) this.f180602b;
                return cim.b.b((Comparable) function1.invoke(obj3), (Comparable) function1.invoke(obj2));
            case 3:
                int iCompare3 = ((m0) this.f180602b).compare(obj2, obj3);
                return iCompare3 != 0 ? iCompare3 : cim.b.b(((h) ((Pair) obj3).f186385a).f151559a.f272593h, ((h) ((Pair) obj2).f186385a).f151559a.f272593h);
            case 4:
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.f180602b;
                return cim.b.b(Integer.valueOf(d0.f0(linkedHashSet, ((b0) obj2).f193046a.h())), Integer.valueOf(d0.f0(linkedHashSet, ((b0) obj3).f193046a.h())));
            case 5:
                int iCompare4 = ((e23.c) this.f180602b).compare(obj2, obj3);
                return iCompare4 != 0 ? iCompare4 : cim.b.b(((lvb.a) obj2).f200352a, ((lvb.a) obj3).f200352a);
            case 6:
                int iCompare5 = ((s) this.f180602b).compare(obj2, obj3);
                return iCompare5 != 0 ? iCompare5 : cim.b.b(((BalanceWrapper) obj2).getE(), ((BalanceWrapper) obj3).getE());
            case 7:
                int iCompare6 = ((bm8.a) this.f180602b).compare(obj2, obj3);
                return iCompare6 != 0 ? iCompare6 : cim.b.b(((ogd.e) obj2).f225109a.f86864b, ((ogd.e) obj3).f225109a.f86864b);
            case 8:
                int iCompare7 = ((s) this.f180602b).compare(obj2, obj3);
                return iCompare7 != 0 ? iCompare7 : cim.b.b(((FavouritesCounterpartAsset) obj2).f86869c, ((FavouritesCounterpartAsset) obj3).f86869c);
            case 9:
                int iCompare8 = ((mg6.b) this.f180602b).compare(obj2, obj3);
                return iCompare8 != 0 ? iCompare8 : cim.b.b(((OutboundOpenBankingClient.Australia) obj2).f60396b, ((OutboundOpenBankingClient.Australia) obj3).f60396b);
            case 10:
                int iCompare9 = ((d) this.f180602b).compare(obj2, obj3);
                return iCompare9 != 0 ? iCompare9 : cim.b.b(Integer.valueOf(((j) obj2).f6332a.c()), Integer.valueOf(((j) obj3).f6332a.c()));
            case 11:
                int iCompare10 = ((mmd.a) this.f180602b).compare(obj2, obj3);
                if (iCompare10 != 0) {
                    return iCompare10;
                }
                j jVar = (j) obj3;
                dj0.d dVarO0 = mra.d.o0(jVar);
                dj0.d dVar = dj0.d.e;
                if (dVarO0.f(dVar) || !mra.d.w(jVar)) {
                    dVarO0 = null;
                }
                dj0.d dVarA = dVarO0 != null ? dVarO0.a() : null;
                j jVar2 = (j) obj2;
                dj0.d dVarO02 = mra.d.o0(jVar2);
                if (dVarO02.f(dVar) || !mra.d.w(jVar2)) {
                    dVarO02 = null;
                }
                return cim.b.b(dVarA, dVarO02 != null ? dVarO02.a() : null);
            case 12:
                int iCompare11 = ((m) this.f180602b).compare(obj2, obj3);
                return iCompare11 != 0 ? iCompare11 : cim.b.b(((AsftTerminal) obj2).d, ((AsftTerminal) obj3).d);
            case 13:
                int iCompare12 = ((mvi.c) this.f180602b).compare(obj2, obj3);
                return iCompare12 != 0 ? iCompare12 : cim.b.b(((AsftPass) obj2).d, ((AsftPass) obj3).d);
            case 14:
                mw1.f fVar = (mw1.f) this.f180602b;
                return cim.b.b(Boolean.valueOf(!Intrinsics.f(fVar.f209304a, (Alias) obj2)), Boolean.valueOf(!Intrinsics.f(fVar.f209304a, (Alias) obj3)));
            case 15:
                int iCompare13 = ((k) this.f180602b).compare(obj2, obj3);
                return iCompare13 != 0 ? iCompare13 : cim.b.b(((y) obj3).e, ((y) obj2).e);
            case 16:
                Integer num2 = 3;
                int iCompare14 = ((d) this.f180602b).compare(obj2, obj3);
                if (iCompare14 != 0) {
                    return iCompare14;
                }
                c0 c0Var = ((y) obj3).f285834b;
                int[] iArr = n30.e.f211621b;
                int i = iArr[c0Var.ordinal()];
                if (i == 1) {
                    num = num2;
                } else if (i == 2) {
                    num = 2;
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    num = 1;
                }
                int i2 = iArr[((y) obj2).f285834b.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        num2 = 2;
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        num2 = 1;
                    }
                }
                return cim.b.b(num, num2);
            case 17:
                int iCompare15 = ((afa.a) this.f180602b).compare(obj2, obj3);
                return iCompare15 != 0 ? iCompare15 : cim.b.b(cp5.d.K(((l) obj2).f206187b), cp5.d.K(((l) obj3).f206187b));
            case 18:
                int iCompare16 = ((com.google.android.material.color.utilities.g) this.f180602b).compare(obj2, obj3);
                return iCompare16 != 0 ? iCompare16 : cim.b.b(cp5.d.K(((l) obj2).f206187b), cp5.d.K(((l) obj3).f206187b));
            case 19:
                int iCompare17 = ((nsd.a) this.f180602b).compare(obj2, obj3);
                return iCompare17 != 0 ? iCompare17 : cim.b.b(Integer.valueOf(((j) obj2).f6332a.c()), Integer.valueOf(((j) obj3).f6332a.c()));
            case 20:
                int iCompare18 = ((z) this.f180602b).compare(obj2, obj3);
                if (iCompare18 != 0) {
                    return iCompare18;
                }
                Integer num3 = ((esk.b) obj2).f128996b;
                if (num3 == null) {
                    num3 = num;
                }
                Integer num4 = ((esk.b) obj3).f128996b;
                return cim.b.b(num3, num4 != null ? num4 : 0);
            case 21:
                int iCompare19 = ((d) this.f180602b).compare(obj2, obj3);
                return iCompare19 != 0 ? iCompare19 : cim.b.b(cp5.d.K((xi0.b) obj2), cp5.d.K((xi0.b) obj3));
            case 22:
                int iCompare20 = ((bm8.a) this.f180602b).compare(obj2, obj3);
                if (iCompare20 != 0) {
                    return iCompare20;
                }
                String str = ((xi0.b) obj3).f306286a;
                xi0.b.Companion.getClass();
                xi0.b bVar = xi0.b.i;
                return cim.b.b(Boolean.valueOf(Intrinsics.f(str, bVar.f306286a)), Boolean.valueOf(Intrinsics.f(((xi0.b) obj2).f306286a, bVar.f306286a)));
            case 23:
                int iCompare21 = ((nw5.h) this.f180602b).compare(obj2, obj3);
                return iCompare21 != 0 ? iCompare21 : cim.b.b(cp5.d.K((xi0.b) ((nw5.c) obj2).f219775b.f186385a), cp5.d.K((xi0.b) ((nw5.c) obj3).f219775b.f186385a));
            case 24:
                int iCompare22 = ((p) this.f180602b).compare(obj2, obj3);
                if (iCompare22 != 0) {
                    return iCompare22;
                }
                Loan loan = (Loan) obj2;
                LoanState loanState = loan.i;
                LocalDate localDate = loanState instanceof LoanState.Repaid ? ((LoanState.Repaid) loanState).f70197a : loan.f70111g;
                Loan loan2 = (Loan) obj3;
                LoanState loanState2 = loan2.i;
                return cim.b.b(localDate, loanState2 instanceof LoanState.Repaid ? ((LoanState.Repaid) loanState2).f70197a : loan2.f70111g);
            case 25:
                int iCompare23 = ((d) this.f180602b).compare(obj2, obj3);
                return iCompare23 != 0 ? iCompare23 : cim.b.b(((Loan) obj2).f70108a, ((Loan) obj3).f70108a);
            case 26:
                int[] iArr2 = (int[]) this.f180602b;
                ((View) obj2).getLocationInWindow(iArr2);
                Integer numValueOf = Integer.valueOf(iArr2[1]);
                ((View) obj3).getLocationInWindow(iArr2);
                return cim.b.b(numValueOf, Integer.valueOf(iArr2[1]));
            case 27:
                r rVar = (r) this.f180602b;
                return cim.b.b(Integer.valueOf(r.a(rVar, (ly9.j) obj3)), Integer.valueOf(r.a(rVar, (ly9.j) obj2)));
            case 28:
                int iCompare24 = ((v0) this.f180602b).compare(obj2, obj3);
                return iCompare24 != 0 ? iCompare24 : cim.b.b(((SavingsProductData) obj2).f86683a.f86618b.f306286a, ((SavingsProductData) obj3).f86683a.f86618b.f306286a);
            default:
                int iCompare25 = ((pmh.s) this.f180602b).compare(obj2, obj3);
                return iCompare25 != 0 ? iCompare25 : cim.b.b(((n) obj2).o, ((n) obj3).o);
        }
    }
}
