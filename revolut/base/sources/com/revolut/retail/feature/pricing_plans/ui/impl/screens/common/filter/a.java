package com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.filter;

import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.filter.PlanFilter;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.filter.PlanFilter$HigherThan$Id;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.filter.PlanFilter$HigherThan$Tier;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.filter.PlanFilter$With$Feature;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.filter.PlanFilter$With$Id;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.filter.PlanFilter$With$Tier;
import ej6.x;
import hha.d;
import hha.s;
import hha.u;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {
    public final Function1 a(final d dVar, final List list, final PlanFilter planFilter) {
        if (planFilter instanceof PlanFilter.Current) {
            return new clk.a(dVar, 12);
        }
        if (planFilter instanceof PlanFilter$With$Feature) {
            final int i = 0;
            return new Function1() { // from class: ekk.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    d plan = (d) obj2;
                    switch (i) {
                        case 0:
                            Intrinsics.checkNotNullParameter(plan, "plan");
                            PlanFilter$With$Feature planFilter$With$Feature = (PlanFilter$With$Feature) planFilter;
                            u uVar = planFilter$With$Feature.f103392a;
                            u.Companion.getClass();
                            return Boolean.valueOf(Intrinsics.f(uVar, u.F) || s.h(plan, planFilter$With$Feature.f103392a));
                        case 1:
                            Intrinsics.checkNotNullParameter(plan, "plan");
                            return Boolean.valueOf(Intrinsics.f(plan.f152287a, ((PlanFilter$With$Id) planFilter).f103393a));
                        default:
                            Intrinsics.checkNotNullParameter(plan, "plan");
                            return Boolean.valueOf(s.f(plan) == ((PlanFilter$With$Tier) planFilter).f103394a);
                    }
                }
            };
        }
        if (planFilter instanceof PlanFilter$With$Id) {
            final int i2 = 1;
            return new Function1() { // from class: ekk.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    d plan = (d) obj2;
                    switch (i2) {
                        case 0:
                            Intrinsics.checkNotNullParameter(plan, "plan");
                            PlanFilter$With$Feature planFilter$With$Feature = (PlanFilter$With$Feature) planFilter;
                            u uVar = planFilter$With$Feature.f103392a;
                            u.Companion.getClass();
                            return Boolean.valueOf(Intrinsics.f(uVar, u.F) || s.h(plan, planFilter$With$Feature.f103392a));
                        case 1:
                            Intrinsics.checkNotNullParameter(plan, "plan");
                            return Boolean.valueOf(Intrinsics.f(plan.f152287a, ((PlanFilter$With$Id) planFilter).f103393a));
                        default:
                            Intrinsics.checkNotNullParameter(plan, "plan");
                            return Boolean.valueOf(s.f(plan) == ((PlanFilter$With$Tier) planFilter).f103394a);
                    }
                }
            };
        }
        if (planFilter instanceof PlanFilter$With$Tier) {
            final int i3 = 2;
            return new Function1() { // from class: ekk.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    d plan = (d) obj2;
                    switch (i3) {
                        case 0:
                            Intrinsics.checkNotNullParameter(plan, "plan");
                            PlanFilter$With$Feature planFilter$With$Feature = (PlanFilter$With$Feature) planFilter;
                            u uVar = planFilter$With$Feature.f103392a;
                            u.Companion.getClass();
                            return Boolean.valueOf(Intrinsics.f(uVar, u.F) || s.h(plan, planFilter$With$Feature.f103392a));
                        case 1:
                            Intrinsics.checkNotNullParameter(plan, "plan");
                            return Boolean.valueOf(Intrinsics.f(plan.f152287a, ((PlanFilter$With$Id) planFilter).f103393a));
                        default:
                            Intrinsics.checkNotNullParameter(plan, "plan");
                            return Boolean.valueOf(s.f(plan) == ((PlanFilter$With$Tier) planFilter).f103394a);
                    }
                }
            };
        }
        if (planFilter instanceof PlanFilter$LowerThan$Current) {
            return new clk.a(dVar, 13);
        }
        if (planFilter instanceof PlanFilter$HigherThan$Current) {
            return new clk.a(dVar, 14);
        }
        if (planFilter instanceof PlanFilter$HigherThan$Id) {
            final int i5 = 0;
            return new Function1() { // from class: ekk.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Object next;
                    Object next2;
                    d plan = (d) obj2;
                    switch (i5) {
                        case 0:
                            Intrinsics.checkNotNullParameter(plan, "plan");
                            Iterator it8 = list.iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    next = it8.next();
                                    if (Intrinsics.f(((d) next).f152287a, ((PlanFilter$HigherThan$Id) planFilter).f103387a)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            d dVar2 = (d) next;
                            return Boolean.valueOf(dVar2 != null && plan.f152294m > dVar2.f152294m);
                        default:
                            Intrinsics.checkNotNullParameter(plan, "plan");
                            Iterator it9 = list.iterator();
                            while (true) {
                                if (it9.hasNext()) {
                                    next2 = it9.next();
                                    if (s.f((d) next2) == ((PlanFilter$HigherThan$Tier) planFilter).f103388a) {
                                    }
                                } else {
                                    next2 = null;
                                }
                            }
                            d dVar3 = (d) next2;
                            return Boolean.valueOf(dVar3 != null && plan.f152294m > dVar3.f152294m);
                    }
                }
            };
        }
        if (planFilter instanceof PlanFilter$HigherThan$Tier) {
            final int i6 = 1;
            return new Function1() { // from class: ekk.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Object next;
                    Object next2;
                    d plan = (d) obj2;
                    switch (i6) {
                        case 0:
                            Intrinsics.checkNotNullParameter(plan, "plan");
                            Iterator it8 = list.iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    next = it8.next();
                                    if (Intrinsics.f(((d) next).f152287a, ((PlanFilter$HigherThan$Id) planFilter).f103387a)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            d dVar2 = (d) next;
                            return Boolean.valueOf(dVar2 != null && plan.f152294m > dVar2.f152294m);
                        default:
                            Intrinsics.checkNotNullParameter(plan, "plan");
                            Iterator it9 = list.iterator();
                            while (true) {
                                if (it9.hasNext()) {
                                    next2 = it9.next();
                                    if (s.f((d) next2) == ((PlanFilter$HigherThan$Tier) planFilter).f103388a) {
                                    }
                                } else {
                                    next2 = null;
                                }
                            }
                            d dVar3 = (d) next2;
                            return Boolean.valueOf(dVar3 != null && plan.f152294m > dVar3.f152294m);
                    }
                }
            };
        }
        if (planFilter instanceof PlanFilter.And) {
            final int i21 = 1;
            return new Function1() { // from class: ekk.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    boolean z;
                    boolean z3;
                    d plan = (d) obj2;
                    switch (i21) {
                        case 0:
                            Intrinsics.checkNotNullParameter(plan, "plan");
                            List list2 = ((PlanFilter.Or) planFilter).f103391a;
                            if ((list2 instanceof Collection) && list2.isEmpty()) {
                                z = false;
                            } else {
                                Iterator it8 = list2.iterator();
                                while (it8.hasNext()) {
                                    if (((Boolean) this.a(dVar, list, (PlanFilter) it8.next()).invoke(plan)).booleanValue()) {
                                        z = true;
                                    }
                                }
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        default:
                            Intrinsics.checkNotNullParameter(plan, "plan");
                            List list3 = ((PlanFilter.And) planFilter).f103384a;
                            if ((list3 instanceof Collection) && list3.isEmpty()) {
                                z3 = true;
                            } else {
                                Iterator it9 = list3.iterator();
                                while (it9.hasNext()) {
                                    if (!((Boolean) this.a(dVar, list, (PlanFilter) it9.next()).invoke(plan)).booleanValue()) {
                                        z3 = false;
                                    }
                                }
                                z3 = true;
                            }
                            return Boolean.valueOf(z3);
                    }
                }
            };
        }
        if (planFilter instanceof PlanFilter.Or) {
            final int i22 = 0;
            return new Function1() { // from class: ekk.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    boolean z;
                    boolean z3;
                    d plan = (d) obj2;
                    switch (i22) {
                        case 0:
                            Intrinsics.checkNotNullParameter(plan, "plan");
                            List list2 = ((PlanFilter.Or) planFilter).f103391a;
                            if ((list2 instanceof Collection) && list2.isEmpty()) {
                                z = false;
                            } else {
                                Iterator it8 = list2.iterator();
                                while (it8.hasNext()) {
                                    if (((Boolean) this.a(dVar, list, (PlanFilter) it8.next()).invoke(plan)).booleanValue()) {
                                        z = true;
                                    }
                                }
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        default:
                            Intrinsics.checkNotNullParameter(plan, "plan");
                            List list3 = ((PlanFilter.And) planFilter).f103384a;
                            if ((list3 instanceof Collection) && list3.isEmpty()) {
                                z3 = true;
                            } else {
                                Iterator it9 = list3.iterator();
                                while (it9.hasNext()) {
                                    if (!((Boolean) this.a(dVar, list, (PlanFilter) it9.next()).invoke(plan)).booleanValue()) {
                                        z3 = false;
                                    }
                                }
                                z3 = true;
                            }
                            return Boolean.valueOf(z3);
                    }
                }
            };
        }
        if (planFilter instanceof PlanFilter.NoFilter) {
            return new x(29);
        }
        throw new NoWhenBranchMatchedException();
    }
}
