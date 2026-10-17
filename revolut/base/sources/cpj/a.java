package cpj;

import hx7.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yoj.c;
import yoj.f;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f107967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yoj.a f107968c;

    public /* synthetic */ a(c cVar, yoj.a aVar, int i) {
        this.f107966a = i;
        this.f107967b = cVar;
        this.f107968c = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        f features = (f) obj2;
        switch (this.f107966a) {
            case 0:
                Intrinsics.checkNotNullParameter(features, "features");
                yoj.a aVarI = l.i(features, this.f107967b);
                if (aVarI == null) {
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(features, "features");
                yoj.a aVarI2 = l.i(features, this.f107967b);
                if (aVarI2 == null) {
                }
                break;
        }
        return this.f107968c;
    }
}
