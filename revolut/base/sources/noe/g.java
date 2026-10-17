package noe;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import nme.j0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f218011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f218012b;

    public /* synthetic */ g(k kVar, int i) {
        this.f218011a = i;
        this.f218012b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data = (Data) obj2;
        switch (this.f218011a) {
            case 0:
                this.f218012b.x2(new j0(data, 18));
                break;
            case 1:
                this.f218012b.x2(new j0(data, 19));
                break;
            case 2:
                this.f218012b.x2(new j0(data, 20));
                break;
            default:
                this.f218012b.x2(new j0(data, 21));
                break;
        }
        return Unit.f186387a;
    }
}
