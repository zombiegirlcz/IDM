package emc;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function2;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f127645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f127646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xi0.b f127647c;

    public /* synthetic */ a(String str, xi0.b bVar, int i) {
        this.f127645a = i;
        this.f127646b = str;
        this.f127647c = bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f127645a;
        xi0.b bVar = this.f127647c;
        String str = this.f127646b;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        switch (i) {
            case 0:
                if (!zBooleanValue) {
                    IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("baseCurrency is null for portfolioId ", str));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                break;
            default:
                if (!zBooleanValue) {
                    IllegalStateException illegalStateException2 = new IllegalStateException(j6.a.q("baseCurrency is null for portfolioId ", str));
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                }
                break;
        }
        return null;
    }
}
