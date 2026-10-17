package gq2;

import com.revolut.data.model.Data;
import com.revolut.feature.bank_account_switching.impl.ui.terms_and_conditions.domain.TermsStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.a0;
import zhm.d0;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f145525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f145526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f145527c;
    public final Data d;
    public final TermsStep e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f145528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f145529h;

    public h(int i, int i2, List steps, Data currentTerms) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(currentTerms, "currentTerms");
        this.f145525a = i;
        this.f145526b = i2;
        this.f145527c = steps;
        this.d = currentTerms;
        TermsStep termsStep = (TermsStep) steps.get(i);
        this.e = termsStep;
        this.f = (String) termsStep.f64078c.get(i2);
        List listV0 = d0.V0(steps, i);
        ArrayList arrayList = new ArrayList();
        Iterator it8 = listV0.iterator();
        while (it8.hasNext()) {
            a0.x(((TermsStep) it8.next()).f64078c, arrayList);
        }
        this.f145528g = arrayList.size() + this.f145526b + 1;
        List list = this.f145527c;
        ArrayList arrayList2 = new ArrayList();
        Iterator it9 = list.iterator();
        while (it9.hasNext()) {
            a0.x(((TermsStep) it9.next()).f64078c, arrayList2);
        }
        this.f145529h = arrayList2.size();
    }

    public static h a(h hVar, int i, int i2, Data currentTerms, int i3) {
        if ((i3 & 1) != 0) {
            i = hVar.f145525a;
        }
        if ((i3 & 2) != 0) {
            i2 = hVar.f145526b;
        }
        List steps = hVar.f145527c;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(currentTerms, "currentTerms");
        return new h(i, i2, steps, currentTerms);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f145525a == hVar.f145525a && this.f145526b == hVar.f145526b && Intrinsics.f(this.f145527c, hVar.f145527c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(j6.a.b(this.f145526b, Integer.hashCode(this.f145525a) * 31, 31), 31, this.f145527c);
    }
}
