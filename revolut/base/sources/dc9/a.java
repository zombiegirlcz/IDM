package dc9;

import d73.n;
import efm.d0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l93.f;
import od0.h;
import ue0.e;
import ufm.i;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f112821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f112822c;

    public /* synthetic */ a(b bVar, String str, int i) {
        this.f112820a = i;
        this.f112821b = bVar;
        this.f112822c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        switch (this.f112820a) {
            case 0:
                Boolean isGooglePayAvailable = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isGooglePayAvailable, "isGooglePayAvailable");
                if (isGooglePayAvailable.booleanValue()) {
                    b bVar = this.f112821b;
                    return new i(e.F(f.j(bVar.f112823a, null, 3), f0.f322471a), new n(new a(bVar, this.f112822c, 1), 17), 1);
                }
                od0.i.Companion.getClass();
                ufm.b bVarM = d0.m(od0.i.f224256b);
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                return bVarM;
            default:
                List cards = (List) obj2;
                Intrinsics.checkNotNullParameter(cards, "cards");
                this.f112821b.getClass();
                Iterator it8 = cards.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((h93.f0) next).f150110a, this.f112822c)) {
                        }
                    } else {
                        next = null;
                    }
                }
                h93.f0 f0Var = (h93.f0) next;
                if (f0Var != null && f0Var.J() && f0Var.w()) {
                    od0.i.Companion.getClass();
                    return h.a(f0Var);
                }
                od0.i.Companion.getClass();
                return od0.i.f224256b;
        }
    }
}
