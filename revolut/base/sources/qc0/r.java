package qc0;

import com.revolut.feature.backend_flow.domain.models.DateInputItem;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.InputItem;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f244477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f244478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f244479c;
    public final /* synthetic */ LocalDate d;

    public /* synthetic */ r(j0 j0Var, String str, LocalDate localDate, int i) {
        this.f244477a = i;
        this.f244478b = j0Var;
        this.f244479c = str;
        this.d = localDate;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str;
        Object next;
        FormScreen screen = (FormScreen) obj2;
        switch (this.f244477a) {
            case 0:
                Intrinsics.checkNotNullParameter(screen, "screen");
                return this.f244478b.f244450r.c(screen, this.f244479c, new aa0.m0(this.d));
            case 1:
                Intrinsics.checkNotNullParameter(screen, "screen");
                List list = screen.f63468b;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof DateInputItem) {
                        arrayList.add(obj3);
                    }
                }
                Iterator it8 = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it8.hasNext();
                    str = this.f244479c;
                    if (zHasNext) {
                        next = it8.next();
                        if (Intrinsics.f(((InputItem) next).getId(), str)) {
                        }
                    } else {
                        next = null;
                    }
                }
                DateInputItem dateInputItem = (DateInputItem) ((InputItem) next);
                j0 j0Var = this.f244478b;
                LocalDate localDate = this.d;
                if (dateInputItem == null) {
                    return j0Var.f244451s.c(screen, str, localDate);
                }
                FormScreen formScreenE0 = j0Var.e0();
                rp0.y yVarD = formScreenE0 != null ? j0Var.f.d(formScreenE0, dateInputItem, localDate) : null;
                if (yVarD == null) {
                    return screen;
                }
                j0Var.W.onNext(yVarD);
                return screen;
            default:
                Intrinsics.checkNotNullParameter(screen, "screen");
                return this.f244478b.f244452t.c(screen, this.f244479c, this.d);
        }
    }
}
