package mx0;

import android.animation.Animator;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class m1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m2 f209810b;

    public /* synthetic */ m1(m2 m2Var, int i) {
        this.f209809a = i;
        this.f209810b = m2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f209809a) {
            case 0:
                Animator it8 = (Animator) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f209810b.setVisibility(8);
                return Unit.f186387a;
            case 1:
                if (Intrinsics.f((String) obj2, "SKIP_BUTTON_LIST_ID")) {
                    this.f209810b.f0(q1.CLICK_ON_SKIP);
                }
                return Unit.f186387a;
            case 2:
                yhm.m mVar = (yhm.m) obj2;
                Intrinsics.h(mVar);
                Object obj3 = mVar.f314193a;
                boolean z = obj3 instanceof yhm.n;
                m2 m2Var = this.f209810b;
                if (!z) {
                    m2.l0(m2Var.f209813h);
                    m2Var.f0(q1.STORIES_FINISHED);
                }
                if (yhm.m.a(obj3) != null) {
                    j2 j2Var = m2Var.f209813h;
                    if (j2Var == null) {
                        j2Var = null;
                    }
                    if (j2Var != null) {
                        e2 e2Var = j2Var.f209771b;
                        eq0.a aVar = m2Var.i;
                        if (aVar != null) {
                            i2 i2Var = e2Var.f209668a;
                            if ((i2Var instanceof h2) || (i2Var instanceof f2)) {
                                b2 b2Var = e2Var.f209670c;
                                if (Intrinsics.f(b2Var, z1.f210133a)) {
                                    m2Var.f0(q1.FAILED_TO_PLAY_STORIES);
                                } else {
                                    if (!Intrinsics.f(b2Var, a2.f209574a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    y1 action = e2Var.f209669b;
                                    b2 errorHandler = e2Var.f209670c;
                                    Clause clause = e2Var.d;
                                    Parcelable parcelable = e2Var.e;
                                    d2 style = e2Var.f;
                                    g2 stories = g2.f209711a;
                                    Intrinsics.checkNotNullParameter(stories, "stories");
                                    Intrinsics.checkNotNullParameter(action, "action");
                                    Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
                                    Intrinsics.checkNotNullParameter(style, "style");
                                    e2 state = new e2(stories, action, errorHandler, clause, parcelable, style);
                                    aw0.l6 product = j2Var.f209770a;
                                    Intrinsics.checkNotNullParameter(product, "product");
                                    Intrinsics.checkNotNullParameter(state, "state");
                                    m2Var.j0(new j2(product, state), aVar);
                                }
                            } else if (!(i2Var instanceof g2)) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                    }
                }
                return Unit.f186387a;
            default:
                t1 it9 = (t1) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return this.f209810b.v.map(new mv9.h(22, new mul.k(20)));
        }
    }
}
