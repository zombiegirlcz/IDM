package p35;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class d0 implements Serializable {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f232611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f232612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f232613c;
    public final y d;
    public final p e;
    public final i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f232614g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s f232615h;
    public final u i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x0 f232616j;
    public final d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t0 f232617l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f232618m;

    static {
        o.Companion.getClass();
        y.Companion.getClass();
        y yVar = y.f232682c;
        i.Companion.getClass();
        k.Companion.getClass();
        s.Companion.getClass();
        g.Companion.getClass();
        g gVar = g.f232639c;
        u.Companion.getClass();
        x0.Companion.getClass();
        x0 x0Var = x0.f232679c;
        d.Companion.getClass();
        b.Companion.getClass();
        new d0(null, gVar, o.f232659c, yVar, null, i.f232646c, k.f232652b, s.f, u.f232674b, x0Var, d.f232609b, null, b.f232604b);
    }

    public d0(m mVar, g calculationsInfo, o oVar, y getHelpScreen, p pVar, i cancellationInfo, k changeRepaymentDayInfo, s financialDifficultiesInfo, u forbearanceInfo, x0 statementInfo, d backupCard, t0 t0Var, b aprInfo) {
        Intrinsics.checkNotNullParameter(calculationsInfo, "calculationsInfo");
        Intrinsics.checkNotNullParameter(getHelpScreen, "getHelpScreen");
        Intrinsics.checkNotNullParameter(cancellationInfo, "cancellationInfo");
        Intrinsics.checkNotNullParameter(changeRepaymentDayInfo, "changeRepaymentDayInfo");
        Intrinsics.checkNotNullParameter(financialDifficultiesInfo, "financialDifficultiesInfo");
        Intrinsics.checkNotNullParameter(forbearanceInfo, "forbearanceInfo");
        Intrinsics.checkNotNullParameter(statementInfo, "statementInfo");
        Intrinsics.checkNotNullParameter(backupCard, "backupCard");
        Intrinsics.checkNotNullParameter(aprInfo, "aprInfo");
        this.f232611a = mVar;
        this.f232612b = calculationsInfo;
        this.f232613c = oVar;
        this.d = getHelpScreen;
        this.e = pVar;
        this.f = cancellationInfo;
        this.f232614g = changeRepaymentDayInfo;
        this.f232615h = financialDifficultiesInfo;
        this.i = forbearanceInfo;
        this.f232616j = statementInfo;
        this.k = backupCard;
        this.f232617l = t0Var;
        this.f232618m = aprInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f232611a, d0Var.f232611a) && Intrinsics.f(this.f232612b, d0Var.f232612b) && Intrinsics.f(this.f232613c, d0Var.f232613c) && Intrinsics.f(this.d, d0Var.d) && Intrinsics.f(this.e, d0Var.e) && Intrinsics.f(this.f, d0Var.f) && Intrinsics.f(this.f232614g, d0Var.f232614g) && Intrinsics.f(this.f232615h, d0Var.f232615h) && Intrinsics.f(this.i, d0Var.i) && Intrinsics.f(this.f232616j, d0Var.f232616j) && Intrinsics.f(this.k, d0Var.k) && Intrinsics.f(this.f232617l, d0Var.f232617l) && Intrinsics.f(this.f232618m, d0Var.f232618m);
    }

    public final int hashCode() {
        m mVar = this.f232611a;
        int iHashCode = (this.f232612b.hashCode() + ((mVar == null ? 0 : mVar.hashCode()) * 31)) * 31;
        o oVar = this.f232613c;
        int iHashCode2 = (this.d.hashCode() + ((iHashCode + (oVar == null ? 0 : oVar.hashCode())) * 31)) * 31;
        p pVar = this.e;
        int iC = j6.a.c((this.f232616j.hashCode() + j6.a.c((this.f232615h.hashCode() + j6.a.c((this.f.hashCode() + ((iHashCode2 + (pVar == null ? 0 : pVar.f232666a.hashCode())) * 31)) * 31, 31, this.f232614g.f232653a)) * 31, 31, this.i.f232675a)) * 31, 31, this.k.f232610a);
        t0 t0Var = this.f232617l;
        return Boolean.hashCode(this.f232618m.f232605a) + ((iC + (t0Var != null ? t0Var.hashCode() : 0)) * 31);
    }
}
