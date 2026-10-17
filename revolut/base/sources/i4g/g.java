package i4g;

import aw0.x8;
import c52.s;
import com.revolut.core.ui_kit.delegates.ma;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.wealth.impl.ui.activities.mosttraded.MostTradedAssetsActivity;
import com.revolut.recyclerkit.UIKitRecyclerView;
import com.revolut.retail.feature.pda.impl.ui.SetUpPdaActivityContract$Step;
import com.revolut.revolut.feature_fourthline_impl.R;
import i4g.g;
import i4h.p0;
import i9h.r;
import iel.m;
import ij9.i;
import ina.x;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import nii.y0;
import nii.z;
import rp0.y;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g extends q implements Function1 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [ia0.c] */
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
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str;
        r7g.a aVarA;
        b4g.b bVar;
        Continuation continuation = null;
        boolean z = true;
        final int i = 0;
        switch (this.f) {
            case 0:
                lk0.e lowerPage = (lk0.e) obj2;
                Intrinsics.checkNotNullParameter(lowerPage, "p0");
                ((h) this.receiver).getClass();
                Intrinsics.checkNotNullParameter(lowerPage, "lowerPage");
                if (lowerPage.e != null || (str = lowerPage.d) == null || (aVarA = r7g.b.a(str)) == null) {
                    return null;
                }
                String str2 = aVarA.f252203b;
                String str3 = aVarA.f252202a;
                if (str3 == null) {
                    return null;
                }
                b4g.c cVar = (b4g.c) lowerPage.f196172b;
                if (cVar instanceof b4g.a) {
                    bVar = new b4g.b(str2, str3, null, ((b4g.a) cVar).f12313b);
                } else {
                    if (!(cVar instanceof b4g.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    b4g.b bVar2 = (b4g.b) cVar;
                    bVar = new b4g.b(str2, str3, bVar2.f12319c, bVar2.d);
                }
                return bVar;
            case 1:
                iel.a p0 = (iel.a) obj2;
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((p0) this.receiver).getClass();
                return Boolean.valueOf((p0 instanceof m) && ((m) p0).f160797h);
            case 2:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "p0");
                com.revolut.feature.apm.core.ui.impl.ui.transfer.review.a aVar = (com.revolut.feature.apm.core.ui.impl.ui.transfer.review.a) this.receiver;
                tji.f fVarX = aVar.X();
                s sVar = aVar.f62474s;
                sVar.getClass();
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                oi0.d.I(sVar.q2(), false, false);
                z zVarB = sVar.f21399l.b(throwable);
                if (zVarB == null) {
                    zVarB = new z(new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), new TextLocalisedClause(R.string.error_generic, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764);
                }
                l.a1(aVar, fVarX.d(new y0(null, zVarB, false, 5)), null, null, new i13.d(aVar, continuation, 15), 3);
                return Boolean.TRUE;
            case 3:
                List p03 = (List) obj2;
                Intrinsics.checkNotNullParameter(p03, "p0");
                ((ihm.f) this.receiver).onNext(p03);
                return Unit.f186387a;
            case 4:
                y p010 = (y) obj2;
                Intrinsics.checkNotNullParameter(p010, "p0");
                return ((opi.b) ((opi.d) this.receiver)).a0(p010);
            case 5:
                List p011 = (List) obj2;
                Intrinsics.checkNotNullParameter(p011, "p0");
                ((MostTradedAssetsActivity) ((r) this.receiver)).setItems(p011);
                return Unit.f186387a;
            case 6:
                m90.b p012 = (m90.b) obj2;
                Intrinsics.checkNotNullParameter(p012, "p0");
                ((ia0.f) this.receiver).C2(p012);
                return Unit.f186387a;
            case 7:
                Throwable p013 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p013, "p0");
                final ia0.f fVar = (ia0.f) this.receiver;
                fVar.getClass();
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "BackendFlowModel", "Failed to load backend flow", p013, h0Var);
                ga0.a aVar2 = fVar.f159923q;
                ?? r62 = new Function0() { // from class: ia0.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i) {
                            case 0:
                                f fVar2 = fVar;
                                fVar2.getClass();
                                fVar2.l2(new e(fVar2, null), new g(1, fVar2, f.class, "handleBackendFlowLoadingError", "handleBackendFlowLoadingError(Ljava/lang/Throwable;)Z", 0, 7));
                                break;
                            default:
                                fVar.B2();
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                final int i2 = z ? 1 : 0;
                aVar2.Z2(p013, r62, new Function0() { // from class: ia0.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i2) {
                            case 0:
                                f fVar2 = fVar;
                                fVar2.getClass();
                                fVar2.l2(new e(fVar2, null), new g(1, fVar2, f.class, "handleBackendFlowLoadingError", "handleBackendFlowLoadingError(Ljava/lang/Throwable;)Z", 0, 7));
                                break;
                            default:
                                fVar.B2();
                                break;
                        }
                        return Unit.f186387a;
                    }
                });
                return Boolean.TRUE;
            case 8:
                String p014 = (String) obj2;
                Intrinsics.checkNotNullParameter(p014, "p0");
                return ((kak.a) this.receiver).b(p014);
            case 9:
                SetUpPdaActivityContract$Step p015 = (SetUpPdaActivityContract$Step) obj2;
                Intrinsics.checkNotNullParameter(p015, "p0");
                return ((iak.b) this.receiver).b(p015);
            case 10:
                SetUpPdaActivityContract$Step p016 = (SetUpPdaActivityContract$Step) obj2;
                Intrinsics.checkNotNullParameter(p016, "p0");
                return ((iak.b) this.receiver).b(p016);
            case 11:
                Throwable p017 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p017, "p0");
                com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.a aVar3 = (com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.a) this.receiver;
                aVar3.getClass();
                if (p017 instanceof CancellationException) {
                    z = false;
                } else {
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "ReservationCreationScreenModel", j6.a.q("Failed to load reservation page: id=", aVar3.o.f82855a), p017, h0Var2);
                    aVar3.H2(aVar3.v, new ab4.q(p017, 18));
                }
                return Boolean.valueOf(z);
            case 12:
                Throwable p018 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p018, "p0");
                return Boolean.valueOf(((i) this.receiver).c3(p018));
            case 13:
                Collection p019 = (Collection) obj2;
                Intrinsics.checkNotNullParameter(p019, "p0");
                x.i3((x) this.receiver, p019);
                return Unit.f186387a;
            case 14:
                ty0.a p020 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(p020, "p0");
                ((ihm.f) this.receiver).onNext(p020);
                return Unit.f186387a;
            case 15:
                ty0.a p021 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(p021, "p0");
                ((ihm.f) this.receiver).onNext(p021);
                return Unit.f186387a;
            case 16:
                ty0.a p022 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(p022, "p0");
                ((ihm.f) this.receiver).onNext(p022);
                return Unit.f186387a;
            case 17:
                ty0.a p023 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(p023, "p0");
                ((ihm.f) this.receiver).onNext(p023);
                return Unit.f186387a;
            case 18:
                ty0.a p024 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(p024, "p0");
                ((ihm.f) this.receiver).onNext(p024);
                return Unit.f186387a;
            case 19:
                ty0.a p025 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(p025, "p0");
                ((ihm.f) this.receiver).onNext(p025);
                return Unit.f186387a;
            case 20:
                ty0.a p026 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(p026, "p0");
                ((ihm.f) this.receiver).onNext(p026);
                return Unit.f186387a;
            case 21:
                ty0.a p027 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(p027, "p0");
                ((ihm.f) this.receiver).onNext(p027);
                return Unit.f186387a;
            case 22:
                ty0.a p028 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(p028, "p0");
                ((ihm.f) this.receiver).onNext(p028);
                return Unit.f186387a;
            case 23:
                ty0.a p029 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(p029, "p0");
                ((ihm.f) this.receiver).onNext(p029);
                return Unit.f186387a;
            case 24:
                x8 p030 = (x8) obj2;
                Intrinsics.checkNotNullParameter(p030, "p0");
                ma maVar = (ma) this.receiver;
                maVar.f54469p = p030;
                maVar.H(p030.f10609a);
                maVar.F();
                UIKitRecyclerView uIKitRecyclerView = maVar.f54468n;
                if (uIKitRecyclerView != null) {
                    foh.i.e(uIKitRecyclerView, p030.f10609a, p030.f10610b, p030.f10611c, p030.e);
                }
                return Unit.f186387a;
            case 25:
                ty0.a p031 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(p031, "p0");
                ((ihm.f) this.receiver).onNext(p031);
                return Unit.f186387a;
            case 26:
                ty0.a p032 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(p032, "p0");
                ((ihm.f) this.receiver).onNext(p032);
                return Unit.f186387a;
            case 27:
                ty0.a p033 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(p033, "p0");
                ((ihm.f) this.receiver).onNext(p033);
                return Unit.f186387a;
            case 28:
                ty0.a p034 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(p034, "p0");
                ((ihm.f) this.receiver).onNext(p034);
                return Unit.f186387a;
            default:
                ty0.a p035 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(p035, "p0");
                ((ihm.f) this.receiver).onNext(p035);
                return Unit.f186387a;
        }
    }
}
