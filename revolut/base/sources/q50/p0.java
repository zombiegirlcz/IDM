package q50;

import aw0.a3;
import aw0.o9;
import aw0.y2;
import com.google.gson.reflect.TypeToken;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;
import q50.n0;

/* JADX INFO: loaded from: classes19.dex */
public final class p0 extends y50.d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Lazy f242259m = yhm.j.b(new pyc.a(this, 18));

    public static a3 g3(n0.c cVar, int i) {
        return new a3(cVar.getLabel(), new TextClause(cVar.getLabel(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), cVar.getValue(), new TextClause(cVar.getDisplayValue(), (Style) null, (Integer) null, false, o9.SENSITIVE, (List) null, LDSFile.EF_DG14_TAG), i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? R$attr.uikit_colorGreyTone5 : R$attr.uikit_colorGreyTone8 : R$attr.uikit_colorGreyTone10 : R$attr.uikit_colorGreyTone20 : R$attr.uikit_colorGreyTone50 : R$attr.uikit_colorForeground);
    }

    public static y2 h3(n0.b bVar) {
        return new y2(new TextClause(bVar.getTop(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(bVar.getTitle(), (Style) null, (Integer) null, false, o9.SENSITIVE, (List) null, LDSFile.EF_DG14_TAG), new TextClause(bVar.getSubtitle(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
    }

    @Override // y50.d
    public final y50.a Z2() {
        return new ks0.n(this);
    }

    @Override // y50.d
    public final cli.g d3() {
        return (cli.g) this.f242259m.getValue();
    }

    @Override // y50.d
    public final Object e3(String rawData) {
        Intrinsics.checkNotNullParameter(rawData, "rawData");
        kg.o oVarA = w10.j.a();
        Type type = new TypeToken<n0>() { // from class: com.revolut.chat.ui.messageslist.widgets.SegmentedChartWidgetModel$parseInput$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(rawData, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (n0) objD;
    }
}
