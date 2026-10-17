package nsl;

import com.revolut.feature.crypto_investments.models.SplitAccountsItemGroup;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jsl.h0;
import jsl.j0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m1c.g1;
import nv7.i;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f218909a;

    public /* synthetic */ d(int i) {
        this.f218909a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f218909a) {
            case 0:
                Throwable error = (Throwable) obj2;
                tsl.f fVar = (tsl.f) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (fVar == null) {
                    return error;
                }
                return null;
            case 1:
                Throwable th10 = (Throwable) obj2;
                if (((tsl.b) obj3) == null) {
                    return th10;
                }
                return null;
            case 2:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new j0(h0.f178214a, (List) getDefaultErrorItems.invoke(new iii.d(14, null, false, false, null)));
            case 3:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(14, null, true, false, null));
            case 4:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new nuc.m(iii.c.b(null, null, 6, false), false, false, false, null, false, Constants.TAG_FULL_SVPP_IDENTIFICATION);
            case 5:
                Throwable error2 = (Throwable) obj2;
                vl4.g gVar = (vl4.g) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (gVar == null) {
                    return error2;
                }
                return null;
            case 6:
                Function1 defaultItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultItems, "defaultItems");
                return new nv4.p((List) defaultItems.invoke(new iii.d(14, null, true, false, null)), nv4.l.f219469a);
            case 7:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
            case 8:
                Throwable error3 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error3, "error");
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error3, h0Var);
                return null;
            case 9:
                return new SplitAccountsItemGroup.ErrorGroup(new SplitAccountsItemGroup.ErrorItem());
            case 10:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(12, null, true, true, null));
            case 11:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new nv6.q(null, null);
            case 12:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return new nv7.j((List) getDefaultErrorItems4.invoke(new iii.d(14, null, true, false, null)), i.a.f219547a);
            case 13:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 14:
                Function1 mapper = (Function1) obj3;
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                return (List) mapper.invoke(new iii.d(14, null, true, false, null));
            case 15:
                Throwable th11 = (Throwable) obj2;
                if (((h93.f0) obj3) == null) {
                    return th11;
                }
                return null;
            case 16:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return new nxa.s((List) getDefaultErrorItems5.invoke(new iii.d(14, null, true, false, null)));
            case 17:
                Long old2 = (Long) obj2;
                Long l2 = (Long) obj3;
                Intrinsics.checkNotNullParameter(old2, "old");
                Intrinsics.checkNotNullParameter(l2, "new");
                return Long.valueOf(l2.longValue() + old2.longValue());
            case 18:
                Function1 defaultErrorItem = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItem, "defaultErrorItem");
                return (List) defaultErrorItem.invoke(new iii.d(14, null, true, false, null));
            case 19:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 20:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 21:
                Throwable error4 = (Throwable) obj2;
                od0.i iVar = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (iVar == null) {
                    return error4;
                }
                return null;
            case 22:
                Throwable error5 = (Throwable) obj2;
                g1 g1Var = (g1) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (g1Var == null) {
                    return error5;
                }
                return null;
            case 23:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 24:
                return null;
            case 25:
                return null;
            case 26:
                Throwable error6 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (list == null) {
                    return error6;
                }
                return null;
            case 27:
                ((Boolean) obj2).booleanValue();
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 28:
                Throwable error7 = (Throwable) obj2;
                od0.i iVar2 = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (iVar2 == null) {
                    zhm.h0 h0Var2 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, error7, h0Var2);
                }
                return null;
            default:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
        }
    }
}
