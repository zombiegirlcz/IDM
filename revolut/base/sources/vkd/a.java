package vkd;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import tkd.d;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f289914a = r0.k(new Pair("open", akd.a.OPEN), new Pair("discard", akd.a.DISCARD), new Pair("secondaryAction", akd.a.SECONDARY_ACTION), new Pair("view", akd.a.VIEW));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f289915b = r0.k(new Pair("todo-tile", d.TODO_TILE), new Pair("prompts", d.PROMPTS), new Pair("wideSuggestedForYouTiles", d.WIDE_SUGGESTED_TILE), new Pair("incentiveRewards", d.INCENTIVE_REWARD), new Pair("promos", d.PROMOS), new Pair("checklists", d.CHECKLIST), new Pair("airSuggestions", d.AIR_SUGGESTION), new Pair("crossSellTiles", d.CROSS_SELL_TILES));

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public static final String a(akd.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return u1.g(aVar, f289914a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public static final String b(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return u1.g(dVar, f289915b);
    }
}
