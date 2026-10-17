package n4d;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f212409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f212410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f212411c;

    public /* synthetic */ v(x xVar, ArrayList arrayList, int i) {
        this.f212409a = i;
        this.f212410b = xVar;
        this.f212411c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f212409a;
        x xVar = this.f212410b;
        switch (i) {
            case 0:
                return x.o(xVar, this.f212411c);
            default:
                return x.q(xVar, this.f212411c);
        }
    }
}
