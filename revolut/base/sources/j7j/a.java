package j7j;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.collections.IndexedValue;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.q;
import zhm.q0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    @NotNull
    public static final C0976a Companion = new C0976a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f171921a;

    /* JADX INFO: renamed from: j7j.a$a, reason: collision with other inner class name */
    public static final class C0976a {
        private C0976a() {
        }
    }

    public a() {
        q qVarK1 = d0.k1(v.k(wd6.h.MARKET, wd6.h.RECURRING, wd6.h.LIMIT, wd6.h.STOP));
        int iB = q0.b(w.t(qVarK1, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        Iterator it8 = qVarK1.iterator();
        while (true) {
            kotlin.jvm.internal.d dVar = (kotlin.jvm.internal.d) it8;
            if (!((Iterator) dVar.f186416c).hasNext()) {
                this.f171921a = linkedHashMap;
                return;
            } else {
                IndexedValue indexedValue = (IndexedValue) dVar.next();
                linkedHashMap.put(indexedValue.f186392b, Integer.valueOf(indexedValue.f186391a));
            }
        }
    }

    public static AccountCellItemDelegate.Model a(String str, int i, int i2, int i3, xi0.b bVar, boolean z, boolean z3, b bVar2) {
        return new AccountCellItemDelegate.Model(str, z, LayeredImage.Companion.b(LayeredImage.INSTANCE, i3, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 12.0f, Float.valueOf(40.0f), null, 32), new TextLocalisedClause(i, null, null, 14), z3 ? com.revolut.core.ui_kit.delegates.b.f53699a : new com.revolut.core.ui_kit.delegates.a(), z3, new TextLocalisedClause(i2, u.c(new CurrencyClause(bVar, CurrencyClause.Format.Ticker.f57756a, null, 4)), null, 12), (RowDelegate.Model.c.b) null, (ProgressStyle) null, bVar2, (Parcelable) null, 128896);
    }
}
