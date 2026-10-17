package voi;

import akl.w;
import bmm.t;
import com.revolut.RevolutApplication;
import com.revolut.retail.common.ui.api.Toggles;
import com.revolut.utils.tracking.ab_testing.experiments.DefaultFirebaseFlagExperiment;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;
import voi.i;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f290962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f290963b;

    public /* synthetic */ a(i iVar, int i) {
        this.f290962a = i;
        this.f290963b = iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [voi.e] */
    /* JADX WARN: Type inference failed for: r12v4, types: [voi.d] */
    /* JADX WARN: Type inference failed for: r13v0, types: [voi.e] */
    /* JADX WARN: Type inference failed for: r15v0, types: [voi.e] */
    /* JADX WARN: Type inference failed for: r1v1, types: [voi.e] */
    /* JADX WARN: Type inference failed for: r1v13, types: [voi.d] */
    /* JADX WARN: Type inference failed for: r1v17, types: [voi.d] */
    /* JADX WARN: Type inference failed for: r1v21, types: [voi.d] */
    /* JADX WARN: Type inference failed for: r1v24, types: [voi.d] */
    /* JADX WARN: Type inference failed for: r1v28, types: [voi.d] */
    /* JADX WARN: Type inference failed for: r1v3, types: [voi.e] */
    /* JADX WARN: Type inference failed for: r1v31, types: [voi.d] */
    /* JADX WARN: Type inference failed for: r1v35, types: [voi.d] */
    /* JADX WARN: Type inference failed for: r1v6, types: [voi.d] */
    /* JADX WARN: Type inference failed for: r1v9, types: [voi.d] */
    /* JADX WARN: Type inference failed for: r4v11, types: [voi.d] */
    /* JADX WARN: Type inference failed for: r4v15, types: [voi.d] */
    /* JADX WARN: Type inference failed for: r4v19, types: [voi.d] */
    /* JADX WARN: Type inference failed for: r4v2, types: [voi.d] */
    /* JADX WARN: Type inference failed for: r4v22, types: [voi.e] */
    /* JADX WARN: Type inference failed for: r4v27, types: [voi.d] */
    /* JADX WARN: Type inference failed for: r4v32, types: [voi.d] */
    /* JADX WARN: Type inference failed for: r4v5, types: [voi.d] */
    /* JADX WARN: Type inference failed for: r4v8, types: [voi.e] */
    /* JADX WARN: Type inference failed for: r5v18, types: [voi.d] */
    /* JADX WARN: Type inference failed for: r5v2, types: [voi.e] */
    /* JADX WARN: Type inference failed for: r5v24, types: [voi.d] */
    /* JADX WARN: Type inference failed for: r5v7, types: [voi.e] */
    /* JADX WARN: Type inference failed for: r7v3, types: [voi.d] */
    /* JADX WARN: Type inference failed for: r9v2, types: [voi.e] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object objA;
        b60.a aVar;
        int i = this.f290962a;
        Object[] objArr = 0;
        int i2 = 8;
        final i context = this.f290963b;
        int i3 = 15;
        switch (i) {
            case 0:
                i.a aVar2 = i.Companion;
                context.l();
                final int i5 = 1;
                jo0.m.f176847a = true;
                jo0.l lVar = context.b().f290974c;
                Intrinsics.checkNotNullParameter(lVar, "<set-?>");
                jo0.m.f176848b = lVar;
                yhm.g gVar = new yhm.g(Boolean.valueOf(context instanceof RevolutApplication));
                Intrinsics.checkNotNullParameter(gVar, "<set-?>");
                jo0.m.f176849c = gVar;
                Lazy lazyB = yhm.j.b(new a(context, 14));
                Intrinsics.checkNotNullParameter(lazyB, "<set-?>");
                jo0.m.d = lazyB;
                ru0.d dVar = new ru0.d(context, 15);
                Intrinsics.checkNotNullParameter(dVar, "<set-?>");
                jo0.m.i = dVar;
                final int i6 = 7;
                ?? r132 = new phm.a() { // from class: voi.e
                    @Override // phm.a
                    public final Object get() {
                        int i21 = i6;
                        i iVar = context;
                        switch (i21) {
                            case 0:
                                i.a aVar3 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 1:
                                i.a aVar4 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 2:
                                i.a aVar5 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 3:
                                i.a aVar6 = i.Companion;
                                return Boolean.valueOf(((jte.d) iVar.d().b()).c(Toggles.ExpandableAnimation.f98569c));
                            case 4:
                                i.a aVar7 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 5:
                                i.a aVar8 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 6:
                                i.a aVar9 = i.Companion;
                                return Boolean.valueOf(iVar.g());
                            case 7:
                                i.a aVar10 = i.Companion;
                                iVar.b().getClass();
                                return Boolean.TRUE;
                            case 8:
                                i.a aVar11 = i.Companion;
                                iVar.getClass();
                                return Boolean.TRUE;
                            default:
                                i.a aVar12 = i.Companion;
                                return Boolean.valueOf(iVar.h());
                        }
                    }
                };
                c cVar = new c();
                final int i21 = 9;
                ?? r152 = new phm.a() { // from class: voi.e
                    @Override // phm.a
                    public final Object get() {
                        int i212 = i21;
                        i iVar = context;
                        switch (i212) {
                            case 0:
                                i.a aVar3 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 1:
                                i.a aVar4 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 2:
                                i.a aVar5 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 3:
                                i.a aVar6 = i.Companion;
                                return Boolean.valueOf(((jte.d) iVar.d().b()).c(Toggles.ExpandableAnimation.f98569c));
                            case 4:
                                i.a aVar7 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 5:
                                i.a aVar8 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 6:
                                i.a aVar9 = i.Companion;
                                return Boolean.valueOf(iVar.g());
                            case 7:
                                i.a aVar10 = i.Companion;
                                iVar.b().getClass();
                                return Boolean.TRUE;
                            case 8:
                                i.a aVar11 = i.Companion;
                                iVar.getClass();
                                return Boolean.TRUE;
                            default:
                                i.a aVar12 = i.Companion;
                                return Boolean.valueOf(iVar.h());
                        }
                    }
                };
                c cVar2 = new c();
                c cVar3 = new c();
                c cVar4 = new c();
                c cVar5 = new c();
                c cVar6 = new c();
                c cVar7 = new c();
                final t tVar = new t(context, Toggles.ControllerStatusDialogDisplayer.f98565c, i3);
                final int i22 = 0;
                ?? r4 = new phm.a() { // from class: voi.d
                    @Override // phm.a
                    public final Object get() {
                        int i32 = i22;
                        t tVar2 = tVar;
                        switch (i32) {
                            case 0:
                                i.a aVar3 = i.Companion;
                                break;
                            case 1:
                                i.a aVar4 = i.Companion;
                                break;
                            case 2:
                                i.a aVar5 = i.Companion;
                                break;
                            case 3:
                                i.a aVar6 = i.Companion;
                                break;
                            case 4:
                                i.a aVar7 = i.Companion;
                                break;
                            case 5:
                                i.a aVar8 = i.Companion;
                                break;
                            case 6:
                                i.a aVar9 = i.Companion;
                                break;
                            case 7:
                                i.a aVar10 = i.Companion;
                                break;
                            case 8:
                                i.a aVar11 = i.Companion;
                                break;
                            case 9:
                                i.a aVar12 = i.Companion;
                                break;
                            case 10:
                                i.a aVar13 = i.Companion;
                                break;
                            case 11:
                                i.a aVar14 = i.Companion;
                                break;
                            case 12:
                                i.a aVar15 = i.Companion;
                                break;
                            case 13:
                                i.a aVar16 = i.Companion;
                                break;
                            case 14:
                                i.a aVar17 = i.Companion;
                                break;
                            case 15:
                                i.a aVar18 = i.Companion;
                                break;
                            case 16:
                                i.a aVar19 = i.Companion;
                                break;
                            case 17:
                                i.a aVar20 = i.Companion;
                                break;
                            case 18:
                                i.a aVar21 = i.Companion;
                                break;
                            default:
                                i.a aVar22 = i.Companion;
                                break;
                        }
                        return (Boolean) tVar2.invoke();
                    }
                };
                final t tVar2 = new t(context, Toggles.RevampedPlanBackgrounds.f98585c, i3);
                ?? r122 = new phm.a() { // from class: voi.d
                    @Override // phm.a
                    public final Object get() {
                        int i32 = i5;
                        t tVar22 = tVar2;
                        switch (i32) {
                            case 0:
                                i.a aVar3 = i.Companion;
                                break;
                            case 1:
                                i.a aVar4 = i.Companion;
                                break;
                            case 2:
                                i.a aVar5 = i.Companion;
                                break;
                            case 3:
                                i.a aVar6 = i.Companion;
                                break;
                            case 4:
                                i.a aVar7 = i.Companion;
                                break;
                            case 5:
                                i.a aVar8 = i.Companion;
                                break;
                            case 6:
                                i.a aVar9 = i.Companion;
                                break;
                            case 7:
                                i.a aVar10 = i.Companion;
                                break;
                            case 8:
                                i.a aVar11 = i.Companion;
                                break;
                            case 9:
                                i.a aVar12 = i.Companion;
                                break;
                            case 10:
                                i.a aVar13 = i.Companion;
                                break;
                            case 11:
                                i.a aVar14 = i.Companion;
                                break;
                            case 12:
                                i.a aVar15 = i.Companion;
                                break;
                            case 13:
                                i.a aVar16 = i.Companion;
                                break;
                            case 14:
                                i.a aVar17 = i.Companion;
                                break;
                            case 15:
                                i.a aVar18 = i.Companion;
                                break;
                            case 16:
                                i.a aVar19 = i.Companion;
                                break;
                            case 17:
                                i.a aVar20 = i.Companion;
                                break;
                            case 18:
                                i.a aVar21 = i.Companion;
                                break;
                            default:
                                i.a aVar22 = i.Companion;
                                break;
                        }
                        return (Boolean) tVar22.invoke();
                    }
                };
                ?? r56 = new phm.a() { // from class: voi.e
                    @Override // phm.a
                    public final Object get() {
                        int i212 = i22;
                        i iVar = context;
                        switch (i212) {
                            case 0:
                                i.a aVar3 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 1:
                                i.a aVar4 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 2:
                                i.a aVar5 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 3:
                                i.a aVar6 = i.Companion;
                                return Boolean.valueOf(((jte.d) iVar.d().b()).c(Toggles.ExpandableAnimation.f98569c));
                            case 4:
                                i.a aVar7 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 5:
                                i.a aVar8 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 6:
                                i.a aVar9 = i.Companion;
                                return Boolean.valueOf(iVar.g());
                            case 7:
                                i.a aVar10 = i.Companion;
                                iVar.b().getClass();
                                return Boolean.TRUE;
                            case 8:
                                i.a aVar11 = i.Companion;
                                iVar.getClass();
                                return Boolean.TRUE;
                            default:
                                i.a aVar12 = i.Companion;
                                return Boolean.valueOf(iVar.h());
                        }
                    }
                };
                ?? r112 = new phm.a() { // from class: voi.e
                    @Override // phm.a
                    public final Object get() {
                        int i212 = i5;
                        i iVar = context;
                        switch (i212) {
                            case 0:
                                i.a aVar3 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 1:
                                i.a aVar4 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 2:
                                i.a aVar5 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 3:
                                i.a aVar6 = i.Companion;
                                return Boolean.valueOf(((jte.d) iVar.d().b()).c(Toggles.ExpandableAnimation.f98569c));
                            case 4:
                                i.a aVar7 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 5:
                                i.a aVar8 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 6:
                                i.a aVar9 = i.Companion;
                                return Boolean.valueOf(iVar.g());
                            case 7:
                                i.a aVar10 = i.Companion;
                                iVar.b().getClass();
                                return Boolean.TRUE;
                            case 8:
                                i.a aVar11 = i.Companion;
                                iVar.getClass();
                                return Boolean.TRUE;
                            default:
                                i.a aVar12 = i.Companion;
                                return Boolean.valueOf(iVar.h());
                        }
                    }
                };
                c cVar8 = new c(context, i5);
                final t tVar3 = new t(context, Toggles.MoveMoneyFaceliftGlobal.f98579c, i3);
                final int i32 = 2;
                ?? r72 = new phm.a() { // from class: voi.d
                    @Override // phm.a
                    public final Object get() {
                        int i322 = i32;
                        t tVar22 = tVar3;
                        switch (i322) {
                            case 0:
                                i.a aVar3 = i.Companion;
                                break;
                            case 1:
                                i.a aVar4 = i.Companion;
                                break;
                            case 2:
                                i.a aVar5 = i.Companion;
                                break;
                            case 3:
                                i.a aVar6 = i.Companion;
                                break;
                            case 4:
                                i.a aVar7 = i.Companion;
                                break;
                            case 5:
                                i.a aVar8 = i.Companion;
                                break;
                            case 6:
                                i.a aVar9 = i.Companion;
                                break;
                            case 7:
                                i.a aVar10 = i.Companion;
                                break;
                            case 8:
                                i.a aVar11 = i.Companion;
                                break;
                            case 9:
                                i.a aVar12 = i.Companion;
                                break;
                            case 10:
                                i.a aVar13 = i.Companion;
                                break;
                            case 11:
                                i.a aVar14 = i.Companion;
                                break;
                            case 12:
                                i.a aVar15 = i.Companion;
                                break;
                            case 13:
                                i.a aVar16 = i.Companion;
                                break;
                            case 14:
                                i.a aVar17 = i.Companion;
                                break;
                            case 15:
                                i.a aVar18 = i.Companion;
                                break;
                            case 16:
                                i.a aVar19 = i.Companion;
                                break;
                            case 17:
                                i.a aVar20 = i.Companion;
                                break;
                            case 18:
                                i.a aVar21 = i.Companion;
                                break;
                            default:
                                i.a aVar22 = i.Companion;
                                break;
                        }
                        return (Boolean) tVar22.invoke();
                    }
                };
                c cVar9 = new c(context, i32);
                ?? r110 = new phm.a() { // from class: voi.e
                    @Override // phm.a
                    public final Object get() {
                        int i212 = i32;
                        i iVar = context;
                        switch (i212) {
                            case 0:
                                i.a aVar3 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 1:
                                i.a aVar4 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 2:
                                i.a aVar5 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 3:
                                i.a aVar6 = i.Companion;
                                return Boolean.valueOf(((jte.d) iVar.d().b()).c(Toggles.ExpandableAnimation.f98569c));
                            case 4:
                                i.a aVar7 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 5:
                                i.a aVar8 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 6:
                                i.a aVar9 = i.Companion;
                                return Boolean.valueOf(iVar.g());
                            case 7:
                                i.a aVar10 = i.Companion;
                                iVar.b().getClass();
                                return Boolean.TRUE;
                            case 8:
                                i.a aVar11 = i.Companion;
                                iVar.getClass();
                                return Boolean.TRUE;
                            default:
                                i.a aVar12 = i.Companion;
                                return Boolean.valueOf(iVar.h());
                        }
                    }
                };
                final int i33 = 3;
                ?? r92 = new phm.a() { // from class: voi.e
                    @Override // phm.a
                    public final Object get() {
                        int i212 = i33;
                        i iVar = context;
                        switch (i212) {
                            case 0:
                                i.a aVar3 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 1:
                                i.a aVar4 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 2:
                                i.a aVar5 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 3:
                                i.a aVar6 = i.Companion;
                                return Boolean.valueOf(((jte.d) iVar.d().b()).c(Toggles.ExpandableAnimation.f98569c));
                            case 4:
                                i.a aVar7 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 5:
                                i.a aVar8 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 6:
                                i.a aVar9 = i.Companion;
                                return Boolean.valueOf(iVar.g());
                            case 7:
                                i.a aVar10 = i.Companion;
                                iVar.b().getClass();
                                return Boolean.TRUE;
                            case 8:
                                i.a aVar11 = i.Companion;
                                iVar.getClass();
                                return Boolean.TRUE;
                            default:
                                i.a aVar12 = i.Companion;
                                return Boolean.valueOf(iVar.h());
                        }
                    }
                };
                final int i43 = 4;
                ?? r111 = new phm.a() { // from class: voi.e
                    @Override // phm.a
                    public final Object get() {
                        int i212 = i43;
                        i iVar = context;
                        switch (i212) {
                            case 0:
                                i.a aVar3 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 1:
                                i.a aVar4 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 2:
                                i.a aVar5 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 3:
                                i.a aVar6 = i.Companion;
                                return Boolean.valueOf(((jte.d) iVar.d().b()).c(Toggles.ExpandableAnimation.f98569c));
                            case 4:
                                i.a aVar7 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 5:
                                i.a aVar8 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 6:
                                i.a aVar9 = i.Companion;
                                return Boolean.valueOf(iVar.g());
                            case 7:
                                i.a aVar10 = i.Companion;
                                iVar.b().getClass();
                                return Boolean.TRUE;
                            case 8:
                                i.a aVar11 = i.Companion;
                                iVar.getClass();
                                return Boolean.TRUE;
                            default:
                                i.a aVar12 = i.Companion;
                                return Boolean.valueOf(iVar.h());
                        }
                    }
                };
                final t tVar4 = new t(context, Toggles.TabBarInteractivity.f98591c, 15);
                final int i59 = 3;
                ?? r42 = new phm.a() { // from class: voi.d
                    @Override // phm.a
                    public final Object get() {
                        int i322 = i59;
                        t tVar22 = tVar4;
                        switch (i322) {
                            case 0:
                                i.a aVar3 = i.Companion;
                                break;
                            case 1:
                                i.a aVar4 = i.Companion;
                                break;
                            case 2:
                                i.a aVar5 = i.Companion;
                                break;
                            case 3:
                                i.a aVar6 = i.Companion;
                                break;
                            case 4:
                                i.a aVar7 = i.Companion;
                                break;
                            case 5:
                                i.a aVar8 = i.Companion;
                                break;
                            case 6:
                                i.a aVar9 = i.Companion;
                                break;
                            case 7:
                                i.a aVar10 = i.Companion;
                                break;
                            case 8:
                                i.a aVar11 = i.Companion;
                                break;
                            case 9:
                                i.a aVar12 = i.Companion;
                                break;
                            case 10:
                                i.a aVar13 = i.Companion;
                                break;
                            case 11:
                                i.a aVar14 = i.Companion;
                                break;
                            case 12:
                                i.a aVar15 = i.Companion;
                                break;
                            case 13:
                                i.a aVar16 = i.Companion;
                                break;
                            case 14:
                                i.a aVar17 = i.Companion;
                                break;
                            case 15:
                                i.a aVar18 = i.Companion;
                                break;
                            case 16:
                                i.a aVar19 = i.Companion;
                                break;
                            case 17:
                                i.a aVar20 = i.Companion;
                                break;
                            case 18:
                                i.a aVar21 = i.Companion;
                                break;
                            default:
                                i.a aVar22 = i.Companion;
                                break;
                        }
                        return (Boolean) tVar22.invoke();
                    }
                };
                final t tVar5 = new t(context, Toggles.TabBarGlowingBorder.f98590c, 15);
                final int i66 = 4;
                ?? r113 = new phm.a() { // from class: voi.d
                    @Override // phm.a
                    public final Object get() {
                        int i322 = i66;
                        t tVar22 = tVar5;
                        switch (i322) {
                            case 0:
                                i.a aVar3 = i.Companion;
                                break;
                            case 1:
                                i.a aVar4 = i.Companion;
                                break;
                            case 2:
                                i.a aVar5 = i.Companion;
                                break;
                            case 3:
                                i.a aVar6 = i.Companion;
                                break;
                            case 4:
                                i.a aVar7 = i.Companion;
                                break;
                            case 5:
                                i.a aVar8 = i.Companion;
                                break;
                            case 6:
                                i.a aVar9 = i.Companion;
                                break;
                            case 7:
                                i.a aVar10 = i.Companion;
                                break;
                            case 8:
                                i.a aVar11 = i.Companion;
                                break;
                            case 9:
                                i.a aVar12 = i.Companion;
                                break;
                            case 10:
                                i.a aVar13 = i.Companion;
                                break;
                            case 11:
                                i.a aVar14 = i.Companion;
                                break;
                            case 12:
                                i.a aVar15 = i.Companion;
                                break;
                            case 13:
                                i.a aVar16 = i.Companion;
                                break;
                            case 14:
                                i.a aVar17 = i.Companion;
                                break;
                            case 15:
                                i.a aVar18 = i.Companion;
                                break;
                            case 16:
                                i.a aVar19 = i.Companion;
                                break;
                            case 17:
                                i.a aVar20 = i.Companion;
                                break;
                            case 18:
                                i.a aVar21 = i.Companion;
                                break;
                            default:
                                i.a aVar22 = i.Companion;
                                break;
                        }
                        return (Boolean) tVar22.invoke();
                    }
                };
                final int i74 = 5;
                ?? r44 = new phm.a() { // from class: voi.e
                    @Override // phm.a
                    public final Object get() {
                        int i212 = i74;
                        i iVar = context;
                        switch (i212) {
                            case 0:
                                i.a aVar3 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 1:
                                i.a aVar4 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 2:
                                i.a aVar5 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 3:
                                i.a aVar6 = i.Companion;
                                return Boolean.valueOf(((jte.d) iVar.d().b()).c(Toggles.ExpandableAnimation.f98569c));
                            case 4:
                                i.a aVar7 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 5:
                                i.a aVar8 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 6:
                                i.a aVar9 = i.Companion;
                                return Boolean.valueOf(iVar.g());
                            case 7:
                                i.a aVar10 = i.Companion;
                                iVar.b().getClass();
                                return Boolean.TRUE;
                            case 8:
                                i.a aVar11 = i.Companion;
                                iVar.getClass();
                                return Boolean.TRUE;
                            default:
                                i.a aVar12 = i.Companion;
                                return Boolean.valueOf(iVar.h());
                        }
                    }
                };
                final int i92 = 6;
                ?? r59 = new phm.a() { // from class: voi.e
                    @Override // phm.a
                    public final Object get() {
                        int i212 = i92;
                        i iVar = context;
                        switch (i212) {
                            case 0:
                                i.a aVar3 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 1:
                                i.a aVar4 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 2:
                                i.a aVar5 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 3:
                                i.a aVar6 = i.Companion;
                                return Boolean.valueOf(((jte.d) iVar.d().b()).c(Toggles.ExpandableAnimation.f98569c));
                            case 4:
                                i.a aVar7 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 5:
                                i.a aVar8 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 6:
                                i.a aVar9 = i.Companion;
                                return Boolean.valueOf(iVar.g());
                            case 7:
                                i.a aVar10 = i.Companion;
                                iVar.b().getClass();
                                return Boolean.TRUE;
                            case 8:
                                i.a aVar11 = i.Companion;
                                iVar.getClass();
                                return Boolean.TRUE;
                            default:
                                i.a aVar12 = i.Companion;
                                return Boolean.valueOf(iVar.h());
                        }
                    }
                };
                final t tVar6 = new t(context, Toggles.UnifiedAvatarsBackgrounds.f98595c, 15);
                final int i96 = 5;
                ?? r114 = new phm.a() { // from class: voi.d
                    @Override // phm.a
                    public final Object get() {
                        int i322 = i96;
                        t tVar22 = tVar6;
                        switch (i322) {
                            case 0:
                                i.a aVar3 = i.Companion;
                                break;
                            case 1:
                                i.a aVar4 = i.Companion;
                                break;
                            case 2:
                                i.a aVar5 = i.Companion;
                                break;
                            case 3:
                                i.a aVar6 = i.Companion;
                                break;
                            case 4:
                                i.a aVar7 = i.Companion;
                                break;
                            case 5:
                                i.a aVar8 = i.Companion;
                                break;
                            case 6:
                                i.a aVar9 = i.Companion;
                                break;
                            case 7:
                                i.a aVar10 = i.Companion;
                                break;
                            case 8:
                                i.a aVar11 = i.Companion;
                                break;
                            case 9:
                                i.a aVar12 = i.Companion;
                                break;
                            case 10:
                                i.a aVar13 = i.Companion;
                                break;
                            case 11:
                                i.a aVar14 = i.Companion;
                                break;
                            case 12:
                                i.a aVar15 = i.Companion;
                                break;
                            case 13:
                                i.a aVar16 = i.Companion;
                                break;
                            case 14:
                                i.a aVar17 = i.Companion;
                                break;
                            case 15:
                                i.a aVar18 = i.Companion;
                                break;
                            case 16:
                                i.a aVar19 = i.Companion;
                                break;
                            case 17:
                                i.a aVar20 = i.Companion;
                                break;
                            case 18:
                                i.a aVar21 = i.Companion;
                                break;
                            default:
                                i.a aVar22 = i.Companion;
                                break;
                        }
                        return (Boolean) tVar22.invoke();
                    }
                };
                final t tVar7 = new t(context, Toggles.ToolboxPopupMenu.f98593c, 15);
                final int i99 = 6;
                ?? r46 = new phm.a() { // from class: voi.d
                    @Override // phm.a
                    public final Object get() {
                        int i322 = i99;
                        t tVar22 = tVar7;
                        switch (i322) {
                            case 0:
                                i.a aVar3 = i.Companion;
                                break;
                            case 1:
                                i.a aVar4 = i.Companion;
                                break;
                            case 2:
                                i.a aVar5 = i.Companion;
                                break;
                            case 3:
                                i.a aVar6 = i.Companion;
                                break;
                            case 4:
                                i.a aVar7 = i.Companion;
                                break;
                            case 5:
                                i.a aVar8 = i.Companion;
                                break;
                            case 6:
                                i.a aVar9 = i.Companion;
                                break;
                            case 7:
                                i.a aVar10 = i.Companion;
                                break;
                            case 8:
                                i.a aVar11 = i.Companion;
                                break;
                            case 9:
                                i.a aVar12 = i.Companion;
                                break;
                            case 10:
                                i.a aVar13 = i.Companion;
                                break;
                            case 11:
                                i.a aVar14 = i.Companion;
                                break;
                            case 12:
                                i.a aVar15 = i.Companion;
                                break;
                            case 13:
                                i.a aVar16 = i.Companion;
                                break;
                            case 14:
                                i.a aVar17 = i.Companion;
                                break;
                            case 15:
                                i.a aVar18 = i.Companion;
                                break;
                            case 16:
                                i.a aVar19 = i.Companion;
                                break;
                            case 17:
                                i.a aVar20 = i.Companion;
                                break;
                            case 18:
                                i.a aVar21 = i.Companion;
                                break;
                            default:
                                i.a aVar22 = i.Companion;
                                break;
                        }
                        return (Boolean) tVar22.invoke();
                    }
                };
                final t tVar8 = new t(context, Toggles.ReflectiveSurface.f98584c, 15);
                final int i100 = 7;
                ?? r115 = new phm.a() { // from class: voi.d
                    @Override // phm.a
                    public final Object get() {
                        int i322 = i100;
                        t tVar22 = tVar8;
                        switch (i322) {
                            case 0:
                                i.a aVar3 = i.Companion;
                                break;
                            case 1:
                                i.a aVar4 = i.Companion;
                                break;
                            case 2:
                                i.a aVar5 = i.Companion;
                                break;
                            case 3:
                                i.a aVar6 = i.Companion;
                                break;
                            case 4:
                                i.a aVar7 = i.Companion;
                                break;
                            case 5:
                                i.a aVar8 = i.Companion;
                                break;
                            case 6:
                                i.a aVar9 = i.Companion;
                                break;
                            case 7:
                                i.a aVar10 = i.Companion;
                                break;
                            case 8:
                                i.a aVar11 = i.Companion;
                                break;
                            case 9:
                                i.a aVar12 = i.Companion;
                                break;
                            case 10:
                                i.a aVar13 = i.Companion;
                                break;
                            case 11:
                                i.a aVar14 = i.Companion;
                                break;
                            case 12:
                                i.a aVar15 = i.Companion;
                                break;
                            case 13:
                                i.a aVar16 = i.Companion;
                                break;
                            case 14:
                                i.a aVar17 = i.Companion;
                                break;
                            case 15:
                                i.a aVar18 = i.Companion;
                                break;
                            case 16:
                                i.a aVar19 = i.Companion;
                                break;
                            case 17:
                                i.a aVar20 = i.Companion;
                                break;
                            case 18:
                                i.a aVar21 = i.Companion;
                                break;
                            default:
                                i.a aVar22 = i.Companion;
                                break;
                        }
                        return (Boolean) tVar22.invoke();
                    }
                };
                final t tVar9 = new t(context, Toggles.ChartsRedesign.f98564c, 15);
                final int i101 = 8;
                ?? r48 = new phm.a() { // from class: voi.d
                    @Override // phm.a
                    public final Object get() {
                        int i322 = i101;
                        t tVar22 = tVar9;
                        switch (i322) {
                            case 0:
                                i.a aVar3 = i.Companion;
                                break;
                            case 1:
                                i.a aVar4 = i.Companion;
                                break;
                            case 2:
                                i.a aVar5 = i.Companion;
                                break;
                            case 3:
                                i.a aVar6 = i.Companion;
                                break;
                            case 4:
                                i.a aVar7 = i.Companion;
                                break;
                            case 5:
                                i.a aVar8 = i.Companion;
                                break;
                            case 6:
                                i.a aVar9 = i.Companion;
                                break;
                            case 7:
                                i.a aVar10 = i.Companion;
                                break;
                            case 8:
                                i.a aVar11 = i.Companion;
                                break;
                            case 9:
                                i.a aVar12 = i.Companion;
                                break;
                            case 10:
                                i.a aVar13 = i.Companion;
                                break;
                            case 11:
                                i.a aVar14 = i.Companion;
                                break;
                            case 12:
                                i.a aVar15 = i.Companion;
                                break;
                            case 13:
                                i.a aVar16 = i.Companion;
                                break;
                            case 14:
                                i.a aVar17 = i.Companion;
                                break;
                            case 15:
                                i.a aVar18 = i.Companion;
                                break;
                            case 16:
                                i.a aVar19 = i.Companion;
                                break;
                            case 17:
                                i.a aVar20 = i.Companion;
                                break;
                            case 18:
                                i.a aVar21 = i.Companion;
                                break;
                            default:
                                i.a aVar22 = i.Companion;
                                break;
                        }
                        return (Boolean) tVar22.invoke();
                    }
                };
                final t tVar10 = new t(context, Toggles.MediaPickerCropPhotoDocument.f98578c, 15);
                final int i102 = 9;
                ?? r116 = new phm.a() { // from class: voi.d
                    @Override // phm.a
                    public final Object get() {
                        int i322 = i102;
                        t tVar22 = tVar10;
                        switch (i322) {
                            case 0:
                                i.a aVar3 = i.Companion;
                                break;
                            case 1:
                                i.a aVar4 = i.Companion;
                                break;
                            case 2:
                                i.a aVar5 = i.Companion;
                                break;
                            case 3:
                                i.a aVar6 = i.Companion;
                                break;
                            case 4:
                                i.a aVar7 = i.Companion;
                                break;
                            case 5:
                                i.a aVar8 = i.Companion;
                                break;
                            case 6:
                                i.a aVar9 = i.Companion;
                                break;
                            case 7:
                                i.a aVar10 = i.Companion;
                                break;
                            case 8:
                                i.a aVar11 = i.Companion;
                                break;
                            case 9:
                                i.a aVar12 = i.Companion;
                                break;
                            case 10:
                                i.a aVar13 = i.Companion;
                                break;
                            case 11:
                                i.a aVar14 = i.Companion;
                                break;
                            case 12:
                                i.a aVar15 = i.Companion;
                                break;
                            case 13:
                                i.a aVar16 = i.Companion;
                                break;
                            case 14:
                                i.a aVar17 = i.Companion;
                                break;
                            case 15:
                                i.a aVar18 = i.Companion;
                                break;
                            case 16:
                                i.a aVar19 = i.Companion;
                                break;
                            case 17:
                                i.a aVar20 = i.Companion;
                                break;
                            case 18:
                                i.a aVar21 = i.Companion;
                                break;
                            default:
                                i.a aVar22 = i.Companion;
                                break;
                        }
                        return (Boolean) tVar22.invoke();
                    }
                };
                final t tVar11 = new t(context, Toggles.PaymentsChatVisualEnhancements.f98581c, 15);
                final int i103 = 10;
                ?? r410 = new phm.a() { // from class: voi.d
                    @Override // phm.a
                    public final Object get() {
                        int i322 = i103;
                        t tVar22 = tVar11;
                        switch (i322) {
                            case 0:
                                i.a aVar3 = i.Companion;
                                break;
                            case 1:
                                i.a aVar4 = i.Companion;
                                break;
                            case 2:
                                i.a aVar5 = i.Companion;
                                break;
                            case 3:
                                i.a aVar6 = i.Companion;
                                break;
                            case 4:
                                i.a aVar7 = i.Companion;
                                break;
                            case 5:
                                i.a aVar8 = i.Companion;
                                break;
                            case 6:
                                i.a aVar9 = i.Companion;
                                break;
                            case 7:
                                i.a aVar10 = i.Companion;
                                break;
                            case 8:
                                i.a aVar11 = i.Companion;
                                break;
                            case 9:
                                i.a aVar12 = i.Companion;
                                break;
                            case 10:
                                i.a aVar13 = i.Companion;
                                break;
                            case 11:
                                i.a aVar14 = i.Companion;
                                break;
                            case 12:
                                i.a aVar15 = i.Companion;
                                break;
                            case 13:
                                i.a aVar16 = i.Companion;
                                break;
                            case 14:
                                i.a aVar17 = i.Companion;
                                break;
                            case 15:
                                i.a aVar18 = i.Companion;
                                break;
                            case 16:
                                i.a aVar19 = i.Companion;
                                break;
                            case 17:
                                i.a aVar20 = i.Companion;
                                break;
                            case 18:
                                i.a aVar21 = i.Companion;
                                break;
                            default:
                                i.a aVar22 = i.Companion;
                                break;
                        }
                        return (Boolean) tVar22.invoke();
                    }
                };
                final t tVar12 = new t(context, Toggles.TitleTransition.f98592c, 15);
                final int i104 = 11;
                ?? r117 = new phm.a() { // from class: voi.d
                    @Override // phm.a
                    public final Object get() {
                        int i322 = i104;
                        t tVar22 = tVar12;
                        switch (i322) {
                            case 0:
                                i.a aVar3 = i.Companion;
                                break;
                            case 1:
                                i.a aVar4 = i.Companion;
                                break;
                            case 2:
                                i.a aVar5 = i.Companion;
                                break;
                            case 3:
                                i.a aVar6 = i.Companion;
                                break;
                            case 4:
                                i.a aVar7 = i.Companion;
                                break;
                            case 5:
                                i.a aVar8 = i.Companion;
                                break;
                            case 6:
                                i.a aVar9 = i.Companion;
                                break;
                            case 7:
                                i.a aVar10 = i.Companion;
                                break;
                            case 8:
                                i.a aVar11 = i.Companion;
                                break;
                            case 9:
                                i.a aVar12 = i.Companion;
                                break;
                            case 10:
                                i.a aVar13 = i.Companion;
                                break;
                            case 11:
                                i.a aVar14 = i.Companion;
                                break;
                            case 12:
                                i.a aVar15 = i.Companion;
                                break;
                            case 13:
                                i.a aVar16 = i.Companion;
                                break;
                            case 14:
                                i.a aVar17 = i.Companion;
                                break;
                            case 15:
                                i.a aVar18 = i.Companion;
                                break;
                            case 16:
                                i.a aVar19 = i.Companion;
                                break;
                            case 17:
                                i.a aVar20 = i.Companion;
                                break;
                            case 18:
                                i.a aVar21 = i.Companion;
                                break;
                            default:
                                i.a aVar22 = i.Companion;
                                break;
                        }
                        return (Boolean) tVar22.invoke();
                    }
                };
                final int i105 = 8;
                ?? r411 = new phm.a() { // from class: voi.e
                    @Override // phm.a
                    public final Object get() {
                        int i212 = i105;
                        i iVar = context;
                        switch (i212) {
                            case 0:
                                i.a aVar3 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 1:
                                i.a aVar4 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 2:
                                i.a aVar5 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 3:
                                i.a aVar6 = i.Companion;
                                return Boolean.valueOf(((jte.d) iVar.d().b()).c(Toggles.ExpandableAnimation.f98569c));
                            case 4:
                                i.a aVar7 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 5:
                                i.a aVar8 = i.Companion;
                                iVar.getClass();
                                return Boolean.valueOf(iVar instanceof RevolutApplication);
                            case 6:
                                i.a aVar9 = i.Companion;
                                return Boolean.valueOf(iVar.g());
                            case 7:
                                i.a aVar10 = i.Companion;
                                iVar.b().getClass();
                                return Boolean.TRUE;
                            case 8:
                                i.a aVar11 = i.Companion;
                                iVar.getClass();
                                return Boolean.TRUE;
                            default:
                                i.a aVar12 = i.Companion;
                                return Boolean.valueOf(iVar.h());
                        }
                    }
                };
                final t tVar13 = new t(context, Toggles.MaskedInputCommitTextFix.f98577c, 15);
                final int i106 = 12;
                ?? r510 = new phm.a() { // from class: voi.d
                    @Override // phm.a
                    public final Object get() {
                        int i322 = i106;
                        t tVar22 = tVar13;
                        switch (i322) {
                            case 0:
                                i.a aVar3 = i.Companion;
                                break;
                            case 1:
                                i.a aVar4 = i.Companion;
                                break;
                            case 2:
                                i.a aVar5 = i.Companion;
                                break;
                            case 3:
                                i.a aVar6 = i.Companion;
                                break;
                            case 4:
                                i.a aVar7 = i.Companion;
                                break;
                            case 5:
                                i.a aVar8 = i.Companion;
                                break;
                            case 6:
                                i.a aVar9 = i.Companion;
                                break;
                            case 7:
                                i.a aVar10 = i.Companion;
                                break;
                            case 8:
                                i.a aVar11 = i.Companion;
                                break;
                            case 9:
                                i.a aVar12 = i.Companion;
                                break;
                            case 10:
                                i.a aVar13 = i.Companion;
                                break;
                            case 11:
                                i.a aVar14 = i.Companion;
                                break;
                            case 12:
                                i.a aVar15 = i.Companion;
                                break;
                            case 13:
                                i.a aVar16 = i.Companion;
                                break;
                            case 14:
                                i.a aVar17 = i.Companion;
                                break;
                            case 15:
                                i.a aVar18 = i.Companion;
                                break;
                            case 16:
                                i.a aVar19 = i.Companion;
                                break;
                            case 17:
                                i.a aVar20 = i.Companion;
                                break;
                            case 18:
                                i.a aVar21 = i.Companion;
                                break;
                            default:
                                i.a aVar22 = i.Companion;
                                break;
                        }
                        return (Boolean) tVar22.invoke();
                    }
                };
                final t tVar14 = new t(context, Toggles.TransparentPaletteEverywhere.f98594c, 15);
                final int i107 = 13;
                ?? r118 = new phm.a() { // from class: voi.d
                    @Override // phm.a
                    public final Object get() {
                        int i322 = i107;
                        t tVar22 = tVar14;
                        switch (i322) {
                            case 0:
                                i.a aVar3 = i.Companion;
                                break;
                            case 1:
                                i.a aVar4 = i.Companion;
                                break;
                            case 2:
                                i.a aVar5 = i.Companion;
                                break;
                            case 3:
                                i.a aVar6 = i.Companion;
                                break;
                            case 4:
                                i.a aVar7 = i.Companion;
                                break;
                            case 5:
                                i.a aVar8 = i.Companion;
                                break;
                            case 6:
                                i.a aVar9 = i.Companion;
                                break;
                            case 7:
                                i.a aVar10 = i.Companion;
                                break;
                            case 8:
                                i.a aVar11 = i.Companion;
                                break;
                            case 9:
                                i.a aVar12 = i.Companion;
                                break;
                            case 10:
                                i.a aVar13 = i.Companion;
                                break;
                            case 11:
                                i.a aVar14 = i.Companion;
                                break;
                            case 12:
                                i.a aVar15 = i.Companion;
                                break;
                            case 13:
                                i.a aVar16 = i.Companion;
                                break;
                            case 14:
                                i.a aVar17 = i.Companion;
                                break;
                            case 15:
                                i.a aVar18 = i.Companion;
                                break;
                            case 16:
                                i.a aVar19 = i.Companion;
                                break;
                            case 17:
                                i.a aVar20 = i.Companion;
                                break;
                            case 18:
                                i.a aVar21 = i.Companion;
                                break;
                            default:
                                i.a aVar22 = i.Companion;
                                break;
                        }
                        return (Boolean) tVar22.invoke();
                    }
                };
                final t tVar15 = new t(context, Toggles.IconsRedesign.f98574c, 15);
                final int i108 = 14;
                ?? r412 = new phm.a() { // from class: voi.d
                    @Override // phm.a
                    public final Object get() {
                        int i322 = i108;
                        t tVar22 = tVar15;
                        switch (i322) {
                            case 0:
                                i.a aVar3 = i.Companion;
                                break;
                            case 1:
                                i.a aVar4 = i.Companion;
                                break;
                            case 2:
                                i.a aVar5 = i.Companion;
                                break;
                            case 3:
                                i.a aVar6 = i.Companion;
                                break;
                            case 4:
                                i.a aVar7 = i.Companion;
                                break;
                            case 5:
                                i.a aVar8 = i.Companion;
                                break;
                            case 6:
                                i.a aVar9 = i.Companion;
                                break;
                            case 7:
                                i.a aVar10 = i.Companion;
                                break;
                            case 8:
                                i.a aVar11 = i.Companion;
                                break;
                            case 9:
                                i.a aVar12 = i.Companion;
                                break;
                            case 10:
                                i.a aVar13 = i.Companion;
                                break;
                            case 11:
                                i.a aVar14 = i.Companion;
                                break;
                            case 12:
                                i.a aVar15 = i.Companion;
                                break;
                            case 13:
                                i.a aVar16 = i.Companion;
                                break;
                            case 14:
                                i.a aVar17 = i.Companion;
                                break;
                            case 15:
                                i.a aVar18 = i.Companion;
                                break;
                            case 16:
                                i.a aVar19 = i.Companion;
                                break;
                            case 17:
                                i.a aVar20 = i.Companion;
                                break;
                            case 18:
                                i.a aVar21 = i.Companion;
                                break;
                            default:
                                i.a aVar22 = i.Companion;
                                break;
                        }
                        return (Boolean) tVar22.invoke();
                    }
                };
                final int i109 = 15;
                final t tVar16 = new t(context, Toggles.SwipeActionsRevamp.f98588c, i109);
                ?? r119 = new phm.a() { // from class: voi.d
                    @Override // phm.a
                    public final Object get() {
                        int i322 = i109;
                        t tVar22 = tVar16;
                        switch (i322) {
                            case 0:
                                i.a aVar3 = i.Companion;
                                break;
                            case 1:
                                i.a aVar4 = i.Companion;
                                break;
                            case 2:
                                i.a aVar5 = i.Companion;
                                break;
                            case 3:
                                i.a aVar6 = i.Companion;
                                break;
                            case 4:
                                i.a aVar7 = i.Companion;
                                break;
                            case 5:
                                i.a aVar8 = i.Companion;
                                break;
                            case 6:
                                i.a aVar9 = i.Companion;
                                break;
                            case 7:
                                i.a aVar10 = i.Companion;
                                break;
                            case 8:
                                i.a aVar11 = i.Companion;
                                break;
                            case 9:
                                i.a aVar12 = i.Companion;
                                break;
                            case 10:
                                i.a aVar13 = i.Companion;
                                break;
                            case 11:
                                i.a aVar14 = i.Companion;
                                break;
                            case 12:
                                i.a aVar15 = i.Companion;
                                break;
                            case 13:
                                i.a aVar16 = i.Companion;
                                break;
                            case 14:
                                i.a aVar17 = i.Companion;
                                break;
                            case 15:
                                i.a aVar18 = i.Companion;
                                break;
                            case 16:
                                i.a aVar19 = i.Companion;
                                break;
                            case 17:
                                i.a aVar20 = i.Companion;
                                break;
                            case 18:
                                i.a aVar21 = i.Companion;
                                break;
                            default:
                                i.a aVar22 = i.Companion;
                                break;
                        }
                        return (Boolean) tVar22.invoke();
                    }
                };
                final t tVar17 = new t(context, Toggles.ParticlesTheme.f98580c, i109);
                final int i110 = 16;
                ?? r511 = new phm.a() { // from class: voi.d
                    @Override // phm.a
                    public final Object get() {
                        int i322 = i110;
                        t tVar22 = tVar17;
                        switch (i322) {
                            case 0:
                                i.a aVar3 = i.Companion;
                                break;
                            case 1:
                                i.a aVar4 = i.Companion;
                                break;
                            case 2:
                                i.a aVar5 = i.Companion;
                                break;
                            case 3:
                                i.a aVar6 = i.Companion;
                                break;
                            case 4:
                                i.a aVar7 = i.Companion;
                                break;
                            case 5:
                                i.a aVar8 = i.Companion;
                                break;
                            case 6:
                                i.a aVar9 = i.Companion;
                                break;
                            case 7:
                                i.a aVar10 = i.Companion;
                                break;
                            case 8:
                                i.a aVar11 = i.Companion;
                                break;
                            case 9:
                                i.a aVar12 = i.Companion;
                                break;
                            case 10:
                                i.a aVar13 = i.Companion;
                                break;
                            case 11:
                                i.a aVar14 = i.Companion;
                                break;
                            case 12:
                                i.a aVar15 = i.Companion;
                                break;
                            case 13:
                                i.a aVar16 = i.Companion;
                                break;
                            case 14:
                                i.a aVar17 = i.Companion;
                                break;
                            case 15:
                                i.a aVar18 = i.Companion;
                                break;
                            case 16:
                                i.a aVar19 = i.Companion;
                                break;
                            case 17:
                                i.a aVar20 = i.Companion;
                                break;
                            case 18:
                                i.a aVar21 = i.Companion;
                                break;
                            default:
                                i.a aVar22 = i.Companion;
                                break;
                        }
                        return (Boolean) tVar22.invoke();
                    }
                };
                final t tVar18 = new t(context, Toggles.ScrollFooterRefinement.f98586c, 15);
                final int i111 = 17;
                ?? r120 = new phm.a() { // from class: voi.d
                    @Override // phm.a
                    public final Object get() {
                        int i322 = i111;
                        t tVar22 = tVar18;
                        switch (i322) {
                            case 0:
                                i.a aVar3 = i.Companion;
                                break;
                            case 1:
                                i.a aVar4 = i.Companion;
                                break;
                            case 2:
                                i.a aVar5 = i.Companion;
                                break;
                            case 3:
                                i.a aVar6 = i.Companion;
                                break;
                            case 4:
                                i.a aVar7 = i.Companion;
                                break;
                            case 5:
                                i.a aVar8 = i.Companion;
                                break;
                            case 6:
                                i.a aVar9 = i.Companion;
                                break;
                            case 7:
                                i.a aVar10 = i.Companion;
                                break;
                            case 8:
                                i.a aVar11 = i.Companion;
                                break;
                            case 9:
                                i.a aVar12 = i.Companion;
                                break;
                            case 10:
                                i.a aVar13 = i.Companion;
                                break;
                            case 11:
                                i.a aVar14 = i.Companion;
                                break;
                            case 12:
                                i.a aVar15 = i.Companion;
                                break;
                            case 13:
                                i.a aVar16 = i.Companion;
                                break;
                            case 14:
                                i.a aVar17 = i.Companion;
                                break;
                            case 15:
                                i.a aVar18 = i.Companion;
                                break;
                            case 16:
                                i.a aVar19 = i.Companion;
                                break;
                            case 17:
                                i.a aVar20 = i.Companion;
                                break;
                            case 18:
                                i.a aVar21 = i.Companion;
                                break;
                            default:
                                i.a aVar22 = i.Companion;
                                break;
                        }
                        return (Boolean) tVar22.invoke();
                    }
                };
                final t tVar19 = new t(context, Toggles.BarrelAnimationUpdate.f98563c, 15);
                final int i112 = 18;
                ?? r413 = new phm.a() { // from class: voi.d
                    @Override // phm.a
                    public final Object get() {
                        int i322 = i112;
                        t tVar22 = tVar19;
                        switch (i322) {
                            case 0:
                                i.a aVar3 = i.Companion;
                                break;
                            case 1:
                                i.a aVar4 = i.Companion;
                                break;
                            case 2:
                                i.a aVar5 = i.Companion;
                                break;
                            case 3:
                                i.a aVar6 = i.Companion;
                                break;
                            case 4:
                                i.a aVar7 = i.Companion;
                                break;
                            case 5:
                                i.a aVar8 = i.Companion;
                                break;
                            case 6:
                                i.a aVar9 = i.Companion;
                                break;
                            case 7:
                                i.a aVar10 = i.Companion;
                                break;
                            case 8:
                                i.a aVar11 = i.Companion;
                                break;
                            case 9:
                                i.a aVar12 = i.Companion;
                                break;
                            case 10:
                                i.a aVar13 = i.Companion;
                                break;
                            case 11:
                                i.a aVar14 = i.Companion;
                                break;
                            case 12:
                                i.a aVar15 = i.Companion;
                                break;
                            case 13:
                                i.a aVar16 = i.Companion;
                                break;
                            case 14:
                                i.a aVar17 = i.Companion;
                                break;
                            case 15:
                                i.a aVar18 = i.Companion;
                                break;
                            case 16:
                                i.a aVar19 = i.Companion;
                                break;
                            case 17:
                                i.a aVar20 = i.Companion;
                                break;
                            case 18:
                                i.a aVar21 = i.Companion;
                                break;
                            default:
                                i.a aVar22 = i.Companion;
                                break;
                        }
                        return (Boolean) tVar22.invoke();
                    }
                };
                final t tVar20 = new t(context, Toggles.FadeInLoading.f98570c, 15);
                final int i113 = 19;
                jo0.g.o(r132, cVar, r152, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, r4, r122, r56, r112, cVar8, r72, cVar9, r110, r92, r111, r59, r44, r114, r116, r46, r115, r48, r410, r117, r411, r42, r113, r510, r118, r412, r119, r511, r120, r413, new phm.a() { // from class: voi.d
                    @Override // phm.a
                    public final Object get() {
                        int i322 = i113;
                        t tVar22 = tVar20;
                        switch (i322) {
                            case 0:
                                i.a aVar3 = i.Companion;
                                break;
                            case 1:
                                i.a aVar4 = i.Companion;
                                break;
                            case 2:
                                i.a aVar5 = i.Companion;
                                break;
                            case 3:
                                i.a aVar6 = i.Companion;
                                break;
                            case 4:
                                i.a aVar7 = i.Companion;
                                break;
                            case 5:
                                i.a aVar8 = i.Companion;
                                break;
                            case 6:
                                i.a aVar9 = i.Companion;
                                break;
                            case 7:
                                i.a aVar10 = i.Companion;
                                break;
                            case 8:
                                i.a aVar11 = i.Companion;
                                break;
                            case 9:
                                i.a aVar12 = i.Companion;
                                break;
                            case 10:
                                i.a aVar13 = i.Companion;
                                break;
                            case 11:
                                i.a aVar14 = i.Companion;
                                break;
                            case 12:
                                i.a aVar15 = i.Companion;
                                break;
                            case 13:
                                i.a aVar16 = i.Companion;
                                break;
                            case 14:
                                i.a aVar17 = i.Companion;
                                break;
                            case 15:
                                i.a aVar18 = i.Companion;
                                break;
                            case 16:
                                i.a aVar19 = i.Companion;
                                break;
                            case 17:
                                i.a aVar20 = i.Companion;
                                break;
                            case 18:
                                i.a aVar21 = i.Companion;
                                break;
                            default:
                                i.a aVar22 = i.Companion;
                                break;
                        }
                        return (Boolean) tVar22.invoke();
                    }
                });
                if (((Boolean) jo0.g.h().getValue()).booleanValue()) {
                    vw0.a.b();
                }
                try {
                    m.Companion companion = yhm.m.INSTANCE;
                    jo0.i.a().p();
                    phm.a aVar3 = (phm.a) hf0.b.d.g().a().get(v81.d.class);
                    aVar = aVar3 != null ? (b60.a) aVar3.get() : null;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th10) {
                    m.Companion companion2 = yhm.m.INSTANCE;
                    objA = o.a(th10);
                }
                if (aVar == null) {
                    throw new IllegalStateException("Api " + v81.d.class + " is not found");
                }
                ((v81.d) aVar.b()).a().a();
                objA = Unit.f186387a;
                Throwable thA = yhm.m.a(objA);
                if (thA != null) {
                    hx7.e.n(thA);
                }
                return Unit.f186387a;
            case 1:
                i.a aVar4 = i.Companion;
                com.bumptech.glide.c.k(context).getClass();
                return xoi.e.c(context);
            case 2:
                i.a aVar5 = i.Companion;
                com.bumptech.glide.c.k(context).getClass();
                return xoi.e.b(context);
            case 3:
                i.a aVar6 = i.Companion;
                return com.bumptech.glide.c.k(context).f(context);
            case 4:
                i.a aVar7 = i.Companion;
                com.bumptech.glide.c.k(context).getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                return new mz0.a();
            case 5:
                i.a aVar8 = i.Companion;
                return com.bumptech.glide.c.k(context).a(context);
            case 6:
                i.a aVar9 = i.Companion;
                return com.bumptech.glide.c.k(context).e(context);
            case 7:
                i.a aVar10 = i.Companion;
                com.bumptech.glide.c.k(context).getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                return new com.revolut.core.ui_kit_core.displayers.sound.a(context);
            case 8:
                i.a aVar11 = i.Companion;
                xoi.e eVarK = com.bumptech.glide.c.k(context);
                eVarK.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                return new com.revolut.core.ui_kit_core.displayers.haptic.b(eVarK.f307861c.A());
            case 9:
                i.a aVar12 = i.Companion;
                com.bumptech.glide.c.k(context).getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                a3l.a aVarB = xoi.e.b(context);
                Intrinsics.checkNotNullParameter(context, "context");
                return new jz0.b(aVarB, new mz0.a());
            case 10:
                i.a aVar13 = i.Companion;
                com.bumptech.glide.c.k(context).getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                return new lo0.h(new lo0.a(context));
            case 11:
                i.a aVar14 = i.Companion;
                return context.k();
            case 12:
                i.a aVar15 = i.Companion;
                hf0.b bVar = hf0.b.d;
                CoroutineScope coroutineScopeA = ((ip.a) bVar.g()).b().E5().a();
                p0 p0Var = p0.f264001a;
                e0.C(coroutineScopeA, elm.f.f127540b, null, new w(context, objArr == true ? 1 : 0, i2), 2);
                phm.a aVar16 = (phm.a) j6.a.j(bVar, v76.a.class);
                b60.a aVar17 = aVar16 != null ? (b60.a) aVar16.get() : null;
                if (aVar17 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", v76.a.class, " is not found"));
                }
                ((v76.a) aVar17.b()).a().init();
                poi.b bVarE = i.e();
                ((nri.a) ((bo.a) bVarE.u0.get())).init();
                ((nri.a) ((bo.g) bVarE.f238038v0.get())).init();
                return Unit.f186387a;
            case 13:
                i.a aVar18 = i.Companion;
                return context.j();
            case 14:
                i.a aVar19 = i.Companion;
                Toggles.ForceRuntimeBlurUnsupported forceRuntimeBlurUnsupported = Toggles.ForceRuntimeBlurUnsupported.f98571a;
                context.getClass();
                Boolean bool = (Boolean) new t(context, forceRuntimeBlurUnsupported, i3).invoke();
                bool.booleanValue();
                return bool;
            case 15:
                i.a aVar20 = i.Companion;
                return new th0.k(context, new k(context));
            case 16:
                context.b().getClass();
                return "650277366363-sdi91h6l9ri1fugegf3s40f4fdbsv4gb.apps.googleusercontent.com";
            default:
                lte.c cVar10 = (lte.c) context.d().f168370h.get();
                DefaultFirebaseFlagExperiment firebaseExperiment = i.f290975w;
                cVar10.getClass();
                Intrinsics.checkNotNullParameter(firebaseExperiment, "firebaseExperiment");
                return Boolean.valueOf(Intrinsics.f(cVar10.b(firebaseExperiment), firebaseExperiment.f107371b));
        }
    }
}
