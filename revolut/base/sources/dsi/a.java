package dsi;

import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import r10.w;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f117342b;

    public /* synthetic */ a(w wVar, int i) {
        this.f117341a = i;
        this.f117342b = wVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f117341a) {
            case 0:
                w wVar = this.f117342b;
                ((Set) wVar.f250866b).add((List) wVar.f250865a);
                break;
            default:
                w wVar2 = this.f117342b;
                ((Set) wVar2.f250866b).remove((List) wVar2.f250865a);
                break;
        }
        return Unit.f186387a;
    }
}
