package ay2;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f11030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hha.d f11031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Data f11032c;
    public final /* synthetic */ Data d;
    public final /* synthetic */ Data e;

    public d(h hVar, hha.d dVar, Data data, Data data2, Data data3) {
        this.f11030a = hVar;
        this.f11031b = dVar;
        this.f11032c = data;
        this.d = data2;
        this.e = data3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        boolean zA;
        String groupId = (String) obj2;
        n10.b type = (n10.b) obj3;
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(type, "type");
        int i = c.f11029a[type.ordinal()];
        hha.d dVar = this.f11031b;
        h hVar = this.f11030a;
        if (i == 1) {
            zA = h.a(hVar, dVar, groupId, (List) this.f11032c.getContent());
        } else if (i == 2) {
            zA = h.a(hVar, dVar, groupId, (List) this.d.getContent());
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            zA = h.a(hVar, dVar, groupId, (List) this.e.getContent());
        }
        return Boolean.valueOf(zA);
    }
}
