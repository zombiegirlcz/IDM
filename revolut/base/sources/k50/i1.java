package k50;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i1 implements j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f181101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f181102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f181103c;
    public final List d;
    public final gw0.q e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f181104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final mx0.e4 f181105h;
    public final ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Integer f181106j;
    public final boolean k;

    public i1(long j2, TextClause text, TextLocalisedClause hint, List inputActions, gw0.q qVar, CompositeClause compositeClause, Integer num, mx0.e4 inputState, ArrayList attachments, Integer num2, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(inputActions, "inputActions");
        Intrinsics.checkNotNullParameter(inputState, "inputState");
        Intrinsics.checkNotNullParameter(attachments, "attachments");
        this.f181101a = j2;
        this.f181102b = text;
        this.f181103c = hint;
        this.d = inputActions;
        this.e = qVar;
        this.f = compositeClause;
        this.f181104g = num;
        this.f181105h = inputState;
        this.i = attachments;
        this.f181106j = num2;
        this.k = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj2;
        return this.f181101a == i1Var.f181101a && this.f181102b.equals(i1Var.f181102b) && this.f181103c.equals(i1Var.f181103c) && Intrinsics.f(this.d, i1Var.d) && Intrinsics.f(this.e, i1Var.e) && Intrinsics.f(this.f, i1Var.f) && Intrinsics.f(this.f181104g, i1Var.f181104g) && this.f181105h == i1Var.f181105h && this.i.equals(i1Var.i) && Intrinsics.f(this.f181106j, i1Var.f181106j) && this.k == i1Var.k;
    }

    public final int hashCode() {
        int iD = p.a.d(t61.a.a(v7.b(Long.hashCode(this.f181101a) * 31, 31, this.f181102b), 31, this.f181103c), 31, this.d);
        gw0.q qVar = this.e;
        int iHashCode = (iD + (qVar == null ? 0 : qVar.hashCode())) * 31;
        Clause clause = this.f;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Integer num = this.f181104g;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.i, (this.f181105h.hashCode() + ((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31)) * 31, 31);
        Integer num2 = this.f181106j;
        return Boolean.hashCode(this.k) + ((iB + (num2 != null ? num2.hashCode() : 0)) * 31);
    }
}
