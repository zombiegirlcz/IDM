package gug;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.h0;
import zw7.d0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f146930a;

    public /* synthetic */ c(int i) {
        this.f146930a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f146930a) {
            case 0:
                Throwable error = (Throwable) obj2;
                wel.e eVar = (wel.e) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (eVar == null) {
                }
                break;
            case 1:
                Throwable error2 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (list == null) {
                }
                break;
            case 2:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                break;
            case 3:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                break;
            case 4:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                break;
            case 5:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                break;
            case 6:
                Throwable error3 = (Throwable) obj2;
                Pair pair = (Pair) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (pair == null) {
                }
                break;
            case 7:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                break;
            case 8:
                Throwable error4 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (list2 == null) {
                }
                break;
            case 9:
                Throwable error5 = (Throwable) obj2;
                f5j.a aVar = (f5j.a) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (aVar == null) {
                }
                break;
            case 10:
                Throwable error6 = (Throwable) obj2;
                d0 d0Var = (d0) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (d0Var == null) {
                }
                break;
            case 11:
                Throwable error7 = (Throwable) obj2;
                gz7.g gVar = (gz7.g) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error7, h0Var);
                if (gVar == null) {
                }
                break;
            case 12:
                Function1 errorItemsProvider = (Function1) obj3;
                Intrinsics.checkNotNullParameter(errorItemsProvider, "errorItemsProvider");
                break;
            case 13:
                Function1 errorItemsProvider2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(errorItemsProvider2, "errorItemsProvider");
                break;
            case 14:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                break;
            case 15:
                Throwable error8 = (Throwable) obj2;
                Pair pair2 = (Pair) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (pair2 == null) {
                }
                break;
            case 16:
                Throwable error9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error9, "error");
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error9, h0Var2);
                break;
            case 17:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                break;
            case 18:
                Throwable error10 = (Throwable) obj2;
                od0.i iVar = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if ((iVar != null ? (io3.d) iVar.f224257a : null) == null) {
                }
                break;
            case 19:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                break;
            case 20:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                break;
            case 21:
                Throwable error11 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (list3 == null) {
                }
                break;
            case 22:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                break;
            case 23:
                Throwable error12 = (Throwable) obj2;
                List list4 = (List) obj3;
                Intrinsics.checkNotNullParameter(error12, "error");
                if (list4 == null) {
                }
                break;
            case 24:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                break;
            case 25:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                break;
            case 26:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                break;
            case 27:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                break;
            case 28:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                break;
            default:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                break;
        }
        return f0.f322471a;
    }

    public /* synthetic */ c(Object obj2, int i) {
        this.f146930a = i;
    }
}
