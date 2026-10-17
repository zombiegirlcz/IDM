package blh;

import bq5.o0;
import com.revolut.data.model.Data;
import com.revolut.feature.payments.groups.impl.ui_chat.chat.GroupChatScreen;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g0 implements kfm.o, kfm.c, kfm.g, kfm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16654b;

    public /* synthetic */ g0(Object obj2, int i) {
        this.f16653a = i;
        this.f16654b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        ((bq5.n0) this.f16654b).invoke(obj2);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f16653a;
        Object obj2 = this.f16654b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((b4d.c) obj2).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((bhl.g) obj2).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((beg.k) obj2).invoke(p0);
            case 3:
                return (od0.i) ((y) obj2).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((y) obj2).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (zlg.i) ((bng.a) obj2).invoke(p0);
            case 6:
            case 9:
            case 15:
            case 23:
            case 25:
            case 26:
            case 27:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((bs9.y) obj2).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (yna.z) ((bng.a) obj2).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (yna.z) ((bng.a) obj2).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) ((bnj.n) obj2).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) ((bnj.n) obj2).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((o0) obj2).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((bd2.b) obj2).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((o0) obj2).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((a09.z) obj2).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((o0) obj2).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((bs9.b) obj2).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((a5b.a) obj2).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((bs9.b) obj2).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((bs9.c) obj2).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((bs9.c) obj2).invoke(p0);
            case 24:
                KProperty[] kPropertyArr = GroupChatScreen.j0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (cu9.b) ((o0) obj2).invoke(p0);
            case 28:
                KProperty[] kPropertyArr2 = GroupChatScreen.j0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (bs9.u) ((bs9.e) obj2).invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f16653a;
        Object obj2 = this.f16654b;
        switch (i) {
            case 23:
                KProperty[] kPropertyArr = GroupChatScreen.j0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((bs9.e) obj2).invoke(p0)).booleanValue();
            case 24:
            default:
                KProperty[] kPropertyArr2 = GroupChatScreen.j0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((bs9.e) obj2).invoke(p0)).booleanValue();
            case 25:
                KProperty[] kPropertyArr3 = GroupChatScreen.j0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((bs9.e) obj2).invoke(p0)).booleanValue();
            case 26:
                KProperty[] kPropertyArr4 = GroupChatScreen.j0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((bs9.d) obj2).invoke(p0)).booleanValue();
        }
    }

    @Override // kfm.c
    public Object apply(Object p0, Object p17) {
        bn4.y yVar = (bn4.y) this.f16654b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return (yna.z) yVar.invoke(p0, p17);
    }
}
