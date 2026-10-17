package hqe;

import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import com.revolut.feature.teen_profile.api.models.TeenProfile;
import fvk.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yhm.r;
import zhm.a0;
import zhm.q0;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f154683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f154684c;

    public /* synthetic */ j(o oVar, String str, int i) {
        this.f154682a = i;
        this.f154683b = oVar;
        this.f154684c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f154682a) {
            case 0:
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                Pair pair = (Pair) rVar.f314201a;
                TeenProfile teenProfile = (TeenProfile) rVar.f314202b;
                return this.f154683b.e.w(u.c(pair), q0.c(new Pair(new RegisteredIdentityId(this.f154684c), teenProfile)), (xi0.b) rVar.f314203c);
            default:
                List walletsWithPockets = (List) obj2;
                Intrinsics.checkNotNullParameter(walletsWithPockets, "walletsWithPockets");
                String str = this.f154684c;
                if (str != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : walletsWithPockets) {
                        if (Intrinsics.f(((fo3.c) ((Pair) obj3).f186385a).f136805h, str)) {
                            arrayList.add(obj3);
                        }
                    }
                    walletsWithPockets = arrayList;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it8 = walletsWithPockets.iterator();
                while (it8.hasNext()) {
                    a0.x((List) ((Pair) it8.next()).f186386b, arrayList2);
                }
                return nim.a.v(rd0.e.b(this.f154683b.d.d(arrayList2)), new q(walletsWithPockets, 25));
        }
    }
}
