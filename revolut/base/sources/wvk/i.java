package wvk;

import awk.m;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.add_key_stats_view_items.AddKeyStatsViewItemsScreenContract$Input;
import com.revolut.retail.wealth.resources.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.r0;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements n {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AddKeyStatsViewItemsScreenContract$Input f300548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f300549b;

    public i(AddKeyStatsViewItemsScreenContract$Input input, m itemMapper, zvk.d assetStatsUIMapper, g buttonMapper) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
        Intrinsics.checkNotNullParameter(assetStatsUIMapper, "assetStatsUIMapper");
        Intrinsics.checkNotNullParameter(buttonMapper, "buttonMapper");
        this.f300548a = input;
        this.f300549b = itemMapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v15, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.Map] */
    @Override // cli.n
    public final o c(cli.j jVar) {
        ?? arrayList;
        boolean z;
        boolean z3;
        ?? r110;
        ?? r4;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        awk.h hVar = domainState.f300543a;
        List listC = null;
        if (hVar == null || (r4 = hVar.f10802a) == 0) {
            arrayList = 0;
        } else {
            arrayList = new ArrayList(r4.size());
            for (Map.Entry entry : r4.entrySet()) {
                arrayList.add(this.f300549b.a((AssetStatsId) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
            }
        }
        if (arrayList == 0) {
            arrayList = f0.f322471a;
        }
        ?? r62 = arrayList;
        yp0.b.k(r62, 0, 0, 0, 0, 31);
        AddKeyStatsViewItemsScreenContract$Input addKeyStatsViewItemsScreenContract$Input = this.f300548a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(zvk.d.a(addKeyStatsViewItemsScreenContract$Input.f104025b), null, null, 14);
        Set initialSelectedAssets = addKeyStatsViewItemsScreenContract$Input.f104026c;
        ?? assetStatsSelectionStates = hVar != null ? hVar.f10802a : 0;
        if (assetStatsSelectionStates == 0) {
            assetStatsSelectionStates = r0.g();
        }
        Intrinsics.checkNotNullParameter(initialSelectedAssets, "initialSelectedAssets");
        Intrinsics.checkNotNullParameter(assetStatsSelectionStates, "assetStatsSelectionStates");
        boolean z4 = true;
        if (assetStatsSelectionStates.isEmpty()) {
            z = false;
        } else {
            for (Map.Entry entry2 : assetStatsSelectionStates.entrySet()) {
                if (((Boolean) entry2.getValue()).booleanValue() && !initialSelectedAssets.contains(entry2.getKey())) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (assetStatsSelectionStates.isEmpty()) {
            z3 = false;
        } else {
            for (Map.Entry entry3 : assetStatsSelectionStates.entrySet()) {
                if (!((Boolean) entry3.getValue()).booleanValue() && initialSelectedAssets.contains(entry3.getKey())) {
                    z3 = true;
                    break;
                }
            }
            z3 = false;
        }
        if (!z && !z3) {
            z4 = false;
        }
        if (hVar != null && (r110 = hVar.f10802a) != 0 && !r110.isEmpty()) {
            Iterator it8 = r110.entrySet().iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                if (((Boolean) ((Map.Entry) it8.next()).getValue()).booleanValue()) {
                    listC = u.c(new TextNavBarMenuItem("LIST_ID_CLEAR_ALL", new TextLocalisedClause(R$string.common_action_clear_all, null, null, 14), null, null, 12));
                    break;
                }
            }
        }
        if (listC == null) {
            listC = f0.f322471a;
        }
        return new f(textLocalisedClause, r62, listC, z4);
    }
}
