package bjj;

import dej.w1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import nii.n1;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f15686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w1 f15687c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    public /* synthetic */ i(j jVar, w1 w1Var, String str, String str2, int i) {
        this.f15685a = i;
        this.f15686b = jVar;
        this.f15687c = w1Var;
        this.d = str;
        this.e = str2;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        switch (this.f15685a) {
            case 0:
                String str = this.d;
                String str2 = this.e;
                j.d3(this.f15686b, (n1) obj2, this.f15687c, str, str2);
                break;
            case 1:
                String str3 = this.d;
                String str4 = this.e;
                j.d3(this.f15686b, (n1) obj2, this.f15687c, str3, str4);
                break;
            case 2:
                String str5 = this.d;
                String str6 = this.e;
                j.d3(this.f15686b, (n1) obj2, this.f15687c, str5, str6);
                break;
            default:
                String str7 = this.d;
                String str8 = this.e;
                j.d3(this.f15686b, (n1) obj2, this.f15687c, str7, str8);
                break;
        }
        return Unit.f186387a;
    }
}
