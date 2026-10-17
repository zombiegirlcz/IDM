package r4j;

import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review.BankTransferReviewScreen;
import efm.h0;
import kfm.o;
import kfm.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kwg.e;
import r38.m;
import r40.n0;
import r40.y0;
import r7i.q;
import r7i.r;
import s4j.d;
import zp0.x;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements x, p, o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f251465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f251466b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f251465a = i;
        this.f251466b = obj2;
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f251465a;
        Object obj2 = this.f251466b;
        switch (i) {
            case 2:
                KProperty[] kPropertyArr = BankTransferReviewScreen.f102115n0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (k5k.b) ((y0) obj2).invoke(p0);
            case 3:
                KProperty[] kPropertyArr2 = BankTransferReviewScreen.f102115n0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (k5k.b) ((y0) obj2).invoke(p0);
            case 4:
                KProperty[] kPropertyArr3 = BankTransferReviewScreen.f102115n0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (k5k.b) ((y0) obj2).invoke(p0);
            case 5:
                KProperty[] kPropertyArr4 = BankTransferReviewScreen.f102115n0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (k5k.b) ((y0) obj2).invoke(p0);
            case 6:
                KProperty[] kPropertyArr5 = BankTransferReviewScreen.f102115n0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (k5k.b) ((y0) obj2).invoke(p0);
            case 7:
                KProperty[] kPropertyArr6 = BankTransferReviewScreen.f102115n0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (k5k.b) ((y0) obj2).invoke(p0);
            case 8:
                KProperty[] kPropertyArr7 = BankTransferReviewScreen.f102115n0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (k5k.b) ((y0) obj2).invoke(p0);
            case 9:
                KProperty[] kPropertyArr8 = BankTransferReviewScreen.f102115n0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (k5k.b) ((y0) obj2).invoke(p0);
            case 10:
                KProperty[] kPropertyArr9 = BankTransferReviewScreen.f102115n0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (k5k.b) ((y0) obj2).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((q2k.b) obj2).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((q) obj2).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((q) obj2).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((y0) obj2).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((e) obj2).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((r4k.x) obj2).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((n0) obj2).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((n0) obj2).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((q2k.b) obj2).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((e) obj2).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((r) obj2).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((m) obj2).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((r7i.x) obj2).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((r7i.x) obj2).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) ((r83.a) obj2).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) ((r83.b) obj2).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) ((r83.c) obj2).invoke(p0);
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((m) obj2).invoke(p0);
                return Boolean.TRUE;
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) ((r83.b) obj2).invoke(p0);
        }
    }

    @Override // zp0.x
    public void e(String listId, String extractedValue, String formattedValue, boolean z) {
        c cVar = (c) this.f251466b;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        cVar.f251468b.onNext(new d(listId, extractedValue, formattedValue, z));
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        y0 y0Var = (y0) this.f251466b;
        KProperty[] kPropertyArr = BankTransferReviewScreen.f102115n0;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) y0Var.invoke(p0)).booleanValue();
    }
}
