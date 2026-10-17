package v6l;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import v6l.h0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class c0 implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f286441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f286442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f286443c;

    public /* synthetic */ c0(b1 b1Var, String str, int i) {
        this.f286441a = i;
        this.f286442b = b1Var;
        this.f286443c = str;
    }

    @Override // kfm.a
    public final void run() {
        ArrayList arrayListF1;
        switch (this.f286441a) {
            case 0:
                b1 b1Var = this.f286442b;
                String str = this.f286443c;
                synchronized (b1Var) {
                    arrayListF1 = zhm.d0.f1(b1Var.g());
                    zhm.a0.E(arrayListF1, new uo7.k(str, 27));
                    ue0.c cVar = b1Var.f286425b;
                    KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                    KType kTypeB = kotlin.jvm.internal.o0.b(u6l.j.class);
                    companion.getClass();
                    cVar.G(arrayListF1, "REVOLUT_CARDS_STORAGE_KEY", wim.z.d(kotlin.jvm.internal.o0.f186429a.d(kotlin.jvm.internal.o0.c(List.class, KTypeProjection.Companion.a(kTypeB)))));
                }
                b1Var.f286432n.k(h0.a.f286452a, b1Var.r(arrayListF1));
                return;
            default:
                b1 b1Var2 = this.f286442b;
                String cardId = this.f286443c;
                ne0.j jVar = b1Var2.f286426c;
                jVar.remove("PIN_STATUS_CACHE_KEY" + cardId);
                b1Var2.f286425b.I0("PIN_STATUS_CACHE_KEY" + cardId);
                jVar.remove("CARD_PIN_MEM_CACHE_KEY" + cardId);
                jVar.remove("CARD_PREVIOUS_PIN_MEM_CACHE_KEY" + cardId);
                t6l.b bVar = b1Var2.e;
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                xm0.a aVar = bVar.f268382a;
                String id10 = j6.a.q("pin_", cardId);
                Intrinsics.checkNotNullParameter(id10, "id");
                ue0.c cVar2 = aVar.f307066b;
                cVar2.I0(id10);
                String id11 = "previous_pin_" + cardId;
                Intrinsics.checkNotNullParameter(id11, "id");
                cVar2.I0(id11);
                return;
        }
    }
}
