package hmc;

import android.os.Parcelable;
import aw0.j0;
import aw0.u0;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LabelButtonDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.f2;
import com.revolut.core.ui_kit.delegates.s2;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.delegates.w4;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.corporate_events.impl.ui.screen.home.CorporateEventsHomeScreen;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature_move_money.api.navigation.MoveMoneyDestination;
import com.revolut.shared.feature.move_money.api.navigation.Action;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import dng.e;
import ip0.pb0;
import ip0.pd;
import ip0.s7;
import ip0.sd;
import ip0.tt;
import ip0.ut;
import ip0.z5;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.joda.time.LocalDate;
import tof.a3;
import zhm.d0;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f153624a;

    public /* synthetic */ a(int i) {
        this.f153624a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3, types: [do3.f] */
    /* JADX WARN: Type inference failed for: r16v4, types: [do3.f] */
    /* JADX WARN: Type inference failed for: r16v5, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3, types: [com.revolut.feature.address.models.Address] */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r1v79, types: [do3.v[]] */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2, types: [org.joda.time.LocalDate] */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5, types: [do3.p] */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3, types: [do3.v] */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3, types: [do3.u] */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r32v9, types: [do3.t] */
    /* JADX WARN: Type inference failed for: r33v10, types: [do3.m] */
    /* JADX WARN: Type inference failed for: r33v11 */
    /* JADX WARN: Type inference failed for: r33v9 */
    /* JADX WARN: Type inference failed for: r34v10, types: [java.time.Instant] */
    /* JADX WARN: Type inference failed for: r34v11 */
    /* JADX WARN: Type inference failed for: r34v9 */
    /* JADX WARN: Type inference failed for: r35v10 */
    /* JADX WARN: Type inference failed for: r35v8 */
    /* JADX WARN: Type inference failed for: r35v9, types: [do3.j] */
    /* JADX WARN: Type inference failed for: r36v7 */
    /* JADX WARN: Type inference failed for: r36v8, types: [do3.k] */
    /* JADX WARN: Type inference failed for: r36v9 */
    /* JADX WARN: Type inference failed for: r4v44, types: [do3.t[]] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27, types: [aw0.t0, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v41, types: [do3.l[]] */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v20, types: [do3.t] */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v30, types: [do3.f[]] */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34, types: [do3.l] */
    /* JADX WARN: Type inference failed for: r9v35, types: [do3.l] */
    /* JADX WARN: Type inference failed for: r9v36, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v41, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v42, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Iterator it8;
        ?? r56;
        qv0.i iVarX;
        qv0.i utVar;
        Object pVar;
        ?? localDate;
        ?? r162;
        dng.h hVar;
        ?? pVar2;
        ?? r212;
        ?? uVar;
        ?? r87;
        dng.e eVar;
        ?? mVar;
        Object obj3;
        ?? r342;
        ?? jVar;
        ?? kVar;
        ?? r92;
        ?? r72;
        ?? arrayList;
        int i = 10;
        int i2 = 0;
        boolean z = true;
        dng.d dVar = null;
        switch (this.f153624a) {
            case 0:
                RowDelegate.Model it9 = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                Object obj4 = it9.u;
                if (obj4 instanceof t) {
                    return (t) obj4;
                }
                return null;
            case 1:
                CellDetailsChevronDelegate.Model it10 = (CellDetailsChevronDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                Object obj5 = it10.e;
                if (obj5 instanceof r) {
                    return (r) obj5;
                }
                return null;
            case 2:
                LargeActionButtonDelegate.Model it11 = (LargeActionButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                Object obj6 = it11.i;
                if (obj6 instanceof p) {
                    return (p) obj6;
                }
                return null;
            case 3:
                LargeActionButtonDelegate.Model it12 = (LargeActionButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                Object obj7 = it12.i;
                if (obj7 instanceof q) {
                    return (q) obj7;
                }
                return null;
            case 4:
                Pair pair = (Pair) obj2;
                return new Pair((alc.n) pair.f186385a, (List) pair.f186386b);
            case 5:
                return r0.t((List) obj2);
            case 6:
                a3 transaction = (a3) obj2;
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                return Boolean.valueOf(transaction.M0 != null);
            case 7:
                ?? r262 = 0;
                List itemLists = (List) obj2;
                Intrinsics.checkNotNullParameter(itemLists, "itemLists");
                ArrayList arrayListU = zhm.w.u(itemLists);
                if (!arrayListU.isEmpty()) {
                    Iterator it13 = arrayListU.iterator();
                    while (it13.hasNext()) {
                        if (!(((koi.j) it13.next()) instanceof qv0.i)) {
                            return arrayListU;
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayListU, 10));
                Iterator it14 = arrayListU.iterator();
                while (it14.hasNext()) {
                    koi.j jVar2 = (koi.j) it14.next();
                    Intrinsics.i(jVar2, "null cannot be cast to non-null type com.revolut.core.ui_kit.items.BoxListItem");
                    qv0.i iVar = (qv0.i) jVar2;
                    if (iVar instanceof CellDetailsDelegate.Model) {
                        r56 = r262;
                        iVarX = CellDetailsDelegate.Model.e((CellDetailsDelegate.Model) iVar, r56, r56, false, 67108863);
                        it8 = it14;
                    } else {
                        if (iVar instanceof CellDetailsActionDelegate.Model) {
                            CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) iVar;
                            String listId = model.f51781a;
                            Clause cellTitle = model.f51782b;
                            int i3 = model.f51783c;
                            Image image = model.d;
                            Clause clause = model.e;
                            j0 backgroundType = model.f;
                            boolean z3 = model.f51784g;
                            boolean z4 = model.f51785h;
                            u0 actionMaxWidth = model.i;
                            it8 = it14;
                            z5 preActionAnimation = model.f51786j;
                            String str = model.k;
                            Object obj8 = model.f51787l;
                            Parcelable parcelable = model.f51788m;
                            qv0.c positionInBox = model.f51789n;
                            p31.c cVar = model.o;
                            p31.c cVar2 = model.f51790p;
                            p31.c cVar3 = model.f51791q;
                            p31.c cVar4 = model.f51792r;
                            int i5 = model.f51793s;
                            int i6 = model.f51794t;
                            int i21 = model.u;
                            int i22 = model.v;
                            Intrinsics.checkNotNullParameter(listId, "listId");
                            Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
                            Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
                            Intrinsics.checkNotNullParameter(actionMaxWidth, "actionMaxWidth");
                            Intrinsics.checkNotNullParameter(preActionAnimation, "preActionAnimation");
                            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
                            utVar = new CellDetailsActionDelegate.Model(listId, cellTitle, i3, image, clause, backgroundType, z3, z4, actionMaxWidth, preActionAnimation, str, obj8, parcelable, positionInBox, cVar, cVar2, cVar3, cVar4, i5, i6, i21, i22);
                        } else {
                            it8 = it14;
                            if (iVar instanceof CellDetailsNoteDelegate.Model) {
                                CellDetailsNoteDelegate.Model model2 = (CellDetailsNoteDelegate.Model) iVar;
                                String listId2 = model2.f51871a;
                                Clause cellTitle2 = model2.f51872b;
                                yy0.l lVar = model2.f51873c;
                                Clause clause2 = model2.d;
                                Image image2 = model2.e;
                                boolean z6 = model2.f;
                                boolean z11 = model2.f51874g;
                                Image image3 = model2.f51875h;
                                Clause clause3 = model2.i;
                                s2 actionState = model2.f51876j;
                                boolean z12 = model2.k;
                                Object obj9 = model2.f51877l;
                                Parcelable parcelable2 = model2.f51878m;
                                qv0.c positionInBox2 = model2.f51879n;
                                qv0.k positionInGroup = model2.o;
                                p31.c cVar5 = model2.f51880p;
                                p31.c cVar6 = model2.f51881q;
                                p31.c cVar7 = model2.f51882r;
                                p31.c cVar8 = model2.f51883s;
                                int i32 = model2.f51884t;
                                int i33 = model2.u;
                                int i43 = model2.v;
                                int i59 = model2.f51885w;
                                Intrinsics.checkNotNullParameter(listId2, "listId");
                                Intrinsics.checkNotNullParameter(cellTitle2, "cellTitle");
                                Intrinsics.checkNotNullParameter(actionState, "actionState");
                                Intrinsics.checkNotNullParameter(positionInBox2, "positionInBox");
                                Intrinsics.checkNotNullParameter(positionInGroup, "positionInGroup");
                                utVar = new CellDetailsNoteDelegate.Model(listId2, cellTitle2, lVar, clause2, image2, z6, z11, image3, clause3, actionState, z12, obj9, parcelable2, positionInBox2, positionInGroup, cVar5, cVar6, cVar7, cVar8, i32, i33, i43, i59);
                            } else if (iVar instanceof CellDetailsSwitcherDelegate.Model) {
                                CellDetailsSwitcherDelegate.Model model3 = (CellDetailsSwitcherDelegate.Model) iVar;
                                String listId3 = model3.f51913a;
                                Clause title = model3.f51914b;
                                boolean z29 = model3.f51915c;
                                boolean z31 = model3.d;
                                int i66 = model3.e;
                                j0 backgroundType2 = model3.f;
                                String str2 = model3.f51916g;
                                Object obj10 = model3.f51917h;
                                Parcelable parcelable3 = model3.i;
                                qv0.c positionInBox3 = model3.f51918j;
                                p31.c cVar9 = model3.k;
                                p31.c cVar10 = model3.f51919l;
                                p31.c cVar11 = model3.f51920m;
                                p31.c cVar12 = model3.f51921n;
                                int i74 = model3.o;
                                int i92 = model3.f51922p;
                                int i96 = model3.f51923q;
                                int i99 = model3.f51924r;
                                Intrinsics.checkNotNullParameter(listId3, "listId");
                                Intrinsics.checkNotNullParameter(title, "title");
                                Intrinsics.checkNotNullParameter(backgroundType2, "backgroundType");
                                Intrinsics.checkNotNullParameter(positionInBox3, "positionInBox");
                                utVar = new CellDetailsSwitcherDelegate.Model(listId3, title, z29, z31, i66, backgroundType2, str2, obj10, parcelable3, positionInBox3, cVar9, cVar10, cVar11, cVar12, i74, i92, i96, i99);
                            } else if (iVar instanceof CellDetailsChevronDelegate.Model) {
                                CellDetailsChevronDelegate.Model model4 = (CellDetailsChevronDelegate.Model) iVar;
                                String listId4 = model4.f51822a;
                                Clause cellTitle3 = model4.f51823b;
                                int i100 = model4.f51824c;
                                f2 f2Var = model4.d;
                                Object obj11 = model4.e;
                                Parcelable parcelable4 = model4.f;
                                qv0.c positionInBox4 = model4.f51825g;
                                p31.c cVar13 = model4.f51826h;
                                p31.c cVar14 = model4.i;
                                p31.c cVar15 = model4.f51827j;
                                p31.c cVar16 = model4.k;
                                int i101 = model4.f51828l;
                                int i102 = model4.f51829m;
                                int i103 = model4.f51830n;
                                int i104 = model4.o;
                                py0.a aVar = model4.f51831p;
                                Intrinsics.checkNotNullParameter(listId4, "listId");
                                Intrinsics.checkNotNullParameter(cellTitle3, "cellTitle");
                                Intrinsics.checkNotNullParameter(positionInBox4, "positionInBox");
                                utVar = new CellDetailsChevronDelegate.Model(listId4, cellTitle3, i100, f2Var, obj11, parcelable4, positionInBox4, cVar13, cVar14, cVar15, cVar16, i101, i102, i103, i104, aVar);
                            } else if (iVar instanceof s7) {
                                r56 = 0;
                                iVarX = s7.a((s7) iVar, null, CertificateBody.profileType);
                            } else if (iVar instanceof CounterTextDelegate.Model) {
                                CounterTextDelegate.Model model5 = (CounterTextDelegate.Model) iVar;
                                String listId5 = model5.f52159a;
                                CounterTextDelegate.d dVar2 = model5.f52160b;
                                w4 topSectionStyle = model5.f52161c;
                                pd valueDescriptionStyle = model5.d;
                                sd valueSection = model5.e;
                                CounterTextDelegate.a aVar2 = model5.f;
                                boolean z41 = model5.f52162g;
                                boolean z49 = model5.f52163h;
                                uw0.i iVar2 = model5.i;
                                Object obj12 = model5.f52164j;
                                qv0.c positionInBox5 = model5.k;
                                p31.c cVar17 = model5.f52165l;
                                p31.c cVar18 = model5.f52166m;
                                p31.c cVar19 = model5.f52167n;
                                p31.c cVar20 = model5.o;
                                int i105 = model5.f52168p;
                                int i106 = model5.f52169q;
                                int i107 = model5.f52170r;
                                int i108 = model5.f52171s;
                                Parcelable parcelable5 = model5.f52172t;
                                qv0.k positionInGroup2 = model5.u;
                                Intrinsics.checkNotNullParameter(listId5, "listId");
                                Intrinsics.checkNotNullParameter(topSectionStyle, "topSectionStyle");
                                Intrinsics.checkNotNullParameter(valueDescriptionStyle, "valueDescriptionStyle");
                                Intrinsics.checkNotNullParameter(valueSection, "valueSection");
                                Intrinsics.checkNotNullParameter(positionInBox5, "positionInBox");
                                Intrinsics.checkNotNullParameter(positionInGroup2, "positionInGroup");
                                utVar = new CounterTextDelegate.Model(listId5, dVar2, topSectionStyle, valueDescriptionStyle, valueSection, aVar2, z41, z49, iVar2, obj12, positionInBox5, cVar17, cVar18, cVar19, cVar20, i105, i106, i107, i108, parcelable5, positionInGroup2);
                            } else if (iVar instanceof FullScreenStateDelegate.Model) {
                                r56 = 0;
                                iVarX = FullScreenStateDelegate.Model.e((FullScreenStateDelegate.Model) iVar, null, 4194303);
                            } else if (iVar instanceof LabelButtonDelegate.Model) {
                                LabelButtonDelegate.Model model6 = (LabelButtonDelegate.Model) iVar;
                                String listId6 = model6.f52603a;
                                Clause title2 = model6.f52604b;
                                Image image4 = model6.f52605c;
                                Image image5 = model6.d;
                                Object obj13 = model6.e;
                                Parcelable parcelable6 = model6.f;
                                int i109 = model6.f52606g;
                                int i110 = model6.f52607h;
                                int i111 = model6.i;
                                int i112 = model6.f52608j;
                                qv0.k positionInGroup3 = model6.k;
                                Intrinsics.checkNotNullParameter(listId6, "listId");
                                Intrinsics.checkNotNullParameter(title2, "title");
                                Intrinsics.checkNotNullParameter(positionInGroup3, "positionInGroup");
                                utVar = new LabelButtonDelegate.Model(listId6, title2, image4, image5, obj13, parcelable6, i109, i110, i111, i112, positionInGroup3);
                            } else {
                                if (iVar instanceof LargeActionButtonDelegate.Model) {
                                    iVarX = LargeActionButtonDelegate.Model.e((LargeActionButtonDelegate.Model) iVar, null, 0, 0, 0, 0, 1048575);
                                } else if (iVar instanceof ut) {
                                    ut utVar2 = (ut) iVar;
                                    String listId7 = utVar2.f166723a;
                                    Clause title3 = utVar2.f166724b;
                                    int i113 = utVar2.f166725c;
                                    tt bulletType = utVar2.d;
                                    boolean z54 = utVar2.e;
                                    Object obj14 = utVar2.f;
                                    qv0.c positionInBox6 = utVar2.f166726g;
                                    p31.c cVar21 = utVar2.f166727h;
                                    p31.c cVar22 = utVar2.i;
                                    p31.c cVar23 = utVar2.f166728j;
                                    p31.c cVar24 = utVar2.k;
                                    int i114 = utVar2.f166729l;
                                    int i115 = utVar2.f166730m;
                                    int i116 = utVar2.f166731n;
                                    int i117 = utVar2.o;
                                    Intrinsics.checkNotNullParameter(listId7, "listId");
                                    Intrinsics.checkNotNullParameter(title3, "title");
                                    Intrinsics.checkNotNullParameter(bulletType, "bulletType");
                                    Intrinsics.checkNotNullParameter(positionInBox6, "positionInBox");
                                    utVar = new ut(listId7, title3, i113, bulletType, z54, obj14, positionInBox6, cVar21, cVar22, cVar23, cVar24, i114, i115, i116, i117);
                                } else {
                                    boolean z74 = iVar instanceof PlainTextDelegate.Model;
                                    iVarX = iVar;
                                    if (!z74) {
                                        if (iVar instanceof sa) {
                                            r56 = 0;
                                            iVarX = sa.e((sa) iVar, null, 262143);
                                        } else {
                                            r56 = 0;
                                            r56 = 0;
                                            if (iVar instanceof ProgressStepVerticalV2Delegate.Model) {
                                                iVarX = ProgressStepVerticalV2Delegate.Model.e((ProgressStepVerticalV2Delegate.Model) iVar, null, 2097151);
                                            } else {
                                                if (!(iVar instanceof RowDelegate.Model)) {
                                                    throw new IllegalStateException(a10.b.s("copyForBox: unhandled type ", o0.f186429a.b(iVar.getClass()).e(), ". Add a copy() branch for it."));
                                                }
                                                iVarX = RowDelegate.Model.x((RowDelegate.Model) iVar, null, null, null, null, null, 0, null, false, null, null, 0, 0, 0, 0, null, -1, 15);
                                            }
                                        }
                                    }
                                }
                                r56 = 0;
                            }
                        }
                        iVarX = utVar;
                        r56 = 0;
                    }
                    arrayList2.add(iVarX);
                    it14 = it8;
                    r262 = r56;
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                return arrayList2;
            case 8:
                cmf.p it15 = (cmf.p) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return it15.d;
            case 9:
                Boolean handled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(handled, "handled");
                handled.booleanValue();
                return handled;
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 11:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 12:
                dng.g it16 = (dng.g) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                Intrinsics.checkNotNullParameter(it16, "<this>");
                return new l71.d(it16.getName(), it16.getIb.b.Features java.lang.String(), it16.getRegion());
            case 13:
                Data it17 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return Boolean.valueOf(!it17.getLoading());
            case 14:
                qo3.a response = (qo3.a) obj2;
                Intrinsics.checkNotNullParameter(response, "response");
                Intrinsics.checkNotNullParameter(response, "<this>");
                return new co3.a(response.getLatitude(), response.getLongitude());
            case 15:
                dng.m response2 = (dng.m) obj2;
                Intrinsics.checkNotNullParameter(response2, "response");
                Intrinsics.checkNotNullParameter(response2, "<this>");
                int limit = response2.getLimit();
                List<dng.n> usernames = response2.getUsernames();
                ArrayList arrayList3 = new ArrayList(zhm.w.t(usernames, 10));
                for (dng.n nVar : usernames) {
                    dng.o state = nVar.getState();
                    int i118 = state == null ? -1 : vmg.g.f290579a[state.ordinal()];
                    if (i118 != -1) {
                        if (i118 == 1) {
                            pVar = new zlg.o(nVar.getUsername());
                            arrayList3.add(pVar);
                        } else if (i118 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    pVar = new zlg.p(nVar.getUsername());
                    arrayList3.add(pVar);
                }
                return new zlg.n(limit, arrayList3);
            case 16:
                dng.h it18 = (dng.h) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                Intrinsics.checkNotNullParameter(it18, "<this>");
                List<dng.b> listB = it18.getProfiles();
                ArrayList arrayList4 = new ArrayList(zhm.w.t(listB, 10));
                for (dng.b bVar : listB) {
                    boolean z83 = bVar.getDefault();
                    List<dng.c> registeredIdentities = bVar.getRegisteredIdentities();
                    ArrayList arrayList5 = new ArrayList(zhm.w.t(registeredIdentities, i));
                    for (dng.c cVar25 : registeredIdentities) {
                        String id10 = cVar25.getId();
                        String service = cVar25.getService();
                        dng.d dVar3 = dVar;
                        ?? Values = do3.f.values();
                        int length = Values.length;
                        while (true) {
                            if (i2 < length) {
                                r162 = Values[i2];
                                if (!kotlin.text.a0.z(r162.name(), service, z)) {
                                    i2++;
                                }
                            } else {
                                r162 = dVar3;
                            }
                        }
                        if (r162 == 0) {
                            r162 = do3.f.UNKNOWN;
                        }
                        LocalDateTime localDateTimeY = oi0.d.Y(cVar25.getCreatedDate());
                        do3.s sVarValueOf = do3.s.valueOf(cVar25.getState());
                        no3.b address = cVar25.getAddress();
                        ?? A = address != null ? oo3.a.a(address) : dVar3;
                        dng.j identityDetails = cVar25.getIdentityDetails();
                        if (identityDetails != null) {
                            Intrinsics.checkNotNullParameter(identityDetails, "<this>");
                            String occupation = identityDetails.getOccupation();
                            List identificationNumbers = identityDetails.getIdentificationNumbers();
                            if (identificationNumbers != null) {
                                List<dng.i> list = identificationNumbers;
                                arrayList = new ArrayList(zhm.w.t(list, 10));
                                for (dng.i iVar3 : list) {
                                    arrayList.add(new do3.o(iVar3.getName(), iVar3.getCountry(), iVar3.getValue()));
                                    it18 = it18;
                                }
                            } else {
                                arrayList = dVar3;
                            }
                            hVar = it18;
                            pVar2 = new do3.p(occupation, arrayList);
                        } else {
                            hVar = it18;
                            pVar2 = dVar3;
                        }
                        String terminationReason = cVar25.getTerminationReason();
                        if (terminationReason != null) {
                            ?? Values2 = do3.v.values();
                            int length2 = Values2.length;
                            int i119 = 0;
                            while (true) {
                                if (i119 < length2) {
                                    r72 = Values2[i119];
                                    if (!kotlin.text.a0.z(r72.name(), terminationReason, true)) {
                                        i119++;
                                    }
                                } else {
                                    r72 = dVar3;
                                }
                            }
                            r212 = r72;
                        } else {
                            r212 = dVar3;
                        }
                        String annualIncomeRange = cVar25.getAnnualIncomeRange();
                        do3.h hVarA = vmg.d.a(cVar25.getSalariedUser());
                        dng.e student = cVar25.getStudent();
                        if (student != null) {
                            Object obj15 = vmg.e.f290578a;
                            String state2 = student.getState();
                            ?? Values3 = do3.t.values();
                            int length3 = Values3.length;
                            int i120 = 0;
                            while (true) {
                                if (i120 < length3) {
                                    r87 = Values3[i120];
                                    if (!kotlin.text.a0.z(r87.name(), state2, true)) {
                                        i120++;
                                    }
                                } else {
                                    r87 = dVar3;
                                }
                            }
                            if (r87 == 0) {
                                r87 = do3.t.NOT_VERIFIED;
                            }
                            ?? r322 = r87;
                            e.c verification = student.getVerification();
                            if (verification != null) {
                                Intrinsics.checkNotNullParameter(verification, "<this>");
                                String state3 = verification.getState();
                                ?? Values4 = do3.l.values();
                                int length4 = Values4.length;
                                int i121 = 0;
                                while (true) {
                                    if (i121 < length4) {
                                        r92 = Values4[i121];
                                        eVar = student;
                                        if (!kotlin.text.a0.z(r92.name(), state3, true)) {
                                            i121++;
                                            student = eVar;
                                        }
                                    } else {
                                        eVar = student;
                                        r92 = dVar3;
                                    }
                                }
                                if (r92 == 0) {
                                    r92 = do3.l.UNKNOWN;
                                }
                                mVar = new do3.m(r92, verification.getEmail());
                            } else {
                                eVar = student;
                                mVar = dVar3;
                            }
                            String verifiedUntil = eVar.getVerifiedUntil();
                            if (verifiedUntil != null) {
                                try {
                                    obj3 = Instant.parse(verifiedUntil);
                                } catch (Exception unused) {
                                    obj3 = dVar3;
                                }
                                r342 = obj3;
                            } else {
                                r342 = dVar3;
                            }
                            e.a eligibility = eVar.getEligibility();
                            if (eligibility != null) {
                                Intrinsics.checkNotNullParameter(eligibility, "<this>");
                                jVar = new do3.j(new do3.i(eligibility.getAgeRange().getStart(), eligibility.getAgeRange().getEnd()));
                            } else {
                                jVar = dVar3;
                            }
                            e.b university = eVar.getUniversity();
                            if (university != null) {
                                Intrinsics.checkNotNullParameter(university, "<this>");
                                kVar = new do3.k(university.getName());
                            } else {
                                kVar = dVar3;
                            }
                            uVar = new do3.u(r322, mVar, r342, jVar, kVar);
                        } else {
                            uVar = dVar3;
                        }
                        arrayList5.add(new do3.e(id10, r162, localDateTimeY, sVarValueOf, A, pVar2, r212, annualIncomeRange, hVarA, uVar, cVar25.getGraduationId()));
                        it18 = hVar;
                        dVar = dVar3;
                        i2 = 0;
                        z = true;
                        break;
                    }
                    arrayList4.add(new do3.r(arrayList5, z83));
                    i = 10;
                    i2 = 0;
                    z = true;
                }
                dng.h hVar2 = it18;
                dng.d dVar4 = dVar;
                do3.e eVarH = v13.d.h(arrayList4, do3.f.BANKING);
                if (eVarH == null) {
                    throw new IllegalStateException("Default banking identity not found for user");
                }
                String str3 = eVarH.f116395a;
                String strH = hVar2.getIndividual().getId();
                String strF = hVar2.getIndividual().getFirstName();
                String strJ = hVar2.getIndividual().getMiddleName();
                String strI = hVar2.getIndividual().getLastName();
                String strN = hVar2.getIndividual().getUsername();
                String strD = hVar2.getIndividual().getEmail();
                boolean zE = hVar2.getIndividual().getEmailVerified();
                String strK = hVar2.getIndividual().getPhone();
                List listA = hVar2.getIndividual().getBirthDate();
                if (listA != null) {
                    Intrinsics.checkNotNullParameter(listA, "<this>");
                    localDate = new LocalDate(((Number) listA.get(0)).intValue(), ((Number) listA.get(1)).intValue(), ((Number) listA.get(2)).intValue());
                } else {
                    localDate = dVar4;
                }
                Address address2 = eVarH.e;
                String strM = hVar2.getIndividual().getReferralCode();
                do3.s sVar = eVarH.d;
                do3.v vVar = eVarH.f116398g;
                Integer numL = hVar2.getIndividual().getQueuePosition();
                Boolean boolB = hVar2.getIndividual().getCanActivate();
                Long lValueOf = Long.valueOf(hVar2.getIndividual().getCreatedDate());
                do3.p pVar3 = eVarH.f;
                String str4 = eVarH.f116399h;
                Boolean boolG = hVar2.getIndividual().getHasProfilePicture();
                do3.b.Companion.getClass();
                do3.b bVar2 = do3.b.FULL;
                dng.k kVarC = hVar2.getUser();
                return new do3.n(str3, strH, strF, strJ, strI, strN, strD, zE, strK, localDate, address2, strM, sVar, vVar, numL, boolB, lValueOf, pVar3, str4, boolG, bVar2, arrayList4, vmg.d.a(kVarC != null ? kVarC.getSalariedUser() : dVar4), eVarH.f116400j, eVarH.k);
            case 17:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return iii.c.c(5);
            case 18:
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                return Optional.of(bool);
            case 19:
                Boolean bool2 = (Boolean) obj2;
                bool2.booleanValue();
                return Optional.of(bool2);
            case 20:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                List listK = zhm.v.k(new pb0("loading_1"), new pb0("loading_2"));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return listK;
            case 21:
                vd8.a it19 = (vd8.a) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return Integer.valueOf(it19.f.a());
            case 22:
                vd8.a it20 = (vd8.a) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return it20.f287814b;
            case 23:
                SavingsAccountDetails it21 = (SavingsAccountDetails) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return zh9.u0.f(new MoveMoneyDestination(new MoveMoneyInputData(new Action.AddNewScheduledPayment(hob.d.i(it21.f86460a), 2), (Set) null, 6), null));
            case 24:
                Map it22 = (Map) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return d0.d1(it22.values());
            case 25:
                do3.n profile = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(profile, "profile");
                wi0.b.Companion.getClass();
                return Boolean.valueOf(te0.w.S(profile, wi0.b.f297770q3));
            case 26:
                joi.u sectionAnimation = (joi.u) obj2;
                Intrinsics.checkNotNullParameter(sectionAnimation, "sectionAnimation");
                if (sectionAnimation.d.b()) {
                    sectionAnimation.a(true, true, false);
                } else {
                    sectionAnimation.a(true, false, true);
                }
                return Unit.f186387a;
            case 27:
                joi.u sectionAnimation2 = (joi.u) obj2;
                Intrinsics.checkNotNullParameter(sectionAnimation2, "sectionAnimation");
                sectionAnimation2.a(true, true, false);
                return Unit.f186387a;
            case 28:
                java.time.LocalDate it23 = (java.time.LocalDate) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                return it23.plusDays(1L);
            default:
                hp3.p it24 = (hp3.p) obj2;
                CorporateEventsHomeScreen.Companion aVar3 = CorporateEventsHomeScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(it24, "it");
                return Boolean.valueOf(!it24.f154429c.isEmpty());
        }
    }

    public /* synthetic */ a(hob.d dVar) {
        this.f153624a = 23;
    }
}
