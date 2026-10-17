package t04;

import dx4.a1;
import dx4.y0;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import t04.e;
import yhm.m;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTimeFormatter f266906a = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public final my3.p a(r formDto) {
        String str;
        String str2;
        Object objA;
        String str3;
        Object kVar;
        a1 a1VarA;
        Intrinsics.checkNotNullParameter(formDto, "formDto");
        String type = formDto.getType();
        String title = formDto.getTitle();
        String subtitle = formDto.getSubtitle();
        String button = formDto.getButton();
        List actions = formDto.getActions();
        if (actions == null) {
            actions = f0.f322471a;
        }
        List<l> list = actions;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (l lVar : list) {
            arrayList.add(new my3.i(lVar.getId(), lVar.getLabel(), my3.a.valueOf(lVar.getAction()), lVar.getActionSuccessMessage()));
        }
        List<f> fields = formDto.getFields();
        ArrayList arrayList2 = new ArrayList(w.t(fields, 10));
        for (f fVar : fields) {
            if (fVar instanceof c) {
                c cVar = (c) fVar;
                String id10 = cVar.getId();
                boolean editable = cVar.getEditable();
                boolean mandatory = cVar.getMandatory();
                String label = cVar.getLabel();
                xi0.a aVar = xi0.b.Companion;
                String currency = cVar.getCurrency();
                aVar.getClass();
                xi0.b bVarA = xi0.a.a(currency);
                Long value = cVar.getValue();
                kVar = new my3.j(id10, editable, mandatory, label, value != null ? new dj0.d(value.longValue(), xi0.a.a(cVar.getCurrency())) : null, cVar.getDescription(), bVarA);
                str = type;
                str2 = title;
            } else if (fVar instanceof e) {
                e eVar = (e) fVar;
                String id11 = eVar.getId();
                boolean editable2 = eVar.getEditable();
                boolean mandatory2 = eVar.getMandatory();
                String label2 = eVar.getLabel();
                String value2 = eVar.getValue();
                String description = eVar.getDescription();
                e.b picker = eVar.getPicker();
                String title2 = picker.getTitle();
                List values = picker.getValues();
                str = type;
                ArrayList arrayList3 = new ArrayList(w.t(values, 10));
                Iterator it8 = values.iterator();
                while (it8.hasNext()) {
                    e.a aVar2 = (e.a) it8.next();
                    String id12 = aVar2.getId();
                    Iterator it9 = it8;
                    String title3 = aVar2.getTitle();
                    String icon = aVar2.getIcon();
                    if (icon != null) {
                        a1.Companion.getClass();
                        a1VarA = y0.a(icon);
                    } else {
                        a1VarA = null;
                    }
                    String str4 = title;
                    arrayList3.add(new my3.l(a1VarA, id12, title3));
                    it8 = it9;
                    title = str4;
                }
                str2 = title;
                kVar = new my3.n(id11, editable2, mandatory2, label2, value2, description, new my3.m(title2, arrayList3));
            } else {
                str = type;
                str2 = title;
                if (!(fVar instanceof d)) {
                    throw new NoWhenBranchMatchedException();
                }
                d dVar = (d) fVar;
                String id13 = dVar.getId();
                boolean editable3 = dVar.getEditable();
                boolean mandatory3 = dVar.getMandatory();
                String label3 = dVar.getLabel();
                LocalDate value3 = dVar.getValue();
                String description2 = dVar.getDescription();
                LocalDate value4 = dVar.getValue();
                if (value4 != null) {
                    try {
                        m.Companion companion = yhm.m.INSTANCE;
                        try {
                            objA = value4.format(this.f266906a);
                        } catch (Throwable th10) {
                            th = th10;
                            m.Companion companion2 = yhm.m.INSTANCE;
                            objA = yhm.o.a(th);
                        }
                    } catch (Throwable th11) {
                        th = th11;
                    }
                    if (objA instanceof yhm.n) {
                        objA = null;
                    }
                    str3 = (String) objA;
                } else {
                    str3 = null;
                }
                if (str3 == null) {
                    str3 = "";
                }
                kVar = new my3.k(id13, editable3, mandatory3, label3, value3, description2, str3);
                arrayList2.add(kVar);
                type = str;
                title = str2;
            }
            arrayList2.add(kVar);
            type = str;
            title = str2;
        }
        return new my3.p(type, title, subtitle, button, arrayList, arrayList2);
    }
}
