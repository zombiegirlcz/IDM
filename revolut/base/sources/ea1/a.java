package ea1;

import fa1.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f124048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n0 f124049c;
    public final /* synthetic */ k d;

    public /* synthetic */ a(String str, n0 n0Var, k kVar) {
        this.f124047a = 1;
        this.f124048b = str;
        this.f124049c = n0Var;
        this.d = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f124047a) {
            case 0:
                this.f124049c.f186428a = System.currentTimeMillis();
                b.a(this.f124048b + "...", this.d);
                break;
            case 1:
                b.a(this.f124048b + " is completed (" + (System.currentTimeMillis() - this.f124049c.f186428a) + "ms)", this.d);
                break;
            default:
                this.f124049c.f186428a = System.currentTimeMillis();
                b.a(this.f124048b + "...", this.d);
                break;
        }
        return Unit.f186387a;
    }

    public /* synthetic */ a(n0 n0Var, String str, k kVar, int i) {
        this.f124047a = i;
        this.f124049c = n0Var;
        this.f124048b = str;
        this.d = kVar;
    }
}
