package nij;

import com.revolut.domain.models.joint.JointAccountData;
import ip0.xc;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njj.a0;
import njj.k0;
import zhm.f0;
import zhm.h0;
import zhm.r0;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f216262a;

    public /* synthetic */ d(int i) {
        this.f216262a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f216262a) {
            case 0:
                Function1 defaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItems, "defaultErrorItems");
                return u.c(new xc("LOADING_ERROR_TAB_ID", (List) defaultErrorItems.invoke(new iii.d(12, null, true, true, null)), 0, null, null, 0, 0, 0, 1020));
            case 1:
                Throwable error = (Throwable) obj2;
                do3.n nVar = (do3.n) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (nVar == null) {
                    return error;
                }
                return null;
            case 2:
                ((Boolean) obj2).booleanValue();
                return h0.f322473a;
            case 3:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 4:
                Function1 getErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getErrorItems, "getErrorItems");
                return new nj9.j((List) getErrorItems.invoke(new iii.d(12, null, false, true, null)), nj9.f.f216417a);
            case 5:
                Throwable error2 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (list == null) {
                    return error2;
                }
                return null;
            case 6:
                Throwable error3 = (Throwable) obj2;
                JointAccountData jointAccountData = (JointAccountData) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (jointAccountData == null) {
                    return error3;
                }
                return null;
            case 7:
                Throwable error4 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (list2 == null) {
                    return error4;
                }
                return null;
            case 8:
                Throwable error5 = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (bool == null) {
                    return error5;
                }
                return null;
            case 9:
                ((Boolean) obj2).booleanValue();
                return r0.g();
            case 10:
                Throwable error6 = (Throwable) obj2;
                Map map = (Map) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (map == null) {
                    return error6;
                }
                return null;
            case 11:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
            case 12:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 13:
                Throwable error7 = (Throwable) obj2;
                Map map2 = (Map) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (map2 == null) {
                    return error7;
                }
                return null;
            case 14:
                Throwable error8 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (list3 == null) {
                    return error8;
                }
                return null;
            case 15:
                Throwable error9 = (Throwable) obj2;
                Map map3 = (Map) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (map3 == null) {
                    return error9;
                }
                return null;
            case 16:
                Throwable error10 = (Throwable) obj2;
                List list4 = (List) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (list4 == null) {
                    return error10;
                }
                return null;
            case 17:
                Throwable e = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(e, "e");
                return e;
            case 18:
                Throwable e2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(e2, "e");
                return e2;
            case 19:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                List list5 = (List) getDefaultErrorItems.invoke(new iii.d(12, null, true, true, null));
                a0.Companion.getClass();
                return new k0(null, null, list5, a0.f216537c);
            case 20:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 21:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 22:
                Throwable error11 = (Throwable) obj2;
                List list6 = (List) obj3;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (list6 == null) {
                    return error11;
                }
                return null;
            case 23:
                Throwable error12 = (Throwable) obj2;
                pha.a aVar = (pha.a) obj3;
                Intrinsics.checkNotNullParameter(error12, "error");
                if (aVar == null) {
                    return error12;
                }
                return null;
            case 24:
                Function1 defaultErrorItem = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItem, "defaultErrorItem");
                return (List) defaultErrorItem.invoke(new iii.d(14, null, true, false, null));
            case 25:
                Throwable th10 = (Throwable) obj2;
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                if (th10 != null) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
                }
                return (List) getDefaultErrorItems2.invoke(new iii.d(12, null, true, true, null));
            case 26:
                Throwable error13 = (Throwable) obj2;
                od0.i iVar = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error13, "error");
                if (iVar == null) {
                    return error13;
                }
                return null;
            case 27:
                return new Pair(obj2, obj3);
            case 28:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            default:
                Throwable th11 = (Throwable) obj2;
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                if (th11 != null) {
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, th11, h0Var2);
                }
                return (List) getDefaultErrorItems3.invoke(new iii.d(12, null, true, true, null));
        }
    }
}
