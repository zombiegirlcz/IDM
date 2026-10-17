package rp0;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f256062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f256063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f256064c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d2(String id10, int i) {
        this(id10, new TextLocalisedClause(i, null, null, 14), null);
        Intrinsics.checkNotNullParameter(id10, "id");
    }

    public d2(String id10, TextLocalisedClause title, Object obj2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f256062a = id10;
        this.f256063b = title;
        this.f256064c = obj2;
    }

    public /* synthetic */ d2(String str, TextLocalisedClause textLocalisedClause, Object obj2, int i) {
        this(str, textLocalisedClause, (i & 4) != 0 ? null : obj2);
    }
}
