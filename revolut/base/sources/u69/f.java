package u69;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f277512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f277513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f277514c;

    public /* synthetic */ f(h hVar, ArrayList arrayList, int i) {
        this.f277512a = i;
        this.f277513b = hVar;
        this.f277514c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f277512a;
        h hVar = this.f277513b;
        switch (i) {
            case 0:
                return h.n(hVar, this.f277514c);
            default:
                return h.o(hVar, this.f277514c);
        }
    }
}
