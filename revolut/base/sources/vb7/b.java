package vb7;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f287434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f287435b;

    public /* synthetic */ b(f fVar, int i) {
        this.f287434a = i;
        this.f287435b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f287434a) {
            case 0:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (List) this.f287435b.f287442b.get("surveys_key");
            case 1:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                Type type = new TypeToken<List<? extends ub7.c>>() { // from class: com.revolut.feature.home.nps.data.repository.HomeNPSRepositoryImpl$surveysDod$4$dataType$1
                }.getType();
                ue0.c cVar = this.f287435b.f287443c;
                Intrinsics.h(type);
                List list = (List) cVar.T2("surveys_key", type);
                if (list != null) {
                    return xam.a.s(list);
                }
                return null;
            case 2:
                Unit it10 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return ue0.e.v(this.f287435b.f.g(Unit.f186387a, false));
            default:
                this.f287435b.f287444g.init();
                return Unit.f186387a;
        }
    }
}
