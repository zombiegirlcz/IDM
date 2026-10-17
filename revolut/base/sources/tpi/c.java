package tpi;

import com.revolut.data.model.Data;
import efm.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f273394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f273395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f273396c;

    public /* synthetic */ c(i iVar, r rVar, int i) {
        this.f273394a = i;
        this.f273395b = iVar;
        this.f273396c = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data = (Data) obj2;
        switch (this.f273394a) {
            case 0:
                boolean loading = data.getLoading();
                i iVar = this.f273395b;
                r rVar = this.f273396c;
                if (loading) {
                    iVar.f273406j.put(rVar, Boolean.TRUE);
                    iVar.V(0L, true);
                } else {
                    iVar.O(rVar);
                }
                break;
            case 1:
                Object content = data.getContent();
                i iVar2 = this.f273395b;
                r rVar2 = this.f273396c;
                if (content == null && data.getLoading()) {
                    iVar2.f273406j.put(rVar2, Boolean.TRUE);
                    iVar2.V(1000L, true);
                } else {
                    iVar2.O(rVar2);
                }
                break;
            default:
                boolean loading2 = data.getLoading();
                i iVar3 = this.f273395b;
                r rVar3 = this.f273396c;
                if (loading2) {
                    iVar3.f273406j.put(rVar3, Boolean.TRUE);
                    iVar3.V(1000L, true);
                } else {
                    iVar3.O(rVar3);
                }
                break;
        }
        return Unit.f186387a;
    }
}
