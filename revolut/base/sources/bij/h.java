package bij;

import bij.e;
import com.revolut.retail.feature.esim.api.model.EsimProfileScope;
import dej.h0;
import dej.i0;
import dej.m;
import dej.o0;
import fej.d;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f15519b;

    public /* synthetic */ h(k kVar, int i) {
        this.f15518a = i;
        this.f15519b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object obj3;
        Object next;
        Object next2;
        switch (this.f15518a) {
            case 0:
                List states = (List) obj2;
                Intrinsics.checkNotNullParameter(states, "installationStates");
                this.f15519b.f15524p.getClass();
                Intrinsics.checkNotNullParameter(states, "states");
                List list = states;
                Iterator it8 = list.iterator();
                while (true) {
                    obj3 = null;
                    if (it8.hasNext()) {
                        next = it8.next();
                        o0 o0Var = (o0) next;
                        if (o0Var instanceof h0) {
                            EsimProfileScope esimProfileScope = ((h0) o0Var).f113546a.f100428j;
                            if ((esimProfileScope != null ? esimProfileScope.f100450a : null) == m.MOBILE_PLAN) {
                            }
                        }
                    } else {
                        next = null;
                    }
                }
                o0 o0Var2 = (o0) next;
                Iterator it9 = list.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        next2 = it9.next();
                        o0 o0Var3 = (o0) next2;
                        if (o0Var3 instanceof i0) {
                            EsimProfileScope esimProfileScope2 = ((i0) o0Var3).f113555a.f100428j;
                            if ((esimProfileScope2 != null ? esimProfileScope2.f100450a : null) == m.MOBILE_PLAN) {
                            }
                        }
                    } else {
                        next2 = null;
                    }
                }
                o0 o0Var4 = (o0) next2;
                Iterator it10 = list.iterator();
                while (true) {
                    if (it10.hasNext()) {
                        Object next3 = it10.next();
                        if (((o0) next3) instanceof h0) {
                            obj3 = next3;
                        }
                    }
                }
                o0 o0Var5 = (o0) obj3;
                if (o0Var2 == null) {
                    o0Var2 = o0Var4 == null ? o0Var5 == null ? (o0) d0.d0(states) : o0Var5 : o0Var4;
                }
                Optional optionalOfNullable = Optional.ofNullable(o0Var2);
                Intrinsics.checkNotNullExpressionValue(optionalOfNullable, "ofNullable(...)");
                return optionalOfNullable;
            default:
                fej.d output = (fej.d) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (!Intrinsics.f(output, d.a.f134638a)) {
                    if (!Intrinsics.f(output, d.b.f134639a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f15519b.C2(e.d.f15514a);
                }
                return Unit.f186387a;
        }
    }
}
