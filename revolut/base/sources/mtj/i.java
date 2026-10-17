package mtj;

import aw0.n6;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.domain.interactors.experiments.ExperimentsFetchingInteractor$ExperimentType;
import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$Step;
import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.pricingplans.models.PricingPlanOffer;
import com.revolut.feature.separate_favourites.impl.watchlist.ui.quick_actions.WatchlistQuickActionsPresenterDelegate$QuickActionParcel;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.feature.subaccount.impl.network.SubaccountLinkService;
import com.revolut.feature.transfer.models.transfer.TransferTrustData;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import jid.z;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import m1c.v0;
import n30.p0;
import n4d.r0;
import n7i.s;
import nfj.j0;
import nfj.s2;
import nfj.z1;
import no.i1;
import nvg.b0;
import o9k.t0;
import org.jmrtd.lds.LDSFile;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f208878w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f208879x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f208880y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f208879x = obj2;
        this.f208880y = obj3;
        this.f208878w = obj4;
        this.z = obj5;
    }

    private final Object b(Object obj2) {
        List listC;
        int i;
        int i2;
        char c2;
        nw5.i iVar = (nw5.i) this.f208880y;
        int i3 = this.v;
        String str = (String) this.f208878w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ArrayList arrayList = (ArrayList) this.f208879x;
        List<Pair> listP0 = d0.P0(arrayList, new nw5.e());
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : listP0) {
            xi0.b bVar = cp5.d.z((xi0.b) pair.f186385a) ? (xi0.b) pair.f186385a : null;
            if (bVar != null) {
                arrayList2.add(bVar);
            }
        }
        int i5 = 10;
        ArrayList arrayList3 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList3.add((xi0.b) ((Pair) it8.next()).f186385a);
        }
        List listP02 = d0.P0(arrayList3, new k2j.d(new k2j.d(new bm8.a(new nw5.d(), (String) this.z, 20), 22), 21));
        if (str.length() > 0 && i3 > 0) {
            return f0.f322471a;
        }
        if (str.length() <= 0) {
            xi0.b bVar2 = (xi0.b) d0.e0(i3, listP02);
            if (bVar2 == null || (listC = u.c(bVar2)) == null) {
                listC = f0.f322471a;
            }
            return nw5.i.a(iVar, arrayList2, listC);
        }
        iVar.getClass();
        String string = kotlin.text.d0.F0(str).toString();
        int i6 = 0;
        char c3 = zsc.p.SPACE_CHAR;
        List listM0 = kotlin.text.d0.m0(string, new char[]{zsc.p.SPACE_CHAR}, 6);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList2) {
            xi0.b bVar3 = (xi0.b) obj3;
            List<String> list = listM0;
            if ((list instanceof Collection) && list.isEmpty()) {
                i2 = i6;
                c2 = c3;
            } else {
                for (String str2 : list) {
                    i2 = i6;
                    String strB = nw5.i.b(bVar3);
                    c2 = c3;
                    String str3 = bVar3.f306286a;
                    if (kotlin.text.d0.J(str3, str2, true) || kotlin.text.d0.J(strB, str2, true) || kotlin.text.d0.J(str2, str3, true) || kotlin.text.d0.J(str2, strB, true)) {
                        arrayList4.add(obj3);
                        break;
                    }
                    i6 = i2;
                    c3 = c2;
                }
                i2 = i6;
                c2 = c3;
            }
            i6 = i2;
            c3 = c2;
        }
        int i21 = i6;
        char c5 = c3;
        ArrayList arrayListA = nw5.i.a(iVar, arrayList4, listP02);
        String string2 = kotlin.text.d0.F0(str).toString();
        if (string2.length() == 0) {
            return f0.f322471a;
        }
        char[] cArr = new char[1];
        cArr[i21] = c5;
        List listM02 = kotlin.text.d0.m0(string2, cArr, 6);
        ArrayList<String> arrayList5 = new ArrayList();
        for (Object obj4 : listM02) {
            if (!Intrinsics.f((String) obj4, "")) {
                arrayList5.add(obj4);
            }
        }
        ArrayList arrayList6 = new ArrayList(w.t(arrayListA, 10));
        Iterator it9 = arrayListA.iterator();
        while (true) {
            if (!it9.hasNext()) {
                break;
            }
            Pair pair2 = (Pair) it9.next();
            xi0.b bVar4 = (xi0.b) pair2.f186385a;
            xi0.b bVar5 = (xi0.b) pair2.f186386b;
            String strK = cp5.d.K(bVar4);
            String strB2 = nw5.i.b(bVar4);
            String strK2 = cp5.d.K(bVar5);
            String strB3 = nw5.i.b(bVar5);
            int i22 = 5;
            if (arrayList5.size() == 1) {
                i = kotlin.text.d0.J(strK, string2, true) ? strK.length() == string2.length() ? 50 : 5 : kotlin.text.d0.J(strK2, string2, true) ? strK2.length() == string2.length() ? 25 : 4 : i21;
                String strR = a0.d.r(strK, strK2);
                String strR2 = a0.d.r(strK2, strK);
                if (a0.H(strR, string2, true)) {
                    i += strR.length() != string2.length() ? 5 : 100;
                } else if (a0.H(strR2, string2, true)) {
                    i += strR2.length() == string2.length() ? 50 : 4;
                }
                if (i < 50) {
                    if (kotlin.text.d0.J(strB2, string2, true)) {
                        i += strB2.length() == string2.length() ? 30 : 3;
                    } else if (kotlin.text.d0.J(strB3, string2, true)) {
                        i += strB3.length() == string2.length() ? 15 : 2;
                    }
                }
            } else {
                if (a0.H(string2, strK, true)) {
                    i22 = a0.y(string2, strK2, true) ? LDSFile.EF_DG14_TAG : i5;
                } else if (!a0.H(string2, strK2, true)) {
                    i22 = i21;
                } else if (a0.y(string2, strK, true)) {
                    i22 = 55;
                }
                i = i22;
                for (String str4 : arrayList5) {
                    if (kotlin.text.d0.J(strK, str4, true)) {
                        i += str4.length() == strK.length() ? 4 : 2;
                    }
                    if (kotlin.text.d0.J(strB2, str4, true)) {
                        i += str4.length() == strB2.length() ? 4 : 2;
                    }
                    if (kotlin.text.d0.J(strK2, str4, true)) {
                        i += str4.length() == strK2.length() ? 3 : 1;
                    }
                    if (kotlin.text.d0.J(strB3, str4, true)) {
                        i += str4.length() == strB3.length() ? 3 : 1;
                    }
                }
            }
            arrayList6.add(new nw5.c(i, pair2));
            i5 = 10;
        }
        ArrayList arrayList7 = new ArrayList();
        for (Object obj5 : arrayList6) {
            if (((nw5.c) obj5).f219774a > 0) {
                arrayList7.add(obj5);
            }
        }
        List listP03 = d0.P0(arrayList7, new k2j.d(new nw5.h(), 23));
        nw5.c cVar = (nw5.c) d0.d0(listP03);
        if (cVar == null) {
            return f0.f322471a;
        }
        if (cVar.f219774a <= 100) {
            List list2 = listP03;
            ArrayList arrayList8 = new ArrayList(w.t(list2, 10));
            Iterator it10 = list2.iterator();
            while (it10.hasNext()) {
                arrayList8.add(((nw5.c) it10.next()).f219775b);
            }
            return arrayList8;
        }
        ArrayList arrayList9 = new ArrayList();
        for (Object obj6 : listP03) {
            if (((nw5.c) obj6).f219774a >= 50) {
                arrayList9.add(obj6);
            }
        }
        ArrayList arrayList10 = new ArrayList(w.t(arrayList9, 10));
        Iterator it11 = arrayList9.iterator();
        while (it11.hasNext()) {
            arrayList10.add(((nw5.c) it11.next()).f219775b);
        }
        return arrayList10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009f, code lost:
    
        if (r1.emit((nx1.y) r0, r7) == r2) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r8) throws nx1.l, nx1.j {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f208878w
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r7.f208880y
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r7.v
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L2f
            if (r3 == r5) goto L27
            if (r3 != r4) goto L1f
            java.lang.Object r0 = r7.f208879x
            nx1.u r0 = (nx1.u) r0
            nx1.y r0 = (nx1.y) r0
            yhm.o.b(r8)
            goto La2
        L1f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L27:
            java.lang.Object r3 = r7.f208879x
            nx1.u r3 = (nx1.u) r3
            yhm.o.b(r8)
            goto L4a
        L2f:
            yhm.o.b(r8)
            java.lang.Object r8 = r7.z
            r3 = r8
            nx1.u r3 = (nx1.u) r3
            com.revolut.feature.apm.core.contacts.data.network.ApmContactsDiscoveryService r8 = r3.f220084a
            r7.f208880y = r1
            r7.f208879x = r3
            r7.v = r5
            com.revolut.feature.apm.core.contacts.data.network.ApmContactsDiscoveryService$a r5 = com.revolut.feature.apm.core.contacts.data.network.ApmContactsDiscoveryService.INSTANCE
            java.lang.String r5 = "true"
            java.lang.Object r8 = r8.getContactsByJobId(r0, r5, r7)
            if (r8 != r2) goto L4a
            goto La1
        L4a:
            retrofit2.Response r8 = (retrofit2.Response) r8
            r3.getClass()
            int r3 = r8.code()
            java.lang.Object r5 = r8.body()
            qx1.d r5 = (qx1.d) r5
            r6 = 200(0xc8, float:2.8E-43)
            if (r3 != r6) goto L69
            if (r5 == 0) goto L69
            nx1.e r8 = uc0.b.y(r5)
            nx1.y r0 = new nx1.y
            r0.<init>(r8)
            goto L85
        L69:
            r5 = 202(0xca, float:2.83E-43)
            if (r3 == r5) goto L7f
            r5 = 404(0x194, float:5.66E-43)
            if (r3 != r5) goto L72
            goto L7f
        L72:
            r0 = 410(0x19a, float:5.75E-43)
            if (r3 != r0) goto L79
            nx1.x r0 = nx1.x.f220091a
            goto L85
        L79:
            retrofit2.HttpException r0 = new retrofit2.HttpException
            r0.<init>(r8)
            throw r0
        L7f:
            nx1.w r8 = new nx1.w
            r8.<init>(r0)
            r0 = r8
        L85:
            boolean r8 = r0 instanceof nx1.w
            if (r8 != 0) goto Lb1
            boolean r8 = r0 instanceof nx1.x
            if (r8 != 0) goto Lab
            boolean r8 = r0 instanceof nx1.y
            if (r8 == 0) goto La5
            nx1.y r0 = (nx1.y) r0
            r8 = 0
            r7.f208880y = r8
            r7.f208879x = r8
            r7.v = r4
            java.lang.Object r8 = r1.emit(r0, r7)
            if (r8 != r2) goto La2
        La1:
            return r2
        La2:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        La5:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        Lab:
            nx1.j r8 = new nx1.j
            r8.<init>()
            throw r8
        Lb1:
            nx1.l r8 = new nx1.l
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: mtj.i.c(java.lang.Object):java.lang.Object");
    }

    private final Object n(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        com.revolut.feature.card_design.impl.card_design.d dVar = (com.revolut.feature.card_design.impl.card_design.d) this.f208879x;
        jld.h hVar = new jld.h(16, dVar, (e93.d) this.f208880y, (pi3.h) this.f208878w, (hha.d) this.z, null);
        this.v = 1;
        Object objP2 = dVar.p2(this, hVar);
        return objP2 == aVar ? aVar : objP2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0097, code lost:
    
        if (r1.emit(r13, r19) == r8) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00df, code lost:
    
        if (r1.emit(r2, r19) != r8) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf A[PHI: r2 r6
      0x00cf: PHI (r2v14 java.lang.Object) = (r2v13 java.lang.Object), (r2v19 java.lang.Object) binds: [B:36:0x00cc, B:11:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x00cf: PHI (r6v2 ??) = (r6v4 ??), (r6v3 ??) binds: [B:36:0x00cc, B:11:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mtj.i.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    private final Object p(Object obj2) {
        Pair item = (Pair) this.z;
        FavouritesAssetTypeKey typeKey = (FavouritesAssetTypeKey) this.f208878w;
        o3d.e eVar = (o3d.e) this.f208880y;
        p3d.c cVar = (p3d.c) this.f208879x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            Continuation continuation = null;
            if (cVar.f232739a) {
                int i2 = cVar.f232740b;
                ghd.a aVar2 = eVar.f221797q;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(typeKey, "typeKey");
                n3d.d dVar = (n3d.d) aVar2.f143903a;
                Intrinsics.checkNotNullParameter(typeKey, "key");
                x3d.f fVar = (x3d.f) dVar.f211984a.get(typeKey);
                if (fVar == null) {
                    throw new IllegalStateException(j6.a.q("provide mapper for key = ", typeKey.f86866a));
                }
                ogd.j jVarB = fVar.b(i2);
                eVar.N2(new ActionsBottomSheetController(new dii.a(new lw0.a(jVarB.f225120a, jVarB.f225121b, null, null, false, 28), new aw0.h(false, new n6(new TextLocalisedClause(R$string.shared_watchlist_limit_reached_dialog_button_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.shared_watchlist_limit_reached_dialog_button_open_watchlist, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121), jVarB.f225122c, null, null, 24)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new b0(eVar, typeKey, 25));
                return Unit.f186387a;
            }
            z zVar = eVar.f221793l;
            zVar.getClass();
            Intrinsics.checkNotNullParameter(typeKey, "typeKey");
            Intrinsics.checkNotNullParameter(item, "item");
            pfm.h hVarN = pd.b.n(kotlin.coroutines.g.f186406a, new p3d.a(zVar, typeKey, item, continuation, 0));
            this.f208879x = null;
            this.v = 1;
            if (nim.a.a(hVarN, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        n3d.e eVar2 = eVar.f221795n;
        eVar2.getClass();
        Intrinsics.checkNotNullParameter(typeKey, "typeKey");
        Intrinsics.checkNotNullParameter(item, "item");
        eVar.i3(new mii.k("SHOT_ID_ADDED_TO_WATCHLIST", eVar2.f211985a, eVar2.f211986b, new WatchlistQuickActionsPresenterDelegate$QuickActionParcel.ItemDeletionAddition(typeKey, item), null, 16));
        return Unit.f186387a;
    }

    private final Object s(Object obj2) {
        o6e.a aVar;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            o6e.a aVar3 = (o6e.a) this.f208880y;
            SubaccountLinkService subaccountLinkService = aVar3.f222569a;
            String str = (String) this.f208878w;
            String str2 = (String) this.z;
            this.f208879x = aVar3;
            this.v = 1;
            Object foreignSubaccountDescription = subaccountLinkService.getForeignSubaccountDescription(str, str2, this);
            if (foreignSubaccountDescription == aVar2) {
                return aVar2;
            }
            aVar = aVar3;
            obj2 = foreignSubaccountDescription;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (o6e.a) this.f208879x;
            yhm.o.b(obj2);
        }
        w6e.i iVar = (w6e.i) obj2;
        aVar.getClass();
        String str3 = iVar.f295427a;
        String str4 = iVar.f295428b;
        String str5 = iVar.f295429c;
        String str6 = iVar.d;
        wi0.a aVar4 = wi0.b.Companion;
        String str7 = iVar.e;
        aVar4.getClass();
        wi0.b bVarA = wi0.a.a(str7);
        String str8 = iVar.f;
        String str9 = iVar.f295430g;
        xi0.a aVar5 = xi0.b.Companion;
        String str10 = iVar.f295431h;
        aVar5.getClass();
        return new h6e.e(str3, str4, str5, str6, bVarA, str8, str9, xi0.a.a(str10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x015b, code lost:
    
        if (r15.deleteRecurringPayments(r0, r1, r14) == r3) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v7, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object t(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mtj.i.t(java.lang.Object):java.lang.Object");
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i((q) this.f208880y, (String) this.f208878w, (String) this.z, continuation, 0);
            case 1:
                return new i(1, (UUID) this.f208879x, (p0) this.f208880y, (String) this.f208878w, (UUID) this.z, continuation);
            case 2:
                return new i((String) this.f208878w, (FavouritesAssetTypeKey) this.f208879x, (Pair) this.f208880y, (n4d.m) this.z, continuation);
            case 3:
                return new i((n4d.m) this.f208879x, (String) this.f208878w, (ArrayList) this.f208880y, (String) this.z, continuation, 3);
            case 4:
                return new i(4, (n4d.m) this.f208879x, (ogd.k) this.f208880y, (String) this.f208878w, (String) this.z, continuation);
            case 5:
                i iVar = new i((String) this.f208878w, (r0) this.f208880y, (String) this.z, continuation);
                iVar.f208879x = obj2;
                return iVar;
            case 6:
                return new i(6, (s) this.f208879x, (CreditCard) this.f208880y, (AccountWrapper) this.f208878w, (x5i.d) this.z, continuation);
            case 7:
                return new i(7, (s) this.f208879x, (pcd.s) this.f208880y, (AccountWrapper) this.f208878w, (x5i.d) this.z, continuation);
            case 8:
                i iVar2 = new i((n97.g) this.f208878w, (n97.k) this.z, continuation, 8);
                iVar2.f208880y = obj2;
                return iVar2;
            case 9:
                i iVar3 = new i((FlowCollector) this.f208880y, (n97.g) this.f208878w, (n97.k) this.z, continuation, 9);
                iVar3.f208879x = obj2;
                return iVar3;
            case 10:
                i iVar4 = new i((a97.g) this.f208880y, (n97.k) this.z, (String) this.f208878w, continuation);
                iVar4.f208879x = obj2;
                return iVar4;
            case 11:
                i iVar5 = new i((nfj.f0) this.f208880y, (String) this.f208878w, (String) this.z, continuation, 11);
                iVar5.f208879x = obj2;
                return iVar5;
            case 12:
                return new i((j0) this.f208880y, (String) this.f208878w, (Set) this.z, continuation, 12);
            case 13:
                i iVar6 = new i(13, (z1) this.z, (String) this.f208878w, continuation);
                iVar6.f208880y = obj2;
                return iVar6;
            case 14:
                return new i((s2) this.f208880y, (String) this.f208878w, (String) this.z, continuation, 14);
            case 15:
                return new i(15, (com.revolut.feature.credit.application.plugins.impl.ui.plan_selection.a) this.f208879x, (hha.d) this.f208880y, (hha.i) this.f208878w, (PricingPlanOffer) this.z, continuation);
            case 16:
                i iVar7 = new i((nj3.b) this.f208880y, (hj3.b) this.f208878w, (fj3.f) this.z, continuation, 16);
                iVar7.f208879x = obj2;
                return iVar7;
            case 17:
                return new i((i1) this.f208878w, (ExperimentsFetchingInteractor$ExperimentType) this.z, continuation, 17);
            case 18:
                i iVar8 = new i((nsh.o) this.f208880y, (WidgetContext) this.f208878w, (List) this.z, continuation, 18);
                iVar8.f208879x = obj2;
                return iVar8;
            case 19:
                return new i(19, (com.revolut.feature.payments.groups.impl.ui_new.group_creation.b) this.f208879x, (nt9.g) this.f208880y, (Image) this.f208878w, (xi0.b) this.z, continuation);
            case 20:
                return new i((ArrayList) this.f208879x, (String) this.f208878w, this.v, (nw5.i) this.f208880y, (String) this.z, continuation);
            case 21:
                i iVar9 = new i((nx1.u) this.f208880y, (n02.b) this.f208878w, (ApmDescriptor) this.z, continuation, 21);
                iVar9.f208879x = obj2;
                return iVar9;
            case 22:
                i iVar10 = new i(22, (nx1.u) this.z, (String) this.f208878w, continuation);
                iVar10.f208880y = obj2;
                return iVar10;
            case 23:
                return new i(23, (com.revolut.feature.card_design.impl.card_design.d) this.f208879x, (l10.s) this.f208880y, (yki.l) this.f208878w, (CardDesignFlowContract$Step) this.z, continuation);
            case 24:
                return new i(24, (com.revolut.feature.card_design.impl.card_design.d) this.f208879x, (e93.d) this.f208880y, (pi3.h) this.f208878w, (hha.d) this.z, continuation);
            case 25:
                i iVar11 = new i((nxb.e) this.f208880y, (v0) this.z, continuation);
                iVar11.f208879x = obj2;
                return iVar11;
            case 26:
                i iVar12 = new i((o3d.e) this.f208880y, (FavouritesAssetTypeKey) this.f208878w, (Pair) this.z, continuation, 26);
                iVar12.f208879x = obj2;
                return iVar12;
            case 27:
                return new i((o6e.a) this.f208880y, (String) this.f208878w, (String) this.z, continuation, 27);
            case 28:
                return new i((Subaccount) this.f208880y, (List) this.f208878w, (o6e.b) this.z, continuation, 28);
            default:
                return new i((t0) this.f208879x, (String) this.f208878w, (iy9.d) this.f208880y, (TransferTrustData) this.z, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:344:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x084c  */
    /* JADX WARN: Removed duplicated region for block: B:527:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v12, types: [com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortOutCredentials] */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mtj.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i, Object obj2, String str, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.z = obj2;
        this.f208878w = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(a97.g gVar, n97.k kVar, String str, Continuation continuation) {
        super(2, continuation);
        this.u = 10;
        this.f208880y = gVar;
        this.z = kVar;
        this.f208878w = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f208880y = obj2;
        this.f208878w = obj3;
        this.z = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f208878w = obj2;
        this.z = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj2, String str, Serializable serializable, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f208879x = obj2;
        this.f208878w = str;
        this.f208880y = serializable;
        this.z = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, FavouritesAssetTypeKey favouritesAssetTypeKey, Pair pair, n4d.m mVar, Continuation continuation) {
        super(2, continuation);
        this.u = 2;
        this.f208878w = str;
        this.f208879x = favouritesAssetTypeKey;
        this.f208880y = pair;
        this.z = mVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, r0 r0Var, String str2, Continuation continuation) {
        super(2, continuation);
        this.u = 5;
        this.f208878w = str;
        this.f208880y = r0Var;
        this.z = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ArrayList arrayList, String str, int i, nw5.i iVar, String str2, Continuation continuation) {
        super(2, continuation);
        this.u = 20;
        this.f208879x = arrayList;
        this.f208878w = str;
        this.v = i;
        this.f208880y = iVar;
        this.z = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(nxb.e eVar, v0 v0Var, Continuation continuation) {
        super(2, continuation);
        this.u = 25;
        this.f208880y = eVar;
        this.z = v0Var;
    }
}
