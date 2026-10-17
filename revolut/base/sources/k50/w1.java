package k50;

import ap0.n;
import com.revolut.chat.ui.messageslist.MessagesScreen;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class w1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181267a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ koi.h f181268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessagesScreen f181269c;

    public /* synthetic */ w1(MessagesScreen messagesScreen, koi.h hVar) {
        this.f181269c = messagesScreen;
        this.f181268b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean z;
        int i = this.f181267a;
        MessagesScreen messagesScreen = this.f181269c;
        koi.h hVar = this.f181268b;
        List items = (List) obj2;
        switch (i) {
            case 0:
                MessagesScreen.Companion aVar = MessagesScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(items, "sufficientlyVisibleItems");
                if (!items.isEmpty()) {
                    j4 j4Var = (j4) messagesScreen.R2();
                    cli.y yVar = j4Var.f181140w0;
                    Intrinsics.checkNotNullParameter(items, "items");
                    j4Var.f181138v0 = items;
                    v20.n nVarX2 = j4Var.X2();
                    if (nVarX2 != null) {
                        UUID id10 = nVarX2.getId();
                        l1 l1Var = ((h0) ((vkm.j2) yVar.f22677a).getValue()).f181089q;
                        if (l1Var != null && l1Var.f181164a != 0) {
                            j4Var.H2(yVar, new be7.l(6, id10));
                        }
                    }
                    koi.j jVar = (koi.j) zhm.d0.o0(items);
                    if (jVar != null) {
                        String f55860a = jVar.getF52987a();
                        koi.j jVar2 = (koi.j) zhm.d0.o0(hVar.b());
                        messagesScreen.p0 = Intrinsics.f(f55860a, jVar2 != null ? jVar2.getF52987a() : null);
                    }
                }
                break;
            default:
                MessagesScreen.Companion aVar2 = MessagesScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(items, "items");
                if (zhm.d0.o0(hVar.b()) instanceof ap0.h) {
                    List list = items;
                    if ((list instanceof Collection) && list.isEmpty()) {
                        z = false;
                    } else {
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            if (((koi.j) it8.next()) instanceof ap0.h) {
                                z = true;
                            }
                        }
                        z = false;
                    }
                    if (z) {
                        j4 j4Var2 = (j4) messagesScreen.R2();
                        List list2 = ((h0) ((vkm.j2) j4Var2.f181140w0.f22677a).getValue()).f181090r.f181031a;
                        if (list2 == null) {
                            list2 = zhm.f0.f322471a;
                        }
                        j4Var2.x3(list2);
                    }
                    if (!z && !messagesScreen.f51190t0) {
                        messagesScreen.f51190t0 = true;
                        ap0.j jVarE3 = messagesScreen.e3();
                        if (jVarE3 != null) {
                            ap0.n nVarF = jVarE3.F();
                            n.a aVar3 = ap0.n.Companion;
                            nVarF.c(null);
                        }
                    } else if (z && messagesScreen.f51190t0) {
                        ap0.j jVarE32 = messagesScreen.e3();
                        if (jVarE32 != null) {
                            jVarE32.F().d();
                        }
                        messagesScreen.f51190t0 = false;
                    }
                }
                break;
        }
        return Unit.f186387a;
    }

    public /* synthetic */ w1(koi.h hVar, MessagesScreen messagesScreen) {
        this.f181268b = hVar;
        this.f181269c = messagesScreen;
    }
}
