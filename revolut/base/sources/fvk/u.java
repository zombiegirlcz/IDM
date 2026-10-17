package fvk;

import com.revolut.data.model.Data;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vsk.g f138466b;

    public /* synthetic */ u(vsk.g gVar, int i) {
        this.f138465a = i;
        this.f138466b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f138465a) {
            case 0:
                return m.f((m) obj2, null, null, null, null, null, null, null, null, this.f138466b, null, null, null, null, null, null, null, null, null, null, null, 1048319);
            default:
                Data data = this.f138466b.f291843a;
                ((vsk.g) obj2).getClass();
                return new vsk.g(data);
        }
    }
}
