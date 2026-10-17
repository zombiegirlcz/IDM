package rk;

import androidx.core.view.WindowInsetsControllerCompat;
import com.meshconnect.link.ui.LinkActivity;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.PassportService;
import rx6.m;
import s2g.j;
import s2h.g;
import s5h.f;
import slj.e;
import t73.q0;
import tna.k;
import tw9.d;
import twb.l;
import ud3.i;
import uqh.z;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f254707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f254708b;

    public /* synthetic */ b(boolean z, int i) {
        this.f254707a = i;
        this.f254708b = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f254707a;
        String str = null;
        boolean z = this.f254708b;
        switch (i) {
            case 0:
                WindowInsetsControllerCompat windowInsetsController = (WindowInsetsControllerCompat) obj2;
                int i2 = LinkActivity.f49860d0;
                Intrinsics.checkNotNullParameter(windowInsetsController, "$this$windowInsetsController");
                boolean z3 = !z;
                windowInsetsController.setAppearanceLightNavigationBars(z3);
                windowInsetsController.setAppearanceLightStatusBars(z3);
                return Unit.f186387a;
            case 1:
                m update = (m) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                String str2 = update.d;
                boolean z4 = this.f254708b;
                return m.a(update, null, z4, (str2 == null || !z4) ? null : str2, null, false, 51);
            case 2:
                return j.a((j) obj2, null, null, null, null, null, this.f254708b, 31);
            case 3:
                g update2 = (g) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                update2.getClass();
                return new g(z);
            case 4:
                ((f) obj2).getClass();
                return new f(z);
            case 5:
                s6b.g update3 = (s6b.g) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return s6b.g.a(update3, null, null, null, this.f254708b, 7);
            case 6:
                e update4 = (e) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                boolean z6 = update4.f264211b;
                update4.getClass();
                return new e(!z, z6);
            case 7:
                e update5 = (e) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                boolean z11 = update5.f264210a;
                update5.getClass();
                return new e(z11, !z);
            case 8:
                return snk.f.a((snk.f) obj2, null, z, 5);
            case 9:
                return sxd.g.a((sxd.g) obj2, null, null, null, null, null, this.f254708b, 63);
            case 10:
                return q0.a((q0) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f254708b, 25165823);
            case 11:
                ta4.e update6 = (ta4.e) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return ta4.e.a(update6, null, z, 1);
            case 12:
                tb6.m update7 = (tb6.m) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return tb6.m.a(update7, null, null, null, null, null, null, null, null, null, null, false, false, this.f254708b, null, 12287);
            case 13:
                return tb6.m.a((tb6.m) obj2, null, null, null, null, null, null, null, null, new Data(Boolean.valueOf(z), null, false, 6, null), null, false, false, false, null, 16127);
            case 14:
                tdc.m update8 = (tdc.m) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                return tdc.m.a(update8, null, null, this.f254708b, null, null, 27);
            case 15:
                return k.a((k) obj2, null, Boolean.valueOf(z), null, 11);
            case 16:
                return k.a((k) obj2, null, Boolean.valueOf(z), null, 11);
            case 17:
                return tqh.c.a((tqh.c) obj2, null, null, z, 895);
            case 18:
                String username = ((d) obj2).f274954a;
                Intrinsics.checkNotNullParameter(username, "username");
                return new d(username, z);
            case 19:
                l update9 = (l) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                return l.a(update9, null, null, null, null, !z, false, null, 239);
            case 20:
                l update10 = (l) obj2;
                Intrinsics.checkNotNullParameter(update10, "$this$update");
                return l.a(update10, null, null, null, null, false, !z, null, PassportService.DEFAULT_MAX_BLOCKSIZE);
            case 21:
                u4b.e update11 = (u4b.e) obj2;
                Intrinsics.checkNotNullParameter(update11, "$this$update");
                boolean z12 = update11.f;
                boolean z29 = this.f254708b;
                return u4b.e.a(update11, null, 0L, null, null, z29, z12 && !z29, 15);
            case 22:
                u6b.e update12 = (u6b.e) obj2;
                Intrinsics.checkNotNullParameter(update12, "$this$update");
                return u6b.e.a(update12, null, null, null, this.f254708b, 7);
            case 23:
                return u8j.b.a((u8j.b) obj2, this.f254708b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194302);
            case 24:
                return i.a((i) obj2, null, null, null, null, null, null, null, null, null, null, null, null, this.f254708b, 8191);
            case 25:
                udk.d update13 = (udk.d) obj2;
                Intrinsics.checkNotNullParameter(update13, "$this$update");
                return udk.d.a(update13, null, null, new udk.k(z), 3);
            case 26:
                return z.a((z) obj2, null, null, null, null, null, null, this.f254708b, null, null, null, 959);
            case 27:
                ux6.j update14 = (ux6.j) obj2;
                Intrinsics.checkNotNullParameter(update14, "$this$update");
                String str3 = update14.f283881b;
                boolean z31 = this.f254708b;
                if (str3 != null && z31) {
                    str = str3;
                }
                return ux6.j.a(update14, null, str, z31, false, false, 25);
            case 28:
                ux6.j update15 = (ux6.j) obj2;
                Intrinsics.checkNotNullParameter(update15, "$this$update");
                return ux6.j.a(update15, null, null, false, false, this.f254708b, 15);
            default:
                return uyh.j.a((uyh.j) obj2, null, null, this.f254708b, null, 23);
        }
    }
}
