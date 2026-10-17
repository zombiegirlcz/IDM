package fad;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.feature.shared.invoices.impl.R$string;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements n {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.a f133286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f133287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f133288c;

    public j(had.b languageClauseFactory, had.c languageImageFactory, f01.a uiKitResources) {
        Intrinsics.checkNotNullParameter(languageClauseFactory, "languageClauseFactory");
        Intrinsics.checkNotNullParameter(languageImageFactory, "languageImageFactory");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f133286a = uiKitResources;
        EnumEntries enumEntriesA = u9d.b.a();
        int iB = q0.b(w.t(enumEntriesA, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (Object obj2 : enumEntriesA) {
            linkedHashMap.put(obj2, languageClauseFactory.a((u9d.b) obj2));
        }
        this.f133287b = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(q0.b(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), this.f133286a.b((Clause) entry.getValue()).toString());
        }
        this.f133288c = linkedHashMap2;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        e eVar = new e(new TextLocalisedClause(R$string.invoices_shared_language_selector_title, null, null, 14), new TextLocalisedClause(R$string.invoices_shared_language_selector_subtitle, null, null, 14), new TextLocalisedClause(R$string.invoices_shared_language_selector_search, null, null, 14));
        EnumEntries enumEntriesA = u9d.b.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : enumEntriesA) {
            if (d0.J((CharSequence) r0.h((u9d.b) obj2, this.f133288c), domainState.f133278b, true)) {
                arrayList.add(obj2);
            }
        }
        List<u9d.b> listP0 = zhm.d0.P0(arrayList, new bm8.a(new i(domainState, 0), this, 8));
        ArrayList arrayList2 = new ArrayList(w.t(listP0, 10));
        for (u9d.b bVar : listP0) {
            boolean z = bVar == domainState.f133277a;
            arrayList2.add(new RowDelegate.Model(j6.a.q("LIST_ID_LANGUAGE", bVar.name()), new RowDelegate.Model.MainImage.Image40(had.c.a(bVar), z ? new AccentCircleBadge(dw0.a.Checked) : null, null, false, null, false, 60), (Clause) r0.h(bVar, this.f133287b), null, 0, null, null, null, 0, null, false, null, z, null, null, null, null, null, null, bVar, null, 0, 0, 0, 0, 532668408));
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        return new f(eVar, arrayList2);
    }
}
