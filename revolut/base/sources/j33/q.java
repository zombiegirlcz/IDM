package j33;

import com.revolut.data.model.Data;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f170953a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f170954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Boolean f170955c;

    public /* synthetic */ q(Data data, Boolean bool) {
        this.f170954b = data;
        this.f170955c = bool;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f170953a) {
            case 0:
                Data data = this.f170954b;
                Intrinsics.h(data);
                return i.a((i) obj2, null, this.f170955c, false, false, data, null, 91);
            default:
                return k8d.g.a((k8d.g) obj2, null, null, this.f170954b, null, zi0.c.P(this.f170955c, false, null, 3), null, 491);
        }
    }

    public /* synthetic */ q(Boolean bool, Data data) {
        this.f170955c = bool;
        this.f170954b = data;
    }
}
