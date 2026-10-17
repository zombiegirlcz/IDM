package com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.k;
import ffk.t;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lha.g;
import mkk.e;
import mkk.i;
import mkk.o;
import mra.d;
import oki.h;
import rp0.g1;
import vkm.j2;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends h implements i {
    public final cha.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g1 f103411p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f103412q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k f103413r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final okk.i f103414s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vjk.a f103415t;
    public final gte.a u;
    public final vii.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f103416w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f103417x;

    public b(n stateMapper, cha.b familyPlansInteractor, g1 shotDialogDisplayer, t pricingPlansInteractor, k moreForFamilyItemsProvider, okk.i moreForFamilyExtension, vjk.a cancelFamilyExtraExtension, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(familyPlansInteractor, "familyPlansInteractor");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(pricingPlansInteractor, "pricingPlansInteractor");
        Intrinsics.checkNotNullParameter(moreForFamilyItemsProvider, "moreForFamilyItemsProvider");
        Intrinsics.checkNotNullParameter(moreForFamilyExtension, "moreForFamilyExtension");
        Intrinsics.checkNotNullParameter(cancelFamilyExtraExtension, "cancelFamilyExtraExtension");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = familyPlansInteractor;
        this.f103411p = shotDialogDisplayer;
        this.f103412q = pricingPlansInteractor;
        this.f103413r = moreForFamilyItemsProvider;
        this.f103414s = moreForFamilyExtension;
        this.f103415t = cancelFamilyExtraExtension;
        this.u = featureToggleInteractor;
        this.v = new vii.b();
        this.f103416w = d.b(this, new e(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f103417x = hx7.e.a(this, new m84.e(this, 22));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.v, new o(continuation, this, 1)), null, null, new mkk.q(this, continuation, 0), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I2(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.b.I2(java.lang.Object):void");
    }

    public final String J2() {
        return ((g) zi0.c.I(((e) ((j2) this.f103416w.f22677a).getValue()).f206480b)).f195203a;
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f103417x;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f103416w;
    }
}
