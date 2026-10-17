package a5h;

import com.revolut.data.model.Data;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nel.n;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1396a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f1397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Data f1398c;

    public /* synthetic */ e(Data data, n nVar) {
        this.f1398c = data;
        this.f1397b = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f1396a) {
            case 0:
                wdh.a ratingsProvider = ((k3h.d) obj2).f180736a;
                Intrinsics.checkNotNullParameter(ratingsProvider, "ratingsProvider");
                return new k3h.d(ratingsProvider, this.f1398c, this.f1397b);
            default:
                ((psk.e) obj2).getClass();
                return new psk.e(this.f1397b, this.f1398c);
        }
    }

    public /* synthetic */ e(n nVar, Data data) {
        this.f1397b = nVar;
        this.f1398c = data;
    }
}
