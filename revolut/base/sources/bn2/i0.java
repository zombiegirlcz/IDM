package bn2;

import com.revolut.feature.backgroundpicker.impl.interactor.ThemesInteractor$Theme;
import java.util.Comparator;

/* JADX INFO: loaded from: classes21.dex */
public final class i0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Integer.valueOf(vjg.a.a().indexOf(((ThemesInteractor$Theme) obj2).f63800a.g0())), Integer.valueOf(vjg.a.a().indexOf(((ThemesInteractor$Theme) obj3).f63800a.g0())));
    }
}
