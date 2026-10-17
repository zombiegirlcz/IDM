package pza;

import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class k extends q implements Function1 {
    public static final k f = new k();

    public k() {
        super(1, lza.b.class, "toDomain", "toDomain(Lcom/revolut/feature/remote_stories/impl/network/StoriesWithUpdateTimestampDto;)Ljava/util/List;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        oza.i p0 = (oza.i) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        mza.h hVar = lza.b.f200955a;
        Intrinsics.checkNotNullParameter(p0, "<this>");
        Map templates = p0.getTemplates();
        ArrayList arrayList = new ArrayList(templates.size());
        for (Map.Entry entry : templates.entrySet()) {
            arrayList.add(new lza.a((String) entry.getKey(), ((oza.j) entry.getValue()).getLastUpdatedDate()));
        }
        return arrayList;
    }
}
