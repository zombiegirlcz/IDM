package q09;

import com.revolut.data.model.Data;
import com.revolut.feature.learn.shared.impl.ui.lesson.LessonScreen;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements kfm.o, kfm.g, kfm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f241180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f241181b;

    public /* synthetic */ c(int i, Function1 function1) {
        this.f241180a = i;
        this.f241181b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        int i = this.f241180a;
        Function1 function1 = this.f241181b;
        switch (i) {
            case 2:
                KProperty[] kPropertyArr = LessonScreen.c0;
                ((b) function1).invoke(obj2);
                break;
            case 9:
                ((a) function1).invoke(obj2);
                break;
            default:
                ((q03.h) function1).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f241180a;
        Function1 function1 = this.f241181b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = LessonScreen.c0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((a) function1).invoke(p0);
                return s.f241210a;
            case 1:
                KProperty[] kPropertyArr2 = LessonScreen.c0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((a) function1).invoke(p0);
                return n.f241205a;
            case 2:
            case 9:
            case 11:
            case 12:
            case 14:
            case 19:
            case 22:
            case 25:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) ((q2k.c) function1).invoke(p0);
            case 3:
                KProperty[] kPropertyArr3 = LessonScreen.c0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (p) ((a) function1).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((h0) function1).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((a) function1).invoke(p0);
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (HashSet) ((a) function1).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (q1a.e) ((jeg.i) function1).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) ((q03.h) function1).invoke(p0);
            case 10:
                return (Data) ((a) function1).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Runnable) ((q2g.h) function1).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) ((q2j.h) function1).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((q2j.j) function1).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) ((pza.d) function1).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (q2j.r) ((q2a.a) function1).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((q2j.i) function1).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((q2j.e) function1).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) ((q2j.e) function1).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (kq2.b) ((q2a.a) function1).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) ((n68.w) function1).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (kq2.b) ((pig.y) function1).invoke(p0);
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) ((q2k.b) function1).invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f241180a) {
            case 11:
                q2a.a aVar = (q2a.a) this.f241181b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) aVar.invoke(p0)).booleanValue();
            case 12:
                q2j.e eVar = (q2j.e) this.f241181b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) eVar.invoke(p0)).booleanValue();
            case 13:
            case 15:
            case 16:
            case 17:
            case 18:
            default:
                q2a.a aVar2 = (q2a.a) this.f241181b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) aVar2.invoke(p0)).booleanValue();
            case 14:
                q2a.a aVar3 = (q2a.a) this.f241181b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) aVar3.invoke(p0)).booleanValue();
            case 19:
                q2a.a aVar4 = (q2a.a) this.f241181b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) aVar4.invoke(p0)).booleanValue();
        }
    }
}
