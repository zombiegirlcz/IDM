package q50;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import q50.q0;

/* JADX INFO: loaded from: classes19.dex */
public final class s0 extends y50.d implements y50.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final k50.x f242279m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Lazy f242280n;

    public s0(k50.x textMapper) {
        Intrinsics.checkNotNullParameter(textMapper, "textMapper");
        this.f242279m = textMapper;
        this.f242280n = yhm.j.b(new pyc.a(this, 19));
    }

    @Override // y50.d
    public final y50.a Z2() {
        return this;
    }

    @Override // y50.d
    public final cli.g d3() {
        return (cli.g) this.f242280n.getValue();
    }

    @Override // y50.d
    public final Object e3(String rawData) {
        Intrinsics.checkNotNullParameter(rawData, "rawData");
        kg.o oVarA = w10.j.a();
        Type type = new TypeToken<q0>() { // from class: com.revolut.chat.ui.messageslist.widgets.TableWidgetModel$parseInput$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(rawData, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        List<q0.b> columns = ((q0) objD).getColumns();
        ArrayList arrayList = new ArrayList(zhm.w.t(columns, 10));
        for (q0.b bVar : columns) {
            String label = bVar.getLabel();
            k50.x xVar = this.f242279m;
            String string = xVar.c(label).toString();
            List cells = bVar.getCells();
            ArrayList arrayList2 = new ArrayList(zhm.w.t(cells, 10));
            Iterator it8 = cells.iterator();
            while (it8.hasNext()) {
                arrayList2.add(new q0.a(xVar.c(((q0.a) it8.next()).getLabel()).toString()));
            }
            arrayList.add(new q0.b(string, arrayList2));
        }
        return new q0(arrayList);
    }

    @Override // y50.a
    public final void h1(fx.d dVar, koi.c delegatesManager) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(delegatesManager, "delegatesManager");
    }
}
