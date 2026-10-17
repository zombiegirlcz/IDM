package rl7;

import com.revolut.data.model.Data;
import com.revolut.feature.insurance_car.impl.data.model.QuestionnaireAnswer;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kl7.s1;
import kl7.w1;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import ll7.i0;
import qna.n;
import rhj.m;
import s7a.c0;
import vkm.i;
import w4l.h;
import w4l.k;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends x7a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f254924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f254925b;

    public d(i0 questionnaireRepository) {
        Intrinsics.checkNotNullParameter(questionnaireRepository, "questionnaireRepository");
        this.f254924a = questionnaireRepository;
        this.f254925b = new ConcurrentHashMap();
    }

    @Override // x7a.d
    public final c0 c(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Set<String> set = ids;
        ArrayList arrayList = new ArrayList(w.t(set, 10));
        for (String str : set) {
            arrayList.add(new QuestionnaireAnswer(str, (String) this.f254925b.get(str)));
        }
        return new a(arrayList);
    }

    @Override // x7a.d
    public final List d(Data data, Set selectedModelIds, List list, String query, Object obj2) {
        Data data2;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        Intrinsics.checkNotNullParameter(query, "query");
        try {
            Object content = data.getContent();
            data2 = new Data(content != null ? (s1) content : null, data.getError(), data.getLoading());
        } catch (Throwable th10) {
            data2 = new Data(null, th10, data.getLoading());
        }
        return (List) iii.c.f(data2, new rj7.b(22), new m(14), new rbe.c(this, selectedModelIds, 7));
    }

    @Override // x7a.d
    public final Flow e(String query, boolean z, Object obj2) {
        Intrinsics.checkNotNullParameter(query, "query");
        if (!(obj2 instanceof b)) {
            return i.f290039a;
        }
        b bVar = (b) obj2;
        String policyId = bVar.f254921a;
        w1 type = bVar.f254922b;
        k loadingStrategy = z ? w4l.i.f294643c : h.f294642c;
        i0 i0Var = this.f254924a;
        i0Var.getClass();
        Intrinsics.checkNotNullParameter(policyId, "policyId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return new n(i0Var.d.b(new Pair(policyId, type), loadingStrategy), this, 19);
    }

    @Override // x7a.d
    public final void g(String listId, CharSequence text) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f254925b.put(listId, text.toString());
    }
}
