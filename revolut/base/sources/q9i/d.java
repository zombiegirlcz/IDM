package q9i;

import efm.r;
import i9i.e;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import n4d.a0;
import n9i.f;
import org.jetbrains.annotations.NotNull;
import te0.w;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f243908b = r0.k(new Pair("id_thumbs_up", "thumbs up"), new Pair("id_thumbs_down", "thumbs down"), new Pair("id_raising_hands", "celebrating"), new Pair("id_heart_eyes", "heart eyes"), new Pair("id_joy", "joy"), new Pair("id_money_mouth", "money"), new Pair("id_kissing_heart", "kissing heart"), new Pair("id_open_mouth", "open mouth"), new Pair("id_party_face", "party"), new Pair("id_angry_face", "rage"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f243909c = v.k(new e("id_money_mouth", "🤑"), new e("id_thumbs_up", "👍"), new e("id_thumbs_down", "👎"), new e("id_raising_hands", "🙌"), new e("id_heart_eyes", "😍"), new e("id_joy", "😂"), new e("id_kissing_heart", "😘"), new e("id_open_mouth", "😮"), new e("id_party_face", "🥳"), new e("id_angry_face", "😡"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f243910a;

    public d(f gifRepository) {
        Intrinsics.checkNotNullParameter(gifRepository, "gifRepository");
        this.f243910a = gifRepository;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final r a(String categoryId) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        String query = (String) f243908b.get(categoryId);
        if (query != null) {
            Intrinsics.checkNotNullParameter(query, "query");
            f fVar = this.f243910a;
            r rVarF = fVar.e.f(new Pair(fVar.f213657a, query), true);
            if (rVarF != null) {
                return rVarF;
            }
        }
        r rVarError = r.error(new IllegalStateException(j6.a.q("Unknown category id: ", categoryId)));
        Intrinsics.checkNotNullExpressionValue(rVarError, "error(...)");
        return rVarError;
    }

    public final r b(r queryObservable) {
        Intrinsics.checkNotNullParameter(queryObservable, "queryObservable");
        Intrinsics.checkNotNullParameter(queryObservable, "queryObservable");
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        r rVarSwitchMap = w.y(queryObservable, 300L).switchMap(new a0(new n9i.b(this.f243910a, 1), 25));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }
}
