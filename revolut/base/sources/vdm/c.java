package vdm;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f288084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f288085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f288086c;

    public /* synthetic */ c(Function1 function1, Function1 function12, int i) {
        this.f288084a = i;
        this.f288085b = function1;
        this.f288086c = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f288084a) {
            case 0:
                Intrinsics.checkNotNullParameter(obj2, "<this>");
                Function1 function1 = this.f288085b;
                if (function1 != null) {
                    function1.invoke(obj2);
                }
                this.f288086c.invoke(obj2);
                break;
            default:
                OkHttpClient.a aVar = (OkHttpClient.a) obj2;
                Intrinsics.checkNotNullParameter(aVar, "<this>");
                this.f288085b.invoke(aVar);
                this.f288086c.invoke(aVar);
                break;
        }
        return Unit.f186387a;
    }
}
