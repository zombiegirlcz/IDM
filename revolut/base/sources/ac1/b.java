package ac1;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.unit.Density;
import androidx.room.RoomDatabase;
import androidx.sqlite.SQLiteConnection;
import bgk.b;
import c12.k0;
import c12.n0;
import ckj.d;
import com.revolut.data.model.Data;
import d67.p;
import d67.s;
import d67.t;
import d67.u;
import dii.f;
import dii.g;
import efm.w;
import java.util.List;
import jli.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.n1;
import nkm.y;
import rp0.b1;
import rp0.c1;
import rp0.d1;
import rp0.e1;
import til.q;
import til.r;
import vfk.c;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f3014b;

    public /* synthetic */ b(int i, Function0 function0) {
        this.f3013a = i;
        this.f3014b = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object it8) {
        int i = this.f3013a;
        Function0 function0 = this.f3014b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter((Throwable) it8, "it");
                function0.invoke();
                return Unit.f186387a;
            case 1:
                e1 event = (e1) it8;
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof c1) {
                    function0.invoke();
                } else if (!(event instanceof b1) && !(event instanceof d1)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 2:
                Intrinsics.checkNotNullParameter((u) it8, "it");
                function0.invoke();
                return Unit.f186387a;
            case 3:
                g output = (g) it8;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof f) {
                    function0.invoke();
                }
                return Unit.f186387a;
            case 4:
                return RoomDatabase.runInTransaction$lambda$12(function0, (SQLiteConnection) it8);
            case 5:
                c.a result = (c.a) it8;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof vfk.a) {
                    function0.invoke();
                } else {
                    if (!(result instanceof vfk.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i2 = h.f175850a;
                }
                return Unit.f186387a;
            case 6:
                bgk.b bVar = (bgk.b) it8;
                if (Intrinsics.f(bVar, b.C0097b.f15210a) || Intrinsics.f(bVar, b.c.f15211a)) {
                    function0.invoke();
                } else if (!Intrinsics.f(bVar, b.a.f15209a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 7:
                return DragGestureDetectorKt.detectDragGestures$lambda$4(function0, (PointerInputChange) it8);
            case 8:
                r result2 = (r) it8;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 instanceof q) {
                    function0.invoke();
                }
                return Unit.f186387a;
            case 9:
                n0 it9 = (n0) it8;
                Intrinsics.checkNotNullParameter(it9, "it");
                if (it9 instanceof k0) {
                    function0.invoke();
                }
                return Unit.f186387a;
            case 10:
                u output2 = (u) it8;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (Intrinsics.f(output2, s.f111464a)) {
                    function0.invoke();
                } else if (!Intrinsics.f(output2, t.f111465a) && !Intrinsics.f(output2, d67.q.f111462a) && !Intrinsics.f(output2, d67.r.f111463a) && !(output2 instanceof p)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 11:
                Intrinsics.checkNotNullParameter((ef9.d) it8, "it");
                function0.invoke();
                return Unit.f186387a;
            case 12:
                List pockets = (List) it8;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                return y.J(y.n(y.n(y.n(y.n(d0.Q(pockets), new ksk.h(26)), new k37.t((List) function0.invoke(), 12)), new ksk.h(27)), new ksk.h(28)));
            case 13:
                Data data = (Data) it8;
                Intrinsics.checkNotNullParameter(data, "data");
                return (data.getContent() != null || data.getError() == null) ? data : new Data(function0.invoke(), null, false, 6, null);
            case 14:
                Intrinsics.checkNotNullParameter(it8, "it");
                return function0.invoke();
            case 15:
                function0.invoke();
                return Unit.f186387a;
            case 16:
                ckj.d result3 = (ckj.d) it8;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (!Intrinsics.f(result3, d.a.f24855a)) {
                    throw new NoWhenBranchMatchedException();
                }
                function0.invoke();
                return Unit.f186387a;
            case 17:
                ((Boolean) it8).getClass();
                return rd0.e.b((w) function0.invoke());
            case 18:
                Intrinsics.checkNotNullParameter((mm.e) it8, "<unused var>");
                return (efm.d0) function0.invoke();
            case 19:
                Intrinsics.checkNotNullParameter((mm.e) it8, "<unused var>");
                return (efm.b) function0.invoke();
            case 20:
                return TextFieldSelectionManager_androidKt.textFieldMagnifier$lambda$0$4$0$0(function0, (Density) it8);
            default:
                Intrinsics.checkNotNullParameter((n1) it8, "it");
                function0.invoke();
                return Unit.f186387a;
        }
    }
}
