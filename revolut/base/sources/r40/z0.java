package r40;

import android.os.Parcelable;
import com.revolut.chat_core.R$string;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class z0 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f251385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c1 f251386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f251387c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ z0(c1 c1Var, a aVar, boolean z, int i) {
        this.f251385a = i;
        this.f251386b = c1Var;
        this.f251387c = aVar;
        this.d = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        List listD;
        switch (this.f251385a) {
            case 0:
                List activeChats = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(activeChats, "activeChats");
                if (activeChats.isEmpty()) {
                    return zhm.f0.f322471a;
                }
                aim.e eVarB = zhm.u.b();
                ArrayList arrayList = new ArrayList();
                Iterator it8 = activeChats.iterator();
                while (true) {
                    boolean zHasNext = it8.hasNext();
                    boolean z = this.d;
                    if (!zHasNext) {
                        if (!z) {
                            yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                        }
                        eVarB.addAll(arrayList);
                        if (!eVarB.isEmpty()) {
                            eVarB.add(0, new ListSubheaderDelegate.Model("LIST_ID_SECTION_TITLE_ACTIVE", (Image) null, (Clause) new TextLocalisedClause(R$string.chat_ticket_active_status, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
                        }
                        return zhm.u.a(eVarB);
                    }
                    u40.d dVar = (u40.d) it8.next();
                    boolean z3 = dVar instanceof u40.b;
                    c1 c1Var = this.f251386b;
                    if (z3) {
                        listD = zhm.u.c(c1Var.b((u40.b) dVar));
                    } else if (dVar instanceof u40.a) {
                        listD = c1Var.d.f(((u40.a) dVar).f276956a);
                    } else {
                        if (!(dVar instanceof u40.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        listD = c1Var.d((u40.c) dVar, this.f251387c, z);
                    }
                    List list = listD;
                    if (z) {
                        yp0.b.k(list, 0, 0, 0, 0, 31);
                    }
                    zhm.a0.x(list, arrayList);
                }
                break;
            case 1:
                List resolvedChats = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(resolvedChats, "resolvedChats");
                if (resolvedChats.isEmpty()) {
                    return zhm.f0.f322471a;
                }
                ArrayList arrayList2 = new ArrayList();
                c1 c1Var2 = this.f251386b;
                a aVar = this.f251387c;
                boolean z4 = this.d;
                ArrayList arrayListC = c1Var2.c(resolvedChats, aVar, z4);
                if (aVar.f251319a.f251338c) {
                    pb0 pb0VarB = nb0.b(pb0.Companion, "LIST_ID_PROGRESS_RESOLVED", false, 0, false, 30);
                    if (z4) {
                        yp0.b.l(pb0VarB, 0, 0, 0, 0, null, false, 63);
                    }
                    arrayListC.add(pb0VarB);
                }
                if (!arrayListC.isEmpty()) {
                    arrayList2.add(new ListSubheaderDelegate.Model("LIST_ID_SECTION_TITLE_RESOLVED", (Image) null, (Clause) new TextLocalisedClause(R$string.chat_list_section_resolved, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
                    if (!z4) {
                        yp0.b.k(arrayListC, 0, 0, 0, 0, 31);
                    }
                    arrayList2.addAll(arrayListC);
                }
                return arrayList2;
            default:
                List resolvedChats2 = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(resolvedChats2, "resolvedChats");
                if (resolvedChats2.isEmpty()) {
                    return zhm.f0.f322471a;
                }
                c1 c1Var3 = this.f251386b;
                a aVar2 = this.f251387c;
                boolean z6 = this.d;
                ArrayList arrayListC2 = c1Var3.c(resolvedChats2, aVar2, z6);
                if (aVar2.f251319a.f251338c) {
                    pb0 pb0VarB2 = nb0.b(pb0.Companion, "LIST_ID_PROGRESS_RESOLVED", false, 0, false, 30);
                    if (z6) {
                        yp0.b.l(pb0VarB2, 0, 0, 0, 0, null, false, 63);
                    }
                    arrayListC2.add(pb0VarB2);
                }
                if (!z6) {
                    yp0.b.k(arrayListC2, 0, 0, 0, 0, 31);
                }
                return arrayListC2;
        }
    }

    public /* synthetic */ z0(boolean z, c1 c1Var, a aVar) {
        this.f251385a = 0;
        this.d = z;
        this.f251386b = c1Var;
        this.f251387c = aVar;
    }
}
