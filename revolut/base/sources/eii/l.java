package eii;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f126657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f126658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RowDelegate.Model.MainImage f126659c;
    public final int d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RowDelegate.Model.c f126660g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RowDelegate.Model.b f126661h;
    public final Object i;

    public l(Clause title, Clause clause, RowDelegate.Model.MainImage mainImage, int i, boolean z, boolean z3, RowDelegate.Model.c cVar, RowDelegate.Model.b state, Object obj2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f126657a = title;
        this.f126658b = clause;
        this.f126659c = mainImage;
        this.d = i;
        this.e = z;
        this.f = z3;
        this.f126660g = cVar;
        this.f126661h = state;
        this.i = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f126657a, lVar.f126657a) && Intrinsics.f(this.f126658b, lVar.f126658b) && Intrinsics.f(this.f126659c, lVar.f126659c) && this.d == lVar.d && this.e == lVar.e && this.f == lVar.f && Intrinsics.f(this.f126660g, lVar.f126660g) && Intrinsics.f(this.f126661h, lVar.f126661h) && Intrinsics.f(this.i, lVar.i);
    }

    public final int hashCode() {
        int iHashCode = this.f126657a.hashCode() * 31;
        Clause clause = this.f126658b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        RowDelegate.Model.MainImage mainImage = this.f126659c;
        int iC = j6.a.c(j6.a.c(j6.a.b(this.d, (iHashCode2 + (mainImage == null ? 0 : mainImage.hashCode())) * 31, 31), 31, this.e), 31, this.f);
        RowDelegate.Model.c cVar = this.f126660g;
        int iHashCode3 = (this.f126661h.hashCode() + ((iC + (cVar == null ? 0 : cVar.hashCode())) * 31)) * 31;
        Object obj2 = this.i;
        return iHashCode3 + (obj2 != null ? obj2.hashCode() : 0);
    }

    public /* synthetic */ l(Clause clause, Clause clause2, RowDelegate.Model.MainImage mainImage, boolean z, boolean z3, RowDelegate.Model.c cVar, Object obj2, int i) {
        this(clause, clause2, mainImage, (i & 8) != 0 ? 8 : Integer.MAX_VALUE, z, (i & 32) != 0 ? false : z3, (i & 64) != 0 ? null : cVar, RowDelegate.Model.b.c.f53268a, (i & 256) != 0 ? null : obj2);
    }

    public /* synthetic */ l(Clause clause, TextLocalisedClause textLocalisedClause, RowDelegate.Model.MainImage.Image40 image40, boolean z, MoneyClause moneyClause, MoneyClause moneyClause2, Object obj2, int i) {
        this(clause, textLocalisedClause, image40, 8, z, false, moneyClause, moneyClause2, RowDelegate.Model.b.c.f53268a, (i & 512) != 0 ? null : obj2);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public l(com.revolut.core.ui_kit.models.Clause r12, com.revolut.core.ui_kit.models.Clause r13, com.revolut.core.ui_kit.delegates.RowDelegate.Model.MainImage r14, int r15, boolean r16, boolean r17, com.revolut.core.ui_kit.models.Clause r18, com.revolut.core.ui_kit.models.Clause r19, com.revolut.core.ui_kit.delegates.RowDelegate.Model.b r20, java.lang.Object r21) {
        /*
            r11 = this;
            java.lang.String r0 = "title"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "state"
            r9 = r20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            if (r18 != 0) goto L1f
            if (r19 == 0) goto L11
            goto L1f
        L11:
            r0 = 0
            r8 = r0
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r10 = r21
            goto L38
        L1f:
            com.revolut.core.ui_kit.delegates.RowDelegate$Model$c$b r1 = new com.revolut.core.ui_kit.delegates.RowDelegate$Model$c$b
            r5 = 0
            r6 = 124(0x7c, float:1.74E-43)
            r4 = 0
            r2 = r18
            r3 = r19
            r1.<init>(r2, r3, r4, r5, r6)
            r8 = r1
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r10 = r21
            r1 = r11
        L38:
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: eii.l.<init>(com.revolut.core.ui_kit.models.Clause, com.revolut.core.ui_kit.models.Clause, com.revolut.core.ui_kit.delegates.RowDelegate$Model$MainImage, int, boolean, boolean, com.revolut.core.ui_kit.models.Clause, com.revolut.core.ui_kit.models.Clause, com.revolut.core.ui_kit.delegates.RowDelegate$Model$b, java.lang.Object):void");
    }
}
