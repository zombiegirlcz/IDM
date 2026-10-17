package u90;

import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.SelectionItem;
import com.revolut.feature.backend_flow.domain.models.SingleSelectionItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q90.f3;
import q90.g3;
import q90.h3;
import q90.l3;
import q90.m3;

/* JADX INFO: loaded from: classes19.dex */
public final class q0 extends d {

    @NotNull
    public static final p0 Companion = new p0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f278328b = zhm.r0.k(new Pair("RADIO_BUTTON", SingleSelectionItem.Style.RadioButton.f63653a), new Pair("CONTINUE_BUTTON", SingleSelectionItem.Style.ContinueButton.f63652a), new Pair("CELL_SELECTION", SingleSelectionItem.Style.CellSelection.f63651a));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f278329c = zhm.r0.k(new Pair("ROUNDED_SQUARE", SingleSelectionItem.AssetStyle.RoundedSquare.f63645a), new Pair("SQUARE", SingleSelectionItem.AssetStyle.Square.f63646a));
    public static final Object d = zhm.r0.k(new Pair("JOINT", SingleSelectionItem.SeparationStyle.Joint.f63648a), new Pair("SPACED", SingleSelectionItem.SeparationStyle.Spaced.f63649a));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f278330a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(z0 validationMapper, n0 optionsMapper) {
        super(validationMapper);
        Intrinsics.checkNotNullParameter(validationMapper, "validationMapper");
        Intrinsics.checkNotNullParameter(optionsMapper, "optionsMapper");
        this.f278330a = optionsMapper;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, java.util.Map] */
    @Override // u90.c
    public final BackendItem a(q90.v vVar, List previousElements) throws Throwable {
        SingleSelectionItem.AssetStyle unknown;
        SingleSelectionItem.SeparationStyle separationStyle;
        l3 item = (l3) vVar;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(previousElements, "previousElements");
        String id10 = item.getId();
        boolean required = item.getRequired();
        List options = item.getOptions();
        ArrayList arrayList = new ArrayList(zhm.w.t(options, 10));
        Iterator it8 = options.iterator();
        while (it8.hasNext()) {
            arrayList.add(this.f278330a.a((h3) it8.next()));
        }
        String searchHint = item.getSearchHint();
        f3 customOption = item.getCustomOption();
        SelectionItem.CustomOption customOptionC = customOption != null ? c(customOption) : null;
        m3 value = item.getValue();
        SelectionItem.CustomAnswer customAnswer = new SelectionItem.CustomAnswer(value != null ? value.getCustomAnswer() : null, false);
        m3 value2 = item.getValue();
        Set setH = zhm.z0.h(value2 != null ? value2.getOptionId() : null);
        SingleSelectionItem.Style unknown2 = (SingleSelectionItem.Style) f278328b.get(item.getStyle());
        if (unknown2 == null) {
            unknown2 = new SingleSelectionItem.Style.Unknown(item.getStyle());
            hx7.e.n(new IllegalArgumentException(j6.a.q("Unsupported SingleSelectionItem Style ", item.getStyle())));
        }
        SingleSelectionItem.Style style = unknown2;
        Boolean randomOptionsOrder = item.getRandomOptionsOrder();
        String assetStyle = item.getAssetStyle();
        if (assetStyle != null) {
            unknown = (SingleSelectionItem.AssetStyle) f278329c.get(assetStyle);
            if (unknown == null) {
                unknown = new SingleSelectionItem.AssetStyle.Unknown(assetStyle);
                hx7.e.n(new IllegalArgumentException("Unsupported SingleSelectionItem AssetStyle ".concat(assetStyle)));
            }
        } else {
            unknown = null;
        }
        String separationStyle2 = item.getSeparationStyle();
        if (separationStyle2 != null) {
            SingleSelectionItem.SeparationStyle unknown3 = (SingleSelectionItem.SeparationStyle) d.get(separationStyle2);
            if (unknown3 == null) {
                unknown3 = new SingleSelectionItem.SeparationStyle.Unknown(separationStyle2);
                hx7.e.n(new IllegalArgumentException("Unsupported SingleSelectionItem SeparationStyle ".concat(separationStyle2)));
            }
            separationStyle = unknown3;
        } else {
            separationStyle = null;
        }
        List groups = item.getGroups();
        if (groups == null) {
            groups = zhm.f0.f322471a;
        }
        List list = groups;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
        for (Iterator it9 = list.iterator(); it9.hasNext(); it9 = it9) {
            g3 group = (g3) it9.next();
            Intrinsics.checkNotNullParameter(group, "group");
            arrayList2.add(new SelectionItem.Group(group.getId(), group.getName(), group.getSelectionOptionIds()));
        }
        return new SingleSelectionItem(id10, required, arrayList, searchHint, customOptionC, customAnswer, setH, arrayList2, style, randomOptionsOrder, unknown, separationStyle, null);
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.Map] */
    @Override // u90.c
    public final q90.v b(BackendItem backendItem) {
        f3 f3Var;
        m3 m3Var;
        String str;
        SingleSelectionItem item = (SingleSelectionItem) backendItem;
        Intrinsics.checkNotNullParameter(item, "item");
        String str2 = item.f63637a;
        SingleSelectionItem.Style style = item.i;
        boolean z = item.f63638b;
        List list = item.f63639c;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(this.f278330a.b((SelectionItem.Option) it8.next()));
        }
        String str3 = item.d;
        SelectionItem.CustomOption option = item.e;
        if (option != null) {
            Intrinsics.checkNotNullParameter(option, "option");
            f3Var = new f3(option.f63609a, option.f63610b);
        } else {
            f3Var = null;
        }
        String str4 = (String) zhm.d0.c0(item.f63640g);
        if (str4 != null) {
            SelectionItem.CustomAnswer customAnswer = item.f;
            m3Var = new m3(str4, customAnswer != null ? customAnswer.f63607a : null);
        } else {
            m3Var = null;
        }
        String strJ = ce9.m.j(f278328b, style);
        if (strJ == null) {
            Intrinsics.i(style, "null cannot be cast to non-null type com.revolut.feature.backend_flow.domain.models.SingleSelectionItem.Style.Unknown");
            strJ = ((SingleSelectionItem.Style.Unknown) style).f63654a;
        }
        String strJ2 = null;
        Boolean bool = item.f63642j;
        SingleSelectionItem.AssetStyle assetStyle = item.k;
        if (assetStyle != null) {
            String strJ3 = ce9.m.j(f278329c, assetStyle);
            if (strJ3 == null) {
                strJ3 = ((SingleSelectionItem.AssetStyle.Unknown) assetStyle).f63647a;
            }
            str = strJ3;
        } else {
            str = null;
        }
        SingleSelectionItem.SeparationStyle separationStyle = item.f63643l;
        if (separationStyle != null && (strJ2 = ce9.m.j(d, separationStyle)) == null) {
            strJ2 = ((SingleSelectionItem.SeparationStyle.Unknown) separationStyle).f63650a;
        }
        String str5 = strJ2;
        List list2 = item.f63641h;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
        for (Iterator it9 = list2.iterator(); it9.hasNext(); it9 = it9) {
            SelectionItem.Group group = (SelectionItem.Group) it9.next();
            Intrinsics.checkNotNullParameter(group, "group");
            arrayList2.add(new g3(group.f63612a, group.f63613b, group.f63614c));
        }
        return new l3(str2, strJ, z, arrayList, str3, bool, m3Var, f3Var, str, str5, arrayList2, null);
    }
}
