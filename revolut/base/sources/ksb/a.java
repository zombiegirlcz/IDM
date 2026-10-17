package ksb;

import ax4.j;
import com.revolut.core.ui_kit.internal.views.quiz.QuizView;
import com.revolut.feature.credit.card.impl.ui.topup.CreditCardTopupScreen;
import efm.h0;
import g48.h;
import k7c.n;
import kfm.o;
import kfm.p;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kx4.r0;
import zp0.x;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements o, kfm.c, kfm.g, p, x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f189397b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f189396a = i;
        this.f189397b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        int i = this.f189396a;
        Object obj3 = this.f189397b;
        switch (i) {
            case 5:
                int i2 = QuizView.k;
                ((ku0.f) obj3).invoke(obj2);
                break;
            case 6:
                int i3 = QuizView.k;
                ((ku0.f) obj3).invoke(obj2);
                break;
            case 7:
                int i5 = QuizView.k;
                ((k65.d) obj3).invoke(obj2);
                break;
            default:
                ((kv7.g) obj3).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f189396a;
        Object obj2 = this.f189397b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 3:
            case 5:
            case 6:
            case 7:
            case 10:
            case 17:
            case 18:
            case 25:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 8:
                break;
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 15:
                KProperty[] kPropertyArr = CreditCardTopupScreen.X;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((kxb.c) obj2).invoke(p0);
                break;
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return (h0) ((h) obj2).invoke(p0);
    }

    @Override // zp0.x
    public void e(String listId, String extractedValue, String formattedValue, boolean z) {
        r0 r0Var = (r0) this.f189397b;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        r0Var.f190423r.onNext(new j(listId, extractedValue, formattedValue, z));
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f189396a) {
            case 10:
                n nVar = (n) this.f189397b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) nVar.invoke(p0)).booleanValue();
            default:
                kvg.j jVar = (kvg.j) this.f189397b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) jVar.invoke(p0)).booleanValue();
        }
    }

    @Override // kfm.c
    public Object apply(Object p0, Object p17) {
        koe.x xVar = (koe.x) this.f189397b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return (Pair) xVar.invoke(p0, p17);
    }
}
