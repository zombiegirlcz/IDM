package z4a;

import com.revolut.feature.payments.who_to_transfer.api.common.RecipientConfig;
import h3a.o;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f319351a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecipientConfig f319352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f319353c;

    public /* synthetic */ a(RecipientConfig recipientConfig, d dVar) {
        this.f319352b = recipientConfig;
        this.f319353c = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f319351a) {
            case 0:
                List list = (List) obj2;
                Intrinsics.checkNotNullParameter(list, "list");
                o oVar = this.f319353c.f319356b;
                return o.a(this.f319352b, list);
            default:
                Map searchResult = (Map) obj2;
                Intrinsics.checkNotNullParameter(searchResult, "searchResult");
                RecipientConfig recipientConfig = this.f319352b;
                if (recipientConfig == null) {
                    return searchResult;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(searchResult.size()));
                for (Map.Entry entry : searchResult.entrySet()) {
                    Object key = entry.getKey();
                    List list2 = (List) entry.getValue();
                    o oVar2 = this.f319353c.f319356b;
                    linkedHashMap.put(key, o.a(recipientConfig, list2));
                }
                return linkedHashMap;
        }
    }

    public /* synthetic */ a(d dVar, RecipientConfig recipientConfig) {
        this.f319353c = dVar;
        this.f319352b = recipientConfig;
    }
}
