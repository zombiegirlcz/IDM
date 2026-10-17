package vjg;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.models.ColorThemeOption;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import xjg.j;
import zhm.a0;

/* JADX INFO: loaded from: classes13.dex */
public interface g {
    default GlobalThemeDeclaration a(String id10) {
        Object obj2;
        Object next;
        Intrinsics.checkNotNullParameter(id10, "id");
        ArrayList arrayListF = ((gwl.d) this).f();
        Iterator it8 = arrayListF.iterator();
        while (true) {
            obj2 = null;
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((GlobalThemeDeclaration) next).getF94454a(), id10)) {
                break;
            }
        }
        GlobalThemeDeclaration globalThemeDeclaration = (GlobalThemeDeclaration) next;
        if (globalThemeDeclaration != null) {
            return globalThemeDeclaration;
        }
        Iterator it9 = arrayListF.iterator();
        while (true) {
            if (!it9.hasNext()) {
                break;
            }
            Object next2 = it9.next();
            if (Intrinsics.f(((GlobalThemeDeclaration) next2).getF94447c(), id10)) {
                obj2 = next2;
                break;
            }
        }
        return (GlobalThemeDeclaration) obj2;
    }

    default Clause b(j colorTheme) {
        Intrinsics.checkNotNullParameter(colorTheme, "colorTheme");
        for (ColorThemeOption colorThemeOption : c()) {
            if (colorThemeOption.f94564a == colorTheme) {
                return colorThemeOption.f94565b;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    default ArrayList c() {
        ArrayList arrayListF = ((gwl.d) this).f();
        ArrayList arrayList = new ArrayList();
        Iterator it8 = arrayListF.iterator();
        while (it8.hasNext()) {
            a0.x(((GlobalThemeDeclaration) it8.next()).getF94491b(), arrayList);
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (hashSet.add(((ColorThemeOption) obj2).f94564a)) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }
}
