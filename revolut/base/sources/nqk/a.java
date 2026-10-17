package nqk;

import com.revolut.core.ui_kit.models.CurrencyClause;
import f01.c;
import io3.d;
import io3.k;
import java.text.Collator;
import kotlin.jvm.internal.Intrinsics;
import xi0.b;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements psi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f218480a;

    public a(c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f218480a = uiKitResources;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        d leftPocket = (d) obj2;
        d rightPocket = (d) obj3;
        Intrinsics.checkNotNullParameter(leftPocket, "leftPocket");
        Intrinsics.checkNotNullParameter(rightPocket, "rightPocket");
        k kVar = leftPocket.f;
        String str = leftPocket.f163147c;
        k kVar2 = rightPocket.f;
        String str2 = rightPocket.f163147c;
        if (kVar == kVar2) {
            b.Companion.getClass();
            CurrencyClause currencyClause = new CurrencyClause(xi0.a.a(str), null, null, 6);
            c cVar = this.f218480a;
            return Collator.getInstance().compare(cVar.b(currencyClause).toString(), cVar.b(new CurrencyClause(xi0.a.a(str2), null, null, 6)).toString());
        }
        k kVar3 = k.ACTIVE;
        if (kVar == kVar3) {
            return -1;
        }
        if (kVar2 == kVar3) {
            return 1;
        }
        return str.compareTo(str2);
    }
}
