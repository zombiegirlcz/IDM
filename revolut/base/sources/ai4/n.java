package ai4;

import aw0.o9;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import dx4.e3;
import dx4.g3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jmrtd.cbeff.ISO781611;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements cli.n {
    public static m a(String str, g3 g3Var) {
        String str2;
        String str3;
        RowDelegate.Model.MainImage.Image40 image40;
        String str4;
        String str5;
        String str6 = g3Var.f120607c;
        String str7 = g3Var.f120606b;
        String str8 = g3Var.d;
        if (str6 != null) {
            str2 = str7;
            str3 = str8;
            image40 = new RowDelegate.Model.MainImage.Image40(new UrlImage(str6, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902), null, null, false, null, false, 60);
        } else {
            str2 = str7;
            str3 = str8;
            image40 = null;
        }
        if (str3 == null) {
            str5 = str3;
            str4 = str2;
        } else {
            str4 = str3;
            str5 = str4;
        }
        RowDelegate.Model model = new RowDelegate.Model(com.google.android.gms.internal.mlkit_vision_face.a.o(str, "_", g3Var.f120605a), image40, new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, true, null, false, null, null, null, null, null, null, g3Var, null, 0, 0, 0, 0, 532674552);
        String[] elements = {str5, str2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new m(model, kotlin.collections.d.L(elements));
    }

    public static ArrayList b(String str, List list) {
        if (d0.W(str == null ? "" : str)) {
            return d(list);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            List list2 = ((m) obj2).f5194b;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it8 = list2.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        if (d0.J((String) it8.next(), str == null ? "" : str, true)) {
                            arrayList.add(obj2);
                            break;
                        }
                    }
                }
            }
        }
        return d(arrayList);
    }

    public static final ArrayList d(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((m) it8.next()).f5193a);
        }
        return arrayList;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        List listC;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        e3 e3Var = domainState.f5182a.f120614b;
        String str = domainState.f5184c;
        aim.e eVarB = u.b();
        ArrayList arrayList = e3Var.f120583b;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        int i = 0;
        while (true) {
            List listB = null;
            if (!it8.hasNext()) {
                ArrayList arrayListB = b(str, arrayList2);
                yp0.b.k(arrayListB, 0, 0, 0, 0, 31);
                eVarB.addAll(arrayListB);
                g3 g3Var = e3Var.f120584c;
                if (g3Var != null && (listC = u.c(a("other-item", g3Var))) != null) {
                    listB = b(str, listC);
                }
                if (listB == null) {
                    listB = f0.f322471a;
                }
                List list = listB;
                yp0.b.k(list, 0, 0, 0, 0, 31);
                eVarB.addAll(list);
                return new j(new TextClause(domainState.f5182a.f120614b.f120582a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), domainState.f5183b, u.a(eVarB));
            }
            Object next = it8.next();
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            arrayList2.add(a(String.valueOf(i), (g3) next));
            i = i2;
        }
    }
}
