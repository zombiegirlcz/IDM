package k50;

import com.revolut.chat.ui.ratechatexpression.ChatRatingShotDelegate$ChatRatingShotParcel;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.data.model.Data;
import ip0.yc0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c3 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j4 f181043w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c3(int i, j4 j4Var, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f181043w = j4Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c3 c3Var = new c3(0, this.f181043w, continuation);
                c3Var.v = obj2;
                return c3Var;
            case 1:
                c3 c3Var2 = new c3(1, this.f181043w, continuation);
                c3Var2.v = obj2;
                return c3Var2;
            case 2:
                c3 c3Var3 = new c3(2, this.f181043w, continuation);
                c3Var3.v = obj2;
                return c3Var3;
            case 3:
                c3 c3Var4 = new c3(3, this.f181043w, continuation);
                c3Var4.v = obj2;
                return c3Var4;
            case 4:
                c3 c3Var5 = new c3(4, this.f181043w, continuation);
                c3Var5.v = obj2;
                return c3Var5;
            case 5:
                c3 c3Var6 = new c3(5, this.f181043w, continuation);
                c3Var6.v = obj2;
                return c3Var6;
            case 6:
                c3 c3Var7 = new c3(6, this.f181043w, continuation);
                c3Var7.v = obj2;
                return c3Var7;
            case 7:
                c3 c3Var8 = new c3(7, this.f181043w, continuation);
                c3Var8.v = obj2;
                return c3Var8;
            case 8:
                c3 c3Var9 = new c3(8, this.f181043w, continuation);
                c3Var9.v = obj2;
                return c3Var9;
            case 9:
                c3 c3Var10 = new c3(9, this.f181043w, continuation);
                c3Var10.v = obj2;
                return c3Var10;
            case 10:
                c3 c3Var11 = new c3(10, this.f181043w, continuation);
                c3Var11.v = obj2;
                return c3Var11;
            case 11:
                c3 c3Var12 = new c3(11, this.f181043w, continuation);
                c3Var12.v = obj2;
                return c3Var12;
            default:
                c3 c3Var13 = new c3(12, this.f181043w, continuation);
                c3Var13.v = obj2;
                return c3Var13;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c3) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c3) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((c3) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((c3) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((c3) create((ChatRatingShotDelegate$ChatRatingShotParcel) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((c3) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((c3) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((c3) create((f1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((c3) create((oo0.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((c3) create((Map) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((c3) create((PopupMenuItem) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((c3) create((v20.l1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c3) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Unit unit;
        int i = this.u;
        int i2 = 2;
        Continuation continuation = null;
        j4 j4Var = this.f181043w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j4Var.H2(j4Var.f181140w0, new jxi.e0(data, 16));
                return Unit.f186387a;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j4Var.H2(j4Var.f181140w0, new jxi.e0(data2, 17));
                return Unit.f186387a;
            case 2:
                Data data3 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j4Var.H2(j4Var.f181140w0, new jxi.e0(data3, 18));
                return Unit.f186387a;
            case 3:
                Data data4 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j4Var.H2(j4Var.f181140w0, new jxi.e0(data4, 19));
                return Unit.f186387a;
            case 4:
                ChatRatingShotDelegate$ChatRatingShotParcel chatRatingShotDelegate$ChatRatingShotParcel = (ChatRatingShotDelegate$ChatRatingShotParcel) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                UUID uuid = chatRatingShotDelegate$ChatRatingShotParcel.f51196a;
                int i3 = chatRatingShotDelegate$ChatRatingShotParcel.f51197b;
                z30.j jVar = (z30.j) ((h0) ((vkm.j2) j4Var.f181140w0.f22677a).getValue()).f.f285780b.getContent();
                if (jVar != null) {
                    j4Var.w3(uuid, new t50.h(uuid, jVar, false, new Integer(i3)), true);
                }
                return Unit.f186387a;
            case 5:
                Data data5 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cli.y yVar = j4Var.f181140w0;
                j4Var.H2(yVar, new f3(data5, j4Var));
                j4Var.H2(yVar, new n2((v30.j) data5.getContent(), 0));
                v30.j jVar2 = (v30.j) data5.getContent();
                if (jVar2 != null && !data5.getLoading()) {
                    j4.Q2(j4Var, jVar2);
                }
                j4Var.z3();
                return Unit.f186387a;
            case 6:
                Data data6 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q50.o oVar = j4Var.f181123b0;
                try {
                    Object content = data6.getContent();
                    if (content != null) {
                        oVar.Z2();
                        j4Var.H2(j4Var.f181140w0, new j2(j4Var, (List) content, 2));
                        oVar.i3();
                        unit = Unit.f186387a;
                    } else {
                        unit = null;
                    }
                    new Data(unit, data6.getError(), data6.getLoading());
                    break;
                } catch (Throwable th10) {
                    new Data(null, th10, data6.getLoading());
                }
                return Unit.f186387a;
            case 7:
                f1 f1Var = (f1) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j4Var.H2(j4Var.f181140w0, new k0d.c(f1Var, 26));
                return Unit.f186387a;
            case 8:
                oo0.g gVar = (oo0.g) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List listC = zhm.u.c(new v20.u0(gVar.f226977a, null));
                oo0.m mVar = gVar.f226978b;
                j4.t3(j4Var, listC, new v20.t0(new v20.t2(mVar.f226990a, mVar.f226991b), null, 62), null, 4);
                return Unit.f186387a;
            case 9:
                Map map = (Map) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j4Var.H2(j4Var.f181140w0, new aqd.o1(map, 10));
                return Unit.f186387a;
            case 10:
                PopupMenuItem popupMenuItem = (PopupMenuItem) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Object f55256g = popupMenuItem.getF55191g();
                Intrinsics.i(f55256g, "null cannot be cast to non-null type com.revolut.chat.ui.messageslist.ChatMenuItem");
                u uVar = (u) f55256g;
                if (uVar instanceof s) {
                    j4Var.p3(((s) uVar).f181226a, popupMenuItem.getF55277b());
                } else {
                    if (!(uVar instanceof t)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j4Var.l3(((t) uVar).f181244a, popupMenuItem.getF55277b(), null);
                }
                return Unit.f186387a;
            case 11:
                v20.l1 l1Var = (v20.l1) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.h(l1Var);
                j4 j4Var2 = this.f181043w;
                cli.y yVar2 = j4Var2.f181140w0;
                UUID uuid2 = ((h0) ((vkm.j2) yVar2.f22677a).getValue()).f181079a;
                if (uuid2 != null) {
                    v20.l2 status = l1Var.getStatus();
                    int i5 = 6;
                    if (Intrinsics.f(status, v20.e2.f285372a) || Intrinsics.f(status, v20.f2.f285402a) || Intrinsics.f(status, v20.s1.f285560a)) {
                        j4Var2.n2(new m3(j4Var2, uuid2, continuation, i5), new yc0(1, j4Var2, j4.class, "showErrorAndCloseScreen", "showErrorAndCloseScreen(Ljava/lang/Throwable;)Z", 0, 27));
                    } else if (Intrinsics.f(status, v20.v1.f285582a) || Intrinsics.f(status, v20.w1.f285592a) || Intrinsics.f(status, v20.m1.f285470a)) {
                        j4Var2.n2(new m3(j4Var2, uuid2, continuation, i2), new whi.b(6));
                    } else if (status instanceof v20.u1) {
                        List list = ((h0) ((vkm.j2) yVar2.f22677a).getValue()).d.f181178a;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : list) {
                            if (!Intrinsics.f(((v20.n) obj3).getServerId(), ((v20.u1) status).f285578a)) {
                                arrayList.add(obj3);
                            }
                        }
                        j4Var2.H2(yVar2, new jeg.i(3, arrayList));
                    }
                }
                return Unit.f186387a;
            default:
                List list2 = (List) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j4.I2(j4Var, list2);
                return Unit.f186387a;
        }
    }
}
