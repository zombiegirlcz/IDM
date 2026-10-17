package kxg;

import com.revolut.core.ui_kit.models.MoneyClause;
import foh.i;
import hw0.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mxg.a f190577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nxg.a f190578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f190579c;

    public e(b chartHelper, mxg.a yBadgeMapper, nxg.a levelLinesMapper) {
        Intrinsics.checkNotNullParameter(yBadgeMapper, "yBadgeMapper");
        Intrinsics.checkNotNullParameter(levelLinesMapper, "levelLinesMapper");
        Intrinsics.checkNotNullParameter(chartHelper, "chartHelper");
        this.f190577a = yBadgeMapper;
        this.f190578b = levelLinesMapper;
        this.f190579c = chartHelper;
    }

    public static ArrayList a(List list, boolean z, dj0.d dVar, dj0.d dVar2, Function1 function1) {
        dj0.d dVar3;
        float fR;
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        int i = 0;
        for (Object obj2 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            float fJ = i / v.j(list);
            if (z) {
                fR = 0.0f;
                dVar3 = null;
            } else {
                dj0.d dVar4 = (dj0.d) function1.invoke(obj2);
                dVar3 = dVar4;
                fR = i.r(dVar4, dVar, dVar2);
            }
            arrayList.add(new k(fR, fJ, null, obj2, dVar3 != null ? new MoneyClause(dVar3, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : null, 41));
            i = i2;
        }
        return arrayList;
    }
}
